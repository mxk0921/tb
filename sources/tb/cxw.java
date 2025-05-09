package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944597);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        JSONObject parseObject = JSON.parseObject(kzo.c().b().getSharedPreferences("WALLE", 0).getString(str, ""));
        if (parseObject == null || !parseObject.containsKey(str2)) {
            return null;
        }
        return parseObject.getString(str2);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234b2d74", new Object[]{str, str2, str3});
            return;
        }
        SharedPreferences.Editor edit = kzo.c().b().getSharedPreferences("WALLE", 0).edit();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str2, (Object) str3);
        edit.putString(str, jSONObject.toString());
        edit.apply();
    }
}
