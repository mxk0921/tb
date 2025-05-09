package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.Map;
import tb.dxv;
import tb.t2o;
import tb.uae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WebViewContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWVWebView f6378a;

    static {
        t2o.a(396361785);
    }

    public WebViewContainer(Context context) {
        ARUCWebView aRUCWebView = new ARUCWebView(context);
        aRUCWebView.setBackgroundColor(0);
        this.f6378a = aRUCWebView;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("143738ac", new Object[]{this});
        }
        IWVWebView iWVWebView = this.f6378a;
        if (iWVWebView instanceof ARUCWebView) {
            return (ARUCWebView) iWVWebView;
        }
        return iWVWebView.getView();
    }

    public IWVWebView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("6435f44d", new Object[]{this});
        }
        return this.f6378a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        IWVWebView iWVWebView = this.f6378a;
        if (iWVWebView instanceof ARUCWebView) {
            ((ARUCWebView) iWVWebView).hideLoading();
        }
    }

    public void d(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
        } else if (this.f6378a != null) {
            String h = h(str);
            IWVWebView iWVWebView = this.f6378a;
            if (iWVWebView instanceof ARUCWebView) {
                ((ARUCWebView) iWVWebView).loadUrl(h, map);
            } else {
                iWVWebView.loadUrl(h);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        BaseWVApiPlugin.removeWVActionListener(this.f6378a);
        IWVWebView iWVWebView = this.f6378a;
        if (iWVWebView instanceof ARUCWebView) {
            ((ARUCWebView) iWVWebView).destroy();
            this.f6378a = null;
        }
    }

    public void f(uae uaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6323c04a", new Object[]{this, uaeVar});
            return;
        }
        IWVWebView iWVWebView = this.f6378a;
        if (iWVWebView != null) {
            BaseWVApiPlugin.addWVActionListener(iWVWebView, uaeVar);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        IWVWebView iWVWebView = this.f6378a;
        if (iWVWebView instanceof ARUCWebView) {
            ((ARUCWebView) iWVWebView).showLoading();
        }
    }

    public final String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495bf52", new Object[]{this, str});
        }
        if (!dxv.j(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable unused) {
            Log.e("WebViewContainer", "failed to decode url[%s]" + str);
            return str;
        }
    }

    public WebViewContainer(IWVWebView iWVWebView) {
        this.f6378a = iWVWebView;
    }
}
