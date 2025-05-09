package tb;

import android.text.TextUtils;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ur3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001733);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59deb1a8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "result is empty";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("status");
            if (optJSONObject == null) {
                return "数据解析失败";
            }
            if (!optJSONObject.optString("code").equals("ok")) {
                return "网络请求失败";
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("deviceService");
            if (!optJSONObject2.optBoolean("result")) {
                return "设备未注册";
            }
            if (b(optJSONObject2.optString("resultSign"))) {
                return "success";
            }
            return "安全校验失败";
        } catch (Exception unused) {
            return ExceptionUtils.ERROR_MSG_DATA_ERROR;
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("909d123d", new Object[]{str})).booleanValue();
        }
        return str.equals(e4p.a(e4p.a("CHITU_FLY_WITH_YOU") + UTDevice.getUtdid(j3p.f())));
    }
}
