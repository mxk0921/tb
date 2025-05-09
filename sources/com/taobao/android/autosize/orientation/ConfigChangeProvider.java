package com.taobao.android.autosize.orientation;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import tb.g1a;
import tb.ig4;
import tb.u1a;
import tb.w1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConfigChangeProvider implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DATA_SOURCE_ACTIVITY = 1;
    public static final int DATA_SOURCE_APPLICATION = 4;
    public static final int DATA_SOURCE_SUPPORT_FRAGMENT = 3;
    public static final int DATA_SOURCE_SUPPORT_FRAGMENT_V4 = 2;

    /* renamed from: a  reason: collision with root package name */
    public w1a<Activity, Configuration, Integer, Void> f6424a;
    public final Map<Activity, ConfigChangeObserver> b = new HashMap();
    public final Map<Activity, ComponentCallbacks> c = new HashMap();
    public final Map<Activity, ConfigChangeObserverSupportV4> d = new HashMap();
    public boolean e = true;
    public final w1a<Activity, Configuration, Integer, Void> f = new a();
    public boolean g = true;
    public final u1a<Activity, Boolean, Void> h = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ConfigChangeObserverSupportV4 extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public w1a<Activity, Configuration, Integer, Void> f6426a;
        public u1a<Activity, Boolean, Void> c;

        public static /* synthetic */ Object ipc$super(ConfigChangeObserverSupportV4 configChangeObserverSupportV4, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1749129850) {
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            } else if (hashCode == -349229044) {
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/autosize/orientation/ConfigChangeProvider$ConfigChangeObserverSupportV4");
            }
        }

        @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserverSupportV4 onConfigurationChanged: " + configuration);
            super.onConfigurationChanged(configuration);
            if (this.f6426a != null) {
                this.f6426a.invoke(getActivity(), configuration, 2);
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onMultiWindowModeChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97be6586", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserverSupportV4 onMultiWindowModeChanged: " + z);
            super.onMultiWindowModeChanged(z);
            u1a<Activity, Boolean, Void> u1aVar = this.c;
            if (u1aVar != null) {
                u1aVar.invoke(getActivity(), Boolean.valueOf(z));
            }
        }

        public void p2(w1a<Activity, Configuration, Integer, Void> w1aVar, u1a<Activity, Boolean, Void> u1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21f64256", new Object[]{this, w1aVar, u1aVar});
                return;
            }
            this.f6426a = w1aVar;
            this.c = u1aVar;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface DataSourceType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements w1a<Activity, Configuration, Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.autosize.orientation.ConfigChangeProvider$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0335a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0335a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ConfigChangeProvider.c(ConfigChangeProvider.this, true);
                }
            }
        }

        public a() {
        }

        /* renamed from: a */
        public Void invoke(Activity activity, Configuration configuration, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("e2a1d725", new Object[]{this, activity, configuration, num});
            }
            TLog.loge("TBAutoSize.ConfObserver", "activity=" + activity + " newConfig=" + configuration);
            if (ConfigChangeProvider.a(ConfigChangeProvider.this) == null) {
                TLog.loge("TBAutoSize.ConfObserver", "configListener is null. skip notify.");
                return null;
            }
            if (ig4.m().x()) {
                ConfigChangeProvider.a(ConfigChangeProvider.this).invoke(activity, configuration, num);
            } else if (ConfigChangeProvider.b(ConfigChangeProvider.this)) {
                ConfigChangeProvider.a(ConfigChangeProvider.this).invoke(activity, configuration, num);
                ConfigChangeProvider.c(ConfigChangeProvider.this, false);
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC0335a());
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements u1a<Activity, Boolean, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ConfigChangeProvider.e(ConfigChangeProvider.this, true);
                }
            }
        }

        public b() {
        }

        /* renamed from: a */
        public Void invoke(Activity activity, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("57cc4e1", new Object[]{this, activity, bool});
            }
            Objects.toString(activity);
            if (!ConfigChangeProvider.d(ConfigChangeProvider.this) || ConfigChangeProvider.f(ConfigChangeProvider.this) == null) {
                return null;
            }
            ConfigChangeProvider.f(ConfigChangeProvider.this).invoke(bool);
            ConfigChangeProvider.e(ConfigChangeProvider.this, false);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a());
            TLog.loge("TBAutoSize.ConfObserver", "activity=" + activity + " isInMultiWindowMode=" + bool);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6431a;

        public c(Activity activity) {
            this.f6431a = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else {
                ConfigChangeProvider.g(ConfigChangeProvider.this).invoke(this.f6431a, configuration, 1);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ConfigChangeProvider f6432a = new ConfigChangeProvider();

        public static /* synthetic */ ConfigChangeProvider a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigChangeProvider) ipChange.ipc$dispatch("a34123fc", new Object[0]);
            }
            return f6432a;
        }
    }

    public static /* synthetic */ w1a a(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("e914f3e2", new Object[]{configChangeProvider});
        }
        return configChangeProvider.f6424a;
    }

    public static /* synthetic */ boolean b(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("523bc33d", new Object[]{configChangeProvider})).booleanValue();
        }
        return configChangeProvider.e;
    }

    public static /* synthetic */ boolean c(ConfigChangeProvider configChangeProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e194f7d", new Object[]{configChangeProvider, new Boolean(z)})).booleanValue();
        }
        configChangeProvider.e = z;
        return z;
    }

    public static /* synthetic */ boolean d(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("438d52be", new Object[]{configChangeProvider})).booleanValue();
        }
        return configChangeProvider.g;
    }

    public static /* synthetic */ boolean e(ConfigChangeProvider configChangeProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f9b01c", new Object[]{configChangeProvider, new Boolean(z)})).booleanValue();
        }
        configChangeProvider.g = z;
        return z;
    }

    public static /* synthetic */ g1a f(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("12bb34c1", new Object[]{configChangeProvider});
        }
        configChangeProvider.getClass();
        return null;
    }

    public static /* synthetic */ w1a g(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("83d4b5bd", new Object[]{configChangeProvider});
        }
        return configChangeProvider.f;
    }

    public static ConfigChangeProvider i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigChangeProvider) ipChange.ipc$dispatch("15d616c5", new Object[0]);
        }
        return d.a();
    }

    public void h(w1a<Activity, Configuration, Integer, Void> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a440a2", new Object[]{this, w1aVar});
        } else {
            this.f6424a = w1aVar;
        }
    }

    public void j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (ig4.m().F()) {
            c cVar = new c(activity);
            activity.registerComponentCallbacks(cVar);
            ((HashMap) this.c).put(activity, cVar);
        }
        if (activity instanceof FragmentActivity) {
            ConfigChangeObserverSupportV4 configChangeObserverSupportV4 = new ConfigChangeObserverSupportV4();
            configChangeObserverSupportV4.p2(this.f, this.h);
            ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().add(configChangeObserverSupportV4, "TBAutoSize.ConfigChangeObserver").commitAllowingStateLoss();
            ((HashMap) this.d).put(activity, configChangeObserverSupportV4);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ConfigChangeObserver configChangeObserver = new ConfigChangeObserver();
        configChangeObserver.a(this.f, this.h);
        fragmentManager.beginTransaction().add(configChangeObserver, "TBAutoSize.ConfigChangeObserver").commitAllowingStateLoss();
        ((HashMap) this.b).put(activity, configChangeObserver);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ComponentCallbacks componentCallbacks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (ig4.m().F() && (componentCallbacks = (ComponentCallbacks) ((HashMap) this.c).remove(activity)) != null) {
            activity.unregisterComponentCallbacks(componentCallbacks);
        }
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            ConfigChangeObserverSupportV4 configChangeObserverSupportV4 = (ConfigChangeObserverSupportV4) ((HashMap) this.d).remove(activity);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (configChangeObserverSupportV4 != null && supportFragmentManager != null) {
                supportFragmentManager.beginTransaction().remove(configChangeObserverSupportV4).commitAllowingStateLoss();
                return;
            }
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ConfigChangeObserver configChangeObserver = (ConfigChangeObserver) ((HashMap) this.b).remove(activity);
        if (configChangeObserver != null && fragmentManager != null) {
            fragmentManager.beginTransaction().remove(configChangeObserver).commitAllowingStateLoss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ConfigChangeObserver extends android.app.Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public w1a<Activity, Configuration, Integer, Void> f6425a;
        public u1a<Activity, Boolean, Void> b;

        public static /* synthetic */ Object ipc$super(ConfigChangeObserver configChangeObserver, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1749129850) {
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            } else if (hashCode == -349229044) {
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            } else if (hashCode == 1918621354) {
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue(), (Configuration) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/autosize/orientation/ConfigChangeProvider$ConfigChangeObserver");
            }
        }

        public void a(w1a<Activity, Configuration, Integer, Void> w1aVar, u1a<Activity, Boolean, Void> u1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21f64256", new Object[]{this, w1aVar, u1aVar});
                return;
            }
            this.f6425a = w1aVar;
            this.b = u1aVar;
        }

        @Override // android.app.Fragment, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserver onConfigurationChanged: " + configuration);
            super.onConfigurationChanged(configuration);
            if (this.f6425a != null) {
                this.f6425a.invoke(getActivity(), configuration, 3);
            }
        }

        @Override // android.app.Fragment
        public void onMultiWindowModeChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97be6586", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserver onMultiWindowModeChanged: " + z);
            super.onMultiWindowModeChanged(z);
            u1a<Activity, Boolean, Void> u1aVar = this.b;
            if (u1aVar != null) {
                u1aVar.invoke(getActivity(), Boolean.valueOf(z));
            }
        }

        @Override // android.app.Fragment
        public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            } else {
                super.onMultiWindowModeChanged(z, configuration);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
