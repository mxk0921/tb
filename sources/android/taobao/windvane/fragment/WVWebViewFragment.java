package android.taobao.windvane.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.webview.WVWebChromeClient;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWebViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = WVWebViewFragment.class.getSimpleName();
    public static final String h = "url";

    /* renamed from: a  reason: collision with root package name */
    public WVWebView f1774a = null;
    public WVWebViewClient c = null;
    public WVWebChromeClient d = null;
    public String e = null;
    public Activity f;

    @Deprecated
    public WVWebViewFragment() {
    }

    public static /* synthetic */ Object ipc$super(WVWebViewFragment wVWebViewFragment, String str, Object... objArr) {
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
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/fragment/WVWebViewFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVWebView wVWebView = this.f1774a;
        if (wVWebView != null) {
            wVWebView.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.f = activity;
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
            this.e = arguments.getString(h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WVWebView wVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        p2();
        String str = this.e;
        if (str == null || (wVWebView = this.f1774a) == null) {
            v7t.a(g, "image urls is null");
        } else {
            wVWebView.loadUrl(str);
        }
        return this.f1774a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        WVWebView wVWebView = this.f1774a;
        if (wVWebView != null) {
            wVWebView.setVisibility(8);
            this.f1774a.removeAllViews();
            if (this.f1774a.getParent() != null) {
                ((ViewGroup) this.f1774a.getParent()).removeView(this.f1774a);
            }
            this.f1774a.loadUrl("about:blank");
            this.f1774a.destroy();
            this.f1774a = null;
        }
        this.f = null;
        try {
            super.onDestroy();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVWebView wVWebView = this.f1774a;
        if (wVWebView != null) {
            wVWebView.onPause();
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
        WVWebView wVWebView = this.f1774a;
        if (wVWebView != null) {
            wVWebView.onResume();
        }
        super.onResume();
    }

    public WebView p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("fb78e94f", new Object[]{this});
        }
        if (this.f1774a == null) {
            Context context = this.f;
            if (context == null) {
                context = getActivity();
            }
            if (context == null) {
                return null;
            }
            this.f1774a = new WVWebView(context);
            r2(this.c);
            s2(this.d);
            this.f1774a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return this.f1774a;
    }

    public void r2(WVWebViewClient wVWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf31732d", new Object[]{this, wVWebViewClient});
        } else if (wVWebViewClient != null) {
            this.c = wVWebViewClient;
            WVWebView wVWebView = this.f1774a;
            if (wVWebView != null) {
                wVWebView.setWebViewClient(wVWebViewClient);
            }
        }
    }

    public void s2(WVWebChromeClient wVWebChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc69ba3d", new Object[]{this, wVWebChromeClient});
        } else if (wVWebChromeClient != null) {
            this.d = wVWebChromeClient;
            WVWebView wVWebView = this.f1774a;
            if (wVWebView != null) {
                wVWebView.setWebChromeClient(wVWebChromeClient);
            }
        }
    }

    static {
        t2o.a(989856188);
    }

    public WVWebViewFragment(Activity activity) {
        this.f = activity;
    }
}
