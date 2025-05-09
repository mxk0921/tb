package com.taobao.android.searchbaseframe.net;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.error.Error;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NetError implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_CANCELED = 1;
    public static final int CODE_ERROR_PARAM = 5;
    public static final int CODE_HANDLE_RESULT_ERROR = 4;
    public static final int CODE_NETWORK_TIMEOUT = 3;
    public static final int CODE_NET_ERROR = 6;
    public static final int CODE_PARSE_ERROR = 2;
    public static final int CODE_UNKNOWN = 0;
    public static final int CUSTOM_CODE_START = 1000;
    private int mCode;
    private Throwable mException;
    private String mMsg;
    private String mMtopCode;
    private Error uniError;

    static {
        t2o.a(993001892);
    }

    public NetError(int i) {
        this.mCode = i;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.mCode;
    }

    public Throwable getException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("d8eb9685", new Object[]{this});
        }
        return this.mException;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.mMsg;
    }

    public String getMtopCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3136f28e", new Object[]{this});
        }
        return this.mMtopCode;
    }

    public Error getUniError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("e88b9dac", new Object[]{this});
        }
        return this.uniError;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.mCode = i;
        }
    }

    public void setException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6400d061", new Object[]{this, th});
        } else {
            this.mException = th;
        }
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.mMsg = str;
        }
    }

    public void setUniError(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8741a226", new Object[]{this, error});
        } else {
            this.uniError = error;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mMsg;
        if (TextUtils.isEmpty(str) && getException() != null) {
            str = getException().getMessage();
        }
        return "NetError(" + this.mCode + "): " + str;
    }

    public NetError(int i, String str) {
        this.mCode = i;
        this.mMsg = str;
    }

    public NetError(int i, Exception exc) {
        this.mCode = i;
        this.mException = exc;
    }

    public NetError(int i, String str, Exception exc) {
        this.mCode = i;
        this.mMsg = str;
        this.mException = exc;
    }

    public NetError(int i, String str, String str2) {
        this.mCode = i;
        this.mMtopCode = str;
        this.mMsg = str2;
    }
}
