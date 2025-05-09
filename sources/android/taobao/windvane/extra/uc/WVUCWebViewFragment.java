package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCWebViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = WVUCWebViewFragment.class.getSimpleName();
    public static String URL = "url";
    private Activity activity;
    public WVUCWebView mWebView = null;
    private WVUCWebViewClient mWebclient = null;
    private WVUCWebChromeClient mChromeClient = null;
    private String url = null;

    @Deprecated
    public WVUCWebViewFragment() {
    }

    public static /* synthetic */ Object ipc$super(WVUCWebViewFragment wVUCWebViewFragment, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCWebViewFragment");
        }
    }

    public WVUCWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this});
        }
        if (this.mWebView == null) {
            Context context = this.activity;
            if (context == null) {
                context = getActivity();
            }
            if (context == null) {
                return null;
            }
            this.mWebView = new WVUCWebView(context);
            setWebViewClient(this.mWebclient);
            setWebchormeClient(this.mChromeClient);
            this.mWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return this.mWebView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.onActivityResult(i, i2, intent);
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
        this.activity = activity;
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (getWebView() == null || !getWebView().canGoBack()) {
            return false;
        }
        getWebView().goBack();
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
            this.url = arguments.getString(URL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getWebView();
        String str = this.url;
        if (str == null || (wVUCWebView = this.mWebView) == null) {
            v7t.a(TAG, "image urls is null");
        } else {
            wVUCWebView.loadUrl(str);
        }
        return this.mWebView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.setVisibility(8);
            this.mWebView.removeAllViews();
            if (this.mWebView.getParent() != null) {
                ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
            }
            this.mWebView.destroy();
            this.mWebView = null;
        }
        this.activity = null;
        try {
            super.onDestroy();
        } catch (Exception e) {
            v7t.d(TAG, e.getMessage());
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
        WVUCWebView wVUCWebView = this.mWebView;
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
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.onResume();
    }

    public void setWebViewClient(WVUCWebViewClient wVUCWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a058df", new Object[]{this, wVUCWebViewClient});
        } else if (wVUCWebViewClient != null) {
            this.mWebclient = wVUCWebViewClient;
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView != null) {
                wVUCWebView.setWebViewClient(wVUCWebViewClient);
            }
        }
    }

    public void setWebchormeClient(WVUCWebChromeClient wVUCWebChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3360c045", new Object[]{this, wVUCWebChromeClient});
        } else if (wVUCWebChromeClient != null) {
            this.mChromeClient = wVUCWebChromeClient;
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView != null) {
                wVUCWebView.setWebChromeClient(wVUCWebChromeClient);
            }
        }
    }

    static {
        t2o.a(989856153);
    }

    public WVUCWebViewFragment(Activity activity) {
        this.activity = activity;
    }
}
