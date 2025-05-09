package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750389);
    }

    public static void a(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93ff250", new Object[]{remoteBusiness});
            return;
        }
        Mtop mtopInstance = remoteBusiness.getMtopInstance();
        if (mtopInstance != null) {
            String multiAccountUserId = mtopInstance.getMultiAccountUserId("DEFAULT");
            String str = iaa.f21189a;
            if (TextUtils.isEmpty(multiAccountUserId) && !TextUtils.isEmpty(str) && v82.h("enableMTOPUserId", true)) {
                remoteBusiness.setReqUserId(str);
                TLog.loge("UCP", "UppMTopRequest", "change mtop userid");
            }
        }
        if (v82.h("enableMtopSession", true)) {
            remoteBusiness.showLoginUI(false);
        }
    }

    public static String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4120ace0", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "UNIT_TRADE";
        }
        return "UNIT_GUIDE";
    }
}
