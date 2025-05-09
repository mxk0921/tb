package tb;

import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f25531a = Pattern.compile("?&", 16);

    static {
        t2o.a(729810265);
    }

    public static String a(String str, String... strArr) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73c6e9f", new Object[]{str, strArr});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        if (strArr == null || strArr.length == 0) {
            return str;
        }
        for (String str2 : strArr) {
            if (!StringUtils.isBlank(str2)) {
                int indexOf = str.indexOf("?" + str2 + "=");
                if (indexOf < 0) {
                    indexOf = str.indexOf("&" + str2 + "=");
                    z = false;
                } else {
                    z = true;
                }
                if (indexOf >= 0) {
                    int length = str.length();
                    int length2 = str2.length() + indexOf + 2;
                    while (true) {
                        if (length2 >= str.length()) {
                            break;
                        } else if (str.charAt(length2) == '&') {
                            length = length2;
                            break;
                        } else {
                            length2++;
                        }
                    }
                    if (z) {
                        str = str.substring(0, indexOf + 1) + str.substring(length, str.length());
                    } else {
                        str = str.substring(0, indexOf) + str.substring(length, str.length());
                    }
                }
            }
        }
        if (str.contains("?&")) {
            return f25531a.matcher(str).replaceFirst("?");
        }
        return str;
    }

    public static String b(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f69bddc", new Object[]{str, str2});
        }
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            try {
                String query = new URI(str).getQuery();
                if (query != null && !query.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (String str3 : query.split("&")) {
                        int indexOf = str3.indexOf("=");
                        if (indexOf > 0 && indexOf < str3.length() - 1) {
                            hashMap.put(str3.substring(0, indexOf), URLDecoder.decode(str3.substring(indexOf + 1), "UTF-8"));
                        }
                    }
                    return (String) hashMap.get(str2);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
