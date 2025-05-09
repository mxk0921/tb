package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f30001a;
    public static PackageInfo b;

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        return f30001a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("443d6b75", new Object[0]);
        }
        if (f30001a == null || e() == null) {
            return null;
        }
        return e().applicationInfo.loadIcon(f30001a.getPackageManager()).toString();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e63f7d0", new Object[0]);
        }
        if (f30001a == null || e() == null) {
            return null;
        }
        return e().applicationInfo.loadLabel(f30001a.getPackageManager()).toString();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2e48ed1", new Object[0]);
        }
        if (f30001a == null || g() == -1) {
            return null;
        }
        return f30001a.getPackageManager().getNameForUid(g());
    }

    public static PackageInfo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[0]);
        }
        PackageInfo packageInfo = b;
        if (packageInfo != null) {
            return packageInfo;
        }
        Context context = f30001a;
        if (context == null) {
            return null;
        }
        try {
            b = context.getPackageManager().getPackageInfo(f30001a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return b;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f1b3b58", new Object[0]);
        }
        Context context = f30001a;
        if (context != null) {
            return context.getPackageName();
        }
        return null;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbcae154", new Object[0])).intValue();
        }
        Context context = f30001a;
        if (context != null) {
            return context.getApplicationInfo().uid;
        }
        return -1;
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446eaa", new Object[0])).longValue();
        }
        if (e() != null) {
            return e().versionCode;
        }
        return -1L;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (e() != null) {
            return e().versionName;
        }
        return null;
    }
}
