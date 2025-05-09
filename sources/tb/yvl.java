package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wp8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yvl implements wp8.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809723);
        t2o.a(329252915);
    }

    @Override // tb.wp8.b
    public String a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7d44af5", new Object[]{this, context, intent});
        }
        if (intent == null) {
            return String.valueOf(false);
        }
        return String.valueOf(b());
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e579c02", new Object[]{this})).booleanValue();
        }
        if (!f4b.b("paySuccessTscheduleEnable", true)) {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetchParser", "orange开关是关的");
            return false;
        }
        JSONObject a2 = xsl.a(z4a.REC_PAY_SUCCESS.f32522a);
        JSONObject jSONObject = a2 == null ? null : a2.getJSONObject(vls.OPTIMIZATION_CONFIG);
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return arm.OPTIMIZE_TYPE_PS_T_SCHEDULE.equals(jSONObject.getString("recmdRequestOptimizeType"));
        }
        uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetchParser", "recmdConfig == null || recmdConfig.isEmpty()");
        return false;
    }
}
