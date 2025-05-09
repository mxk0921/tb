package mtopsdk.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299799);
    }

    public static String concatStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83fd5008", new Object[]{str, str2});
        }
        if (isBlank(str) || isBlank(str2)) {
            return null;
        }
        return str.trim() + "$" + str2.trim();
    }

    public static String concatStr2LowerCase(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f8c3769", new Object[]{str, str2});
        }
        if (isBlank(str) || isBlank(str2)) {
            return null;
        }
        return (str.trim() + "$" + str2.trim()).toLowerCase(Locale.US);
    }

    public static boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447819e0", new Object[]{str})).booleanValue();
        }
        return !isBlank(str);
    }

    public static boolean isStringEqual(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c8b38", new Object[]{str, str2})).booleanValue();
        }
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    public static String[] splitString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8a75ad35", new Object[]{str, str2});
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (isBlank(str2)) {
            return new String[]{str2};
        }
        try {
            return str.split(str2);
        } catch (Throwable unused) {
            return new String[]{str};
        }
    }

    public static boolean isBlank(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf455f", new Object[]{str})).booleanValue();
        }
        if (!(str == null || (length = str.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String concatStr2LowerCase(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d29fbc6e", new Object[]{str, strArr});
        }
        if (isBlank(str) || strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.trim());
        if (strArr.length > 0) {
            for (String str2 : strArr) {
                if (isNotBlank(str2)) {
                    sb.append("$");
                    sb.append(str2.trim());
                }
            }
        }
        return sb.toString().toLowerCase(Locale.US);
    }
}
