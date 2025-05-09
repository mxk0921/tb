package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.ut.device.UTDevice;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class th7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static gi7 f28718a = null;

    static {
        t2o.a(962592870);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafe7c1a", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("Alvin3", 0);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("UTCommon", 0);
        if (sharedPreferences2 != null && sharedPreferences != null) {
            String string = sharedPreferences.getString("EI", null);
            String string2 = sharedPreferences.getString("SI", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                String string3 = sharedPreferences2.getString("EI", null);
                String string4 = sharedPreferences2.getString("SI", null);
                if (!string.equals(string3)) {
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.putString("EI", string);
                    edit.commit();
                }
                if (!string2.equals(string4)) {
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.putString("SI", string2);
                    edit2.commit();
                }
            }
        }
    }

    public static gi7 b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gi7) ipChange.ipc$dispatch("79a60e1", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        gi7 d = d(context);
        d.t(UTDevice.getUtdid(context));
        if (hsq.f(d.b())) {
            d.k(v1m.a(context));
        }
        if (hsq.f(d.c())) {
            d.l(v1m.b(context));
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.gi7 d(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.th7.d(android.content.Context):tb.gi7");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a12dbb86", new Object[0])).booleanValue();
        }
        String property = System.getProperty("java.vm.name");
        return (property != null && property.toLowerCase().contains("lemur")) || System.getProperty("ro.yunos.version") != null;
    }

    public static void f(Context context, String str, String str2) {
        k0m b;
        String str3;
        UnsupportedEncodingException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed957615", new Object[]{context, str, str2});
        } else if (context != null && !hsq.f(str) && !hsq.f(str2) && (b = lta.b(context)) != null) {
            String str4 = null;
            try {
                str3 = hq1.i(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                str3 = null;
            }
            try {
                str4 = hq1.i(str2.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e3) {
                e = e3;
                e.printStackTrace();
                if (!hsq.f(str3)) {
                    return;
                }
            }
            if (!hsq.f(str3) && !hsq.f(str4)) {
                b.d("EI", str3);
                b.d("SI", str4);
                b.a();
            }
        }
    }

    public static synchronized gi7 c(Context context) {
        synchronized (th7.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gi7) ipChange.ipc$dispatch("e481d0b9", new Object[]{context});
            }
            gi7 gi7Var = f28718a;
            if (gi7Var != null) {
                return gi7Var;
            }
            if (context == null) {
                return null;
            }
            gi7 b = b(context);
            if (b != null) {
                try {
                    b.j(Build.MODEL);
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        String str = packageInfo.versionName;
                        b.u(String.valueOf(packageInfo.versionCode));
                        b.f(str);
                    } catch (Exception unused) {
                        b.u("Unknown");
                        b.f("Unknown");
                    }
                    b.g(Build.BRAND);
                    b.n(TimeCalculator.PLATFORM_ANDROID);
                    if (e()) {
                        b.n("aliyunos");
                    }
                    b.o(Build.VERSION.RELEASE);
                    Configuration configuration = new Configuration();
                    Settings.System.getConfiguration(context.getContentResolver(), configuration);
                    Locale locale = configuration.locale;
                    if (locale != null) {
                        b.h(locale.getCountry());
                        b.m(configuration.locale.toString());
                        Calendar instance = Calendar.getInstance(configuration.locale);
                        if (instance != null) {
                            TimeZone timeZone = instance.getTimeZone();
                            if (timeZone != null) {
                                b.s("" + (timeZone.getRawOffset() / 3600000));
                            } else {
                                b.s("8");
                            }
                        } else {
                            b.s("8");
                        }
                    } else {
                        b.h("Unknown");
                        b.m("Unknown");
                        b.s("8");
                    }
                    try {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
                        int i = displayMetrics.widthPixels;
                        int i2 = displayMetrics.heightPixels;
                        b.r(i);
                        b.q(i2);
                        if (i > i2) {
                            int i3 = i ^ i2;
                            i2 ^= i3;
                            i = i3 ^ i2;
                        }
                        b.p(i2 + "*" + i);
                    } catch (Exception unused2) {
                        b.p("Unknown");
                    }
                    b.d(NetworkUtil.c(context));
                    b.e(NetworkUtil.c(context));
                } catch (Exception unused3) {
                    return null;
                }
            }
            f28718a = b;
            return b;
        }
    }
}
