package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hc6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_GLOBAL_SP = "dx_global_sp";

    static {
        t2o.a(444597062);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        Context x = DinamicXEngine.x();
        if (x == null) {
            return str3;
        }
        SharedPreferences sharedPreferences = x.getSharedPreferences(str, 0);
        if (sharedPreferences == null) {
            return str3;
        }
        return sharedPreferences.getString(str2, str3);
    }

    public static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("cca12b02", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(DX_GLOBAL_SP, 0);
    }

    public static String c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        SharedPreferences b = b(context);
        if (b == null) {
            return str2;
        }
        return b.getString(str, str2);
    }

    public static void d(String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de0716", new Object[]{str, str2, str3});
            return;
        }
        Context x = DinamicXEngine.x();
        if (x != null && (sharedPreferences = x.getSharedPreferences(str, 0)) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }

    public static void e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcb1db5", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences b = b(context);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
