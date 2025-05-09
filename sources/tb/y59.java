package tb;

import anet.channel.util.ALog;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5448a4b", new Object[0])).booleanValue();
        }
        try {
            tx8 tx8Var = new tx8();
            tx8Var.e(AmnetMonitorLoggerListener.LogModel.ERR_CODE, -999);
            nzb.b().c("network_diagnosis", tx8Var);
            return true;
        } catch (Throwable th) {
            ALog.e("FeedbackUtils", "sceneTrigger failed !", null, th, new Object[0]);
            return false;
        }
    }
}
