package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t4i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912263160);
    }

    public static boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"callService".equalsIgnoreCase(str) || str2 == null || (parseObject = JSON.parseObject(str2)) == null || !parseObject.containsKey("phone")) {
            return false;
        }
        parseObject.getString("phone");
        return true;
    }
}
