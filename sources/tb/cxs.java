package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtFansClubModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeDataSourceModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cxs INSTANCE = new cxs();

    static {
        t2o.a(1010827388);
    }

    public static final xhv d(g1a g1aVar, l0g l0gVar, boolean z, TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("fec275f2", new Object[]{g1aVar, l0gVar, new Boolean(z), taoLiveKtFansClubModel});
        }
        ckf.g(l0gVar, "receiveResult");
        TaoLiveKtFansClubModel taoLiveKtFansClubModel2 = new TaoLiveKtFansClubModel();
        if (taoLiveKtFansClubModel != null) {
            taoLiveKtFansClubModel.setOriginData(l0gVar.a());
        } else {
            taoLiveKtFansClubModel = taoLiveKtFansClubModel2;
        }
        g1aVar.invoke(taoLiveKtFansClubModel);
        return xhv.INSTANCE;
    }

    public final void c(Map<String, String> map, final g1a<? super TaoLiveKtFansClubModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2788dc2b", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        w1a ywsVar = new w1a() { // from class: tb.yws
            @Override // tb.w1a
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                xhv d;
                d = cxs.d(g1a.this, (l0g) obj, ((Boolean) obj2).booleanValue(), (TaoLiveKtFansClubModel) obj3);
                return d;
            }
        };
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.iliad.interact.reward.fansclub.status version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.iliad.interact.reward.fansclub.status", "1.0", map, f, null, null, null, new a("mtop.iliad.interact.reward.fansclub.status", ywsVar), 112, null);
    }

    public final void e(Map<String, String> map, final g1a<? super TaoLiveKtSubscribeModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd79fdf", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        w1a axsVar = new w1a() { // from class: tb.axs
            @Override // tb.w1a
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                xhv f;
                f = cxs.f(g1a.this, (l0g) obj, ((Boolean) obj2).booleanValue(), (TaoLiveKtSubscribeModel) obj3);
                return f;
            }
        };
        Map f = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.tblive.live.growth.query version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.tblive.live.growth.query", "1.0", map, f, null, null, null, new b("mtop.tblive.live.growth.query", axsVar), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f17421a;

        /* compiled from: Taobao */
        /* renamed from: tb.cxs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C0894a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17422a;
            public final /* synthetic */ l0g b;

            public C0894a(String str, l0g l0gVar) {
                this.f17422a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f17422a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17423a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f17423a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f17423a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
            this.f17421a = w1aVar;
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool) {
            a(l0gVar, bool.booleanValue());
            return xhv.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.io.Serializable] */
        public void a(l0g l0gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a12193", new Object[]{this, l0gVar, new Boolean(z)});
                return;
            }
            ckf.g(l0gVar, p1.d);
            l1t l1tVar = l1t.INSTANCE;
            l1tVar.a(new C0894a("mtop.iliad.interact.reward.fansclub.status", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtFansClubModel.class));
                    l1tVar.a(new b("mtop.iliad.interact.reward.fansclub.status", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.iliad.interact.reward.fansclub.status data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f17421a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f17424a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17425a;
            public final /* synthetic */ l0g b;

            public a(String str, l0g l0gVar) {
                this.f17425a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f17425a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.cxs$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C0895b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17426a;
            public final /* synthetic */ Ref$ObjectRef b;

            public C0895b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f17426a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f17426a + " model:" + this.b.element;
            }
        }

        public b(String str, w1a w1aVar) {
            this.f17424a = w1aVar;
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool) {
            a(l0gVar, bool.booleanValue());
            return xhv.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.io.Serializable] */
        public void a(l0g l0gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a12193", new Object[]{this, l0gVar, new Boolean(z)});
                return;
            }
            ckf.g(l0gVar, p1.d);
            l1t l1tVar = l1t.INSTANCE;
            l1tVar.a(new a("mtop.tblive.live.growth.query", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtSubscribeModel.class));
                    l1tVar.a(new C0895b("mtop.tblive.live.growth.query", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.tblive.live.growth.query data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f17424a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    public static final xhv f(g1a g1aVar, l0g l0gVar, boolean z, TaoLiveKtSubscribeModel taoLiveKtSubscribeModel) {
        TaoLiveKtSubscribeDataSourceModel dataSource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("424f6c9f", new Object[]{g1aVar, l0gVar, new Boolean(z), taoLiveKtSubscribeModel});
        }
        ckf.g(l0gVar, "receiveResult");
        if (z && taoLiveKtSubscribeModel != null && (dataSource = taoLiveKtSubscribeModel.getDataSource()) != null && dataSource.getShowPanel()) {
            taoLiveKtSubscribeModel.setOriginData(l0gVar.a());
            g1aVar.invoke(taoLiveKtSubscribeModel);
        }
        return xhv.INSTANCE;
    }
}
