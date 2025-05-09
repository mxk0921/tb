package tb;

import android.content.Context;
import android.text.TextUtils;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z2v {
    public static final String AUTH_LIMIT_SLS_KEY = "AUTH_LIMIT_SLS_KEY";

    public static boolean a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).contains(str2);
    }

    public static <T> T b(Context context, String str, String str2, T t) {
        try {
            if (a(context, str, str2)) {
                String a2 = rd8.a(context.getSharedPreferences(str, 0).getString(str2, ""));
                if (t instanceof Integer) {
                    return (T) Integer.valueOf(a2);
                }
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(a2);
                }
                if (t instanceof Long) {
                    return (T) Long.valueOf(a2);
                }
                if (t instanceof String) {
                    return (T) String.valueOf(a2);
                }
                throw new Exception("unsupported type");
            }
        } catch (Exception unused) {
        }
        return t;
    }

    public static <T> void c(Context context, String str, String str2, T t) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, rd8.b(t.toString())).commit();
        } catch (Exception unused) {
        }
    }

    public static synchronized ACMLimitConfig d(Context context) {
        ACMLimitConfig aCMLimitConfig;
        synchronized (z2v.class) {
            String str = (String) b(context, "ALITX_LOGGER_DATA", "AUTH_LIMIT_CONFIG_KEY", "");
            aCMLimitConfig = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    aCMLimitConfig = ACMLimitConfig.fromJson(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return aCMLimitConfig;
    }

    public static synchronized int e(Context context, String str, String str2) {
        Map<String, Integer> map;
        synchronized (z2v.class) {
            try {
                String str3 = (String) b(context, "ALITX_LOGGER_DATA", str, "");
                if (!TextUtils.isEmpty(str3)) {
                    map = wrf.g(str3);
                } else {
                    map = null;
                }
                if (map == null || map.isEmpty() || !map.containsKey(str2)) {
                    return 0;
                }
                return map.get(str2).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized int f(Context context, String str) {
        int e;
        synchronized (z2v.class) {
            e = e(context, "AUTH_LIMIT_SLS_KEY", str);
        }
        return e;
    }

    public static synchronized void g(Context context, String str, String str2) {
        Map<String, Integer> map;
        HashMap hashMap;
        synchronized (z2v.class) {
            try {
                String str3 = (String) b(context, "ALITX_LOGGER_DATA", str, "");
                if (!TextUtils.isEmpty(str3)) {
                    map = wrf.g(str3);
                } else {
                    map = null;
                }
                if (map == null || map.isEmpty() || !map.containsKey(str2)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(str2, 1);
                    hashMap = hashMap2;
                } else {
                    map.put(str2, Integer.valueOf(((Integer) map.get(str2)).intValue() + 1));
                    hashMap = map;
                }
                c(context, "ALITX_LOGGER_DATA", str, new JSONObject(hashMap).toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void h(Context context, String str) {
        synchronized (z2v.class) {
            g(context, "AUTH_LIMIT_SLS_KEY", str);
        }
    }

    public static synchronized void i(Context context, ACMLimitConfig aCMLimitConfig) {
        synchronized (z2v.class) {
            c(context, "ALITX_LOGGER_DATA", "AUTH_LIMIT_CONFIG_KEY", aCMLimitConfig.toJsonString());
        }
    }
}
