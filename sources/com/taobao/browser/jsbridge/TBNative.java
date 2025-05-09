package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gtw;
import tb.jc0;
import tb.kpw;
import tb.m7r;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBNative extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CATEGORY_UPPER_BROWSER = "upperBrowser";
    public static final String RESULT = "result";
    private static final String TAG = "TBNative";
    public Handler mHandler;

    static {
        t2o.a(619708515);
    }

    public static /* synthetic */ void access$000(TBNative tBNative, WVCallBackContext wVCallBackContext, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28335456", new Object[]{tBNative, wVCallBackContext, bundle, intent});
        } else {
            tBNative.startSelf(wVCallBackContext, bundle, intent);
        }
    }

    public static /* synthetic */ Object ipc$super(TBNative tBNative, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/TBNative");
        }
    }

    private void openWindow(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b284a1a8", new Object[]{this, str, wVCallBackContext});
        } else {
            openWindowInner(str, wVCallBackContext, false);
        }
    }

    private void openWindowCompatNavProcess(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd412d36", new Object[]{this, str, wVCallBackContext});
        } else {
            openWindowInner(str, wVCallBackContext, true);
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

    @WindVaneInterface
    public final void nativeBack(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872a2f2c", new Object[]{this, wVCallBackContext, str});
        } else if (this.mHandler != null) {
            if (StringUtil.isEmpty(str)) {
                this.mHandler.sendEmptyMessage(1105);
            } else {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString("result", str);
                obtain.what = 1105;
                obtain.setData(bundle);
                this.mHandler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } else {
            try {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                    wVCallBackContext.success();
                    return;
                }
            } catch (Throwable unused) {
            }
            wVCallBackContext.error();
        }
    }

    public final void navTo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1f0ccc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String string = new JSONObject(str).getString("url");
            if (Nav.from(this.mContext).toUri(string)) {
                wVCallBackContext.success();
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("errorInfo", "can not nav url : " + string);
            wVCallBackContext.error(nswVar);
        } catch (JSONException unused) {
            v7t.d(TAG, "navTo: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mHandler = null;
        super.onDestroy();
    }

    private void openWindowInner(String str, final WVCallBackContext wVCallBackContext, boolean z) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689f302a", new Object[]{this, str, wVCallBackContext, new Boolean(z)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("popBeforeOpen", false);
            if (optBoolean && (handler = this.mHandler) != null) {
                handler.sendEmptyMessage(1105);
            }
            String string = jSONObject.getString("url");
            String optString = jSONObject.optString("transitionParams", null);
            boolean optBoolean2 = jSONObject.optBoolean("nextPageAnimation", true);
            if (!optBoolean2) {
                string = gtw.a(string, "nextPageAnimation", "false");
            }
            final Bundle bundle = new Bundle();
            bundle.putString("transitionParams", optString);
            bundle.putString("url", string);
            bundle.putBoolean("popBeforeOpen", optBoolean);
            Nav.b bVar = z ? new Nav.b() { // from class: com.taobao.browser.jsbridge.TBNative.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.nav.Nav.b
                public void onResult(boolean z2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98556e8e", new Object[]{this, new Boolean(z2), intent});
                    } else if (!z2) {
                        TBNative.access$000(TBNative.this, wVCallBackContext, bundle, intent);
                    }
                }
            } : null;
            Nav from = Nav.from(this.mContext);
            if (!optBoolean2) {
                from.disableTransition();
            }
            if (optString != null) {
                from.withExtras(bundle);
                if (this.mContext instanceof BrowserActivity) {
                    from.disallowLoopback();
                    if (from.toUri(string, bVar)) {
                        wVCallBackContext.success();
                        return;
                    }
                } else if (from.toUri(string)) {
                    wVCallBackContext.success();
                    if (optBoolean && this.mHandler == null) {
                        ((Activity) this.mContext).finish();
                        if (!optBoolean2) {
                            ((Activity) this.mContext).overridePendingTransition(0, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (this.mContext instanceof BrowserActivity) {
                from.disallowLoopback();
                if (from.toUri(string, bVar)) {
                    wVCallBackContext.success();
                    return;
                }
            } else if (from.toUri(string)) {
                wVCallBackContext.success();
                if (optBoolean && this.mHandler == null) {
                    ((Activity) this.mContext).finish();
                }
                if (!optBoolean2) {
                    ((Activity) this.mContext).overridePendingTransition(0, 0);
                    return;
                }
                return;
            }
            if (!z) {
                startSelf(wVCallBackContext, bundle, null);
            }
        } catch (JSONException unused) {
            v7t.d(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }

    private void startSelf(WVCallBackContext wVCallBackContext, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a786e3f", new Object[]{this, wVCallBackContext, bundle, intent});
            return;
        }
        String string = bundle.getString("url");
        Uri parse = Uri.parse(string);
        String string2 = bundle.getString("transitionParams");
        boolean z = bundle.getBoolean("popBeforeOpen");
        boolean booleanQueryParameter = parse.getBooleanQueryParameter("nextPageAnimation", true);
        if (intent == null) {
            intent = new Intent();
            try {
                Variation variation = UTABTest.activate(UTABTest.COMPONENT_NAV, string).getVariation("bucket");
                if (variation != null) {
                    String valueAsString = variation.getValueAsString(null);
                    if (!TextUtils.isEmpty(valueAsString)) {
                        v7t.i(TAG, "openWindow replace AB url = [" + valueAsString + "]");
                    }
                }
            } catch (Throwable unused) {
            }
            intent.setData(parse);
        }
        intent.setClass(this.mContext, BrowserUpperActivity.class);
        intent.addCategory(m7r.CATEGORY_MORE_WINDOW);
        if (string2 != null) {
            intent.putExtra("transitionParams", string2);
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            jc0.j((Activity) context, intent, RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND);
            if (!booleanQueryParameter) {
                ((Activity) this.mContext).overridePendingTransition(0, 0);
            }
            wVCallBackContext.success();
            if (z) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(1105);
                } else {
                    ((Activity) this.mContext).finish();
                }
            }
        } else {
            nsw nswVar = new nsw();
            nswVar.b("errorInfo", "Your context is not Activity");
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(TAG, str3, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        if ("nativeBack".equals(str)) {
            nativeBack(wVCallBackContext, str2);
        } else if ("openWindow".equals(str)) {
            openWindow(str2, wVCallBackContext);
            return true;
        } else if ("navTo".equals(str)) {
            navTo(str2, wVCallBackContext);
            return true;
        } else if ("openWindowCompatNavProcess".equals(str)) {
            openWindowCompatNavProcess(str2, wVCallBackContext);
        }
        return false;
    }
}
