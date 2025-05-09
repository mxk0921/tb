package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mjq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CallableStatement extends mjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CallableStatement(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(CallableStatement callableStatement, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/CallableStatement");
    }

    private native long nativeExecuteQuery();

    private native long nativeExecuteUpdate();

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
}
