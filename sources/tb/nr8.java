package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237885);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d81af6f", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c : charArray) {
            if ('@' == c) {
                z = true;
            } else if ('{' == c && z) {
                return sb.toString();
            } else {
                if (z) {
                    sb.append(c);
                }
            }
        }
        return null;
    }

    public static Object b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6fc9a34e", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = charArray.length;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        String str3 = str;
        while (i < length) {
            char c = charArray[i];
            if ('@' == c) {
                z = true;
                str3 = str3;
            } else {
                if ('{' == c && z) {
                    str2 = sb.toString();
                    if (jsl.a(str2)) {
                        z = false;
                        z2 = true;
                    } else {
                        z = false;
                    }
                } else if ('}' == c && z2) {
                    String sb3 = sb2.toString();
                    bsl b = jsl.b(str2);
                    String str4 = str3;
                    if (b != null) {
                        try {
                            str4 = b.a(sb3, jSONObject);
                        } catch (Exception e) {
                            tj8.b("ExpressionParserEngine", "getValue", "EVENT_CHAIN_EXPRESSION_PARSER_ENGINE_PARSE_ERROR", tj8.c(e));
                            return null;
                        }
                    }
                    z = false;
                    str3 = str4;
                } else if (z) {
                    sb.append(c);
                } else if (z2) {
                    sb2.append(c);
                }
                i++;
                str3 = str3;
            }
            z2 = false;
            i++;
            str3 = str3;
        }
        return str3;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbccf080", new Object[]{str})).booleanValue();
        }
        if (d(str)) {
            return false;
        }
        return str.startsWith("@");
    }

    public static boolean d(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }
}
