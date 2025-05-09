package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i92 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699326);
    }

    public static boolean a(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ca0129a", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return true;
        }
        long e = urf.e(jSONObject, "showStartTime", -1L);
        long e2 = urf.e(jSONObject, "showEndTime", -1L);
        if (e2 <= 0) {
            return true;
        }
        return e <= 0 ? j <= e2 : e < j && j <= e2;
    }

    public static boolean b(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12cbd98b", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return true;
        }
        long e = urf.e(jSONObject, "startTime", -1L);
        long e2 = urf.e(jSONObject, "endTime", -1L);
        if (e2 <= 0) {
            return true;
        }
        return e <= 0 ? j <= e2 : e < j && j <= e2;
    }
}
