package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AppCompatDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    public static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;
    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    public static final String TAG = "AppCompatDelegate";
    public static SerialExecutor sSerialExecutorForLocalesStorage = new SerialExecutor(new ThreadPerTaskExecutor());
    private static int sDefaultNightMode = -100;
    private static LocaleListCompat sRequestedAppLocales = null;
    private static LocaleListCompat sStoredAppLocales = null;
    private static Boolean sIsAutoStoreLocalesOptedIn = null;
    private static boolean sIsFrameworkSyncChecked = false;
    private static final ArraySet<WeakReference<AppCompatDelegate>> sActivityDelegates = new ArraySet<>();
    private static final Object sActivityDelegatesLock = new Object();
    private static final Object sAppLocalesStorageSyncLock = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static LocaleList localeListForLanguageTags(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("3b37f301", new Object[]{str});
            }
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static LocaleList localeManagerGetApplicationLocales(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("179f7c7d", new Object[]{obj});
            }
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void localeManagerSetApplicationLocales(Object obj, LocaleList localeList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("412debc3", new Object[]{obj, localeList});
            } else {
                ((LocaleManager) obj).setApplicationLocales(localeList);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface NightMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SerialExecutor implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Runnable mActive;
        public final Executor mExecutor;
        private final Object mLock = new Object();
        public final Queue<Runnable> mTasks = new ArrayDeque();

        public SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$execute$0(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f261ba9", new Object[]{this, runnable});
                return;
            }
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            synchronized (this.mLock) {
                try {
                    this.mTasks.add(new Runnable() { // from class: tb.g31
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppCompatDelegate.SerialExecutor.this.lambda$execute$0(runnable);
                        }
                    });
                    if (this.mActive == null) {
                        scheduleNext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void scheduleNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
                return;
            }
            synchronized (this.mLock) {
                try {
                    Runnable poll = this.mTasks.poll();
                    this.mActive = poll;
                    if (poll != null) {
                        this.mExecutor.execute(poll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ThreadPerTaskExecutor implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                new Thread(runnable).start();
            }
        }
    }

    public static void addActiveDelegate(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c291489a", new Object[]{appCompatDelegate});
            return;
        }
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActivityDelegates.add(new WeakReference<>(appCompatDelegate));
        }
    }

    private static void applyDayNightToActiveDelegates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3140afea", new Object[0]);
            return;
        }
        synchronized (sActivityDelegatesLock) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate = it.next().get();
                    if (appCompatDelegate != null) {
                        appCompatDelegate.applyDayNight();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void applyLocalesToActiveDelegates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea7fe9", new Object[0]);
            return;
        }
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null) {
                appCompatDelegate.applyAppLocales();
            }
        }
    }

    public static AppCompatDelegate create(Activity activity, AppCompatCallback appCompatCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatDelegate) ipChange.ipc$dispatch("da3f0301", new Object[]{activity, appCompatCallback}) : new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static LocaleListCompat getApplicationLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("5900d7dc", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
        } else {
            LocaleListCompat localeListCompat = sRequestedAppLocales;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ff06c8a", new Object[0])).intValue();
        }
        return sDefaultNightMode;
    }

    public static Object getLocaleManagerForApplication() {
        Context contextForDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eef185a7", new Object[0]);
        }
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    public static LocaleListCompat getRequestedAppLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("d7bdc60d", new Object[0]);
        }
        return sRequestedAppLocales;
    }

    public static LocaleListCompat getStoredAppLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("1a815dee", new Object[0]);
        }
        return sStoredAppLocales;
    }

    public static boolean isAutoStorageOptedIn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f18aa90", new Object[]{context})).booleanValue();
        }
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                sIsAutoStoreLocalesOptedIn = Boolean.FALSE;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8935fb80", new Object[0])).booleanValue();
        }
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asyncExecuteSyncRequestedAndStoredLocales$0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d520b39", new Object[]{context});
        } else {
            syncRequestedAndStoredLocales(context);
        }
    }

    public static void removeActivityDelegate(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f446", new Object[]{appCompatDelegate});
            return;
        }
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    private static void removeDelegateFromActives(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcb8ba8", new Object[]{appCompatDelegate});
            return;
        }
        synchronized (sActivityDelegatesLock) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = it.next().get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void resetStaticRequestedAndStoredLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fac597", new Object[0]);
            return;
        }
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    public static void setApplicationLocales(LocaleListCompat localeListCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ea13d4", new Object[]{localeListCompat});
            return;
        }
        Objects.requireNonNull(localeListCompat);
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                Api33Impl.localeManagerSetApplicationLocales(localeManagerForApplication, Api24Impl.localeListForLanguageTags(localeListCompat.toLanguageTags()));
            }
        } else if (!localeListCompat.equals(sRequestedAppLocales)) {
            synchronized (sActivityDelegatesLock) {
                sRequestedAppLocales = localeListCompat;
                applyLocalesToActiveDelegates();
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4c1aa0", new Object[]{new Boolean(z)});
        } else {
            VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
        }
    }

    public static void setDefaultNightMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e304bc0", new Object[]{new Integer(i)});
        } else if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && sDefaultNightMode != i) {
            sDefaultNightMode = i;
            applyDayNightToActiveDelegates();
        }
    }

    public static void setIsAutoStoreLocalesOptedIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad3f7a9", new Object[]{new Boolean(z)});
        } else {
            sIsAutoStoreLocalesOptedIn = Boolean.valueOf(z);
        }
    }

    public static void syncRequestedAndStoredLocales(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82dfd8f", new Object[]{context});
        } else if (isAutoStorageOptedIn(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (sAppLocalesStorageSyncLock) {
                    try {
                        LocaleListCompat localeListCompat = sRequestedAppLocales;
                        if (localeListCompat == null) {
                            if (sStoredAppLocales == null) {
                                sStoredAppLocales = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                            }
                            if (!sStoredAppLocales.isEmpty()) {
                                sRequestedAppLocales = sStoredAppLocales;
                            }
                        } else if (!localeListCompat.equals(sStoredAppLocales)) {
                            LocaleListCompat localeListCompat2 = sRequestedAppLocales;
                            sStoredAppLocales = localeListCompat2;
                            AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!sIsFrameworkSyncChecked) {
                sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: tb.e31
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                    }
                });
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public boolean applyAppLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b7e391", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract boolean applyDayNight();

    public void asyncExecuteSyncRequestedAndStoredLocales(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c211c8", new Object[]{this, context});
        } else {
            sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: tb.f31
                @Override // java.lang.Runnable
                public final void run() {
                    AppCompatDelegate.lambda$asyncExecuteSyncRequestedAndStoredLocales$0(context);
                }
            });
        }
    }

    @Deprecated
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
        } else {
            acq.B(context);
        }
    }

    public Context attachBaseContext2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d8966d80", new Object[]{this, context});
        }
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i);

    public Context getContextForDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4fc88334", new Object[]{this});
        }
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9328bd20", new Object[]{this})).intValue();
        }
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e59f4d3", new Object[]{this, onBackInvokedDispatcher});
        }
    }

    public abstract void setSupportActionBar(Toolbar toolbar);

    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void setTitle(CharSequence charSequence);

    public abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appCompatCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatDelegate) ipChange.ipc$dispatch("6370e57a", new Object[]{dialog, appCompatCallback}) : new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69f805f", new Object[]{context});
            return;
        }
        syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    public static void syncLocalesToFramework(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7908e9c", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (getApplicationLocales().isEmpty()) {
                    String readLocales = AppLocalesStorageHelper.readLocales(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        Api33Impl.localeManagerSetApplicationLocales(systemService, Api24Impl.localeListForLanguageTags(readLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static AppCompatDelegate create(Context context, Window window, AppCompatCallback appCompatCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatDelegate) ipChange.ipc$dispatch("c3d5ad14", new Object[]{context, window, appCompatCallback}) : new AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    public static AppCompatDelegate create(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatDelegate) ipChange.ipc$dispatch("fb8d7b1f", new Object[]{context, activity, appCompatCallback}) : new AppCompatDelegateImpl(context, activity, appCompatCallback);
    }
}
