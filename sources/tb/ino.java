package tb;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ino {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f21460a;

    static {
        t2o.a(573571214);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{str, str2});
        }
        try {
            Application application = Globals.getApplication();
            if (f21460a == null && application != null) {
                f21460a = application.getSharedPreferences("mmAdBiz", 0);
            }
            SharedPreferences sharedPreferences = f21460a;
            if (sharedPreferences != null) {
                return sharedPreferences.getString(str, str2);
            }
            jgh.a("SPUtil", "get: sharedPreferences is null");
            return str2;
        } catch (Throwable th) {
            jgh.b("SPUtil", "get: ", th);
            return str2;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6c0efa", new Object[]{str, str2});
            return;
        }
        try {
            Application application = Globals.getApplication();
            if (f21460a == null && application != null) {
                f21460a = application.getSharedPreferences("mmAdBiz", 0);
            }
            SharedPreferences sharedPreferences = f21460a;
            if (sharedPreferences == null) {
                jgh.a("SPUtil", "write: sharedPreferences is null");
            } else {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            jgh.b("SPUtil", "write: ", th);
        }
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa11d72a", new Object[]{map});
            return;
        }
        try {
            Application application = Globals.getApplication();
            if (f21460a == null && application != null) {
                f21460a = application.getSharedPreferences("mmAdBiz", 0);
            }
            SharedPreferences sharedPreferences = f21460a;
            if (sharedPreferences == null) {
                jgh.a("SPUtil", "writes: sharedPreferences is null");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                edit.putString(key, value);
                jgh.a("SPUtil", "writes: key=" + key + ", value=" + value);
            }
            edit.apply();
        } catch (Throwable th) {
            jgh.b("SPUtil", "writes: ", th);
        }
    }
}
