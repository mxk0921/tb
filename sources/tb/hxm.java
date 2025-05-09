package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.security.ccrc.service.build.vb;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void F(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738426e4", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("downgrade_without_uid", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48e162cd", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("downgrade_without_uid", "0");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static void A(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca48bab2", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_timeInterval", str).apply();
        }
    }

    public static void B(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1378fd19", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("user_id", str).apply();
        }
    }

    public static void C(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ba929", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("mtop_api", str).apply();
        }
    }

    public static void D(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c13568", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_linked_h5_url", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void E(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fbc5ec", new Object[]{context, new Boolean(z)});
        } else if (context != null) {
            try {
                context.getSharedPreferences("ali_privacy_recommend", 0).edit().putBoolean("recommend_status_not_logged_in", z).apply();
            } catch (Throwable th) {
                g01.c("SP", "saveRecommendStatusWithoutUid: " + th.getMessage());
            }
        }
    }

    public static void G(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45541f", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("sync_switch", str).apply();
        }
    }

    public static void H(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dd1636", new Object[]{context, new Boolean(z)});
        } else {
            context.getSharedPreferences("tb_recommend_privacy", 0).edit().putBoolean("content", z).apply();
        }
    }

    public static void I(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba4c5c", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_ttid_list", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static String L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eb8c5b6", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_cache_count_global_header", null);
    }

    public static String M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc96e5a2", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_gray_scope", "200");
    }

    public static String N(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ab83b14", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_global_header_gray_scope", "0");
    }

    public static String O(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f7c0894", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_global_header_switch", "1");
    }

    public static void P(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bc8aad", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_cache_count_global_header", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void Q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529ee281", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_gray_scope", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void R(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a83b4f", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_global_header_gray_scope", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void S(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419ab94f", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_global_header_switch", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944b3ddf", new Object[]{context});
        } else if (context != null) {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().remove("user_id").commit();
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201cb12e", new Object[]{context});
        } else {
            context.getSharedPreferences("tb_recommend_privacy", 0).edit().remove("content").apply();
        }
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22acd3ee", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
        return sharedPreferences.contains("recommend_status#" + str);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f480cc5c", new Object[]{context})).booleanValue();
        }
        return context.getSharedPreferences("tb_recommend_privacy", 0).contains("content");
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2216b47f", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_display_switch", null);
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aad0787d", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_entrance_name", "隐私-推荐管理");
        } catch (Throwable unused) {
            return "隐私-推荐管理";
        }
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6e9e8a1", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_gray_scope", "1000");
        } catch (Throwable unused) {
            return "1000";
        }
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7463b714", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_cache_count", null);
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cffbdb52", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("log_timeInterval", null);
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4495701", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString(vb.m, null);
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd3867b8", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("user_id", null);
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3152fa", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("mtop_api", null);
    }

    public static String n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbb2a7d3", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
            return sharedPreferences.getString("privacy_profile_" + str, null);
        } catch (Throwable th) {
            g01.c("PrivacySpHelper", "getPrivacyProfileFromSp " + th.getMessage());
            return null;
        }
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8203222", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_linked_h5_url", "https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/recommend");
        } catch (Throwable unused) {
            return "https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/recommend";
        }
    }

    public static String r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("940d1a84", new Object[]{context});
        }
        return context.getSharedPreferences("ali_privacy_recommend", 0).getString("sync_switch", null);
    }

    public static String t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7d155c", new Object[]{context});
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getString("recommend_ttid_list", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void u(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08c647f", new Object[]{context, str});
        } else if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
                edit.remove("privacy_profile_" + str).apply();
            } catch (Throwable th) {
                g01.c("PrivacySpHelper", "getPrivacyProfileFromSp " + th.getMessage());
            }
        }
    }

    public static void v(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ea7c84", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_gray_scope", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void w(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b639330", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
        edit.putBoolean("recommend_status#" + str, z).apply();
    }

    public static void x(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580b9c6d", new Object[]{context, str});
            return;
        }
        try {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("recommend_entrance_name", str).apply();
        } catch (Throwable unused) {
        }
    }

    public static void y(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46c3f4f", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString("log_cache_count", str).apply();
        }
    }

    public static void z(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b125a4b0", new Object[]{context, str});
        } else {
            context.getSharedPreferences("ali_privacy_recommend", 0).edit().putString(vb.m, str).apply();
        }
    }

    public static boolean J(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315a3e3e", new Object[]{context, str, str2})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
            edit.putString("privacy_profile_" + str, str2).apply();
            return true;
        } catch (Throwable th) {
            g01.c("SP", "setPrivacyProfileToSp: " + th.getMessage());
            return false;
        }
    }

    public static void K(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd9b354", new Object[]{context, str});
            return;
        }
        boolean z = context.getSharedPreferences("tb_recommend_privacy", 0).getBoolean("content", true);
        SharedPreferences.Editor edit = context.getSharedPreferences("ali_privacy_recommend", 0).edit();
        edit.putBoolean("recommend_status#" + str, z).apply();
    }

    public static boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a540aa0", new Object[]{context, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ali_privacy_recommend", 0);
        return sharedPreferences.getBoolean("recommend_status#" + str, true);
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42967b05", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            return context.getSharedPreferences("ali_privacy_recommend", 0).getBoolean("recommend_status_not_logged_in", true);
        } catch (Throwable th) {
            g01.c("SP", "getRecommendStatusWithoutUid " + th.getMessage());
            return true;
        }
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("def0227b", new Object[]{context})).booleanValue();
        }
        return context.getSharedPreferences("tb_recommend_privacy", 0).getBoolean("content", true);
    }
}
