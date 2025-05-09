package com.taobao.login4android.init;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.init.loginbar.LoginObserver;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginLifeCycleInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginInitializer2";
    private static LoginObserver loginObserver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LoginApplifeCycleRegister extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public WeakReference<Activity> mActivity;
        private boolean mIsComeFromOauth;

        static {
            t2o.a(517996589);
        }

        private LoginApplifeCycleRegister() {
            this.mIsComeFromOauth = false;
        }

        public static /* synthetic */ Object ipc$super(LoginApplifeCycleRegister loginApplifeCycleRegister, String str, Object... objArr) {
            if (str.hashCode() == 1049280322) {
                super.onActivityResumed((Activity) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/init/LoginLifeCycleInitializer$LoginApplifeCycleRegister");
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            StringBuilder sb = new StringBuilder("onActivityCreated() called with: activity = [");
            sb.append(activity.getComponentName().getClassName());
            sb.append("], savedInstanceState = [");
            sb.append(bundle);
            sb.append("]");
            checkIsFromOauth(activity);
            try {
                if (TBMainHost.fromActivity(activity) != null && TextUtils.equals(activity.getComponentName().getClassName(), TBMainHost.fromActivity(activity).getName())) {
                    LoginBarController.cacheMainActivity(activity);
                    if (LoginLifeCycleInitializer.access$100() == null) {
                        LoginLifeCycleInitializer.access$102(new LoginObserver());
                    }
                    a.G(LoginLifeCycleInitializer.access$100());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityDestroyed(Activity activity) {
            WeakReference<Activity> weakReference;
            Activity activity2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            if (activity != null && activity.getLocalClassName().contains("UserLoginActivity") && this.mIsComeFromOauth) {
                activity.finish();
                if (this.mIsComeFromOauth && (weakReference = this.mActivity) != null && (activity2 = weakReference.get()) != null && activity2.getLocalClassName().contains("UserLoginActivity")) {
                    this.mIsComeFromOauth = false;
                    activity2.moveTaskToBack(true);
                }
            }
            try {
                if (TBMainHost.fromActivity(activity) != null && TextUtils.equals(activity.getComponentName().getClassName(), TBMainHost.fromActivity(activity).getName()) && LoginLifeCycleInitializer.access$100() != null) {
                    a.a0(LoginLifeCycleInitializer.access$100());
                    LoginLifeCycleInitializer.access$102(null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            if (!this.mIsComeFromOauth) {
                checkIsFromOauth(activity);
            }
            super.onActivityResumed(activity);
        }

        private void checkIsFromOauth(Activity activity) {
            Activity activity2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9ec71b4", new Object[]{this, activity});
                return;
            }
            WeakReference<Activity> weakReference = this.mActivity;
            if (!(weakReference == null || (activity2 = weakReference.get()) == null || ((!activity2.getLocalClassName().equals("com.taobao.browser.BrowserActivity") && !activity2.getLocalClassName().equals("com.taobao.android.auth.AuthEntranceActivity") && !activity2.getLocalClassName().equals("com.taobao.android.auth.AuthActivity")) || !activity.getLocalClassName().contains("UserLoginActivity") || ((TextUtils.isEmpty(LoginStatus.browserRefUrl) || !LoginStatus.browserRefUrl.contains("http://oauth.m.taobao.com/")) && (activity2.getTaskId() <= 0 || activity2.getTaskId() == activity.getTaskId()))))) {
                this.mIsComeFromOauth = true;
            }
            if (!"com.ali.user.mobile.webview.WebViewActivity".equals(activity.getLocalClassName()) && !"com.ali.user.mobile.ui.AliUserVerificationActivity".equals(activity.getLocalClassName()) && !"com.alibaba.security.biometrics.face.auth.FaceLivenessActivity2".equals(activity.getLocalClassName())) {
                this.mActivity = new WeakReference<>(activity);
            }
        }
    }

    static {
        t2o.a(517996587);
    }

    public static /* synthetic */ LoginObserver access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginObserver) ipChange.ipc$dispatch("b813fc12", new Object[0]);
        }
        return loginObserver;
    }

    public static /* synthetic */ LoginObserver access$102(LoginObserver loginObserver2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginObserver) ipChange.ipc$dispatch("fd58b65c", new Object[]{loginObserver2});
        }
        loginObserver = loginObserver2;
        return loginObserver2;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ((PanguApplication) application).registerActivityLifecycleCallbacks(new LoginApplifeCycleRegister());
            Objects.toString(application);
            Objects.toString(hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
