package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539772);
    }

    public static void a(cfc cfcVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9a15be", new Object[]{cfcVar, baseSectionModel, jSONObject, map});
        } else if (baseSectionModel != null && jSONObject != null && map != null && d(cfcVar)) {
            String c = c(jSONObject);
            long uptimeMillis = SystemClock.uptimeMillis();
            Set<String> b = b(c);
            fve.e("NdUtParamsFilter", "getNdUtParamsWhiteList use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            e(cfcVar, map, b);
        }
    }

    public static Set<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("10ad0c56", new Object[]{str});
        }
        fve.e("NdUtParamsFilter", "getNdUtParamsWhiteList targetContainer: " + str);
        Set<String> set = null;
        try {
            if (TextUtils.equals("newDetail", str)) {
                set = wgj.b();
            } else if (TextUtils.equals(fnm.TARGET_TYPE_LITE_DETAIL, str)) {
                set = wgj.e();
            } else {
                fve.e("NdUtParamsFilter", "未实现目标容器白名单 ： " + str);
            }
        } catch (InfoFlowRuntimeException e) {
            fve.c("NdUtParamsFilter", "ND 埋点过滤白名单接口异常", e);
        }
        return set;
    }

    public static String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40a3dcb1", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return null;
        }
        return jSONObject2.getString("targetContainer");
    }

    public static boolean d(cfc cfcVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18cff4e6", new Object[]{cfcVar})).booleanValue();
        }
        if (cfcVar == null || (a2 = ul4.a(cfcVar)) == null || !a2.getBooleanValue("filterNdUtParam")) {
            return false;
        }
        return true;
    }

    public static void e(cfc cfcVar, Map<String, String> map, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60cacf4", new Object[]{cfcVar, map, set});
        } else if (set == null || set.isEmpty()) {
            fve.e("NdUtParamsFilter", "ND 白名单为空");
        } else {
            fve.e("NdUtParamsFilter", "执行ND白名单过滤 properties.size: " + map.size() + ", whiteList.size: " + set.size());
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!set.contains(it.next().getKey())) {
                    it.remove();
                }
            }
            if (cfcVar != null && !set.contains(tm2.HOME_BUCKETS)) {
                map.put(tm2.HOME_BUCKETS, "404");
                Context a2 = o3b.a(cfcVar);
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("clearNdHomeBuckets", "true");
                    uve.g(a2, hashMap);
                    fve.e("NdUtParamsFilter", "清空home_buckets，并塞入ND过滤标识，让首页的utPlugin过滤");
                }
            }
        }
    }
}
