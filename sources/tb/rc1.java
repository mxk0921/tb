package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rc1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Object> f27273a = new HashMap<>();

    static {
        t2o.a(817889306);
    }

    public static String a(String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aaf3847", new Object[]{str, str2, str3, str4});
        }
        String str6 = str + "." + str2 + "." + str3;
        Object obj = f27273a.get(str6);
        if (obj == null) {
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null) {
                JSONObject jSONObject = new JSONObject();
                Variation variation = activate.getVariation(str3);
                if (variation == null && activate.size() > 0) {
                    for (Variation variation2 : activate) {
                        if (variation2 != null) {
                            jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                        }
                    }
                    str5 = jSONObject.toJSONString();
                } else if (variation == null || TextUtils.isEmpty(variation.getValueAsString(""))) {
                    str5 = str4;
                } else {
                    str5 = variation.getValueAsString("");
                }
                obj = str5;
            } else {
                obj = str4;
            }
            f27273a.put(str6, obj);
        }
        return zc1.c(obj, str4);
    }
}
