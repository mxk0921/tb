package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.text.TextUtils;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
@JSTopic(topic = "cancelUpload")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CancelUploadApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCELALL = "";
    public static final String CANCELFAILURE = "cancelFailure";
    public static final String CANCELSUCCESS = "cancelSuccess";
    public static final String TAG = "CancelUploadJSApi";

    public CancelUploadApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ Object ipc$super(CancelUploadApi cancelUploadApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/CancelUploadApi");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "cancelUpload";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.has(BaseJsExecutor.NAME_PHOTO_ID) ? jSONObject.getString(BaseJsExecutor.NAME_PHOTO_ID) : null)) {
                return true;
            }
            callbackUnknowError(jsCallbackAdapter);
            return false;
        } catch (JSONException e) {
            trackExceptionLog("CancelUploadApi params error", e);
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }
}
