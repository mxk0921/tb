package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class asq {
    static {
        t2o.a(813695048);
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!(str2 == null || str == null)) {
                if (z) {
                    if (!"--invalid--".equals(str2)) {
                        stringBuffer.append(str + "=" + str2);
                    } else {
                        stringBuffer.append(str);
                    }
                    z = false;
                } else if (!"--invalid--".equals(str2)) {
                    stringBuffer.append(",");
                    stringBuffer.append(str + "=" + str2);
                } else {
                    stringBuffer.append(",");
                    stringBuffer.append(str);
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return ((String) obj).toString();
        }
        if (obj instanceof Integer) {
            return "" + ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            return "" + ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            return "" + ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            return "" + ((Float) obj).floatValue();
        } else if (obj instanceof Short) {
            return "" + ((int) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            return "" + ((int) ((Byte) obj).byteValue());
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        } else {
            if (obj instanceof Character) {
                return ((Character) obj).toString();
            }
            return obj.toString();
        }
    }

    public static String c(String str, String str2) {
        if (d(str)) {
            return str2;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean e(String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean f(CharSequence charSequence) {
        return !d(charSequence);
    }
}
