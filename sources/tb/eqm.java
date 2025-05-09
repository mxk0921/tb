package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f18762a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18763a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f18763a = str;
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
            fve.e("PrefetchRequestConfig", "write optimizationConfig");
            String concat = "after_buy_optimization_config".concat(this.f18763a);
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                str = jSONObject.toJSONString();
            } else {
                str = "";
            }
            kh0.b(concat, str);
        }
    }

    static {
        t2o.a(491782248);
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5175e55", new Object[]{str, jSONObject});
            return;
        }
        HashMap hashMap = (HashMap) f18762a;
        if (!jSONObject.equals((JSONObject) hashMap.get(str))) {
            hashMap.put(str, jSONObject);
            b(str, jSONObject);
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1a4fc0", new Object[]{str, jSONObject});
        } else {
            get.a().e(new a(str, jSONObject));
        }
    }
}
