package com.taobao.android.lightvane.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.webview.LVWebChromeClient;
import com.taobao.android.lightvane.webview.LVWebView;
import com.taobao.android.lightvane.webview.LVWebViewClient;
import tb.keg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LVWebViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = LVWebViewFragment.class.getSimpleName();
    public static final String h = "url";

    /* renamed from: a  reason: collision with root package name */
    public LVWebView f8234a = null;
    public LVWebViewClient c = null;
    public LVWebChromeClient d = null;
    public View e = null;
    public String f = null;

    public static /* synthetic */ Object ipc$super(LVWebViewFragment lVWebViewFragment, String str, Object... objArr) {
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lightvane/fragment/LVWebViewFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        LVWebView lVWebView = this.f8234a;
        if (lVWebView != null) {
            lVWebView.onActivityResult(i, i2, intent);
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (r2() == null || !r2().canGoBack()) {
            return false;
        }
        r2().goBack();
        return true;
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
            this.f = arguments.getString(h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LVWebView lVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        try {
            this.f8234a = s2(requireContext());
        } catch (Throwable th) {
            th.printStackTrace();
            this.e = u2(th);
        }
        LVWebViewClient lVWebViewClient = this.c;
        if (lVWebViewClient != null) {
            z2(lVWebViewClient);
        }
        LVWebChromeClient lVWebChromeClient = this.d;
        if (lVWebChromeClient != null) {
            v2(lVWebChromeClient);
        }
        if (this.f8234a != null) {
            this.f8234a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        String str = this.f;
        if (str == null || (lVWebView = this.f8234a) == null) {
            keg.d(6, g, "image urls is null");
            if (this.f8234a == null) {
                View view = this.e;
                if (view != null) {
                    return view;
                }
                View p2 = p2();
                this.e = p2;
                return p2;
            }
        } else {
            lVWebView.loadUrl(str);
        }
        return this.f8234a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LVWebView lVWebView = this.f8234a;
        if (lVWebView != null) {
            lVWebView.setVisibility(8);
            this.f8234a.removeAllViews();
            if (this.f8234a.getParent() != null) {
                ((ViewGroup) this.f8234a.getParent()).removeView(this.f8234a);
            }
            this.f8234a.loadUrl("about:blank");
            this.f8234a.destroy();
            this.f8234a = null;
        }
        try {
            super.onDestroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        LVWebView lVWebView = this.f8234a;
        if (lVWebView != null) {
            lVWebView.onPause();
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
        LVWebView lVWebView = this.f8234a;
        if (lVWebView != null) {
            lVWebView.onResume();
        }
        super.onResume();
    }

    public final View p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1702a7b1", new Object[]{this});
        }
        TextView textView = new TextView(getContext());
        textView.setText("未找到系统浏览器");
        textView.setGravity(17);
        return textView;
    }

    public WebView r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("fb78e94f", new Object[]{this});
        }
        return this.f8234a;
    }

    public LVWebView s2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LVWebView) ipChange.ipc$dispatch("118c4bb3", new Object[]{this, context});
        }
        return new LVWebView(context);
    }

    public View u2(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a772dafc", new Object[]{this, th});
        }
        return null;
    }

    public void v2(LVWebChromeClient lVWebChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a60705e", new Object[]{this, lVWebChromeClient});
        } else if (lVWebChromeClient != null) {
            this.d = lVWebChromeClient;
            LVWebView lVWebView = this.f8234a;
            if (lVWebView != null) {
                lVWebView.setWebChromeClient(lVWebChromeClient);
            }
        }
    }

    public void z2(LVWebViewClient lVWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6367fe", new Object[]{this, lVWebViewClient});
        } else if (lVWebViewClient != null) {
            this.c = lVWebViewClient;
            LVWebView lVWebView = this.f8234a;
            if (lVWebView != null) {
                lVWebView.setWebViewClient(lVWebViewClient);
            }
        }
    }

    static {
        t2o.a(507510791);
    }
}
