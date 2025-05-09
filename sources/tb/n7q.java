package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n7q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782657);
    }

    public static void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b586f7", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isRealSmartRefreshFlag", (Object) Boolean.valueOf(z2));
        jSONObject.put("enableSearchBackRefresh", (Object) Boolean.valueOf(z));
        uve.a("Page_Home", 19997, "smart_refresh_scroll_rate", "page_back_number", "", jSONObject.toString());
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed66cc86", new Object[]{new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isRealSmartRefreshFlag", (Object) Boolean.valueOf(z));
        uve.a("Page_Home", 19997, "smart_refresh_scroll_rate", "slide_downward_number", null, jSONObject.toString());
    }
}
