package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886328);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33b3979a", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "." + str2;
    }

    public static boolean b(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d573533", new Object[]{str, str2, list})).booleanValue();
        }
        if (str2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        try {
            String a2 = a(str, str2);
            for (String str3 : list) {
                if (str3 != null) {
                    if (!str2.equals(str3) && !a2.equals(str3)) {
                        int length = str3.length();
                        int indexOf = str3.indexOf(".*.");
                        if (indexOf < 0) {
                            boolean startsWith = str3.startsWith("*.");
                            boolean endsWith = str3.endsWith(yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
                            if (!startsWith || !endsWith) {
                                if (startsWith && length > 2 && a2.endsWith(str3.substring(2))) {
                                    return true;
                                }
                                if (endsWith && length > 2 && a2.startsWith(str3.substring(0, str3.indexOf(yhs.DEFAULT_PLAN_B_PASSWORD_REGEX)))) {
                                }
                            } else if (length > 4) {
                                String substring = str3.substring(0, str3.indexOf(yhs.DEFAULT_PLAN_B_PASSWORD_REGEX));
                                if (!TextUtils.isEmpty(substring) && a2.contains(substring.substring(2))) {
                                    return true;
                                }
                            }
                        } else if (length > 3) {
                            String substring2 = str3.substring(0, indexOf);
                            String substring3 = str3.substring(indexOf + 3);
                            if (a2.startsWith(substring2) && a2.endsWith(substring3)) {
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
