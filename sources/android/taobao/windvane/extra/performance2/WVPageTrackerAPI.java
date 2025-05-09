package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPageTrackerAPI extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856012);
    }

    public static /* synthetic */ Object ipc$super(WVPageTrackerAPI wVPageTrackerAPI, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/performance2/WVPageTrackerAPI");
    }

    public void reportPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd613f8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        if (this.performance == null) {
            nswVar.j("HY_FAILED");
            nswVar.b("msg", "performance object does not exist");
            wVCallBackContext.error(nswVar);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.performance.receiveJSMessageForCustomizedFSP(jSONObject.optLong("firstScreenPaint"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("otherPerformanceStage");
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.performance.receiveJSMessageForCustomizedStage(jSONObject2.optLong(next), next);
                }
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            nswVar.j("HY_FAILED");
            nswVar.b("msg", "exception: " + e.getMessage());
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!str.equals("reportPerformanceInfo")) {
            return false;
        }
        reportPerformanceInfo(str2, wVCallBackContext);
        return true;
    }
}
