package com.tmall.android.dai;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DAIError extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;

    static {
        t2o.a(1034944588);
    }

    public DAIError() {
    }

    private static String getErrorMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e42ba59", new Object[]{new Integer(i)});
        }
        if (i == 201) {
            return "参数错误";
        }
        if (i == 151) {
            return "运行超时";
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DAIError dAIError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/DAIError");
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{errorCode=" + this.errorCode + ", message=" + getMessage() + "}";
    }

    public DAIError(int i) {
        this(i, getErrorMessage(i));
    }

    public DAIError(int i, String str) {
        this(i, str, null);
    }

    public DAIError(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }
}
