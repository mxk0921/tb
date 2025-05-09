package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ifj a(tij tijVar, r2w... r2wVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifj) ipChange.ipc$dispatch("e588a140", new Object[]{tijVar, r2wVarArr});
        }
        ifj c = c(tijVar);
        for (r2w<p2w> r2wVar : r2wVarArr) {
            for (p2w p2wVar : r2wVar) {
                c.b(p2wVar);
            }
        }
        return c;
    }

    public static ifj b(String str, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifj) ipChange.ipc$dispatch("8745c9e6", new Object[]{str, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        return new s2w(str, j, j2, j3, j4);
    }

    public static ifj c(tij tijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifj) ipChange.ipc$dispatch("812b5e96", new Object[]{tijVar});
        }
        return new s2w(tijVar.getName(), tijVar.getExperimentId(), tijVar.c(), tijVar.getGroupId(), tijVar.a());
    }

    public static p2w d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p2w) ipChange.ipc$dispatch("3e9f2080", new Object[]{str, str2});
        }
        return new q2w(str, str2);
    }

    public static p2w e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p2w) ipChange.ipc$dispatch("cf59ecca", new Object[]{str, str2, str3});
        }
        return new q2w(str, str2, str3);
    }

    public static Map<String, tij> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc0ac48", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                ifj b = b(next, jSONObject2.getLong("id"), jSONObject2.getLong("release_id"), jSONObject2.getLong("group_id"), jSONObject2.getLong("bucket_id"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject(kva.SERIALIZE_EXP_VARIATIONS);
                Iterator<String> keys2 = jSONObject3.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    b.b(d(next2, jSONObject3.getString(next2)));
                }
                hashMap.put(next, b);
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static String g(Map<String, tij> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92aaca74", new Object[]{map});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, tij> entry : map.entrySet()) {
                String key = entry.getKey();
                tij value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", value.getExperimentId());
                jSONObject2.put("release_id", value.c());
                jSONObject2.put("group_id", value.getGroupId());
                jSONObject2.put("bucket_id", value.a());
                JSONObject jSONObject3 = new JSONObject();
                for (p2w p2wVar : value) {
                    jSONObject3.put(p2wVar.getName(), p2wVar.getValue());
                }
                jSONObject2.put(kva.SERIALIZE_EXP_VARIATIONS, jSONObject3);
                jSONObject.put(key, jSONObject2);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
