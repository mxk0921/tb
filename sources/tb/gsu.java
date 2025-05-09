package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gsu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626495);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda43a3b", new Object[]{aVar});
        } else if (aVar != null) {
            try {
                Event L = aVar.L();
                String str = aVar.K().indexID;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prePopId", (Object) str);
                if (L == null || L.source != 5) {
                    jSONObject.put("prePopIdType", (Object) "PopLayer");
                } else {
                    jSONObject.put("prePopIdType", (Object) "PopHub");
                }
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
            } catch (Throwable th) {
                String R = a.R(aVar);
                wdm.c(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, R, "UCPTrackManager.addNextPageUtParam.error.t=" + th.getLocalizedMessage());
                qtv.t("UCPTrackManager.addNextPageUtParam.error.", th);
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a5f093", new Object[]{str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("prePopId", (Object) str);
            jSONObject.put("prePopIdType", (Object) "PopHub");
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        } catch (Throwable th) {
            wdm.c(wdm.CATEGORY_CONTAINER_LIFE_CYCLE, str, "UCPTrackManager.addNextPageUtParam.error.t=" + th.getLocalizedMessage());
            qtv.t("UCPTrackManager.addNextPageUtParam.error.", th);
        }
    }
}
