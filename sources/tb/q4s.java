package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q4s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean D = false;
    public static final int DEFAULT_LOG_MAX_DAY = 7;
    public static final long DEFAULT_LOG_MAX_SIZE = 50;
    public static final long DEFAULT_SLICE_SIZE = 5;
    public static final long DEFAULT_SLICE_TOTAL_SIZE = 400;
    public static boolean p;
    public static boolean H = false;
    public static int I = 0;

    /* renamed from: a  reason: collision with root package name */
    public static String f26507a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "bbbbbbbbbbbbbbbbb";
    public static final String g = "-";
    public static String h = "";
    public static boolean i = false;
    public static boolean j = false;
    public static String m = null;
    public static final int k = 9;
    public static LogLevel l = LogLevel.E;
    public static String n = "TAOBAO";
    public static long o = 600;
    public static int q = 7;
    public static boolean r = true;
    public static long s = 5;
    public static long t = 400;
    public static long u = 50;
    public static boolean v = true;
    public static final int w = 7;
    public static String x = "";
    public static int y = 4000;
    public static int z = 2000;
    public static boolean A = true;
    public static boolean B = false;
    public static int C = 0;
    public static int E = 0;
    public static long F = 0;
    public static final long G = Process.myPid();

    static {
        t2o.a(767557644);
    }

    public static String a() {
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b493be63", new Object[0]);
        }
        Integer valueOf = Integer.valueOf(k);
        if (j || i) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        String name = l.getName();
        Long valueOf3 = Long.valueOf(o);
        Long valueOf4 = Long.valueOf(u);
        Boolean valueOf5 = Boolean.valueOf(r);
        Long valueOf6 = Long.valueOf(s);
        Long valueOf7 = Long.valueOf(t);
        Integer valueOf8 = Integer.valueOf(C);
        Integer valueOf9 = Integer.valueOf(q);
        Boolean valueOf10 = Boolean.valueOf(v);
        Integer valueOf11 = Integer.valueOf(w);
        Boolean valueOf12 = Boolean.valueOf(k());
        String absolutePath = b5s.i().getAbsolutePath();
        if (F != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return String.format("TLogVer: %s, Debuggable: %b, LogLevel: %s, CacheSize: %dK, LogMaxSize: %dM,UseSlice: %b, SliceSize: %dM, TotalSlice: %dM, SliceScope: %dH, MaxLogDay: %d, UseZstd: %b, ZstdLevel: %d, MainProcess: %b, CacheDir: %s, mainProcessOpt: %b, zstdPath: %s", valueOf, valueOf2, name, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, absolutePath, Boolean.valueOf(z3), x);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54283da7", new Object[0])).intValue();
        }
        return q;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6163239d", new Object[0])).intValue();
        }
        return I;
    }

    public static <T extends Comparable<T>> T d(T t2, T t3, T t4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Comparable) ipChange.ipc$dispatch("e26a89ba", new Object[]{t2, t3, t4}));
        }
        if (t4.compareTo(t2) < 0) {
            return t2;
        }
        if (t4.compareTo(t3) > 0) {
            return t3;
        }
        return t4;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d04ee90", new Object[0])).intValue();
        }
        return k;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8cd0033", new Object[0])).intValue();
        }
        return C * 3600000;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cad2687", new Object[0])).booleanValue();
        }
        return j;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8efe642", new Object[0])).booleanValue();
        }
        return D;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13576966", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9c76a8b", new Object[0])).booleanValue();
        }
        if (Thread.currentThread().getId() == F) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        return TextUtils.equals(c, d);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7363941d", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d7bb94", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6f4e49", new Object[0])).booleanValue();
        }
        return H;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b73da0", new Object[0])).booleanValue();
        }
        return r;
    }

    public static void p(Context context) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04649fb", new Object[]{context});
            return;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (defaultSharedPreferences.contains(EnvironmentSwitcher.TLOG_VERSION)) {
                String string = defaultSharedPreferences.getString(EnvironmentSwitcher.TLOG_VERSION, null);
                if (string != null && string.equals(e)) {
                    z2 = false;
                    B = z2;
                }
                z2 = true;
                B = z2;
            } else {
                B = true;
            }
            if (defaultSharedPreferences.contains(EnvironmentSwitcher.TLOG_LEVEL) && !B) {
                l = n6s.c(defaultSharedPreferences.getString(EnvironmentSwitcher.TLOG_LEVEL, "ERROR"));
                s4s.e().i(l);
            }
            if (defaultSharedPreferences.contains("tlog_module") && !B) {
                s4s.e().b(n6s.i(defaultSharedPreferences.getString("tlog_module", null)));
            }
            if (defaultSharedPreferences.contains("tlog_isDebug")) {
                i = defaultSharedPreferences.getBoolean("tlog_isDebug", false);
            }
            if (defaultSharedPreferences.contains("tlog_file_size")) {
                u = defaultSharedPreferences.getLong("tlog_file_size", 50L);
            }
            if (defaultSharedPreferences.contains("tlog_statistics_sample")) {
                y = defaultSharedPreferences.getInt("tlog_statistics_sample", 4000);
            }
            if (defaultSharedPreferences.contains("tlog_file_statistics_sample")) {
                z = defaultSharedPreferences.getInt("tlog_file_statistics_sample", 2000);
            }
            if (!p && defaultSharedPreferences.contains("tlog_buffer_size")) {
                o = defaultSharedPreferences.getLong("tlog_buffer_size", 600L);
            }
            if (defaultSharedPreferences.contains("tlog_scan_upload")) {
                A = defaultSharedPreferences.getBoolean("tlog_scan_upload", true);
            }
            if (defaultSharedPreferences.contains("tlog_use_zstd")) {
                v = defaultSharedPreferences.getBoolean("tlog_use_zstd", true);
            }
            if (defaultSharedPreferences.contains("tlog_slice_config")) {
                String string2 = defaultSharedPreferences.getString("tlog_slice_config", "");
                if (!TextUtils.isEmpty(string2)) {
                    String[] split = string2.split(":");
                    if (split.length == 5) {
                        try {
                            r = Boolean.parseBoolean(split[0]);
                            s = Integer.parseInt(split[1]);
                            t = Integer.parseInt(split[2]);
                            q = Integer.parseInt(split[3]);
                            C = Integer.parseInt(split[4]);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (defaultSharedPreferences.getBoolean("tlog_main_opt", true)) {
                F = Looper.getMainLooper().getThread().getId();
                TLog.loge("TLogConfig", "", "main opt is enable. mainThreadJavaID=" + F);
            }
            H = defaultSharedPreferences.getBoolean("tlog_threadpool_anr_opt2", false);
            I = defaultSharedPreferences.getInt("tlog_mini_blocks", 0);
            u = ((Long) d(5L, 100L, Long.valueOf(u))).longValue();
            o = ((Long) d(100L, 3000L, Long.valueOf(o))).longValue();
            s = ((Long) d(2L, Long.valueOf(u), Long.valueOf(s))).longValue();
            t = ((Long) d(10L, 1000L, Long.valueOf(t))).longValue();
            q = ((Integer) d(1, 30, Integer.valueOf(q))).intValue();
            C = ((Integer) d(1, 24, Integer.valueOf(C))).intValue();
            D = n6s.h(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
