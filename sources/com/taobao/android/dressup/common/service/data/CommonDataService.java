package com.taobao.android.dressup.common.service.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dressup.base.BaseDressupActivity;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.dressup.common.model.LayoutModel;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.turbo.adapter.RequestType;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.b7d;
import tb.bwc;
import tb.ckf;
import tb.eyb;
import tb.gi8;
import tb.gt1;
import tb.i04;
import tb.j5o;
import tb.j7j;
import tb.jpu;
import tb.mqu;
import tb.p6d;
import tb.plk;
import tb.q8u;
import tb.qpu;
import tb.t2o;
import tb.tpu;
import tb.ud0;
import tb.v3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class CommonDataService extends gt1 implements p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY = "cache";
    public static final boolean CACHE_VALUE = true;
    public static final a Companion = new a(null);
    public static final String TAG = "DataService";

    /* renamed from: a  reason: collision with root package name */
    public qpu f7559a;
    public PageModel b;
    public boolean d;
    public final plk<eyb> c = new plk<>();
    public boolean e = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552689);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552688);
        t2o.a(919601322);
    }

    public static final /* synthetic */ void B(CommonDataService commonDataService, Map map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a085790", new Object[]{commonDataService, map, j7jVar});
        } else {
            commonDataService.U1(map, j7jVar);
        }
    }

    public static final /* synthetic */ void a(CommonDataService commonDataService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe54aa86", new Object[]{commonDataService, new Boolean(z)});
        } else {
            commonDataService.d = z;
        }
    }

    public static /* synthetic */ Object ipc$super(CommonDataService commonDataService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/data/CommonDataService");
    }

    public static final /* synthetic */ void x(CommonDataService commonDataService, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa59e2d", new Object[]{commonDataService, pageModel});
        } else {
            commonDataService.T1(pageModel);
        }
    }

    public final qpu K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("cda2dfaa", new Object[]{this});
        }
        qpu qpuVar = this.f7559a;
        if (qpuVar != null) {
            return qpuVar;
        }
        ckf.y("context");
        throw null;
    }

    public String L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
        }
        return null;
    }

    public abstract String M();

    public final List<CardModel> M1(PageModel pageModel) {
        List<String> list;
        CardModel cardModel;
        Map<String, List<String>> structure;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aba13f2f", new Object[]{this, pageModel});
        }
        tpu.a.b(tpu.Companion, "DataService", "getListInfo pageModel:" + pageModel, null, 4, null);
        ArrayList arrayList = null;
        if (pageModel == null) {
            return null;
        }
        LayoutModel layout = pageModel.getLayout();
        if (layout == null || (structure = layout.getStructure()) == null) {
            list = null;
        } else {
            list = structure.get("list");
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                Map<String, CardModel> cardMap = pageModel.getCardMap();
                if (!(cardMap == null || (cardModel = cardMap.get(str)) == null)) {
                    arrayList.add(cardModel);
                }
            }
        }
        return arrayList;
    }

    public final CardModel N1(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardModel) ipChange.ipc$dispatch("4b4afa98", new Object[]{this, pageModel});
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DataService", "getNavBarInfo pageModel:" + pageModel, null, 4, null);
        return g1("topBar", pageModel);
    }

    public final JSONObject O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce6828a4", new Object[]{this});
        }
        Object a2 = ud0.Companion.f().a(P1());
        if (!(a2 instanceof JSONObject)) {
            a2 = null;
        }
        return (JSONObject) a2;
    }

    public String P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e285e97", new Object[]{this});
        }
        return "";
    }

    public final PageModel Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("4ed8fa3c", new Object[]{this});
        }
        return this.b;
    }

    public abstract RequestType R1();

    public final void S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc6c591", new Object[]{this});
        } else {
            this.c.d(CommonDataService$notifyOnStartLoadData$1.INSTANCE);
        }
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

    public final void T1(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4929a73", new Object[]{this, pageModel});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("notifyPageDataLoaded");
        this.c.d(new CommonDataService$notifyPageDataLoaded$1(pageModel));
        aVar.c();
    }

    public final CardModel U0(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardModel) ipChange.ipc$dispatch("e6f505cc", new Object[]{this, pageModel});
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DataService", "getBottomBarInfo pageModel:" + pageModel, null, 4, null);
        return g1("bottomBar", pageModel);
    }

    public final void U1(Map<String, ? extends Object> map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9110a24a", new Object[]{this, map, j7jVar});
        } else if (map.get("data") instanceof Map) {
            q8u.a aVar = q8u.Companion;
            aVar.a("updatePageData");
            b2(map, j7jVar);
            aVar.c();
        }
    }

    public JSONObject V1(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a4b6aaa", new Object[]{this, map});
        }
        ckf.g(map, Constants.SEND_TYPE_RES);
        if (map instanceof JSONObject) {
            return (JSONObject) map;
        }
        return new JSONObject(map);
    }

    public void W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc73f0f", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("requestPageData");
        X1();
        aVar.c();
    }

    public final void Y1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fcf3d3", new Object[]{this, jSONObject});
        } else {
            ud0.Companion.f().b(P1(), jSONObject);
        }
    }

    public final void Z1(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10d17a2", new Object[]{this, pageModel});
        } else {
            this.b = pageModel;
        }
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
            Map<String, Object> h = mqu.Companion.h(map.get("data"), null);
            if (h != null) {
                JSONObject V1 = V1(h);
                PageModel pageModel = this.b;
                if (pageModel != null) {
                    qpu qpuVar = this.f7559a;
                    if (qpuVar != null) {
                        pageModel.updateData(qpuVar, V1);
                    } else {
                        ckf.y("context");
                        throw null;
                    }
                }
                T1(this.b);
                qpu qpuVar2 = this.f7559a;
                if (qpuVar2 == null) {
                    ckf.y("context");
                    throw null;
                } else if (ckf.b(qpuVar2.a().b(), BaseDressupActivity.BIZ_FEED) && V1 != null) {
                    Y1(V1);
                }
            } else {
                gi8.b(gi8.INSTANCE, "requestPageData error, server return invalid data", v3i.f(jpu.a("traceId", j7jVar.a())), Monitor.Type.DATA, Monitor.Code.REQUEST_ERROR, false, null, 48, null);
            }
        } catch (Exception e) {
            gi8.INSTANCE.a("requestPageData error, server return invalid data", v3i.f(jpu.a("traceId", j7jVar.a())), Monitor.Type.DATA, Monitor.Code.REQUEST_ERROR, true, e);
        }
    }

    public boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1c3a29", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public Map<String, String> e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d2e6b5a", new Object[]{this});
        }
        return new LinkedHashMap();
    }

    public final CardModel g1(String str, PageModel pageModel) {
        String str2;
        CardModel cardModel;
        Map<String, List<String>> structure;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardModel) ipChange.ipc$dispatch("3a6c704d", new Object[]{this, str, pageModel});
        }
        if (pageModel == null) {
            return null;
        }
        LayoutModel layout = pageModel.getLayout();
        if (layout == null || (structure = layout.getStructure()) == null || (list = structure.get(str)) == null) {
            str2 = null;
        } else {
            str2 = (String) i04.c0(list);
        }
        if (str2 == null) {
            return null;
        }
        Map<String, CardModel> cardMap = pageModel.getCardMap();
        if (cardMap != null) {
            cardModel = cardMap.get(str2);
        } else {
            cardModel = null;
        }
        if (cardModel != null) {
            return cardModel;
        }
        return null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "DataService", "onCreateService", null, 4, null);
        this.f7559a = qpuVar;
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "DataService", "onDestroyService", null, 4, null);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "DataService", "onPageCreate", null, 4, null);
        W1();
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        } else {
            tpu.a.b(tpu.Companion, "DataService", "onPageDestroy", null, 4, null);
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            tpu.a.b(tpu.Companion, "DataService", "onPagePause", null, 4, null);
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

    public String z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "1.0";
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DataService", "onPageResume firstResume:" + this.e, null, 4, null);
        if (this.e) {
            this.e = false;
        }
    }

    public final void X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da7ab6c", new Object[]{this});
        } else if (this.d) {
            tpu.a.b(tpu.Companion, "DataService", "ignore requestPageData, already requesting", null, 4, null);
        } else {
            tpu.a.b(tpu.Companion, "DataService", "requestPageData", null, 4, null);
            this.d = true;
            S1();
            bwc e = ud0.Companion.e();
            j5o.a aVar = new j5o.a(M());
            aVar.i(0).b(e1()).h(z0()).e(R1()).c(L1()).f(c2());
            e.a(aVar.a(), new CommonDataService$requestPageDataInternal$1(this), new CommonDataService$requestPageDataInternal$2(this));
        }
    }
}
