package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vm1 extends cht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488997);
    }

    public static /* synthetic */ Object ipc$super(vm1 vm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/nav/BNavController");
    }

    @Override // tb.cht
    public boolean b(Context context, qg0 qg0Var, String str, Bundle bundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72f2abcd", new Object[]{this, context, qg0Var, str, bundle})).booleanValue();
        }
        if (TextUtils.equals(qg0Var.e, "h5")) {
            if (qg0.c(bundle)) {
                bundle.putBoolean("afc_nav_merge", true);
            }
            if (qqg.a(Uri.parse(str))) {
                vp9.a("linkx", "TbNavCenter === B方案，跳首页");
                z = Nav.from(context).withExtras(bundle).withFlags(65536).disableTransition().toUri(str);
            } else {
                vp9.a("linkx", "TbNavCenter === B方案，跳其他页面");
                z = Nav.from(context).withExtras(bundle).withFlags(4259840).disableTransition().toUri(str);
            }
            if (z) {
                return z;
            }
            if (bundle != null) {
                bundle.remove("cold_startup_h5");
            }
            return Nav.from(context).withExtras(bundle).withFlags(65536).disableTransition().withCategory("com.taobao.intent.category.HYBRID_UI").toUri(str);
        }
        if (bundle != null) {
            bundle.remove("cold_startup_h5");
        }
        return Nav.from(context).withExtras(bundle).toUri(str);
    }
}
