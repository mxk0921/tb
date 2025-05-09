package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539396);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1611ab79", new Object[]{str});
        }
        if ("once".equals(str)) {
            return ICacheReqBizParamsService.SaveMode.DISK_AUTO_ERASED;
        }
        return ICacheReqBizParamsService.SaveMode.DISK_NOT_ERASED;
    }
}
