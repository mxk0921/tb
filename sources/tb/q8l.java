package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159135);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba8a73cb", new Object[]{str})).booleanValue();
        }
        try {
            return new File(ey1.SWITCH_FILE_DIR, str).exists();
        } catch (Exception e) {
            ggh.d("abSwitchLocal " + str + e.getMessage());
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd3d30", new Object[0])).booleanValue();
        }
        String c = o8l.c(iu2.ORANGE_CALENDER_ADD_REPEAT_ENABLE, String.valueOf(true));
        ggh.d("calenderAddRepeatEnable: " + c);
        return Boolean.parseBoolean(c);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a2f45af", new Object[0])).booleanValue();
        }
        String c = o8l.c(iu2.ORANGE_CALENDER_HUAWEI_ENABLE, String.valueOf(false));
        ggh.d("calenderHuaweiEnable: " + c);
        return Boolean.parseBoolean(c);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b4e6a8", new Object[0])).booleanValue();
        }
        String c = o8l.c(iu2.ORANGE_CALENDER_OPPO_ENABLE, String.valueOf(false));
        ggh.d("calenderOppoEnable: " + c);
        return Boolean.parseBoolean(c);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("317ccfc9", new Object[0])).booleanValue();
        }
        String c = o8l.c(iu2.ORANGE_CALENDER_READ_LOCAL_ENABLE, String.valueOf(true));
        boolean a2 = a("calenderReadLocalEnable");
        ggh.d("calenderReadLocalEnable: " + c + ",switchLocal: " + a2);
        if (Boolean.parseBoolean(c) || a2) {
            return true;
        }
        return false;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6014c7", new Object[0]);
        }
        String c = o8l.c("userPreference", "");
        ggh.d("preferConfig: " + c);
        return c;
    }
}
