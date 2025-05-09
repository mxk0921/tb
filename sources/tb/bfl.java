package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f16354a = new HashSet<>();
    public final Map<String, List<Pair<String, Long>>> b = new HashMap();
    public final UltronWeex2DataPrefetchCache c;

    static {
        t2o.a(614465802);
    }

    public bfl(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        this.c = ultronWeex2DataPrefetchCache;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62c153f", new Object[]{this, str});
        } else if (!wbl.j()) {
            hav.d("OrderWeex2PrefetchDataManager.clearPrefetchData", "disableOrderWeex2Prefetch");
        } else {
            UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache = this.c;
            if (ultronWeex2DataPrefetchCache != null) {
                ultronWeex2DataPrefetchCache.c(str);
            }
        }
    }

    public final boolean b(String str, String str2, long j) {
        Pair<JSONObject, String> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e0fc6fd", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        List<Pair> list = (List) ((HashMap) this.b).get(str);
        if (list != null && !list.isEmpty()) {
            for (Pair pair : list) {
                if (TextUtils.equals(str2, (CharSequence) pair.first) && j - ((Long) pair.second).longValue() < wbl.l()) {
                    return true;
                }
            }
        }
        UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache = this.c;
        if (ultronWeex2DataPrefetchCache == null || (d = ultronWeex2DataPrefetchCache.d(dbv.BIZ_ORDER_DETAIL, str)) == null || d.first == null) {
            return false;
        }
        return true;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("749aa7be", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f16354a.contains(str);
    }

    public void e(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0d982", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null) {
            UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "orderListResponse is null");
        } else {
            byte[] bytedata = mtopResponse.getBytedata();
            if (bytedata == null) {
                UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseByte is null");
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(new String(bytedata));
                if (parseObject == null) {
                    UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseJson is null");
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject == null) {
                    UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "responseData is null");
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("global");
                if (jSONObject2 == null) {
                    UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "global is null");
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("batchQueryControl");
                if (jSONObject3 == null) {
                    UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "batchQueryControl is null");
                    return;
                }
                JSONArray jSONArray = jSONObject3.getJSONArray("allowOrderIds");
                if (jSONArray == null) {
                    UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", "allowOrderIds is null");
                    return;
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        this.f16354a.add((String) next);
                    }
                }
            } catch (Exception e) {
                UnifyLog.e("OrderWeex2PrefetchDataManager.setupAllowOrderIds", e.toString());
            }
        }
    }

    public final void f(Map<String, List<String>> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee700f", new Object[]{this, map, new Long(j)});
            return;
        }
        for (String str : map.keySet()) {
            List list = (List) ((HashMap) this.b).get(str);
            if (list == null) {
                list = new ArrayList();
            }
            List<String> list2 = map.get(str);
            if (list2 != null && !list2.isEmpty()) {
                for (String str2 : list2) {
                    list.add(new Pair(str2, Long.valueOf(j)));
                }
            }
            ((HashMap) this.b).put(str, list);
        }
    }

    public void d(List<IDMComponent> list, OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed5171f", new Object[]{this, list, orderConfigs});
        } else if (!wbl.j()) {
            hav.d("OrderWeex2PrefetchDataManager.prefetch", "disableOrderWeex2Prefetch");
        } else if (list == null || list.isEmpty()) {
            hav.d("OrderWeex2PrefetchDataManager.prefetch", "no components");
        } else {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent == null || iDMComponent.getData() == null || iDMComponent.getData().getJSONObject("fields") == null) {
                    hav.d("OrderWeex2PrefetchDataManager.prefetch", "component fields is null");
                } else {
                    JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields").getJSONObject("basicInfo");
                    if (jSONObject == null) {
                        hav.d("OrderWeex2PrefetchDataManager.prefetch", "component orderIdInfo is null");
                    } else {
                        String string = jSONObject.getString("orderId");
                        String string2 = jSONObject.getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID);
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            hav.d("OrderWeex2PrefetchDataManager.prefetch", "component mainOrderId OR subOrderId is empty");
                        } else if (!c(string)) {
                            hav.d("OrderWeex2PrefetchDataManager.prefetch", "component mainOrderId is not in allowOrderIds");
                        } else if (b(string, string2, currentTimeMillis)) {
                            hav.d("OrderWeex2PrefetchDataManager.prefetch", "component has prefetched");
                        } else {
                            List list2 = (List) hashMap.get(string);
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            list2.add(string2);
                            hashMap.put(string, list2);
                            idl.c(idl.a.a(OrderBizCode.orderList, "odetailPreRequestUsage").branchEntry(true).message("订单4预请求发起").sampling(5.0E-4f));
                        }
                    }
                }
            }
            UltronWeex2DataPrefetchRequest b = afl.b(hashMap, this.c, orderConfigs, currentTimeMillis);
            if (b == null) {
                hav.d("OrderWeex2PrefetchDataManager.prefetch", "request is null");
                return;
            }
            b.b();
            f(hashMap, currentTimeMillis);
        }
    }
}
