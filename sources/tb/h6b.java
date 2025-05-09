package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h6b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810008);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e503f2a2", new Object[]{str, str2, str3});
        }
        imn d = zza.d(str);
        if (d == null) {
            return str3;
        }
        AwesomeGetContainerData u = d.u(str);
        if (u == null) {
            return str3;
        }
        JSONObject ext = u.getExt();
        if (ext == null) {
            return str3;
        }
        JSONObject jSONObject = ext.getJSONObject("hotEffectConfig");
        if (jSONObject == null) {
            return str3;
        }
        if (!jSONObject.containsKey(str2)) {
            return str3;
        }
        return jSONObject.getString(str2);
    }
}
