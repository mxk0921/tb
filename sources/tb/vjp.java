package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.share.utils.FlowOutFacade;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845945);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e4f68", new Object[]{context, str});
        } else if (okp.a(context, "com.tencent.mm")) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setFlags(268435456);
            try {
                FlowOutFacade.getInstance().startActivity(context, intent);
                TBS.Ext.commitEvent("Page_Extend", 5002, "shareWeChatFreinds", (Object) null, "openResult=ok");
            } catch (Exception e) {
                e.printStackTrace();
                TBS.Ext.commitEvent("Page_Extend", 5002, "shareWeChatFreinds", null, null, "openResult=failed&errorMsg=" + e.getMessage());
            }
        } else {
            Toast.makeText(context, Localization.q(R.string.taobao_app_1010_1_18109), 1).show();
        }
    }
}
