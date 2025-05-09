package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.bridge.WeexPlatformInspectorBridge;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.qpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements qpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15560a;
        public final /* synthetic */ b b;

        public a(int i, b bVar) {
            this.f15560a = i;
            this.b = bVar;
        }

        @Override // tb.qpc.a
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(entry.getKey().substring(this.f15560a));
                jSONArray2.put(entry.getValue());
                jSONArray.put(jSONArray2);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(pg1.ATOM_EXT_entries, jSONArray);
            } catch (JSONException unused) {
            }
            ((WeexPlatformInspectorBridge.a) this.b).a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(982515910);
    }

    public static void a(String str, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c838940c", new Object[]{str, new Boolean(z), bVar});
        } else if (z) {
            r3x.k().c(str, new a(str.length(), bVar));
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(pg1.ATOM_EXT_entries, new JSONArray());
            } catch (JSONException unused) {
            }
            ((WeexPlatformInspectorBridge.a) bVar).a(jSONObject);
        }
    }
}
