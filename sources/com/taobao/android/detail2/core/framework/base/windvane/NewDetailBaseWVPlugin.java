package com.taobao.android.detail2.core.framework.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class NewDetailBaseWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";

    static {
        t2o.a(352321762);
    }

    public static /* synthetic */ Object ipc$super(NewDetailBaseWVPlugin newDetailBaseWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/windvane/NewDetailBaseWVPlugin");
    }

    public void handleCallbackFail(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01182a3", new Object[]{this, str, str2, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("errorCode", str);
            nswVar.b("errorMsg", str2);
            wVCallBackContext.error(nswVar);
            txj.e(txj.TAG_WINDVANE, "errorCode: " + str + ", errorMsg: " + str2);
        }
    }

    public abstract boolean onExecute(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str2);

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        txj.e(txj.TAG_WINDVANE, "windvane execute执行 message为空, action: " + str + ", params: " + str2);
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        }
        String string = parseObject.getString("from");
        if (TextUtils.isEmpty(string)) {
            txj.e(txj.TAG_WINDVANE, "handleUpdateData from is null");
        }
        return onExecute(str, parseObject, wVCallBackContext, string);
    }
}
