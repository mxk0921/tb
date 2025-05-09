package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286735);
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb3f7dc", new Object[]{str, context});
        } else if ("mytaobao".equals(str)) {
            hav.d("UltronPageDestroy", "mytaobao");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) ((Application) context.getApplicationContext()));
            qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "mytaobao", jSONObject);
        }
    }
}
