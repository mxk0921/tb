package com.taobao.tao.log;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConcurrentLinkedCache<E> extends ConcurrentLinkedQueue<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Iterator<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ConcurrentLinkedCache concurrentLinkedCache) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
            }
            return null;
        }
    }

    static {
        t2o.a(767557637);
    }

    public static /* synthetic */ Object ipc$super(ConcurrentLinkedCache concurrentLinkedCache, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/ConcurrentLinkedCache");
    }

    public Iterator<E> getIteratorAndClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("c64e6596", new Object[]{this});
        }
        synchronized (this) {
            try {
                try {
                    if (!isEmpty()) {
                        ArrayList arrayList = new ArrayList(this);
                        clear();
                        return arrayList.iterator();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return new a(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
