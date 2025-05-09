package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DUMP_SUCCESS = "dump_success";
    public static final String MODULE_NAME = "CodeTrack";
    public static final String MODULE_POINT_DEXCOCO = "dexcoco";
    public static final String MODULE_POINT_EXCEPTION = "addException";
    public static final String NOT_DUMP_DISABLED = "dump_switched_off";
    public static final String NOT_DUMP_INVALID = "invalid_file";
    public static final String NOT_DUMP_RATE = "rate_not_matched";
    public static final String NOT_DUMP_TIRED = "report_too_frequently";
    public static final String NOT_DUMP_WIFI = "not_wifi";
    public static final String NOT_INIT_DISABLED = "init_switched_off";
    public static final String UPLOAD_FAIL = "upload_fail";
    public static final String UPLOAD_SUCCESS = "upload_success";

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fbc83c", new Object[]{str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("operation", str);
            hashMap.put("resName", str2);
            AppMonitor.Counter.commit(MODULE_NAME, "asset_hit", JSON.toJSONString(hashMap), 1.0d);
        } catch (Throwable th) {
            xq2.b("CodeTrack.AppMonitorUtil", "countAsset", th);
        }
    }
}
