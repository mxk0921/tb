package com.taobao.android.launcher.biz.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.taobaocompat.lifecycle.AppForgroundObserver;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.mss;
import tb.obk;
import tb.wcm;
import tb.whv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitLifeCycle extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<d> f8139a;

        public b(d dVar) {
            this.f8139a = new WeakReference<>(dVar);
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                d dVar = this.f8139a.get();
                if (dVar != null) {
                    String config = OrangeConfig.getInstance().getConfig(d.ORANGE_NAMESPACE, d.ORANGE_NOT_TRACK_BLACKLIST, d.ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE);
                    dVar.d(config != null ? Arrays.asList(config.split(",")) : null);
                }
            } catch (Throwable th) {
                Log.e("BOCUpdateListener", "onConfigUpdate error: " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "UnifiedCompatCrossLifecycle";

        /* renamed from: a  reason: collision with root package name */
        public final AppForgroundObserver f8140a = new AppForgroundObserver();
        public final LoginCrossAppLifeCycle b = new LoginCrossAppLifeCycle(null);
        public final boolean c;

        public c(Context context) {
            this.c = !ABGlobal.isFeatureOpened(context, "removeInjectOff");
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            if (!this.c) {
                TBMainHost.b().c(activity);
            }
            this.b.b(activity);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            } else {
                this.b.c(activity);
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
                return;
            }
            this.b.d(activity);
            this.f8140a.onStarted(activity);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            } else {
                this.f8140a.onStopped(activity);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ORANGE_NAMESPACE = "page_view_track";
        public static final String ORANGE_NOT_TRACK_BLACKLIST = "not_track_blacklist";
        public static final String ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE = null;
        public static final String TAG = "UnifiedCompatLifecycle";

        /* renamed from: a  reason: collision with root package name */
        public final whv f8141a = new whv();
        public final List<String> b = new CopyOnWriteArrayList();

        public d() {
            a();
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 1095289988) {
                super.onActivityDestroyed((Activity) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLifeCycle$UnifiedCompatLifecycle");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c59f3fb0", new Object[]{this});
                return;
            }
            try {
                b();
                String config = OrangeConfig.getInstance().getConfig(ORANGE_NAMESPACE, ORANGE_NOT_TRACK_BLACKLIST, ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE);
                d(config != null ? Arrays.asList(config.split(",")) : null);
            } catch (Throwable th) {
                Log.e(TAG, "initBlackListInUtNotTrack error: " + th.toString());
            }
        }

        public final boolean c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afc09bac", new Object[]{this, activity})).booleanValue();
            }
            try {
                if (!((CopyOnWriteArrayList) this.b).isEmpty() && activity != null) {
                    return ((CopyOnWriteArrayList) this.b).contains(activity.getClass().getCanonicalName());
                }
                return false;
            } catch (Throwable th) {
                Log.e(TAG, "isBlackListInUtNotTrack error: " + th.toString());
                return false;
            }
        }

        public void d(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a2afd7b", new Object[]{this, list});
                return;
            }
            this.b.clear();
            if (list != null) {
                this.b.addAll(list);
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                this.f8141a.a(activity, bundle);
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                super.onActivityDestroyed(activity);
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            if ((!(activity instanceof IUtActivityNotTrack) || c(activity)) && !activity.getLocalClassName().equals("com.taobao.ju.android.ui.main.TabMainActivity")) {
                try {
                    UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
                } catch (Throwable unused) {
                    Log.e(TAG, "onActivityPaused(): easytrace don't work!");
                }
            }
            try {
                wcm.d(activity);
            } catch (Throwable unused2) {
                Log.e(TAG, "onActivityPaused(): PopCenter pause error");
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            if ((!(activity instanceof IUtActivityNotTrack) || c(activity)) && !activity.getLocalClassName().equals("com.taobao.ju.android.ui.main.TabMainActivity")) {
                try {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity);
                } catch (Throwable unused) {
                    Log.e(TAG, "onActivityResumed(): easytrace don't work!");
                }
            }
            try {
                wcm.f(activity);
            } catch (Throwable unused2) {
                Log.e(TAG, "onActivityResumed(): PopCenter resume error");
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ff7c2a2", new Object[]{this});
            } else {
                OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, new b(this), true);
            }
        }
    }

    public InitLifeCycle(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(InitLifeCycle initLifeCycle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLifeCycle");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        PanguApplication panguApplication = (PanguApplication) application;
        panguApplication.registerCrossActivityLifecycleCallback(new c(application));
        panguApplication.registerActivityLifecycleCallbacks(new d());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LoginCrossAppLifeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f8137a;
        public final boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class LoginBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public LoginBroadcastReceiver() {
            }

            public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLifeCycle$LoginCrossAppLifeCycle$LoginBroadcastReceiver");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if ((i == 1 || i == 2) && LoginCrossAppLifeCycle.a(LoginCrossAppLifeCycle.this)) {
                        LoginCrossAppLifeCycle.this.getClass();
                    }
                }
            }
        }

        public LoginCrossAppLifeCycle() {
            this.b = false;
        }

        public static /* synthetic */ boolean a(LoginCrossAppLifeCycle loginCrossAppLifeCycle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26256b0c", new Object[]{loginCrossAppLifeCycle})).booleanValue();
            }
            return loginCrossAppLifeCycle.b;
        }

        public void b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            if (this.f8137a == null) {
                this.f8137a = new LoginBroadcastReceiver();
            }
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.f8137a);
        }

        public void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            } else if (this.f8137a != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.f8137a);
            }
        }

        public void d(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            }
        }

        public /* synthetic */ LoginCrossAppLifeCycle(a aVar) {
            this();
        }
    }
}
