package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import android.content.Context;
import com.alibaba.security.realidentity.d;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
@JSTopic(topic = "setTitle,rpSetTitle")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SetTitleApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_NAV_TITLE = "navTitle";

    public SetTitleApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ Context access$000(SetTitleApi setTitleApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9f06687", new Object[]{setTitleApi});
        }
        return setTitleApi.mContext;
    }

    public static /* synthetic */ Object ipc$super(SetTitleApi setTitleApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/exec/SetTitleApi");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "setTitle";
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        try {
            final String string = new JSONObject(str).getString(NAME_NAV_TITLE);
            Context context = this.mContext;
            if (context == null || !(context instanceof RPWebViewActivity)) {
                trackExceptionLog("SetTitleApi context is not RPWebViewActivity: " + this.mContext);
                finishJsBridge(callbackUnknowError(jsCallbackAdapter, "context is not RPWebViewActivity"), false);
                return false;
            }
            ((RPWebViewActivity) context).runOnUiThread(new Runnable() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.SetTitleApi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((RPWebViewActivity) SetTitleApi.access$000(SetTitleApi.this)).a(string);
                    }
                }
            });
            jsCallbackAdapter.success();
            finishJsBridge(new WVResultWrapper("success"), true);
            return true;
        } catch (JSONException e) {
            trackExceptionLog("SetTitleApi json parse error", d.b(e));
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }
}
