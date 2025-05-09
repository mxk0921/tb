package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ResultSet extends Result {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ResultSet(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(ResultSet resultSet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/ResultSet");
    }

    private native byte[] nativeGetBinary(int i);

    private native byte[] nativeGetBinaryByColumnName(String str);

    private native int nativeGetColumnIndex(String str);

    private native String nativeGetColumnName(int i);

    private native int nativeGetColumnType(int i);

    private native int nativeGetColumnsCount();

    private native double nativeGetDouble(int i);

    private native double nativeGetDoubleByColumnName(String str);

    private native int nativeGetInt(int i);

    private native int nativeGetIntByColumnName(String str);

    private native long nativeGetLong(int i);

    private native long nativeGetLongByColumnName(String str);

    private native String nativeGetString(int i);

    private native String nativeGetStringByColumnName(String str);

    private native boolean nativeNext();

    public byte[] c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1e2a46b8", new Object[]{this, new Integer(i)});
        }
        return nativeGetBinary(i);
    }

    public int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{this, new Integer(i)})).intValue();
        }
        return nativeGetInt(i);
    }

    public long e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43ad79e", new Object[]{this, new Integer(i)})).longValue();
        }
        return nativeGetLong(i);
    }

    public long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{this, str})).longValue();
        }
        return nativeGetLongByColumnName(str);
    }

    public String g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        return nativeGetString(i);
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        return nativeGetStringByColumnName(str);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d45dfe", new Object[]{this})).booleanValue();
        }
        return nativeNext();
    }
}
