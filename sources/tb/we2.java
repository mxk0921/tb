package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class we2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient String AD_VAL_MATCH_TYPE = "AD";

    /* renamed from: a  reason: collision with root package name */
    public static final String f30653a = "Page_Home";

    static {
        t2o.a(487587986);
    }

    public static void a(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2c2e77", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, b(str, jSONObject));
            if (i == 2101) {
                cqv.u(str, str2 + "_BehaviX_UT", null, null, hqv.s(jSONObject));
            }
        } catch (Exception unused) {
        }
    }

    public static String b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeb5dac2", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str2 : jSONObject.keySet()) {
            String string = jSONObject.getString(str2);
            if (!TextUtils.isEmpty(string)) {
                if (string.length() > 2048) {
                    TBS.Ext.commitEvent(str, 19999, "super_long_args", str2);
                }
                sb.append(str2);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
