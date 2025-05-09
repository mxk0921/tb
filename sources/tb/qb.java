package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.tao.welcome.HostController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qb extends cht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488996);
    }

    public static /* synthetic */ Object ipc$super(qb qbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/nav/ANavController");
    }

    public final Uri c(Context context, Bundle bundle, boolean z, qg0 qg0Var, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("555f4f48", new Object[]{this, context, bundle, new Boolean(z), qg0Var, str});
        }
        if (!qg0.c(bundle)) {
            return Uri.parse(str);
        }
        if (z) {
            str2 = "afc_nav_merge";
        } else {
            str2 = "afc_nav_native";
        }
        bundle.putBoolean(str2, true);
        Uri.Builder appendQueryParameter = Uri.parse(qg0Var.n).buildUpon().clearQuery().appendQueryParameter("h5Url", str);
        try {
            Uri parse = Uri.parse(str);
            for (String str3 : parse.getQueryParameterNames()) {
                appendQueryParameter.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        } catch (Throwable unused) {
        }
        Uri build = appendQueryParameter.build();
        d(build, str, str2);
        return build;
    }

    public final void d(Uri uri, String str, String str2) {
        xhq d;
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed42af79", new Object[]{this, uri, str, str2});
            return;
        }
        LinkRule c = yrg.c();
        if ((c == null || c.nonModule) && (d = LauncherRuntime.d()) != null && (intent = d.e) != null) {
            intent.putExtra(str2, true);
            if (c == null || !c.nonModule) {
                d.e.setData(uri);
            } else if (!TextUtils.isEmpty(str)) {
                d.e.setData(Uri.parse(str));
            } else {
                d.e.setData(null);
            }
        }
    }

    @Override // tb.cht
    public boolean b(Context context, qg0 qg0Var, String str, Bundle bundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72f2abcd", new Object[]{this, context, qg0Var, str, bundle})).booleanValue();
        }
        bundle.putBoolean(HostController.KEY_EXTRA_BROADCAST_MODE, true);
        Bundle bundle2 = new Bundle(bundle);
        if (TextUtils.equals(qg0Var.e, "h5")) {
            if (qqg.a(Uri.parse(str))) {
                vp9.a("linkx", "TbNavCenter === A方案，跳转首页");
                z = Nav.from(context).withExtras(bundle2).withFlags(65536).disableTransition().toUri(str);
            } else {
                vp9.a("linkx", "TbNavCenter === A方案，跳其他页面");
                z = Nav.from(context).withExtras(bundle).withFlags(4259840).disableTransition().toUri(c(context, bundle, true, qg0Var, str));
            }
            if (z) {
                return z;
            }
            bundle2.remove("cold_startup_h5");
            return Nav.from(context).withExtras(bundle2).withFlags(65536).disableTransition().withCategory("com.taobao.intent.category.HYBRID_UI").toUri(str);
        }
        bundle.remove("cold_startup_h5");
        return Nav.from(context).withExtras(bundle).toUri(str);
    }
}
