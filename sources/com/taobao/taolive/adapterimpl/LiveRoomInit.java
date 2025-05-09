package com.taobao.taolive.adapterimpl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.msg.AccsAdapter;
import com.taobao.taolive.adapterimpl.nav.TaoLiveActionUtils;
import com.taobao.taolive.adapterimpl.network.MtopNetworkAdapter;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import com.taobao.tbliveinteractive.jsbridge.TaoLiveTradeTrack;
import java.util.concurrent.ThreadPoolExecutor;
import tb.a7t;
import tb.art;
import tb.aws;
import tb.axg;
import tb.b4s;
import tb.bl9;
import tb.bws;
import tb.byr;
import tb.cnr;
import tb.cqr;
import tb.ctj;
import tb.d3s;
import tb.d8t;
import tb.d9m;
import tb.dws;
import tb.e4s;
import tb.emr;
import tb.err;
import tb.f5h;
import tb.f7t;
import tb.fmr;
import tb.fsw;
import tb.fts;
import tb.fzu;
import tb.g0;
import tb.g2e;
import tb.ggv;
import tb.gq0;
import tb.gu2;
import tb.h3s;
import tb.i5v;
import tb.j3s;
import tb.jcx;
import tb.ks0;
import tb.l39;
import tb.l3s;
import tb.lmr;
import tb.lzu;
import tb.m3h;
import tb.mat;
import tb.o3s;
import tb.p3s;
import tb.q6t;
import tb.qau;
import tb.svq;
import tb.t1h;
import tb.t2o;
import tb.uc;
import tb.ut9;
import tb.v1h;
import tb.v2s;
import tb.vkv;
import tb.wbt;
import tb.wcr;
import tb.wir;
import tb.wpr;
import tb.wur;
import tb.x2s;
import tb.x5t;
import tb.xjr;
import tb.xxg;
import tb.y5t;
import tb.yj4;
import tb.yur;
import tb.zts;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveRoomInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveRoomInit";
    private static LiveRoomInit sInstance = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                LiveRoomInit.access$000(LiveRoomInit.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements art {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(LiveRoomInit liveRoomInit) {
        }

        @Override // tb.art
        public ThreadPoolExecutor a(ThreadPoolType threadPoolType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadPoolExecutor) ipChange.ipc$dispatch("c64c4e30", new Object[]{this, threadPoolType});
            }
            return e4s.b(threadPoolType);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final LiveRoomInit f12990a = new LiveRoomInit(null);

        static {
            t2o.a(779092269);
        }

        public static /* synthetic */ LiveRoomInit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveRoomInit) ipChange.ipc$dispatch("1047d3de", new Object[0]);
            }
            return f12990a;
        }
    }

    static {
        t2o.a(779092266);
    }

    public /* synthetic */ LiveRoomInit(a aVar) {
        this();
    }

    public static /* synthetic */ void access$000(LiveRoomInit liveRoomInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e96cdf", new Object[]{liveRoomInit});
        } else {
            liveRoomInit.initTaoLiveEvocation();
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            c.a();
        }
    }

    private void initTaoLiveEvocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba19079", new Object[]{this});
            return;
        }
        try {
            if (d9m.k() != null) {
                d9m.k().initTaoLiveEvocation();
            }
        } catch (Throwable th) {
            o3s.b(TAG, "[initTaoLiveEvocation] error: " + th.getMessage());
        }
    }

    private LiveRoomInit() {
        v2s.o().N(new zts());
        ctj ctjVar = new ctj();
        ctjVar.d(m3h.e());
        ctjVar.c(new MtopNetworkAdapter());
        v2s.o().d0(ctjVar);
        v2s.o().V(new l3s());
        v2s.o().M(new x2s());
        v2s.o().Q(new j3s());
        v2s.o().f0(new b4s());
        v2s.o().m0(new f7t());
        gq0.z(new dws());
        gq0.E(new wbt());
        v2s.o().b0(new y5t());
        v2s.o().h0(new p3s());
        v2s.o().j0(new a7t());
        gq0.C(new q6t());
        gq0.r(new TaoLiveActionUtils());
        gq0.B(new yur());
        gq0.A(new wur());
        gq0.x(new aws());
        gq0.s(new fts());
        gq0.y(new wcr());
        gq0.w(new mat());
        v2s.o().L(new xjr());
        gq0.t(new ks0());
        gq0.D(new lmr());
        gq0.F(new i5v());
        gq0.v(new h3s());
        gq0.u(new gu2());
        emr.b().c(new fmr());
        lzu lzuVar = new lzu();
        lzuVar.d(m3h.e());
        lzuVar.b(new byr());
        v2s.o().l0(lzuVar);
        v2s.o().a0(new cnr());
        axg axgVar = new axg();
        axgVar.d(m3h.e());
        axgVar.c(new err());
        v2s.o().W(axgVar);
        v2s.o().U(new AccsAdapter());
        v1h v1hVar = new v1h();
        v1hVar.b(new cqr());
        v1hVar.c(m3h.e());
        v2s.o().Y(v1hVar);
        v2s.o().e0(new t1h());
        v2s.o().O(new d3s());
        v2s.o().c0(new d8t());
        v2s.o().X(new xxg());
        g2e q = qau.q("tblive");
        q.f(yj4.TRACK_ORANGES);
        v2s.o().k0(q);
        v2s.o().Z(new f5h());
        g0 g0Var = new g0();
        g0Var.e(m3h.e());
        g0Var.d(new fzu());
        v2s.o().K(g0Var);
        v2s.o().n0(new vkv());
        wir.a().c(new wpr());
        v2s.o().g0(new svq());
        try {
            if (bl9.g().b()) {
                initTaoLiveEvocation();
            } else {
                bl9.g().i(new a());
            }
        } catch (Throwable th) {
            o3s.b(TAG, "[<clinit>] error: " + th.getMessage());
        }
        v2s.o().P(new h3s());
        v2s.o().S(new ut9());
        v2s.o().R(new l39());
        v2s.o().J(new uc());
        v2s.o().T(new bws());
        v2s.o().o0(new jcx());
        v2s.o().i0(new b(this));
        try {
            fsw.i("TaoLiveTradeTrack", TaoLiveTradeTrack.class, true);
        } catch (Throwable th2) {
            x5t.d(TAG, th2.getMessage());
        }
        ggv.f19980a = true;
    }
}
