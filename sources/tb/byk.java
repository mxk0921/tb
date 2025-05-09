package tb;

import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.kmp.nexus.arch.openArch.channel.OpenArchChannelName;
import com.taobao.kmp.nexus.arch.openArch.component.OpenArchObserveMode;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.InputData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.LocalData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.BroadCaster;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.kmp.nexus.arch.openArch.falco.OpenArchFalcoStage;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.jzk;
import tb.q2g;
import tb.voy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class byk extends cc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r2g f16717a;
        public final /* synthetic */ byk b;
        public final /* synthetic */ oyk c;

        public a(r2g r2gVar, byk bykVar, oyk oykVar) {
            this.f16717a = r2gVar;
            this.b = bykVar;
            this.c = oykVar;
        }

        public void a(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cac8703", new Object[]{this, n2gVar});
                return;
            }
            ckf.g(n2gVar, "event");
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "setupBehaviorAspect performPowerMsgSubscribe: " + this.f16717a);
            this.b.x(this.c);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(n2g<Object> n2gVar) {
            a(n2gVar);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r2g f16718a;
        public final /* synthetic */ byk b;
        public final /* synthetic */ oyk c;

        public b(r2g r2gVar, byk bykVar, oyk oykVar) {
            this.f16718a = r2gVar;
            this.b = bykVar;
            this.c = oykVar;
        }

        public void a(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cac8703", new Object[]{this, n2gVar});
                return;
            }
            ckf.g(n2gVar, "event");
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "setupBehaviorAspect SyncNativeLiveDetail: " + this.f16718a);
            byk.q(this.b, this.f16718a, this.c, n2gVar);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(n2g<Object> n2gVar) {
            a(n2gVar);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r2g f16719a;
        public final /* synthetic */ byk b;
        public final /* synthetic */ oyk c;

        public c(r2g r2gVar, byk bykVar, oyk oykVar) {
            this.f16719a = r2gVar;
            this.b = bykVar;
            this.c = oykVar;
        }

        public void a(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cac8703", new Object[]{this, n2gVar});
                return;
            }
            ckf.g(n2gVar, "event");
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "setupBehaviorAspect PerformRequestLiveDetail: " + this.f16719a);
            this.b.a(this.f16719a.b(), this.c);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(n2g<Object> n2gVar) {
            a(n2gVar);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r2g f16720a;
        public final /* synthetic */ byk b;
        public final /* synthetic */ oyk c;

        public d(r2g r2gVar, byk bykVar, oyk oykVar) {
            this.f16720a = r2gVar;
            this.b = bykVar;
            this.c = oykVar;
        }

        public void a(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cac8703", new Object[]{this, n2gVar});
                return;
            }
            ckf.g(n2gVar, "event");
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "setupBehaviorAspect PerformRequestLiveDetail: " + this.f16720a);
            this.b.C(this.f16720a, this.c, n2gVar);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(n2g<Object> n2gVar) {
            a(n2gVar);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1004535817);
    }

    public static /* synthetic */ Object ipc$super(byk bykVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1386897827:
                return super.f((r2g) objArr[0], (oyk) objArr[1]);
            case -1196110870:
                return super.b(objArr[0], (oyk) objArr[1]);
            case -1079828500:
                return super.c((r2g) objArr[0], (oyk) objArr[1]);
            case -988956068:
                return super.d((r2g) objArr[0], (oyk) objArr[1]);
            case -604088809:
                return super.g((r2g) objArr[0], (oyk) objArr[1]);
            case -265840782:
                return super.e((r2g) objArr[0], (oyk) objArr[1]);
            case 1166287307:
                return super.a((Map) objArr[0], (oyk) objArr[1]);
            case 1551925844:
                return bykVar.h((llc) objArr[0], (oyk) objArr[1]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/behavior/OpenArchBehaviorAspectPublicSingle");
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, T] */
    public static final xhv o(Ref$ObjectRef<List<String>> ref$ObjectRef, Map<String, ? extends Object> map, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("269360e2", new Object[]{ref$ObjectRef, map, new Boolean(z)});
        }
        if (map != null) {
            obj = map.get("heartbeatStateList");
        } else {
            obj = null;
        }
        ref$ObjectRef.element = kqu.c(obj);
        return xhv.INSTANCE;
    }

    public static final xhv p(byk bykVar, oyk oykVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("54ce0107", new Object[]{bykVar, oykVar, list});
        }
        ckf.g(list, "params");
        List<String> t = bykVar.t(oykVar);
        if (t != null) {
            list.addAll(t);
        }
        return xhv.INSTANCE;
    }

    public static final /* synthetic */ void q(byk bykVar, r2g r2gVar, oyk oykVar, n2g n2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127116ed", new Object[]{bykVar, r2gVar, oykVar, n2gVar});
        } else {
            bykVar.B(r2gVar, oykVar, n2gVar);
        }
    }

    public static final xhv s(oyk oykVar) {
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7a82e8fc", new Object[]{oykVar});
        }
        if (!(oykVar == null || (h = oykVar.h()) == null)) {
            h.o();
        }
        pus.INSTANCE.k("OpenArchObserveComponent", "", "postBizComponentDidAppearEvent");
        return xhv.INSTANCE;
    }

    public static final xhv u(byk bykVar, oyk oykVar, tsy tsyVar, epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b9ba10d4", new Object[]{bykVar, oykVar, tsyVar, epyVar});
        }
        ckf.g(tsyVar, "task");
        ckf.g(epyVar, "message");
        bykVar.y(oykVar, tsyVar, epyVar);
        return xhv.INSTANCE;
    }

    public static final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85b4a76b", new Object[0]);
        }
        return "performCustomDetailRequest";
    }

    public static final xhv w(long j, wt4 wt4Var, oyk oykVar, byk bykVar, Map map, Map map2, boolean z, LiveDetailResponseData liveDetailResponseData, byg bygVar) {
        Map<String, Object> rawData;
        Long a2;
        Long b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("214c21ae", new Object[]{new Long(j), wt4Var, oykVar, bykVar, map, map2, new Boolean(z), liveDetailResponseData, bygVar});
        }
        Map k = kotlin.collections.a.k(jpu.a(bxl.DETAIL_START_TS, Long.valueOf(j)), jpu.a(bxl.DETAIL_MTOP_END_TS, Long.valueOf(bvt.d(ftt.Companion))), jpu.a(bxl.DETAIL_SUCCESS, Boolean.valueOf(z)));
        if (!(bygVar == null || (b2 = bygVar.b()) == null)) {
            k.put(bxl.DETAIL_RECEIVE_TS, Long.valueOf(b2.longValue()));
        }
        if (!(bygVar == null || (a2 = bygVar.a()) == null)) {
            k.put(bxl.DETAIL_MODEL_TS, Long.valueOf(a2.longValue()));
        }
        Map k2 = kotlin.collections.a.k(jpu.a("liveDetailPerformance", kotlin.collections.a.r(k)));
        Object obj = null;
        if (map2 != null) {
            k2.put("liveDetailResponseOriginalData", map2);
            String jsonString = new KMPJsonObject(map2 instanceof Object ? map2 : null).toJsonString();
            if (jsonString == null) {
                jsonString = "";
            }
            k2.put("liveDetailResponseOriginalString", jsonString);
        }
        InputData B = wt4Var.B();
        if (!(B == null || (rawData = B.getRawData()) == null)) {
            k2.put("liveDetailRequestData", rawData);
        }
        uxk L = oykVar.L();
        e3d g = L != null ? L.g() : null;
        if (liveDetailResponseData != null) {
            hyk h = oykVar.h();
            if (h != null) {
                h.g(liveDetailResponseData);
            }
            String valueOf = String.valueOf(liveDetailResponseData.getLiveId());
            BroadCaster broadCaster = liveDetailResponseData.getBroadCaster();
            String valueOf2 = String.valueOf(broadCaster != null ? broadCaster.getAccountId() : null);
            if (map2 != null) {
                obj = map2.get("liveId");
            }
            pus pusVar = pus.INSTANCE;
            pusVar.g("LiveEngine", "", "livedetail request success : " + valueOf + ' ' + valueOf2 + ' ' + obj);
            if (g != null) {
                g.c(OpenArchFalcoStage.OpenArchFalcoStageDetail, "detailRequestSuccess_".concat(valueOf));
            }
            if (g != null) {
                g.d(OpenArchFalcoStage.OpenArchFalcoStageDetail, "detailRequest", "success_".concat(valueOf));
            }
            if (g != null) {
                g.e(OpenArchFalcoStage.OpenArchFalcoStageDetail);
            }
        } else {
            pus.INSTANCE.g("LiveEngine", "", "livedetail request error ");
            if (g != null) {
                g.d(OpenArchFalcoStage.OpenArchFalcoStageDetail, "detailRequest", "error_0");
            }
            if (g != null) {
                g.a(OpenArchFalcoStage.OpenArchFalcoStageDetail);
            }
        }
        xyk j2 = oykVar.j();
        if (j2 != null) {
            toy a3 = toy.Companion.a();
            q2g.a aVar = q2g.Companion;
            voy.a aVar2 = voy.Companion;
            jzk.a aVar3 = jzk.Companion;
            j2.e(a3, aVar.a(aVar2.a(aVar3.c())), new kzk(new r2g(aVar3.c(), k2), oykVar.k(), null, 4, null));
        }
        bykVar.D(map, oykVar);
        return xhv.INSTANCE;
    }

    public final void B(r2g r2gVar, oyk oykVar, n2g<Object> n2gVar) {
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750e1bfc", new Object[]{this, r2gVar, oykVar, n2gVar});
            return;
        }
        Object a2 = n2gVar != null ? n2gVar.a() : null;
        if (a2 instanceof Map) {
            Object obj = ((Map) a2).get("liveDetailData");
            pus.INSTANCE.k("LiveEngine", "", "performSyncLiveDetail userinfo");
            if (oykVar != null && obj != null && (h = oykVar.h()) != null) {
                h.h(obj);
            }
        }
    }

    public final void C(r2g r2gVar, oyk oykVar, n2g<Object> n2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315363b", new Object[]{this, r2gVar, oykVar, n2gVar});
            return;
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Object a2 = n2gVar != null ? n2gVar.a() : null;
        if (a2 instanceof Map) {
            Object obj = ((Map) a2).get("apppActiveType");
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "processAppActive type: " + obj);
            if (oykVar != null && obj != null) {
                if (ckf.b(obj, "becomeActive")) {
                    x(oykVar);
                } else if (ckf.b(obj, g4.b.Q)) {
                    A(oykVar);
                }
            }
        }
    }

    public final void D(Map<String, ? extends Object> map, oyk oykVar) {
        jzk jzkVar;
        n1l N;
        s2l l;
        pzk o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19701a8b", new Object[]{this, map, oykVar});
            return;
        }
        if (oykVar == null || (l = oykVar.l()) == null || (o = l.o()) == null) {
            jzkVar = null;
        } else {
            jzkVar = o.e();
        }
        jzk.a aVar = jzk.Companion;
        if (ckf.b(jzkVar, aVar.m()) && !n1l.Companion.a()) {
            pus pusVar = pus.INSTANCE;
            pusVar.k("LiveEngine", "", "assembleLiveDetailCoreData didReday: " + aVar.c());
            hyk h = oykVar.h();
            if (h != null) {
                h.o();
            }
        }
        if (oykVar != null && (N = oykVar.N()) != null) {
            N.j(new k1l(Boolean.TRUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.cc, tb.f3d
    public e2g<gic> b(Object obj, oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("b8b4cbea", new Object[]{this, obj, oykVar});
        }
        if (oykVar != null) {
            fyk g = oykVar.g();
            gyk gykVar = null;
            if (g != null) {
                i2g l = g.l();
                if (l instanceof gyk) {
                    gykVar = l;
                }
                gykVar = gykVar;
            }
            if (gykVar != null) {
                gykVar.h();
            }
        }
        return super.b(obj, oykVar);
    }

    @Override // tb.cc, tb.f3d
    public e2g<? extends gic> c(r2g r2gVar, oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("bfa31fec", new Object[]{this, r2gVar, oykVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        wus.INSTANCE.e();
        return super.c(r2gVar, oykVar);
    }

    @Override // tb.cc, tb.f3d
    public e2g<? extends gic> d(r2g r2gVar, oyk oykVar) {
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("c50dba5c", new Object[]{this, r2gVar, oykVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "assembleInputCoreData intent: " + r2gVar);
        Object obj = r2gVar.b().get("localParams");
        if (!(oykVar == null || obj == null || (h = oykVar.h()) == null)) {
            h.j(obj);
        }
        return super.d(r2gVar, oykVar);
    }

    @Override // tb.cc, tb.f3d
    public e2g<? extends gic> e(r2g r2gVar, oyk oykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("f0279772", new Object[]{this, r2gVar, oykVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "performPowerMsgUnSubscribe intent: " + r2gVar);
        A(oykVar);
        return super.e(r2gVar, oykVar);
    }

    @Override // tb.cc, tb.f3d
    public e2g<gic> f(r2g r2gVar, oyk oykVar) {
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("ad559e5d", new Object[]{this, r2gVar, oykVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "assembleInputCoreData intent: " + r2gVar);
        Object obj = r2gVar.b().get("inputParams");
        if (!(oykVar == null || obj == null || (h = oykVar.h()) == null)) {
            h.e(obj);
        }
        return super.f(r2gVar, oykVar);
    }

    public final void r(oyk oykVar) {
        n1l N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e564af7e", new Object[]{this, oykVar});
        } else if (oykVar != null && (N = oykVar.N()) != null) {
            N.m(yz3.l(new j1l(jzk.Companion.m().b()), new k1l(Boolean.TRUE)), OpenArchObserveMode.Multitime, new g1a() { // from class: tb.zxk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv s;
                    s = byk.s((oyk) obj);
                    return s;
                }
            });
        }
    }

    public final List<String> t(oyk oykVar) {
        eyk M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1fa79cc", new Object[]{this, oykVar});
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (!(oykVar == null || (M = oykVar.M()) == null)) {
            M.e(OpenArchChannelName.OpenArchChannelGetPowermsgHeartbeatInfo, kotlin.collections.a.h(), new u1a() { // from class: tb.ayk
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv o;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    o = byk.o(Ref$ObjectRef.this, (Map) obj, booleanValue);
                    return o;
                }
            });
        }
        return (List) ref$ObjectRef.element;
    }

    public final void A(oyk oykVar) {
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104d89d5", new Object[]{this, oykVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine-MessageManager", "", "performPowerMsgUnSubscribe");
        String str = null;
        wt4 m = (oykVar == null || (h = oykVar.h()) == null) ? null : h.m();
        if (m != null && m.C().isPmHasRegister()) {
            okj E = m.E();
            if (E != null) {
                str = E.g();
            }
            if (!ckf.b(str, "false")) {
                m.C().setPmHasRegister(false);
                f1l f1lVar = f1l.INSTANCE;
                tsy Y = f1lVar.Y(oykVar.k());
                if (Y != null) {
                    Y.z(String.valueOf(m.C().getPmSessionID()));
                    pusVar.f("LiveEngine-MessageManager", "", "performPowerMsgUnSubscribe " + Y.o() + ' ' + Y.k());
                    f1lVar.F0(Y);
                }
            }
        }
    }

    @Override // tb.cc, tb.f3d
    public e2g<? extends gic> a(final Map<String, ? extends Object> map, final oyk oykVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String useLiveFandom;
        String sjsdItemId;
        okj E;
        LocalData C;
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("458421cb", new Object[]{this, map, oykVar});
        }
        pus pusVar = pus.INSTANCE;
        pusVar.i("LiveEngine", "", new d1a() { // from class: tb.vxk
            @Override // tb.d1a
            public final Object invoke() {
                String v;
                v = byk.v();
                return v;
            }
        });
        String str8 = null;
        final wt4 m = (oykVar == null || (h = oykVar.h()) == null) ? null : h.m();
        StringBuilder sb = new StringBuilder("performCustomDetailRequest start ");
        sb.append((m == null || (C = m.C()) == null) ? null : Boolean.valueOf(C.isLiveDetailHasRequest()));
        sb.append(' ');
        sb.append((m == null || (E = m.E()) == null) ? null : E.f());
        pusVar.k("LiveEngine", "", sb.toString());
        if (m != null && !m.C().isLiveDetailHasRequest()) {
            okj E2 = m.E();
            String str9 = "true";
            if (ckf.b(E2 != null ? E2.f() : null, str9)) {
                final long d2 = bvt.d(ftt.Companion);
                m.C().setLiveDetailHasRequest(true);
                kyg kygVar = new kyg();
                InputData B = m.B();
                kygVar.i(m.n());
                kygVar.j(m.p());
                if (B != null && (sjsdItemId = B.getSjsdItemId()) != null) {
                    str8 = sjsdItemId;
                } else if (B != null) {
                    str8 = B.getTimeMovingItemId();
                }
                kygVar.n(str8);
                kygVar.m(m.s());
                if (B == null || (str = B.getNeedRecommend()) == null) {
                    str = "";
                }
                kygVar.k(str);
                kygVar.d(m.g());
                if (B == null || (str2 = B.getTimeMovingItemId()) == null) {
                    str2 = "";
                }
                kygVar.p(str2);
                if (B == null || (str3 = B.getKeyPointId()) == null) {
                    str3 = "";
                }
                kygVar.h(str3);
                if (B == null || (str4 = B.getHoldItemIds()) == null) {
                    str4 = "";
                }
                kygVar.f(str4);
                if (B == null || (str5 = B.getItemHoldType()) == null) {
                    str5 = "";
                }
                kygVar.g(str5);
                kygVar.q(m.y());
                kygVar.e(m.h());
                kygVar.o(m.w());
                if (B == null || (str6 = B.getOuterParam()) == null) {
                    str6 = "";
                }
                kygVar.l(str6);
                if (B == null || (str7 = B.getUserId()) == null) {
                    str7 = "";
                }
                kygVar.c(str7);
                if (jvs.Companion.b()) {
                    InputData B2 = m.B();
                    if (!(B2 == null || (useLiveFandom = B2.getUseLiveFandom()) == null)) {
                        str9 = useLiveFandom;
                    }
                    kygVar.r(str9);
                }
                pusVar.g("LiveEngine", "", "livedetail request start " + kygVar.a());
                jyg.INSTANCE.h(kygVar, new y1a() { // from class: tb.wxk
                    @Override // tb.y1a
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        xhv w;
                        byk bykVar = this;
                        Map map2 = map;
                        w = byk.w(d2, m, oykVar, bykVar, map2, (Map) obj, ((Boolean) obj2).booleanValue(), (LiveDetailResponseData) obj3, (byg) obj4);
                        return w;
                    }
                });
            }
        }
        return super.a(map, oykVar);
    }

    public final void x(final oyk oykVar) {
        String e;
        x4j D;
        LiveDetailResponseData a2;
        hyk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fe3b6e", new Object[]{this, oykVar});
            return;
        }
        String str = null;
        wt4 m = (oykVar == null || (h = oykVar.h()) == null) ? null : h.m();
        if (ckf.b((m == null || (D = m.D()) == null || (a2 = D.a()) == null) ? null : a2.getRoomStatus(), "2")) {
            pus.INSTANCE.k("LiveEngine-MessageManager", "", "performPowerMsgSubscribe is replay live");
        } else if (m != null) {
            okj E = m.E();
            if (E != null) {
                str = E.g();
            }
            if (ckf.b(str, "true") && !m.C().isPmHasRegister()) {
                m.C().setPmHasRegister(true);
                f1l f1lVar = f1l.INSTANCE;
                tsy Y = f1lVar.Y(oykVar.k());
                if (Y != null) {
                    Y.E(new g1a() { // from class: tb.xxk
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv p;
                            p = byk.p(byk.this, oykVar, (List) obj);
                            return p;
                        }
                    });
                }
                if (Y != null) {
                    Y.q(new u1a() { // from class: tb.yxk
                        @Override // tb.u1a
                        public final Object invoke(Object obj, Object obj2) {
                            xhv u;
                            u = byk.u(byk.this, oykVar, (tsy) obj, (epy) obj2);
                            return u;
                        }
                    });
                }
                if (Y != null) {
                    m.C().setPmSessionID(Y.k());
                    okj E2 = m.E();
                    if (!(E2 == null || (e = E2.e()) == null)) {
                        Y.t(e);
                    }
                    pus pusVar = pus.INSTANCE;
                    pusVar.k("LiveEngine-MessageManager", "", "performPowerMsgSubscribe subscribe " + Y.o() + ' ' + Y.h() + ' ' + Y.g() + "  " + Y.e());
                    f1lVar.E0(Y);
                }
            }
        }
    }

    @Override // tb.cc, tb.f3d
    public e2g<? extends gic> g(r2g r2gVar, oyk oykVar) {
        n1l N;
        xyk j;
        xyk j2;
        xyk j3;
        xyk j4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("dbfe5617", new Object[]{this, r2gVar, oykVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        pus pusVar = pus.INSTANCE;
        pusVar.k("LiveEngine", "", "setupBehaviorAspect intent: " + r2gVar);
        if (!(oykVar == null || (j4 = oykVar.j()) == null)) {
            j4.g(q2g.Companion.a(voy.Companion.a(jzk.Companion.b())), toy.Companion.a(), new a(r2gVar, this, oykVar));
        }
        if (!(oykVar == null || (j3 = oykVar.j()) == null)) {
            j3.g(q2g.Companion.a("DataServiceIntent_SyncNativeLiveDetail"), toy.Companion.a(), new b(r2gVar, this, oykVar));
        }
        if (!(oykVar == null || (j2 = oykVar.j()) == null)) {
            j2.g(q2g.Companion.a("DataServiceIntent_PerformRequestLiveDetail"), toy.Companion.a(), new c(r2gVar, this, oykVar));
        }
        if (!(oykVar == null || (j = oykVar.j()) == null)) {
            j.g(q2g.Companion.a("DataServiceIntent_AppActiveEvent"), toy.Companion.a(), new d(r2gVar, this, oykVar));
        }
        if (!(oykVar == null || (N = oykVar.N()) == null)) {
            N.n(yz3.l(new j1l(null), new k1l(null)));
        }
        r(oykVar);
        return super.g(r2gVar, oykVar);
    }

    public final void y(oyk oykVar, tsy tsyVar, epy epyVar) {
        xyk j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3f1864", new Object[]{this, oykVar, tsyVar, epyVar});
            return;
        }
        ckf.g(tsyVar, "task");
        ckf.g(epyVar, "message");
        Map k = kotlin.collections.a.k(jpu.a("PowerMsgData", epyVar), jpu.a("PowerMsgSubscibeModel", tsyVar));
        if (oykVar != null && (j = oykVar.j()) != null) {
            j.e(toy.Companion.d(), q2g.Companion.a("DataServiceIntent_PowerMsgReceiveMessage"), new kzk(new r2g(jzk.Companion.a(), k), oykVar.k(), null, 4, null));
        }
    }
}
