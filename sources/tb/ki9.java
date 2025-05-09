package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ki9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539764);
    }

    public static void a(Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881ede0a", new Object[]{map, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("nextPageUtBlackListKeys");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split(",")) {
                    map.remove(str);
                }
            }
        }
    }
}
