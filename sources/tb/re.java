package tb;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.invoc.MethodInvocationHandler;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IBindService;
import com.taobao.aranger.intf.IUnbindService;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.FakeServiceCenter;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.re;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class re {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f27309a;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final ConcurrentHashMap<String, Set<String>> d = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>>> e = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Pair<Uri, String>> f = new ConcurrentHashMap<>();

    static {
        t2o.a(393216001);
    }

    public static void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b2289", new Object[0]);
        } else if (g91.a(o41.a(), false)) {
            b5d.i("ARanger", "appFirstLaunch, orangeSwitch return", new Object[0]);
        } else if (h5d.g(f27309a, 3)) {
            k8l.g();
        }
    }

    public static void B(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcf87f2", new Object[]{processStateListener});
        } else {
            CallbackManager.f().h(processStateListener);
        }
    }

    public static void C(ProcessStateListener processStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1e2fcd", new Object[]{processStateListener});
        } else {
            CallbackManager.f().i(processStateListener);
        }
    }

    public static void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c0db58", new Object[0]);
        } else if (!c.getAndSet(true)) {
            try {
                h5d.n(null);
            } catch (IPCException unused) {
            }
            B(new b());
        }
    }

    public static /* synthetic */ ConcurrentHashMap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6789008f", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ ConcurrentHashMap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("21008e2e", new Object[0]);
        }
        return e;
    }

    public static void i(ComponentName componentName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e894b1eb", new Object[]{componentName, str});
        } else {
            h5d.b(componentName, str);
        }
    }

    public static boolean j(Intent intent, ServiceConnection serviceConnection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef449bbf", new Object[]{intent, serviceConnection, new Integer(i)})).booleanValue();
        }
        return l(intent, serviceConnection, i);
    }

    public static void k(final Intent intent, final ServiceConnection serviceConnection, final int i, final wod wodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f5bce", new Object[]{intent, serviceConnection, new Integer(i), wodVar});
        } else {
            g5d.b(false, true, new Runnable(intent, serviceConnection, i, wodVar) { // from class: tb.pe

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Intent f26039a;
                public final /* synthetic */ ServiceConnection b;
                public final /* synthetic */ int c;

                @Override // java.lang.Runnable
                public final void run() {
                    re.v(this.f26039a, this.b, this.c, null);
                }
            });
        }
    }

    @SafeVarargs
    public static <T> T m(ComponentName componentName, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("36099e1c", new Object[]{componentName, cls, pairArr});
        }
        return (T) n(componentName, "", cls, pairArr);
    }

    @SafeVarargs
    public static <T> T n(ComponentName componentName, String str, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b3e98166", new Object[]{componentName, str, cls, pairArr});
        }
        TypeUtils.q(componentName);
        return (T) o(componentName, TypeUtils.n(str, cls), cls, null, pairArr);
    }

    @SafeVarargs
    public static <T> T o(ComponentName componentName, String str, Class<T> cls, String str2, Pair<Class<?>, Object>... pairArr) throws IPCException {
        String str3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9383bb86", new Object[]{componentName, str, cls, str2, pairArr});
        }
        Uri n = h5d.n(componentName);
        boolean equals = f27309a.getPackageName().equals(componentName.getPackageName());
        ServiceWrapper obtain = ServiceWrapper.obtain();
        if (equals) {
            str3 = mut.a();
        } else {
            str3 = mut.b(h5d.f());
        }
        ServiceWrapper serviceName = obtain.setTimeStamp(str3).setServiceInterfaceClass(cls).setServiceName(str);
        if (str2 != null) {
            i = 1;
        }
        Call remoteProviderUri = Call.obtain().setSameApp(equals).setServiceWrapper(serviceName.setType(i)).setMethodWrapper(MethodWrapper.obtain().setMethodName(str2).setVoid(true)).setParameterWrappers(fql.c(pairArr)).setRemoteProviderUri(n);
        ui3.b(n).e(remoteProviderUri);
        return (T) s(remoteProviderUri);
    }

    @SafeVarargs
    public static <T> T p(ComponentName componentName, String str, Class<T> cls, String str2, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a47ef683", new Object[]{componentName, str, cls, str2, pairArr});
        }
        TypeUtils.q(componentName);
        return (T) o(componentName, TypeUtils.n(str, cls), cls, str2, pairArr);
    }

    @SafeVarargs
    public static <T> T q(ComponentName componentName, Class<T> cls, Pair<Class<?>, Object>... pairArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2fab7c09", new Object[]{componentName, cls, pairArr});
        }
        return (T) p(componentName, "", cls, "getInstance", pairArr);
    }

    public static Context r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        if (f27309a == null) {
            try {
                f27309a = (Application) o41.a();
            } catch (Exception e2) {
                b5d.h("ARanger", "get context err", e2, new Object[0]);
            }
        }
        return f27309a;
    }

    public static <T> T s(Call call) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c489d76", new Object[]{call});
        }
        T t = (T) Proxy.newProxyInstance(call.getServiceWrapper().getServiceInterfaceClass().getClassLoader(), new Class[]{call.getServiceWrapper().getServiceInterfaceClass()}, new MethodInvocationHandler(call));
        f5d.b().g(call.getRemoteProviderUri(), call.getServiceWrapper().getTimeStamp(), t);
        return t;
    }

    public static void t(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        if (f27309a == null) {
            f27309a = application;
        }
        o41.c(application);
        if (b.getAndSet(true)) {
            b5d.i("ARanger", "aranger init return", new Object[0]);
            return;
        }
        SystemClock.elapsedRealtime();
        String f2 = h5d.f();
        b5d.i("ARanger", "aranger init", "curProcess", f2);
        if (TextUtils.isEmpty(f2) || f2.equals(application.getPackageName()) || f2.endsWith(":channel")) {
            ja.c().d();
            if (g.a()) {
                g5d.b(false, false, new Runnable() { // from class: tb.le
                    @Override // java.lang.Runnable
                    public final void run() {
                        re.A();
                    }
                });
            } else {
                A();
            }
            try {
                application.registerComponentCallbacks(new a());
                if (application.getPackageName().equals(f2)) {
                    x2v.setUTService(new a5e() { // from class: tb.me
                        @Override // tb.a5e
                        public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
                            return re.j(intent, serviceConnection, i);
                        }
                    });
                }
            } catch (Throwable th) {
                b5d.h("ARanger", "aranger init err", th, new Object[0]);
            }
        }
    }

    public static boolean u(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c82e4ac", new Object[]{componentName})).booleanValue();
        }
        try {
            TypeUtils.q(componentName);
            return h5d.k(componentName);
        } catch (IPCException unused) {
            return false;
        }
    }

    public static /* synthetic */ void v(Intent intent, ServiceConnection serviceConnection, int i, wod wodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c717a3e", new Object[]{intent, serviceConnection, new Integer(i), wodVar});
            return;
        }
        boolean j = j(intent, serviceConnection, i);
        if (wodVar != null) {
            wodVar.onResult(j);
        }
    }

    public static /* synthetic */ void w(final ServiceConnection serviceConnection, final String str, final Uri uri, final ComponentName componentName, final String str2, final IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6f7458", new Object[]{serviceConnection, str, uri, componentName, str2, iBinder});
        } else {
            g5d.b(false, true, new Runnable() { // from class: tb.ne
                @Override // java.lang.Runnable
                public final void run() {
                    re.x(str2, serviceConnection, str, uri, componentName, iBinder);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (ttt.a("ARanger_onLowMemory", 1000L)) {
                for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().d()) {
                    b5d.i("ARanger", "onLowMemory", "service", fakeService.d());
                    fakeService.onLowMemory();
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else if (ttt.a("ARanger_onConfigurationChanged", 1000L)) {
                for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().d()) {
                    b5d.i("ARanger", "onConfigurationChanged", "service", fakeService.d());
                    fakeService.onConfigurationChanged(configuration);
                }
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else if (ttt.a("ARanger_onTrimMemory", 1000L)) {
                for (FakeServiceCenter.FakeService fakeService : FakeServiceCenter.a().d()) {
                    b5d.i("ARanger", "onTrimMemory", "service", fakeService.d(), m09.TASK_TYPE_LEVEL, Integer.valueOf(i));
                    fakeService.onTrimMemory(i);
                }
            }
        }
    }

    public static /* synthetic */ void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d134873", new Object[]{str});
            return;
        }
        b5d.i("ARanger", "unbindServiceImpl onDestroy", new Object[0]);
        e.remove(str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements ProcessStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107b37c3", new Object[]{this, str});
            }
        }

        public static /* synthetic */ void b(Pair pair, ServiceConnection serviceConnection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f8f7681", new Object[]{pair, serviceConnection});
                return;
            }
            b5d.i("ARanger", "onProcessStop, call onServiceDisconnected()", "component", pair.second);
            serviceConnection.onServiceDisconnected((ComponentName) pair.second);
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStop(String str) {
            final ServiceConnection serviceConnection;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                return;
            }
            try {
                b5d.i("ARanger", "onProcessStop", "processName", str);
                Set<String> set = (Set) re.g().remove(str);
                if (set != null && !set.isEmpty()) {
                    for (String str2 : set) {
                        List<Pair> list = (List) re.h().remove(str2);
                        if (list != null && !list.isEmpty()) {
                            for (Pair pair : list) {
                                final Pair pair2 = (Pair) pair.second;
                                if (!(pair2 == null || (serviceConnection = (ServiceConnection) ((WeakReference) pair2.first).get()) == null)) {
                                    g5d.b(false, true, new Runnable() { // from class: tb.se
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            re.b.b(pair2, serviceConnection);
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                b5d.h("ARanger", "onProcessStop err", th, new Object[0]);
            }
        }
    }

    public static void E(final ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad5527e", new Object[]{serviceConnection});
        } else if (!g.d()) {
            r().unbindService(serviceConnection);
        } else if (serviceConnection == null) {
            b5d.i("ARanger", "ubBindService, conn is null", new Object[0]);
        } else {
            g5d.b(false, true, new Runnable() { // from class: tb.oe
                @Override // java.lang.Runnable
                public final void run() {
                    re.y(serviceConnection);
                }
            });
        }
    }

    public static /* synthetic */ void y(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b60a7", new Object[]{serviceConnection});
            return;
        }
        ConcurrentHashMap<String, List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>>> concurrentHashMap = e;
        b5d.i("ARanger", "ubBindService", "map size", Integer.valueOf(concurrentHashMap.size()), MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
        try {
            for (Map.Entry<String, List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>>> entry : concurrentHashMap.entrySet()) {
                String key = entry.getKey();
                List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    Iterator<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>> it = value.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>> next = it.next();
                            ServiceConnection serviceConnection2 = (ServiceConnection) ((WeakReference) ((Pair) next.second).first).get();
                            if (serviceConnection2 == serviceConnection) {
                                F(serviceConnection2, (Uri) next.first, key);
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b5d.h("ARanger", "ubBindService err", th, new Object[0]);
        }
    }

    public static void F(ServiceConnection serviceConnection, Uri uri, final String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350156d3", new Object[]{serviceConnection, uri, str});
            return;
        }
        int hashCode = serviceConnection.hashCode();
        b5d.i("ARanger", "unbindServiceImpl", MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(hashCode), "timeStamp", str);
        ui3.b(uri).e(Call.obtain().setSameApp(true).setOneWay(true).setServiceWrapper(ServiceWrapper.obtain().setTimeStamp(str).setType(5)).setMethodWrapper(MethodWrapper.obtain().setVoid(true)).setParameterWrappers(fql.c(new Pair[]{Pair.create(Integer.class, Integer.valueOf(hashCode)), Pair.create(IUnbindService.class, new IUnbindService() { // from class: tb.qe
            @Override // com.taobao.aranger.intf.IUnbindService
            public final void onDestroy() {
                re.z(str);
            }
        })})).setRemoteProviderUri(uri));
    }

    public static /* synthetic */ void x(String str, ServiceConnection serviceConnection, String str2, Uri uri, ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bc6ad3", new Object[]{str, serviceConnection, str2, uri, componentName, iBinder});
            return;
        }
        b5d.i("ARanger", "onServiceConnected", "timeStamp", str, MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
        ConcurrentHashMap<String, List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>>> concurrentHashMap = e;
        List<Pair<Uri, Pair<WeakReference<ServiceConnection>, ComponentName>>> list = concurrentHashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            concurrentHashMap.put(str, list);
            if (!str2.equals(h5d.f())) {
                ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = d;
                Set<String> set = concurrentHashMap2.get(str2);
                if (set == null) {
                    set = new HashSet<>();
                    concurrentHashMap2.put(str2, set);
                }
                set.add(str);
            }
        }
        list.add(Pair.create(uri, Pair.create(new WeakReference(serviceConnection), componentName)));
        serviceConnection.onServiceConnected(componentName, iBinder);
    }

    public static boolean l(Intent intent, final ServiceConnection serviceConnection, int i) {
        boolean z;
        char c2;
        int i2;
        final ComponentName component;
        final String str;
        final Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33e8d5ff", new Object[]{intent, serviceConnection, new Integer(i)})).booleanValue();
        }
        Context r = r();
        if (r == null) {
            b5d.i("ARanger", "bindService, context empty", new Object[0]);
            return false;
        } else if (serviceConnection == null) {
            b5d.i("ARanger", "bindService, ServiceConnection is null", new Object[0]);
            return false;
        } else if (!g.d()) {
            return r.bindService(intent, serviceConnection, i);
        } else {
            if (intent == null || (component = intent.getComponent()) == null) {
                c2 = 1;
                z = false;
                i2 = 2;
            } else {
                String className = component.getClassName();
                if (TextUtils.isEmpty(className)) {
                    i2 = 2;
                    c2 = 1;
                    z = false;
                } else {
                    D();
                    try {
                        ConcurrentHashMap<String, Pair<Uri, String>> concurrentHashMap = f;
                        Pair<Uri, String> pair = concurrentHashMap.get(className);
                        if (pair == null) {
                            ServiceInfo serviceInfo = r.getPackageManager().getServiceInfo(intent.getComponent(), 4);
                            String str2 = serviceInfo.processName;
                            if (r.getPackageName().equals(serviceInfo.processName)) {
                                uri = Uri.parse("content://" + r.getPackageName() + ".aranger.main");
                            } else {
                                if ((r.getPackageName() + ":channel").equals(serviceInfo.processName)) {
                                    uri = Uri.parse("content://" + r.getPackageName() + ":channel");
                                } else {
                                    b5d.i("ARanger", "bindService, process not support", "proc", serviceInfo.processName);
                                    return false;
                                }
                            }
                            concurrentHashMap.put(className, Pair.create(uri, serviceInfo.processName));
                            str = str2;
                        } else {
                            uri = (Uri) pair.first;
                            str = (String) pair.second;
                        }
                        String a2 = mut.a();
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            d5d.b("bind_in_main " + className, false, new String[0]);
                            b5d.i("ARanger", "bindService in main", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "timeStamp", a2, pg1.ATOM_stack, cp.c(Thread.currentThread().getStackTrace()), MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
                        } else {
                            b5d.i("ARanger", "bindService", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent, "timeStamp", a2, MonitorItemConstants.WS_MONITOR_TITLE_CONN, Integer.valueOf(serviceConnection.hashCode()));
                        }
                        ui3.b(uri).e(Call.obtain().setSameApp(true).setOneWay(true).setServiceWrapper(ServiceWrapper.obtain().setTimeStamp(a2).setServiceName(intent.getComponent().getClassName()).setType(4)).setMethodWrapper(MethodWrapper.obtain().setVoid(true)).setParameterWrappers(fql.c(new Pair[]{Pair.create(Intent.class, intent), Pair.create(Integer.class, Integer.valueOf(serviceConnection.hashCode())), Pair.create(IBindService.class, new IBindService() { // from class: tb.ke
                            @Override // com.taobao.aranger.intf.IBindService
                            public final void onBind(String str3, IBinder iBinder) {
                                re.w(serviceConnection, str, uri, component, str3, iBinder);
                            }
                        })})).setRemoteProviderUri(uri));
                        return true;
                    } catch (Throwable th) {
                        b5d.h("ARanger", "bindService err", th, new Object[0]);
                        intent.putExtra(Constants.INTENT_KEY_SERVICE, true);
                        return r.bindService(intent, serviceConnection, i);
                    }
                }
            }
            Object[] objArr = new Object[i2];
            char c3 = z ? 1 : 0;
            char c4 = z ? 1 : 0;
            objArr[c3] = "service";
            objArr[c2] = intent;
            b5d.i("ARanger", "bindService, illegal service", objArr);
            return z;
        }
    }
}
