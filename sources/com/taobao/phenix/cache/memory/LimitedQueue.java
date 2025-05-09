package com.taobao.phenix.cache.memory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LimitedQueue<E> extends ConcurrentLinkedQueue<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int limit;

    static {
        t2o.a(620757056);
    }

    public LimitedQueue(int i) {
        this.limit = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(LimitedQueue limitedQueue, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -667118713) {
            return super.remove();
        }
        if (hashCode == 195222152) {
            return new Boolean(super.add(objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/phenix/cache/memory/LimitedQueue");
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        boolean add = super.add(e);
        while (add && size() > this.limit) {
            super.remove();
        }
        return add;
    }
}
