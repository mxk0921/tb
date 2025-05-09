package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.alibaba.security.realidentity.e2;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626327);
    }

    public static Intent b(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("658e4ff2", new Object[]{context, file});
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            Uri uriForFile = FileProvider.getUriForFile(context, "com.taobao.taobao.update.provider", file);
            intent.addFlags(1);
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        } else {
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        return intent;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3d1ad4", new Object[]{context});
            return;
        }
        try {
            if (lz4.i().c()) {
                boolean a2 = dss.a(context);
                HashMap hashMap = new HashMap();
                hashMap.put("floatPermission", String.valueOf(a2));
                int i = Build.VERSION.SDK_INT;
                hashMap.put("systemLevel", String.valueOf(i));
                hashMap.put("brand", String.valueOf(Build.BRAND));
                hashMap.put("model", String.valueOf(Build.MODEL));
                hashMap.put("userId", String.valueOf(Login.getUserId()));
                hashMap.put("utdid", String.valueOf(UTDevice.getUtdid(context)));
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ApkUpdate", 19999, "floatPermission", String.valueOf(a2), String.valueOf(i), hashMap).build());
            }
        } catch (Throwable th) {
            wdm.h("floatWindowPermissionCheck", th);
        }
    }

    public static String e(String str, String str2) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5058f6b", new Object[]{str, str2});
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (variation = UTABTest.activate("ApkUpdater", str).getVariation(str2)) != null) {
                return variation.getValueAsString("");
            }
        } catch (Throwable th) {
            wdm.h("ApkUpdateUtils.getABValue.error.", th);
        }
        return "";
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1516638f", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38ecf72e", new Object[]{str})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.matches("[0-9]+(\\.[0-9]+){2}")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf5c25fb", new Object[]{str, str2})).intValue();
        }
        try {
            int a2 = new b3w(str).compareTo(new b3w(str2));
            wdm.d("AppVersionUtils.versionCompare.newVersion=%s.curVersion=%s.Result=%s", str, str2, Integer.valueOf(a2));
            return a2;
        } catch (Throwable th) {
            wdm.h("AppVersionUtils.versionCompare.error.", th);
            return e2.f2684a;
        }
    }

    public static boolean a(Application application) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfc85358", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        String packageName = application.getPackageName();
        boolean d = lz4.i().d();
        if (!TextUtils.isEmpty(packageName)) {
            List<ResolveInfo> queryIntentActivities = application.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)), 65536);
            if (queryIntentActivities != null) {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if ((activityInfo.applicationInfo.flags & 1) != 0) {
                        if (d && "com.android.vending".equals(activityInfo.packageName)) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                }
                wdm.d("ApkUpdateUtils.checkMarket.hasValidMarket=%s.hasGPMarket=%s", Boolean.valueOf(z2), Boolean.valueOf(z));
                return z2 && !z;
            }
        }
        z = false;
        z2 = false;
        wdm.d("ApkUpdateUtils.checkMarket.hasValidMarket=%s.hasGPMarket=%s", Boolean.valueOf(z2), Boolean.valueOf(z));
        if (z2) {
            return false;
        }
    }

    public static boolean c(Context context) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a271ae9", new Object[]{context})).booleanValue();
        }
        try {
            if ("vivo".equals(Build.BRAND.toLowerCase()) && (packageInfo = context.getPackageManager().getPackageInfo("com.bbk.appstore", 0)) != null) {
                return packageInfo.versionCode >= 3100;
            }
        } catch (Throwable th) {
            wdm.h("enableJumpStoreVIVO.error", th);
        }
        return false;
    }

    public static boolean g(Application application) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db2b684c", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        if (application.getResources() != null) {
            String string = application.getResources().getString(application.getResources().getIdentifier("ttid", "string", application.getPackageName()));
            wdm.d("ApkUpdateUtils.isGPChannel.ttid=%s", string);
            z = "212200".equals(string);
        } else {
            z = false;
        }
        boolean equalsIgnoreCase = "google".equalsIgnoreCase(Build.BRAND);
        wdm.d("ApkUpdateUtils.isGPChannel.isGPTTID=%s.isGPDevice=%s", Boolean.valueOf(z), Boolean.valueOf(equalsIgnoreCase));
        return z || equalsIgnoreCase;
    }
}
