package com.loc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    static String f5730a = null;
    static boolean b = false;
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static String f = "";

    public static String a(Context context) {
        try {
            return h(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return f;
        }
    }

    public static String b(Context context) {
        try {
        } catch (Throwable th) {
            as.a(th, "AI", "gAN");
        }
        if (!"".equals(c)) {
            return c;
        }
        PackageManager packageManager = context.getPackageManager();
        c = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        return c;
    }

    public static String c(Context context) {
        String str;
        try {
            str = d;
        } catch (Throwable th) {
            as.a(th, "AI", "gpck");
        }
        if (str != null && !"".equals(str)) {
            return d;
        }
        String packageName = context.getPackageName();
        d = packageName;
        if (!b(packageName)) {
            d = context.getPackageName();
        }
        return d;
    }

    public static String d(Context context) {
        try {
        } catch (Throwable th) {
            as.a(th, "AI", "gAV");
        }
        if (!"".equals(e)) {
            return e;
        }
        e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        String str = e;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance(x.c("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String str = packageInfo.packageName;
            if (b(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(d)) {
                str = c(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            f5730a = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            as.a(th, "AI", "gsp");
            return f5730a;
        }
    }

    public static String f(Context context) {
        try {
            m.a(context);
        } catch (Throwable unused) {
        }
        try {
            return h(context);
        } catch (Throwable th) {
            as.a(th, "AI", "gKy");
            return f;
        }
    }

    private static String g(Context context) {
        Throwable th;
        FileInputStream fileInputStream;
        File file = new File(at.c(context, "k.store"));
        String str = "";
        if (!file.exists()) {
            return str;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String a2 = x.a(bArr);
                if (a2.length() == 32) {
                    str = a2;
                }
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    as.a(th, "AI", "gKe");
                    if (file.exists()) {
                        file.delete();
                    }
                    return str;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
        }
    }

    private static String h(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        String str = f;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return f;
            }
            String string = bundle.getString("com.amap.api.v2.apikey");
            f = string;
            if (string == null) {
                f = g(context);
            }
        }
        return f;
    }

    public static void a(final Context context, final String str) {
        if (!TextUtils.isEmpty(str)) {
            f = str;
            if (context != null) {
                cr.a().b(new cs() { // from class: com.loc.l.1
                    @Override // com.loc.cs
                    public final void a() {
                        Throwable th;
                        FileOutputStream fileOutputStream;
                        FileOutputStream fileOutputStream2 = null;
                        try {
                            File file = new File(at.c(context, "k.store"));
                            if (!file.getParentFile().exists()) {
                                file.getParentFile().mkdirs();
                            }
                            fileOutputStream = new FileOutputStream(file);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            fileOutputStream.write(x.a(str));
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream2 = fileOutputStream;
                            try {
                                as.a(th, "AI", "stf");
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable th5) {
                                        th5.printStackTrace();
                                    }
                                }
                            } catch (Throwable th6) {
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable th7) {
                                        th7.printStackTrace();
                                    }
                                }
                                throw th6;
                            }
                        }
                    }
                });
            }
        }
    }

    private static boolean b(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    av.b(x.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static void a(String str) {
        d = str;
    }

    public static boolean a() {
        if (b) {
            return true;
        }
        if (b(f5730a)) {
            b = true;
            return true;
        } else if (!TextUtils.isEmpty(f5730a)) {
            b = false;
            f5730a = null;
            return false;
        } else if (b(d)) {
            b = true;
            return true;
        } else {
            if (!TextUtils.isEmpty(d)) {
                b = false;
                d = null;
                return false;
            }
            return true;
        }
    }
}
