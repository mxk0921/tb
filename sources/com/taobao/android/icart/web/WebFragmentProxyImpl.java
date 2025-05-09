package com.taobao.android.icart.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.uc.webview.export.WebView;
import tb.hzw;
import tb.t2o;
import tb.zbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WebFragmentProxyImpl extends BaseICartFragmentProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CART_REFRESH_DATA = "cartRefreshData";
    public WVUCWebView d;
    public TBActionView e;
    public TBActionView f;
    public TBActionView g;
    public TBPublicMenu h;
    public View i;
    public TBProgressBar j;
    public SwipeRefreshLayout k;
    public String l;
    public int m;
    public View n;
    public final Handler o = new Handler(new b());
    public final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.taobao.android.icart.web.WebFragmentProxyImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/web/WebFragmentProxyImpl$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (WebFragmentProxyImpl.F(WebFragmentProxyImpl.this) != null) {
                WebFragmentProxyImpl.F(WebFragmentProxyImpl.this).reload();
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                WebFragmentProxyImpl.F(WebFragmentProxyImpl.this).refresh();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what != 1) {
                return false;
            }
            WebFragmentProxyImpl.E(WebFragmentProxyImpl.this).setRefreshing(false);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                WebFragmentProxyImpl.I(WebFragmentProxyImpl.this, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/web/WebFragmentProxyImpl$6");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setProgress(100);
            WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setVisibility(8);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setProgress(0);
            WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -1540056808) {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/web/WebFragmentProxyImpl$7");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                return;
            }
            super.onProgressChanged(webView, i);
            if (i == 100) {
                WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setProgress(0);
            } else {
                WebFragmentProxyImpl.J(WebFragmentProxyImpl.this).setProgress(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (WebFragmentProxyImpl.this.b() != TBMainHost.b().getContext() && !WebFragmentProxyImpl.this.b().isFinishing()) {
                WebFragmentProxyImpl.K(WebFragmentProxyImpl.this).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                WebFragmentProxyImpl.this.b().finish();
            }
        }
    }

    static {
        t2o.a(478150903);
    }

    public WebFragmentProxyImpl(BaseICartFragment baseICartFragment) {
        super(baseICartFragment);
    }

    public static /* synthetic */ SwipeRefreshLayout E(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwipeRefreshLayout) ipChange.ipc$dispatch("2734bcc5", new Object[]{webFragmentProxyImpl});
        }
        return webFragmentProxyImpl.k;
    }

    public static /* synthetic */ WVUCWebView F(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("a326456c", new Object[]{webFragmentProxyImpl});
        }
        return webFragmentProxyImpl.d;
    }

    public static /* synthetic */ Handler G(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("dd22aa7c", new Object[]{webFragmentProxyImpl});
        }
        return webFragmentProxyImpl.o;
    }

    public static /* synthetic */ int H(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddddfb1c", new Object[]{webFragmentProxyImpl})).intValue();
        }
        return webFragmentProxyImpl.m;
    }

    public static /* synthetic */ int I(WebFragmentProxyImpl webFragmentProxyImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2909eeef", new Object[]{webFragmentProxyImpl, new Integer(i)})).intValue();
        }
        webFragmentProxyImpl.m = i;
        return i;
    }

    public static /* synthetic */ TBProgressBar J(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBProgressBar) ipChange.ipc$dispatch("9d01b228", new Object[]{webFragmentProxyImpl});
        }
        return webFragmentProxyImpl.j;
    }

    public static /* synthetic */ TBPublicMenu K(WebFragmentProxyImpl webFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("d88ee5d0", new Object[]{webFragmentProxyImpl});
        }
        return webFragmentProxyImpl.h;
    }

    public static /* synthetic */ Object ipc$super(WebFragmentProxyImpl webFragmentProxyImpl, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.o();
                return null;
            case -641568046:
                super.m((Bundle) objArr[0]);
                return null;
            case 352555969:
                super.u(((Boolean) objArr[0]).booleanValue());
                return null;
            case 797441118:
                super.t();
                return null;
            case 1257714799:
                super.l(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/web/WebFragmentProxyImpl");
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc6ecd8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(this.l)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.l);
            String str2 = "?";
            if (this.l.contains(str2)) {
                str2 = "&";
            }
            sb.append(str2);
            this.l = sb.toString();
            this.l += str;
        }
    }

    public final String M(Context context, String str) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e9f1b9b", new Object[]{this, context, str});
        }
        if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (intent == null || TextUtils.isEmpty(str) || (data = intent.getData()) == null) {
            return null;
        }
        try {
            return JSON.parseObject(data.getQueryParameter("customParams")).getString(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb55659b", new Object[]{this});
        }
        return OrangeConfig.getInstance().getConfig("cart_switch", zbl.ORANGE_TB_CART_H5, "https://main.m.taobao.com/cart/index.html?ttid=h5&spm=a2141.7631563");
    }

    public final void O() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.k = (SwipeRefreshLayout) this.n.findViewById(R.id.cart_h5_refresh);
        this.f = (TBActionView) this.n.findViewById(R.id.btn_action_menu);
        this.g = (TBActionView) this.n.findViewById(R.id.btn_action_back);
        this.e = (TBActionView) this.n.findViewById(R.id.btn_action_refresh_cart);
        this.i = this.n.findViewById(R.id.top_bar);
        this.j = (TBProgressBar) this.n.findViewById(R.id.load_progress);
        this.h = new TBPublicMenu(b());
        this.k.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.android.icart.web.WebFragmentProxyImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                WebFragmentProxyImpl.G(WebFragmentProxyImpl.this).sendEmptyMessageDelayed(1, 500L);
                WebFragmentProxyImpl.F(WebFragmentProxyImpl.this).reload();
            }
        });
        this.k.setOnChildScrollUpCallback(new SwipeRefreshLayout.OnChildScrollUpCallback() { // from class: com.taobao.android.icart.web.WebFragmentProxyImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback
            public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("817ea748", new Object[]{this, swipeRefreshLayout, view})).booleanValue();
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (WebFragmentProxyImpl.H(WebFragmentProxyImpl.this) > 0) {
                        return true;
                    }
                    return false;
                } else if (WebFragmentProxyImpl.F(WebFragmentProxyImpl.this).getChildAt(0).getScrollY() > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            hzw.a(this.d, new c());
        }
        this.j.setProgress(0);
        String M = M(d(), "downGradeUrl");
        this.l = M;
        if (TextUtils.isEmpty(M)) {
            this.l = N();
            L("disableNav=YES");
            if (TBMainHost.fromActivity(b()) != null) {
                str = "hasback=false";
            } else {
                str = "hasback=true";
            }
            L(str);
        }
        Q();
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
            return;
        }
        this.d.setWebViewClient(new d(d()));
        this.d.setWebChromeClient(new e());
        this.d.loadUrl(this.l);
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cartRefreshData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(b()).registerReceiver(this.p, intentFilter);
    }

    public final void R() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d1fd36", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.n.findViewById(R.id.action_bar);
        boolean contains = this.l.contains("disableNav=YES");
        if (contains) {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        ((LinearLayout.LayoutParams) this.i.getLayoutParams()).height = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(d());
        if (contains) {
            this.i.setBackgroundResource(R.drawable.cart_h5_topbar_orange_background);
            this.i.setAlpha(1.0f);
        } else {
            this.i.setBackgroundColor(-16777216);
            this.i.setAlpha(0.5f);
            S();
        }
        this.k.setEnabled(contains);
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9333d2e", new Object[]{this});
            return;
        }
        this.f.setOnClickListener(new f());
        this.g.setOnClickListener(new g());
        this.e.setOnClickListener(new a());
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(b()).unregisterReceiver(this.p);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("1fb65f58", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy.FragmentProxyType h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy.FragmentProxyType) ipChange.ipc$dispatch("872b3ae7", new Object[]{this});
        }
        return BaseICartFragmentProxy.FragmentProxyType.WEB;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void k(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.reload();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.onActivityResult(i, i2, intent);
        }
        super.l(i, i2, intent);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void m(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.m(bundle);
        b().getWindow().setSoftInputMode(32);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
        }
        T();
        super.o();
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
        }
        super.t();
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150393c1", new Object[]{this, new Boolean(z)});
            return;
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.u(z);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public View n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.n == null) {
            View inflate = layoutInflater.inflate(R.layout.cart_degrade_h5_fragment, viewGroup, false);
            this.n = inflate;
            this.d = (WVUCWebView) inflate.findViewById(R.id.webview_h5_container);
            O();
            R();
            P();
            new JSONObject().put("url", (Object) this.l);
        }
        return this.n;
    }
}
