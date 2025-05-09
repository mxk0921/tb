package com.uc.crashsdk;

import android.util.SparseArray;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.e;
import com.uc.crashsdk.a.g;
import com.uc.crashsdk.a.h;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14244a = true;
    private static final Object b = new Object();
    private static final SparseArray<String> c = new SparseArray<>();
    private static final Object d = new Object();
    private static boolean e = false;

    public static void a(int i) {
        a(i, 1);
    }

    private static boolean b(int i, int i2) {
        try {
            b.y();
        } catch (Throwable th) {
            g.a(th);
        }
        try {
            String c2 = c(i);
            if (c2 == null) {
                a.a("crashsdk", "Stat type not exists: " + i, null);
                return false;
            }
            File file = new File(b.c());
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuffer a2 = a(file);
            if (g.a(a2)) {
                if (a2 == null) {
                    a2 = new StringBuffer();
                }
                a2.append("[");
                a2.append(e.h());
                a2.append("]\n");
            }
            a(a2, c2, a(a2, c2) + i2);
            return a(file, a2);
        } catch (Throwable th2) {
            g.a(th2);
            return false;
        }
    }

    private static boolean c(String str) {
        if (!g.a(str) && new File(str).exists()) {
            return a(str, new e(755, new Object[]{str}));
        }
        return false;
    }

    private static boolean d(String str) {
        if (f14244a || str != null) {
            File file = new File(str);
            StringBuffer a2 = a(file);
            if (g.a(a2)) {
                return false;
            }
            String a3 = a(a2);
            StringBuffer stringBuffer = null;
            if (a3 == null || a3.length() <= 0) {
                a.a("crashsdk", "notifyStatsDetailImpl: process name is invalid", null);
                return false;
            }
            SparseArray<String> e2 = e();
            boolean M = g.M();
            if (M) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("notifyStatsDetailImpl: processName: ");
                stringBuffer.append(a3.concat("\n"));
            }
            boolean z = false;
            for (int i = 0; i < e2.size(); i++) {
                try {
                    int keyAt = e2.keyAt(i);
                    String str2 = e2.get(keyAt);
                    int a4 = a(a2, str2);
                    if (a4 > 0) {
                        if (M) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(a4);
                            stringBuffer.append("\n");
                        }
                        d.a(a3, keyAt, a4);
                        a(a2, str2, 0);
                        z = true;
                    }
                } catch (Throwable th) {
                    if (z) {
                        a(file, a2);
                    }
                    throw th;
                }
            }
            if (M) {
                a.a(stringBuffer.toString());
            }
            if (z) {
                d.a(a3, 1000000, 0);
            }
            if (z) {
                a(file, a2);
            }
            return z;
        }
        throw new AssertionError();
    }

    private static boolean e(String str) {
        if (!g.a(str) && new File(str).exists()) {
            return a(str, new e(756, new Object[]{str}));
        }
        return false;
    }

    private static void f() {
        SparseArray<String> sparseArray = c;
        synchronized (sparseArray) {
            try {
                if (sparseArray.size() == 0) {
                    sparseArray.put(100, "start_pv");
                    sparseArray.put(102, "start_hpv");
                    sparseArray.put(1, "all_all");
                    sparseArray.put(2, "all_fg");
                    sparseArray.put(101, "all_bg");
                    sparseArray.put(3, "java_fg");
                    sparseArray.put(4, "java_bg");
                    sparseArray.put(7, "native_fg");
                    sparseArray.put(8, "native_bg");
                    sparseArray.put(27, "native_anr_fg");
                    sparseArray.put(28, "native_anr_bg");
                    sparseArray.put(9, "native_ok");
                    sparseArray.put(10, "unexp_anr");
                    sparseArray.put(29, "unexp_lowmem");
                    sparseArray.put(30, "unexp_killed");
                    sparseArray.put(31, "unexp_exit");
                    sparseArray.put(32, "unexp_restart");
                    sparseArray.put(11, "unexp_fg");
                    sparseArray.put(12, "unexp_bg");
                    sparseArray.put(40, "anr_fg");
                    sparseArray.put(41, "anr_bg");
                    sparseArray.put(42, "anr_cr_fg");
                    sparseArray.put(43, "anr_cr_bg");
                    sparseArray.put(44, "anr_ffg");
                    sparseArray.put(45, "anr_fbg");
                    sparseArray.put(13, "log_up_succ");
                    sparseArray.put(14, "log_up_fail");
                    sparseArray.put(15, "log_empty");
                    sparseArray.put(200, "log_tmp");
                    sparseArray.put(16, "log_abd_all");
                    sparseArray.put(22, "log_abd_builtin");
                    sparseArray.put(23, "log_abd_custom");
                    sparseArray.put(17, "log_large");
                    sparseArray.put(18, "log_up_all");
                    sparseArray.put(19, "log_up_bytes");
                    sparseArray.put(20, "log_up_crash");
                    sparseArray.put(21, "log_up_custom");
                    sparseArray.put(24, "log_zipped");
                    sparseArray.put(201, "log_enced");
                    sparseArray.put(25, "log_renamed");
                    sparseArray.put(26, "log_safe_skip");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(int i, int i2) {
        if (i2 == 0) {
            a.b("Add stat for type " + i + " with count 0!");
            return;
        }
        a(b.c(), new e(IMediaPlayer.MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private static String c(int i) {
        String str;
        f();
        SparseArray<String> sparseArray = c;
        synchronized (sparseArray) {
            str = sparseArray.get(i);
        }
        return str;
    }

    private static SparseArray<String> e() {
        SparseArray<String> clone;
        f();
        SparseArray<String> sparseArray = c;
        synchronized (sparseArray) {
            clone = sparseArray.clone();
        }
        return clone;
    }

    private static StringBuffer a(File file) {
        Throwable th;
        Exception e2;
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] d2 = d();
        if (d2 == null) {
            a.a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                fileReader = new FileReader(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e2 = e3;
        }
        try {
            int read = fileReader.read(d2);
            if (read > 0) {
                fileReader2 = null;
                stringBuffer.append(d2, 0, read);
            }
            g.a(fileReader);
        } catch (Exception e4) {
            e2 = e4;
            fileReader2 = fileReader;
            g.a(e2);
            g.a(fileReader2);
            return stringBuffer;
        } catch (Throwable th3) {
            th = th3;
            fileReader2 = fileReader;
            g.a(fileReader2);
            throw th;
        }
        return stringBuffer;
    }

    public static void c(boolean z) {
        if (g.O() && !b.M()) {
            e.j();
            if (!h.e()) {
                h.a(z);
            }
            if (b.G()) {
                d(z);
                a(b.c(), z);
                h.b(z);
            }
        }
    }

    private static String a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        int indexOf = stringBuffer.indexOf("[");
        if (indexOf < 0) {
            a.a("crashsdk", "getProcessName: Can not found process name start!", null);
            return null;
        }
        int i = indexOf + 1;
        int indexOf2 = stringBuffer.indexOf("]", i);
        if (indexOf2 < 0) {
            a.a("crashsdk", "getProcessName: Can not found process name end!", null);
            return null;
        }
        String substring = stringBuffer.substring(i, indexOf2);
        if (substring.length() > 0) {
            return substring;
        }
        a.a("crashsdk", "getProcessName: process name is empty", null);
        return null;
    }

    private static boolean b(String str) {
        StringBuffer stringBuffer;
        int i;
        File file = new File(str);
        StringBuffer a2 = a(file);
        if (g.a(a2)) {
            return false;
        }
        String a3 = a(a2);
        if (a3 == null || a3.length() <= 0) {
            a.a("crashsdk", "reportCrashStatImpl: process name is invalid", null);
            return false;
        }
        SparseArray<String> e2 = e();
        HashMap hashMap = new HashMap();
        boolean M = g.M();
        if (M) {
            stringBuffer = new StringBuffer();
            stringBuffer.append("reportCrashStatImpl: processName: ");
            stringBuffer.append(a3.concat("\n"));
        } else {
            stringBuffer = null;
        }
        int i2 = 0;
        boolean z = false;
        while (i2 < e2.size()) {
            try {
                int keyAt = e2.keyAt(i2);
                String str2 = e2.get(keyAt);
                int a4 = a(a2, str2);
                if (a4 > 0) {
                    if (M) {
                        e2 = e2;
                        stringBuffer.append("name: ");
                        stringBuffer.append(str2);
                        stringBuffer.append(", key: ");
                        stringBuffer.append(keyAt);
                        stringBuffer.append(", count: ");
                        stringBuffer.append(a4);
                        stringBuffer.append("\n");
                    } else {
                        e2 = e2;
                    }
                    h.a(a3, keyAt, a4);
                    hashMap.put(str2, Integer.valueOf(a4));
                    a(a2, str2, 0);
                    i = 1;
                    z = true;
                } else {
                    e2 = e2;
                    i = 1;
                }
                i2 += i;
            } catch (Throwable th) {
                if (z) {
                    a(file, a2);
                    if (hashMap.size() > 0) {
                        String a5 = b.a(str);
                        if (hashMap.size() > 0) {
                            if (g.a(a3)) {
                                a.a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
                            } else if (g.a(a5)) {
                                a.a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
                            } else {
                                a(a5, new e(754, new Object[]{a3, hashMap, a5}));
                            }
                        }
                    }
                }
                throw th;
            }
        }
        if (M) {
            a.a(stringBuffer.toString());
        }
        if (z) {
            a(file, a2);
            if (hashMap.size() > 0) {
                String a6 = b.a(str);
                if (hashMap.size() > 0) {
                    if (g.a(a3)) {
                        a.a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
                    } else if (g.a(a6)) {
                        a.a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
                    } else {
                        a(a6, new e(754, new Object[]{a3, hashMap, a6}));
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static void c() {
        com.uc.crashsdk.a.f.a(1, new e(700), 3000L);
    }

    private static int a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf("=", indexOf + str.length());
        if (indexOf2 < 0) {
            a.b(str.concat(" line not contain '='!"));
            return 0;
        }
        int i = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e2) {
            g.a(e2);
            return 0;
        }
    }

    private static char[] d() {
        char[] cArr = null;
        int i = 1024;
        while (cArr == null && i > 0) {
            try {
                cArr = new char[i];
            } catch (Throwable unused) {
                i /= 2;
                if (i < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    public static void d(boolean z) {
        if (!e) {
            synchronized (d) {
                try {
                    if (!e) {
                        if (!h.a(z, "crash detail")) {
                            if (b.t()) {
                                a(2, 1);
                                if (b.s()) {
                                    a(42, 1);
                                }
                            } else {
                                if (b.u()) {
                                    a(101, 1);
                                    if (b.s()) {
                                        a(43, 1);
                                    }
                                }
                                a(100, 1);
                                e = true;
                            }
                            a(1, 1);
                            a(100, 1);
                            e = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void a(StringBuffer stringBuffer, String str, int i) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf >= 0) {
            int indexOf2 = stringBuffer.indexOf("\n", indexOf);
            if (indexOf2 < 0) {
                indexOf2 = stringBuffer.length();
            }
            stringBuffer.replace(indexOf, indexOf2, str + "=" + String.valueOf(i));
        } else if (i > 0) {
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(i);
            stringBuffer.append("\n");
        }
    }

    private static boolean a(File file, StringBuffer stringBuffer) {
        Throwable th;
        Exception e2;
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String stringBuffer2 = stringBuffer.toString();
            fileWriter.write(stringBuffer2, 0, stringBuffer2.length());
            g.a(fileWriter);
            return true;
        } catch (Exception e4) {
            e2 = e4;
            fileWriter2 = fileWriter;
            g.a(e2);
            g.a(fileWriter2);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileWriter2 = fileWriter;
            g.a(fileWriter2);
            throw th;
        }
    }

    private static void a(String str, HashMap<String, Integer> hashMap, String str2) {
        try {
            b.y();
        } catch (Throwable th) {
            g.a(th);
        }
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuffer a2 = a(file);
            if (g.a(a2)) {
                if (a2 == null) {
                    a2 = new StringBuffer();
                }
                a2.append("[");
                a2.append(str);
                a2.append("]\n");
            }
            boolean z = false;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue > 0) {
                    String key = entry.getKey();
                    a(a2, key, intValue + a(a2, key));
                    z = true;
                }
            }
            if (z) {
                a(file, a2);
            }
        } catch (Throwable th2) {
            g.a(th2);
        }
    }

    public static int b(boolean z) {
        if (z) {
            return e(b.e()) ? 1 : 0;
        }
        File[] f = b.f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File file : f) {
            if (e(file.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    public static int b() {
        File[] d2 = b.d();
        if (d2 == null) {
            return 0;
        }
        int i = 0;
        for (File file : d2) {
            if (a(file.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    public static void b(int i) {
        if (i == 700) {
            d(false);
        }
    }

    public static int a(boolean z) {
        if (z) {
            return c(b.e()) ? 1 : 0;
        }
        File[] f = b.f();
        if (f == null) {
            return 0;
        }
        int i = 0;
        for (File file : f) {
            if (c(file.getAbsolutePath())) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(String str, e eVar) {
        return b.a(b, str, eVar);
    }

    public static boolean a(String str, boolean z) {
        if (h.a(z, "crash detail report")) {
            return false;
        }
        return a(str, new e(IMediaPlayer.MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME, new Object[]{str}));
    }

    public static int a() {
        File[] d2 = b.d();
        if (d2 == null) {
            return 0;
        }
        int i = 0;
        for (File file : d2) {
            if (a(file.getAbsolutePath(), false)) {
                i++;
            }
        }
        return i;
    }

    public static boolean a(String str) {
        return a(str, new e(IMediaPlayer.MEDIA_INFO_FATAL_ERROR_SYNC, new Object[]{str}));
    }

    public static boolean a(int i, Object[] objArr) {
        switch (i) {
            case IMediaPlayer.MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME /* 751 */:
                if (f14244a || objArr != null) {
                    return b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case IMediaPlayer.MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME /* 752 */:
                if (f14244a || objArr != null) {
                    return b((String) objArr[0]);
                }
                throw new AssertionError();
            case IMediaPlayer.MEDIA_INFO_FATAL_ERROR_SYNC /* 753 */:
                if (f14244a || objArr != null) {
                    File file = new File((String) objArr[0]);
                    if (!file.exists()) {
                        return false;
                    }
                    file.delete();
                    return true;
                }
                throw new AssertionError();
            case 754:
                if (f14244a || objArr != null) {
                    a((String) objArr[0], (HashMap) objArr[1], (String) objArr[2]);
                    return true;
                }
                throw new AssertionError();
            case 755:
                if (f14244a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case 756:
                if (f14244a || objArr != null) {
                    File file2 = new File((String) objArr[0]);
                    if (!file2.exists()) {
                        return false;
                    }
                    file2.delete();
                    return true;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }
}
