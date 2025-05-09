package tb;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p6g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean b = tv6.a();
    public static final Map<String, p6g> c = new HashMap();
    public static JSONObject d = new JSONObject();

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f25902a = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25903a;

        public a(String str) {
            this.f25903a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                p6g.a(this.f25903a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f25904a = "";
        public Variation b;

        static {
            t2o.a(511705093);
        }

        public static b a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3bebc6d", new Object[]{jSONObject, str});
            }
            b bVar = new b();
            if (!b(jSONObject, str)) {
                return bVar;
            }
            String string = jSONObject.getJSONObject(str).getString("orangeGroupName");
            String string2 = jSONObject.getJSONObject(str).getString("orangeKey");
            String string3 = jSONObject.getJSONObject(str).getString("orangeDefaultConfig");
            bVar.b = UTABTest.activate(jSONObject.getJSONObject(str).getString("testComponent"), jSONObject.getJSONObject(str).getString("testModule")).getVariation(jSONObject.getJSONObject(str).getString("testKey"));
            bVar.f25904a = OrangeConfig.getInstance().getConfig(string, string2, string3);
            return bVar;
        }

        public static boolean b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("10db2087", new Object[]{jSONObject, str})).booleanValue();
            }
            if (!c(jSONObject, str)) {
                return false;
            }
            return c(jSONObject.getJSONObject(str), "testComponent", "testModule", "testKey", "orangeGroupName", "orangeKey", "orangeDefaultConfig");
        }

        public static boolean c(JSONObject jSONObject, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e593ab37", new Object[]{jSONObject, strArr})).booleanValue();
            }
            for (String str : strArr) {
                if (!jSONObject.containsKey(str)) {
                    if (p6g.b()) {
                        Toast.makeText(Globals.getApplication(), "配置信息缺少key: = " + str + ", 请检查！！！", 1).show();
                    }
                    odg.c("LCABTestDeciderManager", "DecisionBean.isContainsKeys: invalid config, missing key: " + str);
                    return false;
                }
            }
            return true;
        }
    }

    static {
        t2o.a(511705091);
    }

    public p6g(String str) {
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            i(str);
        }
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956cfcd3", new Object[]{str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = d;
        if (jSONObject == null || jSONObject.size() <= 0) {
            trt.f(new a(str), z);
        }
    }

    public static void i(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95605a5d", new Object[]{str});
            return;
        }
        String u = krq.u(Globals.getApplication(), str);
        if (!TextUtils.isEmpty(u)) {
            try {
                jSONObject = JSON.parseObject(u);
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = d;
            }
            d = jSONObject;
        }
    }

    public static synchronized void j(String str) {
        synchronized (p6g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde02ce4", new Object[]{str});
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                Map<String, p6g> map = c;
                if (((HashMap) map).containsKey(str)) {
                    ((HashMap) map).remove(str);
                }
            }
        }
    }

    public static synchronized void k() {
        synchronized (p6g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3624ef95", new Object[0]);
            } else {
                ((HashMap) c).clear();
            }
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685f8107", new Object[]{this, str})).booleanValue();
        }
        b a2 = b.a(d, str);
        boolean b2 = krq.b(a2.f25904a, false);
        Variation variation = a2.b;
        if (variation != null) {
            b2 = variation.getValueAsBoolean(b2);
        }
        this.f25902a.put(str, (Object) String.valueOf(b2));
        return b2;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b660ad51", new Object[]{this});
        }
        return this.f25902a;
    }

    public int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue();
        }
        b a2 = b.a(d, str);
        int i = krq.i(a2.f25904a, 0);
        Variation variation = a2.b;
        if (variation != null) {
            i = variation.getValueAsInt(i);
        }
        this.f25902a.put(str, (Object) String.valueOf(i));
        return i;
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        b a2 = b.a(d, str);
        String str2 = a2.f25904a;
        Variation variation = a2.b;
        if (variation != null) {
            str2 = variation.getValueAsString(str2);
        }
        this.f25902a.put(str, (Object) str2);
        return str2;
    }

    public static synchronized p6g c(String str) {
        synchronized (p6g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p6g) ipChange.ipc$dispatch("1beda5d9", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                odg.c("LCABTestDeciderManager", "LCABTestDeciderManager.get: empty session id, please check!");
                str = "single_session";
            }
            Map<String, p6g> map = c;
            if (!((HashMap) map).containsKey(str)) {
                ((HashMap) map).put(str, new p6g(str));
            }
            return (p6g) ((HashMap) map).get(str);
        }
    }
}
