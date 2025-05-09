package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.extra.performance2.WVPageTrackerAPI;
import android.taobao.windvane.jsbridge.api.WVCamera;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBJsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855946);
    }

    public static void initJsApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8784e8", new Object[0]);
            return;
        }
        WVCamera.registerUploadService(TBUploadService.class);
        fsw.h("WVApplication", WVApplication.class);
        fsw.h("WVReporter", WVReporterExtra.class);
        fsw.h("WVPageTracker", WVPageTrackerAPI.class);
    }
}
