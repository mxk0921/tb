package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.asr;
import tb.m7l;
import tb.t2o;
import tb.urr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBProfConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANR_SP = "TBANRProfSP";
    public static final String CONFIG_ANR_PROFILER = "tbp_anr_profiler";
    public static final String CONFIG_BIG_MEM_MONITOR_SAMPLE = "tbp_bigmem_monitor_sample";
    public static final String CONFIG_BLACK_LIST = "tbp_black_list";
    public static final String CONFIG_CAPS_LIST = "tbp_caps_list";
    public static final String CONFIG_CHECK_MUTATOR = "tbp_check_mutator";
    public static final String CONFIG_DISABLE_ON_VIRTUAL = "tbp_virtual_disable";
    public static final String CONFIG_DUMP_HEAP = "tbp_dump_heap";
    public static final String CONFIG_EXHAUST_DUMP_ENABLE = "memory_exhaust_dump";
    public static final String CONFIG_IS_LOCAL = "tbp_is_local";
    public static final String CONFIG_IS_LOCAL_AUTO_START = "tbp_is_local_auto_start";
    public static final String CONFIG_IS_TBP_ENABLE = "tbp_is_enable";
    public static final String CONFIG_LAST_DUMP = "param_last_dump";
    public static final String CONFIG_LOG_LEVEL = "tbp_log_level";
    public static final String CONFIG_MAIN_WAIT_MONITOR_SAMPLE = "tbp_mainwait_monitor_sample";
    public static final String CONFIG_MONITOR_SAMPLE = "tbp_monitor_sample";
    public static final String CONFIG_PLUGIN_ARGS = "tbp_plugin_args";
    public static final String CONFIG_WAIT_PREVENT_GC = "tbp_wait_prevent_gc";
    public static final String TBP_SP = "TBProfSP";
    public static final TBPLogLevel[] g;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9612a = false;
    public static boolean b = false;
    public static int c = 0;
    public static String d = "";
    public static boolean e = false;
    public static String[] f = new String[0];
    public static int h = 0;
    public static int i = 0;
    public static boolean j = false;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = false;
    public static HeapDumpConfig n = new HeapDumpConfig();
    public static TBAnrConfig o = new TBAnrConfig();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HeapDumpConfig {
        public boolean isEnable = true;
        public boolean processOnce = true;
        public int dumpInterval = 1440;
        public int minSDK = 29;
        public int maxSDK = 33;
        public int sample = 5;
        public int graySample = 2000;
        public int selfGraySample = 0;
        public int integrationSample = 10000;
        public int otherSample = 10000;
        public int oomSample = 0;
        public List<String> releaseVerList = new ArrayList();
        public int type = 2;
        public int hprofTimeout = 90;
        public int instanceTimeout = 60;
        public int referenceTimeout = 90;
        public int instanceMinCount = 1;
        public int instanceMinSize = 1;
        public int instanceTopCount = 0;
        public int zipLevel = 8;
        public int splitSize = 94371840;
        public boolean upload = true;
        public int expireDay = 7;
        public long minSpace = 1073741824;
        public boolean addHeaderInfo = true;
        public int stripFlag = 3;
        public boolean uploadData = false;
        public boolean exhaustDumpEnable = false;
        public boolean isDebug = new File("/data/local/tmp/.tbp_heap_dump_debug").exists();

        static {
            t2o.a(824180746);
        }
    }

    static {
        t2o.a(824180745);
        TBPLogLevel tBPLogLevel = TBPLogLevel.INFO;
        TBPLogLevel tBPLogLevel2 = TBPLogLevel.DEBUG;
        g = new TBPLogLevel[]{tBPLogLevel, tBPLogLevel2, tBPLogLevel2, tBPLogLevel};
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4d93f6", new Object[0])).booleanValue();
        }
        return k;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f803db3", new Object[0])).intValue();
        }
        return h;
    }

    public static String[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3bc6bd04", new Object[0]);
        }
        return f;
    }

    public static HeapDumpConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HeapDumpConfig) ipChange.ipc$dispatch("341df82", new Object[0]);
        }
        return n;
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("761a6df5", new Object[]{context})).longValue();
        }
        SharedPreferences j2 = j(TBP_SP, context);
        if (j2 != null) {
            return j2.getLong(CONFIG_LAST_DUMP, 0L);
        }
        return Long.MAX_VALUE;
    }

    public static TBPLogLevel f(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPLogLevel) ipChange.ipc$dispatch("54ddf3a1", new Object[]{new Integer(i2)});
        }
        if (i2 >= 0) {
            TBPLogLevel[] tBPLogLevelArr = g;
            if (i2 < tBPLogLevelArr.length) {
                return tBPLogLevelArr[i2];
            }
        }
        return TBPLogLevel.NONE;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3e1523a", new Object[0])).intValue();
        }
        return i;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f08bcd68", new Object[0])).intValue();
        }
        return c;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0dfd813", new Object[0]);
        }
        return d;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688342f", new Object[0])).booleanValue();
        }
        return j;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff7ad4e6", new Object[0])).booleanValue();
        }
        return asr.e() && f9612a && !b;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aefca32", new Object[0])).booleanValue();
        }
        return e;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2f8d3b", new Object[0])).booleanValue();
        }
        return l;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4696dd4", new Object[0])).booleanValue();
        }
        return m;
    }

    public static void r(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5b8ed", new Object[]{context, new Boolean(z)});
            return;
        }
        SharedPreferences j2 = j(CONFIG_EXHAUST_DUMP_ENABLE, context);
        if (j2 != null) {
            j2.edit().putBoolean(CONFIG_EXHAUST_DUMP_ENABLE, z).apply();
        }
    }

    public static void s(Context context, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d825ca", new Object[]{context, new Long(j2)});
            return;
        }
        SharedPreferences j3 = j(TBP_SP, context);
        if (j3 != null) {
            j3.edit().putLong(CONFIG_LAST_DUMP, j2).apply();
        }
    }

    public static SharedPreferences j(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("eafcf66e", new Object[]{str, context});
        }
        if (context != null) {
            return m7l.a(context, str, 0);
        }
        return null;
    }

    public static TBAnrConfig l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAnrConfig) ipChange.ipc$dispatch("41ee0e45", new Object[]{context});
        }
        try {
            Log.e("TBPConfig", "initAnrConfig");
            SharedPreferences j2 = j(ANR_SP, context);
            if (j2 != null) {
                String string = j2.getString(CONFIG_ANR_PROFILER, null);
                if (string != null) {
                    o = (TBAnrConfig) JSON.parseObject(string, TBAnrConfig.class);
                }
                o.isDebug = new File("/data/local/tmp/.tbp_anr_debug").exists();
                o.soVer = j2.getString("soVer", null);
                o.utilSoPath = j2.getString("utilSoPath", null);
            }
        } catch (Exception e2) {
            urr.c("TBPConfig", e2, "initAnrConfig failed", new Object[0]);
            e2.printStackTrace();
        }
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:6:0x001b, B:8:0x0023, B:10:0x0039, B:12:0x007e, B:14:0x0082, B:16:0x0088, B:21:0x0092, B:22:0x00b0, B:23:0x00b2, B:26:0x00dd, B:27:0x00e4, B:28:0x00e8, B:30:0x00f5, B:31:0x00fa, B:33:0x00fd, B:35:0x0102, B:48:0x0124, B:51:0x012e, B:54:0x0138, B:57:0x0142, B:60:0x014c, B:63:0x0156, B:72:0x016b, B:73:0x016e, B:74:0x0171, B:75:0x0174, B:76:0x0177, B:77:0x017a, B:78:0x017c, B:79:0x017e, B:80:0x0181, B:82:0x01c0, B:83:0x01ca, B:85:0x01ce), top: B:88:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.TBProfConfig.k(android.content.Context):void");
    }
}
