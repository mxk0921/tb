package com.taobao.android.preload;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.csm;
import tb.ftm;
import tb.itm;
import tb.kpw;
import tb.nsw;
import tb.wsm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreloadWindVanePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_LOAD = "load";
    private static final String ACTION_LOAD_MULTIPLE = "loadMultiple";
    private static final String ERROR_CODE_ACTION_INVALID = "10004";
    private static final String ERROR_CODE_BIZ_NAME_EMPTY = "10002";
    private static final String ERROR_CODE_BIZ_NAME_INVALID = "10005";
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_CODE_ITEMS_EMPTY = "10003";
    private static final String ERROR_MSG_ACTION_INVALID = "action未找到";
    private static final String ERROR_MSG_BIZ_NAME_EMPTY = "bizName为空";
    private static final String ERROR_MSG_BIZ_NAME_INVALID = "bizName无效，未找到preloader";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";
    private static final String ERROR_MSG_ITEMS_EMPTY = "items为空";
    public static final String NAME = "TBDetailPreloadPlugin";
    private static final String TAG = "PreloadWindVanePlugin";

    private void handleCallbackFail(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01182a3", new Object[]{this, str, str2, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("errorCode", str);
            nswVar.b("errorMsg", str2);
            wVCallBackContext.error(nswVar);
            String a2 = csm.a(TAG);
            wsm.a(a2, "errorCode: " + str + ", errorMsg: " + str2);
        }
    }

    private void handleCallbackSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d0f0fa", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            wVCallBackContext.success(new nsw("HY_SUCCESS"));
        }
    }

    public static /* synthetic */ Object ipc$super(PreloadWindVanePlugin preloadWindVanePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preload/PreloadWindVanePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        } else if (parseObject.getJSONArray("items") == null) {
            handleCallbackFail("10003", ERROR_MSG_ITEMS_EMPTY, wVCallBackContext);
            return false;
        } else {
            if (ACTION_LOAD_MULTIPLE.equals(str)) {
                itm.a().c(str2);
            } else if ("load".equals(str)) {
                String string = parseObject.getString("bizName");
                if (TextUtils.isEmpty(string)) {
                    handleCallbackFail("10002", ERROR_MSG_BIZ_NAME_EMPTY, wVCallBackContext);
                    return false;
                }
                ftm b = itm.b(string);
                if (b == null) {
                    handleCallbackFail("10005", ERROR_MSG_BIZ_NAME_INVALID, wVCallBackContext);
                    return false;
                }
                b.j(parseObject.toJSONString());
                handleCallbackSuccess(wVCallBackContext);
                return true;
            }
            handleCallbackFail("10004", ERROR_MSG_ACTION_INVALID, wVCallBackContext);
            return false;
        }
    }
}
