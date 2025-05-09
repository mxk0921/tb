package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.realtime.MnnRealtimeDetectUnit;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gph extends pw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vpt f20145a;
    public final String b;
    public final Set<String> c = new HashSet();
    public xuc<?, ?> d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements yuc<ukn, xkn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yuc
        public xuc<ukn, xkn> a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xuc) ipChange.ipc$dispatch("42424eec", new Object[]{this, netConfig});
            }
            return MnnRealtimeDetectUnit.Companion.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ an2 l;

        public b(an2 an2Var) {
            this.l = an2Var;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.l.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ an2 c;
        public final /* synthetic */ String l;

        public c(an2 an2Var, String str) {
            this.c = an2Var;
            this.l = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.b();
            gph.d(gph.this).remove(this.l);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ an2 c;

        public d(an2 an2Var) {
            this.c = an2Var;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.c.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ an2 c;
        public final /* synthetic */ String l;

        public e(an2 an2Var, String str) {
            this.c = an2Var;
            this.l = str;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$5");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.c();
            gph.d(gph.this).remove(this.l);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String l;
        public final /* synthetic */ sio m;

        public f(String str, sio sioVar) {
            this.l = str;
            this.m = sioVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$6");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.c("realtime_MnnNetWorker", "mnnRunUnit is null " + this.l);
            this.m.onError();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ sio d;

        public g(sio sioVar) {
            this.d = sioVar;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$7");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                this.d.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$8");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.h("realtime_MnnNetWorker", "Destroy net: " + gph.e(gph.this));
            try {
                gph.f(gph.this).a(gph.e(gph.this));
            } catch (Exception e) {
                agh.d("realtime_MnnNetWorker", "destroy", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class k extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public xuc c;
        public Object d;
        public sio e;
        public String f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements wuc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.gph$k$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public class C0936a extends zio {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Object c;

                public C0936a(Object obj) {
                    this.c = obj;
                }

                public static /* synthetic */ Object ipc$super(C0936a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$RunNetWorkTask$1$1");
                }

                @Override // tb.zio
                public void c() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    } else {
                        k.this.e.onFinish(this.c);
                    }
                }
            }

            public a() {
            }

            @Override // tb.wuc
            public void onError(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    return;
                }
                agh.c("realtime_MnnNetWorker", "onError: ");
                k.this.b(th);
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public class b extends zio {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Object c;

                public b(Object obj) {
                    this.c = obj;
                }

                public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$RunNetWorkTask$1$2");
                }

                @Override // tb.zio
                public void c() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                        return;
                    }
                    agh.b("realtime_MnnNetWorker", "NetRunTask finish main [%s]", k.this.f);
                    k.this.e.d(this.c);
                }
            }

            @Override // tb.wuc
            public void onResult(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8251d27f", new Object[]{this, obj});
                    return;
                }
                agh.b("realtime_MnnNetWorker", "NetRunTask finish -- %s", k.this.f);
                vpt b2 = gph.b(gph.this);
                b2.i(k.this.a() + " -> NetRunTask", new C0936a(obj));
                vpt b3 = gph.b(gph.this);
                b3.f(k.this.a() + " -> NetRunTask", new b(obj));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$RunNetWorkTask$2");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    k.this.e.onError();
                }
            }
        }

        static {
            t2o.a(481297299);
        }

        public k(xuc<?, ?> xucVar, Object obj, sio sioVar, String str) {
            this.c = xucVar;
            this.d = obj;
            this.e = sioVar;
            this.f = str;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$RunNetWorkTask");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            vpt b2 = gph.b(gph.this);
            b2.i(a() + " -> NetRunTask", new b());
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            agh.c("realtime_MnnNetWorker", sb.toString());
            th.printStackTrace();
            vpt b3 = gph.b(gph.this);
            b3.f(a() + " -> NetRunTask", new c());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$RunNetWorkTask$3");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.b("realtime_MnnNetWorker", "NetRunTask error main [%s]", k.this.f);
                k.this.e.c();
            }
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.b("realtime_MnnNetWorker", "NetRunTask start [%s]", this.f);
            if (this.e.a() == null) {
                this.c.b(this.e.b(), this.d, new a());
            }
        }
    }

    public gph(String str, String str2) {
        super(str);
        this.f20145a = new vpt("MNNWorker_" + str + "_" + pw.THREAD_COUNT.incrementAndGet());
        this.b = str2;
    }

    public static /* synthetic */ vpt b(gph gphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vpt) ipChange.ipc$dispatch("bfa297dd", new Object[]{gphVar});
        }
        return gphVar.f20145a;
    }

    public static /* synthetic */ void c(gph gphVar, String str, xuc xucVar, an2 an2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea853e1", new Object[]{gphVar, str, xucVar, an2Var, new Boolean(z)});
        } else {
            gphVar.i(str, xucVar, an2Var, z);
        }
    }

    public static /* synthetic */ Set d(gph gphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("87e4044c", new Object[]{gphVar});
        }
        return gphVar.c;
    }

    public static /* synthetic */ String e(gph gphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5651702", new Object[]{gphVar});
        }
        return gphVar.b;
    }

    public static /* synthetic */ xuc f(gph gphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuc) ipChange.ipc$dispatch("a0be53cc", new Object[]{gphVar});
        }
        return gphVar.d;
    }

    public static /* synthetic */ Object ipc$super(gph gphVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker");
    }

    public void g(NetConfig netConfig, an2 an2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2b7ff3", new Object[]{this, netConfig, an2Var});
            return;
        }
        agh.a("realtime_MnnNetWorker", "buildNetWork: ");
        ((HashSet) this.c).add(netConfig.name);
        this.f20145a.i("buildNetTak", new j(netConfig, an2Var, this.b));
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.d != null) {
            this.f20145a.b(new h(), true);
        }
    }

    public final void i(String str, xuc xucVar, an2 an2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10576ad8", new Object[]{this, str, xucVar, an2Var, new Boolean(z)});
        } else if (an2Var != null) {
            this.d = xucVar;
            if (z) {
                this.f20145a.i("realtime_MnnNetWorker_onBuildSuccess", new b(an2Var));
                this.f20145a.f("realtime_MnnNetWorker_onMainBuildSuccess", new c(an2Var, str));
                return;
            }
            this.f20145a.i("realtime_MnnNetWorker_onBuildFailed", new d(an2Var));
            this.f20145a.f("realtime_MnnNetWorker_onMainBuildFailed", new e(an2Var, str));
        }
    }

    public void j(String str, String str2, Object obj, sio<?, ?> sioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7e5f97", new Object[]{this, str, str2, obj, sioVar});
            return;
        }
        String str3 = str2 + " -> runNetWork(" + str + f7l.BRACKET_END_STR;
        if (this.d == null) {
            this.f20145a.i(str3, new f(str3, sioVar));
            this.f20145a.f(str3, new g(sioVar));
            return;
        }
        this.f20145a.i(str2 + " -> runNetWork(" + str + f7l.BRACKET_END_STR, new k(this.d, obj, sioVar, str3));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String h = "BuildNetTask";
        private final NetConfig c;
        private final an2 d;
        private xuc<?, ?> e;
        private String f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$BuildNetTask$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    j.e(j.this).c();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$BuildNetTask$2");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else {
                    j.e(j.this).a();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class c implements utm {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // tb.utm
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                    return;
                }
                j jVar = j.this;
                gph.c(gph.this, j.f(jVar).name, j.g(j.this), j.e(j.this), false);
            }

            @Override // tb.utm
            public void onPrepareSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                    return;
                }
                j jVar = j.this;
                gph.c(gph.this, j.f(jVar).name, j.g(j.this), j.e(j.this), true);
            }
        }

        static {
            t2o.a(481297295);
        }

        public j(NetConfig netConfig, an2 an2Var, String str) {
            this.c = netConfig;
            this.d = an2Var;
            this.f = str;
        }

        public static /* synthetic */ an2 e(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (an2) ipChange.ipc$dispatch("83920e3e", new Object[]{jVar});
            }
            return jVar.d;
        }

        public static /* synthetic */ NetConfig f(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetConfig) ipChange.ipc$dispatch("9d90e410", new Object[]{jVar});
            }
            return jVar.c;
        }

        public static /* synthetic */ xuc g(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xuc) ipChange.ipc$dispatch("c3473b8e", new Object[]{jVar});
            }
            return jVar.e;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/MNNNetWorker$BuildNetTask");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            gph.c(gph.this, this.c.name, null, this.d, false);
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.b(h, "BuildNetwork start [%s]", this.c.name);
            xuc<?, ?> a2 = twi.a(this.c);
            this.e = a2;
            if (a2 == null) {
                agh.c("realtime_MnnNetWorker", "Cannot create mnnNetWorker, there must something wrong, type = " + this.c.type);
                com.etao.feimagesearch.mnn.utils.a.e(this.c, 0L, "-10000", "algorithm not supported");
                gph.b(gph.this).f("MnnMainBuildFailed", new a());
                gph.b(gph.this).i("MnnMainBuildFailed", new b());
                return;
            }
            a2.c(new c(), this.f);
        }
    }

    static {
        t2o.a(481297286);
        twi.b("plt_search", new a());
    }
}
