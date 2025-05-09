package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class LimitedLinkedList<T> extends LinkedList<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int maxSize;

    static {
        t2o.a(815792214);
    }

    public LimitedLinkedList(int i) {
        this.maxSize = i;
    }

    public static /* synthetic */ Object ipc$super(LimitedLinkedList limitedLinkedList, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -475350822) {
            return super.remove(((Number) objArr[0]).intValue());
        }
        if (hashCode == 195222152) {
            return new Boolean(super.add(objArr[0]));
        }
        if (hashCode == 845773819) {
            return new Integer(super.size());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/common/util/LimitedLinkedList");
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
        }
        boolean add = super.add(t);
        if (size() > this.maxSize) {
            removeFirst();
        }
        return add;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }
}
