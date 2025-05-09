package com.alibaba.wireless.security.middletierplugin.open.fc;

import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0132;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0139 {

    /* renamed from: а  reason: contains not printable characters */
    public static final String f188 = "bx-action";

    /* renamed from: б  reason: contains not printable characters */
    public static final String f189 = "bx-log-ratio";

    /* renamed from: в  reason: contains not printable characters */
    public static final String f190 = "bx-retry";

    /* renamed from: г  reason: contains not printable characters */
    public static final String f191 = "bx-subcode";

    /* renamed from: д  reason: contains not printable characters */
    public static final String f192 = "bx-close-btn";

    /* renamed from: е  reason: contains not printable characters */
    public static final String f193 = "location";

    /* renamed from: ж  reason: contains not printable characters */
    public static final String f194 = "bx-sleep";

    /* renamed from: з  reason: contains not printable characters */
    public static final String f195 = "x-skip-bx-sleep";

    /* renamed from: и  reason: contains not printable characters */
    public static final String f196 = "bx-view-timeout";

    /* renamed from: й  reason: contains not printable characters */
    public static final String f197 = "bx-extra-info";

    /* renamed from: к  reason: contains not printable characters */
    public static final String f198 = "x-bx-resend";

    /* renamed from: л  reason: contains not printable characters */
    public static final String f199 = "bx-uuid";

    /* renamed from: м  reason: contains not printable characters */
    public static final String f200 = "bx-download-config";

    /* renamed from: н  reason: contains not printable characters */
    public static final String f201 = "uuid=";

    /* renamed from: о  reason: contains not printable characters */
    public static final String f202 = "bx-view-interval";

    /* renamed from: п  reason: contains not printable characters */
    public static final String f203 = "bx-show";

    /* renamed from: р  reason: contains not printable characters */
    public static final String f204 = "bx-show-new";

    /* renamed from: с  reason: contains not printable characters */
    public static final String f205 = "bx-cover-close";

    /* renamed from: т  reason: contains not printable characters */
    public static final String f206 = "login";

    /* renamed from: у  reason: contains not printable characters */
    public static final String f207 = "sample";

    /* renamed from: ф  reason: contains not printable characters */
    private static volatile boolean f208 = false;

    /* renamed from: х  reason: contains not printable characters */
    public static int f209 = 10;

    /* renamed from: ц  reason: contains not printable characters */
    private static volatile long f210 = 0;

    /* renamed from: ч  reason: contains not printable characters */
    public static final String f211 = "BXLOG";

    /* renamed from: ё  reason: contains not printable characters */
    public static final String f212 = "Location";

    /* renamed from: а  reason: contains not printable characters */
    public static HashMap<String, Object> m138(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        } catch (Exception e) {
            String str = "JsonToMap Exception : " + e.getMessage();
        }
        return hashMap;
    }

    /* renamed from: б  reason: contains not printable characters */
    public static String m139(int i, HashMap hashMap, String str, String str2, String str3) {
        String[] split;
        String substring;
        try {
            if (hashMap.containsKey(str2)) {
                Object obj = hashMap.get(str2);
                if (i == 0) {
                    return (String) obj;
                }
                if (i != 1) {
                    return "";
                }
                substring = (String) ((List) obj).get(0);
            } else if (str == null || str.isEmpty()) {
                return "";
            } else {
                for (String str4 : str.split("&")) {
                    if (str4.startsWith(str3)) {
                        substring = str4.substring(str3.length());
                    }
                }
                return "";
            }
            return substring;
        } catch (Exception e) {
            String str5 = "getBXUUID : " + e.getMessage();
            return "";
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public static boolean m140() {
        return f208;
    }

    /* renamed from: г  reason: contains not printable characters */
    public static boolean m141(C0132 r6, boolean z) {
        if (r6.m100() == 0 || z) {
            return true;
        }
        return f210 <= 0 || System.currentTimeMillis() >= f210;
    }

    /* renamed from: д  reason: contains not printable characters */
    public static void m142(C0132 r4) {
        if (r4.m100() != 0) {
            f210 = System.currentTimeMillis() + r4.m100();
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    public static void m143(boolean z) {
        f208 = z;
    }

    /* renamed from: ё  reason: contains not printable characters */
    public static boolean m144(long j, String str) {
        boolean z = true;
        boolean z2 = j % ((long) f209) == 0;
        if (str == null) {
            return z2;
        }
        try {
            if (j % f209 >= Integer.parseInt(str)) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            String str2 = "shouldUtOrNot needUT = " + str + ", error : " + e.getMessage();
            return z2;
        }
    }
}
