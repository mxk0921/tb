package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mjq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PreparedStatement extends mjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PreparedStatement(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(PreparedStatement preparedStatement, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/PreparedStatement");
    }

    private native void nativeAddBatch();

    private native long nativeExecuteQuery();

    private native long nativeExecuteUpdate();

    private native int nativeGetParamsCount();

    private native void nativeSetBinary(int i, byte[] bArr, int i2);

    private native void nativeSetDouble(int i, double d);

    private native void nativeSetInt(int i, int i2);

    private native void nativeSetLong(int i, long j);

    private native void nativeSetNull(int i);

    private native void nativeSetString(int i, String str);

    public ResultSet c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultSet) ipChange.ipc$dispatch("81101bed", new Object[]{this});
        }
        long nativeExecuteQuery = nativeExecuteQuery();
        if (nativeExecuteQuery != 0) {
            return new ResultSet(nativeExecuteQuery);
        }
        return null;
    }

    public Result d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("bf163c1c", new Object[]{this});
        }
        long nativeExecuteUpdate = nativeExecuteUpdate();
        if (nativeExecuteUpdate != 0) {
            return new Result(nativeExecuteUpdate);
        }
        return null;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d46204ed", new Object[]{this})).intValue();
        }
        return nativeGetParamsCount();
    }

    public void f(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0b50c0", new Object[]{this, new Integer(i), bArr});
        } else {
            nativeSetBinary(i, bArr, bArr.length);
        }
    }

    public void g(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9235f4f5", new Object[]{this, new Integer(i), new Double(d)});
        } else {
            nativeSetDouble(i, d);
        }
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bbb994", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            nativeSetInt(i, i2);
        }
    }

    public void i(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d580db3", new Object[]{this, new Integer(i), str});
        } else {
            nativeSetString(i, str);
        }
    }
}
