package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class to2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782852);
    }

    public static String a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7763c39d", new Object[]{new Long(j), str, str2});
        }
        String str3 = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                fve.e(str2, "getBehaviorFeature startTime : " + j);
                BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
                queryArgs.setStartTime(j);
                str3 = BUFS.getFeature(queryArgs, str, "PageHome", "Page_Home");
            } catch (InfoFlowRuntimeException e) {
                fve.c(str2, "getBehaviorFeature error, 调度 bx 出现 crash 被捕获", e);
            }
            fve.e(str2, "behaviorFeature : " + str3);
        }
        return str3;
    }
}
