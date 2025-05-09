package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static String f14449a = ".ver_info";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f14450a;

        static {
            boolean z;
            String str = GlobalSettings.get(171, "");
            if (TextUtils.isEmpty(str) || y.a(str)) {
                z = false;
            } else {
                z = true;
            }
            f14450a = z;
        }
    }

    public static boolean a() {
        return a.f14450a;
    }

    public static long b() {
        return ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000) % 86400;
    }

    public static int c() {
        return (int) ((b() / 60) / 60);
    }

    public static boolean d() {
        return true;
    }

    public static boolean a(String str) {
        return "disable".equals(str);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str.replace("${NAME}", str2).replace("${ARCH}", EnvInfo.is64Bit() ? "Arm64" : "Arm32");
    }

    public static int b(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        if (str.equals(str2)) {
            return 0;
        }
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            if (split.length >= 3 && split2.length >= 3) {
                for (int i = 0; i < 4; i++) {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt > parseInt2) {
                        return 1;
                    }
                    if (parseInt < parseInt2) {
                        return -1;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static String a(long j) {
        long currentTimeMillis = j + System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        return String.format("%02d:%02d:%02d.%03d", Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13)), Integer.valueOf(instance.get(14)));
    }

    public static <K, V> String a(Map<K, V> map) {
        StringBuilder sb = new StringBuilder();
        if (map == null || map.isEmpty()) {
            sb.append("null");
        } else {
            sb.append("{");
            for (K k : map.keySet()) {
                sb.append(String.valueOf(k));
                sb.append(": ");
                sb.append(map.get(k));
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            sb.append("}");
        }
        return sb.toString();
    }

    public static String[] b(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("-");
            if (split.length == 2) {
                str = split[0];
                str2 = split[1];
                return new String[]{str, str2};
            }
        }
        str2 = "";
        return new String[]{str, str2};
    }

    public static <T> String a(Collection<T> collection) {
        StringBuilder sb = new StringBuilder();
        if (collection == null) {
            sb.append("null");
        } else if (collection.isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("[");
            for (T t : collection) {
                sb.append(t);
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public static long a(File file) {
        File[] listFiles;
        long a2;
        long j = 0;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    a2 = file2.length();
                } else if (file2.isDirectory()) {
                    a2 = a(file2);
                }
                j += a2;
            }
        }
        return j;
    }
}
