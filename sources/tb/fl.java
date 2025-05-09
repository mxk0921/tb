package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740653);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8236ab01", new Object[]{str, str2, str3});
            return;
        }
        UMLinkLogInterface a2 = hdv.a();
        if (a2 != null) {
            if (!d(str3) || str3.lastIndexOf("$") != 0) {
                a2.logError("AURAMonitor", "AURAPathUtils", "expressionValueMapping", null, str + "_" + str2 + "_" + str3, str + "_" + str2 + "_" + str3, null, null);
                a2.commitFailure("expressionValueMapping", "AURAMonitor", "1.0", "AURAMonitor", "AURAPathUtils", null, str + "_" + str2 + "_" + str3, str + "_" + str2 + "_" + str3);
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52c608b1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^.*\\$\\{.+\\}.*$")) {
            return false;
        }
        return true;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fcfcb7c", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
            return false;
        }
        return true;
    }

    public static String[] e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("711d46e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = new String[3];
        String str3 = "";
        if (d(str)) {
            strArr[2] = str3;
            strArr[0] = str3;
            strArr[1] = str;
            return strArr;
        } else if (!c(str)) {
            return null;
        } else {
            Matcher matcher = Pattern.compile("\\$\\{.+\\}").matcher(str);
            if (!matcher.find()) {
                return null;
            }
            int start = matcher.start();
            int end = matcher.end();
            if (start > 0) {
                str2 = str.substring(0, start);
            } else {
                str2 = str3;
            }
            strArr[0] = str2;
            strArr[1] = str.substring(start, end);
            if (end < str.length()) {
                str3 = str.substring(end, str.length());
            }
            strArr[2] = str3;
            return strArr;
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("698971eb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(2, str.length() - 1);
    }

    public static void a(Object obj, Map<String, Object> map) {
        char c = 0;
        char c2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3ee0cd", new Object[]{obj, map});
        } else if (obj != null && map != null && !map.isEmpty()) {
            String str = "";
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                String str2 = entry.getKey() instanceof String ? (String) entry.getKey() : str;
                Object value = entry.getValue();
                boolean z = value instanceof String;
                if (z) {
                    String str3 = (String) value;
                    if (c(str3)) {
                        String[] e = e(str3);
                        String str4 = e[0];
                        String str5 = e[2];
                        String f = f(e[1]);
                        if (TextUtils.isEmpty(f)) {
                            b("emptyExpressionPath", str2, str3);
                            return;
                        }
                        Object d = gl.d(gl.j(f), map);
                        if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
                            if (d != null) {
                                str = d.toString();
                            }
                            entry.setValue(str4 + str + str5);
                        } else {
                            entry.setValue(d);
                        }
                        if (d == null) {
                            b("nullRealValue", str2, str3);
                            return;
                        }
                        return;
                    }
                }
                if ((value instanceof Map) || (value instanceof List)) {
                    a(value, map);
                } else if (z) {
                    String str6 = (String) value;
                    if (str6.contains("${")) {
                        b("unknownExpression", str2, str6);
                    }
                }
            } else if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).entrySet()) {
                    a(obj2, map);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                int i = 0;
                while (i < list.size()) {
                    Object obj3 = list.get(i);
                    boolean z2 = obj3 instanceof String;
                    if (z2) {
                        String str7 = (String) obj3;
                        if (c(str7)) {
                            String[] e2 = e(str7);
                            String str8 = e2[c];
                            String str9 = e2[c2];
                            String f2 = f(e2[1]);
                            if (TextUtils.isEmpty(f2)) {
                                b("emptyExpressionPath", "arrayIndex", str7);
                                return;
                            }
                            Object d2 = gl.d(gl.j(f2), map);
                            if (!TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9)) {
                                String obj4 = d2 == null ? str : d2.toString();
                                list.remove(i);
                                if (i < list.size()) {
                                    list.add(i, str8 + obj4 + str9);
                                } else {
                                    list.add(str8 + obj4 + str9);
                                }
                            } else {
                                list.remove(i);
                                if (i < list.size()) {
                                    list.add(i, d2);
                                } else {
                                    list.add(d2);
                                }
                            }
                            if (d2 == null) {
                                b("nullRealValue", "arrayIndex", str7);
                            }
                            i++;
                            c = 0;
                            c2 = 2;
                        }
                    }
                    if ((obj3 instanceof Map) || (obj3 instanceof List)) {
                        a(obj3, map);
                    } else if (z2) {
                        String str10 = (String) obj3;
                        if (str10.contains("${")) {
                            b("unknownExpression", "arrayIndex", str10);
                        }
                    }
                    i++;
                    c = 0;
                    c2 = 2;
                }
            }
        }
    }
}
