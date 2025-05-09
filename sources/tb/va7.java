package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.e;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class va7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601f283c", new Object[]{context})).booleanValue();
        }
        fxp j = fxp.j();
        int g = fxp.g(j);
        if ((g != 0 && g != 1) || !sto.b()) {
            return false;
        }
        if (g != 1) {
            return og0.a(context, j);
        }
        BootstrapMode.i(262144);
        return true;
    }

    public static r41 b(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r41) ipChange.ipc$dispatch("9883f7d4", new Object[]{application, b8lVar});
        }
        BootstrapMode.g(application);
        if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            return new c8t();
        }
        if (!b2n.e(application)) {
            return new b8t();
        }
        if (!f(application)) {
            return d(application);
        }
        if (BootstrapMode.p()) {
            BootstrapMode.i(4096);
        }
        return new c8t();
    }

    public static r41 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r41) ipChange.ipc$dispatch("92d45b0c", new Object[0]);
        }
        return new rx6();
    }

    public static r41 d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r41) ipChange.ipc$dispatch("62d1e618", new Object[]{context});
        }
        if (!BootstrapMode.p()) {
            return new e();
        }
        if (!a(context)) {
            return new e();
        }
        whh.a("Delegates", "using TaoNGAppDelegate");
        BootstrapMode.i(8);
        og0.g();
        return new f();
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b030e89", new Object[0]);
        } else {
            UTDevice.setCollectDelayTime(60000L);
        }
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dc7b494", new Object[]{context})).booleanValue();
        }
        whh.a("Delegates", "usingNGNextApp: (SDK_INT=" + Build.VERSION.SDK_INT + ", CODENAME=" + Build.VERSION.CODENAME + f7l.BRACKET_END_STR);
        if (ra.g() || !BootstrapMode.p() || !a(context)) {
            return true;
        }
        whh.a("Delegates", "using NGAppDelegate due to ScheduleComposerFactory is available");
        return false;
    }
}
