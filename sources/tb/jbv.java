package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465606);
    }

    public static JSONObject a(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b18b8eb9", new Object[]{str, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(dXRuntimeContext == null || dXRuntimeContext.h() == null)) {
            jSONObject.put("context", (Object) dXRuntimeContext.h());
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("bizName", (Object) str);
        }
        return jSONObject;
    }

    public static String b(DXRuntimeContext dXRuntimeContext) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("626265c7", new Object[]{dXRuntimeContext});
        }
        try {
            d = dXRuntimeContext.s().c().d();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.isEmpty(d)) {
            return "";
        }
        if (d.equalsIgnoreCase("orderList")) {
            return "orderList";
        }
        if (d.equalsIgnoreCase(ae2.BizKeyOrderDetail)) {
            return ae2.BizKeyOrderDetail;
        }
        return "";
    }

    public static void c(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c1d21", new Object[]{str, dXRuntimeContext});
        } else {
            qbv.j().a(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER, b(dXRuntimeContext), a(str, dXRuntimeContext));
        }
    }
}
