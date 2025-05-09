package mtopsdk.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConfigStoreManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APICACHE_STATS_STORE_PREFIX = "APICACHE_STATS_STORE.";
    public static final String API_CONFIG_STORE_PREFIX = "API_CONFIG_STORE.";
    public static final String API_UNIT_ITEM = "API_UNIT_ITEM";
    public static final String CACHE_CONFIG_STORE_PREFIX = "CACHE_CONFIG_STORE.";
    public static final String MTOP_CONFIG_STORE = "MtopConfigStore";
    public static final String PHONE_INFO_STORE_PREFIX = "PHONE_INFO_STORE.";
    public static final String SSR_CONFIG_STORE = "SSRConfigStore";
    private static final String TAG = "mtopsdk.ConfigStoreManager";
    public static final String UNIT_SETTING_STORE_PREFIX = "UNIT_SETTING_STORE.";
    private static volatile ConfigStoreManager instance;

    static {
        t2o.a(589299793);
    }

    private ConfigStoreManager() {
    }

    public static ConfigStoreManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigStoreManager) ipChange.ipc$dispatch("b6a8795f", new Object[0]);
        }
        if (instance == null) {
            synchronized (ConfigStoreManager.class) {
                try {
                    if (instance == null) {
                        instance = new ConfigStoreManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public Map<String, String> getAllConfigItems(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e2cde4d", new Object[]{this, context, str});
        }
        if (context == null || StringUtils.isBlank(str)) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getAll();
        } catch (Exception unused) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return null;
            }
            TBSdkLog.w(TAG, "[getAllConfigItems] getConfigItem error,store=" + str);
            return null;
        }
    }

    public Map<String, String> getAllConfigItemsByPrefix(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8cd6f28e", new Object[]{this, context, str, str2});
        }
        if (context != null && !StringUtils.isBlank(str)) {
            try {
                Map all = context.getSharedPreferences(str, 0).getAll();
                if (StringUtils.isBlank(str2)) {
                    return all;
                }
                if (all != null && !all.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : all.entrySet()) {
                        String str3 = (String) entry.getKey();
                        if (StringUtils.isNotBlank(str3) && str3.startsWith(str2)) {
                            hashMap.put(str3, entry.getValue());
                        }
                    }
                    return hashMap;
                }
            } catch (Exception unused) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                    TBSdkLog.w(TAG, "[getAllConfigItemsByPrefix] getAllConfigItemsByPrefix error,store=" + str + ",prefix=" + str2);
                }
            }
        }
        return null;
    }

    public String getConfigItem(Context context, String str, String str2, String str3) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75fb862c", new Object[]{this, context, str, str2, str3});
        }
        if (context == null || StringUtils.isBlank(str) || StringUtils.isBlank(str3)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (StringUtils.isNotBlank(str2)) {
                string = sharedPreferences.getString(str2 + str3, null);
            } else {
                string = sharedPreferences.getString(str3, null);
            }
            return string;
        } catch (Exception unused) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                return null;
            }
            TBSdkLog.w(TAG, "[getConfigItem] getConfigItem error,store=" + str + ",keyprefix=" + str2 + ",key=" + str3);
            return null;
        }
    }

    public boolean saveConfigItem(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f389b8bb", new Object[]{this, context, str, str2, str3, str4})).booleanValue();
        }
        if (context == null || StringUtils.isBlank(str) || StringUtils.isBlank(str3)) {
            return false;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            if (StringUtils.isNotBlank(str2)) {
                edit.putString(str2 + str3, str4);
            } else {
                edit.putString(str3, str4);
            }
            edit.apply();
            return true;
        } catch (Exception unused) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                TBSdkLog.w(TAG, "[saveConfigItem] saveConfigItem error,store=" + str + ",keyprefix=" + str2 + ",key=" + str3);
            }
            return false;
        }
    }
}
