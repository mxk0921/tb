package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.business.requests.ReportRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u2o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_CLICK = "click";
    public static final String SCENE_EXPOSURE = "exposure";

    static {
        t2o.a(295699643);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8778a5", new Object[]{str, str2});
            return;
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.scene = str;
        reportRequest.reportInfo = str2;
        new k4l().M(reportRequest, null);
    }
}
