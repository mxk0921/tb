package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class scv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27959a;
    public static Boolean b = null;

    static {
        t2o.a(83886366);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        String str = f27959a;
        if (str != null) {
            return str;
        }
        try {
            Application application = Globals.getApplication();
            if (application == null) {
                return "";
            }
            String str2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            f27959a = str2;
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception e) {
            f9v.q(xh8.a("Ultron").c("getAppVersionException").message(e.getMessage()));
            return "";
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (a().split("\\.").length > vav.e("Ultron", "taobaoAppReleaseVersionLength", 3)) {
                z = true;
            }
            b = Boolean.valueOf(z);
        } catch (Exception unused) {
            b = Boolean.FALSE;
        }
        return b.booleanValue();
    }
}
