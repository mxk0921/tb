package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ab {
    public static String a() {
        try {
            String readLine = new BufferedReader(new FileReader("/proc/sys/kernel/random/boot_id")).readLine();
            return readLine != null ? readLine : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        String trim;
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %z /data/app").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String[] split = readLine.split("\\.");
                Date a2 = a(split[0]);
                String str2 = split[1];
                if (!TextUtils.isEmpty(str2 != null ? str2.split("\\+")[0].trim() : str)) {
                    str = (a2.getTime() / 1000) + "." + c(trim);
                } else {
                    str = String.valueOf(a2.getTime() / 1000);
                }
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    private static int c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String d() {
        String trim;
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %x /data/data").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String[] split = readLine.split("\\.");
                Date a2 = a(split[0]);
                String str2 = split[1];
                if (!TextUtils.isEmpty(str2 != null ? str2.split("\\+")[0].trim() : str)) {
                    str = (a2.getTime() / 1000) + "." + c(trim);
                } else {
                    str = String.valueOf(a2.getTime() / 1000);
                }
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String e() {
        String trim;
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %x /data/app").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String[] split = readLine.split("\\.");
                Date a2 = a(split[0]);
                String str2 = split[1];
                if (!TextUtils.isEmpty(str2 != null ? str2.split("\\+")[0].trim() : str)) {
                    str = (a2.getTime() / 1000) + "." + c(trim);
                } else {
                    str = String.valueOf(a2.getTime() / 1000);
                }
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String f() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %i /data/data").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                str = readLine;
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String g() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %i /data/app").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                str = readLine;
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    public static String h() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String obj = declaredMethod.invoke(null, "net.hostname").toString();
            if (obj == null || obj.equalsIgnoreCase("")) {
                return obj;
            }
            return b(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Context context) {
        String uuid;
        try {
            String a2 = y.a(context);
            try {
                if (!TextUtils.isEmpty(a2)) {
                    return a2;
                }
                uuid = UUID.randomUUID().toString();
                y.a(context, uuid);
                return uuid;
            } catch (Throwable unused) {
                return uuid;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c() {
        String trim;
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %z /data/").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String[] split = readLine.split("\\.");
                Date a2 = a(split[0]);
                String str2 = split[1];
                if (!TextUtils.isEmpty(str2 != null ? str2.split("\\+")[0].trim() : str)) {
                    str = (a2.getTime() / 1000) + "." + c(trim);
                } else {
                    str = String.valueOf(a2.getTime() / 1000);
                }
            }
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return str;
    }

    private static Date a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0)) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) ((bArr[i] ^ bArr2[i % bArr2.length]) ^ (i & 255));
            }
        }
        return bArr;
    }
}
