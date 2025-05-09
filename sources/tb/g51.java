package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$CacheTime;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$ExpireConfig;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g51 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_TMS_APP_INFO_CONFIG = "themis_appinfo_cache_config";
    public static final String GROUP_UNI_APP_WEEX_THEMIS_CONFIG = "weexv2_themis_config";
    public static final String KEY_CACHE_TIME_BIZ_LIST = "bizTypeCacheTimeList";
    public static final String KEY_CACHE_TIME_GLOBAL = "globalCacheTime";
    public static final String KEY_CACHE_TIME_ID_LIST = "idCacheTimeList";
    public static final String KEY_EXPIRE_LIST = "expireList";
    public static final String KEY_UNI_APP_WEEX_LAYOUT_NG_WHITE_LIST = "weex_tms_layoutng_white_list";
    public static final String KEY_UNI_APP_WEEX_MODULE_WHITE_LIST = "weex_tms_module_white_list";
    public static final String TAG = "AppInfoCacheConfigSyncCenter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
            } else {
                g51.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<List<AppInfoCacheConfig$ExpireConfig>> {
    }

    static {
        t2o.a(839909780);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            c();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        c();
        try {
            ((IConfigAdapter) p8s.g(IConfigAdapter.class)).registerListener(GROUP_TMS_APP_INFO_CONFIG, new a());
        } catch (Throwable th) {
            TMSLogger.h(TAG, "init error", th);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[0]);
            return;
        }
        String X2 = q9s.X2();
        if (!TextUtils.isEmpty(X2)) {
            d(X2);
        }
        String W2 = q9s.W2();
        if (!TextUtils.isEmpty(W2)) {
            e(W2);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fef6354", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                AppInfoCacheConfig$CacheTime appInfoCacheConfig$CacheTime = (AppInfoCacheConfig$CacheTime) JSON.parseObject(str, AppInfoCacheConfig$CacheTime.class);
                if (appInfoCacheConfig$CacheTime != null) {
                    f51.f().i(appInfoCacheConfig$CacheTime);
                }
            } catch (Throwable th) {
                TMSLogger.c(TAG, "updateConfig parse error", th);
            }
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bf7fbb", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                List<AppInfoCacheConfig$ExpireConfig> list = (List) JSON.parseObject(str, new b(), new Feature[0]);
                if (list != null) {
                    f51.f().h(list);
                }
            } catch (Throwable th) {
                TMSLogger.c(TAG, "updateConfig parse error", th);
            }
        }
    }
}
