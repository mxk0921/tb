package tb;

import android.content.SharedPreferences;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l51 INSTANCE = new l51();

    /* renamed from: a  reason: collision with root package name */
    public static final SharedPreferences f23113a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23114a;
        public final String b;

        static {
            t2o.a(839909794);
        }

        public a(String str, String str2) {
            this.f23114a = str;
            this.b = str2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d318cda7", new Object[]{this});
            }
            return this.f23114a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ec9a1b5", new Object[]{this});
            }
            return this.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (ckf.b(this.f23114a, aVar.f23114a) && ckf.b(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f23114a;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i3 = i * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AppInfoForceUpdateConfig(appIdVersion=" + ((Object) this.f23114a) + ", categoryVersion=" + ((Object) this.b) + ')';
        }
    }

    @JvmStatic
    public static final void e(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acbf7ac", new Object[]{appModel});
            return;
        }
        ckf.g(appModel, "appModel");
        if (q9s.z()) {
            String appId = appModel.getAppId();
            JSONObject extendInfos = appModel.getExtendInfos();
            Map<String, String> map = null;
            String string = extendInfos == null ? null : extendInfos.getString("categoryCode");
            if (appId != null && appId.length() != 0 && string != null && string.length() != 0) {
                IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
                if (iConfigAdapter != null) {
                    map = iConfigAdapter.getConfigs("miniapp_cache_update_config_new");
                }
                if (map != null && !map.isEmpty()) {
                    l51 l51Var = INSTANCE;
                    ckf.f(appId, "appId");
                    a c = l51Var.c(appId, string, map);
                    TMSLogger.f("AppInfoForceUpdateManager", ckf.p("updateLocalForceUpdateConfig: ", c));
                    l51Var.d(appId, c);
                }
            }
        }
    }

    public final a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("34c4e527", new Object[]{this, str});
        }
        String string = f23113a.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(string);
            return new a(parseObject.getString("appIdVersion"), parseObject.getString("categoryVersion"));
        } catch (Exception e) {
            TMSLogger.c("AppInfoForceUpdateManager", "parse local config error", e);
            return null;
        }
    }

    public final a c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("72850c83", new Object[]{this, str, str2, map});
        }
        String str3 = map.get(ckf.p("appId_", str));
        String str4 = map.get(ckf.p("categoryCode_", str2));
        if (str3 == null && str4 == null) {
            return null;
        }
        return new a(str3, str4);
    }

    public final void d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a43a257", new Object[]{this, str, aVar});
        } else if (aVar == null) {
            SharedPreferences sharedPreferences = f23113a;
            if (sharedPreferences.contains(str)) {
                sharedPreferences.edit().remove(str).commit();
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "appIdVersion", aVar.a());
            jSONObject.put((JSONObject) "categoryVersion", aVar.b());
            f23113a.edit().putString(str, jSONObject.toJSONString()).commit();
        }
    }

    @JvmStatic
    public static final boolean a(AppInfoDao appInfoDao) {
        JSONObject extendInfos;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527abdf4", new Object[]{appInfoDao})).booleanValue();
        }
        ckf.g(appInfoDao, RVConstants.EXTRA_APPINFO);
        if (!q9s.z()) {
            return false;
        }
        String str = appInfoDao.appId;
        AppModel appModel = appInfoDao.appInfo;
        String str2 = null;
        String string = (appModel == null || (extendInfos = appModel.getExtendInfos()) == null) ? null : extendInfos.getString("categoryCode");
        if (string == null) {
            return false;
        }
        IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
        Map<String, String> configs = iConfigAdapter == null ? null : iConfigAdapter.getConfigs("miniapp_cache_update_config_new");
        if (configs == null || configs.isEmpty()) {
            return false;
        }
        l51 l51Var = INSTANCE;
        ckf.f(str, "appId");
        a c = l51Var.c(str, string, configs);
        TMSLogger.f("AppInfoForceUpdateManager", ckf.p("orangeConfig: ", c));
        if (c == null) {
            l51Var.d(str, null);
            return false;
        }
        a b = l51Var.b(str);
        if (ckf.b(b == null ? null : b.a(), c.a())) {
            if (b != null) {
                str2 = b.b();
            }
            if (ckf.b(str2, c.b())) {
                return false;
            }
        }
        TMSLogger.f("AppInfoForceUpdateManager", "needForceUpdateAppInfo: appId:" + ((Object) str) + ", categoryId:" + string);
        return true;
    }

    static {
        t2o.a(839909793);
        SharedPreferences sharedPreferences = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext().getSharedPreferences("tms_local_force_update_app_info_config", 0);
        ckf.f(sharedPreferences, "getNotNull(\n            …xt.MODE_PRIVATE\n        )");
        f23113a = sharedPreferences;
    }
}
