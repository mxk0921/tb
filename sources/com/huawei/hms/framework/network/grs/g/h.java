package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h {
    public static String a(String str, String str2) {
        if (!str.equals(str2)) {
            return b(str, str2);
        }
        return str;
    }

    private static String b(String str, String str2) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("services");
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONArray jSONArray2 = new JSONObject(str2).getJSONArray("services");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                hashSet.add(jSONArray2.getString(i2));
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray3.put((String) it.next());
        }
        jSONObject.put("services", jSONArray3);
        return jSONObject.toString();
    }
}
