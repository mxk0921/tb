package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class upq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f29548a = Collections.synchronizedList(new ArrayList());

    static {
        t2o.a(912262219);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
        } else {
            this.f29548a.clear();
        }
    }

    public void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca94c82", new Object[]{this, bArr});
        } else if (bArr != null) {
            this.f29548a.add(bArr);
        }
    }

    public List<byte[]> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("232b761a", new Object[]{this});
        }
        return this.f29548a;
    }

    public final JSONObject d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ea2ae1f", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return jSONObject2;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                f(jSONObject, key, (JSONObject) value);
            } else if (value instanceof JSONArray) {
                e(jSONObject, key, (JSONArray) value);
            } else if (value != null) {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c782df59", new Object[]{this, jSONObject, str, jSONArray});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
        if (jSONArray2 != null) {
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                if ((jSONArray.get(i) instanceof JSONObject) && (jSONArray2.get(i) instanceof JSONObject)) {
                    jSONArray3.add(d((JSONObject) jSONArray2.get(i), (JSONObject) jSONArray.get(i)));
                } else if (jSONArray.get(i) != null) {
                    jSONArray3.add(jSONArray.get(i));
                }
            }
            if (jSONArray2.size() > jSONArray.size()) {
                for (int size = jSONArray.size(); size < jSONArray2.size(); size++) {
                    jSONArray3.add(jSONArray2.get(size));
                }
            }
            jSONObject.put(str, (Object) jSONArray3);
            return;
        }
        jSONObject.put(str, (Object) jSONArray);
    }

    public final void f(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8becdcd3", new Object[]{this, jSONObject, str, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (jSONObject3 != null) {
            jSONObject.put(str, (Object) d(jSONObject3, jSONObject2));
        } else {
            jSONObject.put(str, (Object) jSONObject2);
        }
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("212526a9", new Object[]{this});
        }
        JSONObject jSONObject = null;
        if (this.f29548a.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.f29548a.size(); i++) {
            JSONObject a2 = DynamicMergeUtils.a(JSON.parseObject(new String(this.f29548a.get(i))));
            if (a2 != null) {
                jSONObject = d(jSONObject, a2);
            }
        }
        return jSONObject;
    }
}
