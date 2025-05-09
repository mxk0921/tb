package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v7j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_SKU_NEW_MTOP = "enableSkuNewMtop";

    static {
        t2o.a(785383559);
    }

    public static void b(Context context, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb0f44", new Object[]{context, jSONObject, str});
        } else if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("feature")) != null && !jSONObject2.isEmpty()) {
            String str2 = KEY_ENABLE_SKU_NEW_MTOP;
            String string = jSONObject2.getString(str2);
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str2 + str;
                }
                zjp.c(context, str2, string);
            }
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e0e011d", new Object[]{context, str})).booleanValue();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = KEY_ENABLE_SKU_NEW_MTOP;
        if (!isEmpty) {
            str2 = str2 + str;
        }
        String b = zjp.b(context, str2);
        return "true".equals(b) || TextUtils.isEmpty(b);
    }
}
