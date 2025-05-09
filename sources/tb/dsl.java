package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(u0r<String> u0rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa446af", new Object[]{u0rVar, new Boolean(z)});
            return;
        }
        if (!u0rVar.a(bud.KEY_NEW_CONTENT_ENABLE)) {
            u0rVar.g(bud.KEY_NEW_CONTENT_ENABLE, z);
        }
        if (!u0rVar.a(bud.KEY_NEW_FACE_ENABLE)) {
            u0rVar.g(bud.KEY_NEW_FACE_ENABLE, z);
        }
    }

    public static xs7 b(JSONObject jSONObject, xs7 xs7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("b5941427", new Object[]{jSONObject, xs7Var});
        }
        if (!(jSONObject == null || xs7Var == null)) {
            xs7Var.g(jSONObject.optString("bucket"));
            u0r<String> c = xs7Var.c();
            Set<String> e = c.e();
            JSONObject optJSONObject = jSONObject.optJSONObject("switch");
            if (optJSONObject != null) {
                for (String str : e) {
                    if (optJSONObject.has(str)) {
                        c.g(str, optJSONObject.optBoolean(str));
                    }
                }
            }
        }
        return xs7Var;
    }

    public static xs7 c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("d7047304", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        xs7 xs7Var = new xs7();
        u0r<String> u0rVar = new u0r<>();
        xs7Var.e(u0rVar);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("switch");
            if (optJSONObject != null) {
                xs7Var.g(jSONObject.optString("bucket"));
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    u0rVar.g(next, optJSONObject.optBoolean(next));
                }
                a(u0rVar, z);
            }
            return xs7Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzq d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzq) ipChange.ipc$dispatch("793b82a0", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        zzq zzqVar = new zzq();
        u0r<String> u0rVar = new u0r<>();
        zzqVar.e(u0rVar);
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("switch");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    u0rVar.f(next, Boolean.valueOf(optJSONObject.optBoolean(next)));
                }
            }
            return zzqVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e27af8e", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (Throwable unused) {
            return new HashMap();
        }
    }

    public static List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60cd415", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(xw0.VIEW_ANIM_KEY_URLS);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
