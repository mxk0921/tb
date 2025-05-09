package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262825);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52c608b1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^.*\\$\\{.+\\}.*$")) {
            return false;
        }
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fcfcb7c", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
            return false;
        }
        return true;
    }

    public static String[] d(String str) {
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
        if (c(str)) {
            strArr[2] = str3;
            strArr[0] = str3;
            strArr[1] = str;
            return strArr;
        }
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
            str3 = str.substring(end);
        }
        strArr[2] = str3;
        return strArr;
    }

    public static String e(String str) {
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
                    if (b(str3)) {
                        String[] d = d(str3);
                        String str4 = d[0];
                        String str5 = d[2];
                        String e = e(d[1]);
                        if (TextUtils.isEmpty(e)) {
                            tgh.b("PathUtils$ExpressionMethods", "emptyMapExpressionPath for: " + value + " with key: " + str2);
                            return;
                        }
                        Object e2 = zul.e(zul.b(e), map);
                        if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
                            if (e2 != null) {
                                str = e2.toString();
                            }
                            entry.setValue(str4 + str + str5);
                        } else {
                            entry.setValue(e2);
                        }
                        if (e2 == null) {
                            tgh.b("PathUtils$ExpressionMethods", "emptyMapExpressionValue for: " + value + " with key: " + str2);
                            return;
                        }
                        return;
                    }
                }
                if ((value instanceof Map) || (value instanceof List)) {
                    a(value, map);
                } else if (z && ((String) value).contains("${")) {
                    tgh.b("PathUtils$ExpressionMethods", "unknownMapExpression for: " + value + " with key: " + str2);
                }
            } else if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).entrySet()) {
                    a(obj2, map);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj3 = list.get(i);
                    boolean z2 = obj3 instanceof String;
                    if (z2) {
                        String str6 = (String) obj3;
                        if (b(str6)) {
                            String[] d2 = d(str6);
                            String str7 = d2[0];
                            String str8 = d2[2];
                            String e3 = e(d2[1]);
                            if (TextUtils.isEmpty(e3)) {
                                tgh.b("PathUtils$ExpressionMethods", "emptyArrayExpressionPath for: " + obj3);
                            } else {
                                Object e4 = zul.e(zul.b(e3), map);
                                if (!TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8)) {
                                    String obj4 = e4 == null ? str : e4.toString();
                                    list.remove(i);
                                    if (i < list.size()) {
                                        list.add(i, str7 + obj4 + str8);
                                    } else {
                                        list.add(str7 + obj4 + str8);
                                    }
                                } else {
                                    list.remove(i);
                                    if (i < list.size()) {
                                        list.add(i, e4);
                                    } else {
                                        list.add(e4);
                                    }
                                }
                                if (e4 == null) {
                                    tgh.b("PathUtils$ExpressionMethods", "emptyArrayExpressionValue for: " + obj3);
                                }
                            }
                        }
                    }
                    if ((obj3 instanceof Map) || (obj3 instanceof List)) {
                        a(obj3, map);
                    } else if (z2 && ((String) obj3).contains("${")) {
                        tgh.b("PathUtils$ExpressionMethods", "unknownArrayExpression for: " + obj3);
                    }
                }
            }
        }
    }
}
