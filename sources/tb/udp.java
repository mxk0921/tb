package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.or9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class udp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f29310a;
    public final Map<String, FluidService> b = new LinkedHashMap(32);
    public boolean c = false;

    static {
        t2o.a(468713787);
    }

    public udp(FluidContext fluidContext) {
        this.f29310a = fluidContext;
    }

    public static /* synthetic */ String a(udp udpVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca872a76", new Object[]{udpVar, cls});
        }
        return udpVar.h(cls);
    }

    public static /* synthetic */ Map b(udp udpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b672ffe9", new Object[]{udpVar});
        }
        return udpVar.b;
    }

    public static /* synthetic */ FluidContext c(udp udpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("432ecdf3", new Object[]{udpVar});
        }
        return udpVar.f29310a;
    }

    public static /* synthetic */ void d(udp udpVar, Class cls, FluidService fluidService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565ed233", new Object[]{udpVar, cls, fluidService});
        } else {
            udpVar.l(cls, fluidService);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4cdb5e", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            String str = (String) entry.getKey();
            try {
                ((FluidService) entry.getValue()).onCreateService();
            } catch (Exception unused) {
                ar9 ar9Var = ar9.SERVICE_CREATE_ERROR;
                ar9Var.a(FluidException.SERVICE_NAME, str);
                FluidContext fluidContext = this.f29310a;
                FluidException.throwException(fluidContext, ar9Var, "服务：" + str + " 创建失败");
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421d40a0", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            String str = (String) entry.getKey();
            try {
                ((FluidService) entry.getValue()).onDestroyService();
            } catch (Exception unused) {
                ar9 ar9Var = ar9.SERVICE_DESTROY_ERROR;
                ar9Var.a(FluidException.SERVICE_NAME, str);
                FluidContext fluidContext = this.f29310a;
                FluidException.throwException(fluidContext, ar9Var, "服务：" + str + " 销毁失败");
            }
        }
    }

    public <T extends FluidService> T g(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((FluidService) ipChange.ipc$dispatch("90661d2b", new Object[]{this, cls}));
        }
        if (!cls.isInterface()) {
            FluidContext fluidContext = this.f29310a;
            ar9 ar9Var = ar9.SERVICE_CLASS_NOT_INTERFACE;
            FluidException.throwException(fluidContext, ar9Var, "服务需要通过接口进行调用：" + cls);
            return null;
        }
        String h = h(cls);
        FluidService fluidService = (FluidService) ((LinkedHashMap) this.b).get(h);
        if (fluidService == null) {
            return null;
        }
        if (cls.isInstance(fluidService)) {
            return cls.cast(fluidService);
        }
        FluidContext fluidContext2 = this.f29310a;
        ar9 ar9Var2 = ar9.SERVICE_ERROR_INSTANCE;
        FluidException.throwException(fluidContext2, ar9Var2, " 服务名称：" + h);
        return null;
    }

    public final <T extends FluidService> String h(Class<? extends FluidService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11060bf4", new Object[]{this, cls});
        }
        return cls.getName();
    }

    public final void i(FluidContext fluidContext, yod yodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca6d58d", new Object[]{this, fluidContext, yodVar});
            return;
        }
        ir9.b("ServiceRegistryManager", "本地服务注册开始");
        LinkedHashMap<Class<? extends FluidService>, FluidService> b = yodVar.b(fluidContext);
        if (b.isEmpty()) {
            ir9.b("ServiceRegistryManager", "本地服务注册表为空");
            return;
        }
        for (Map.Entry<Class<? extends FluidService>, FluidService> entry : b.entrySet()) {
            l(entry.getKey(), entry.getValue());
        }
        ir9.b("ServiceRegistryManager", "本地服务注册完成");
    }

    public void k(FluidContext fluidContext, yod yodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2f3376", new Object[]{this, fluidContext, yodVar});
            return;
        }
        i(fluidContext, yodVar);
        j(fluidContext, yodVar);
    }

    public final void l(Class<? extends FluidService> cls, FluidService fluidService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3ecad8", new Object[]{this, cls, fluidService});
            return;
        }
        String h = h(cls);
        if (this.b.containsKey(h)) {
            FluidContext fluidContext = this.f29310a;
            ar9 ar9Var = ar9.SERVICE_REGISTER_REPEAT_ERROR;
            FluidException.throwException(fluidContext, ar9Var, "服务：" + h + " 已经被注册");
        } else if (!cls.isInstance(fluidService)) {
            ir9.b("ServiceRegistryManager", "服务 " + fluidService + " 不是 " + cls + " 的实例");
        } else {
            this.b.put(h, fluidService);
            ir9.b("ServiceRegistryManager", "服务 " + h + " 注册成功");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements or9.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f29311a;
        public final /* synthetic */ FluidContext b;

        public a(LinkedHashMap linkedHashMap, FluidContext fluidContext) {
            this.f29311a = linkedHashMap;
            this.b = fluidContext;
        }

        public void a(boolean z) {
            if (!z) {
                ir9.b("ServiceRegistryManager", "远程服务未加载完成");
                return;
            }
            for (Map.Entry entry : this.f29311a.entrySet()) {
                Class cls = (Class) entry.getKey();
                udp udpVar = udp.this;
                String a2 = udp.a(udpVar, cls);
                if (udp.b(udpVar).containsKey(a2)) {
                    FluidContext c = udp.c(udpVar);
                    ar9 ar9Var = ar9.SERVICE_REGISTER_REPEAT_ERROR;
                    FluidException.throwException(c, ar9Var, "远程服务：" + a2 + " 已经被注册");
                } else {
                    try {
                        FluidService fluidService = (FluidService) or9.l((String) entry.getValue()).getConstructor(FluidContext.class).newInstance(this.b);
                        udp.d(udpVar, cls, fluidService);
                        fluidService.onCreateService();
                        if (akt.p2("ShortVideo.recallDestroyService", true) && (udp.c(udpVar) instanceof FluidInstance) && ((FluidInstance) udp.c(udpVar)).isDestroyed()) {
                            ir9.b("ServiceRegistryManager", "activity已销毁，补发onDestroyService...");
                            fluidService.onDestroyService();
                        }
                    } catch (Exception e) {
                        FluidException.throwException(udp.c(udpVar), ar9.SERVICE_REMOTE_NEW_INSTANCE_ERROR, e);
                    }
                }
            }
            ir9.b("ServiceRegistryManager", "远程服务注册完成");
        }
    }

    public void j(FluidContext fluidContext, yod yodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32116ce", new Object[]{this, fluidContext, yodVar});
        } else if (this.c) {
            ir9.b("ServiceRegistryManager", "远程服务已经注册过");
        } else {
            ir9.b("ServiceRegistryManager", "远程服务注册开始");
            LinkedHashMap<Class<? extends FluidService>, String> a2 = yodVar.a();
            if (a2.isEmpty()) {
                this.c = true;
                ir9.b("ServiceRegistryManager", "远程服务注册表为空");
                return;
            }
            or9.f(new a(a2, fluidContext));
            this.c = true;
        }
    }
}
