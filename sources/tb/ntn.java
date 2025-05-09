package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ntn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24944a = "1";
    public static final String b = "0";

    static {
        t2o.a(944767063);
    }

    public static void a(Context context, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d928d51", new Object[]{context, jSONObject, str, str2});
            return;
        }
        String n = qrf.n(b, jSONObject, "redirect");
        String n2 = qrf.n("", jSONObject, "redirect_url");
        if (TextUtils.equals(f24944a, n) && !TextUtils.isEmpty(n2)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("selectedContentIds", (Object) str);
            jSONObject2.put("publishTaskId", (Object) str2);
            Nav.from(context).toUri(knv.c(n2, jSONObject2));
        }
    }
}
