package tb;

import android.app.Activity;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.uc.webview.export.WebView;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import tb.dmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gmf extends dmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WVUCWebView c;
    public boolean d;
    public JSONObject e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ gmf c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, gmf gmfVar) {
            super(activity);
            this.b = activity;
            this.c = gmfVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -623958539) {
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            }
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridWebContainer$loadPage$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "super.onReceivedError(view, errorCode, description, failingUrl)", imports = {"android.taobao.windvane.extra.uc.WVUCWebViewClient"}))
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            agh.c(str, z9u.ARG_ERROR_CODE + i + " description=" + ((Object) str));
            dmf.a d = this.c.d();
            if (d != null) {
                d.B(true, Integer.valueOf(i), str);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "super.shouldOverrideUrlLoading(view, url)", imports = {"android.taobao.windvane.extra.uc.WVUCWebViewClient"}))
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            String itemidFromUrl = IrpParamModel.getItemidFromUrl(str);
            if (!super.shouldOverrideUrlLoading(webView, str)) {
                if (!pv8.a(str) || TextUtils.isEmpty(itemidFromUrl)) {
                    nmj.a(this.b, str);
                } else {
                    nmj.c(this.b, str, itemidFromUrl);
                }
            }
            return true;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (gmf.s(this.c) != null && !gmf.r(this.c)) {
                this.c.j(true);
                gmf.u(this.c, true);
                dmf.a d = this.c.d();
                if (d != null) {
                    WVUCWebView s = gmf.s(this.c);
                    ckf.d(s);
                    d.j(true, s);
                }
                if (gmf.t(this.c) != null) {
                    WVUCWebView s2 = gmf.s(this.c);
                    ckf.d(s2);
                    JSONObject t = gmf.t(this.c);
                    ckf.d(t);
                    s2.fireEvent("setSearchParams", t.toString());
                }
            }
        }
    }

    static {
        t2o.a(481297229);
    }

    public gmf(dmf.a aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object ipc$super(gmf gmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridWebContainer");
    }

    public static final /* synthetic */ boolean r(gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b3b964", new Object[]{gmfVar})).booleanValue();
        }
        return gmfVar.f;
    }

    public static final /* synthetic */ WVUCWebView s(gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("96c788e8", new Object[]{gmfVar});
        }
        return gmfVar.c;
    }

    public static final /* synthetic */ JSONObject t(gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6fa9a3cb", new Object[]{gmfVar});
        }
        return gmfVar.e;
    }

    public static final /* synthetic */ void u(gmf gmfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460f2880", new Object[]{gmfVar, new Boolean(z)});
        } else {
            gmfVar.f = z;
        }
    }

    @Override // tb.dmf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a592f586", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.dmf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.coreDestroy();
        }
        this.c = null;
    }

    @Override // tb.dmf
    public void c(String str, String str2, Map<String, ? extends Object> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163350b5", new Object[]{this, str, str2, map});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            if (map == null) {
                str3 = "";
            } else {
                str3 = JSON.toJSONString(map);
            }
            wVUCWebView.fireEvent(str2, str3);
        }
    }

    @Override // tb.dmf
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334ee134", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15df2128", new Object[]{this});
        }
    }

    @Override // tb.dmf
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f555b1", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.dmf
    public void n(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
        }
    }

    @Override // tb.dmf
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b98fd4e", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.dmf
    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5e9c7", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.dmf
    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ec709", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            if (this.c == null || !e()) {
                this.e = jSONObject;
                return;
            }
            WVUCWebView wVUCWebView = this.c;
            ckf.d(wVUCWebView);
            String jSONString = jSONObject.toJSONString();
            if (jSONString == null) {
                jSONString = "";
            }
            wVUCWebView.fireEvent("setSearchParams", jSONString);
        }
    }

    @Override // tb.dmf
    public void f(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61325cd7", new Object[]{this, activity, map});
            return;
        }
        ckf.g(activity, "activity");
        String H2 = lg4.H2("https://market.m.taobao.com/app/imagesearch-page/s-imgsearch-result/index");
        ckf.f(H2, "getIrpWebUrl(\"https://ma…-imgsearch-result/index\")");
        if (TextUtils.isEmpty(H2)) {
            dmf.a d = d();
            if (d != null) {
                d.B(true, -1, "页面链接为空");
                return;
            }
            return;
        }
        WVUCWebView wVUCWebView = new WVUCWebView(activity);
        this.c = wVUCWebView;
        wVUCWebView.setWebChromeClient(new WVUCWebChromeClient(activity));
        WVUCWebView wVUCWebView2 = this.c;
        if (wVUCWebView2 != null) {
            wVUCWebView2.setWebViewClient(new a(activity, this));
        }
        String a2 = pov.a(H2, map);
        ckf.f(a2, "appendQueryParameter(webUrlBase, params)");
        WVUCWebView wVUCWebView3 = this.c;
        ckf.d(wVUCWebView3);
        wVUCWebView3.loadUrl(a2);
    }
}
