package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RecordSet extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RecordSet(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(RecordSet recordSet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/protodb/RecordSet");
    }

    private native long nativeGetRecord();

    private native boolean nativeNext();

    public Record getRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("d484c952", new Object[]{this});
        }
        long nativeGetRecord = nativeGetRecord();
        if (nativeGetRecord > 0) {
            return new Record(nativeGetRecord);
        }
        return null;
    }

    public boolean next() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d45dfe", new Object[]{this})).booleanValue();
        }
        return nativeNext();
    }
}
