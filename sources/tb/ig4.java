package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ig4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile ig4 F = null;
    public static final String KEY_IS_EASY_GO_DEFAULT_RIGHT_PAGE = "is_easy_go_default_right_page";

    /* renamed from: a  reason: collision with root package name */
    public Application f21297a;
    public boolean b = true;
    public boolean c = false;
    public final List<String> d = new ArrayList();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    @Deprecated
    public boolean j = false;
    @Deprecated
    public final List<String> k = Arrays.asList("23043RP34C");
    public final List<String> l = new ArrayList();
    public final List<String> m = new ArrayList();
    public final List<String> n = new ArrayList();
    public final List<String> o = new ArrayList();
    public boolean p = false;
    public boolean q = true;
    public boolean r = true;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public boolean w = true;
    public boolean x = true;
    public boolean y = true;
    public boolean z = true;
    public boolean A = true;
    public boolean B = false;
    public boolean C = true;
    public volatile boolean D = false;
    public volatile boolean E = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (Boolean.parseBoolean(map.get("fromCache"))) {
                TLog.loge("TBAutoSize.ConfigManager", "onConfigUpdate: update from cache");
            } else if (TextUtils.equals(str, "easy_go_config")) {
                if (ig4.a(ig4.this) != null) {
                    String config = OrangeConfig.getInstance().getConfig(str, "dynamicEasyGoEnable", "false");
                    ig4.a(ig4.this).getSharedPreferences("easy_go_config", 0).edit().putString("dynamicEasyGoEnable", config).apply();
                    TLog.loge("TBAutoSize.ConfigManager", "onConfigUpdate: update for easy go, easy go enable is " + config);
                }
            } else if (TextUtils.equals(str, "auto_size_device_config") && (configs = OrangeConfig.getInstance().getConfigs(str)) != null) {
                ig4.b(ig4.this, configs);
                ig4.c(ig4.this, configs);
                TLog.loge("TBAutoSize.ConfigManager", "orange callback config: " + new JSONObject(configs));
            }
        }
    }

    public static void P(String str, List<String> list) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82979186", new Object[]{str, list});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                if (!TextUtils.isEmpty(str2)) {
                    list.add(str2);
                }
            }
        }
    }

    public static /* synthetic */ Application a(ig4 ig4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("e73cb7cb", new Object[]{ig4Var});
        }
        return ig4Var.f21297a;
    }

    public static /* synthetic */ void b(ig4 ig4Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b470e8", new Object[]{ig4Var, map});
        } else {
            ig4Var.R(map);
        }
    }

    public static /* synthetic */ void c(ig4 ig4Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbff25c7", new Object[]{ig4Var, map});
        } else {
            ig4Var.Q(map);
        }
    }

    public static Application d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("6ff8dfe5", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static String e(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01a3ad6", new Object[]{map, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object obj = map.get(str);
        if (obj == null) {
            return str2;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return str2;
        }
        return obj2;
    }

    public static ig4 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ig4) ipChange.ipc$dispatch("be9de309", new Object[0]);
        }
        if (F == null) {
            synchronized (ig4.class) {
                try {
                    if (F == null) {
                        F = new ig4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return F;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bccd2971", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableDxRefreshOnResume=" + this.y);
        return this.y;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b63930e", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff35876e", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a8aed3", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa639793", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableModifySize=" + this.c);
        return this.c;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da4a1423", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff4ca8b9", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17e2ea11", new Object[]{this, context})).booleanValue();
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableTabletByLayout=" + this.p);
        return this.p;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe3e4711", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean J(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb38f5d", new Object[]{this, context})).booleanValue();
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableXiaoMiFlipAsFold=" + this.q);
        return this.q;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7a56bf", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    @Deprecated
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a78db13c", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isForceRecreateEnabled=" + this.j);
        return this.j;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b5a356", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43a2f62c", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdcb9bb", new Object[]{this});
            return;
        }
        TLog.loge("TBAutoSize.ConfigManager", "enable=" + this.b + " enableModifySize=" + this.c + " modifySizeBrandWhiteList=" + this.d + " forceRecreateEnabled=" + this.j + " forceRecreateModelWhiteList=" + this.k + " enableConfigChangeListenDowngrade=" + this.e + " enableForceFullScreenOpen=" + this.f + " enableForceFullScreenOpenOnFold=" + this.g + " enableForceFullScreenOpenOnTablet=" + this.h + " enableAutoOrientationDowngrade=" + this.i + " foldDeviceList=" + this.l + " tabletDeviceList=" + this.m + " flipDeviceList=" + this.n + " phoneDeviceList=" + this.o + " enableTabletByLayout=" + this.p + " enableXiaoMiFlipAsFold=" + this.q + " enableCheckOnResume=" + this.w + " enableConfigChangeWithActivity=" + this.x + " enableDxRefreshOnResume=" + this.y + " enablePortJudgeV2=" + this.z + " enableFixNotchInWidth=" + this.A + " enableFoldStatusBridge=" + this.B + " enableConfigurationChangeNotifyBarrier=" + this.C + " enableNewConfigurationChangeCallback=" + this.r + " ");
    }

    public final void Q(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ca96e6", new Object[]{this, map});
        } else if (map == null) {
            this.f21297a.getSharedPreferences("auto_size_device_config", 0).edit().clear().apply();
        } else {
            SharedPreferences.Editor edit = this.f21297a.getSharedPreferences("auto_size_device_config", 0).edit();
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                edit.putString(entry.getKey(), e(map, entry.getKey(), null));
            }
            edit.apply();
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3c265e", new Object[]{this});
        }
        return "com.taobao.android.order.bundle.TBFoldedOrderListActivity";
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b1796d7", new Object[]{this})).longValue();
        }
        Application application = this.f21297a;
        if (application != null) {
            return application.getSharedPreferences("easy_go_config", 0).getLong("easyGoDefaultValidDatetimeMillis", -1L);
        }
        TLog.loge("TBAutoSize.ConfigManager", "getEasyGoDefaultValidDatetimeMillis, mApplication is null");
        return 0L;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1fbff9e", new Object[]{this});
        }
        return KEY_IS_EASY_GO_DEFAULT_RIGHT_PAGE;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c51ab3b", new Object[]{this});
        }
        if (this.f21297a == null) {
            TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl, mApplication is null");
            return null;
        }
        long g = g();
        if (g < System.currentTimeMillis()) {
            TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl, is invalid. validDatetime " + g);
            return null;
        }
        String string = this.f21297a.getSharedPreferences("easy_go_config", 0).getString("dynamicEasyGoTargetUrl", null);
        TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl=" + string);
        return string;
    }

    public List<String> j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69f5f5dd", new Object[]{this, context});
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "flipDeviceList=" + this.n);
        return this.n;
    }

    public List<String> k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ee610a71", new Object[]{this, context});
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "foldDeviceList=" + this.l);
        return this.l;
    }

    @Deprecated
    public List<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64b0adfe", new Object[]{this});
        }
        TLog.loge("TBAutoSize.ConfigManager", "forceRecreateModelWhiteList=" + this.k);
        return this.k;
    }

    public List<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("56e56bd9", new Object[]{this});
        }
        TLog.loge("TBAutoSize.ConfigManager", "modifySizeBrandWhiteList=" + this.d);
        return this.d;
    }

    public List<String> o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("27adef2", new Object[]{this, context});
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "phoneDeviceList=" + this.o);
        return this.o;
    }

    public List<String> p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3f73996", new Object[]{this, context});
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "tabletDeviceList=" + this.m);
        return this.m;
    }

    public synchronized void q(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        if (!this.D && application != null) {
            this.D = true;
            this.f21297a = application;
            SharedPreferences sharedPreferences = application.getSharedPreferences("auto_size_device_config", 4);
            this.f21297a.getSharedPreferences("easy_go_config", 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null) {
                R(all);
                TLog.loge("TBAutoSize.ConfigManager", "SharedPreferences config: " + new JSONObject(all));
            }
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50ae70b9", new Object[]{this})).booleanValue();
        }
        return "xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45210963", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            TLog.loge("TBAutoSize.ConfigManager", "isDynamicEasyGoEnable false, context is null");
            return false;
        } else if (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) {
            String string = context.getSharedPreferences("easy_go_config", 0).getString("dynamicEasyGoEnable", "false");
            TLog.loge("TBAutoSize.ConfigManager", "isEnableDynamicEasyGo=" + string);
            if (!Boolean.parseBoolean(string) || s()) {
                return false;
            }
            return true;
        } else {
            TLog.loge("TBAutoSize.ConfigManager", "isDynamicEasyGoEnable false, not fold or not tablet");
            return false;
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnable=" + this.b);
        return this.b;
    }

    public boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43a66384", new Object[]{this, context})).booleanValue();
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableAutoOrientationDowngrade=" + this.i);
        return this.i;
    }

    public boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f768be", new Object[]{this, context})).booleanValue();
        }
        if (!this.D) {
            q(d(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableCheckOnResume=" + this.w);
        return this.w;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3346de", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce26a700", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e69531e", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5071b9", new Object[]{this});
        } else if (!this.E) {
            this.E = true;
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"auto_size_device_config", "easy_go_config"}, new a(), true);
            } catch (Throwable th) {
                TLog.loge("TBAutoSize.ConfigManager", "registerOrangeListener: occur exception, maybe orange is not initialized!", th);
            }
        }
    }

    public final void R(Map<String, ?> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8424d3", new Object[]{this, map});
            return;
        }
        this.b = "true".equals(e(map, "enable", "true"));
        this.c = "true".equals(e(map, "enableModifySize", null));
        P(e(map, "modifySizeBrandWhiteList", null), this.d);
        this.j = "true".equals(e(map, "forceRecreateEnabled", null));
        P(e(map, "forceRecreateModelWhiteList", null), this.k);
        this.e = "true".equals(e(map, "configChangeListenDowngradeEnabled", null));
        this.f = "true".equals(e(map, "forceFullScreenOpenEnabled", null));
        this.g = "true".equals(e(map, "forceFullScreenOpenOnFoldEnabled", null));
        this.h = "true".equals(e(map, "forceFullScreenOpenOnTabletEnabled", null));
        this.i = "true".equals(e(map, "autoOrientationDowngradeEnable", null));
        this.p = "true".equals(e(map, "tabletByLaoutEnable", null));
        this.q = "true".equals(e(map, "xiaomiFlipAsFoldEnable", null));
        Application application = this.f21297a;
        if (application != null) {
            if (!TBDeviceUtils.P(application) || !"huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
                z = false;
            }
            this.r = z;
        } else {
            this.r = false;
            TLog.loge("TBAutoSize.ConfigManager", "updateConfig: enableNewConfigurationChangeCallback is false, mApplication is null");
        }
        if (this.r) {
            this.r = "true".equals(e(map, "listenConfigurationChangeOnActivity", "true"));
        }
        this.t = "true".equals(e(map, "enableWindowTypeNewStandard", "true"));
        this.u = "true".equals(e(map, "enableConfigCache", "true"));
        this.v = "true".equals(e(map, "enableDelegateTBAutoSizeGetScreenSize", "true"));
        this.s = "true".equals(e(map, "enableReturnActivityWidthAsScreenWidth", "true"));
        this.w = "true".equals(e(map, "checkOnResumeEnable", "true"));
        this.x = "true".equals(e(map, "configChangeWithActivityEnable", "true"));
        this.y = "true".equals(e(map, "dxRefreshOnResumeEnable", "true"));
        this.z = "true".equals(e(map, "portraitJudgeV2Enable", "true"));
        this.A = "true".equals(e(map, "fixNotchInWidthEnable", "true"));
        this.B = "true".equals(e(map, "foldStatusBridgeEnable", null));
        this.C = "true".equals(e(map, "configurationChangeNotifyBarrierEnable", null));
        P(e(map, "foldDeviceList", null), this.l);
        P(e(map, "tabletDeviceList", null), this.m);
        P(e(map, "flipDeviceList", null), this.n);
        P(e(map, "phoneDeviceList", null), this.o);
        O();
    }
}
