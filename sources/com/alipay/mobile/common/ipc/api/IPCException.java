package com.alipay.mobile.common.ipc.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IPCException extends IOException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;
    public String errorMsg;

    public IPCException() {
    }

    public static /* synthetic */ Object ipc$super(IPCException iPCException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/ipc/api/IPCException");
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IPCException{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "'}";
    }

    public IPCException(String str) {
        super(str);
    }

    public IPCException(String str, Throwable th) {
        super(str, th);
    }

    public IPCException(Throwable th) {
        super(th);
    }

    public IPCException(int i, String str) {
        this("errorCode:" + i + " errorMsg:" + str);
        this.errorCode = i;
        this.errorMsg = str;
    }
}
