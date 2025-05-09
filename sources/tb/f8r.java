package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f19106a = null;

    static {
        t2o.a(708837563);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1cf3a216", new Object[0]);
        }
        JSONObject jSONObject = f19106a;
        if (jSONObject != null) {
            return jSONObject;
        }
        String g = y8r.g(y8r.BUY_POP_QUERY, "{\"isTBBuyFloatMode\":\"true\",\"99tm\":\"true\",\"pageType\":\"float\"}");
        if (TextUtils.isEmpty(g)) {
            f19106a = null;
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(g);
            f19106a = parseObject;
            return parseObject;
        } catch (Exception unused) {
            f19106a = null;
            return null;
        }
    }

    public static Map<String, String> b(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e0ecd45", new Object[]{intent});
        }
        HashMap hashMap = null;
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str2 : a2.keySet()) {
                if (data == null) {
                    str = intent.getStringExtra(str2);
                } else {
                    str = data.getQueryParameter(str2);
                }
                if (str != null && str.equals(a2.getString(str2))) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public static JSONObject c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fdfd5321", new Object[]{intent});
        }
        if (intent == null) {
            q8r.a("EMPTY_INTENT_FORM_(getPopConfig)", "intent is empty");
            return null;
        }
        String stringExtra = intent.getStringExtra(h9.KEY_POP_CONFIG);
        Uri data = intent.getData();
        if (data != null && TextUtils.isEmpty(stringExtra)) {
            stringExtra = data.getQueryParameter(h9.KEY_POP_CONFIG);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = d(intent);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(stringExtra);
            if ("true".equals(parseObject.getString(yj4.PARAM_FORCE_FULL_SCREEN))) {
                parseObject.put("maxHeight", (Object) "1");
                parseObject.put(hij.KEY_CORNER_RADIUS, (Object) "0");
                parseObject.put("animation", (Object) "rightInOut");
            }
            return parseObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e31fcf", new Object[]{intent});
        }
        if (!"carts".equals(lql.d(intent)) || !"true".equals(y8r.g("enableNewStyle", "true"))) {
            return null;
        }
        return ko0.e();
    }

    public static boolean f(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b83a18", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        Uri data = intent.getData();
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str2 : a2.keySet()) {
                if (data == null) {
                    str = intent.getStringExtra(str2);
                } else {
                    str = data.getQueryParameter(str2);
                }
                if (str != null && str.equals(a2.getString(str2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de9b2b1e", new Object[]{activity})).booleanValue();
        }
        Intent h = hh.h(activity);
        JSONObject c = c(h);
        if (c != null && "carts".equals(lql.d(h))) {
            return "true".equals(c.getString(yj4.PARAM_FORCE_FULL_SCREEN)) || "1".equals(c.getString("maxHeight"));
        }
        return false;
    }
}
