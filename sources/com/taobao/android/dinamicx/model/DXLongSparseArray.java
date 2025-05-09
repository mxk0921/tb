package com.taobao.android.dinamicx.model;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXLongSparseArray<E> extends LongSparseArray<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596875);
    }

    public DXLongSparseArray() {
    }

    public static /* synthetic */ Object ipc$super(DXLongSparseArray dXLongSparseArray, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/model/DXLongSparseArray");
    }

    public void a(DXLongSparseArray<E> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d215318", new Object[]{this, dXLongSparseArray});
        } else if (dXLongSparseArray != null) {
            for (int i = 0; i < dXLongSparseArray.size(); i++) {
                put(dXLongSparseArray.keyAt(i), dXLongSparseArray.valueAt(i));
            }
        }
    }

    public DXLongSparseArray(int i) {
        super(i);
    }

    public DXLongSparseArray(DXLongSparseArray<E> dXLongSparseArray) {
        a(dXLongSparseArray);
    }
}
