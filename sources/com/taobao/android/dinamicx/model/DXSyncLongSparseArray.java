package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXSyncLongSparseArray<E> extends DXLongSparseArray<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596885);
    }

    public DXSyncLongSparseArray() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(DXSyncLongSparseArray dXSyncLongSparseArray, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1560388469) {
            return super.get(((Number) objArr[0]).longValue());
        }
        if (hashCode == -850521654) {
            super.put(((Number) objArr[0]).longValue(), objArr[1]);
            return null;
        } else if (hashCode == 1416190959) {
            return super.get(((Number) objArr[0]).longValue(), objArr[1]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/model/DXSyncLongSparseArray");
        }
    }

    @Override // androidx.collection.LongSparseArray
    public synchronized E get(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("54695bef", new Object[]{this, new Long(j), e});
        }
        return (E) super.get(j, e);
    }

    @Override // androidx.collection.LongSparseArray
    public synchronized void put(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4e11ca", new Object[]{this, new Long(j), e});
        } else {
            super.put(j, e);
        }
    }

    public DXSyncLongSparseArray(DXLongSparseArray<E> dXLongSparseArray) {
        a(dXLongSparseArray);
    }

    @Override // androidx.collection.LongSparseArray
    public synchronized E get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        return (E) super.get(j);
    }
}
