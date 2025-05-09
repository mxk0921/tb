package com.taobao.message.message_open_api.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CallException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errCode;
    public String errMsg;
    public Object errObject;
    public boolean needReportSLS;

    static {
        t2o.a(529531047);
    }

    public CallException(String str, String str2) {
        this.needReportSLS = true;
        this.errCode = str;
        this.errMsg = str2;
    }

    public static /* synthetic */ Object ipc$super(CallException callException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api/core/CallException");
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CallException{errCode='" + this.errCode + "', errMsg='" + this.errMsg + "', errObject=" + this.errObject + '}';
    }

    public CallException(String str, String str2, boolean z) {
        this.errCode = str;
        this.errMsg = str2;
        this.needReportSLS = z;
    }

    public CallException(String str) {
        this.needReportSLS = true;
        this.errMsg = str;
        this.errCode = "-10000";
    }

    public CallException(String str, boolean z) {
        this.errMsg = str;
        this.needReportSLS = z;
    }
}
