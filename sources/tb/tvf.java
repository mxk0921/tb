package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(495976453);
    }

    public static String a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31b4de5a", new Object[]{str, new Integer(i), str2});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("subCode", (Object) Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("errorCode", (Object) str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("errorMsg", (Object) str2);
            }
            return jSONObject.toJSONString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str + "|" + str2;
        }
    }
}
