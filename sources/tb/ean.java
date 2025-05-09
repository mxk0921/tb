package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.config.RPConfig;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ean f;
    public static final String[] g = {p78.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_CONTACTS"};
    public SharedPreferences b;

    /* renamed from: a  reason: collision with root package name */
    public RPConfig f18417a = new RPConfig();
    public final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
    public Map<String, String> d = new HashMap();
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            ean.this.d = OrangeConfig.getInstance().getConfigs(str);
            String config = OrangeConfig.getInstance().getConfig(ean.a(), ean.b(), null);
            if (!TextUtils.isEmpty(config)) {
                ean.c(ean.this, config);
            } else {
                ean.d(ean.this);
            }
        }
    }

    public ean() {
        e();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "privacy_permission_config";
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "privacy_id_map";
    }

    public static /* synthetic */ void c(ean eanVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d91157", new Object[]{eanVar, str});
        } else {
            eanVar.p(str);
        }
    }

    public static /* synthetic */ void d(ean eanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44f6c2c", new Object[]{eanVar});
        } else {
            eanVar.n();
        }
    }

    public static ean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ean) ipChange.ipc$dispatch("6080ee68", new Object[0]);
        }
        if (f == null) {
            synchronized (ean.class) {
                try {
                    if (f == null) {
                        f = new ean();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static Map<String, String> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b4ce96f2", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && (value instanceof String)) {
                    hashMap.put(key, (String) value);
                }
            }
        } catch (Exception e) {
            ndh.a("RPConfigManager", "parsePrivacyIdMap error: " + e);
        }
        return hashMap;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43250dec", new Object[]{this});
            return;
        }
        try {
            this.e = new File("/data/local/tmp/.compliance_scene_auth").exists();
        } catch (Throwable th) {
            ndh.a("RPConfigManager", "checkComplianceTraceEnable error: " + th);
        }
    }

    public List<String> f() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f308df96", new Object[]{this});
        }
        List<String> asList = Arrays.asList(g);
        Map<String, String> map = this.d;
        if (map == null) {
            return asList;
        }
        try {
            String str = map.get("scene_auth_config");
            return (str == null || (jSONArray = JSON.parseObject(str).getJSONArray("scenePermissionList")) == null) ? asList : JSON.parseArray(jSONArray.toJSONString(), String.class);
        } catch (Exception e) {
            ndh.a("RPConfigManager", "getWhiteBizList error: " + e);
            return asList;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4fa748", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public RPConfig i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPConfig) ipChange.ipc$dispatch("96bcba56", new Object[]{this});
        }
        return this.f18417a;
    }

    public String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a74e597", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        String str2 = this.c.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a07501", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("privacy_id_map").apply();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            ndh.a("RPConfigManager", "updateRules: config is empty!");
        } else {
            try {
                RPConfig rPConfig = (RPConfig) JSON.toJavaObject(JSON.parseObject(str), RPConfig.class);
                if (rPConfig != null) {
                    this.f18417a = rPConfig;
                }
            } catch (Throwable th) {
                ndh.a("RPConfigManager", "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            ndh.b("RPConfigManager", "updateRules: update rules success, rules : [" + str + "] ");
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90e0250", new Object[]{this, str});
            return;
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("privacy_id_map", str).apply();
        }
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("privacy_runtime_permission_config", 0);
        this.b = sharedPreferences;
        this.c.putAll(m(sharedPreferences.getString("privacy_id_map", null)));
        OrangeConfig.getInstance().registerListener(new String[]{"privacy_permission_config"}, new a(), false);
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1858b2b", new Object[]{this, str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && (str.equals("common") || str.startsWith("triver-"));
    }
}
