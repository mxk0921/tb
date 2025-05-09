package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import tb.qv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750754);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb924a67", new Object[0])).booleanValue();
        }
        return qv6.b.d();
    }

    public static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8227dbd2", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            qv6.b.h(str, false);
            NativeBroadcast.sendMessageFromJava("preview", parseObject, null);
            wVCallBackContext.success();
            return true;
        } catch (JSONException unused) {
            wVCallBackContext.error();
            return false;
        }
    }
}
