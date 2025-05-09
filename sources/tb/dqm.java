package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f18014a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18015a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f18015a = str;
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
            String concat = "after_buy_optimization_config".concat(this.f18015a);
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
        t2o.a(729809729);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a8ac5d2", new Object[]{str});
        }
        JSONObject d = d(str);
        if (d != null) {
            return d.getString("optimizeType");
        }
        uqa.b("recmdPrefetch", "PrefetchRequestConfig", "optimizationConfig == null");
        return null;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4183cc01", new Object[]{str})).intValue();
        }
        JSONObject d = d(str);
        if (d != null) {
            return d.getIntValue("orderNumThreshold");
        }
        uqa.b("recmdPrefetch", "PrefetchRequestConfig", "optimizationConfig == null");
        return -1;
    }

    public static void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5175e55", new Object[]{str, jSONObject});
            return;
        }
        HashMap hashMap = (HashMap) f18014a;
        if (!jSONObject.equals((JSONObject) hashMap.get(str))) {
            hashMap.put(str, jSONObject);
            f(str, jSONObject);
        }
    }

    public static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca079f53", new Object[]{str});
        }
        HashMap hashMap = (HashMap) f18014a;
        JSONObject jSONObject = (JSONObject) hashMap.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject e = e(str);
        hashMap.put(str, e);
        return e;
    }

    public static JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa65eec7", new Object[]{str});
        }
        String a2 = kh0.a("after_buy_optimization_config".concat(str), "");
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(a2)) {
            uqa.b("recmdPrefetch", "PrefetchRequestConfig", "从磁盘中读出来的数为空");
            return jSONObject;
        }
        try {
            return JSON.parseObject(a2);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PrefetchRequestConfig", "解析出现异常：" + e);
            return jSONObject;
        }
    }

    public static void f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1a4fc0", new Object[]{str, jSONObject});
        } else {
            m5a.a().e(new a(str, jSONObject));
        }
    }
}
