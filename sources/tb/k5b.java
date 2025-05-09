package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.a;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k5b implements gjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809278);
    }

    @Override // tb.gjo
    public void a(Context context, List<String> list, List<String> list2, qzl qzlVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f054fa", new Object[]{this, context, list, list2, qzlVar});
        } else if (context != null && TextUtils.equals(context.getPackageName(), "com.taobao.taobao")) {
            if (list == null || qzlVar == null) {
                StringBuilder sb = new StringBuilder("HomepageRuntimePermissionListener sysReqPermissions check：");
                if (list == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                sb.append(",permissionResult check: ");
                if (qzlVar != null) {
                    z2 = false;
                }
                sb.append(z2);
                bqa.d(p78.KEY, sb.toString());
                return;
            }
            for (String str : list) {
                if (TextUtils.equals(str, p78.ACCESS_FINE_LOCATION)) {
                    z3 = p78.b(qzlVar);
                }
            }
            if (z3) {
                bqa.d(p78.KEY, "HomepageRuntimePermissionListener needReqBasicLBSPermission basicLBSTask.execute");
                a.C0649a c = a.c(context, new String[]{p78.ACCESS_FINE_LOCATION});
                c.w(Localization.q(R.string.taobao_app_1000_1_16157) + Localization.q(R.string.taobao_app_1000_1_16161) + Localization.q(R.string.taobao_app_1000_1_16149));
                c.x(true);
                c.B(true);
                c.t("TB_SHOPPING_PROCESS");
                c.m();
            }
        }
    }
}
