package com.ali.user.open.ucc.webview;

import android.os.Bundle;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.webview.BridgeCallbackContext;
import com.ali.user.open.core.webview.BridgeMethod;
import com.ali.user.open.core.webview.INavHelper;
import com.ali.user.open.ucc.biz.UccH5Presenter;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccSystemJSBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALU_SYSTEM_JSBRIDGE = "aluUccJSBridge";

    static {
        t2o.a(76546195);
    }

    @BridgeMethod
    public void aluOpenWebViewByUrl(BridgeCallbackContext bridgeCallbackContext, String str) {
        if (bridgeCallbackContext != null) {
            try {
                String string = new JSONObject(str).getString("url");
                Bundle bundle = new Bundle();
                bundle.putString("url", string);
                if (ConfigManager.getInstance().getNavHelper() != null) {
                    ((INavHelper) ConfigManager.getInstance().getNavHelper().newInstance()).navTo(bridgeCallbackContext.getActivity(), string);
                } else {
                    UccH5Presenter.openUrl(bridgeCallbackContext.getActivity(), bundle, null);
                }
                bridgeCallbackContext.success(new JSONObject().toString());
            } catch (Throwable th) {
                bridgeCallbackContext.onFailure(1001, th.getMessage());
            }
        }
    }
}
