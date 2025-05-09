package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.business.intelligence.IntelligenceService;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import com.taobao.tbmobilesmartapi.core.SceneContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.frb;
import tb.vrp;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ywi extends vx1 implements o6d, SceneContext.a, frb.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cyp g;
    public frb h;
    public y8c i;
    public mod j;
    public final FluidContext l;
    public String m;
    public zbc k = null;
    public String n = "-1";
    public boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/intelligence/MobileAIBridge$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            } else {
                ywi.t(ywi.this, uq9Var.Y());
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            } else {
                ywi.u(ywi.this, uq9Var.Y());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends vrp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a.d c;

        public b(a.d dVar) {
            this.c = dVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 965972421) {
                return new Boolean(super.b((lr9) objArr[0], objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/intelligence/MobileAIBridge$2");
        }

        @Override // tb.vrp.a
        public boolean b(lr9 lr9Var, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
            }
            if (!(ywi.v(ywi.this) == null || ywi.v(ywi.this).obtainServicesInstance(glq.class) == null)) {
                ((glq) ywi.v(ywi.this).obtainServicesInstance(glq.class)).n(obj, this.c.d);
            }
            return super.b(lr9Var, obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ywi.this.S();
            }
        }
    }

    static {
        t2o.a(468713512);
        t2o.a(468714445);
        t2o.a(809500685);
        t2o.a(809500690);
    }

    public ywi(FluidContext fluidContext) {
        this.l = fluidContext;
        if (!p91.l()) {
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService != null) {
                iMessageService.registerMessageHandler(this);
            }
            ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(ywi ywiVar, String str, Object... objArr) {
        if (str.hashCode() == -12371283) {
            super.k((vrp) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/intelligence/MobileAIBridge");
    }

    public static /* synthetic */ void t(ywi ywiVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de3bd08", new Object[]{ywiVar, dVar});
        } else {
            ywiVar.M(dVar);
        }
    }

    public static /* synthetic */ void u(ywi ywiVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674af27", new Object[]{ywiVar, dVar});
        } else {
            ywiVar.N(dVar);
        }
    }

    public static /* synthetic */ cyp v(ywi ywiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyp) ipChange.ipc$dispatch("91adc955", new Object[]{ywiVar});
        }
        return ywiVar.g;
    }

    public final void B(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e281b6c3", new Object[]{this, hashMap});
        } else if (((IFeedsListService) this.l.getService(IFeedsListService.class)) != null) {
            List unExposedItems = ((IDataService) this.l.getService(IDataService.class)).getUnExposedItems();
            a.d currentMediaDetail = ((IDataService) this.l.getService(IDataService.class)).getCurrentMediaDetail();
            int currentMediaPosition = ((IDataService) this.l.getService(IDataService.class)).getCurrentMediaPosition();
            if (currentMediaDetail != null) {
                String f = currentMediaDetail.f();
                String[] O = O(currentMediaDetail);
                JSONArray w = w(unExposedItems);
                hashMap.put("contentId", f);
                hashMap.put("index", Integer.valueOf(currentMediaPosition));
                hashMap.put("parseData", O);
                hashMap.put("unExposeListData", w);
                ir9.b("Tab2MobileAI", "sendDataToSmartModel jsonObject:" + unExposedItems.size());
            }
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7819271", new Object[]{this});
        } else {
            ((ICardService) this.l.getService(ICardService.class)).addCardLifecycleListener((wlb.a) new a());
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460dea9e", new Object[]{this});
            return;
        }
        DefaultGestureCollectorDelegateLayout mainContentView = ((IContainerService) this.l.getService(IContainerService.class)).getMainContentView();
        y8c y8cVar = this.i;
        if (y8cVar != null && mainContentView != null) {
            z8c i = y8cVar.i();
            mainContentView.setGestureCollector(i);
            int[] a2 = ief.a();
            i.b(this.o);
            i.c(a2[1]);
            this.i.q(s6o.l(mainContentView.getContext()), s6o.B(mainContentView.getContext()), s6o.n(mainContentView.getContext()));
        }
    }

    public final void F() {
        y8c y8cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d80ec6", new Object[]{this});
            return;
        }
        zbc zbcVar = this.k;
        if (zbcVar != null && (y8cVar = this.i) != null) {
            zbcVar.l(y8cVar);
            ir9.b("Tab2MobileAI", "initHandleRecognizeService,uiLayout" + this.n);
            this.k.b(this.n);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4023a584", new Object[]{this});
            return;
        }
        SceneContext sceneContext = new SceneContext();
        sceneContext.f13393a = this.m;
        sceneContext.b = p91.a();
        sceneContext.c = this;
        ir9.b("Tab2MobileAI", "mobileAIBridge:" + System.identityHashCode(this) + ",initMobileContext:" + this.m);
        this.g = cyp.initForScene(sceneContext);
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4769611", new Object[]{this});
            return;
        }
        frb frbVar = this.h;
        if (frbVar != null) {
            frbVar.m(this);
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e35fbc", new Object[]{this});
            return;
        }
        mod modVar = this.j;
        if (modVar != null) {
            modVar.p();
            this.j.o();
            this.j.e();
            if (akt.p2("ShortVideo.enableSensorCollection", true)) {
                this.j.a();
            }
        }
    }

    public final JSONObject L(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("43fb47e0", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
        }
        return jSONObject;
    }

    public final void M(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76137a6", new Object[]{this, dVar});
            return;
        }
        T();
        z(dVar);
        ir9.a("Tab2MobileAI", "onCardActive");
        mod modVar = this.j;
        if (modVar != null) {
            modVar.c();
        }
    }

    public final void N(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b5e696", new Object[]{this, dVar});
            return;
        }
        ir9.a("Tab2MobileAI", "onCardDisActive");
        mod modVar = this.j;
        if (modVar != null) {
            modVar.k();
        }
    }

    public final String[] O(a.d dVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3a3059bb", new Object[]{this, dVar});
        }
        String[] strArr = {"", "", ""};
        if (dVar == null) {
            return strArr;
        }
        JSONObject jSONObject2 = dVar.d;
        MediaContentDetailData.Content e = dVar.e();
        if (jSONObject2 != null) {
            jSONObject = jSONObject2.getJSONObject("content");
            if (jSONObject == null) {
                jSONObject = jSONObject2.getJSONObject("extraData");
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            strArr[1] = jSONObject.getString("bxModelData");
        }
        if (e != null) {
            strArr[0] = e.id;
            strArr[2] = dVar.M();
        }
        return strArr;
    }

    public boolean P(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf95203", new Object[]{this, list})).booleanValue();
        }
        return ((IDataService) this.l.getService(IDataService.class)).reOrderTailUnExposeList(list);
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e81dded", new Object[]{this})).booleanValue();
        }
        ((ISceneConfigService) this.l.getService(ISceneConfigService.class)).getSessionParams();
        if (this.l.getService(IDataService.class) != null) {
            if (akt.p2("ShortVideo.enableSmartRecommendAvoid", true) && System.currentTimeMillis() - ((IDataService) this.l.getService(IDataService.class)).getStartRecommendtime() < 2000) {
                return false;
            }
            ((IDataService) this.l.getService(IDataService.class)).requestList(false, new HashMap(), null);
        }
        return true;
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f626b634", new Object[]{this});
            return;
        }
        try {
            bxi bxiVar = new bxi();
            HashMap<String, Object> hashMap = new HashMap<>();
            B(hashMap);
            bxiVar.f16704a = hashMap;
            if (this.g.obtainServicesInstance(frb.class) != null) {
                ((frb) this.g.obtainServicesInstance(frb.class)).g(bxiVar);
            }
        } catch (Throwable th) {
            ir9.b("Tab2MobileAI", "sendDataToSmartModel error");
            IntelligenceService.throwErrorCode(this.l, 1007, "发送端重排数据异常", th);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56073f22", new Object[]{this});
        } else {
            az9.o(new c(), 3001, 500L, "smartmodel");
        }
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        return "VSMSG_getMobileInfo".equals(vrpVar.c);
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        zbc zbcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
            return;
        }
        super.k(vrpVar);
        if ("VSMSG_getMobileInfo".equals(vrpVar.c)) {
            ir9.b("Tab2MobileAI", "handle getHandInfo Message");
            vrp.a aVar = vrpVar.g;
            if (aVar != null && (zbcVar = this.k) != null) {
                aVar.b(this, zbcVar.j());
                ir9.b("Tab2MobileAI", "messageReturn" + this.k.j().toJSONString());
            }
        }
    }

    @Override // tb.vx1, tb.lr9
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        cyp cypVar = this.g;
        if (cypVar != null) {
            cypVar.onRelese();
        }
        IMessageService iMessageService = (IMessageService) this.l.getService(IMessageService.class);
        if (iMessageService != null) {
            iMessageService.unRegisterMessageHandler(this);
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b("Tab2MobileAI", "MobileAiBridge" + System.identityHashCode(this) + "onPause");
        cyp cypVar = this.g;
        if (cypVar != null) {
            cypVar.onStop();
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b("Tab2MobileAI", "MobileAiBridge" + System.identityHashCode(this) + "onResume");
        cyp cypVar = this.g;
        if (cypVar != null) {
            cypVar.onStart();
        }
        y8c y8cVar = this.i;
        if (y8cVar != null && !y8cVar.hasInit()) {
            E();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public JSONObject x(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dbcc7507", new Object[]{this, str, jSONObject});
        }
        ir9.a("ReorderContentBridge", "回调打印" + str);
        if (!str.equals(SceneContext.a.COMMON_TRACK_PARAMS)) {
            return null;
        }
        JSONObject L = L(((ITrackService) this.l.getService(ITrackService.class)).getActiveCardCommonTrack());
        if (L.isEmpty()) {
            IntelligenceService.throwErrorCode(this.l, 1011, "获取公共参数为空", null);
        }
        return L;
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25ad55e", new Object[]{this});
            return;
        }
        JSONObject jSONObject = (JSONObject) akt.B2(IIntelligenceService.KEY_ABTEST_UI_RELAYOUT, new JSONObject());
        if (jSONObject.containsKey("uiLayoutStrategy")) {
            String obj = jSONObject.get("uiLayoutStrategy").toString();
            ir9.b("Tab2MobileAI", "initHandleRecognizeService info:" + jSONObject.toJSONString());
            this.n = obj;
        } else {
            this.n = "-1";
        }
        if (!jSONObject.containsKey("enableHandCollect")) {
            return;
        }
        if (jSONObject.get("enableHandCollect").equals(Boolean.TRUE) || jSONObject.get("enableHandCollect").equals("true")) {
            this.o = true;
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        try {
            String str = ((ISceneConfigService) this.l.getService(ISceneConfigService.class)).getSessionParams().c;
            this.m = str;
            if (TextUtils.isEmpty(str)) {
                this.m = "fluid";
            }
            G();
            C();
            Q();
            this.h = (frb) this.g.obtainServicesInstance(frb.class);
            I();
            this.i = (y8c) this.g.obtainServicesInstance(y8c.class);
            this.j = (mod) this.g.obtainServicesInstance(mod.class);
            K();
            if (akt.p2("ShortVideo.enableHandleRecognize", true)) {
                this.k = (zbc) this.g.obtainServicesInstance(zbc.class);
                F();
            }
            this.g.onCreate();
        } catch (Exception e) {
            ir9.b("Tab2MobileAI", "initMobileContext error");
            IntelligenceService.throwErrorCode(this.l, 1005, "端智能服务初始化异常", e);
        }
    }

    public final void z(a.d dVar) {
        IMessageService iMessageService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fcf668", new Object[]{this, dVar});
            return;
        }
        try {
            if (FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableNewSmartExposure", true) && (iMessageService = (IMessageService) this.l.getService(IMessageService.class)) != null) {
                iMessageService.sendMessage(new vrp("VSMSG_getNextListInfo", dVar.c, null, new b(dVar)));
            }
        } catch (Throwable th) {
            ir9.b("Tab2MobileAI", "cardExposure error");
            IntelligenceService.throwErrorCode(this.l, 1008, "动态推荐曝光埋点异常", th);
        }
    }

    public final JSONArray w(List<a.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("16bf0f61", new Object[]{this, list});
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (a.d dVar : list) {
                String[] O = O(dVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("contentId", (Object) O[0]);
                jSONObject.put("bxScoreData", (Object) O[1]);
                jSONObject.put("type", (Object) O[2]);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }
}
