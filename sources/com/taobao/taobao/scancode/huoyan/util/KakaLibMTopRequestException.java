package com.taobao.taobao.scancode.huoyan.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class KakaLibMTopRequestException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVER_RESULT_NOTHING = "KAKALIB_SERVER_RESULT_NOTHING";
    private static final long serialVersionUID = -2120277779106940443L;
    private String errorCode;
    private String errorInfo;

    static {
        t2o.a(760217774);
    }

    public KakaLibMTopRequestException(String str, String str2) {
        this.errorCode = str;
        this.errorInfo = str2;
    }

    public static /* synthetic */ Object ipc$super(KakaLibMTopRequestException kakaLibMTopRequestException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/huoyan/util/KakaLibMTopRequestException");
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
        return this.errorInfo;
    }

    public void setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.errorCode = str;
        }
    }

    public void setErrorInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e66c25", new Object[]{this, str});
        } else {
            this.errorInfo = str;
        }
    }
}
