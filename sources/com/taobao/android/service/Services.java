package com.taobao.android.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.StrictMode;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import tb.bph;
import tb.q2i;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Services {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long KServiceConnectionTimeout = 10000;
    private static final String TAG = "Services";
    private static volatile boolean sRecyclerSetup;
    private static final Thread sMainThread = Looper.getMainLooper().getThread();
    private static final Map<String, ComponentName> mResolvedServiceCache = new ConcurrentHashMap();
    private static final Map<Activity, List<ServiceConnection>> sManagedServiceConnections = new HashMap();
    private static final Object sRecyclerSetupLock = new Object();
    private static final ComponentName KNullCompName = new ComponentName("", "");

    static {
        t2o.a(578814115);
    }

    private static <T extends IInterface> T asInterface(IBinder iBinder, Class<T> cls) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (iBinder == null) {
            return null;
        }
        T t = (T) iBinder.queryLocalInterface(cls.getName());
        if (t != null) {
            return t;
        }
        return (T) ((IInterface) Class.forName(cls.getName().concat("$Stub"), false, cls.getClassLoader()).getMethod("asInterface", IBinder.class).invoke(null, iBinder));
    }

    public static <T extends IInterface> boolean bind(Context context, Class<T> cls, ServiceConnection serviceConnection) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e2d0c6f", new Object[]{context, cls, serviceConnection})).booleanValue();
        }
        Intent buildServiceIntent = buildServiceIntent(context, cls);
        if (buildServiceIntent == null) {
            bph.d(TAG, "No matched service for ".concat(cls.getName()));
            return false;
        } else if (!LocalAidlServices.c(serviceConnection)) {
            try {
                if (!LocalAidlServices.b(context, buildServiceIntent, serviceConnection)) {
                    if (!context.bindService(buildServiceIntent, serviceConnection, 1)) {
                        z = false;
                    }
                }
                return z;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        } else {
            throw new RuntimeException("Call bind() with same ServiceConnection instance");
        }
    }

    private static Intent buildServiceIntent(Context context, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("23efad54", new Object[]{context, cls});
        }
        String intern = cls.getName().intern();
        Intent intent = new Intent(intern);
        if (context == null) {
            bph.d(TAG, "Context shouldn't null");
            return null;
        }
        intent.setPackage(context.getPackageName());
        Map<String, ComponentName> map = mResolvedServiceCache;
        ComponentName componentName = map.get(intern);
        ComponentName componentName2 = KNullCompName;
        if (componentName == componentName2) {
            return null;
        }
        if (componentName == null) {
            ComponentName resolveServiceIntent = resolveServiceIntent(context, intent);
            if (resolveServiceIntent == null) {
                componentName = componentName2;
            } else {
                componentName = resolveServiceIntent;
            }
            map.put(intern, componentName);
        }
        intent.setComponent(componentName);
        return intent;
    }

    public static void cleanupOnActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe9a040", new Object[]{activity});
            return;
        }
        List<ServiceConnection> remove = sManagedServiceConnections.remove(activity);
        if (!(remove == null || remove.isEmpty())) {
            for (ServiceConnection serviceConnection : remove) {
                try {
                    unbind(activity, serviceConnection);
                } catch (RuntimeException e) {
                    bph.e(TAG, "Failed to unbind service: " + serviceConnection, e);
                }
            }
        }
    }

    private static void ensureRecyclerSetup(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a748741", new Object[]{context});
        } else if (!sRecyclerSetup) {
            synchronized (sRecyclerSetupLock) {
                try {
                    if (!sRecyclerSetup) {
                        findApplication(context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.service.Services.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityCreated(Activity activity, Bundle bundle) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityDestroyed(Activity activity) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                                } else {
                                    Services.cleanupOnActivityDestroyed(activity);
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityPaused(Activity activity) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityResumed(Activity activity) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStarted(Activity activity) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public void onActivityStopped(Activity activity) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                                }
                            }
                        });
                        sRecyclerSetup = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static boolean equal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84216553", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    private static Activity findActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b8aa660f", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static Application findApplication(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("e3af6c79", new Object[]{context});
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        if (context instanceof ContextWrapper) {
            return findApplication(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    public static <T extends IInterface> T get(Activity activity, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((IInterface) ipChange.ipc$dispatch("369d6e4", new Object[]{activity, cls})) : (T) get((Context) activity, (Class<IInterface>) cls);
    }

    private static ComponentName resolveServiceIntent(Context context, Intent intent) {
        List<ResolveInfo> queryIntentServices;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("31ba27b8", new Object[]{context, intent});
        }
        if (context == null || (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) == null || queryIntentServices.isEmpty()) {
            return null;
        }
        if (queryIntentServices.size() > 1) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    StringBuilder sb = new StringBuilder("Find one more, use >> ");
                    sb.append(serviceInfo.packageName);
                    sb.append("/");
                    sb.append(serviceInfo.name);
                    return new ComponentName(serviceInfo.packageName, serviceInfo.name.intern());
                }
            }
            StringBuilder sb2 = new StringBuilder("Resolve more than one service for ");
            sb2.append(intent.getAction());
            sb2.append(" [p:");
            sb2.append(context.getPackageName());
            sb2.append("] ");
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                if (resolveInfo2.serviceInfo != null) {
                    sb2.append(">> ");
                    sb2.append(resolveInfo2.serviceInfo.packageName);
                    sb2.append("/");
                    sb2.append(resolveInfo2.serviceInfo.name);
                }
            }
            throw new IllegalStateException(sb2.toString());
        }
        ServiceInfo serviceInfo2 = queryIntentServices.get(0).serviceInfo;
        StringBuilder sb3 = new StringBuilder(">> ");
        sb3.append(serviceInfo2.packageName);
        sb3.append("/");
        sb3.append(serviceInfo2.name);
        return new ComponentName(serviceInfo2.packageName, serviceInfo2.name.intern());
    }

    public static void setSystemClassloader(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89cdc29", new Object[]{classLoader});
        }
    }

    public static void unbind(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76064659", new Object[]{context, serviceConnection});
        } else if (context != null && !LocalAidlServices.h(context, serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
                serviceConnection.toString();
            }
        }
    }

    @Deprecated
    public static <T extends IInterface> void unget(Context context, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9c1822", new Object[]{context, t});
        } else {
            StrictMode.noteSlowCall("deprecation");
        }
    }

    public static <T extends IInterface> T get(Context context, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((IInterface) ipChange.ipc$dispatch("d5427648", new Object[]{context, cls}));
        }
        if (context == null) {
            throw new IllegalArgumentException("Context is null");
        } else if (cls != null) {
            Intent buildServiceIntent = buildServiceIntent(context, cls);
            if (buildServiceIntent == null) {
                bph.d(TAG, "No matched service for ".concat(cls.getName()));
                return null;
            }
            ensureRecyclerSetup(context);
            q2i q2iVar = new q2i();
            try {
                if (!LocalAidlServices.b(context, buildServiceIntent, q2iVar)) {
                    if (Thread.currentThread() == sMainThread) {
                        throw new IllegalArgumentException("InvocationOnMainThreadException");
                    } else if (!context.bindService(buildServiceIntent, q2iVar, 1)) {
                        bph.d(TAG, "Failed to bind service: ".concat(cls.getName()));
                        try {
                            context.unbindService(q2iVar);
                        } catch (RuntimeException e) {
                            e.toString();
                        }
                        return null;
                    }
                }
                Activity findActivity = findActivity(context);
                if (findActivity != null) {
                    Map<Activity, List<ServiceConnection>> map = sManagedServiceConnections;
                    List<ServiceConnection> list = map.get(findActivity);
                    if (list == null) {
                        list = new ArrayList<>();
                        map.put(findActivity, list);
                    }
                    list.add(q2iVar);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    return (T) asInterface(q2iVar.a(10000L), cls);
                } catch (ClassNotFoundException e2) {
                    bph.d(TAG, "Failed to cast binder to interface, ClassNotFoundException: ".concat(cls.getName()));
                    throw new RuntimeException(e2);
                } catch (IllegalAccessException e3) {
                    bph.d(TAG, "Failed to cast binder to interface, IllegalAccessException: ".concat(cls.getName()));
                    throw new RuntimeException(e3);
                } catch (NoSuchMethodException e4) {
                    bph.d(TAG, "Failed to cast binder to interface, NoSuchMethodException: ".concat(cls.getName()));
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    Throwable targetException = e5.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    throw new RuntimeException(e5);
                }
            } catch (InterruptedException unused2) {
                bph.d(TAG, "Service connection interrupted.");
                return null;
            } catch (TimeoutException unused3) {
                bph.d(TAG, "Service connection timeout: ".concat(cls.getName()));
                return null;
            }
        } else {
            throw new IllegalArgumentException("Service interface is null");
        }
    }
}
