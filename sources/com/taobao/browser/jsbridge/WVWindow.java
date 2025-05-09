package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVBase;
import android.taobao.windvane.webview.IWVWebView;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bbs;
import tb.gtw;
import tb.jc0;
import tb.m7r;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVWindow extends WVBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWindow";
    public Handler mHandler;

    static {
        t2o.a(619708534);
    }

    public static /* synthetic */ Object ipc$super(WVWindow wVWindow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/WVWindow");
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (iWVWebView instanceof BrowserHybridWebView) {
            this.mHandler = ((BrowserHybridWebView) iWVWebView).getOutHandler();
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.WVBase, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"openWindow".equals(str)) {
            return super.execute(str, str2, wVCallBackContext);
        }
        String str3 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(TAG, str3, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        openWindow(str2, wVCallBackContext);
        return true;
    }

    private void openWindow(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b284a1a8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("popBeforeOpen", false);
            String string = jSONObject.getString("url");
            String optString = jSONObject.optString("transitionParams", null);
            boolean optBoolean2 = jSONObject.optBoolean("nextPageAnimation", true);
            Intent intent = new Intent();
            if (!optBoolean2) {
                string = gtw.a(string, "nextPageAnimation", "false");
            }
            Uri parse = Uri.parse(string);
            Nav from = Nav.from(this.mContext);
            bbs i = TMSInstanceExtKt.i(this.mContext);
            if (i == null || !TMSInstanceExtKt.r(i)) {
                from.disallowLoopback();
            }
            if (!optBoolean2) {
                from.disableTransition();
            }
            if (optString != null) {
                Bundle bundle = new Bundle();
                bundle.putString("transitionParams", optString);
                if (from.withExtras(bundle).toUri(string)) {
                    wVCallBackContext.success();
                    if (optBoolean && this.mHandler == null) {
                        ((Activity) this.mContext).finish();
                        return;
                    }
                    return;
                }
            } else if (from.toUri(string)) {
                wVCallBackContext.success();
                if (optBoolean && this.mHandler == null) {
                    ((Activity) this.mContext).finish();
                    return;
                }
                return;
            } else {
                try {
                    if (!(this.mWebView == null || !WVCore.getInstance().isUCSupport() || ((WVUCWebView) this.mWebView).getUCExtension() == null)) {
                        this.mWebView.loadUrl(string);
                        wVCallBackContext.success();
                        return;
                    }
                } catch (Throwable unused) {
                    nsw nswVar = new nsw();
                    nswVar.b("errorInfo", "loadUrl not in webview");
                    wVCallBackContext.error(nswVar);
                    return;
                }
            }
            if (this.mContext instanceof BrowserUpperActivity) {
                nsw nswVar2 = new nsw();
                nswVar2.b("errorInfo", "You can openWindow only once");
                wVCallBackContext.error(nswVar2);
                return;
            }
            intent.setData(parse);
            intent.setClass(this.mContext, BrowserUpperActivity.class);
            intent.addCategory(m7r.CATEGORY_MORE_WINDOW);
            if (optString != null) {
                intent.putExtra("transitionParams", optString);
            }
            Context context = this.mContext;
            if (context instanceof Activity) {
                jc0.j((Activity) context, intent, RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND);
                if (!optBoolean2) {
                    ((Activity) this.mContext).overridePendingTransition(0, 0);
                }
                if (optBoolean) {
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.sendEmptyMessage(1105);
                    } else {
                        ((Activity) this.mContext).finish();
                    }
                }
                wVCallBackContext.success();
                return;
            }
            nsw nswVar3 = new nsw();
            nswVar3.b("errorInfo", "Your context is not Activity");
            wVCallBackContext.error(nswVar3);
        } catch (JSONException unused2) {
            v7t.d(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }
}
