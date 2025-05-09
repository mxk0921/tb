package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593006);
    }

    public static String a(Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0cfb1f7", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            String c = c(map.get(str));
            String c2 = c(str);
            if (!(c == null || c2 == null)) {
                if (z) {
                    stringBuffer.append(c2 + "=" + c);
                    z = false;
                } else {
                    stringBuffer.append(",");
                    stringBuffer.append(c2 + "=" + c);
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String b(Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d76f9ea", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            String c = c(map.get(str));
            String c2 = c(str);
            if (!(c == null || c2 == null)) {
                if (z) {
                    try {
                        stringBuffer.append(URLEncoder.encode(c2, "UTF-8") + "=" + URLEncoder.encode(c, "UTF-8"));
                        z = false;
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        stringBuffer.append(",");
                        stringBuffer.append(URLEncoder.encode(c2, "UTF-8") + "=" + URLEncoder.encode(c, "UTF-8"));
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a23613f", new Object[]{obj});
        }
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

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be1b105f", new Object[]{str})).intValue();
        }
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i * 31) + c;
        }
        return i;
    }

    public static boolean e(String str) {
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

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447819e0", new Object[]{str})).booleanValue();
        }
        return !e(str);
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7d8dd19", new Object[]{str})).booleanValue();
        }
        return !f(str);
    }

    public static String i(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("720a4862", new Object[]{map});
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            stringBuffer.append(next.getKey().toString());
            stringBuffer.append("'");
            String str2 = "";
            if (next.getValue() == null) {
                str = str2;
            } else {
                str = next.getValue().toString();
            }
            stringBuffer.append(str);
            if (it.hasNext()) {
                str2 = "^";
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static Map<String, String> j(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfe72e8e", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "^");
        while (stringTokenizer.hasMoreTokens()) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "'");
            String nextToken = stringTokenizer2.nextToken();
            if (stringTokenizer2.hasMoreTokens()) {
                str2 = stringTokenizer2.nextToken();
            } else {
                str2 = null;
            }
            hashMap.put(nextToken, str2);
        }
        return hashMap;
    }
}
