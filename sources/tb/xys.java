package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResultModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentFetchModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtHotSaleModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.thc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xys INSTANCE = new xys();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements w1a<l0g, Boolean, TaoLiveKtHotSaleModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<TaoLiveKtHotSaleModel, xhv> f31704a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super TaoLiveKtHotSaleModel, xhv> g1aVar) {
            this.f31704a = g1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66dad10b", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtHotSaleModel});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            if (z && taoLiveKtHotSaleModel != null) {
                taoLiveKtHotSaleModel.setOriginData(l0gVar.a());
                this.f31704a.invoke(taoLiveKtHotSaleModel);
            }
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtHotSaleModel);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements w1a<l0g, Boolean, TaoLiveKtCommentFetchModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<TaoLiveKtCommentFetchModel, xhv> f31708a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(g1a<? super TaoLiveKtCommentFetchModel, xhv> g1aVar) {
            this.f31708a = g1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6eabc702", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtCommentFetchModel});
                return;
            }
            ckf.g(l0gVar, p1.d);
            if (z && taoLiveKtCommentFetchModel != null) {
                taoLiveKtCommentFetchModel.setOriginData(l0gVar.a());
                this.f31708a.invoke(taoLiveKtCommentFetchModel);
            }
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtCommentFetchModel);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f implements w1a<l0g, Boolean, TaoLiveKtBaseModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a<Map<String, ? extends Object>, Boolean, xhv> f31712a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(u1a<? super Map<String, ? extends Object>, ? super Boolean, xhv> u1aVar) {
            this.f31712a = u1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f542b33", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtBaseModel});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            this.f31712a.invoke(l0gVar.a(), Boolean.valueOf(z));
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtBaseModel);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class h implements w1a<l0g, Boolean, TaoLiveKtCommentSendResultModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a<TaoLiveKtCommentSendResultModel, Boolean, xhv> f31716a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(u1a<? super TaoLiveKtCommentSendResultModel, ? super Boolean, xhv> u1aVar) {
            this.f31716a = u1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ecc6080", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtCommentSendResultModel});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            if (taoLiveKtCommentSendResultModel == null) {
                taoLiveKtCommentSendResultModel = new TaoLiveKtCommentSendResultModel();
            }
            j0g b = l0gVar.b();
            if (b == null || (str = b.a()) == null) {
                str = "发送失败";
            }
            taoLiveKtCommentSendResultModel.setErrorMsg(str);
            taoLiveKtCommentSendResultModel.setOriginData(l0gVar.a());
            this.f31716a.invoke(taoLiveKtCommentSendResultModel, Boolean.valueOf(z));
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtCommentSendResultModel);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class j implements w1a<l0g, Boolean, TaoLiveKtBaseModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a<Map<String, ? extends Object>, Boolean, xhv> f31720a;

        /* JADX WARN: Multi-variable type inference failed */
        public j(u1a<? super Map<String, ? extends Object>, ? super Boolean, xhv> u1aVar) {
            this.f31720a = u1aVar;
        }

        public void a(l0g l0gVar, boolean z, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f542b33", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtBaseModel});
                return;
            }
            ckf.g(l0gVar, "receiveResult");
            this.f31720a.invoke(l0gVar.a(), Boolean.valueOf(z));
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(l0g l0gVar, Boolean bool, TaoLiveKtBaseModel taoLiveKtBaseModel) {
            a(l0gVar, bool.booleanValue(), taoLiveKtBaseModel);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827339);
    }

    public final void a(Map<String, ? extends Object> map, g1a<? super TaoLiveKtHotSaleModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb44558a", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        b bVar = new b(g1aVar);
        Map f2 = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.tblive.live.comment.shop.atmosphere version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.tblive.live.comment.shop.atmosphere", "1.0", map, f2, null, null, null, new a("mtop.tblive.live.comment.shop.atmosphere", bVar), 112, null);
    }

    public final void b(Map<String, ? extends Object> map, g1a<? super TaoLiveKtCommentFetchModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71442bcf", new Object[]{this, map, g1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(g1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        d dVar = new d(g1aVar);
        Map f2 = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.taobao.iliad.comment.query.latest version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.taobao.iliad.comment.query.latest", "1.0", map, f2, null, null, null, new c("mtop.taobao.iliad.comment.query.latest", dVar), 112, null);
    }

    public final void c(Map<String, ? extends Object> map, u1a<? super Map<String, ? extends Object>, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a017569", new Object[]{this, map, u1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(u1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        f fVar = new f(u1aVar);
        Map f2 = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.taobao.livexshow.agent.greet version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.taobao.livexshow.agent.greet", "1.0", map, f2, null, null, null, new e("mtop.taobao.livexshow.agent.greet", fVar), 112, null);
    }

    public final void d(Map<String, String> map, u1a<? super TaoLiveKtCommentSendResultModel, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2058b27", new Object[]{this, map, u1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(u1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        h hVar = new h(u1aVar);
        Map f2 = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.taobao.iliad.comment.publish version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.taobao.iliad.comment.publish", "1.0", map, f2, null, null, null, new g("mtop.taobao.iliad.comment.publish", hVar), 112, null);
    }

    public final void e(Map<String, ? extends Object> map, u1a<? super Map<String, ? extends Object>, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66080a", new Object[]{this, map, u1aVar});
            return;
        }
        ckf.g(map, "params");
        ckf.g(u1aVar, "callback");
        p1t p1tVar = p1t.INSTANCE;
        j jVar = new j(u1aVar);
        Map f2 = v3i.f(jpu.a(p1t.kLiveMtopBizCodeKey, "TAOBAO"));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(((ns3) dun.b(p1tVar.getClass())).getSimpleName());
        pusVar.f(valueOf, "", "input api:mtop.taobao.livexshow.live.comment.switch version:1.0 data:" + l1t.INSTANCE.c(map));
        thc.a.a(mhr.d0(), "mtop.taobao.livexshow.live.comment.switch", "1.0", map, f2, null, null, null, new i("mtop.taobao.livexshow.live.comment.switch", jVar), 112, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f31701a;

        /* compiled from: Taobao */
        /* renamed from: tb.xys$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class C1103a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31702a;
            public final /* synthetic */ l0g b;

            public C1103a(String str, l0g l0gVar) {
                this.f31702a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f31702a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31703a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f31703a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f31703a + " model:" + this.b.element;
            }
        }

        public a(String str, w1a w1aVar) {
            this.f31701a = w1aVar;
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
            l1tVar.a(new C1103a("mtop.tblive.live.comment.shop.atmosphere", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtHotSaleModel.class));
                    l1tVar.a(new b("mtop.tblive.live.comment.shop.atmosphere", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.tblive.live.comment.shop.atmosphere data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f31701a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f31705a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31706a;
            public final /* synthetic */ l0g b;

            public a(String str, l0g l0gVar) {
                this.f31706a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f31706a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31707a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f31707a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f31707a + " model:" + this.b.element;
            }
        }

        public c(String str, w1a w1aVar) {
            this.f31705a = w1aVar;
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
            l1tVar.a(new a("mtop.taobao.iliad.comment.query.latest", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtCommentFetchModel.class));
                    l1tVar.a(new b("mtop.taobao.iliad.comment.query.latest", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.taobao.iliad.comment.query.latest data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f31705a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f31709a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31710a;
            public final /* synthetic */ l0g b;

            public a(String str, l0g l0gVar) {
                this.f31710a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f31710a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31711a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f31711a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f31711a + " model:" + this.b.element;
            }
        }

        public e(String str, w1a w1aVar) {
            this.f31709a = w1aVar;
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
            l1tVar.a(new a("mtop.taobao.livexshow.agent.greet", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtBaseModel.class));
                    l1tVar.a(new b("mtop.taobao.livexshow.agent.greet", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.taobao.livexshow.agent.greet data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f31709a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class g implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f31713a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31714a;
            public final /* synthetic */ l0g b;

            public a(String str, l0g l0gVar) {
                this.f31714a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f31714a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31715a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f31715a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f31715a + " model:" + this.b.element;
            }
        }

        public g(String str, w1a w1aVar) {
            this.f31713a = w1aVar;
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
            l1tVar.a(new a("mtop.taobao.iliad.comment.publish", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtCommentSendResultModel.class));
                    l1tVar.a(new b("mtop.taobao.iliad.comment.publish", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.taobao.iliad.comment.publish data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f31713a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class i implements u1a<l0g, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1a f31717a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31718a;
            public final /* synthetic */ l0g b;

            public a(String str, l0g l0gVar) {
                this.f31718a = str;
                this.b = l0gVar;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output callback api:" + this.f31718a + " data:" + this.b.a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements d1a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31719a;
            public final /* synthetic */ Ref$ObjectRef b;

            public b(String str, Ref$ObjectRef ref$ObjectRef) {
                this.f31719a = str;
                this.b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
                }
                return "TaoLiveKtMTop output success api:" + this.f31719a + " model:" + this.b.element;
            }
        }

        public i(String str, w1a w1aVar) {
            this.f31717a = w1aVar;
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
            l1tVar.a(new a("mtop.taobao.livexshow.live.comment.switch", l0gVar));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (l0gVar.a() != null) {
                try {
                    Map<String, Object> a2 = l0gVar.a();
                    if (a2 == null) {
                        a2 = null;
                    }
                    ref$ObjectRef.element = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(a2), dun.b(TaoLiveKtBaseModel.class));
                    l1tVar.a(new b("mtop.taobao.livexshow.live.comment.switch", ref$ObjectRef));
                } catch (Exception unused) {
                    mhr.a0(p1t.TaoLiveKtMTopTag, "TaoLiveKtMTop output error api:mtop.taobao.livexshow.live.comment.switch data:" + l1t.INSTANCE.c(l0gVar.a()));
                }
            }
            w1a w1aVar = this.f31717a;
            if (w1aVar != null) {
                w1aVar.invoke(l0gVar, Boolean.valueOf(z), ref$ObjectRef.element);
            }
        }
    }
}
