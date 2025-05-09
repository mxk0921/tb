package tb;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.TurboBoot;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hi2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f20659a = new AtomicBoolean(false);

    static {
        t2o.a(768606214);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[0]);
        } else {
            wzm.e();
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80c1b77", new Object[]{context})).intValue();
        }
        String str = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        return !(i <= 32 ? t.a(context, String.format(Locale.getDefault(), "pgo_strategy_co_%d_%s", Integer.valueOf(i), str.toLowerCase())) : true) ? 1 : 0;
    }

    public static void c(Application application, HashMap<String, Object> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda3d367", new Object[]{application, hashMap, str});
        } else if (f20659a.compareAndSet(false, true)) {
            vhh.a("Bootstrap", "boot for reason: " + str);
            if (!t.a(application, "launchTurbo")) {
                vhh.a("Bootstrap", "launchTurbo is closed");
                return;
            }
            vhh.a("Bootstrap", "launchTurbo is opened");
            String str2 = (String) hashMap.get("appVersion");
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                int i = packageInfo.versionCode;
                if (TextUtils.isEmpty(str2)) {
                    str2 = packageInfo.versionName;
                }
                boolean a2 = t.a(application, "invokedAsFinish");
                int a3 = a(application);
                vhh.a("Bootstrap", "policy: " + a3);
                new TurboBoot.b(application, str2, i).d(a3).c(3).b(a2).a().a();
            } catch (PackageManager.NameNotFoundException e) {
                vhh.b("Bootstrap", "error occurred when get package info", e);
            }
        }
    }
}
