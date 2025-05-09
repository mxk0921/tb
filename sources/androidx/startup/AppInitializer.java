package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.r8u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AppInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SECTION_NAME = "Startup";
    private static volatile AppInitializer sInstance;
    private static final Object sLock = new Object();
    public final Context mContext;
    public final Set<Class<? extends Initializer<?>>> mDiscovered = new HashSet();
    public final Map<Class<?>, Object> mInitialized = new HashMap();

    public AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static AppInitializer getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInitializer) ipChange.ipc$dispatch("679a596e", new Object[]{context});
        }
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new AppInitializer(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static void setDelegate(AppInitializer appInitializer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774854fa", new Object[]{appInitializer});
            return;
        }
        synchronized (sLock) {
            sInstance = appInitializer;
        }
    }

    public void discoverAndInitialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27740e5", new Object[]{this});
            return;
        }
        try {
            try {
                r8u.a(SECTION_NAME);
                discoverAndInitialize(this.mContext.getPackageManager().getProviderInfo(new ComponentName(this.mContext.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } finally {
            r8u.b();
        }
    }

    public <T> T doInitialize(Class<? extends Initializer<?>> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9c583297", new Object[]{this, cls});
        }
        synchronized (sLock) {
            try {
                t = (T) this.mInitialized.get(cls);
                if (t == null) {
                    t = (T) doInitialize(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f28cb5e9", new Object[]{this, cls});
        }
        return (T) doInitialize(cls);
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14ab63a1", new Object[]{this, cls})).booleanValue();
        }
        return this.mDiscovered.contains(cls);
    }

    private <T> T doInitialize(Class<? extends Initializer<?>> cls, Set<Class<?>> set) {
        T t;
        if (r8u.d()) {
            try {
                r8u.a(cls.getSimpleName());
            } catch (Throwable th) {
                r8u.b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.mInitialized.containsKey(cls)) {
                set.add(cls);
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends Initializer<?>>> dependencies = initializer.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : dependencies) {
                        if (!this.mInitialized.containsKey(cls2)) {
                            doInitialize(cls2, set);
                        }
                    }
                }
                t = (T) initializer.create(this.mContext);
                set.remove(cls);
                this.mInitialized.put(cls, t);
            } else {
                t = (T) this.mInitialized.get(cls);
            }
            r8u.b();
            return t;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void discoverAndInitialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada8e7cf", new Object[]{this, bundle});
            return;
        }
        String string = this.mContext.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            this.mDiscovered.add(cls);
                        }
                    }
                }
                for (Class<? extends Initializer<?>> cls2 : this.mDiscovered) {
                    doInitialize(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }
}
