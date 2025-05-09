package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.yh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class afl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements UltronWeex2DataPrefetchRequest.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UltronWeex2DataPrefetchCache f15711a;
        public final /* synthetic */ long b;
        public final /* synthetic */ yh.a c;
        public final /* synthetic */ OrderConfigs d;

        public a(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache, long j, yh.a aVar, OrderConfigs orderConfigs) {
            this.f15711a = ultronWeex2DataPrefetchCache;
            this.b = j;
            this.c = aVar;
            this.d = orderConfigs;
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            UnifyLog.e("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onFailed,errorCode:" + str + ",errorMsg:" + str2);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest.c
        public void onSuccess(JSONObject jSONObject) {
            OrderConfigs orderConfigs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else if (this.f15711a == null) {
                UnifyLog.e("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,cache is null");
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    UnifyLog.e("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,responseData is null");
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("details");
                if (jSONObject3 == null) {
                    UnifyLog.e("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "onSuccess,prefetchData is null");
                    return;
                }
                for (String str : jSONObject3.keySet()) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str);
                    if (jSONObject4 != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject4.put(UltronWeex2DataPrefetchCache.KEY_PREFETCH_TIME_MILLIS, (Object) Long.valueOf(this.b));
                        jSONObject4.put("expiredTime", (Object) Long.valueOf(wbl.k()));
                        jSONObject5.put(str, (Object) jSONObject4);
                        this.f15711a.k(dbv.BIZ_ORDER_DETAIL, jSONObject5);
                    }
                }
                if (wbl.i() && this.c.f32082a == 1 && (orderConfigs = this.d) != null && orderConfigs.j() != null) {
                    this.d.j().p3(jSONObject3);
                }
            }
        }
    }

    static {
        t2o.a(614465800);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("463afca8", new Object[]{context, str, str2});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (UltronTradeHybridSwitcherHelper.k()) {
            return com.alibaba.android.ultron.vfw.weex2.a.g().e(context, str, str2, UltronTradeHybridInstanceRenderMode.SURFACE, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return com.alibaba.android.ultron.vfw.weex2.a.g().e(context, str, str2, UltronTradeHybridInstanceRenderMode.TEXTURE, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static UltronWeex2DialogFragment c(String str, String str2, String str3, com.taobao.android.weex_framework.a aVar, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("3c4f1f29", new Object[]{str, str2, str3, aVar, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        }
        UltronWeex2DialogFragment.e eVar = new UltronWeex2DialogFragment.e();
        eVar.b(str).c(str2).j(str3).i(aVar).h(z).g(false).d(i).f(i2).e(i3);
        return eVar.a();
    }

    public static Pair<JSONObject, String> d(String str, String str2, UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1eb0637b", new Object[]{str, str2, ultronWeex2DataPrefetchCache});
        }
        JSONObject jSONObject = null;
        if (!wbl.j()) {
            UnifyLog.e("OrderWeex2PrefetchDataManager.getPrefetchDataByOrderId", "disableOrderWeex2Prefetch");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.e("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "mainOrderId isEmpty");
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            UnifyLog.e("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "subOrderId isEmpty");
            return null;
        } else if (ultronWeex2DataPrefetchCache == null) {
            UnifyLog.e("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "cache is null");
            return null;
        } else {
            Pair<JSONObject, String> d = ultronWeex2DataPrefetchCache.d(dbv.BIZ_ORDER_DETAIL, str);
            if (d == null) {
                UnifyLog.e("OrderWeex2HighPerformanceHelper.getPrefetchDataByOrderId", "mainData is null");
                return null;
            }
            Object obj = d.first;
            if (obj != null) {
                jSONObject = ((JSONObject) obj).getJSONObject(str2);
            }
            return new Pair<>(jSONObject, d.second);
        }
    }

    public static UltronWeex2DataPrefetchRequest b(Map<String, List<String>> map, UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache, OrderConfigs orderConfigs, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DataPrefetchRequest) ipChange.ipc$dispatch("8236fc6f", new Object[]{map, ultronWeex2DataPrefetchCache, orderConfigs, new Long(j)});
        }
        if (map == null || map.isEmpty()) {
            UnifyLog.e("OrderWeex2HighPerformanceHelper.generateUltronWeex2DataPrefetchRequest", "no orderIds");
            return null;
        }
        UltronWeex2DataPrefetchRequest.b bVar = new UltronWeex2DataPrefetchRequest.b();
        bVar.j("mtop.taobao.order.batchquery.detail").k("1.0").m("get").p(false).o("UNIT_TRADE");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(map.keySet());
        hashMap.put("bizOrderIds", jSONArray.toJSONString());
        hashMap.put("appName", "tborder");
        hashMap.put("appVersion", k75.VIDEOCONFIG_API_VERSION_3);
        hashMap.put("pageFrom", "boughtList");
        yh.a a2 = yh.a();
        int i = a2.f32082a;
        if (i == 3) {
            hashMap.put("deviceLevel", "high");
        } else if (i == 2) {
            hashMap.put("deviceLevel", "medium");
        } else if (i == 1) {
            hashMap.put("deviceLevel", "low");
        } else {
            hashMap.put("deviceLevel", "unknow");
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list == null || list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID, (Object) str);
                jSONObject2.put("taoTm3", (Object) Boolean.TRUE);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.add(jSONObject2);
                jSONObject.put(str, (Object) jSONArray2);
            } else {
                JSONArray jSONArray3 = new JSONArray();
                for (String str2 : list) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID, (Object) str2);
                    jSONObject3.put("taoTm3", (Object) Boolean.TRUE);
                    jSONArray3.add(jSONObject3);
                }
                jSONObject.put(str, (Object) jSONArray3);
            }
        }
        hashMap.put("extParams", jSONObject.toJSONString());
        bVar.n(hashMap);
        bVar.l(new a(ultronWeex2DataPrefetchCache, j, a2, orderConfigs));
        return bVar.h();
    }
}
