package com.ali.user.open.core.webview;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.MemberExecutorService;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BridgeCallbackContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int requestId;
    public WebView webView;

    static {
        t2o.a(71303267);
    }

    public static /* synthetic */ String access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return formatJsonString(str);
    }

    public static /* synthetic */ void access$100(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742ae716", new Object[]{bridgeCallbackContext, str});
        } else {
            bridgeCallbackContext.callback(str);
        }
    }

    private void callback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1da916", new Object[]{this, str});
            return;
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.getSettings().setSavePassword(false);
            this.webView.loadUrl(str);
        }
    }

    private static String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{str});
        }
        return str.replace("\\", "\\\\");
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return (Activity) this.webView.getContext();
    }

    public void onFailure(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            onFailure(jSONObject.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void success(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else {
            ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.core.webview.BridgeCallbackContext.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str2 = "javascript:window.HavanaBridge.onSuccess(" + BridgeCallbackContext.this.requestId + ");";
                    } else {
                        str2 = "javascript:window.HavanaBridge.onSuccess(" + BridgeCallbackContext.this.requestId + ",'" + BridgeCallbackContext.access$000(str) + "');";
                    }
                    BridgeCallbackContext.access$100(BridgeCallbackContext.this, str2);
                }
            });
        }
    }

    public void onFailure(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
        } else {
            ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.core.webview.BridgeCallbackContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str2 = "javascript:window.HavanaBridge.onFailure(" + BridgeCallbackContext.this.requestId + ",'');";
                    } else {
                        str2 = "javascript:window.HavanaBridge.onFailure(" + BridgeCallbackContext.this.requestId + ",'" + BridgeCallbackContext.access$000(str) + "');";
                    }
                    BridgeCallbackContext.access$100(BridgeCallbackContext.this, str2);
                }
            });
        }
    }
}
