package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.ut.share.utils.FlowOutFacade;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y3r implements jpd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SystemShare";

    static {
        t2o.a(664797272);
        t2o.a(664797264);
    }

    public final void b(TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7ba158", new Object[]{this, tBShareContent, str});
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(Constants.SHARETYPE);
        FlowOutFacade.getInstance().startActivity(ShareBizAdapter.getInstance().getAppEnv().getTopActivity(), Intent.createChooser(intent, Localization.q(R.string.taobao_app_1010_1_18281)));
        TBS.Ext.commitEvent("Page_Share", 19999, "Popup", tBShareContent.businessId, null, "sysSharePanel=1");
    }

    @Override // tb.jpd
    public boolean a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        Map<String, String> map;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa241d0", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        if ("false".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "SysShareDisable", "true"))) {
            return false;
        }
        boolean equals = "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "ScreenShotUseSysShare", "false"));
        if (tBShareContent != null && tn1.m(tBShareContent.businessId) && equals) {
            rip ripVar = new rip();
            ripVar.c(tBShareContent);
            mi3 mi3Var = new mi3();
            mi3Var.e(TAG);
            mi3Var.d(ripVar);
            xjp.b().onEvent(mi3Var);
            return true;
        } else if (tBShareContent == null || (map = tBShareContent.extraParams) == null || !TextUtils.equals(map.get("sysSharePanel"), "true")) {
            return false;
        } else {
            if (tBShareContent.extraParams.get("sysShareText") == null) {
                str2 = "";
            } else {
                str2 = tBShareContent.extraParams.get("sysShareText");
            }
            if (!TextUtils.isEmpty(tBShareContent.extraParams.get("sysShareTarget"))) {
                str2 = str2 + tBShareContent.extraParams.get("sysShareTarget");
            }
            b(tBShareContent, str2);
            return true;
        }
    }
}
