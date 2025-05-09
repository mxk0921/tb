package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.app.Activity;
import com.alibaba.security.realidentity.RPDetail;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
@JSTopic(topic = "startByCtid")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NativeCtidVerifyApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeCtidVerifyApi";

    public NativeCtidVerifyApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ Object ipc$super(NativeCtidVerifyApi nativeCtidVerifyApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/NativeCtidVerifyApi");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "startByCtid";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, final JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        a.a(TAG, "NativeCtidVerifyApi execute params: " + str);
        try {
            try {
                RPVerify.startByCtidWithVerifyToken((Activity) this.mContext, new JSONObject(str).getString(BaseJsExecutor.NAME_VERIFY_TOKEN), null, new RPEventListener() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.NativeCtidVerifyApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/NativeCtidVerifyApi$1");
                    }

                    @Override // com.alibaba.security.realidentity.RPEventListener
                    public void onFinish(RPResult rPResult, RPDetail rPDetail) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a2f654c3", new Object[]{this, rPResult, rPDetail});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(BaseJsExecutor.NAME_AUDIT_STATUS, rPResult.code);
                            jSONObject.put("isReverify", String.valueOf((int) e2.z).equals(rPDetail.getSubCode()));
                        } catch (JSONException e) {
                            a.a(NativeCtidVerifyApi.TAG, e);
                        }
                        WVResultWrapper wVResultWrapper = new WVResultWrapper();
                        wVResultWrapper.setData(jSONObject);
                        jsCallbackAdapter.success(wVResultWrapper);
                        NativeCtidVerifyApi.this.finishJsBridge(wVResultWrapper, true);
                    }
                });
            } catch (Exception e) {
                a.a(TAG, "Context cannot cast to Activity ", e);
                trackExceptionLog("Context cannot cast to Activity ", e);
                callbackUnknowError(jsCallbackAdapter);
            }
            return true;
        } catch (JSONException e2) {
            trackExceptionLog("NativeCtidVerifyApi parse params error", e2);
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }
}
