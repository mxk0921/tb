package com.taobao.aranger.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IPCException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mErrorCode;

    static {
        t2o.a(393216075);
    }

    public IPCException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }

    public static /* synthetic */ Object ipc$super(IPCException iPCException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/exception/IPCException");
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.mErrorCode;
    }

    public IPCException(int i, Throwable th) {
        super(th.toString(), th);
        this.mErrorCode = i;
    }
}
