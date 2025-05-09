package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, String>> f31644a = new HashMap();

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c63d5d5d", new Object[]{str});
        }
        Map<String, Map<String, String>> map = f31644a;
        if (map != null) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.containsKey(str)) {
                return b((Map) hashMap.get(str));
            }
        }
        Map<String, String> c = c(str);
        if (map != null && !TextUtils.isEmpty(str) && c.size() > 0) {
            ((HashMap) map).put(str, c);
        }
        return b(c);
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b07bfaf4", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("51d47f5f", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str.replace("'", "\"").replace(";", ","));
            if (parseObject.keySet().size() > 0) {
                for (String str2 : parseObject.keySet()) {
                    String valueOf = String.valueOf(str2);
                    hashMap.put(valueOf, (String) parseObject.get(valueOf));
                }
            }
        }
        return hashMap;
    }
}
