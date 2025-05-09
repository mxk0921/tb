package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$CacheTime;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$ExpireConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f51 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<String> DEFAULT_CACHE_TIME_LIST = new ArrayList(Arrays.asList("tms_enginetype_mix"));
    public static final long DEF_MAX_ASYNC_SECONDS = 1800;
    public static final long DEF_MAX_SYNC_SECONDS = 86400;
    public static final String TAG = "AppInfoCacheConfigManager";

    /* renamed from: a  reason: collision with root package name */
    public static volatile f51 f19010a;
    public static volatile Map<String, AppInfoCacheConfig$ExpireConfig> b;
    public static volatile AppInfoCacheConfig$CacheTime c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<Map<String, AppInfoCacheConfig$ExpireConfig>> {
        public a(f51 f51Var) {
        }
    }

    public f51() {
        b = e();
        c = new AppInfoCacheConfig$CacheTime();
    }

    public static synchronized f51 f() {
        synchronized (f51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f51) ipChange.ipc$dispatch("e49edb36", new Object[0]);
            }
            if (f19010a == null) {
                f19010a = new f51();
            }
            return f19010a;
        }
    }

    public AppInfoCacheConfig$CacheTime a(String str, String str2, String str3) {
        AppInfoCacheConfig$CacheTime appInfoCacheConfig$CacheTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig$CacheTime) ipChange.ipc$dispatch("68e3afc", new Object[]{this, str, str2, str3});
        }
        if (!TextUtils.isEmpty(str)) {
            appInfoCacheConfig$CacheTime = b("tms_app_" + str);
        } else {
            appInfoCacheConfig$CacheTime = null;
        }
        if (appInfoCacheConfig$CacheTime == null && !TextUtils.isEmpty(str3)) {
            appInfoCacheConfig$CacheTime = b("tms_enginetype_" + str3);
        }
        if (appInfoCacheConfig$CacheTime == null && !TextUtils.isEmpty(str2)) {
            appInfoCacheConfig$CacheTime = b("tms_biztype_" + str2);
        }
        return appInfoCacheConfig$CacheTime == null ? c : appInfoCacheConfig$CacheTime;
    }

    public final AppInfoCacheConfig$CacheTime b(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig$CacheTime) ipChange.ipc$dispatch("730a8fba", new Object[]{this, str});
        }
        try {
            String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName(g51.GROUP_TMS_APP_INFO_CONFIG, str, c(str));
            if (!TextUtils.isEmpty(configByGroupAndName) && (parseObject = JSON.parseObject(configByGroupAndName)) != null && !parseObject.isEmpty()) {
                long longValue = parseObject.getLongValue("maxSyncTime");
                long longValue2 = parseObject.getLongValue("maxAsyncTime");
                if (longValue > 0 && longValue2 > 0) {
                    AppInfoCacheConfig$CacheTime appInfoCacheConfig$CacheTime = new AppInfoCacheConfig$CacheTime();
                    appInfoCacheConfig$CacheTime.maxSyncTime = longValue;
                    appInfoCacheConfig$CacheTime.maxAsyncTime = longValue2;
                    return appInfoCacheConfig$CacheTime;
                }
            }
            return null;
        } catch (Exception e) {
            TMSLogger.c(TAG, "getCacheTimeByBizType error", e);
            return null;
        }
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf557d06", new Object[]{this, str});
        }
        if (!q9s.y() || !DEFAULT_CACHE_TIME_LIST.contains(str)) {
            return "";
        }
        return "{\"maxAsyncTime\": 300, \"maxSyncTime\": 2592000}";
    }

    public AppInfoCacheConfig$ExpireConfig d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoCacheConfig$ExpireConfig) ipChange.ipc$dispatch("5fd189b4", new Object[]{this, str});
        }
        if (b == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return b.get(str);
    }

    public final boolean g(String str) {
        AppInfoCacheConfig$ExpireConfig appInfoCacheConfig$ExpireConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea4d89e2", new Object[]{this, str})).booleanValue();
        }
        if (b == null || (appInfoCacheConfig$ExpireConfig = b.get(str)) == null) {
            return false;
        }
        appInfoCacheConfig$ExpireConfig.expired = false;
        return true;
    }

    public void h(List<AppInfoCacheConfig$ExpireConfig> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dc8abb", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            if (b == null || b.isEmpty()) {
                for (AppInfoCacheConfig$ExpireConfig appInfoCacheConfig$ExpireConfig : list) {
                    hashMap.put(appInfoCacheConfig$ExpireConfig.appId, appInfoCacheConfig$ExpireConfig);
                }
            } else {
                for (AppInfoCacheConfig$ExpireConfig appInfoCacheConfig$ExpireConfig2 : list) {
                    AppInfoCacheConfig$ExpireConfig appInfoCacheConfig$ExpireConfig3 = b.get(appInfoCacheConfig$ExpireConfig2.appId);
                    if (appInfoCacheConfig$ExpireConfig3 != null && appInfoCacheConfig$ExpireConfig3.timeStamp == appInfoCacheConfig$ExpireConfig2.timeStamp && !appInfoCacheConfig$ExpireConfig3.expired) {
                        appInfoCacheConfig$ExpireConfig2.expired = false;
                    }
                    hashMap.put(appInfoCacheConfig$ExpireConfig2.appId, appInfoCacheConfig$ExpireConfig2);
                }
            }
            b = hashMap;
            l();
        }
    }

    public void i(AppInfoCacheConfig$CacheTime appInfoCacheConfig$CacheTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65205115", new Object[]{this, appInfoCacheConfig$CacheTime});
        } else {
            c = appInfoCacheConfig$CacheTime;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d767ec86", new Object[]{this, str});
        } else if (g(str)) {
            l();
        }
    }

    public void k(List<String> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29127d6", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            if (g(str)) {
                z = true;
            }
        }
        if (z) {
            l();
        }
    }

    public final synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b1f47f", new Object[]{this});
            return;
        }
        try {
            wcs.i(((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext(), "tms_appInfo_expire_config", JSON.toJSONString(b));
        } catch (Exception e) {
            TMSLogger.c(TAG, "saveConfig error", e);
        }
    }

    public final synchronized Map<String, AppInfoCacheConfig$ExpireConfig> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3c09081", new Object[]{this});
        }
        try {
            String c2 = wcs.c(((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext(), "tms_appInfo_expire_config", null);
            if (!TextUtils.isEmpty(c2)) {
                return (Map) JSON.parseObject(c2, new a(this), new Feature[0]);
            }
        } catch (Exception e) {
            TMSLogger.c(TAG, "getConfig error", e);
        }
        return null;
    }

    static {
        t2o.a(839909778);
    }
}
