package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ntq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, HashMap<String, String>> d = new HashMap<>();
    public static final HashMap<String, HashMap<String, String>> e = new HashMap<>();
    public static final HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> f = new HashMap<>();
    public static ntq g;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, List<Object>> f24946a = new HashMap<>();
    public final HashMap<String, LruCache<String, Integer>> b = new HashMap<>();
    public final HashMap<String, HashMap<String, Integer>> c = new HashMap<>();

    static {
        t2o.a(1039138844);
        new HashMap();
        i0o.e();
    }

    public ntq() {
        new HashMap();
    }

    public static synchronized ntq i() {
        synchronized (ntq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ntq) ipChange.ipc$dispatch("8acb8830", new Object[0]);
            }
            if (g == null) {
                g = new ntq();
            }
            return g;
        }
    }

    public <T> T a(JSONObject jSONObject, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("69e87799", new Object[]{this, jSONObject, cls});
        }
        if (jSONObject == null) {
            return null;
        }
        String str = i0o.e().f;
        JSONObject jSONObject2 = new JSONObject();
        if (b(str) != null && b(str).size() > 0) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String obj = entry.getKey().toString();
                String obj2 = entry.getValue().toString();
                if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
                    if (b(str).containsKey(obj)) {
                        obj = b(str).get(obj);
                    }
                    jSONObject2.put(obj, (Object) obj2);
                }
            }
            jSONObject = jSONObject2;
        }
        try {
            return (T) JSON.toJavaObject(jSONObject, cls);
        } catch (Throwable th) {
            mgh.b(th);
            return null;
        }
    }

    public HashMap<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("67da3616", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = i0o.e().e;
        }
        HashMap<String, HashMap<String, String>> hashMap = e;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new HashMap<>());
        }
        return hashMap.get(str);
    }

    public LruCache<String, Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("17e67fb6", new Object[]{this});
        }
        String str = i0o.e().f;
        if (this.b.get(str) == null) {
            this.b.put(str, new LruCache<>(1024));
        }
        return this.b.get(str);
    }

    public HashMap<String, Integer> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("411fdcc0", new Object[]{this});
        }
        return e("");
    }

    public HashMap<String, Integer> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9267aaca", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = i0o.e().e;
        }
        if (this.c.get(str) == null) {
            return new HashMap<>();
        }
        return this.c.get(str);
    }

    public HashMap<String, HashMap<String, Object>> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("77086e99", new Object[]{this, str});
        }
        return g(str, i0o.e().f);
    }

    public HashMap<String, HashMap<String, Object>> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f51ad863", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            str = "common";
        }
        if (n(str2) == null || !n(str2).containsKey(str)) {
            return new HashMap<>();
        }
        return n(str2).get(str);
    }

    public List<Object> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8eb61d0c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = i0o.e().e;
        }
        if (this.f24946a.get(str) == null) {
            return new ArrayList();
        }
        return this.f24946a.get(str);
    }

    public HashMap<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c66f7f5d", new Object[]{this});
        }
        return k("");
    }

    public HashMap<String, String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f550c027", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = i0o.e().e;
        }
        HashMap<String, HashMap<String, String>> hashMap = d;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new HashMap<>());
        }
        return hashMap.get(str);
    }

    public lmc l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmc) ipChange.ipc$dispatch("2637e1ae", new Object[]{this});
        }
        return null;
    }

    public knc m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knc) ipChange.ipc$dispatch("12e83c2b", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, HashMap<String, HashMap<String, Object>>> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5f01adc5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = i0o.e().e;
        }
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> hashMap = f;
        if (hashMap == null || hashMap.size() == 0) {
            return null;
        }
        return hashMap.get(str);
    }
}
