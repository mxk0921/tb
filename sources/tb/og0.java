package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.taobao.exp.TMSSimpleLaunchSwitch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class og0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("964d51c0", new Object[]{context, fxpVar})).booleanValue();
        }
        if (b(context, fxpVar) || c(context, fxpVar)) {
            return true;
        }
        return false;
    }

    public static void d(Activity activity, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7e74ce", new Object[]{activity, new Boolean(z)});
            return;
        }
        Intent intent = activity.getIntent();
        if (!z) {
            str = intent.getStringExtra(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL);
        } else {
            str = BootstrapMode.c(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL_H5);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.setData(Uri.parse(str));
        }
    }

    public static void f(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b85b85", new Object[]{activity});
        } else if ((BootstrapMode.d(131072) || BootstrapMode.d(4)) && (intent = activity.getIntent()) != null) {
            intent.removeExtra(bqg.EXTRA_LINK_COLD_START);
        }
    }

    public static void g() {
        xhq c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5821918a", new Object[0]);
        } else if (BootstrapMode.d(131072) && (c = ppo.b().c()) != null) {
            LauncherRuntime.n = true;
            String c2 = BootstrapMode.c(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL_H5);
            Intent intent = c.e;
            intent.putExtra(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL, intent.getDataString()).putExtra("cold_startup_h5", true).setData(Uri.parse(c2));
        }
    }

    public static boolean c(Context context, fxp fxpVar) {
        LinkRule q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3812f364", new Object[]{context, fxpVar})).booleanValue();
        }
        if (fxpVar == null || (q = wrg.q(context, fxpVar.b)) == null || !TextUtils.equals(q.name, TMSCalendarBridge.namespace)) {
            return false;
        }
        boolean d = TMSSimpleLaunchSwitch.d(context, fxpVar.b.getDataString());
        if (d) {
            BootstrapMode.i(4);
        }
        return d;
    }

    public static boolean b(Context context, fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35116996", new Object[]{context, fxpVar})).booleanValue();
        }
        if (!t.a(context, "ngAfcHomeV2") || fxpVar == null) {
            return false;
        }
        String g = bqg.g(fxpVar.b.getData());
        if (TextUtils.isEmpty(g) || !e(Uri.parse(g))) {
            return false;
        }
        BootstrapMode.f(BootstrapMode.EXTRA_KEY_INTENT_DATA_AFC_URL_H5, g);
        BootstrapMode.i(131072);
        return true;
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("962e343a", new Object[]{uri})).booleanValue();
        }
        return qqg.a(uri) && TextUtils.equals("recmd", uri.getQueryParameter("scrollto"));
    }
}
