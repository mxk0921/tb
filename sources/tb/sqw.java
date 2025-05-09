package tb;

import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class sqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856195);
    }

    public static void a(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9db603", new Object[]{str, str2, str3, str4, hashMap});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.f29301a = str;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        ud2Var.j = jSONObject.toString();
        ud2Var.d = str2;
        ud2Var.f = str3;
        ud2Var.g = str4;
        vd2.a().c(yaa.n, ud2Var);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8743bce", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.d = str2;
        ud2Var.f29301a = str;
        ud2Var.j = str3;
        if (str4 == null) {
            ud2Var.f = "Script error";
        } else {
            ud2Var.f = str4;
        }
        ud2Var.g = "line: " + str5;
        ud2Var.h = str6;
        vd2.a().c(yaa.n, ud2Var);
    }
}
