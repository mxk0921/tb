package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class r5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r5p INSTANCE = new r5p();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, JSONArray> f27126a = new HashMap<>();

    static {
        t2o.a(815792250);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5988572", new Object[]{this, str});
            return;
        }
        ckf.g(str, "srpKey");
        f27126a.remove(str);
    }

    public final JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e2d425d5", new Object[]{this, str});
        }
        ckf.g(str, "srpKey");
        return f27126a.get(str);
    }

    public final void c(String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c847bb", new Object[]{this, str, new Integer(i), jSONObject});
            return;
        }
        ckf.g(str, "srpKey");
        if (jSONObject != null && o4p.E1() && i <= 2) {
            HashMap<String, JSONArray> hashMap = f27126a;
            JSONArray jSONArray = hashMap.get(str);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                hashMap.put(str, jSONArray);
            }
            if (i == 1) {
                jSONArray.clear();
            }
            jSONArray.add(jSONObject);
        }
    }
}
