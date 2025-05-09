package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends TypeReference<Map<String, BusinessRule>> {
    }

    public static Map<String, String> a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1cf484a", new Object[]{map});
        }
        HashMap hashMap = new HashMap(map.size());
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if ((obj instanceof String) && (obj2 instanceof String)) {
                hashMap.put((String) obj, (String) obj2);
            }
        }
        return hashMap;
    }

    public static AvailableBizRule b(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailableBizRule) ipChange.ipc$dispatch("c37e1bd0", new Object[]{str});
        }
        JSONObject e = e(str);
        if (e == null || (map = (Map) JSON.toJavaObject(e, Map.class)) == null) {
            return null;
        }
        Map<String, String> a2 = a(map);
        AvailableBizRule availableBizRule = new AvailableBizRule();
        availableBizRule.setBizMap(a2);
        return availableBizRule;
    }

    public static BusinessRule c(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BusinessRule) ipChange.ipc$dispatch("6f189890", new Object[]{str});
        }
        try {
            map = (Map) JSON.parseObject(str, new a(), new Feature[0]);
        } catch (JSONException unused) {
            map = null;
        }
        if (map == null || map.size() != 1) {
            return null;
        }
        BusinessRule businessRule = (BusinessRule) map.values().toArray()[0];
        businessRule.businessRuleName = (String) map.keySet().toArray()[0];
        return businessRule;
    }

    public static DefaultRule d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("c6fdc283", new Object[]{str});
        }
        JSONObject e = e(str);
        if (e == null) {
            return null;
        }
        return (DefaultRule) e.toJavaObject(DefaultRule.class);
    }

    public static JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
