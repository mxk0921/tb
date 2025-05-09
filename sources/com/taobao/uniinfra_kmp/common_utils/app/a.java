package com.taobao.uniinfra_kmp.common_utils.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f14082a;

    static {
        t2o.a(1029701683);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[0]);
        }
        Application application = Globals.getApplication();
        ckf.d(application);
        Context baseContext = application.getBaseContext();
        ckf.d(baseContext);
        return baseContext.getPackageName();
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        String str = f14082a;
        if (str != null) {
            return str;
        }
        try {
            Application application = Globals.getApplication();
            ckf.d(application);
            Context baseContext = application.getBaseContext();
            ckf.d(baseContext);
            PackageManager packageManager = baseContext.getPackageManager();
            Application application2 = Globals.getApplication();
            ckf.d(application2);
            Context baseContext2 = application2.getBaseContext();
            ckf.d(baseContext2);
            PackageInfo packageInfo = packageManager.getPackageInfo(baseContext2.getPackageName(), 0);
            ckf.f(packageInfo, "getPackageInfo(...)");
            String str2 = packageInfo.versionName.toString();
            f14082a = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[0]);
        }
        return Build.MODEL;
    }

    public static final OSType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OSType) ipChange.ipc$dispatch("740941fb", new Object[0]);
        }
        return OSType.ANDROID;
    }

    public static final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a69c45", new Object[0]);
        }
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        Application application = Globals.getApplication();
        ckf.d(application);
        return UTDevice.getUtdid(application.getBaseContext());
    }

    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        Application application = Globals.getApplication();
        ckf.d(application);
        Context baseContext = application.getBaseContext();
        ckf.d(baseContext);
        if ((baseContext.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }
}
