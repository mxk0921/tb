package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter;
import com.taobao.android.detail2.core.realtime.RealtimeRearrangeImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.gln;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ucp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f29295a;
    public final DetailDataManager b;
    public final dh7 c;
    public final gln d;
    public boolean e;
    public final HashSet<String> f = new HashSet<>();
    public boolean g;
    public nkn h;
    public final pyj i;
    public final gln.b j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements pyj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ucp ucpVar) {
        }

        @Override // tb.pyj
        public Map<String, String> a(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, x3w x3wVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            JSONObject jSONObject5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("28bbee2e", new Object[]{this, activity, new Integer(i), str, str2, str3, map, x3wVar});
            }
            if (x3wVar == null || (jSONObject = x3wVar.q) == null || (jSONObject2 = jSONObject.getJSONObject("realtime")) == null || (jSONObject3 = jSONObject2.getJSONObject("realtimeList")) == null || (jSONObject4 = jSONObject3.getJSONObject(str)) == null || (jSONObject5 = jSONObject4.getJSONObject("args")) == null) {
                return null;
            }
            return new HashMap((Map) JSON.toJavaObject(jSONObject5, Map.class));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements gln.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.gln.b
        public void b(int i, String str, nkn nknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc4a9ae6", new Object[]{this, new Integer(i), str, nknVar});
                return;
            }
            ucp.d(ucp.this, false);
            if (!ucp.f(ucp.this).j().j()) {
                txj.e(txj.TAG_REALTIME, "实时插卡返回失败结果，功能开关是 关闭的。");
                return;
            }
            String str2 = "实时插卡返回错误结果, errorCode: " + i + ", errorMsg: " + str + " realTimeRequestParam:" + nknVar;
            q0j.s(txj.TAG_REALTIME, q0j.SCENE_INSERT_CARD, q0j.ERROR_CODE_INSERT_CARD_ERROR, str2, null);
            ucp.j(ucp.this, false, str2, null, null);
        }

        @Override // tb.gln.b
        public void a(x3w x3wVar, List<x3w> list, String str, JSONObject jSONObject, nkn nknVar) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fec586e", new Object[]{this, x3wVar, list, str, jSONObject, nknVar});
                return;
            }
            ucp.d(ucp.this, false);
            HashMap hashMap = new HashMap();
            int size = list.size();
            hashMap.put("effectItemCount", String.valueOf(size));
            q0j.g("eventProcess", "Monitor_NewDetail_InsertCardOnReqSuc_" + ucp.f(ucp.this).j().p().a(), null);
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_NODE_ON_REQUEST_SUC_NEW, hashMap);
            if (!ucp.f(ucp.this).j().j()) {
                txj.e(txj.TAG_REALTIME, "实时插卡返回成功结果，但开关是关闭的，重排结果不生效");
            } else if (nknVar == null) {
                String str3 = "实时插卡返回成功结果。onSuccess 缺少 realTimeRequestParam 参数。triggerNid:" + str;
                txj.e(txj.TAG_REALTIME, str3);
                ucp.j(ucp.this, false, str3, null, null);
            } else {
                JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("configSwitches");
                boolean z = jSONObject2 != null && jSONObject2.getBooleanValue("realtimeResult");
                JSONArray jSONArray = jSONObject == null ? null : jSONObject.getJSONArray("sectionList");
                int size2 = jSONArray == null ? 0 : jSONArray.size();
                JSONObject i = ywj.i(jSONObject2, "realtimeControl");
                if (!z) {
                    String str4 = "实时插卡返回成功结果，服务端声明数据不可用，dataSize:" + size2 + " nodesSize:" + size + " realTimeRequestParam:" + nknVar;
                    txj.e(txj.TAG_REALTIME, str4);
                    ucp.j(ucp.this, false, str4, i, null);
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardResultFalseAbort_" + ucp.f(ucp.this).j().p().a(), null);
                } else if (size == 0) {
                    String str5 = "异常:实时插卡返回成功结果，服务端声明数据可用，因 nodesSize 为空导致插卡异常。dataSize:" + size2 + " nodesSize:" + size + " realTimeRequestParam:" + nknVar;
                    txj.e(txj.TAG_REALTIME, str5);
                    ucp.j(ucp.this, false, str5, i, null);
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardNodeSizeEmptyAbort_" + ucp.f(ucp.this).j().p().a(), null);
                } else {
                    txj.e(txj.TAG_REALTIME, "实时插卡返回成功结果，服务端声明数据可用，dataSize:" + size2 + " nodesSize:" + size);
                    x3w N = ucp.b(ucp.this).N();
                    if (N == null) {
                        str2 = "";
                    } else {
                        str2 = N.h;
                    }
                    String d = nknVar.d();
                    if (ucp.g(ucp.this)) {
                        ucp.h(ucp.this, nknVar);
                        boolean contains = ucp.e(ucp.this).contains(d);
                        if (contains) {
                            ucp.e(ucp.this).remove(nknVar.d());
                        }
                        String str6 = "实时插卡返回成功，页面不在前台展示，重排结果不生效。回前台将重新发起请求。nid:" + nknVar.d() + " 删防反复请求:" + contains + " realTimeRequestParam:" + nknVar;
                        txj.e(txj.TAG_REALTIME, str6);
                        ucp.j(ucp.this, false, str6, i, null);
                        return;
                    }
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardRequestEffect_" + ucp.f(ucp.this).j().p().a(), null);
                    int V = ucp.b(ucp.this).V(str2);
                    int i2 = V + 1;
                    txj.e(txj.TAG_REALTIME, "端智能返回成功结果，开始执行实时插卡逻辑。currentMaxExposurePosition:" + V + " newPosition:" + i2);
                    DetailRecyclerViewAdapter.c C0 = ucp.b(ucp.this).C0(list, i2);
                    if (C0 == null) {
                        String str7 = "端智能返回成功结果，实时插卡结果失败 result is null。realTimeRequestParam:" + nknVar;
                        txj.e(txj.TAG_REALTIME, str7);
                        ucp.j(ucp.this, false, str7, i, null);
                    } else if (((ArrayList) C0.b).isEmpty()) {
                        String str8 = "异常:端智能返回成功结果，实时插卡结果失败 replaceList 为空。newNodeNidList:" + C0.c + " realTimeRequestParam:" + nknVar;
                        txj.e(txj.TAG_REALTIME, str8);
                        ucp.j(ucp.this, false, str8, i, null);
                    } else {
                        ucp.a(ucp.this).d0(true, C0.b);
                        String str9 = "端智能返回成功结果，实时插卡结果成功。newNodeNidList:" + C0.c + " realTimeRequestParam:" + nknVar;
                        txj.e(txj.TAG_REALTIME, str9);
                        ucp.j(ucp.this, true, str9, i, C0.c);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("effectItemCount", String.valueOf(((ArrayList) C0.b).size()));
                        q0j.g("eventProcess", "Monitor_NewDetail_InsertCardUiSuccess_" + ucp.f(ucp.this).j().p().a(), hashMap2);
                        try {
                            ucp.a(ucp.this).l0(ucp.b(ucp.this).K().size());
                            txj.e(txj.TAG_REALTIME, "实时插卡，刷新 exposedItemCount 参数成功。exposedItemCount:" + ucp.a(ucp.this).F());
                        } catch (Exception unused) {
                            txj.e(txj.TAG_REALTIME, "实时插卡，刷新 exposedItemCount 参数失败。");
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(352322072);
    }

    public ucp(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager) {
        gln glnVar = new gln();
        this.d = glnVar;
        a aVar = new a(this);
        b bVar = new b();
        c cVar = new c();
        this.f29295a = cxjVar;
        this.c = dh7Var;
        this.b = detailDataManager;
        glnVar.d(new RealtimeRearrangeImpl(cxjVar));
        glnVar.e(cVar);
        glnVar.c(bVar);
        dh7Var.u(aVar);
    }

    public static /* synthetic */ DetailDataManager a(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailDataManager) ipChange.ipc$dispatch("636fe685", new Object[]{ucpVar});
        }
        return ucpVar.b;
    }

    public static /* synthetic */ dh7 b(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("f6571cc1", new Object[]{ucpVar});
        }
        return ucpVar.c;
    }

    public static /* synthetic */ boolean c(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94bf43d5", new Object[]{ucpVar})).booleanValue();
        }
        return ucpVar.e;
    }

    public static /* synthetic */ boolean d(ucp ucpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0380ba9", new Object[]{ucpVar, new Boolean(z)})).booleanValue();
        }
        ucpVar.e = z;
        return z;
    }

    public static /* synthetic */ HashSet e(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("bdb90dcd", new Object[]{ucpVar});
        }
        return ucpVar.f;
    }

    public static /* synthetic */ cxj f(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("368d46b8", new Object[]{ucpVar});
        }
        return ucpVar.f29295a;
    }

    public static /* synthetic */ boolean g(ucp ucpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd08872", new Object[]{ucpVar})).booleanValue();
        }
        return ucpVar.g;
    }

    public static /* synthetic */ nkn h(ucp ucpVar, nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkn) ipChange.ipc$dispatch("40180a8b", new Object[]{ucpVar, nknVar});
        }
        ucpVar.h = nknVar;
        return nknVar;
    }

    public static /* synthetic */ nkn i(ucp ucpVar, nkn nknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkn) ipChange.ipc$dispatch("476b680c", new Object[]{ucpVar, nknVar});
        }
        ucpVar.getClass();
        return nknVar;
    }

    public static /* synthetic */ void j(ucp ucpVar, boolean z, String str, JSONObject jSONObject, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7778e", new Object[]{ucpVar, new Boolean(z), str, jSONObject, list});
        } else {
            ucpVar.n(z, str, jSONObject, list);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.d.a();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.g = true;
        this.d.b();
    }

    public final void n(boolean z, String str, JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ed7e76", new Object[]{this, new Boolean(z), str, jSONObject, list});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", (Object) String.valueOf(z));
        if (str == null) {
            str = "";
        }
        jSONObject2.put("msg", (Object) str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject2.put("realtimeControl", (Object) jSONObject);
        if (list == null || list.isEmpty()) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = (JSONArray) JSON.toJSON(list);
        }
        jSONObject2.put("nextNidList", (Object) jSONArray);
        txj.e(txj.TAG_REALTIME, "实时插卡 weex event, realtimeRefreshResult msgObj:" + jSONObject2);
        this.c.M0("realtimeRefreshResult", jSONObject2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements gln.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public DetailDataManager.LimitedQueue<String> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailDataManager.LimitedQueue) ipChange.ipc$dispatch("e29a6fbd", new Object[]{this});
            }
            return ucp.a(ucp.this).E();
        }

        public DetailDataManager.LimitedQueue<String> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailDataManager.LimitedQueue) ipChange.ipc$dispatch("f26598c5", new Object[]{this});
            }
            return ucp.a(ucp.this).G();
        }

        public x3w e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x3w) ipChange.ipc$dispatch("28cd0d77", new Object[]{this, str});
            }
            return ucp.a(ucp.this).I(str);
        }

        public x3w f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x3w) ipChange.ipc$dispatch("3e5b4398", new Object[]{this});
            }
            return ucp.b(ucp.this).N();
        }

        public List<x3w> g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6bc31491", new Object[]{this});
            }
            return ucp.b(ucp.this).Z();
        }

        public boolean a(String str, String str2, nkn nknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e78854c", new Object[]{this, str, str2, nknVar})).booleanValue();
            }
            txj.e(txj.TAG_REALTIME, "==============================================================");
            q0j.g("eventProcess", "Monitor_NewDetail_InsertCardIfTrigger_" + ucp.f(ucp.this).j().p().a(), null);
            if (!ucp.f(ucp.this).j().j()) {
                txj.e(txj.TAG_REALTIME, "实时插卡: canTriggerRearrange 服务端重排开关或orange开关关闭，不符合触发重排条件判断");
                q0j.g("eventProcess", "Monitor_NewDetail_InsertCardSwitchAbort_" + ucp.f(ucp.this).j().p().a(), null);
                return false;
            } else if (nknVar == null) {
                String str3 = "实时插卡异常: canTriggerRearrange realTimeRequestParam 参数为空。未知的异常路径。nid:" + str2 + " instanceId:" + str;
                txj.e(txj.TAG_REALTIME, str3);
                q0j.s(txj.TAG_REALTIME, q0j.SCENE_INSERT_CARD, q0j.ERROR_CODE_INSERT_CARD_CHECK_NO_PARAM, str3, null);
                return false;
            } else if (!TextUtils.equals(nknVar.c(), ucp.f(ucp.this).j().B())) {
                txj.e(txj.TAG_REALTIME, "canTriggerRearrange instanceId不一致，不符合触发重排条件判断");
                q0j.g("eventProcess", "Monitor_NewDetail_InsertCardInstanceIdAbort_" + ucp.f(ucp.this).j().p().a(), null);
                return false;
            } else {
                x3w B = ucp.b(ucp.this).B();
                x3w N = ucp.b(ucp.this).N();
                int V = N != null ? ucp.b(ucp.this).V(N.h) : -1;
                int V2 = B != null ? ucp.b(ucp.this).V(B.h) : -1;
                int S = ucp.f(ucp.this).j().N().S();
                if (V == -1 || V2 == -1 || V - V2 > S) {
                    txj.e(txj.TAG_REALTIME, "canTriggerRearrange 当前曝光位置小于最大曝光位置，不符合触发重排条件判断。max:" + V + " cur:" + V2 + " expDiffValue:" + S);
                    StringBuilder sb = new StringBuilder("Monitor_NewDetail_InsertCardExposureAbort_");
                    sb.append(ucp.f(ucp.this).j().p().a());
                    q0j.g("eventProcess", sb.toString(), null);
                    return false;
                } else if (ucp.c(ucp.this)) {
                    txj.e(txj.TAG_REALTIME, "canTriggerRearrange 上次重排未返回结果，不符合重排条件判断。nid:" + str2);
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardRearrangingAbort_" + ucp.f(ucp.this).j().p().a(), null);
                    return false;
                } else if (!ucp.f(ucp.this).j().N().c(byj.DOWNGRADE_KEY_INSERT_CARD_CHECK_REQUESTING) || !ucp.a(ucp.this).X()) {
                    ucp.d(ucp.this, true);
                    ucp.i(ucp.this, nknVar);
                    txj.e(txj.TAG_REALTIME, "实时插卡，canTriggerRearrange 当前符合触发重排条件判断");
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardCanTrigger_" + ucp.f(ucp.this).j().p().a(), null);
                    return true;
                } else {
                    txj.e(txj.TAG_REALTIME, "推荐列表正在请求中，不符合触发重排条件判断");
                    q0j.g("eventProcess", "Monitor_NewDetail_InsertCardRequestingListAbort_" + ucp.f(ucp.this).j().p().a(), null);
                    return false;
                }
            }
        }

        public boolean b(RecRequestParamsV2 recRequestParamsV2, DetailDataManager.d dVar, nkn nknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8987d0a7", new Object[]{this, recRequestParamsV2, dVar, nknVar})).booleanValue();
            }
            txj.e(txj.TAG_REALTIME, "正在发起实时插卡的请求");
            String str = null;
            if (nknVar == null) {
                String str2 = "插卡请求未发起，请关注原因。未知的异常路径。params:" + recRequestParamsV2;
                txj.e(txj.TAG_REALTIME, str2);
                q0j.s(txj.TAG_REALTIME, q0j.SCENE_INSERT_CARD, q0j.ERROR_CODE_INSERT_CARD_NO_PARAM, str2, null);
                ucp.d(ucp.this, false);
                return false;
            }
            String d = nknVar.d();
            if (d != null && ucp.e(ucp.this).contains(d)) {
                ucp.d(ucp.this, false);
                txj.e(txj.TAG_REALTIME, "实时插卡已发起过请求，不再发起新异步请求。nid:" + d + " realTimeRequestParam:" + nknVar);
                StringBuilder sb = new StringBuilder("Monitor_NewDetail_InsertCardBroadcastPause_");
                sb.append(ucp.f(ucp.this).j().p().a());
                q0j.g("eventProcess", sb.toString(), null);
                return false;
            } else if (ucp.g(ucp.this)) {
                ucp.h(ucp.this, nknVar);
                ucp.d(ucp.this, false);
                txj.e(txj.TAG_REALTIME, "插卡请求未发起。由于当面页面不在前台，待回到前台将重新发起。nid:" + d + " realTimeRequestParam:" + nknVar);
                StringBuilder sb2 = new StringBuilder("Monitor_NewDetail_InsertCardHasRequestAbort_");
                sb2.append(ucp.f(ucp.this).j().p().a());
                q0j.g("eventProcess", sb2.toString(), null);
                return false;
            } else {
                if (d != null) {
                    ucp.e(ucp.this).add(d);
                    txj.e(txj.TAG_REALTIME, "插卡请求准备发起。已记入防止反复请求列表。nid:" + d + " realTimeRequestParam:" + nknVar);
                    x3w I = ucp.a(ucp.this).I(d);
                    if (I != null) {
                        str = I.f;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    txj.e(txj.TAG_REALTIME, "插卡请求可能异常，未获取到触发节点的 pageNum。默认 0 。nid:" + d);
                    str = "0";
                } else {
                    txj.e(txj.TAG_REALTIME, "插卡请求即将发起，nid:" + d + " 获取到 pageNum:" + str);
                }
                recRequestParamsV2.setCustomPageNum(str);
                txj.e(txj.TAG_REALTIME, "请求:插卡请求已真实发起，nid:" + d + " realTimeRequestParam:" + nknVar);
                HashMap hashMap = new HashMap();
                hashMap.put("requestStartIndex", String.valueOf(nknVar.b()));
                q0j.g("eventProcess", "Monitor_NewDetail_InsertCardRequestStart_" + ucp.f(ucp.this).j().p().a(), hashMap);
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_INSERT_CARD_REQ_START_NEW, hashMap);
                ucp.a(ucp.this).w(recRequestParamsV2, dVar);
                return true;
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.g = false;
        this.d.f();
        nkn nknVar = this.h;
        if (nknVar != null) {
            this.e = true;
            this.h = null;
            if (this.d.g(null, nknVar)) {
                txj.e(txj.TAG_REALTIME, "之前由于页面不在前台导致的重排没生效，页面resume时机重新发起请求，发起成功了。");
                q0j.g("eventProcess", "Monitor_NewDetail_InsertCardBroadcastReqSuc_" + this.f29295a.j().p().a(), null);
                return;
            }
            txj.e(txj.TAG_REALTIME, "之前由于页面不在前台导致的重排没生效，页面resume时机重新发起请求。但是发起失败了。");
            this.e = false;
            q0j.g("eventProcess", "Monitor_NewDetail_InsertCardBroadcastReqErr_" + this.f29295a.j().p().a(), null);
        }
    }
}
