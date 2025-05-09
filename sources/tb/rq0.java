package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.vrj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rq0 extends pw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f27549a = new HashSet();
    public final Map<String, vio<?, ?>> b = new ConcurrentHashMap();
    public final vpt c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements vrj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public vio a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vio) ipChange.ipc$dispatch("1217121", new Object[]{this, netConfig});
            }
            return new l6w(netConfig);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements vrj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public vio a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vio) ipChange.ipc$dispatch("1217121", new Object[]{this, netConfig});
            }
            return new vck(netConfig);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements vrj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public vio a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vio) ipChange.ipc$dispatch("1217121", new Object[]{this, netConfig});
            }
            return new vck(netConfig);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap(rq0.b(rq0.this));
            rq0.b(rq0.this).clear();
            for (Map.Entry entry : hashMap.entrySet()) {
                agh.b("PltAlgo_AliNNNetWorker", "Destroy net: %s", entry.getKey());
                try {
                    ((vio) entry.getValue()).destroy();
                } catch (Exception e) {
                    agh.d("PltAlgo_AliNNNetWorker", "destroy", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final vio c;
        private final an2 d;
        private final NetConfig e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$BuildNetTask$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.b("PltAlgo_AliNNNetWorker", "BuildNetwork finishMain -- %s [%s]", e.e(e.this).b(), e.f(e.this).name);
                rq0.c(rq0.this).remove(e.f(e.this).name);
                if (e.g(e.this) != null) {
                    e.g(e.this).b();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class b extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$BuildNetTask$2");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.b("PltAlgo_AliNNNetWorker", "BuildNetwork errorMain [%s]", e.f(e.this).name);
                rq0.c(rq0.this).remove(e.f(e.this).name);
                if (e.g(e.this) != null) {
                    e.g(e.this).c();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class c extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$BuildNetTask$3");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.b("PltAlgo_AliNNNetWorker", "BuildNetwork errorMain [%s]", e.f(e.this).name);
                rq0.c(rq0.this).remove(e.f(e.this).name);
                if (e.g(e.this) != null) {
                    e.g(e.this).c();
                }
            }
        }

        static {
            t2o.a(482344975);
        }

        public e(NetConfig netConfig, vio vioVar, an2 an2Var) {
            this.e = netConfig;
            this.c = vioVar;
            this.d = an2Var;
        }

        public static /* synthetic */ vio e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vio) ipChange.ipc$dispatch("fbc08830", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ NetConfig f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetConfig) ipChange.ipc$dispatch("788e60bf", new Object[]{eVar});
            }
            return eVar.e;
        }

        public static /* synthetic */ an2 g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (an2) ipChange.ipc$dispatch("76e96569", new Object[]{eVar});
            }
            return eVar.d;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$BuildNetTask");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            an2 an2Var = this.d;
            if (an2Var != null) {
                an2Var.a();
            }
            vpt d = rq0.d(rq0.this);
            d.f(a() + " -> BuildNetTask", new c());
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.b("PltAlgo_AliNNNetWorker", "BuildNetwork start [%s]", this.e.name);
            if (this.c.build()) {
                an2 an2Var = this.d;
                if (an2Var != null) {
                    an2Var.d();
                }
                rq0.b(rq0.this).put(this.e.name, this.c);
                vpt d = rq0.d(rq0.this);
                d.f(a() + " -> BuildNetTask", new a());
                return;
            }
            an2 an2Var2 = this.d;
            if (an2Var2 != null) {
                an2Var2.a();
            }
            vpt d2 = rq0.d(rq0.this);
            d2.f(a() + " -> BuildNetTask", new b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final vio c;
        private final sio d;
        private final String e;
        private final Object f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Object c;

            public a(Object obj) {
                this.c = obj;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$NetRunTask$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    f.e(f.this).d(this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class b extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$NetRunTask$2");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.b("PltAlgo_AliNNNetWorker", "NetRunTask error main [%s]", f.f(f.this));
                f.e(f.this).c();
            }
        }

        static {
            t2o.a(482344979);
        }

        public f(vio vioVar, Object obj, sio sioVar, String str) {
            this.c = vioVar;
            this.d = sioVar;
            this.e = str;
            this.f = obj;
        }

        public static /* synthetic */ sio e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sio) ipChange.ipc$dispatch("c35aeb2b", new Object[]{fVar});
            }
            return fVar.d;
        }

        public static /* synthetic */ String f(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e3b29f7", new Object[]{fVar});
            }
            return fVar.e;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker$NetRunTask");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.d.onError();
            agh.b("PltAlgo_AliNNNetWorker", "NetRunTask error [%s]", this.e);
            vpt d = rq0.d(rq0.this);
            d.f(a() + " -> NetRunTask", new b());
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            Object a2 = this.d.a();
            if (a2 == null) {
                a2 = this.c.a(this.d.b(), this.f);
                this.d.onFinish(a2);
            }
            vpt d = rq0.d(rq0.this);
            d.f(a() + " -> NetRunTask", new a(a2));
        }
    }

    public rq0(String str) {
        super(str);
        this.c = new vpt("AliNNWorker" + str + "_" + pw.THREAD_COUNT.get());
    }

    public static /* synthetic */ Map b(rq0 rq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54b4ae3e", new Object[]{rq0Var});
        }
        return rq0Var.b;
    }

    public static /* synthetic */ Set c(rq0 rq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2f6604bb", new Object[]{rq0Var});
        }
        return rq0Var.f27549a;
    }

    public static /* synthetic */ vpt d(rq0 rq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpt) ipChange.ipc$dispatch("50e6ee48", new Object[]{rq0Var});
        }
        return rq0Var.c;
    }

    public static /* synthetic */ Object ipc$super(rq0 rq0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/AliNNNetWorker");
    }

    public void e(NetConfig netConfig, an2 an2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2b7ff3", new Object[]{this, netConfig, an2Var});
            return;
        }
        agh.a("PltAlgo_AliNNNetWorker", "buildNetWork: ");
        vio a2 = vrj.a(netConfig);
        if (a2 == null) {
            agh.b("PltAlgo_AliNNNetWorker", "No Unit for %s", netConfig.type);
            if (an2Var != null) {
                an2Var.c();
                return;
            }
            return;
        }
        ((HashSet) this.f27549a).add(netConfig.name);
        this.c.i("buildNetWork", new e(netConfig, a2, an2Var));
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        agh.a("PltAlgo_AliNNNetWorker", "destroy: ");
        this.c.b(new d(), false);
    }

    public void g(String str, String str2, Object obj, sio<?, ?> sioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7e5f97", new Object[]{this, str, str2, obj, sioVar});
            return;
        }
        agh.a("PltAlgo_AliNNNetWorker", "runNetWork: ");
        vio vioVar = (vio) ((ConcurrentHashMap) this.b).get(str);
        if (vioVar == null) {
            sioVar.c();
            return;
        }
        f fVar = new f(vioVar, obj, sioVar, str);
        vpt vptVar = this.c;
        vptVar.i(str2 + " -> runNetWork(" + str + f7l.BRACKET_END_STR, fVar);
    }

    static {
        t2o.a(482344970);
        vrj.b("Video", new a());
        vrj.b("Object", new b());
        vrj.b("plt_autodetect", new c());
        com.etao.feimagesearch.mnn.utils.a.n();
        com.etao.feimagesearch.mnn.utils.a.m();
    }
}
