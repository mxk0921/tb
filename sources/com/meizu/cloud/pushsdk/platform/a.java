package com.meizu.cloud.pushsdk.platform;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f5918a = a();
    private static final List<String> b = new ArrayList(f5918a.keySet());

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() <= 3) {
                return str;
            }
            String substring = str.substring(0, 3);
            if (!f5918a.containsKey(substring)) {
                return str;
            }
            String str3 = f5918a.get(substring);
            str2 = str.substring(3);
            try {
                char[] cArr = new char[str2.length() / 2];
                int i = 0;
                int i2 = 0;
                while (i < str2.length() / 2) {
                    if (i2 == str3.length()) {
                        i2 = 0;
                    }
                    int i3 = i * 2;
                    cArr[i] = (char) (((char) Integer.valueOf(str2.substring(i3, i3 + 2), 16).intValue()) ^ str3.charAt(i2));
                    i++;
                    i2++;
                }
                return new String(String.valueOf(cArr).getBytes("iso-8859-1"), "UTF-8");
            } catch (Exception unused) {
                DebugLogger.e("PushIdEncryptUtils", "invalid pushId encryption " + str2);
                return str;
            }
        } catch (Exception unused2) {
            str2 = str;
        }
    }

    private static Map<String, String> a() {
        if (a(f5918a)) {
            synchronized (a.class) {
                try {
                    if (a(f5918a)) {
                        TreeMap treeMap = new TreeMap();
                        f5918a = treeMap;
                        treeMap.put("UCI", "v9tC0Myz1MGwXRFy");
                        f5918a.put("G3G", "XAsFqhhaf4gKpmAi");
                        f5918a.put("V5R", "cOqH18NXwBtZVkvz");
                        f5918a.put("0XC", "IgSEKZ3Ea6Pm4woS");
                        f5918a.put("Z9K", "pH6J9DMPNgqQp8m8");
                        f5918a.put("EIM", "K11Rs9HAKRXeNwq8");
                        f5918a.put("SO7", "T8LquL1DvwVcogiU");
                        f5918a.put("DDI", "d02F6ttOtV05MYCQ");
                        f5918a.put("ULY", "ToZZIhAywnUfHShN");
                        f5918a.put("0EV", "r5D5RRwQhfV0AYLb");
                        f5918a.put("N6A", "QAtSBFcXnQoUgHO2");
                        f5918a.put("S5Q", "sDWLrZINnum227am");
                        f5918a.put("RA5", "4Uq3Ruxo1FTBdHQE");
                        f5918a.put("J04", "N5hViUTdLCpN59H0");
                        f5918a.put("B68", "EY3sH1KKtalg5ZaT");
                        f5918a.put("9IW", "q1u0MiuFyim4pCYY");
                        f5918a.put("UU3", "syLnkkd8AqNykVV7");
                        f5918a.put("Z49", "V00FiWu124yE91sH");
                        f5918a.put("BNA", "rPP7AK1VWpKEry3p");
                        f5918a.put("WXG", "om8w5ahkJJgpAH9v");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5918a;
    }

    public static <K, V> boolean a(Map<K, V> map) {
        return map == null || map.isEmpty();
    }
}
