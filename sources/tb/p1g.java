package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217770);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1a4360b", new Object[]{str, str2});
        }
        if (str == null) {
            return str;
        }
        if (str.indexOf("?") != -1) {
            return str + "&" + str2;
        }
        return str + "?" + str2;
    }

    public static String b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2255857", new Object[]{str, str2});
        }
        int lastIndexOf = str.lastIndexOf(35);
        if (lastIndexOf > 0) {
            String substring = str.substring(0, lastIndexOf);
            str3 = str.substring(lastIndexOf);
            str = substring;
        } else {
            str3 = "";
        }
        return a(str, str2) + str3;
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ceeab307", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String substring = str.substring(str.indexOf(str2) + str2.length(), str.length());
        return b(h1p.HTTPS_PREFIX + str3 + substring, "xdomain=".concat(str2));
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a68dde12", new Object[]{str})).booleanValue();
        }
        if (str != null) {
            if (str.length() > 6 && str.substring(0, 7).equalsIgnoreCase(h1p.HTTP_PREFIX)) {
                return true;
            }
            if (str.length() > 7 && str.substring(0, 8).equalsIgnoreCase(h1p.HTTPS_PREFIX)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(str);
        sb.append("#is not http");
        return false;
    }

    public static String e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec575f", new Object[]{new Long(j)});
        }
        long time = (Calendar.getInstance().getTime().getTime() - j) / 3600000;
        if (0 == time) {
            return Localization.q(R.string.taobao_app_1007_1_18639);
        }
        if (time < 24) {
            return String.format(Localization.q(R.string.taobao_app_1007_1_18643), Long.valueOf(time));
        }
        if (time < 168) {
            return String.format(Localization.q(R.string.taobao_app_1007_1_18641), Long.valueOf(time / 24));
        }
        return String.format(Localization.q(R.string.taobao_app_1007_1_18634), Long.valueOf(time / 168));
    }
}
