package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809159);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a26447", new Object[]{str});
            return;
        }
        List<JSONObject> f = e0p.f();
        for (int i = 0; i < f.size(); i++) {
            JSONObject jSONObject = f.get(i).getJSONObject("content");
            if (jSONObject != null) {
                boolean booleanValue = jSONObject.getBooleanValue("refreshSearchText");
                String string = jSONObject.getString("type");
                if (booleanValue && TextUtils.equals(string, str)) {
                    yyj.e().F();
                    return;
                }
            }
        }
    }
}
