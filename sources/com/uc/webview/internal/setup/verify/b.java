package com.uc.webview.internal.setup.verify;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class b {
    public static boolean a(File file, File file2, ClassLoader classLoader, boolean z, Object[] objArr) {
        long j;
        String str;
        a.b bVar;
        File file3 = file;
        char c = 1;
        if (file3 == null) {
            return true;
        }
        String[][] a2 = EnvInfo.a(classLoader);
        int i = 2;
        if (a2 == null || a2.length == 0) {
            a(objArr, 2);
            ErrorCode.NATIVE_LIBRARIES_MISSING.report();
        }
        String name = file2 != null ? file2.getName() : null;
        int length = a2.length;
        char c2 = 0;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            String[] strArr = a2[i2];
            if (strArr == null || strArr.length < i) {
                Log.d("Verifier.lib", "library is invalid");
                a(objArr, 3);
                return false;
            }
            String str2 = strArr[c2];
            if (TextUtils.isEmpty(name) || name.equals(str2)) {
                try {
                    j = Long.parseLong(strArr[c]);
                } catch (Exception unused) {
                    j = 0;
                }
                int intValue = GlobalSettings.getIntValue(161);
                if (intValue < i || intValue > strArr.length) {
                    Log.w("Verifier.lib", "invalid algorithm " + intValue + ", use md5 by default");
                    intValue = 2;
                }
                File file4 = new File(file3, str2);
                String str3 = strArr[intValue];
                boolean z3 = file4.length() == j;
                StringBuilder sb = new StringBuilder("size ");
                String str4 = "ok";
                if (z3) {
                    name = name;
                    length = length;
                    str = str4;
                } else {
                    StringBuilder sb2 = new StringBuilder("failed, real:");
                    name = name;
                    length = length;
                    sb2.append(file4.length());
                    sb2.append(", expect:");
                    sb2.append(j);
                    str = sb2.toString();
                }
                sb.append(str);
                sb.append(", [");
                sb.append(file4.getAbsolutePath());
                sb.append("]");
                Log.w("Verifier.lib", sb.toString());
                if (!z3) {
                    a(objArr, 4);
                }
                if (z3 && !z) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (intValue == 2) {
                        bVar = a.b.a();
                    } else if (intValue != 4) {
                        bVar = a.b.b();
                    } else {
                        bVar = new a.b("SHA-256", "%064x");
                    }
                    bVar.b = file4;
                    String c3 = bVar.c();
                    boolean z4 = !TextUtils.isEmpty(c3) && c3.equals(str3);
                    StringBuilder sb3 = new StringBuilder("content ");
                    if (!z4) {
                        str4 = "failed, real:" + c3 + ", expect:" + str3;
                    }
                    sb3.append(str4);
                    sb3.append(", cost:");
                    sb3.append(System.currentTimeMillis() - currentTimeMillis);
                    sb3.append(", [");
                    sb3.append(file4.getAbsolutePath());
                    sb3.append("]");
                    Log.w("Verifier.lib", sb3.toString());
                    if (!z4) {
                        a(objArr, 5);
                    }
                    z3 = z4;
                }
                if (!z3) {
                    return false;
                }
                z2 = true;
            } else {
                Log.d("Verifier.lib", "ingore " + str2 + ", target:" + name);
                name = name;
                length = length;
            }
            i2++;
            file3 = file;
            c = 1;
            i = 2;
            c2 = 0;
        }
        if (z2) {
            return true;
        }
        Log.w("Verifier.lib", "no verification for ".concat(String.valueOf(name)));
        a(objArr, 6);
        return false;
    }

    private static void a(Object[] objArr, int i) {
        if (objArr != null && objArr.length > 0) {
            objArr[0] = Integer.valueOf(i);
        }
    }
}
