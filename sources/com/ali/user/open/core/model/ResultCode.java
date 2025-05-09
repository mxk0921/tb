package com.ali.user.open.core.model;

import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.open.core.message.Message;
import com.ali.user.open.core.message.MessageUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ResultCode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int code;
    public String message;
    public static final ResultCode SUCCESS = new ResultCode(100, "SUCCESS");
    public static final ResultCode IGNORE = new ResultCode(-100, "IGNORE");
    public static final ResultCode CAPTCHA_RELOGIN = new ResultCode(103, "CAPTCHA_RELOGIN");
    public static final ResultCode TRUST_LOGIN = new ResultCode(104, "TRUST_LOGIN");
    public static final ResultCode CONTINUE_LOGIN = new ResultCode(105, "continueLogin");
    public static final ResultCode CHECK = new ResultCode(108, "CHECK");
    public static final ResultCode USER_CANCEL = new ResultCode(10003, LoginConstant.FETCH_IV_FAIL_CANCEL);
    public static final ResultCode SYSTEM_EXCEPTION = new ResultCode(10010, "SYSTEM_EXCEPTION");

    static {
        t2o.a(71303201);
    }

    public ResultCode(int i) {
        this(i, null);
    }

    public static ResultCode create(Message message) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultCode) ipChange.ipc$dispatch("ecd16b4", new Object[]{message}) : new ResultCode(message.code, message.message);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.code == ((ResultCode) obj).code) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return 31 + this.code;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (this.code == 100) {
            return true;
        }
        return false;
    }

    public ResultCode(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public static ResultCode create(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultCode) ipChange.ipc$dispatch("b93cbce2", new Object[]{new Integer(i), objArr}) : new ResultCode(i, MessageUtils.getMessageContent(i, objArr));
    }
}
