package com.taobao.tmgcashier.fragment;

import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMGCashierWebView extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTENT_HAS_NAV_BAR = "content_has_nav_bar";
    public static final String CONTENT_URL = "content_url";
    public static final String TAG = "TMGCashierWebView";

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f13834a;
    public RelativeLayout c;
    public String d;
    public boolean e = true;
    public ViewGroup f;
    public ViewGroup g;

    static {
        t2o.a(860880908);
    }

    public TMGCashierWebView(String str) {
        this.d = str;
    }

    public static /* synthetic */ Object ipc$super(TMGCashierWebView tMGCashierWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/fragment/TMGCashierWebView");
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.d;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c.addView(this.f13834a);
        s2(this.f13834a);
        u2(this.d);
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        p2();
        init();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getString(CONTENT_URL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.tmg_cashier_container, viewGroup, false);
        this.f = (ViewGroup) inflate.findViewById(R.id.aliuser_main_content);
        this.g = (ViewGroup) inflate.findViewById(R.id.aliuser_content);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.tmg_cashier_webview, this.f, false);
        this.c = (RelativeLayout) viewGroup2.findViewById(R.id.cash_webview_contain);
        this.g.addView(viewGroup2);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.e) {
            try {
                this.c.removeView(this.f13834a);
                this.f13834a.removeAllViews();
                this.f13834a.setVisibility(8);
                this.f13834a.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f13834a;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f13834a;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        initViews();
    }

    public void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a95184", new Object[]{this});
            return;
        }
        try {
            this.f13834a = new WVUCWebView(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f13834a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public IWVWebView r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("a50a9e10", new Object[]{this});
        }
        return this.f13834a;
    }

    public void u2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e6fee1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f13834a.loadUrl(str);
        }
    }

    public static void s2(WVUCWebView wVUCWebView) {
        wVUCWebView.setVerticalScrollbarOverlay(true);
        WebSettings settings = wVUCWebView.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(wVUCWebView.getCurrentContext().getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        new StringBuilder("user agent=").append(settings.getUserAgentString());
        try {
            Method method = wVUCWebView.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
            if (method != null) {
                method.invoke(wVUCWebView.getSettings(), Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
        try {
            wVUCWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            wVUCWebView.removeJavascriptInterface("accessibility");
            wVUCWebView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        wVUCWebView.setBackgroundColor(0);
        wVUCWebView.getBackground().setAlpha(0);
    }

    public TMGCashierWebView() {
    }
}
