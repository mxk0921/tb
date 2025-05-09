package com.taobao.browser.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.fm2;
import tb.lcn;
import tb.oxq;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SplashFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "WindVane/SplashFragment";
    public static String URL = "url";
    private BrowserHybridWebView mWebView = null;

    public static void dismiss(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df02b0ba", new Object[]{fragmentManager});
            return;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("SplashFragment");
        if (findFragmentByTag != null) {
            ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ Object ipc$super(SplashFragment splashFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/fragment/SplashFragment");
        }
    }

    public static SplashFragment newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplashFragment) ipChange.ipc$dispatch("e7fb5f0d", new Object[0]);
        }
        return new SplashFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.mWebView;
        if (browserHybridWebView != null) {
            browserHybridWebView.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
        } else {
            super.onAttach(activity);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.Theme_Welcome_Adaptor_New_Provision);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            super.onDestroy();
        } catch (Exception e) {
            v7t.d(TAG, e.getMessage());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        oxq.b(getDialog());
    }

    public static void show(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdade67", new Object[]{fragmentManager});
        } else if (!fm2.commonConfig.A || !ABGlobal.isFeatureOpened(Globals.getApplication(), "enableSkipSplashFragment")) {
            lcn.f(RVLLevel.Info, TAG, "still show SplashFragment");
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("SplashFragment");
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            SplashFragment newInstance = newInstance();
            beginTransaction.add(newInstance, "SplashFragment").commitAllowingStateLoss();
            newInstance.setCancelable(false);
        } else {
            lcn.f(RVLLevel.Info, TAG, "skip SplashFragment");
        }
    }

    static {
        t2o.a(619708501);
    }
}
