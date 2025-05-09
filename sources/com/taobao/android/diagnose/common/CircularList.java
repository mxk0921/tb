package com.taobao.android.diagnose.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import tb.idh;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CircularList<E> extends LinkedList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int maxSize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Iterator<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(CircularList circularList) {
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
        t2o.a(615514141);
    }

    public CircularList(int i) {
        this.maxSize = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(CircularList circularList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add(objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/common/CircularList");
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        if (size() == this.maxSize) {
            pollFirst();
        }
        return super.add(e);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, java.util.Deque
    public Iterator<E> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        synchronized (this) {
            try {
                try {
                    if (!isEmpty()) {
                        return new ArrayList(this).iterator();
                    }
                } catch (Exception e) {
                    idh.c("CircularList", pg1.ATOM_EXT_iterator, e);
                }
                return new a(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private CircularList() {
    }
}
