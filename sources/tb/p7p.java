package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import mtopsdk.mtop.intf.Mtop;
import tb.py8;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25923a = true;

    static {
        t2o.a(729809160);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f98012e", new Object[]{context})).intValue();
        }
        int i = e(context).getInt("coldStartErrorNum", 0);
        bqa.d("SecondRefreshUtils", "getColdStartErrorNum: " + i);
        return i;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3cff3a", new Object[]{str});
        }
        if (TextUtils.equals(str, "coldStart")) {
            return c();
        }
        String oldEncryptedUserId = Login.getOldEncryptedUserId();
        if (TextUtils.isEmpty(oldEncryptedUserId)) {
            return c();
        }
        if (!TextUtils.isEmpty(o())) {
            return oldEncryptedUserId;
        }
        r5a.i(r5a.f27121a, UtUtils.CHANGED_UPP_EVENT_ID, "encryptUserId_null", "getEncryptUserId");
        return oldEncryptedUserId;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("949eb3d", new Object[0]);
        }
        String e = qy8.b.e("homepage_common", "encrypted_user_id", "");
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        r5a.i(r5a.f27121a, UtUtils.CHANGED_UPP_EVENT_ID, "encryptUserId_null", "encryptUserIdBackup");
        return py8.b.b("home.kv", "oldEncryptedUserId", "");
    }

    public static SharedPreferences e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("45b8484c", new Object[]{context});
        }
        return context.getSharedPreferences("homepage_switch", 0);
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        if (k()) {
            return h();
        }
        return Login.getOldUserId();
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72541173", new Object[]{str});
        }
        if (TextUtils.equals(str, "coldStart")) {
            return f();
        }
        String oldUserId = Login.getOldUserId();
        qy8.b.i("homepage_switch", "user_id", oldUserId);
        return oldUserId;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e4c3089", new Object[0]);
        }
        String e = qy8.b.e("homepage_switch", "user_id", "");
        if (TextUtils.isEmpty(e)) {
            Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
            if (instance != null) {
                e = instance.getUserId();
                bqa.d("SecondRefreshUtils", "mtop getUserId: " + e);
            }
            if (TextUtils.isEmpty(e)) {
                e = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString("UserId", "");
                bqa.d("SecondRefreshUtils", "sp getUserId: " + e);
            }
        }
        bqa.d("SecondRefreshUtils", "getUserId: " + e);
        return e;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12d5d26b", new Object[]{str});
        }
        if (TextUtils.equals(str, "coldStart") && k()) {
            return qy8.b.e("homepage_switch", "user_nick", "");
        }
        String oldNick = Login.getOldNick();
        qy8.b.i("homepage_switch", "user_nick", oldNick);
        return oldNick;
    }

    public static boolean j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[0])).booleanValue();
        }
        if (!k()) {
            return Login.checkSessionValid();
        }
        Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
        if (instance != null) {
            str = instance.getSid();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d624ab", new Object[0])).booleanValue();
        }
        if (!f25923a) {
            return false;
        }
        boolean b = f4b.b("secondRefreshOpt", true);
        bqa.d("SecondRefreshUtils", "isOpenSecondRefreshOpt: " + b);
        return b;
    }

    public static void l(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af9104f", new Object[]{context, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = e(context).edit();
        edit.putInt("coldStartErrorNum", i);
        edit.apply();
    }

    public static void n(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab2a8b5", new Object[]{context});
            return;
        }
        int a2 = a(context) - 1;
        if (a2 >= 0) {
            i = a2;
        }
        l(context, i);
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d5d0ca8", new Object[0]);
        }
        String oldEncryptedUserId = Login.getOldEncryptedUserId();
        qy8.b.i("homepage_common", "encrypted_user_id", oldEncryptedUserId);
        return oldEncryptedUserId;
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d6753d", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa67730", new Object[]{context})).booleanValue();
        }
        boolean z = e(context).getBoolean("secondRefreshRollback", false);
        vxm.b.e().a("secondRefreshRollback", Boolean.valueOf(z));
        bqa.d("SecondRefreshUtils", "getSecondRefreshRollback: " + z);
        return z;
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b51b4", new Object[]{context});
        } else if (!d(context)) {
            int a2 = a(context) + 1;
            if (a2 == 3) {
                p(context);
            } else {
                l(context, a2);
            }
        } else if (f4b.b("triggerFuse", false)) {
            f25923a = false;
        }
    }

    public static void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cece288", new Object[]{context});
            return;
        }
        SharedPreferences.Editor edit = e(context).edit();
        edit.putBoolean("secondRefreshRollback", true);
        edit.apply();
        if (f4b.b("triggerFuse", false)) {
            f25923a = false;
            imn.n(context);
        }
    }
}
