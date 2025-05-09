package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217739);
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7569833", new Object[]{str, str2});
        }
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    y7t.a("URLUtil", "originUrl:" + str);
                    int indexOf = str.indexOf(35);
                    if (indexOf > -1) {
                        str3 = str.substring(indexOf + 1);
                        str = str.substring(0, indexOf);
                    } else {
                        str3 = "";
                    }
                    y7t.a("URLUtil", "urlWithoutFragment:" + str + "\nfragment:" + str3);
                    int indexOf2 = str.indexOf(63);
                    if (indexOf2 > -1) {
                        str4 = str.substring(1 + indexOf2);
                        str = str.substring(0, indexOf2);
                    } else {
                        str4 = "";
                    }
                    y7t.a("URLUtil", "path:" + str + "\nquery:" + str4);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    if (str4.length() > 0) {
                        str2 = "&".concat(str2);
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("?");
                    sb3.append(sb2);
                    if (str3.length() > 0) {
                        str5 = "#".concat(str3);
                    } else {
                        str5 = "";
                    }
                    sb3.append(str5);
                    String sb4 = sb3.toString();
                    y7t.a("URLUtil", "result url :" + sb4);
                    return sb4;
                }
            } catch (Throwable unused) {
                return "";
            }
        }
        return str;
    }
}
