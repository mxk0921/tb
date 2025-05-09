package com.taobao.monitor.impl.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LimitedQueue<E> extends ConcurrentLinkedQueue<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private final int limit;
    private final Object lock = new Object();

    public LimitedQueue(int i) {
        this.limit = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272099756) {
            super.clear();
            return null;
        } else if (hashCode == -667118713) {
            return super.remove();
        } else {
            if (hashCode == 195222152) {
                return new Boolean(super.add(objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/monitor/impl/util/LimitedQueue");
        }
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        synchronized (this.lock) {
            try {
                super.add(e);
                while (size() > this.limit) {
                    super.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            super.clear();
        }
    }
}
