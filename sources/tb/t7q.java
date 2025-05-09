package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopRoomstudioLiveDisplayDetailResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t7q implements ISmartLandingProxy.c, lhb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLanding";
    public ISmartLandingProxy.f A;
    public HandlerThread C;
    public Handler D;
    public final wzc E;

    /* renamed from: a  reason: collision with root package name */
    public Context f28547a;
    public String b;
    public String c;
    public final String d;
    public final String e;
    public String f;
    public JSONObject g;
    public String h;
    public String j;
    public final String q;
    public final String r;
    public final String s;
    public HashMap<String, String> t;
    public c6q u;
    public boolean v;
    public JSONObject z;
    public boolean i = false;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public boolean w = false;
    public boolean x = false;
    public List<SmartLandingTask> y = new ArrayList();
    public long F = 0;
    public final Handler B = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t7q.b(t7q.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t7q.b(t7q.this).l();
            }
        }
    }

    static {
        t2o.a(295699713);
        t2o.a(806355249);
        t2o.a(806355973);
    }

    public t7q(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, JSONObject jSONObject, ISmartLandingProxy.f fVar, wzc wzcVar) {
        this.q = null;
        this.r = null;
        this.s = null;
        HandlerThread handlerThread = new HandlerThread("PreSimpleRequestLive");
        this.C = handlerThread;
        handlerThread.start();
        this.D = new Handler(this.C.getLooper());
        this.f28547a = context;
        this.d = str;
        this.e = str2;
        this.A = fVar;
        this.q = str8;
        this.r = str9;
        this.s = str10;
        this.E = wzcVar;
        C(str7, str3, str4, str5, str6, jSONObject);
        l();
    }

    public static void B(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cdf822", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
        }
    }

    public static /* synthetic */ ISmartLandingProxy.f b(t7q t7qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy.f) ipChange.ipc$dispatch("98740054", new Object[]{t7qVar});
        }
        return t7qVar.A;
    }

    public static void x(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
        uTHitBuilders$UTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public void A(String str, String str2, SmartLandingTask smartLandingTask, HashMap<String, String> hashMap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264cd5f1", new Object[]{this, str, str2, smartLandingTask, hashMap, new Long(j)});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("bizCode", this.d);
        hashMap.put("behavior", str2);
        if (smartLandingTask != null) {
            hashMap.put("popId", smartLandingTask.popId);
            SmartLandingTask.TaskAction taskAction = smartLandingTask.popAction;
            if (taskAction != null) {
                hashMap.put("actionType", taskAction.actionType);
                hashMap.put("componentName", f(smartLandingTask.popAction));
                JSONObject jSONObject = smartLandingTask.popAction.actionData;
                if (jSONObject != null) {
                    hashMap.put("actionData", jSONObject.toJSONString());
                }
            }
        }
        hashMap.put("livesource", this.k);
        hashMap.put("entrylivesource", this.f);
        hashMap.put("liveId", this.l);
        hashMap.put("accountId", this.m);
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        hashMap.put("timestamp", String.valueOf(j));
        long j2 = this.F;
        if (j2 > 0 && j2 < j) {
            hashMap.put("duration", String.valueOf(j - j2));
        }
        hashMap.put("token", this.b);
        hashMap.put("liveToken", this.c);
        HashMap<String, String> hashMap2 = this.t;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        B(nkr.PAGE_TAOBAOLIVECONTAINER, str, hashMap);
        if (v2s.o().s() != null) {
            v2s.o().s().a(str, nkr.PAGE_TAOBAOLIVECONTAINER, hashMap);
        }
    }

    public JSONObject c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("559d1d19", new Object[]{this, str, jSONObject});
        }
        if (!"goods".equals(str) || jSONObject != null || !fgv.VALUE_ITEM_HOLD_TYPE_CARD.equals(this.n)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) this.n);
        jSONObject2.put(yj4.PARAM_ITEM_IDS, (Object) this.o);
        jSONObject2.put(yj4.PARAM_SJSD_ITEM_ID, (Object) this.p);
        return jSONObject2;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        p();
        this.f28547a = null;
        this.w = false;
        this.x = false;
        c6q c6qVar = this.u;
        if (c6qVar != null) {
            c6qVar.g();
            this.u = null;
        }
        HandlerThread handlerThread = this.C;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.C = null;
        }
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4bbecac", new Object[]{this});
        }
        return this.z;
    }

    public final String f(SmartLandingTask.TaskAction taskAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c32d5c11", new Object[]{this, taskAction});
        }
        if (taskAction == null) {
            return "";
        }
        if ("goods".equals(taskAction.actionType)) {
            JSONObject jSONObject = taskAction.actionData;
            if (jSONObject != null) {
                return jSONObject.getString(yj4.PARAM_ITEM_HOLD_TYPE);
            }
        } else if ("alive".equals(taskAction.actionType) || "targetAlive".equals(taskAction.actionType)) {
            JSONObject jSONObject2 = taskAction.actionData;
            if (jSONObject2 != null) {
                return jSONObject2.getString("targetAliveId");
            }
        } else if (!"dx_smart".equals(taskAction.actionType)) {
            return taskAction.actionType;
        } else {
            JSONObject jSONObject3 = taskAction.actionData;
            if (jSONObject3 != null) {
                return jSONObject3.getString("smartBizId");
            }
        }
        return "";
    }

    public SmartLandingTask g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLandingTask) ipChange.ipc$dispatch("3b1a0ab6", new Object[]{this, str});
        }
        if (this.y == null || zqq.a(str)) {
            return null;
        }
        for (SmartLandingTask smartLandingTask : this.y) {
            if (smartLandingTask != null && TextUtils.equals(str, smartLandingTask.popId)) {
                return smartLandingTask;
            }
        }
        return null;
    }

    public final SmartLandingTask h() {
        HashMap<String, ArrayList<ArrayList<SmartLandingTask.Condition>>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLandingTask) ipChange.ipc$dispatch("30517b3d", new Object[]{this});
        }
        List<SmartLandingTask> list = this.y;
        if (list == null) {
            return null;
        }
        for (SmartLandingTask smartLandingTask : list) {
            if (!(smartLandingTask == null || (hashMap = smartLandingTask.popConditions) == null || !hashMap.containsKey(g4.b.i))) {
                return smartLandingTask;
            }
        }
        return null;
    }

    public List<SmartLandingTask> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("81829f36", new Object[]{this});
        }
        return this.y;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b08c444", new Object[]{this});
        }
        return this.b;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("450b48e2", new Object[]{this});
        }
        return this.d + " entryLiveSource " + this.f + " liveSource " + this.k + " liveId " + this.l + " anchorId " + this.m;
    }

    public final void l() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c737b577", new Object[]{this});
            return;
        }
        this.b = UUID.randomUUID().toString();
        if (!"liveRoomPage".equals(this.d) || (!this.i && !TextUtils.isEmpty(this.l))) {
            z = true;
        }
        this.v = z;
        if (z) {
            t(null);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2ecf0d4", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public void n(TBLiveDataModel tBLiveDataModel, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26151e09", new Object[]{this, tBLiveDataModel, hashMap});
            return;
        }
        this.t = hashMap;
        if (!this.v) {
            t(tBLiveDataModel);
        }
    }

    public void o(boolean z, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd1762a", new Object[]{this, new Boolean(z), str, str2, str3, str4, str5, jSONObject});
            return;
        }
        C(str, str2, str3, str4, str5, jSONObject);
        if (!z) {
            l();
        }
    }

    @Override // tb.lhb
    public void onError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            return;
        }
        this.w = true;
        this.x = false;
        o3s.b("SmartLanding", "SML_request onError ");
        if (this.A != null) {
            q(new b());
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        List<SmartLandingTask> list = this.y;
        if (list != null) {
            list.clear();
        }
        this.j = null;
        this.l = null;
        this.m = null;
        this.k = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.z = null;
        this.t = null;
        this.c = null;
        this.b = null;
        this.w = false;
        this.x = false;
    }

    public final void q(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168d67a5", new Object[]{this, runnable});
        } else if (this.B.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.B.post(runnable);
        }
    }

    public void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d92cd3a", new Object[]{this, jSONObject});
            return;
        }
        jSONObject.put("spm", (Object) this.h);
        jSONObject.put("livesource", (Object) this.f);
        jSONObject.put("smartLandingToken", (Object) this.b);
    }

    public final String s(JSONObject jSONObject, String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b13a0f", new Object[]{this, jSONObject, str, uri});
        }
        String queryParameter = uri.getQueryParameter(str);
        if (!TextUtils.isEmpty(queryParameter)) {
            jSONObject.put(str, (Object) queryParameter);
        }
        return queryParameter;
    }

    public void u(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ba39df", new Object[]{this, new Long(j)});
        } else {
            this.F = j;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b45767c", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void w(ISmartLandingProxy.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bd7bfb", new Object[]{this, fVar});
            return;
        }
        this.A = fVar;
        if (fVar != null && this.w) {
            if (this.x) {
                fVar.d();
            } else {
                fVar.l();
            }
        }
    }

    public void y(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fa63c5", new Object[]{this, new Long(j)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<SmartLandingTask> list = this.y;
        if (list != null) {
            for (SmartLandingTask smartLandingTask : list) {
                if (sb.length() != 0) {
                    sb.append("^");
                }
                sb.append(smartLandingTask.popId);
            }
        }
        hashMap.put("pop_id_list", sb.toString());
        SmartLandingTask h = h();
        if (h != null) {
            hashMap.put("enter_pop_id", h.popId);
            hashMap.put("enter_componentName", f(h.popAction));
        }
        A("smartlanding_action_mtop_response", null, null, hashMap, j);
    }

    public void z(String str, SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b91d1d", new Object[]{this, str, smartLandingTask});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene_code", smartLandingTask.popId);
        hashMap.put("link_node_key", "push_smartlanding_room_max_message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "success");
        SmartLandingTask.TaskAction taskAction = smartLandingTask.popAction;
        if (taskAction != null) {
            jSONObject.put("data", (Object) taskAction.actionData);
        }
        hashMap.put("link_content", jSONObject.toJSONString());
        x(nkr.PAGE_TAOBAOLIVECONTAINER, "full_link_monitoring", hashMap);
        A("smartlanding_action_pop_show", str, smartLandingTask, null, 0L);
    }

    public final void C(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc732dcb", new Object[]{this, str, str2, str3, str4, str5, jSONObject});
            return;
        }
        this.j = str;
        this.f = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.g = jSONObject;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !parse.isOpaque()) {
            this.h = parse.getQueryParameter("spm");
            this.i = parse.getBooleanQueryParameter(yj4.PARAM_NEED_RECOMMEND, false);
        }
    }

    @Override // tb.lhb
    public void a(NetResponse netResponse, NetBaseOutDo netBaseOutDo) {
        MtopTbliveGrowthApiPopCheckPopResponseData data;
        List<SmartLandingTask> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4d2be6", new Object[]{this, netResponse, netBaseOutDo});
        } else if (netResponse == null || !netResponse.isApiSuccess()) {
            onError();
        } else {
            this.w = true;
            this.x = true;
            o3s.b("SmartLanding", "SML_onSuccess " + this.d + k());
            long currentTimeMillis = System.currentTimeMillis();
            if (netBaseOutDo instanceof MtopRoomstudioLiveDisplayDetailResponse) {
                JSONObject data2 = ((MtopRoomstudioLiveDisplayDetailResponse) netBaseOutDo).getData();
                if (data2 != null) {
                    this.y = fkx.c(data2.getString("popList"), SmartLandingTask.class);
                    JSONObject jSONObject = new JSONObject(data2);
                    this.z = jSONObject;
                    jSONObject.remove("popList");
                }
            } else if (!(!(netBaseOutDo instanceof MtopTbliveGrowthApiPopCheckPopResponse) || (data = ((MtopTbliveGrowthApiPopCheckPopResponse) netBaseOutDo).getData()) == null || (list = data.popList) == null)) {
                this.y = list;
            }
            if (this.A != null) {
                q(new a());
            }
            A("smartlanding_action_real_mtop_response", null, null, null, currentTimeMillis);
        }
    }

    public final void t(TBLiveDataModel tBLiveDataModel) {
        String str;
        String str2;
        HashMap<String, String> hashMap;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9d2c9d", new Object[]{this, tBLiveDataModel});
        } else if (!"liveRoomPage".equals(this.d) || ((!this.i && !TextUtils.isEmpty(this.l)) || tBLiveDataModel != null)) {
            this.w = false;
            this.x = false;
            if (this.u == null) {
                this.u = new c6q(this.E);
            }
            this.u.i(this);
            this.u.j(this.D);
            o3s.b("SmartLanding", "SML_getSmartLandingTask " + this.d + " entryLiveSource " + this.f + " liveSource " + this.k + " " + this.l + " " + this.m);
            if ("liveRoomPage".equals(this.d)) {
                JSONObject jSONObject = new JSONObject();
                String str3 = null;
                if (!TextUtils.isEmpty(this.j)) {
                    Uri parse = Uri.parse(this.j);
                    if (parse == null || parse.isOpaque()) {
                        str = null;
                        str3 = null;
                        str2 = null;
                    } else {
                        str = s(jSONObject, "targetAliveId", parse);
                        s(jSONObject, "targetAliveExtendInfo", parse);
                        this.n = s(jSONObject, yj4.PARAM_ITEM_HOLD_TYPE, parse);
                        this.o = s(jSONObject, yj4.PARAM_ITEM_IDS, parse);
                        this.p = s(jSONObject, yj4.PARAM_SJSD_ITEM_ID, parse);
                        str3 = s(jSONObject, yj4.PARAM_PRODUCT_TYPE, parse);
                        s(jSONObject, "keyPointId", parse);
                        str2 = s(jSONObject, yj4.PARAM_TIMEMOVING_ITEM_ID, parse);
                        s(jSONObject, "itemIds", parse);
                        s(jSONObject, yj4.PARAM_SHAQRE_ITEM_ID, parse);
                        JSONObject E = amr.E(parse);
                        if (!E.isEmpty()) {
                            jSONObject.put("huanduanParams", (Object) E.toJSONString());
                        }
                        s(jSONObject, "shareType", parse);
                    }
                    if (!TextUtils.isEmpty(this.q)) {
                        String str4 = this.q;
                        this.o = str4;
                        jSONObject.put(yj4.PARAM_ITEM_IDS, (Object) str4);
                    }
                    if (!TextUtils.isEmpty(this.r)) {
                        String str5 = this.r;
                        this.n = str5;
                        jSONObject.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) str5);
                    }
                    if (!TextUtils.isEmpty(this.s)) {
                        jSONObject.put("dispatchItemID", (Object) this.s);
                    }
                    if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
                        this.l = videoInfo.liveId;
                        str3 = videoInfo.displayExtParams;
                        if (!TextUtils.isEmpty(videoInfo.dispatchItemID)) {
                            jSONObject.put("dispatchItemID", (Object) tBLiveDataModel.mVideoInfo.dispatchItemID);
                        }
                        if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.itemHoldType)) {
                            String str6 = tBLiveDataModel.mVideoInfo.itemHoldType;
                            this.n = str6;
                            jSONObject.put(yj4.PARAM_ITEM_HOLD_TYPE, (Object) str6);
                        }
                        if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.holdItemIds)) {
                            String str7 = tBLiveDataModel.mVideoInfo.holdItemIds;
                            this.o = str7;
                            jSONObject.put(yj4.PARAM_ITEM_IDS, (Object) str7);
                        }
                        AccountInfo accountInfo = tBLiveDataModel.mVideoInfo.broadCaster;
                        if (accountInfo != null) {
                            this.m = accountInfo.accountId;
                        }
                    }
                    if (!TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.n) && TextUtils.isEmpty(this.o)) {
                        this.n = fgv.VALUE_ITEM_HOLD_TYPE_CARD;
                        jSONObject.put(yj4.PARAM_ITEM_HOLD_TYPE, fgv.VALUE_ITEM_HOLD_TYPE_CARD);
                        String str8 = this.p;
                        this.o = str8;
                        jSONObject.put(yj4.PARAM_ITEM_IDS, (Object) str8);
                    }
                } else {
                    str2 = null;
                    str = null;
                    str3 = null;
                }
                String c = iw0.c(this.f28547a);
                if (!TextUtils.isEmpty(this.e)) {
                    c = this.e;
                }
                if (nh4.B() && (tBLiveDataModel == null || (hashMap = this.t) == null || !hashMap.containsKey("isTimeMove") ? !(!RecModel.MEDIA_TYPE_TIMEMOVE.equals(str3) || (TextUtils.isEmpty(this.p) && TextUtils.isEmpty(str2))) : zqq.c(this.t.get("isTimeMove")))) {
                    c = "TaoBaoHighLight";
                }
                this.u.o(this.d, this.f, this.j, this.k, this.l, this.m, nh4.C0(), c, this.i, str, jSONObject, str3, this.g, this.b);
                return;
            }
            this.u.p(this.d, this.f, this.j, this.k, this.l, this.m, "20240625");
        }
    }
}
