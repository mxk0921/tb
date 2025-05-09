package com.taobao.taopai2.material.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorCode;

    static {
        t2o.a(782237919);
    }

    public MaterialException() {
        this.errorCode = "";
    }

    public static /* synthetic */ Object ipc$super(MaterialException materialException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/exception/MaterialException");
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.errorCode;
    }

    public String getErrorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9ecaad9", new Object[]{this});
        }
        return getMessage();
    }

    public MaterialException(String str) {
        this.errorCode = str;
    }

    public MaterialException(String str, String str2) {
        super(str2);
        this.errorCode = str;
    }
}
