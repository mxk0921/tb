package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class os6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Map<String, String> f25612a = new HashMap(8);
    public static volatile Map<String, String> b = new HashMap(8);

    static {
        t2o.a(729809133);
    }

    public static int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c18cc01b", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return i;
        }
        SharedPreferences g = g(str);
        if (g == null) {
            return i;
        }
        return g.getInt(str2, i);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("331957c5", new Object[]{str, str2});
        }
        return c("homepage_biz_switch", str, str2);
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eef51bfb", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        SharedPreferences g = g(str);
        if (g == null) {
            return str3;
        }
        return g.getString(str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.os6.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0020
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r3
            r3 = 1
            r5[r3] = r4
            r3 = 2
            r5[r3] = r1
            java.lang.String r3 = "d34fc5c7"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L_0x0020:
            java.lang.String r0 = "_"
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0040
            java.lang.String r5 = tb.s5a.h()
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L_0x0041
        L_0x0040:
            r5 = r1
        L_0x0041:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            java.util.Map<java.lang.String, java.lang.String> r4 = tb.os6.f25612a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x006d
            java.lang.String r4 = tb.slp.c(r3, r1)
            java.util.Map<java.lang.String, java.lang.String> r5 = tb.os6.f25612a
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r3, r4)
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.os6.d(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.os6.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0020
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r3
            r3 = 1
            r5[r3] = r4
            r3 = 2
            r5[r3] = r1
            java.lang.String r3 = "16efa6d8"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L_0x0020:
            java.lang.String r0 = "_"
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0040
            java.lang.String r5 = tb.s5a.h()
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            goto L_0x0041
        L_0x0040:
            r5 = r1
        L_0x0041:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            java.util.Map<java.lang.String, java.lang.String> r4 = tb.os6.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x006a
            java.util.Map<java.lang.String, java.lang.String> r4 = tb.os6.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r3, r1)
            goto L_0x006b
        L_0x006a:
            r1 = r4
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.os6.e(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static int f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a808f22", new Object[]{str, new Integer(i)})).intValue();
        }
        return a("homepage_biz_switch", str, i);
    }

    public static SharedPreferences g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6cb3acc2", new Object[]{str});
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return null;
        }
        return application.getSharedPreferences(str, 0);
    }

    public static boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cde6", new Object[]{str, str2})).booleanValue();
        }
        return j("homepage_biz_switch", str, str2);
    }

    public static boolean i(String str, String str2, int i) {
        SharedPreferences g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20b86165", new Object[]{str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (g = g(str)) == null) {
            return false;
        }
        SharedPreferences.Editor edit = g.edit();
        edit.putInt(str2, i);
        edit.apply();
        return true;
    }

    public static boolean j(String str, String str2, String str3) {
        SharedPreferences g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4b80330", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (g = g(str)) == null) {
            return false;
        }
        SharedPreferences.Editor edit = g.edit();
        edit.putString(str2, str3);
        edit.apply();
        return true;
    }

    public static boolean k(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e47c31a", new Object[]{str, new Integer(i)})).booleanValue();
        }
        return i("homepage_biz_switch", str, i);
    }

    public static boolean l(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35a3defb", new Object[]{str, str2, new Boolean(z), str3})).booleanValue();
        }
        String str4 = "";
        if (z) {
            try {
                String h = s5a.h();
                if (!TextUtils.isEmpty(h)) {
                    str4 = str4 + h + "_";
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        String str5 = str4 + str + "_" + str2;
        ((HashMap) f25612a).put(str5, str3);
        slp.e(str5, str3);
        return true;
    }

    public static boolean m(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2523d9ff", new Object[]{str, str2, new Boolean(z), str3})).booleanValue();
        }
        String str4 = "";
        if (z) {
            try {
                String h = s5a.h();
                if (!TextUtils.isEmpty(h)) {
                    str4 = str4 + h + "_";
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        ((HashMap) b).put(str4 + str + "_" + str2, str3);
        return true;
    }
}
