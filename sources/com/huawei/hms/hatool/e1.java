package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e1 {
    public static String a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return a(str, str2, str3) ? str2 : str4;
        }
        v.f("hmsSdk", "checkStrParameter() Parameter verification failure! Parameter:" + str);
        return str4;
    }

    public static boolean a(String str) {
        return !a("eventId", str, 256);
    }

    public static boolean a(String str, String str2, int i) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is empty : ");
        } else if (str2.length() <= i) {
            return true;
        } else {
            sb = new StringBuilder("checkString() Failure of parameter length check! Parameter:");
        }
        sb.append(str);
        v.f("hmsSdk", sb.toString());
        return false;
    }

    public static boolean a(String str, String str2, String str3) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is null! Parameter:");
        } else if (Pattern.compile(str3).matcher(str2).matches()) {
            return true;
        } else {
            sb = new StringBuilder("checkString() Parameter verification failure! Parameter:");
        }
        sb.append(str);
        v.f("hmsSdk", sb.toString());
        return false;
    }

    public static boolean a(Map<String, String> map) {
        String str;
        if (map == null || map.size() == 0) {
            str = "onEvent() mapValue has not data.so,The data will be empty";
        } else if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            str = "checkMap() the key can't be constants or _constants";
        } else if (map.size() <= 2048 && map.toString().length() <= 204800) {
            return true;
        } else {
            str = "checkMap Map data is too big! size: " + map.size() + " length: " + map.toString().length();
        }
        v.f("hmsSdk", str);
        return false;
    }
}
