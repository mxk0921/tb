package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587984);
        new HashSet();
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79b3398", new Object[]{jSONObject});
        } else if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("monitorCard"))) {
            new HashSet(1).add("home_0_guess_0");
        } else {
            new HashSet(Arrays.asList(jSONObject.getString("monitorCard").split(",")));
        }
    }
}
