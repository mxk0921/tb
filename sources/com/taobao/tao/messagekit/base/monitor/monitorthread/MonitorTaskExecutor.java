package com.taobao.tao.messagekit.base.monitor.monitorthread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import tb.a0j;
import tb.t2o;
import tb.zzi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MonitorTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MonitorProcessExecuteMode f12531a = MonitorProcessExecuteMode.SINGLE_TASK;
    public final LinkedBlockingDeque<zzi> b = new LinkedBlockingDeque<>();
    public a0j.a c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum MonitorProcessExecuteMode {
        MERGE_TASK,
        SINGLE_TASK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MonitorProcessExecuteMode monitorProcessExecuteMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/MonitorTaskExecutor$MonitorProcessExecuteMode");
        }

        public static MonitorProcessExecuteMode valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("a003e79", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(MonitorProcessExecuteMode.class, str);
            }
            return (MonitorProcessExecuteMode) valueOf;
        }
    }

    static {
        t2o.a(628097105);
    }

    public void a(zzi zziVar, BlockingQueue<zzi> blockingQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0bc616", new Object[]{this, zziVar, blockingQueue});
        } else if (this.f12531a.equals(MonitorProcessExecuteMode.MERGE_TASK)) {
            b(blockingQueue, zziVar);
        } else {
            zziVar.g();
        }
    }

    public void c(zzi zziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768ff872", new Object[]{this, zziVar});
        } else {
            this.b.putFirst(zziVar);
        }
    }

    public void d(zzi zziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635fa780", new Object[]{this, zziVar});
        } else {
            this.b.putLast(zziVar);
        }
    }

    public void e() {
        a0j.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            zzi take = this.b.take();
            if (take != null && !zzi.SHUTDOWN_REQ.equals(take.e())) {
                if (take instanceof a0j.a) {
                    a0j.a aVar2 = (a0j.a) take;
                    a0j.a aVar3 = this.c;
                    if (aVar3 == null) {
                        this.c = aVar2;
                    } else {
                        aVar2.b(aVar3);
                        aVar = this.c;
                        if (aVar != null && aVar.a()) {
                            this.c = null;
                        }
                    }
                }
                a(take, this.b);
                aVar = this.c;
                if (aVar != null) {
                    this.c = null;
                }
            } else {
                return;
            }
        }
    }

    public void f(MonitorProcessExecuteMode monitorProcessExecuteMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c5be43", new Object[]{this, monitorProcessExecuteMode});
        } else {
            this.f12531a = monitorProcessExecuteMode;
        }
    }

    public final void b(BlockingQueue<zzi> blockingQueue, zzi zziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9788d1c0", new Object[]{this, blockingQueue, zziVar});
        } else if (blockingQueue == null || zziVar == null) {
            if (blockingQueue == null) {
                MsgLog.g("MonitorTaskExecutor", "blockingQueue is null");
            }
            if (zziVar == null) {
                MsgLog.g("MonitorTaskExecutor", "current task is null");
            }
        } else {
            zzi peek = blockingQueue.peek();
            if (peek == null || peek.h() != zziVar.h()) {
                MsgLog.e("MonitorTaskExecutor", "message process task start execute..., type=", Integer.valueOf(zziVar.h()));
                zziVar.g();
                return;
            }
            MsgLog.e("MonitorTaskExecutor", "still have tasks in pool, continue take...; waiting to execute；current task type: ", Integer.valueOf(zziVar.h()), "| next task type: ", Integer.valueOf(peek.h()));
            zziVar.f();
        }
    }
}
