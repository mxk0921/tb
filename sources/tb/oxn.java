package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.DaemonWorker;
import com.taobao.adaemon.g;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oxn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOOST_CPU_FREQ_LIMIT = "boost_cpu_freq_limit";
    public static final String CPU_DUMP_LEVEL = "cpu_dump_level";
    public static final String DUMP_PERIOD = "dump_period";
    public static final String INPUT_LIMIT_DEVICE = "input_limit_device";
    public static final int MEM_MONITOR_INTERVAL_DEFAULT = 30;
    public static final String SCREEN_OFF_DELAY = "screen_off_delay";
    public static final String WORK_BACKGROUND_DELAY = "work_background_delay";
    public static final String WORK_INTERVAL = "work_interval";
    public static final String WORK_MAX_TIME = "work_max_time";
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    /* renamed from: a  reason: collision with root package name */
    public Context f25732a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                oxn.a(oxn.this, "home_page_to_bg", OrangeConfig.getInstance().getConfig("adaemon", "home_page_to_bg", null));
                oxn.this.I(oxn.WORK_BACKGROUND_DELAY, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.WORK_BACKGROUND_DELAY, String.valueOf((int) DaemonWorker.DEFAULT_WORK_BACKGROUND_DELAY))));
                oxn.this.I(oxn.BOOST_CPU_FREQ_LIMIT, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.BOOST_CPU_FREQ_LIMIT, "10")));
                oxn.this.I(oxn.WORK_INTERVAL, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.WORK_INTERVAL, String.valueOf((int) DaemonWorker.MIN_WORK_INTERVAL))));
                oxn.this.I(oxn.WORK_MAX_TIME, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.WORK_MAX_TIME, String.valueOf(30))));
                oxn.b(oxn.this, "kill_self", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "kill_self", String.valueOf(false))));
                oxn.this.I(oxn.SCREEN_OFF_DELAY, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.SCREEN_OFF_DELAY, String.valueOf(60000))));
                oxn.this.I("mem_monitor_interval", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "mem_monitor_interval", String.valueOf(30))));
                oxn.this.I("ac_svc_times", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "ac_svc_times", "5")));
                oxn.this.I("push_svc_times", Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", "push_svc_times", "2")));
                oxn.b(oxn.this, "normal_update", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "normal_update", String.valueOf(true))));
                oxn.a(oxn.this, "main_proc_start_strategy", OrangeConfig.getInstance().getConfig("adaemon", "main_proc_start_strategy", ""));
                oxn.a(oxn.this, "block_stack_strategy", OrangeConfig.getInstance().getConfig("adaemon", "block_stack_strategy", "tao,mtop,danmaku,alibaba,me.ele,tmall,com.uc"));
                oxn.a(oxn.this, "calc_cpu_activity", OrangeConfig.getInstance().getConfig("adaemon", "calc_cpu_activity", "com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity,com.taobao.tao.welcome.Welcome,com.taobao.tao.TBMainActivity"));
                oxn.a(oxn.this, "clear_activity_block", OrangeConfig.getInstance().getConfig("adaemon", "clear_activity_block", BundleSplitUtil.ACTIVITY_NAME));
                oxn.a(oxn.this, "forbid_clear_link_activity_switch", OrangeConfig.getInstance().getConfig("adaemon", "forbid_clear_link_activity_switch", ""));
                oxn.a(oxn.this, "app_list", OrangeConfig.getInstance().getConfig("adaemon", "app_list", ""));
                oxn.b(oxn.this, "channel_mem_art", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "channel_mem_art", String.valueOf(true))));
                oxn.b(oxn.this, "clear_link_back_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "clear_link_back_switch", "true")));
                oxn.b(oxn.this, "patch_restart_switch", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "patch_restart_switch", "false")));
                oxn.a(oxn.this, "power_collect_brand", OrangeConfig.getInstance().getConfig("adaemon", "power_collect_brand", "OPPO"));
                oxn.a(oxn.this, "boost_cpu_brand", OrangeConfig.getInstance().getConfig("adaemon", "boost_cpu_brand", "vivo,Xiaomi,Redmi,OPPO"));
                oxn.b(oxn.this, "lock_frame_rate", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "lock_frame_rate", "true")));
                oxn.b(oxn.this, "boost_frame_rate", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "boost_frame_rate", "true")));
                oxn.b(oxn.this, "all_mem_record", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "all_mem_record", String.valueOf(false))));
                oxn.this.I(oxn.CPU_DUMP_LEVEL, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.CPU_DUMP_LEVEL, String.valueOf(20000))));
                oxn.this.I(oxn.DUMP_PERIOD, Integer.parseInt(OrangeConfig.getInstance().getConfig("adaemon", oxn.DUMP_PERIOD, String.valueOf(100))));
                oxn.a(oxn.this, oxn.INPUT_LIMIT_DEVICE, OrangeConfig.getInstance().getConfig("adaemon", oxn.INPUT_LIMIT_DEVICE, ""));
                oxn.b(oxn.this, "stack_dump", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("adaemon", "stack_dump", "true")));
            } catch (Exception e) {
                s55.h("RemoteConfig", "[onConfigUpdate] error.", null, e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static final oxn S_INSTANCE = new oxn(null);

        static {
            t2o.a(349175866);
        }
    }

    static {
        t2o.a(349175864);
    }

    public /* synthetic */ oxn(a aVar) {
        this();
    }

    public static /* synthetic */ void a(oxn oxnVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaa8df9", new Object[]{oxnVar, str, str2});
        } else {
            oxnVar.J(str, str2);
        }
    }

    public static /* synthetic */ void b(oxn oxnVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b85b86", new Object[]{oxnVar, str, new Boolean(z)});
        } else {
            oxnVar.K(str, z);
        }
    }

    public static oxn s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxn) ipChange.ipc$dispatch("357c383e", new Object[0]);
        }
        return b.S_INSTANCE;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4092652", new Object[]{this})).intValue();
        }
        return l(this.f25732a, "push_svc_times", 2);
    }

    public void B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        M(context);
        OrangeConfig.getInstance().registerListener(new String[]{"adaemon"}, new a(), true);
    }

    public final boolean C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fc2aea3", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !g.P()) {
            return false;
        }
        try {
            String[] split = str.split("-");
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(o());
            if (appKeepAliveBucketId < parseInt || appKeepAliveBucketId > parseInt2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c052763", new Object[]{this})).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean contains = m(this.f25732a, "boost_cpu_brand", "vivo,Xiaomi,Redmi,OPPO").contains(Build.BRAND);
        c = Boolean.valueOf(contains);
        return contains;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8b74328", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "boost_frame_rate", true);
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12db881a", new Object[]{this})).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean n = n(this.f25732a, "lock_frame_rate", true);
        d = Boolean.valueOf(n);
        return n;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84182743", new Object[]{this})).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean contains = m(this.f25732a, "power_collect_brand", "OPPO").contains(Build.BRAND);
        b = Boolean.valueOf(contains);
        return contains;
    }

    public void M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else if (this.f25732a == null && context != null) {
            this.f25732a = context;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e07a372", new Object[]{this})).booleanValue();
        }
        return C(m(this.f25732a, "forbid_clear_link_activity_switch", ""));
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56e3f636", new Object[]{this})).intValue();
        }
        return l(this.f25732a, "ac_svc_times", 5);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20abe766", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "all_mem_record", false);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89a08963", new Object[]{this})).booleanValue();
        }
        try {
            return !TextUtils.isEmpty(m(this.f25732a, "app_list", ""));
        } catch (Throwable unused) {
            return false;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff3d7e62", new Object[]{this})).intValue();
        }
        return l(o(), BOOST_CPU_FREQ_LIMIT, 10);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adc9356d", new Object[]{this});
        }
        return m(this.f25732a, "calc_cpu_activity", "com.taobao.android.layoutmanager.container.MultiPageTransparentContainerActivity,com.taobao.tao.welcome.Welcome,com.taobao.tao.TBMainActivity");
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e27686", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "channel_mem_art", true);
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73a4ae1b", new Object[]{this});
        }
        try {
            String m = m(this.f25732a, "clear_activity_block", BundleSplitUtil.ACTIVITY_NAME);
            if (!TextUtils.isEmpty(m)) {
                return Arrays.asList(m.split(","));
            }
        } catch (Throwable th) {
            s55.h("RemoteConfig", "getClearActivityBlockList err", th, new Object[0]);
        }
        return Collections.emptyList();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2ab6d97", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "clear_link_back_switch", true);
    }

    public int l(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534db58a", new Object[]{this, context, str, new Integer(i)})).intValue();
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getInt(str, i);
        } catch (Exception e) {
            s55.h("RemoteConfig", "getConfigFromSP fail:", null, e, "key", str);
            return i;
        }
    }

    public String m(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1833f5aa", new Object[]{this, context, str, str2});
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getString(str, str2);
        } catch (Exception e) {
            s55.h("RemoteConfig", "getConfigFromSP fail:", e, "key", str);
            return str2;
        }
    }

    public final boolean n(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("534df56c", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return context.getSharedPreferences("adaemon", 4).getBoolean(str, z);
        } catch (Exception e) {
            s55.h("RemoteConfig", "getConfigFromSP fail:", e, "key", str);
            return z;
        }
    }

    public final Context o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.f25732a;
        if (context == null) {
            return g.l();
        }
        return context;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6c49d18", new Object[]{this})).intValue();
        }
        return l(this.f25732a, CPU_DUMP_LEVEL, 20000);
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f48c87f5", new Object[]{this});
        }
        return m(this.f25732a, "home_page_to_bg", null);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3353dc", new Object[]{this});
        }
        return m(o(), INPUT_LIMIT_DEVICE, "");
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afc1cb", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "kill_self", false);
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63600761", new Object[]{this})).booleanValue();
        }
        return g.P();
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3878a929", new Object[]{this});
        }
        return m(this.f25732a, "main_proc_start_strategy", "");
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1768301a", new Object[]{this})).intValue();
        }
        return l(this.f25732a, "mem_monitor_interval", 30);
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1d7c91", new Object[]{this})).booleanValue();
        }
        return n(o(), "normal_update", true);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d837ee0", new Object[]{this})).booleanValue();
        }
        if (!f.c(f.KEY_PROVIDER_PREWARM) || !f.i()) {
            return false;
        }
        return true;
    }

    public oxn() {
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953624bc", new Object[]{this})).booleanValue();
        }
        return n(this.f25732a, "patch_restart_switch", false);
    }

    public void H(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d83e7b8", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).edit();
            edit.putInt("version", i);
            edit.apply();
            s55.g("RemoteConfig", "saveAccsVersionCode", null, "version", Integer.valueOf(i));
        } catch (Throwable th) {
            s55.h("RemoteConfig", "saveAccsVerionCode", th, new Object[0]);
        }
    }

    public void L(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c17ba97", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("adaemon", 4).edit();
            edit.putInt("triggerType", i);
            edit.apply();
            s55.g("RemoteConfig", "saveTriggerType", null, "triggerType", Integer.valueOf(i));
        } catch (Throwable th) {
            s55.h("RemoteConfig", "saveTriggerType", th, new Object[0]);
        }
    }

    public void I(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b562d6db", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            if (this.f25732a == null) {
                s55.g("RemoteConfig", "saveConfigToSP context null", new Object[0]);
                this.f25732a = re.r();
            }
            SharedPreferences.Editor edit = this.f25732a.getSharedPreferences("adaemon", 4).edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e) {
            s55.h("RemoteConfig", "saveConfigToSP fail:", null, e, "key", str, "value", Integer.valueOf(i));
        }
        s55.g("RemoteConfig", "saveConfigToSP", "key", str, "value", Integer.valueOf(i));
    }

    public final void J(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432bf0f2", new Object[]{this, str, str2});
            return;
        }
        try {
            if (this.f25732a == null) {
                s55.g("RemoteConfig", "saveTLogOffToSP context null", new Object[0]);
                this.f25732a = re.r();
            }
            SharedPreferences.Editor edit = this.f25732a.getSharedPreferences("adaemon", 4).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e) {
            s55.h("RemoteConfig", "saveConfigToSP fail:", e, "key", str, "value", str2);
        }
        s55.g("RemoteConfig", "saveConfigToSP", "key", str, "value", str2);
    }

    public final void K(String str, boolean z) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56316ac", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            context = this.f25732a;
        } catch (Exception e) {
            s55.h("RemoteConfig", "saveConfigToSP fail:", null, e, "key", str, "value", Boolean.valueOf(z));
        }
        if (context == null) {
            s55.g("RemoteConfig", "saveConfigToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("adaemon", 4).edit();
        edit.putBoolean(str, z);
        edit.apply();
        s55.g("RemoteConfig", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
    }
}
