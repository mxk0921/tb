package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class me2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(734003248);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c71e1f", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.f29301a = "TEMP_USER_GROWTH_AUTHORIZE_EVENT";
        HashMap hashMap = new HashMap();
        hashMap.put("PageName", str);
        hashMap.put("Dialog", str2);
        hashMap.put("Action", str3);
        if (str4 != null) {
            hashMap.put("Property", str4);
        }
        if (str5 != null) {
            hashMap.put("Plan", str5);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(hashMap);
        ud2Var.d = jSONObject.toJSONString();
        vd2.a().c(context.getApplicationContext(), ud2Var);
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0ade01", new Object[]{context, str, str2, str3});
        } else {
            a(context, str, str2, str3, null, null);
        }
    }
}
