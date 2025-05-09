package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nqr implements rtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addOrderIdToFatigueParam";

    static {
        t2o.a(745538132);
        t2o.a(157286534);
    }

    @Override // tb.rtd
    public void c(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797ded1", new Object[]{this, b8vVar});
            return;
        }
        Object f = b8vVar.f();
        if (f instanceof JSONObject) {
            try {
                sb7.b(Login.getUserId()).a(((JSONObject) f).getJSONObject("fields").getString("id"));
            } catch (Exception e) {
                TLog.loge("TBMyTaobaoAddOrderFatigueSubscriber", Log.getStackTraceString(e));
            }
        }
    }
}
