package com.taobao.android.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bph;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LocalAidlServices {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ServiceRecord> f9371a = new HashMap();
    public static final HashMap<ServiceConnection, String> b = new HashMap<>();
    public static final Method c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ServiceRecord extends CopyOnWriteArrayList<ServiceConnection> {
        private static final long serialVersionUID = 1;
        public final Application app;
        public final IBinder binder;
        public final Intent intent;
        public final Service service;

        static {
            t2o.a(578814113);
        }

        public ServiceRecord(Application application, Intent intent, IBinder iBinder, Service service) {
            this.app = application;
            this.intent = intent;
            this.binder = iBinder;
            this.service = service;
        }
    }

    static {
        t2o.a(578814112);
        Method method = null;
        try {
            method = Service.class.getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class, Class.forName(ProcessUtils.ACTIVITY_THREAD), String.class, IBinder.class, Application.class, Object.class);
            method.setAccessible(true);
        } catch (ClassNotFoundException e) {
            Log.e("LocalSvc", "Incompatible ROM", e);
        } catch (NoSuchMethodException e2) {
            Log.e("LocalSvc", "Incompatible ROM", e2);
        }
        c = method;
    }

    public static void a(Context context, Class<? extends Service> cls, Service service, Application application) {
        Method method = c;
        if (method != null) {
            try {
                method.invoke(service, context, null, cls.getName(), null, application, null);
            } catch (IllegalAccessException e) {
                bph.b("LocalSvc", "Unexpected exception when attaching service.", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getTargetException());
            }
        }
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceConnection) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dfc65e2", new Object[]{context, intent, serviceConnection})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null) {
                return false;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            component = new ComponentName(serviceInfo.packageName, serviceInfo.name.intern());
        }
        HashMap hashMap = (HashMap) f9371a;
        ServiceRecord serviceRecord = (ServiceRecord) hashMap.get(component.getClassName());
        if (serviceRecord == null) {
            serviceRecord = d(context, intent, component);
            if (serviceRecord == null) {
                return false;
            }
            hashMap.put(component.getClassName(), serviceRecord);
        }
        serviceRecord.add(serviceConnection);
        b.put(serviceConnection, component.getClassName());
        try {
            serviceConnection.onServiceConnected(component, serviceRecord.binder);
        } catch (RuntimeException e) {
            bph.e("LocalSvc", serviceConnection + ".onServiceConnected()", e);
        }
        return true;
    }

    public static boolean c(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("962f5d30", new Object[]{serviceConnection})).booleanValue();
        }
        if (b.get(serviceConnection) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.service.LocalAidlServices.ServiceRecord d(android.content.Context r6, android.content.Intent r7, android.content.ComponentName r8) throws java.lang.ClassNotFoundException {
        /*
            java.lang.String r0 = "LocalSvc"
            java.lang.String r1 = r8.getClassName()
            java.lang.Class r1 = f(r6, r1)
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.Class<com.taobao.android.service.AidlService> r3 = com.taobao.android.service.AidlService.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.lang.Object r3 = r1.newInstance()     // Catch: IllegalAccessException -> 0x0095, InstantiationException -> 0x0097
            android.app.Service r3 = (android.app.Service) r3     // Catch: IllegalAccessException -> 0x0095, InstantiationException -> 0x0097
            android.app.Application r8 = e(r6)
            a(r6, r1, r3, r8)
            r3.onCreate()     // Catch: RuntimeException -> 0x0028
            goto L_0x003d
        L_0x0028:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r4 = ".onCreate()"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            tb.bph.e(r0, r1, r6)
        L_0x003d:
            android.os.IBinder r6 = r3.onBind(r7)     // Catch: RuntimeException -> 0x005a
            if (r6 != 0) goto L_0x0070
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: RuntimeException -> 0x0058
            r1.<init>()     // Catch: RuntimeException -> 0x0058
            r1.append(r3)     // Catch: RuntimeException -> 0x0058
            java.lang.String r4 = ".onBind() should never return null."
            r1.append(r4)     // Catch: RuntimeException -> 0x0058
            java.lang.String r1 = r1.toString()     // Catch: RuntimeException -> 0x0058
            android.util.Log.e(r0, r1)     // Catch: RuntimeException -> 0x0058
            goto L_0x0070
        L_0x0058:
            r1 = move-exception
            goto L_0x005c
        L_0x005a:
            r1 = move-exception
            r6 = r2
        L_0x005c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = ".onBind()"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            tb.bph.e(r0, r4, r1)
        L_0x0070:
            if (r6 != 0) goto L_0x008c
            r3.onDestroy()     // Catch: RuntimeException -> 0x0076
            goto L_0x008b
        L_0x0076:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = ".onDestroy()"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            tb.bph.e(r0, r7, r6)
        L_0x008b:
            return r2
        L_0x008c:
            g(r8, r3)
            com.taobao.android.service.LocalAidlServices$ServiceRecord r0 = new com.taobao.android.service.LocalAidlServices$ServiceRecord
            r0.<init>(r8, r7, r6, r3)
            return r0
        L_0x0095:
            r6 = move-exception
            goto L_0x0099
        L_0x0097:
            r6 = move-exception
            goto L_0x00b4
        L_0x0099:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Constructor of "
            r7.<init>(r1)
            java.lang.String r8 = r8.getClassName()
            r7.append(r8)
            java.lang.String r8 = " is inaccessible"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            tb.bph.e(r0, r7, r6)
            return r2
        L_0x00b4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to instantiate "
            r7.<init>(r1)
            java.lang.String r8 = r8.getClassName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            tb.bph.e(r0, r7, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.service.LocalAidlServices.d(android.content.Context, android.content.Intent, android.content.ComponentName):com.taobao.android.service.LocalAidlServices$ServiceRecord");
    }

    public static Application e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f8a59e16", new Object[]{context});
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        bph.d("LocalSvc", "Cannot discover application from context " + context);
        return null;
    }

    public static Class<? extends Service> f(Context context, String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("78da9a6f", new Object[]{context, str});
        }
        try {
            if (Services.class.getClassLoader() != null) {
                return Services.class.getClassLoader().loadClass(str);
            }
            return context.getClassLoader().loadClass(str);
        } catch (ClassCastException unused) {
            bph.a("LocalSvc", "Not a Service derived class: " + str);
            return null;
        }
    }

    public static void g(Application application, ComponentCallbacks componentCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78992cc", new Object[]{application, componentCallbacks});
        } else {
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    public static boolean h(Context context, ServiceConnection serviceConnection) {
        ServiceRecord serviceRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c61b386", new Object[]{context, serviceConnection})).booleanValue();
        }
        String remove = b.remove(serviceConnection);
        if (remove == null || (serviceRecord = (ServiceRecord) ((HashMap) f9371a).get(remove)) == null) {
            return false;
        }
        if (!serviceRecord.remove(serviceConnection)) {
            bph.a("LocalSvc", "Internal inconsistency, please report this to the corresponding dev team: " + serviceConnection + " @ " + remove);
        }
        try {
            serviceConnection.onServiceDisconnected(new ComponentName(context.getPackageName(), serviceRecord.service.getClass().getName()));
        } catch (RuntimeException e) {
            bph.e("LocalSvc", serviceConnection + ".onServiceDisconnected()", e);
        }
        if (serviceRecord.isEmpty()) {
            ((HashMap) f9371a).remove(remove);
            i(serviceRecord.app, serviceRecord.service);
            try {
                serviceRecord.service.onUnbind(serviceRecord.intent);
            } catch (RuntimeException e2) {
                bph.e("LocalSvc", serviceRecord.service + ".onUnbind()", e2);
            }
            try {
                serviceRecord.service.onDestroy();
            } catch (RuntimeException e3) {
                bph.e("LocalSvc", serviceRecord.service + ".onDestroy()", e3);
            }
        }
        return true;
    }

    public static void i(Application application, ComponentCallbacks componentCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816c7493", new Object[]{application, componentCallbacks});
        } else if (application != null) {
            application.unregisterComponentCallbacks(componentCallbacks);
        }
    }
}
