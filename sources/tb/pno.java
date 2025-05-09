package tb;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d81079b", new Object[]{application, str, str2, str3})).booleanValue();
        }
        if (trq.c(str3)) {
            return false;
        }
        String string = d(application, str).getString(str2, null);
        if (trq.c(string)) {
            return false;
        }
        for (String str4 : string.split(",")) {
            if (str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Application application, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faf6466c", new Object[]{application, str, str2, new Boolean(z)})).booleanValue();
        }
        String string = d(application, str).getString(str2, null);
        if (trq.c(string)) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }

    public static long c(Application application, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c84695e", new Object[]{application, str, str2, new Long(j)})).longValue();
        }
        String string = d(application, str).getString(str2, null);
        try {
            if (trq.c(string)) {
                return j;
            }
            return Long.parseLong(string);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static SharedPreferences d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("d8b7ac83", new Object[]{application, str});
        }
        return application.getSharedPreferences(str, 0);
    }

    public static String e(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd19a6d1", new Object[]{application, str, str2, str3});
        }
        if (trq.c(str2)) {
            return str3;
        }
        return d(application, str).getString(str2, str3);
    }

    public static void f(Application application, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3965a2", new Object[]{application, str, map});
            return;
        }
        SharedPreferences.Editor edit = d(application, str).edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!trq.c(key)) {
                    edit.putString(key, entry.getValue());
                }
            }
        }
        edit.apply();
    }

    public static void g(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0057168", new Object[]{application, str, str2, str3});
        } else if (!trq.c(str2)) {
            d(application, str).edit().putString(str2, str3).apply();
        }
    }

    public static boolean h(Application application, String str, List<Pair<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f70cf40f", new Object[]{application, str, list})).booleanValue();
        }
        if (list.isEmpty()) {
            return false;
        }
        SharedPreferences.Editor edit = d(application, str).edit();
        for (Pair<String, String> pair : list) {
            if (pair == null || trq.c(pair.first)) {
                return false;
            }
            edit.putString(pair.first, pair.second);
        }
        edit.apply();
        return true;
    }
}
