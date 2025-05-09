package com.taobao.android.turbo.service.data;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.monitor.Monitor;
import com.taobao.location.common.TBLocationDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.a1c;
import tb.b7d;
import tb.bwc;
import tb.c1c;
import tb.ckf;
import tb.did;
import tb.eyb;
import tb.ft1;
import tb.g7e;
import tb.gi8;
import tb.i04;
import tb.j5o;
import tb.j7j;
import tb.jpu;
import tb.lrs;
import tb.m7e;
import tb.nuo;
import tb.p6d;
import tb.plk;
import tb.prv;
import tb.q2c;
import tb.q8u;
import tb.qgb;
import tb.qpu;
import tb.r2c;
import tb.r4p;
import tb.r69;
import tb.sic;
import tb.sj4;
import tb.t2c;
import tb.t2o;
import tb.tgb;
import tb.tpu;
import tb.ud0;
import tb.v3i;
import tb.vmd;
import tb.vs6;
import tb.yz3;
import tb.z78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DataService extends ft1 implements qgb, p6d, a1c, g7e, r2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f9759a;
    public PageModel b;
    public Boolean d;
    public boolean e;
    public final plk<eyb> c = new plk<>();
    public boolean f = true;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455516);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455515);
        t2o.a(919601262);
        t2o.a(919601322);
        t2o.a(916455439);
        t2o.a(919601343);
        t2o.a(919601280);
    }

    public static final /* synthetic */ void K1(DataService dataService, Map map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db648cdd", new Object[]{dataService, map, j7jVar});
        } else {
            dataService.W1(map, j7jVar);
        }
    }

    public static final /* synthetic */ void L1(DataService dataService, lrs lrsVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd20009", new Object[]{dataService, lrsVar, tBLocationDTO});
        } else {
            dataService.Y1(lrsVar, tBLocationDTO);
        }
    }

    public static final /* synthetic */ void M1(DataService dataService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f499df", new Object[]{dataService, new Boolean(z)});
        } else {
            dataService.e = z;
        }
    }

    public static final /* synthetic */ void N1(DataService dataService, Map map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae15c29", new Object[]{dataService, map, j7jVar});
        } else {
            dataService.b2(map, j7jVar);
        }
    }

    public static final /* synthetic */ void g1(DataService dataService, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a788ae", new Object[]{dataService, pageModel});
        } else {
            dataService.V1(pageModel);
        }
    }

    public static /* synthetic */ Object ipc$super(DataService dataService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/data/DataService");
    }

    @Override // tb.qgb
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e78b620", new Object[]{this});
        }
    }

    @Override // tb.a1c
    public void M(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61429c28", new Object[]{this, drawerGravity});
        } else {
            ckf.g(drawerGravity, "drawerGravity");
        }
    }

    public final boolean O1() {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dcb472b", new Object[]{this})).booleanValue();
        }
        qpu qpuVar = this.f9759a;
        if (qpuVar != null) {
            q2c q2cVar = (q2c) qpuVar.getService(q2c.class);
            PageModel pageModel2 = this.b;
            if (pageModel2 == null || !pageModel2.isCache() || (pageModel = this.b) == null || pageModel.isLocal() || q2cVar.t0().compareTo(EngineState.VISIBLE) >= 0) {
                return false;
            }
            return true;
        }
        ckf.y("context");
        throw null;
    }

    public final String Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6147350a", new Object[]{this});
        }
        qpu qpuVar = this.f9759a;
        if (qpuVar == null) {
            ckf.y("context");
            throw null;
        } else if (((vmd) qpuVar.getService(vmd.class)).F1(nuo.MSG_URL_REFRESH)) {
            tpu.a.b(tpu.Companion, "DataService", "getIconStream, 有url承接消息, 优先承接url", null, 4, null);
            return "";
        } else {
            qpu qpuVar2 = this.f9759a;
            if (qpuVar2 != null) {
                return ((did) qpuVar2.getService(did.class)).C1();
            }
            ckf.y("context");
            throw null;
        }
    }

    /* renamed from: R1 */
    public PageModel s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("294866ff", new Object[]{this});
        }
        if (this.b == null) {
            T1();
        }
        PageModel pageModel = this.b;
        ckf.d(pageModel);
        return pageModel;
    }

    public final List<String> S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8eb58867", new Object[]{this});
        }
        return yz3.i();
    }

    @Override // tb.fyb
    public void T0(eyb eybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a08caa", new Object[]{this, eybVar});
            return;
        }
        ckf.g(eybVar, DataReceiveMonitor.CB_LISTENER);
        this.c.c(eybVar);
    }

    @Override // tb.a1c
    public void U0(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ad81eb", new Object[]{this, drawerGravity});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        X1(null);
    }

    public final void U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc6c591", new Object[]{this});
        } else {
            this.c.d(DataService$notifyOnStartLoadData$1.INSTANCE);
        }
    }

    public final void V1(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596777ed", new Object[]{this, pageModel});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("notifyPageDataLoaded");
        this.c.d(new DataService$notifyPageDataLoaded$1(pageModel));
        aVar.c();
    }

    public final void W1(Map<String, ? extends Object> map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9110a24a", new Object[]{this, map, j7jVar});
        } else if (!(map.get("data") instanceof Map)) {
        } else {
            if (O1()) {
                qpu qpuVar = this.f9759a;
                if (qpuVar != null) {
                    ((q2c) qpuVar.getService(q2c.class)).r(new vs6(this, map, j7jVar));
                } else {
                    ckf.y("context");
                    throw null;
                }
            } else {
                b2(map, j7jVar);
            }
        }
    }

    public final void X1(lrs lrsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185af2d7", new Object[]{this, lrsVar});
            return;
        }
        qpu qpuVar = this.f9759a;
        if (qpuVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "cachemode", "onlycache");
            ((sic) qpuVar.getService(sic.class)).N0(jSONObject, new DataService$requestPageData$1(this, lrsVar));
            return;
        }
        ckf.y("context");
        throw null;
    }

    public final void Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80eb8b74", new Object[]{this});
            return;
        }
        PageModel P1 = P1();
        this.b = P1;
        V1(P1);
    }

    public final void a2(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179a93c", new Object[]{this, pageModel});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("savePageData");
        tpu.a.b(tpu.Companion, "DataService", "savePageData", null, 4, null);
        ud0.Companion.f().b("guangguang_data", JSON.toJSON(pageModel));
        aVar.c();
    }

    @Override // tb.ft1
    public void e1(List<TabModel> list, Map<DrawerModel.DrawerGravity, DrawerModel> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6e03c6", new Object[]{this, list, map});
            return;
        }
        ckf.g(list, "tabs");
        ckf.g(map, "drawers");
        PageModel pageModel = this.b;
        if (pageModel != null) {
            ckf.d(pageModel);
            if (pageModel.isCache() && !list.isEmpty()) {
                PageModel pageModel2 = this.b;
                ckf.d(pageModel2);
                pageModel2.setTabs(list);
                PageModel pageModel3 = this.b;
                ckf.d(pageModel3);
                pageModel3.setDrawers(map);
            }
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f9759a = qpuVar;
        ((tgb) qpuVar.getService(tgb.class)).r(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        ((c1c) qpuVar.getService(c1c.class)).Y().p(this);
        ((m7e) qpuVar.getService(m7e.class)).r(this);
        t2c t2cVar = (t2c) qpuVar.getService(t2c.class);
        t2cVar.x(this);
        T1();
        this.d = Boolean.valueOf(t2cVar.v().a());
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
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
        ((c1c) qpuVar.getService(c1c.class)).Y().d(this);
        ((m7e) qpuVar.getService(m7e.class)).r(this);
        ((t2c) qpuVar.getService(t2c.class)).r(this);
    }

    @Override // tb.r2c
    public void onEditionVersionInfoChanged(z78 z78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58f2b33", new Object[]{this, z78Var});
            return;
        }
        ckf.g(z78Var, "editionVersionInfo");
        if (!ckf.b(this.d, Boolean.valueOf(z78Var.a()))) {
            this.d = Boolean.valueOf(z78Var.a());
            qpu qpuVar = this.f9759a;
            if (qpuVar == null) {
                ckf.y("context");
                throw null;
            } else if (((b7d) qpuVar.getService(b7d.class)).getPageState() != -1) {
                this.g = true;
                X1(null);
            }
        }
    }

    @Override // tb.r2c
    public void onElderVersionChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b92486", new Object[]{this, new Boolean(z)});
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
        } else {
            X1(new lrs(Q1(), null));
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
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else if (this.f) {
            this.f = false;
        } else {
            qpu qpuVar = this.f9759a;
            if (qpuVar == null) {
                ckf.y("context");
                throw null;
            } else if (!((c1c) qpuVar.getService(c1c.class)).n1()) {
                X1(new lrs(Q1(), null));
            }
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

    @Override // tb.r2c
    public void onTabHostStatusChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc05d8b", new Object[]{this});
        }
    }

    @Override // tb.fyb
    public void r(eyb eybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb85dc7", new Object[]{this, eybVar});
            return;
        }
        ckf.g(eybVar, DataReceiveMonitor.CB_LISTENER);
        this.c.a(eybVar);
    }

    @Override // tb.qgb
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cab48b", new Object[]{this});
            return;
        }
        PageModel pageModel = this.b;
        ckf.d(pageModel);
        a2(pageModel);
    }

    public final PageModel P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("e886ab6a", new Object[]{this});
        }
        tpu.a.b(tpu.Companion, "DataService", "getDefaultPageData", null, 4, null);
        List<TabModel> a2 = TabModel.Companion.a(JSON.parseObject("{\"tabs\":[{\"type\":\"video\",\"id\":\"newFollow\",\"name\":\"关注\",\"pageName\":\"Page_videointeract\",\"pit\":\"topbar.newfollow\",\"spm\":\"a310p.13800399\",\"url\":\"https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2?id=88888888&type=guangguang_follow_v2&source=guangguang_follow_v2\",\"theme\":\"forcedark\",\"apmValid\":\"false\"},{\"id\":\"innerLive\",\"name\":\"直播\",\"pageName\":\"Page_TaobaoLiveWatch\",\"pit\":\"1.1\",\"spm\":\"a2141.8001249\",\"theme\":\"forcedark\",\"type\":\"live\",\"url\":\"https://h5.m.taobao.com/taolive/video.html?livesource=tb_tab2.guangguang_newlivetab\",\"apmValid\":\"false\"},{\"type\":\"node\",\"id\":\"home\",\"name\":\"发现\",\"pageName\":\"Page_GuangGuangHome\",\"spm\":\"a21afv.19776901\",\"pit\":\"topbar.4\",\"apmValid\":\"false\",\"url\":\"page_guangguangdiscovery?initDataKey=ggdiscovery&policy=localfirst\"},{\"type\":\"video\",\"name\":\"推荐\",\"id\":\"video\",\"pageName\":\"Page_videointeract\",\"pit\":\"topbar.11\",\"spm\":\"a310p.13800399\",\"theme\":\"forcedark\",\"url\":\"https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2?id=88888888&type=guangguang_pick&source=guangguang_pick&forcemixflow=true&extParams=%7B%22switchMode%22%3A%22manual%22%7D&detailParameters=%7B%22switchMode%22%3A%22manual%22%7D\",\"apmValid\":\"false\",\"selected\":\"true\"}]}").getJSONArray("tabs"));
        PageModel pageModel = new PageModel();
        pageModel.setTabs(a2);
        pageModel.setCache(true);
        pageModel.setLocal(true);
        pageModel.setDrawers(DrawerModel.Companion.d(a2 != null ? (TabModel) i04.m0(a2) : null));
        return pageModel;
    }

    public final void T1() {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e194f810", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "DataService", "initPageData", null, 4, null);
        q8u.a aVar = q8u.Companion;
        aVar.a("initPageData");
        IStorageAdapter f = ud0.Companion.f();
        Object a2 = f.a("guangguang_data");
        if (a2 == null) {
            a2 = f.a("guangguang");
        }
        if (a2 == null) {
            pageModel = P1();
        } else {
            PageModel pageModel2 = new PageModel();
            pageModel2.setTabs(TabModel.Companion.a(((JSONObject) a2).getJSONArray("tabs")));
            DrawerModel.a aVar2 = DrawerModel.Companion;
            List<TabModel> tabs = pageModel2.getTabs();
            pageModel2.setDrawers(aVar2.d(tabs != null ? (TabModel) i04.m0(tabs) : null));
            pageModel2.setCache(true);
            pageModel = pageModel2;
        }
        this.b = pageModel;
        aVar.c();
    }

    public final void b2(Map<String, ? extends Object> map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116c7e7e", new Object[]{this, map, j7jVar});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DataService", "requestPageData return, data: " + map, null, 4, null);
        try {
            PageModel.a aVar2 = PageModel.Companion;
            Object obj = map.get("data");
            if (obj != null) {
                PageModel a2 = aVar2.a((Map) obj);
                if (a2 != null) {
                    this.b = a2;
                    V1(a2);
                    if (this.g) {
                        a2(a2);
                        this.g = false;
                        return;
                    }
                    return;
                }
                gi8.b(gi8.INSTANCE, "requestPageData error, server return invalid data", v3i.f(jpu.a("traceId", j7jVar.a())), Monitor.Type.DATA, Monitor.Code.REQUEST_ERROR, false, null, 48, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        } catch (Exception e) {
            gi8.INSTANCE.a("requestPageData error, server return invalid data", v3i.f(jpu.a("traceId", j7jVar.a())), Monitor.Type.DATA, Monitor.Code.REQUEST_ERROR, true, e);
        }
    }

    @Override // tb.g7e
    public void z0(prv prvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9dc49", new Object[]{this, prvVar});
            return;
        }
        ckf.g(prvVar, "user");
        qpu qpuVar = this.f9759a;
        if (qpuVar == null) {
            ckf.y("context");
            throw null;
        } else if (((b7d) qpuVar.getService(b7d.class)).getPageState() != -1) {
            this.g = true;
            Z1();
            X1(null);
        }
    }

    public final void Y1(lrs lrsVar, TBLocationDTO tBLocationDTO) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a88284", new Object[]{this, lrsVar, tBLocationDTO});
        } else if (this.e) {
            tpu.a.b(tpu.Companion, "DataService", "ignore requestPageData, already requesting", null, 4, null);
        } else {
            tpu.a.b(tpu.Companion, "DataService", "requestPageData", null, 4, null);
            this.e = true;
            U1();
            bwc e = ud0.Companion.e();
            qpu qpuVar = this.f9759a;
            Object obj = null;
            if (qpuVar != null) {
                t2c t2cVar = (t2c) qpuVar.getService(t2c.class);
                qpu qpuVar2 = this.f9759a;
                if (qpuVar2 != null) {
                    if (qpuVar2.a().r()) {
                        str = sj4.TAB2_SOURCE_OUTSIDE;
                    } else {
                        str = "";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("dslVersion", 8);
                    Boolean bool = Boolean.TRUE;
                    hashMap.put("newFollowPage", bool);
                    hashMap.put("elderlyVersion", Boolean.valueOf(t2cVar.J1()));
                    hashMap.put("enableUnderageMode", Boolean.valueOf(t2cVar.v().a()));
                    hashMap.put("tabs", JSON.toJSONString(S1()));
                    hashMap.put("scene", str);
                    hashMap.put(r4p.KEY_CITY_CODE, tBLocationDTO != null ? tBLocationDTO.cityCode : null);
                    hashMap.put("addTab", lrsVar != null ? lrsVar.a() : null);
                    if (lrsVar != null) {
                        obj = lrsVar.b();
                    }
                    hashMap.put("iconStreams", obj);
                    hashMap.put("tab2FrameRequest", bool);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("entityId", "31269");
                    String jSONString = JSON.toJSONString(hashMap);
                    ckf.f(jSONString, "JSONObject.toJSONString(params)");
                    hashMap2.put("params", jSONString);
                    j5o.a aVar = new j5o.a("mtop.cogman.container.nologin");
                    aVar.i(0).g(true).b(hashMap2);
                    e.a(aVar.a(), new DataService$requestPageDataInternal$1(this), new DataService$requestPageDataInternal$2(this));
                    return;
                }
                ckf.y("context");
                throw null;
            }
            ckf.y("context");
            throw null;
        }
    }
}
