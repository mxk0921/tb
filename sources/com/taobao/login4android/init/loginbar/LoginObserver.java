package com.taobao.login4android.init.loginbar;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.jsbridge.PopJSBridge;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginObserver extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "Login.Observer";

    static {
        t2o.a(517996601);
    }

    public static String getCurrentActivityName(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("727099ea", new Object[]{activity});
        }
        if (activity == null) {
            return "";
        }
        return activity.getClass().getName();
    }

    public static /* synthetic */ Object ipc$super(LoginObserver loginObserver, String str, Object... objArr) {
        if (str.hashCode() == -1791925260) {
            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/init/loginbar/LoginObserver");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        try {
            FragmentActivity activity = fragment.getActivity();
            String config = OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "remove_login_bar_in_sdk_page", "false");
            if (!isLoginPage(activity)) {
                LoginBarController.removeLoginBar(R.id.tbTabFragment, activity, false);
            } else if ("true".equals(config)) {
                LoginBarController.removeLoginBar(R.id.tbTabFragment, activity, false);
            }
            if (fragment.toString().contains("HomepageFragment") || fragment.toString().contains("HomeFragment")) {
                if (PopJSBridge.homepageFirstResumed == null) {
                    PopJSBridge.homepageFirstResumed = Boolean.TRUE;
                }
                if (!Login.checkSessionValid() && TextUtils.isEmpty(Login.getLoginToken())) {
                    try {
                        String config2 = OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, LoginSwitch.WEAK_REFERENCE_HOME_ACT, "true");
                        String str = this.TAG;
                        LoginTLogAdapter.e(str, "weak_reference_home_act weakOpen:" + config2);
                        if (TextUtils.equals("true", config2) && activity != null) {
                            if (activity.getComponentName() != null) {
                                String str2 = this.TAG;
                                LoginTLogAdapter.e(str2, "weak_reference_home_act:" + activity.getComponentName().getShortClassName());
                            }
                            LoginBarController.sWeakReference = new WeakReference<>(activity);
                        }
                    } catch (Exception e) {
                        LoginTLogAdapter.e(this.TAG, "weak_reference_home_act fail:", e);
                    }
                    LoginBarController.addLoginBar(R.id.tbTabFragment, activity, fragmentManager);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean isLoginPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("781b82ab", new Object[]{this, activity})).booleanValue();
        }
        String currentActivityName = getCurrentActivityName(activity);
        return "com.ali.user.mobile.login.ui.UserLoginActivity".equals(currentActivityName) || "com.taobao.login4android.membercenter.account.LogoutPanelActivity".equals(currentActivityName) || "com.ali.user.mobile.webview.WebViewActivity".equals(currentActivityName);
    }
}
