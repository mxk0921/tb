package com.ta.utdid2.android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern BlackPattern = Pattern.compile("([\t\r\n])+");

    static {
        t2o.a(966787108);
    }

    public static boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static String getStringWithoutBlank(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98514cbc", new Object[]{str});
        }
        if (str == null || "".equals(str)) {
            return str;
        }
        return BlackPattern.matcher(str).replaceAll("");
    }

    public static int hashCode(String str) {
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

    public static boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.length() <= 0) {
            return true;
        }
        return false;
    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b91468c9", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.ta.utdid2.android.utils.StringUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
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
}
