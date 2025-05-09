package com.taobao.rxm.schedule;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.PriorityBlockingQueue;
import tb.buo;
import tb.f7l;
import tb.pn8;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CentralSchedulerQueue extends PriorityBlockingQueue<Runnable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACT_BE_QUEUED = 3;
    public static final int ACT_BE_REJECTED = 2;
    public static final int ACT_TO_EXECUTE = 1;
    private final pn8 mExecutorStateInspector;
    private final int mNormalCapacity;
    private final int mPatienceCapacity;

    public CentralSchedulerQueue(pn8 pn8Var, int i, int i2) {
        this.mExecutorStateInspector = pn8Var;
        this.mNormalCapacity = i;
        this.mPatienceCapacity = i2;
    }

    public static /* synthetic */ Object ipc$super(CentralSchedulerQueue centralSchedulerQueue, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 845773819) {
            return new Integer(super.size());
        }
        if (hashCode == 1107930627) {
            return new Boolean(super.offer((CentralSchedulerQueue) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/rxm/schedule/CentralSchedulerQueue");
    }

    public synchronized int moveIn(buo buoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4975d2c9", new Object[]{this, buoVar, new Boolean(z)})).intValue();
        } else if (z && this.mExecutorStateInspector.b()) {
            return 1;
        } else {
            int size = size();
            if (size >= this.mPatienceCapacity) {
                xv8.c("RxSysLog", "SOX current size(%d) of central queue exceeded max patience(%d)!", Integer.valueOf(size), Integer.valueOf(this.mPatienceCapacity));
                String status = this.mExecutorStateInspector.getStatus();
                if (!TextUtils.isEmpty(status)) {
                    String replace = status.replace(f7l.MOD, "%%");
                    xv8.c("RxSysLog", "SOX detail:" + replace, new Object[0]);
                }
                return 2;
            } else if (size >= this.mNormalCapacity && buoVar.a()) {
                return 2;
            } else {
                if (!z) {
                    return 1;
                }
                try {
                    if (super.offer((CentralSchedulerQueue) buoVar)) {
                        return 3;
                    }
                } catch (IllegalMonitorStateException unused) {
                }
                if (buoVar.a()) {
                    return 2;
                }
                return 1;
            }
        }
    }

    public boolean reachPatienceCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3761e8e9", new Object[]{this})).booleanValue();
        }
        if (size() >= this.mPatienceCapacity) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        try {
            return super.size();
        } catch (IllegalMonitorStateException unused) {
            return 0;
        }
    }

    public boolean offer(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38bdabe5", new Object[]{this, runnable})).booleanValue() : moveIn((buo) runnable, true) == 3;
    }
}
