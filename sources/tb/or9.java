package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import tb.udp;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class or9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEV_TOOLS_CLASS_NAME = "com.taobao.android.fluid.devtools.DevToolsService";
    public static final String FLUID_SDK_CLASS_NAME = "com.taobao.android.fluid.FluidSDK";
    public static final String FLUID_SDK_FULL_PAGE_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage";
    public static final String FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME = "com.taobao.android.fluid.framework.preload.launcher.FullPageWakeChainLauncher";
    public static final String FLUID_SDK_SHOP_VIDEO_CARD_COMPONENT_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.triver.ShopVideoCardComponent";
    public static final String FLUID_SDK_TB_GUANG_PICK_PRELOAD_MODULE_CLASS_NAME = "com.taobao.android.fluid.framework.preload.launcher.TBGuangPickPreloadModule";
    public static final String FLUID_SDK_TB_VIDEO_COMPONENT_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<?>> f25590a = new HashMap();
    public static final Map<String, Class<?>> b = new HashMap();
    public static double c = -1.0d;
    public static Boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f25591a;

        public a(d dVar) {
            this.f25591a = dVar;
        }

        @Override // tb.or9.e
        public void onClassLoaded(Class<?> cls) {
            if (cls != null) {
                ir9.b("FluidRemoteLoader", "异步，FluidSDK 加载远程服务成功：" + cls);
                try {
                    or9.b(((Double) cls.getMethod("getFluidRemoteVersion", new Class[0]).invoke(null, new Object[0])).doubleValue());
                    ir9.b("FluidRemoteLoader", "异步，FluidSDK 获取远程服务版本号成功：" + or9.a());
                } catch (InvocationTargetException e) {
                    ir9.c("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败", e.getTargetException());
                } catch (Exception e2) {
                    ir9.c("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败", e2);
                }
                or9.d(Boolean.TRUE);
            } else {
                ir9.b("FluidRemoteLoader", "异步，FluidSDK 加载远程服务失败");
                or9.d(Boolean.FALSE);
            }
            d dVar = this.f25591a;
            if (dVar != null) {
                ((udp.a) dVar).a(or9.c().booleanValue());
            }
        }

        @Override // tb.or9.e
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            ir9.b("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败 onClassNotFound");
            or9.d(Boolean.FALSE);
            d dVar = this.f25591a;
            if (dVar != null) {
                ((udp.a) dVar).a(or9.c().booleanValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25592a;

        public b(String str) {
            this.f25592a = str;
        }

        @Override // tb.or9.e
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类加载成功：" + this.f25592a);
            or9.d(Boolean.TRUE);
        }

        @Override // tb.or9.e
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类加载失败：" + this.f25592a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25593a;
        public final /* synthetic */ e b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f25594a;

            public a(Class cls) {
                this.f25594a = cls;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                or9.e().put(c.this.f25593a, this.f25594a);
                e eVar = c.this.b;
                if (eVar != null) {
                    eVar.onClassLoaded(this.f25594a);
                    ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类加载成功：" + c.this.f25593a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e eVar = c.this.b;
                if (eVar != null) {
                    eVar.onClassNotFound();
                }
            }
        }

        public c(String str, e eVar) {
            this.f25593a = str;
            this.b = eVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else if (cls != null) {
                nwv.z0(new a(cls), true);
            } else {
                ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类失败：" + this.f25593a);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类失败：" + this.f25593a);
            nwv.z0(new b(), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void onClassLoaded(Class<?> cls);

        void onClassNotFound();
    }

    static {
        t2o.a(469762066);
    }

    public static /* synthetic */ double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd60765", new Object[0])).doubleValue();
        }
        return c;
    }

    public static /* synthetic */ double b(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e154f8d3", new Object[]{new Double(d2)})).doubleValue();
        }
        c = d2;
        return d2;
    }

    public static /* synthetic */ Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("24ff1635", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ Boolean d(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b3928210", new Object[]{bool});
        }
        d = bool;
        return bool;
    }

    public static /* synthetic */ Map e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return b;
    }

    public static void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971c8765", new Object[]{dVar});
            return;
        }
        Boolean bool = d;
        if (bool == null) {
            ir9.b("FluidRemoteLoader", "异步，FluidSDK 开始加载入口类");
            k("com.taobao.android.fluid.remote.FluidRemoteVersion", new a(dVar));
        } else if (dVar != null) {
            ((udp.a) dVar).a(bool.booleanValue());
        }
    }

    public static Class<?> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ecec6c36", new Object[0]);
        }
        Map<String, Class<?>> map = b;
        if (((HashMap) map).containsKey(FLUID_SDK_CLASS_NAME)) {
            ir9.b("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: com.taobao.android.fluid.FluidSDK");
            return (Class) ((HashMap) map).get(FLUID_SDK_CLASS_NAME);
        }
        Class<?> i = i(FLUID_SDK_CLASS_NAME);
        if (i == null) {
            ir9.b("FluidRemoteLoader", "FluidSDK 加载失败");
            return null;
        }
        ir9.b("FluidRemoteLoader", "FluidSDK 加载成功：" + i);
        return i;
    }

    public static Class<?> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f3cdec48", new Object[0]);
        }
        return i(FLUID_SDK_FULL_PAGE_CLASS_NAME);
    }

    public static Class<?> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("abec3151", new Object[]{str});
        }
        return j(str, true);
    }

    public static Class<?> j(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fcb8f5d", new Object[]{str, new Boolean(z)});
        }
        Map<String, Class<?>> map = f25590a;
        if (((HashMap) map).containsKey(str)) {
            ir9.b("FluidRemoteLoader", "FluidSDK 从缓存中获取本地类: " + str);
            return (Class) ((HashMap) map).get(str);
        }
        try {
            Class<?> cls = Class.forName(str);
            ((HashMap) map).put(str, cls);
            ir9.b("FluidRemoteLoader", "FluidSDK 加载本地类: " + str);
            return cls;
        } catch (Exception e2) {
            if (!z) {
                return null;
            }
            ir9.c("FluidRemoteLoader", "FluidSDK 加载本地类失败：" + str, e2);
            return null;
        }
    }

    public static void k(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d483d1c", new Object[]{str, eVar});
            return;
        }
        HashMap hashMap = (HashMap) b;
        if (hashMap.containsKey(str)) {
            ir9.b("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: " + str);
            if (eVar != null) {
                eVar.onClassLoaded((Class) hashMap.get(str));
                return;
            }
            return;
        }
        zk9.b(str, new c(str, eVar));
    }

    public static Class<?> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("98258c5", new Object[]{str});
        }
        Map<String, Class<?>> map = b;
        HashMap hashMap = (HashMap) map;
        if (hashMap.containsKey(str)) {
            ir9.b("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: " + str);
            return (Class) hashMap.get(str);
        }
        try {
            Class<?> cls = Class.forName(str, true, zk9.class.getClassLoader());
            ((HashMap) map).put(str, cls);
            ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类，已找到：" + str);
            return cls;
        } catch (ClassNotFoundException unused) {
            ir9.b("FluidRemoteLoader", "FluidSDK 加载远程类，未找到，触发远程类下载: " + str);
            k(str, new b(str));
            return null;
        }
    }

    public static Class<?> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b6a39962", new Object[0]);
        }
        return i(FLUID_SDK_SHOP_VIDEO_CARD_COMPONENT_CLASS_NAME);
    }
}
