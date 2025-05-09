package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f20768a;

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{str, str2});
        }
        try {
            b(Global.getApplication());
            SharedPreferences sharedPreferences = f20768a;
            if (sharedPreferences != null) {
                return sharedPreferences.getString(str, str2);
            }
            v1.b("SPUtil", "get: sharedPreferences is null");
            return "";
        } catch (Throwable th) {
            v1.b("SPUtil", "get fail, and error: " + th.getMessage());
            return "";
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{str});
            return;
        }
        try {
            b(Global.getApplication());
            SharedPreferences sharedPreferences = f20768a;
            if (sharedPreferences == null) {
                v1.b("SPUtil", "clear: sharedPreferences is null");
            } else {
                sharedPreferences.edit().remove(str).apply();
            }
        } catch (Throwable th) {
            v1.b("SPUtil", "clear fail: " + th.getMessage());
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6c0efa", new Object[]{str, str2});
            return;
        }
        try {
            b(Global.getApplication());
            SharedPreferences sharedPreferences = f20768a;
            if (sharedPreferences == null) {
                v1.b("SPUtil", "write: sharedPreferences is null");
            } else {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            v1.b("SPUtil", "write fail: " + th.getMessage());
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca27da4", new Object[]{context});
        } else if (f20768a == null && context != null) {
            f20768a = context.getSharedPreferences("mmAdBiz", 0);
        }
    }
}
