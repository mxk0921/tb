package com.taobao.android.turbo.service.redpoint;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.adapter.RequestType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.PrefetchModel;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.redpoint.tabicon.LTVTabIconManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.b7d;
import tb.bid;
import tb.bwc;
import tb.byb;
import tb.ckf;
import tb.did;
import tb.foc;
import tb.ft1;
import tb.g1a;
import tb.g7e;
import tb.i04;
import tb.j5o;
import tb.kee;
import tb.m7e;
import tb.o2c;
import tb.p6d;
import tb.plk;
import tb.prv;
import tb.ptn;
import tb.q2c;
import tb.qgb;
import tb.qpu;
import tb.qtn;
import tb.r2c;
import tb.r69;
import tb.rjb;
import tb.s7k;
import tb.sod;
import tb.t2c;
import tb.t2o;
import tb.tgb;
import tb.tjb;
import tb.tpu;
import tb.ud0;
import tb.wps;
import tb.xhv;
import tb.y9a;
import tb.z78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RedpointService implements did, qgb, o2c, g7e, r2c, rjb, p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DEFAULT_TAB_TYPE = "guangguang";
    public static final String TAG = "RedpointService";
    public qpu b;
    public wps c;
    public s7k d;
    public LTVTabIconManager e;
    public PrefetchModel f;
    public boolean g;
    public boolean h;
    public boolean i;
    public RedpointModel j;
    public RedpointModel k;

    /* renamed from: a  reason: collision with root package name */
    public final plk<bid> f9771a = new plk<>();
    public boolean l = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455612);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455611);
        t2o.a(916455459);
        t2o.a(919601262);
        t2o.a(919601295);
        t2o.a(919601343);
        t2o.a(919601280);
        t2o.a(916455433);
        t2o.a(919601322);
    }

    public static final /* synthetic */ void K1(RedpointService redpointService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fe3fbf", new Object[]{redpointService, new Boolean(z)});
        } else {
            redpointService.i = z;
        }
    }

    public static /* synthetic */ void P1(RedpointService redpointService, TriggerType triggerType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc65b4a1", new Object[]{redpointService, triggerType, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            triggerType = TriggerType.INIT;
        }
        redpointService.O1(triggerType);
    }

    public static final /* synthetic */ void e1(RedpointService redpointService, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4470ffb8", new Object[]{redpointService, map});
        } else {
            redpointService.L1(map);
        }
    }

    public static final /* synthetic */ void g1(RedpointService redpointService, TriggerType triggerType, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c09307", new Object[]{redpointService, triggerType, map});
        } else {
            redpointService.Q1(triggerType, map);
        }
    }

    @Override // tb.did
    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3f4791", new Object[]{this, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "updateLTVEnabled: " + z, null, 4, null);
        this.g = z;
    }

    @Override // tb.qgb
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e78b620", new Object[]{this});
        } else if (!N1()) {
            O1(TriggerType.ACTIVE);
        }
    }

    @Override // tb.did
    public String C1() {
        String e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6147350a", new Object[]{this});
        }
        if (this.g) {
            LTVTabIconManager lTVTabIconManager = this.e;
            if (lTVTabIconManager == null || (e = lTVTabIconManager.e()) == null) {
                return "";
            }
        } else {
            s7k s7kVar = this.d;
            if (s7kVar == null || (e = s7kVar.e()) == null) {
                return "";
            }
        }
        return e;
    }

    @Override // tb.did
    public String F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5339ce", new Object[]{this});
        }
        wps wpsVar = this.c;
        if (wpsVar != null) {
            return wpsVar.d();
        }
        ckf.y("tabBarItemManager");
        throw null;
    }

    @Override // tb.vpj
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
            return;
        }
        wps wpsVar = this.c;
        if (wpsVar == null) {
            ckf.y("tabBarItemManager");
            throw null;
        } else if (wpsVar != null) {
            wpsVar.e();
        }
    }

    public final void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a644456", new Object[]{this});
            return;
        }
        qpu qpuVar = this.b;
        if (qpuVar != null) {
            this.d = new s7k(qpuVar);
            qpu qpuVar2 = this.b;
            if (qpuVar2 != null) {
                this.e = new LTVTabIconManager(qpuVar2);
                s7k s7kVar = this.d;
                ckf.d(s7kVar);
                s7kVar.o();
                return;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c902cd", new Object[]{this})).booleanValue();
        }
        qpu qpuVar = this.b;
        if (qpuVar != null) {
            return ((tjb) qpuVar.getService(tjb.class)).B0();
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.did
    public void O0(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac0de2", new Object[]{this, redpointModel});
        } else if (!ckf.b(this.j, redpointModel) || this.l) {
            this.l = false;
            this.j = redpointModel;
            this.f9771a.d(new RedpointService$notifyRedpointChanged$1(redpointModel));
        }
    }

    public final void R1(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64c1969", new Object[]{this, g1aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("queryArgs", RedpointService$requestSmartFeature$1.INSTANCE);
        hashMap.put("invokeId", "guangguang.growth.request.redpoint");
        hashMap.put("bizIdentifier", "guangguang");
        hashMap.put("currentScene", "guangguang");
        qtn qtnVar = new qtn(g1aVar);
        ptn ptnVar = new ptn(g1aVar);
        qpu qpuVar = this.b;
        if (qpuVar != null) {
            ((kee) qpuVar.getService(kee.class)).Q0("TBUserActionJSBridge", "getFeature", hashMap, qtnVar, ptnVar);
        } else {
            ckf.y("context");
            throw null;
        }
    }

    public final void S1(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84fefbe", new Object[]{this, redpointModel});
        } else if (redpointModel != null) {
            if (redpointModel.getPrefetchModel() != null) {
                this.f = redpointModel.getPrefetchModel();
            }
            A0(redpointModel.getHitLTV());
        }
    }

    @Override // tb.cid
    public void T0(bid bidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c752e39e", new Object[]{this, bidVar});
            return;
        }
        ckf.g(bidVar, DataReceiveMonitor.CB_LISTENER);
        this.f9771a.a(bidVar);
    }

    public final void T1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12275d4a", new Object[]{this, obj});
            return;
        }
        foc d = ud0.Companion.d();
        List<TabModel> a2 = TabModel.Companion.a(obj);
        if (d.isLogin() && a2 != null) {
            Map<DrawerModel.DrawerGravity, DrawerModel> d2 = DrawerModel.Companion.d((TabModel) i04.m0(a2));
            qpu qpuVar = this.b;
            if (qpuVar != null) {
                sod service = qpuVar.getService(byb.class);
                if (service != null) {
                    ((ft1) service).e1(a2, d2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.service.data.BaseDataService");
            }
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.cid
    public void U0(bid bidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b38a9b", new Object[]{this, bidVar});
            return;
        }
        ckf.g(bidVar, DataReceiveMonitor.CB_LISTENER);
        this.f9771a.c(bidVar);
    }

    @Override // tb.did
    public PrefetchModel o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefetchModel) ipChange.ipc$dispatch("6fa0d19a", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.b = qpuVar;
        ((tgb) qpuVar.getService(tgb.class)).r(this);
        ((q2c) qpuVar.getService(q2c.class)).r(this);
        ((m7e) qpuVar.getService(m7e.class)).r(this);
        ((t2c) qpuVar.getService(t2c.class)).x(this);
        ((tjb) qpuVar.getService(tjb.class)).B(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        this.c = new wps(qpuVar);
        if (!N1()) {
            M1();
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((tgb) qpuVar.getService(tgb.class)).x(this);
        ((q2c) qpuVar.getService(q2c.class)).x(this);
        ((m7e) qpuVar.getService(m7e.class)).x(this);
        ((t2c) qpuVar.getService(t2c.class)).r(this);
        ((tjb) qpuVar.getService(tjb.class)).L(this);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
        s7k s7kVar = this.d;
        if (s7kVar != null) {
            s7kVar.l();
        }
        LTVTabIconManager lTVTabIconManager = this.e;
        if (lTVTabIconManager != null) {
            lTVTabIconManager.s();
        }
    }

    @Override // tb.r2c
    public void onEditionVersionInfoChanged(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58f2b33", new Object[]{this, z78Var});
        } else {
            ckf.g(z78Var, "editionVersionInfo");
        }
    }

    @Override // tb.r2c
    public void onElderVersionChanged(boolean z) {
        s7k s7kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b92486", new Object[]{this, new Boolean(z)});
        } else if (!this.g && (s7kVar = this.d) != null) {
            s7k.s(s7kVar, false, 1, null);
        }
    }

    @Override // tb.r2c
    public void onFestivalChanged(r69 r69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87102e45", new Object[]{this, r69Var});
        } else {
            ckf.g(r69Var, "festivalInfo");
        }
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        } else if (!N1()) {
            P1(this, null, 1, null);
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        if (this.d == null && engineState == EngineState.IDLE) {
            M1();
        }
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        boolean z;
        Intent intent;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        Activity a2 = ud0.Companion.a().a();
        if (a2 == null || (intent = a2.getIntent()) == null) {
            z = false;
        } else {
            z = intent.getBooleanExtra(y9a.EXTRA_KEY_CLICK_TO_TAB_CHANGE, false);
        }
        if (!z || i != 1) {
            z2 = false;
        }
        this.h = z2;
    }

    @Override // tb.ujb
    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.navigation.a.g
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    @Override // tb.did
    public boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933c7212", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.did
    public RedpointModel t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedpointModel) ipChange.ipc$dispatch("3021c0ea", new Object[]{this});
        }
        return this.k;
    }

    @Override // tb.did
    public boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9f2fa85", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    @Override // tb.qgb
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cab48b", new Object[]{this});
        }
    }

    @Override // tb.did
    public String x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4558dc56", new Object[]{this});
        }
        wps wpsVar = this.c;
        if (wpsVar != null) {
            return wpsVar.c();
        }
        ckf.y("tabBarItemManager");
        throw null;
    }

    public final void L1(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1f92f5", new Object[]{this, map});
            return;
        }
        RedpointModel b = RedpointModel.Companion.b(map);
        this.k = b;
        S1(b);
        wps wpsVar = this.c;
        if (wpsVar != null) {
            Object obj = map.get("bottomTabType");
            if (obj != null) {
                wpsVar.h((String) obj);
                if (!N1()) {
                    T1(map.get("topTabConfigs"));
                    if (this.g) {
                        s7k s7kVar = this.d;
                        if (s7kVar != null) {
                            s7kVar.r(true);
                        }
                        LTVTabIconManager lTVTabIconManager = this.e;
                        if (lTVTabIconManager != null) {
                            lTVTabIconManager.v();
                            return;
                        }
                        return;
                    }
                    s7k s7kVar2 = this.d;
                    if (s7kVar2 != null) {
                        s7kVar2.n(b);
                        return;
                    }
                    return;
                }
                tpu.a.b(tpu.Companion, TAG, "ignore handleResponse for Tab2 is selected", null, 4, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        ckf.y("tabBarItemManager");
        throw null;
    }

    public final void O1(TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbedca4", new Object[]{this, triggerType});
        } else if (((Boolean) ud0.Companion.b().c("weitao_switch.disable_guangguang_redpoint", Boolean.FALSE)).booleanValue()) {
            tpu.a.b(tpu.Companion, TAG, "redpoint request is disabled", null, 4, null);
        } else if (this.i) {
            tpu.a.b(tpu.Companion, TAG, "redpoint request is in progress", null, 4, null);
        } else {
            this.i = true;
            R1(new RedpointService$requestRedpointMtop$1(this, new HashMap(), triggerType));
        }
    }

    public final void Q1(TriggerType triggerType, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5b1efe", new Object[]{this, triggerType, map});
            return;
        }
        tpu.a.b(tpu.Companion, TAG, "redpoint request", null, 4, null);
        bwc e = ud0.Companion.e();
        qpu qpuVar = this.b;
        if (qpuVar != null) {
            t2c t2cVar = (t2c) qpuVar.getService(t2c.class);
            qpu qpuVar2 = this.b;
            if (qpuVar2 != null) {
                Object s = ((byb) qpuVar2.getService(byb.class)).s();
                if (s != null) {
                    map.put("dslVersion", 8);
                    map.put("elderlyVersion", Boolean.valueOf(t2cVar.J1()));
                    map.put("enableUnderageMode", Boolean.valueOf(t2cVar.v().a()));
                    map.put("trigger", triggerType.getValue());
                    map.put("tabs", JSON.toJSONString(((PageModel) s).getTabIds()));
                    map.put("clientBizVersion", "2");
                    HashMap hashMap = new HashMap();
                    String jSONString = JSON.toJSONString(map);
                    ckf.f(jSONString, "JSONObject.toJSONString(params)");
                    hashMap.put("params", jSONString);
                    j5o.a aVar = new j5o.a("mtop.guge.guangguang.redpoint");
                    aVar.i(0).g(true).b(hashMap).e(RequestType.POST);
                    e.a(aVar.a(), new RedpointService$requestRedpointMtopInternal$1(this), new RedpointService$requestRedpointMtopInternal$2(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.model.PageModel");
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        wps wpsVar = this.c;
        if (wpsVar != null) {
            wpsVar.i(true);
            if (this.g) {
                LTVTabIconManager lTVTabIconManager = this.e;
                if (lTVTabIconManager != null) {
                    lTVTabIconManager.w();
                }
                s7k s7kVar = this.d;
                if (s7kVar != null) {
                    s7kVar.r(false);
                }
            } else {
                s7k s7kVar2 = this.d;
                if (s7kVar2 != null) {
                    s7kVar2.q();
                }
            }
            this.h = false;
            return;
        }
        ckf.y("tabBarItemManager");
        throw null;
    }

    @Override // tb.r2c
    public void onTabHostStatusChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc05d8b", new Object[]{this});
        } else if (!this.g) {
            tpu.a.b(tpu.Companion, TAG, "onTabHostStatusChanged, resetTab and requestRedpointMtop", null, 4, null);
            s7k s7kVar = this.d;
            if (s7kVar != null) {
                s7k.s(s7kVar, false, 1, null);
            }
            P1(this, null, 1, null);
        }
    }

    @Override // tb.g7e
    public void z0(prv prvVar) {
        s7k s7kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9dc49", new Object[]{this, prvVar});
            return;
        }
        ckf.g(prvVar, "user");
        if (!this.g && (s7kVar = this.d) != null) {
            s7k.s(s7kVar, false, 1, null);
        }
        if (!N1()) {
            O1(TriggerType.LOGIN);
        }
    }
}
