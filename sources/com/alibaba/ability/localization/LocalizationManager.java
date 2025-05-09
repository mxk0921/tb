package com.alibaba.ability.localization;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.njg;
import tb.sm8;
import tb.t2o;
import tb.tah;
import tb.uah;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LocalizationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2073a;
    public static Application b;
    public static final LocalizationManager INSTANCE = new LocalizationManager();
    public static final Object c = new Object();
    public static final njg d = kotlin.a.b(LocalizationManager$systemLocale$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            LocalizationManager.INSTANCE.a(activity, Localization.h());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    static {
        t2o.a(82837514);
    }

    @JvmStatic
    public static final void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        synchronized (c) {
            try {
                if (!f2073a) {
                    f2073a = true;
                    b = application;
                    Language h = Localization.h();
                    LocalizationManager localizationManager = INSTANCE;
                    if (!h.compare$Localization_release(localizationManager.d())) {
                        localizationManager.a(application, h);
                    }
                    if (application != null) {
                        application.registerActivityLifecycleCallbacks(new a());
                        xhv xhvVar = xhv.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JvmStatic
    public static final void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd1777e", new Object[]{context});
        } else {
            INSTANCE.i(context, Localization.h());
        }
    }

    public final void a(Context context, Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7996b5", new Object[]{this, context, language});
            return;
        }
        ckf.g(language, LoggingSPCache.STORAGE_LANGUAGE);
        try {
            g(language);
            i(context, language);
        } catch (Exception e) {
            TLog.loge(Localization.LOG_MODULE, "LocalizationManager", "change language error: " + e.getMessage());
        }
    }

    public final Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cb7c7eca", new Object[]{this});
        }
        Application application = b;
        if (application != null) {
            return application;
        }
        try {
            TaobaoApplication taobaoApplication = TaobaoApplication.sApplication;
            if (taobaoApplication != null) {
                return taobaoApplication;
            }
            return c();
        } catch (Throwable th) {
            TLog.loge(Localization.LOG_MODULE, "LocalizationManager", "getApplication error: " + th.getMessage());
            return null;
        }
    }

    public final Locale d() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("396ce565", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (Locale) value;
    }

    public final boolean f(Context context, Language language) {
        Resources resources;
        Configuration configuration;
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ace3d2", new Object[]{this, context, language})).booleanValue();
        }
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null) {
            return false;
        }
        return !language.compare$Localization_release(locale);
    }

    public final void i(Context context, Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274290fa", new Object[]{this, context, language});
            return;
        }
        ckf.g(language, LoggingSPCache.STORAGE_LANGUAGE);
        if (context != null && f(context, language)) {
            Locale locale = new Locale(language.getLanguage(), language.getCountry());
            Resources resources = context.getResources();
            Configuration configuration = resources != null ? resources.getConfiguration() : null;
            if (configuration != null) {
                configuration.setLocale(locale);
            }
            if (resources != null) {
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
            TLog.logd(Localization.LOG_MODULE, "LocalizationManager", "update locale, context: " + context.getClass().getName() + ", locale: " + locale.toLanguageTag());
        }
    }

    public final Application c() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            ckf.f(declaredMethod, "activityThread.getDeclar…(\"currentActivityThread\")");
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            ckf.f(declaredField, "activityThread.getDeclar…ld(\"mInitialApplication\")");
            declaredField.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            ckf.f(invoke, "currentActivityThread.invoke(null)");
            Object obj = declaredField.get(invoke);
            ckf.f(obj, "mInitialApplication.get(current)");
            if (!(obj instanceof Application)) {
                obj = null;
            }
            return (Application) obj;
        } catch (Throwable th) {
            TLog.loge(Localization.LOG_MODULE, "LocalizationManager", "get system app error: ".concat(sm8.b(th)));
            return null;
        }
    }

    public final void g(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c22e60", new Object[]{this, language});
        } else if (!language.compare$Localization_release(Locale.getDefault())) {
            Locale locale = new Locale(language.getLanguage(), language.getCountry());
            Locale.setDefault(locale);
            if (Build.VERSION.SDK_INT >= 24) {
                uah.a();
                LocaleList.setDefault(tah.a(new Locale[]{locale}));
            }
            TLog.logd(Localization.LOG_MODULE, "LocalizationManager", "update default locale: " + locale.toLanguageTag());
        }
    }
}
