package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159049);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dab6994", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean(str2);
        } catch (PackageManager.NameNotFoundException e) {
            ggh.d("CalenderHuaweiManager.isFixCalendarVersion error：" + e);
            return false;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d391ca6", new Object[]{context})).booleanValue();
        }
        return a(context, lu2.OPPO_AUTHORITY, "support_event_instant_link");
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80a8c754", new Object[]{context})).booleanValue();
        }
        return a(context, lu2.OPPO_AUTHORITY, "support_reminder_instant_link");
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2d45037", new Object[]{context});
        }
        if (!q8l.d()) {
            return "error: oppo calender service orange disable";
        }
        if (!b(context)) {
            return "error: not support oppo calender service";
        }
        if (!c(context)) {
            return "error: not support oppo calender push service";
        }
        ggh.d("CalenderOppoManager serviceEnable true");
        return "";
    }
}
