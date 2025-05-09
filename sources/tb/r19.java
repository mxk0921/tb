package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r19 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIXED_SJS_FAST_SWITCH_LIST_VALUE = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";

    /* renamed from: a  reason: collision with root package name */
    public static Handler f27042a;
    public static Runnable b;
    public static volatile String l;
    public static volatile String m;
    public static volatile boolean c = false;
    public static volatile Intent d = null;
    public static int e = 0;
    public static int f = 0;
    public static String g = null;
    public static volatile long h = 0;
    public static volatile int i = -1;
    public static volatile int j = -1;
    public static volatile int k = -1;
    public static String n = null;
    public static int o = -1;
    public static int p = -1;
    public static int q = -1;
    public static int r = -1;
    public static int s = -1;
    public static int t = -1;
    public static int u = -1;
    public static int v = -1;
    public static int w = -1;
    public static int x = -1;
    public static int y = -1;
    public static int z = -1;
    public static int A = -1;
    public static int B = -1;
    public static int C = -1;
    public static int D = -1;
    public static int E = -1;
    public static int F = -1;
    public static int G = -1;
    public static int H = -1;
    public static int I = -1;
    public static int J = -1;
    public static int K = -1;
    public static int L = -1;
    public static int M = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/FastStartDelayTaskUtil$1");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "processLowPriorityTask";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            r19.a();
            r19.R();
            r19.T("lowPriority");
            r19.V("lowPriority");
            r19.U();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f27043a = false;

        static {
            t2o.a(352321933);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/FastStartDelayTaskUtil$DelayMainTaskRunnable");
        }

        @Override // tb.r19.e, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f27043a) {
                super.run();
            } else {
                this.f27043a = true;
                Handler b = r19.b();
                if (b == null) {
                    b = new Handler(Looper.getMainLooper());
                    r19.c(b);
                }
                b.post(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class c extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f27044a = System.currentTimeMillis();

        static {
            t2o.a(352321934);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/FastStartDelayTaskUtil$DelayRecordTaskRunnable");
        }

        public long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d22922b4", new Object[]{this})).longValue();
            }
            return this.f27044a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class d extends e implements hlb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321935);
            t2o.a(352321937);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/FastStartDelayTaskUtil$DelayTaskDataRunnable");
        }

        public Intent a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("2585938d", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321936);
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return -1;
        }

        public abstract String c();

        public abstract void d();

        @Override // java.lang.Runnable
        public void run() {
            boolean b;
            RuntimeException runtimeException;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                txj.b("FastStartDelayTaskUtil", "FastDelayTask 开始执行: " + c() + " getCustomDelayTime:" + b());
                d();
                StringBuilder sb = new StringBuilder("FastDelayTask 执行结束: ");
                sb.append(c());
                txj.b("FastStartDelayTaskUtil", sb.toString());
            } finally {
                if (!b) {
                }
            }
        }
    }

    static {
        t2o.a(352321931);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e90e97fd", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_cloud_blur")) {
                return true;
            }
            return false;
        } else if (S("f_cloud_blur")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b516d95", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        return false;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62db1515", new Object[0])).booleanValue();
        }
        if (S("f_wx_only_ctn_height")) {
            return true;
        }
        return false;
    }

    public static boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63effb8", new Object[0])).booleanValue();
        }
        if (D()) {
            return true;
        }
        return false;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9b445a1", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_degrade_img_blur")) {
                return true;
            }
            return false;
        } else if (S("f_degrade_img_blur")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36240f0b", new Object[0])).booleanValue();
        }
        if (u == -1) {
            if (h("fast_key_nd_log_level_l2") == 1) {
                u = 1;
            } else if (E0()) {
                u = 1;
            } else {
                u = 0;
            }
        }
        if (u == 1) {
            return true;
        }
        return false;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("446d7e3f", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_delay_right_menu")) {
                return true;
            }
            return false;
        } else if (S("f_delay_right_menu")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc94cc6", new Object[0])).booleanValue();
        }
        if (t == -1) {
            if (H()) {
                t = 1;
            } else if (E0()) {
                t = 1;
            } else {
                t = 0;
            }
        }
        if (t == 1) {
            return true;
        }
        return false;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5ff8730", new Object[0])).booleanValue();
        }
        if (S("f_anim_for_async")) {
            return true;
        }
        return false;
    }

    public static boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31e6706", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d4e39a", new Object[0])).booleanValue();
        }
        if (S("f_force_check_ad_task")) {
            return true;
        }
        return false;
    }

    public static boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a9cbec4", new Object[0])).booleanValue();
        }
        if (M()) {
            return true;
        }
        return false;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f72a8785", new Object[0])).booleanValue();
        }
        if (S("f_idle_event")) {
            return true;
        }
        return false;
    }

    public static boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491bafd4", new Object[0])).booleanValue();
        }
        if (q()) {
            return true;
        }
        qyj.a("weex_sync_delete_code", "hitIndependentFastKeyNdWeexAsync getFastSjsListStr:" + Y() + " getTppSwitchListStr:" + e0());
        return false;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17abb853", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_log_lite")) {
                return true;
            }
            return false;
        } else if (S("f_log_lite")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc7d834f", new Object[0])).booleanValue();
        }
        if (y == -1) {
            y = h("fast_key_no_nd_anim_check");
        }
        if (y == 1) {
            return true;
        }
        return false;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66fd530", new Object[0])).booleanValue();
        }
        if (S("f_old_optimize_key")) {
            return true;
        }
        return false;
    }

    public static boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c223e42", new Object[0])).booleanValue();
        }
        if (I()) {
            return true;
        }
        return false;
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1365134a", new Object[0])).booleanValue();
        }
        if (S("f_out_weex_skip")) {
            return true;
        }
        return false;
    }

    public static boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de81c32", new Object[0])).booleanValue();
        }
        if (s == -1) {
            s = h("fast_key_right_nav_bar_with_anim");
        }
        if (s == 1) {
            return true;
        }
        return false;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bc6eba4", new Object[0])).booleanValue();
        }
        if (S("f_pre_weex_skip")) {
            return true;
        }
        return false;
    }

    public static boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33a0fc67", new Object[0])).booleanValue();
        }
        if (L()) {
            return true;
        }
        return false;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a376d5", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_sec_holder")) {
                return true;
            }
            return false;
        } else if (S("f_sec_holder")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca8e64c9", new Object[0])).booleanValue();
        }
        if (A == -1) {
            A = h("fast_key_skip_clone_intent");
        }
        if (A == 1) {
            return true;
        }
        return false;
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87079733", new Object[0])).booleanValue();
        }
        if (S("f_server_weex")) {
            return true;
        }
        return false;
    }

    public static boolean M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366ddf82", new Object[0])).booleanValue();
        }
        if (C == -1) {
            C = h("fast_key_slow2_next_page");
        }
        if (C == 1) {
            return true;
        }
        return false;
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ad1a8e0", new Object[0])).booleanValue();
        }
        if (S("f_skip_e_url")) {
            return true;
        }
        return false;
    }

    public static boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c48d8ea", new Object[0])).booleanValue();
        }
        if (B == -1) {
            B = h("fast_key_slow_next_page");
        }
        if (B == 1) {
            return true;
        }
        return false;
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c29079e", new Object[0])).booleanValue();
        }
        if (S("f_wx_container_size")) {
            return true;
        }
        return false;
    }

    public static boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5863c430", new Object[0])).booleanValue();
        }
        if (x == -1) {
            x = h("fast_key_split_success");
        }
        if (x == 1) {
            return true;
        }
        return false;
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d79f94f6", new Object[0])).booleanValue();
        }
        if (i == -1) {
            R();
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ad611d4", new Object[0])).booleanValue();
        }
        if (A()) {
            return true;
        }
        return false;
    }

    public static boolean Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc4c089", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb2876f", new Object[0])).booleanValue();
        }
        if (z == -1) {
            z = h("fast_key_weex_no_cache");
        }
        if (z == 1) {
            return true;
        }
        return false;
    }

    public static void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e45271", new Object[0]);
            return;
        }
        if (qp0.c() > ywj.g(byj.L0(), 20)) {
            i = 1;
        }
    }

    public static boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d386df3", new Object[0])).booleanValue();
        }
        if (q()) {
            return true;
        }
        return false;
    }

    public static boolean S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78314e06", new Object[]{str})).booleanValue();
        }
        String e0 = e0();
        if (e0.startsWith("f_ver")) {
            if (!e0.contains(str + "_ev2")) {
                return false;
            }
            k = 1;
            return true;
        } else if (e0.contains(str)) {
            k = 1;
            return true;
        } else {
            String Z = Z();
            if (Z.startsWith("f_ver")) {
                if (!Z.contains(str + "_ev2")) {
                    return false;
                }
                j = 1;
                return true;
            } else if (!Z.contains(str)) {
                return false;
            } else {
                j = 1;
                return true;
            }
        }
    }

    public static boolean S0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cf6df29", new Object[]{str})).booleanValue();
        }
        if (s()) {
            return true;
        }
        return false;
    }

    public static String T(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ae8167c", new Object[]{str});
        }
        try {
            str2 = (String) mza.d().c("ndLowOptimizationThird", String.class);
        } catch (Throwable th) {
            txj.c(txj.TAG_TIP, "执行 HomeClientABTestTool getAbTestValue 异常了。", th);
            gxj.a("HomeClientABTestTool.getAbTestValue 调用异常。", th);
            str2 = l;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
        }
        txj.b(txj.TAG_TIP, str + ":forceUpdateFastSwitchListStr: " + str2);
        l = str2;
        return str2;
    }

    public static boolean T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7734a6ed", new Object[0])).booleanValue();
        }
        return P();
    }

    public static void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317435bf", new Object[0]);
            return;
        }
        String O0 = byj.O0();
        if (!TextUtils.isEmpty(O0)) {
            n = O0;
        }
    }

    public static void U0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5042a5a0", new Object[]{runnable});
        } else if (p0()) {
            if (runnable == b) {
                b = null;
            }
            e = 0;
            f = 0;
            Y0();
        }
    }

    public static String V(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eee2e674", new Object[]{str});
        }
        try {
            str2 = whs.b();
        } catch (Throwable th) {
            txj.c(txj.TAG_TIP, "执行 TPPUtils getNdLowFeatureList 异常了。", th);
            gxj.a("TPPUtils.getNdLowFeatureList 调用异常。", th);
            str2 = m;
        }
        if (str2 == null) {
            str2 = "f_no_refresh_value";
        }
        txj.b(txj.TAG_TIP, str + ":forceUpdateTppSwitchListStr: " + str2);
        m = str2;
        return str2;
    }

    public static void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea76096f", new Object[0]);
        } else if (!i()) {
            c = false;
            g = byj.M0();
        }
    }

    public static long W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e76834d", new Object[0])).longValue();
        }
        return h;
    }

    public static void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef268af", new Object[0]);
        } else {
            h++;
        }
    }

    public static String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87e9ec71", new Object[0]);
        }
        String str = n;
        if (str != null) {
            return str;
        }
        String O0 = byj.O0();
        n = O0;
        return O0;
    }

    public static boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faca50c3", new Object[0])).booleanValue();
        }
        if (!S("f_close_slow_bg") && !Q("fast_direct_close_slow_bg")) {
            return G0();
        }
        return false;
    }

    public static String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ad2010", new Object[0]);
        }
        String str = l;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629b11b1", new Object[0]);
        } else {
            Coordinator.execute(new a(), 50);
        }
    }

    public static String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("473601ec", new Object[0]);
        }
        String str = l;
        if (str == null) {
            try {
                str = (String) mza.d().c("ndLowOptimizationThird", String.class);
            } catch (Throwable th) {
                txj.c(txj.TAG_TIP, "执行 HomeClientABTestTool getAbTestValue 异常了(temp)。", th);
                gxj.a("HomeClientABTestTool.getAbTestValue 调用异常。(temp)", th);
            }
            if (TextUtils.isEmpty(str)) {
                str = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
            }
            l = str;
            txj.b(txj.TAG_TIP, "tempUpdateFastSwitchListStr: " + str);
        }
        return str;
    }

    public static void Z0(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c4588d", new Object[]{eVar});
        } else {
            f(eVar);
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            b1();
        }
    }

    public static String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b24088", new Object[0]);
        }
        String str = m;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ec546e", new Object[0]);
            return;
        }
        txj.b("FastStartDelayTaskUtil", "preInitSwitch-Start");
        b0();
        l0();
        j0();
        n0();
        k0();
        i0();
        h0();
        o0();
        m0();
        g0();
        f0();
        nyj.H();
        txj.b("FastStartDelayTaskUtil", "preInitSwitch-End .");
    }

    public static /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("172e410e", new Object[0]);
        }
        return f27042a;
    }

    public static String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6093dc31", new Object[0]);
        }
        StringBuilder sb = new StringBuilder(byj.K0());
        g(sb);
        String sb2 = sb.toString();
        if (!C0()) {
            txj.b("FastStartDelayTaskUtil", "NdWeexSwitchListStr: " + sb2);
        }
        return sb2;
    }

    public static void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45b05d5", new Object[0]);
        } else {
            c1();
        }
    }

    public static /* synthetic */ Handler c(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3958829c", new Object[]{handler});
        }
        f27042a = handler;
        return handler;
    }

    public static int c0(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e7a53e2", new Object[]{str, new Integer(i2)})).intValue();
        }
        String str2 = g;
        if (str2 == null) {
            str2 = byj.M0();
            g = str2;
        }
        if (str2 != null && !str2.isEmpty() && str2.contains(str)) {
            String[] split = str2.split(str);
            if (split.length >= 3) {
                return ywj.g(split[2].trim(), i2);
            }
        }
        return i2;
    }

    public static void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52645ec", new Object[0]);
        } else {
            g = byj.M0();
        }
    }

    public static void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f99c72", new Object[]{eVar});
        } else if (eVar != null) {
            Handler handler = f27042a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f27042a = handler;
            }
            if (e > 2000) {
                e = 2000;
            }
            int b2 = eVar.b();
            if (b2 == -1) {
                handler.postDelayed(eVar, e + 2000);
            } else if (b2 != 0) {
                handler.postDelayed(eVar, eVar.b());
            } else {
                handler.post(eVar);
            }
            e += 15;
        }
    }

    public static Handler d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[0]);
        }
        Handler handler = f27042a;
        if (handler == null) {
            return new Handler(Looper.getMainLooper());
        }
        return handler;
    }

    public static void d1(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464c88cc", new Object[]{runnable});
            return;
        }
        Runnable runnable2 = b;
        b = null;
        if (runnable2 != null) {
            runnable2.run();
        }
        b = runnable;
        if (!c) {
            return;
        }
        if (v()) {
            f1(d, false);
        } else {
            e1();
        }
    }

    public static void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf0f9ba", new Object[]{eVar});
        } else {
            f(eVar);
        }
    }

    public static String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f23d858", new Object[0]);
        }
        String str = m;
        if (str == null) {
            try {
                str = whs.b();
            } catch (Throwable th) {
                txj.c(txj.TAG_TIP, "执行 TPPUtils getNdLowFeatureList 异常了。(temp)", th);
                gxj.a("TPPUtils.getNdLowFeatureList 调用异常。(temp)", th);
            }
            if (str == null) {
                str = "f_no_value";
            }
            m = str;
            txj.b(txj.TAG_TIP, "tempUpdateTppSwitchListStr: ".concat(str));
        }
        return str;
    }

    public static void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4311f37f", new Object[0]);
            return;
        }
        c = true;
        Runnable runnable = b;
        b = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13eddcb", new Object[]{eVar});
        } else if (eVar != null) {
            Handler handler = f27042a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f27042a = handler;
            }
            if (f > 1000) {
                f = 1000;
            }
            int b2 = eVar.b();
            if (b2 == -1) {
                handler.postDelayed(eVar, f + 1000);
            } else if (b2 != 0) {
                handler.postDelayed(eVar, eVar.b());
            } else {
                handler.post(eVar);
            }
            f += 5;
        }
    }

    public static int f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdec69c0", new Object[0])).intValue();
        }
        int i2 = M;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("batch_dispatch_time", 100);
        M = c0;
        return c0;
    }

    public static void f1(Intent intent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea12b4fc", new Object[]{intent, new Boolean(z2)});
            return;
        }
        c = true;
        Runnable runnable = b;
        b = null;
        if (runnable != null) {
            d = null;
            nqj.a(runnable, intent);
            runnable.run();
        } else if (z2) {
            d = intent;
        } else {
            d = null;
        }
    }

    public static int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aba1a6fc", new Object[0])).intValue();
        }
        int i2 = L;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("batch_fire_time", 800);
        L = c0;
        return c0;
    }

    public static int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc3ed372", new Object[]{str})).intValue();
        }
        return 0;
    }

    public static int h0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("876b7f8c", new Object[0])).intValue();
        }
        if (S("f_time_cre_sl_wx")) {
            return 200;
        }
        int i2 = 50;
        if (S("f_time_cre_wx")) {
            return 50;
        }
        int i3 = I;
        if (i3 != -1) {
            return i3;
        }
        if (N0()) {
            str = "delay_create_wx_sl_time";
            i2 = 800;
        } else {
            if (M0()) {
                i2 = 260;
            }
            str = "delay_create_wx_time";
        }
        int c0 = c0(str, i2);
        I = c0;
        txj.b("FastStartDelayTaskUtil", "DelayCreateWxTime: " + I);
        return c0;
    }

    @Deprecated
    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42325b3", new Object[0])).booleanValue();
        }
        if (j == -1 && k == -1) {
            return true;
        }
        return false;
    }

    public static int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce55e9d7", new Object[0])).intValue();
        }
        int i2 = H;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("delay_end_wx_notify", 20);
        H = c0;
        return c0;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1909a25", new Object[0])).booleanValue();
        }
        int i2 = p;
        if (i2 == 0) {
            return false;
        }
        if (i2 == -1) {
            if (TBDeviceUtils.p(Globals.getApplication())) {
                p = 1;
            } else {
                p = 0;
            }
        }
        if (p == 1) {
            return true;
        }
        return false;
    }

    public static int j0() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edd437c8", new Object[0])).intValue();
        }
        int i3 = E;
        if (i3 != -1) {
            return i3;
        }
        if (T0()) {
            i2 = c0("delay_fix_ui_h_time", 200);
        } else {
            i2 = c0("delay_fix_ui_time", 350);
        }
        E = i2;
        return i2;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da4291b6", new Object[0])).booleanValue();
        }
        if (o == 0 && p == 0) {
            return true;
        }
        if (j() || l()) {
            return false;
        }
        return true;
    }

    public static int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e0454b5", new Object[0])).intValue();
        }
        int i2 = G;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("delay_start_wx_frozen", 100);
        G = c0;
        return c0;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84f7c0d4", new Object[0])).booleanValue();
        }
        int i2 = o;
        if (i2 == 0) {
            return false;
        }
        if (i2 == -1) {
            if (TBDeviceUtils.P(Globals.getApplication())) {
                o = 1;
            } else {
                o = 0;
            }
        }
        if (o == 1) {
            return true;
        }
        return false;
    }

    public static int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35b9b8b5", new Object[0])).intValue();
        }
        int i2 = D;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("delay_nav_time", 300);
        D = c0;
        return c0;
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3db897d", new Object[]{context})).booleanValue();
        }
        if (context instanceof i0d) {
            return ((i0d) context).O1();
        }
        return false;
    }

    public static int m0() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a736c5", new Object[0])).intValue();
        }
        int i3 = K;
        if (i3 != -1) {
            return i3;
        }
        if (S("f_time_pg_sl_idle")) {
            i2 = 800;
        } else {
            i2 = S("f_time_pg_idle") ? 350 : c0("page_idle_time", 380);
        }
        K = i2;
        return i2;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce0021c8", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_close_delay_prepare")) {
                return true;
            }
            return false;
        } else if (S("f_close_delay_prepare")) {
            return true;
        } else {
            return false;
        }
    }

    public static int n0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36c24529", new Object[0])).intValue();
        }
        int i2 = F;
        if (i2 != -1) {
            return i2;
        }
        if (J0()) {
            str = "right_anim_nav_time";
        } else {
            str = "right_nav_time";
        }
        int c0 = c0(str, 850);
        F = c0;
        return c0;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e40f52bd", new Object[0])).booleanValue();
        }
        if (S("f_align_pref_home")) {
            return true;
        }
        return false;
    }

    public static int o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd1c4343", new Object[0])).intValue();
        }
        int i2 = J;
        if (i2 != -1) {
            return i2;
        }
        int c0 = c0("scroll_idle_time", 1500);
        J = c0;
        return c0;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c87d993", new Object[0])).booleanValue();
        }
        if (S("f_anim_close_frozen")) {
            return true;
        }
        return false;
    }

    public static boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9af6727", new Object[0])).booleanValue();
        }
        if (j == 1 || k == 1) {
            return true;
        }
        return false;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85d5d859", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_async_nd")) {
                return true;
            }
            qyj.a("weex_sync_delete_code", "High:directHitAsyncNdFeature:" + Y() + " getTppSwitchListStr:" + e0());
            return false;
        } else if (S("f_async_nd")) {
            return true;
        } else {
            qyj.a("weex_sync_delete_code", "Low:directHitAsyncNdFeature:" + Y() + " getTppSwitchListStr:" + e0());
            return false;
        }
    }

    public static boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49f6cad7", new Object[0])).booleanValue();
        }
        return S0("fast_key_cache_weex_url_version");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a756eda0", new Object[0])).booleanValue();
        }
        if (S("f_async_parse")) {
            return true;
        }
        return false;
    }

    public static boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefeb105", new Object[0])).booleanValue();
        }
        return S0("fast_key_pre_init_ui_info_task");
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af81a189", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_base_opt")) {
                return true;
            }
            return false;
        } else if (S("f_base_opt")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea321df", new Object[0])).booleanValue();
        }
        return H0();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9be84fd6", new Object[0])).booleanValue();
        }
        if (S("f_black_bg_align")) {
            return true;
        }
        return false;
    }

    public static boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42b27db2", new Object[0])).booleanValue();
        }
        return G0();
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b8ee040", new Object[0])).booleanValue();
        }
        if (S("f_cb_wx_no_data")) {
            return true;
        }
        return false;
    }

    public static boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d86ee3e", new Object[0])).booleanValue();
        }
        if (r()) {
            return true;
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd05da", new Object[0])).booleanValue();
        }
        if (S("f_check_render_v2")) {
            return true;
        }
        return false;
    }

    public static boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89431b2a", new Object[0])).booleanValue();
        }
        if (w == -1) {
            w = h("fast_key_async_ut");
        }
        if (w == 1) {
            return true;
        }
        return false;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("283b245c", new Object[0])).booleanValue();
        }
        if (S("f_client_pre_align")) {
            return true;
        }
        return false;
    }

    public static boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51fcf343", new Object[0])).booleanValue();
        }
        if (v == -1) {
            v = h("fast_key_batch_dispatch");
        }
        if (v == 1) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1704c3ff", new Object[0])).booleanValue();
        }
        if (S("f_close_img_load")) {
            return true;
        }
        return false;
    }

    public static boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fecabf2", new Object[0])).booleanValue();
        }
        if (D()) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("276aac20", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_close_img_play")) {
                return true;
            }
            return false;
        } else if (S("f_close_img_play")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d190d8c0", new Object[0])).booleanValue();
        }
        if (r == -1) {
            r = h("fast_key_force_remove_atmosphere");
        }
        if (r == 1) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("300d9d00", new Object[0])).booleanValue();
        }
        if (P()) {
            if (S("f_high_close_video_play")) {
                return true;
            }
            return false;
        } else if (S("f_close_video_play")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58a6914d", new Object[0])).booleanValue();
        }
        if (q == -1) {
            q = h("fast_key_force_modify_weex");
        }
        if (q == 1) {
            return true;
        }
        return false;
    }

    public static void g(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf36c05a", new Object[]{sb});
            return;
        }
        if (z()) {
            sb.append("|nd_close_video_auto_play");
        }
        if (y()) {
            sb.append("|nd_close_image_auto_play");
        }
        if (h("nd_close_video_ref") == 1) {
            sb.append("|nd_close_video_ref");
        }
        if (h("nd_no_data_fetch") == 1) {
            sb.append("|nd_no_data_fetch");
        }
        if (C0()) {
            sb.append("|nd_close_log");
        }
        if (x()) {
            sb.append("|nd_close_image_auto_load");
        }
        if (C()) {
            sb.append("|nd_degrade_image_blur");
        }
        if (t()) {
            sb.append("|nd_black_bg_align");
        }
    }
}
