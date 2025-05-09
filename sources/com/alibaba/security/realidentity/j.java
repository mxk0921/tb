package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2745a = "PackageUtils";

    public static String a(Context context) {
        PackageManager packageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        PackageInfo packageInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Exception e) {
            if (a.a()) {
                a.a(f2745a, e);
            }
        }
        if (packageManager == null) {
            return null;
        }
        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r4) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.security.realidentity.j.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "31400281"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r3)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: Exception -> 0x0028
            if (r2 != 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r4 = r4.getPackageName()     // Catch: Exception -> 0x0026
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r4, r0)     // Catch: Exception -> 0x0026
            goto L_0x0035
        L_0x0026:
            r4 = move-exception
            goto L_0x002a
        L_0x0028:
            r4 = move-exception
            r2 = r1
        L_0x002a:
            boolean r0 = com.alibaba.security.realidentity.a.a()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "PackageUtils"
            com.alibaba.security.realidentity.a.a(r0, r4)
        L_0x0035:
            if (r1 == 0) goto L_0x003e
            java.lang.CharSequence r4 = r2.getApplicationLabel(r1)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0040
        L_0x003e:
            java.lang.String r4 = ""
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.j.b(android.content.Context):java.lang.String");
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        return context.getPackageName();
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
