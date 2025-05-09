package com.taobao.tao.messagekit.core.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LRUQueue<T extends Comparable<T>> extends LinkedBlockingQueue<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097170);
    }

    public LRUQueue(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(LRUQueue lRUQueue, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((LRUQueue) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/utils/LRUQueue");
    }

    public synchronized boolean add(T t) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a2ba58d", new Object[]{this, t})).booleanValue();
            } else if (t == null) {
                return false;
            } else {
                Iterator<T> it = iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Comparable comparable = (Comparable) it.next();
                    if (comparable.compareTo(t) == 0) {
                        remove(comparable);
                        break;
                    }
                }
                if (remainingCapacity() <= 0) {
                    remove();
                }
                super.add((LRUQueue<T>) t);
                return z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((LRUQueue<T>) ((Comparable) obj));
    }
}
