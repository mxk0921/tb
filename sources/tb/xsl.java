package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f31582a = new HashMap(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31583a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f31583a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str2 = "passParams_" + this.f31583a;
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                str = "";
            } else {
                str = jSONObject.toJSONString();
            }
            qy8.b.i("home_pass_params", str2, str);
        }
    }

    static {
        t2o.a(729809759);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1963ede", new Object[]{str});
        }
        try {
            JSONObject jSONObject = (JSONObject) ((HashMap) f31582a).get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            JSONObject parseObject = JSON.parseObject(qy8.b.e("home_pass_params", "passParams_" + str, ""));
            if (parseObject != null && !parseObject.isEmpty()) {
                return parseObject;
            }
            imn d = zza.d(str);
            if (d != null) {
                return d.E(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec68e9ab", new Object[]{str, jSONObject});
            return;
        }
        ((HashMap) f31582a).put(str, jSONObject);
        m5a.a().h(new a(str, jSONObject));
    }
}
