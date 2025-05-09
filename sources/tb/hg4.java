package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.cachecleaner.monitor.config.ManualConfig;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_AVFS_CACHE = "AVFS";
    public static final String BIZ_MSG = "MSG";
    public static final String BIZ_MSG_V2 = "MSG_V2";
    public static final String BIZ_Z_CACHE = "ZCACHE";
    public static volatile hg4 f;

    /* renamed from: a  reason: collision with root package name */
    public RuleConfig f20620a = new RuleConfig();
    public ManualConfig b = new ManualConfig();
    public final Set<String> c = new HashSet();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

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
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                hg4.a(hg4.this, configs.get("monitor_config"));
                hg4.b(hg4.this, "monitor_config", configs.get("monitor_config"));
                hg4.c(hg4.this, configs.get("manual_config"));
                hg4.b(hg4.this, "manual_config", configs.get("manual_config"));
            }
        }
    }

    static {
        t2o.a(737149038);
    }

    public static /* synthetic */ void a(hg4 hg4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadeed95", new Object[]{hg4Var, str});
        } else {
            hg4Var.t(str);
        }
    }

    public static /* synthetic */ void b(hg4 hg4Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16555f20", new Object[]{hg4Var, str, str2});
        } else {
            hg4Var.s(str, str2);
        }
    }

    public static /* synthetic */ void c(hg4 hg4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ed1017", new Object[]{hg4Var, str});
        } else {
            hg4Var.u(str);
        }
    }

    public static hg4 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hg4) ipChange.ipc$dispatch("365dac58", new Object[0]);
        }
        if (f == null) {
            synchronized (hg4.class) {
                try {
                    if (f == null) {
                        f = new hg4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6061e1c6", new Object[]{this})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Globals.getApplication(), "cache_monitor_remove_diff");
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b59bbd", new Object[]{this})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Globals.getApplication(), "cache_monitor_opt");
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b36d70a8", new Object[]{this, str});
        }
        return h().getSharedPreferences("tb_cache_monitor_config", 4).getString(str, "");
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return Globals.getVersionName();
    }

    public Application h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }

    public RuleConfig i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleConfig) ipChange.ipc$dispatch("5f001a42", new Object[]{this});
        }
        return this.f20620a;
    }

    public ManualConfig k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManualConfig) ipChange.ipc$dispatch("cfd483de", new Object[]{this});
        }
        return this.b;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f1b3b58", new Object[]{this});
        }
        return h().getPackageName();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        r();
        o();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0bfec6", new Object[]{this});
        } else if (this.e.compareAndSet(false, true)) {
            t(f("monitor_config"));
            u(f("manual_config"));
        }
    }

    public boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("709051aa", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.c).contains(str);
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5339d23", new Object[]{this, str});
        } else {
            ((HashSet) this.c).add(str);
        }
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            Log.e("CacheMonitorConfig", "updateRules: config is empty!");
        } else {
            try {
                RuleConfig ruleConfig = (RuleConfig) JSON.toJavaObject(JSON.parseObject(str), RuleConfig.class);
                if (ruleConfig != null) {
                    this.f20620a = ruleConfig;
                }
            } catch (Throwable th) {
                Log.e("CacheMonitorConfig", "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            StringBuilder sb = new StringBuilder("updateRules: update rules success, rules : [");
            sb.append(str);
            sb.append("] ");
        }
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09c79e2", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            Log.e("CacheMonitorConfig", "updateRules: config is empty!");
        } else {
            try {
                ManualConfig manualConfig = (ManualConfig) JSON.toJavaObject(JSON.parseObject(str), ManualConfig.class);
                if (manualConfig != null) {
                    this.b = manualConfig;
                }
            } catch (Throwable th) {
                Log.e("CacheMonitorConfig", "updateManualConfig: update config failed!");
                th.printStackTrace();
            }
            StringBuilder sb = new StringBuilder("updateManualConfig: update config success, rules : [");
            sb.append(str);
            sb.append("] ");
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e610988c", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 26 || !ABGlobal.isFeatureOpened(Globals.getApplication(), "cache_monitor_opt")) {
            return false;
        }
        return true;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[]{this});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"tb_cache_monitor_config"}, new a(), true);
        } catch (Throwable th) {
            Log.e("CacheMonitorConfig", "registerOrangeListener: occur exception, maybe orange is not initialized!");
            th.printStackTrace();
        }
    }

    public final void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e91053", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = h().getSharedPreferences("tb_cache_monitor_config", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857b9415", new Object[]{this});
        } else if (this.d.compareAndSet(false, true)) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("tb_cache_monitor_config");
            if (configs != null) {
                String str = configs.get("monitor_config");
                t(str);
                s("monitor_config", str);
                String str2 = configs.get("manual_config");
                u(str2);
                s("manual_config", str2);
                return;
            }
            t(f("monitor_config"));
            u(f("manual_config"));
        } else {
            TLog.loge(yr2.MODULE, "CacheMonitorConfig", "initOrangeConfig: config has been initialized.");
        }
    }
}
