package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(703594524);
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310816ee", new Object[]{activity, str, str2, str3});
        } else {
            ibu.c(activity, str, str2, str3);
        }
    }

    public static void b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6ce9c3", new Object[]{activity, str, str2});
        } else {
            ibu.d(activity, str, str2);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c2fbd7", new Object[]{context});
        } else {
            ibu.a(context, "Page_City", new Pair[0]);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cf1e80", new Object[]{context});
        } else {
            ibu.a(context, "Button_Confirm", new Pair[0]);
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e949d2", new Object[]{context});
        } else {
            ibu.a(context, "Page_Network", new Pair[0]);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e32279", new Object[]{context});
        } else {
            ibu.a(context, "Page_PhoneNum", new Pair[0]);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8dc24", new Object[]{context});
        } else {
            ibu.a(context, "Page_Offer", new Pair[0]);
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e43df2", new Object[]{context});
        } else {
            ibu.a(context, "Button_Return", new Pair[0]);
        }
    }
}
