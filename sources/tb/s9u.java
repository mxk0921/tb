package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoExceptionReporter;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.falco.FalcoLifecycleActionMonitor;
import com.taobao.falco.FalcoLoadActionMonitor;
import com.taobao.falco.f;
import com.taobao.falco.j;
import com.taobao.falco.m;
import com.taobao.falco.n;
import com.taobao.falco.s;
import com.taobao.falco.u;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import tb.bw9;
import tb.eck;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s9u extends eck implements tz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DIAGNOSE_REPORT_ENABLE = "falco_diagnose_report_enable";
    public static final String KEY_DIAGNOSE_TRIGGER_PERIOD = "falco_diagnose_trigger_period";
    public static final String KEY_DIAGNOSE_TRIGGER_THRESHOLD = "falco_diagnose_trigger_threshold";
    public static final String KEY_ENV_CPU_REPORT_ENABLE = "env_cpu_report_v2_enable";
    public static final String KEY_ENV_ENABLE = "falco_env_enable";
    public static final String KEY_ENV_INJECT_ENABLE = "env_inject_enable";
    public static final String KEY_ENV_REPORT_LIST = "env_report_whitelist";
    public static final String KEY_EXCEPTION_REPORTER_ENABLE = "falco_exception_reporter_enable";
    public static final String KEY_GC_MONITOR_ENABLE = "falco_gc_monitor_enable";
    public static final String KEY_LIFECYCLE_ENABLE = "falco_lifecycle_enable";
    public static final String KEY_LOAD_ENABLE = "falco_load_enable";
    public static final String KEY_LOAD_HOOK_ACTIVITY_ENABLE = "load_hook_activity_enable";
    public static final String KEY_LOAD_HOOK_WINDOW_ENABLE = "load_hook_window_enable";
    public static final String KEY_LOAD_HOOK_WINDOW_GLOBAL_ENABLE = "load_hook_window_global_enable";
    public static final String KEY_METRICS_SCENE_LIST = "ut_scene_whitelist";
    public static final String KEY_MODULE_LIST = "log_module_whitelist";
    public static final String KEY_RIVER_LOG_ENABLE = "falco_riverlog_enable";
    public static final String KEY_SCENE_LIST = "log_scene_whitelist";
    public static final String KEY_SCROLL_GC_MONITOR_ENABLE = "falco_scroll_gc_enable";
    public static final String KEY_V3_ENABLE = "falco_enable";
    public static final String KEY_WEAK_GC_MONITOR_ENABLE = "falco_weak_gc_enable";
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public volatile boolean i;
    public CopyOnWriteArrayList<String> j;
    public CopyOnWriteArrayList<String> k;
    public CopyOnWriteArrayList<String> l;
    public CopyOnWriteArrayList<String> m;
    public fz8 n;
    public pti o;
    public SharedPreferences p;
    public FalcoLoadActionMonitor q;
    public nz8 r;
    public e8s s;
    public final List<String> t;
    public final List<String> u;
    public FalcoLifecycleActionMonitor v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s9u f27893a = new s9u();

        public static /* synthetic */ s9u a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s9u) ipChange.ipc$dispatch("4976d68a", new Object[0]);
            }
            return f27893a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends eck.a implements tz8.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String e;
        public final String f;

        public c(String str, String str2) {
            super(s9u.this, str2);
            this.f = str2;
            this.e = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1885646137:
                    return cVar.t((String) objArr[0], (String) objArr[1]);
                case -1630211365:
                    return cVar.r(((Number) objArr[0]).longValue());
                case -630878577:
                    return cVar.s((String) objArr[0], (Number) objArr[1]);
                case -293821156:
                    return super.k((String) objArr[0], (raq) objArr[1]);
                case -102619999:
                    return cVar.p();
                case 153293479:
                    return cVar.u((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
                case 826814360:
                    return cVar.v((ess) objArr[0], objArr[1]);
                case 1220063400:
                    return cVar.l((paq) objArr[0]);
                case 1682996777:
                    return super.b((raq) objArr[0]);
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/Tracer$OTSpanBuilder");
            }
        }

        @Override // tb.tz8.a
        public oz8 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oz8) ipChange.ipc$dispatch("8f204f9d", new Object[]{this, str});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new pz8(s9u.this, this.f, this.e, n, o(), m(), str);
        }

        @Override // tb.tz8.a
        public vy8 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vy8) ipChange.ipc$dispatch("7866c1", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new nn4(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public uy8 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uy8) ipChange.ipc$dispatch("bf693dfd", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new bo2(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public m e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("15d34978", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new n(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public tz8.a f(paq paqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tz8.a) ipChange.ipc$dispatch("61da33e1", new Object[]{this, paqVar});
            }
            return (tz8.a) l(paqVar);
        }

        @Override // tb.tz8.a
        public tz8.a g(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tz8.a) ipChange.ipc$dispatch("981ac3d4", new Object[]{this, new Long(j)});
            }
            return (tz8.a) r(j);
        }

        @Override // tb.tz8.a
        public gz8 h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gz8) ipChange.ipc$dispatch("21ba01c5", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new atj(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public sy8 i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sy8) ipChange.ipc$dispatch("f21c5a21", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new mr(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public s j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("d504b3ae", new Object[]{this});
            }
            long n = n();
            if (n() <= 0) {
                n = cck.H0();
            }
            x();
            return new ez8(s9u.this, this.f, this.e, n, o(), m());
        }

        @Override // tb.tz8.a
        public oz8 start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oz8) ipChange.ipc$dispatch("7564d7e7", new Object[]{this});
            }
            return a("");
        }

        /* renamed from: w */
        public tz8.a k(String str, raq raqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tz8.a) ipChange.ipc$dispatch("d22a0155", new Object[]{this, str, raqVar});
            }
            return (tz8.a) super.k(str, raqVar);
        }

        public final void x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6872143", new Object[]{this});
            } else if (m().isEmpty() && !q() && s9u.this.H().a() != null) {
                f(s9u.this.H().a());
            }
        }

        @Override // tb.eck.a, tb.tz8.a
        public tz8.a b(raq raqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tz8.a) ipChange.ipc$dispatch("35a81ca2", new Object[]{this, raqVar}) : (tz8.a) super.b(raqVar);
        }
    }

    public static /* synthetic */ Object ipc$super(s9u s9uVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1271330407) {
            return s9uVar.r();
        }
        if (hashCode == 1772063676) {
            return s9uVar.l((paq) objArr[0]);
        }
        if (hashCode == 2047587167) {
            return s9uVar.m();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/analysis/v3/Tracer");
    }

    public static s9u u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s9u) ipChange.ipc$dispatch("12aed364", new Object[0]);
        }
        return b.a();
    }

    public boolean A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af205101", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.j.size() <= 0) {
            return false;
        }
        return this.j.contains(str);
    }

    public boolean B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180dc21f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.k.size() <= 0) {
            return false;
        }
        return this.k.contains(str);
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("676ae710", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public pti D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pti) ipChange.ipc$dispatch("2750b766", new Object[]{this});
        }
        return this.o;
    }

    public void F(fz8 fz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305f1642", new Object[]{this, fz8Var});
        } else {
            this.n = fz8Var;
        }
    }

    public final void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec5db5d", new Object[]{this, str});
            return;
        }
        SharedPreferences sharedPreferences = this.p;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public kz8 H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kz8) ipChange.ipc$dispatch("28100761", new Object[]{this});
        }
        return (kz8) r();
    }

    public e8s I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8s) ipChange.ipc$dispatch("1b061c93", new Object[]{this});
        }
        return this.s;
    }

    public final Boolean J(String str, String str2) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("15a0770d", new Object[]{this, str, str2});
        }
        try {
            config = OrangeConfig.getInstance().getConfig(str, str2, null);
        } catch (Exception e) {
            ALog.e("falco.Tracer", "[updateBoolConfig] error for key " + str2, null, e, new Object[0]);
        }
        if (!TextUtils.isEmpty(config)) {
            Boolean valueOf = Boolean.valueOf(config);
            SharedPreferences sharedPreferences = this.p;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str2, valueOf.booleanValue()).apply();
            }
            return valueOf;
        }
        G(str2);
        return null;
    }

    public final Long K(String str, String str2) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("655fb33", new Object[]{this, str, str2});
        }
        try {
            config = OrangeConfig.getInstance().getConfig(str, str2, null);
        } catch (Exception e) {
            ALog.e("falco.Tracer", "[updateLongConfig] error for key " + str2, null, e, new Object[0]);
        }
        if (!TextUtils.isEmpty(config)) {
            Long valueOf = Long.valueOf(config);
            SharedPreferences sharedPreferences = this.p;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str2, valueOf.longValue()).apply();
            }
            return valueOf;
        }
        G(str2);
        return null;
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf96ca62", new Object[]{this, str});
            return;
        }
        Iterator it = ((ArrayList) this.t).iterator();
        while (it.hasNext()) {
            J(str, (String) it.next());
        }
        Iterator it2 = ((ArrayList) this.u).iterator();
        while (it2.hasNext()) {
            K(str, (String) it2.next());
        }
        M(str, "ut_high_sample_rules");
        M(str, "report_tmq_name_list");
        Boolean J = J(str, KEY_RIVER_LOG_ENABLE);
        if (J != null) {
            this.e = J.booleanValue();
        }
        CopyOnWriteArrayList<String> N = N(str, KEY_ENV_REPORT_LIST);
        if (N != null) {
            this.m = N;
        }
        CopyOnWriteArrayList<String> N2 = N(str, KEY_MODULE_LIST);
        if (N2 != null) {
            this.j = N2;
        }
        CopyOnWriteArrayList<String> N3 = N(str, KEY_SCENE_LIST);
        if (N3 != null) {
            this.k = N3;
        }
        CopyOnWriteArrayList<String> N4 = N(str, KEY_METRICS_SCENE_LIST);
        if (N4 != null) {
            this.l = N4;
        }
    }

    public final String M(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e073ad49", new Object[]{this, str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(str, str2, null);
            O(str2, config);
            return config;
        } catch (Exception e) {
            ALog.e("falco.Tracer", "[updateStringConfig] error for key " + str2, null, e, new Object[0]);
            return null;
        }
    }

    public final CopyOnWriteArrayList<String> N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("56c27862", new Object[]{this, str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(str, str2, null);
            O(str2, config);
            if (!TextUtils.isEmpty(config)) {
                return E(config, new String[0]);
            }
        } catch (Exception e) {
            ALog.e("falco.Tracer", "[updateStringListConfig] error for key " + str2, null, e, new Object[0]);
        }
        return null;
    }

    public void O(String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e406709b", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && (sharedPreferences = this.p) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!TextUtils.isEmpty(str2)) {
                edit.putString(str, str2).apply();
            } else {
                edit.remove(str).apply();
            }
        }
    }

    public FalcoLifecycleActionMonitor P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoLifecycleActionMonitor) ipChange.ipc$dispatch("e9f52a5c", new Object[]{this});
        }
        return this.v;
    }

    public FalcoLoadActionMonitor Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoLoadActionMonitor) ipChange.ipc$dispatch("dafc1e9a", new Object[]{this});
        }
        return this.q;
    }

    @Override // tb.tz8
    public void a(s.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efda1bd", new Object[]{this, bVar});
            return;
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.q;
        if (falcoLoadActionMonitor != null) {
            falcoLoadActionMonitor.r0(bVar);
        }
    }

    @Override // tb.tz8
    public FalcoExceptionReporter b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("f48fe12d", new Object[]{this});
        }
        return new j();
    }

    @Override // tb.tz8
    public Map<String, String> c(raq raqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9c29508", new Object[]{this, raqVar});
        }
        HashMap hashMap = new HashMap();
        o(raqVar, bw9.a.TEXT_MAP, new wlt(hashMap));
        return hashMap;
    }

    @Override // tb.tz8
    public tz8.a d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tz8.a) ipChange.ipc$dispatch("efe816a4", new Object[]{this, str, str2});
        }
        return new c(str, str2);
    }

    @Override // tb.tz8
    public s e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("da9b259f", new Object[]{this});
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.q;
        if (falcoLoadActionMonitor != null) {
            return falcoLoadActionMonitor.q0();
        }
        return null;
    }

    @Override // tb.tz8
    public m f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("9bd17867", new Object[]{this});
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.q;
        if (falcoLoadActionMonitor != null) {
            return falcoLoadActionMonitor.m0();
        }
        return null;
    }

    @Override // tb.tz8
    public mz8 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz8) ipChange.ipc$dispatch("4738185a", new Object[]{this});
        }
        return this.r;
    }

    @Override // tb.tz8
    public f getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("31bc62ba", new Object[]{this});
        }
        return FalcoEnvironmentImpl.m();
    }

    @Override // tb.tz8
    public u h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("3609ac9a", new Object[]{this});
        }
        return this.q;
    }

    @Override // tb.tz8
    public fz8 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fz8) ipChange.ipc$dispatch("224255c3", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.tz8
    public void j(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db332407", new Object[]{this, aVar});
            return;
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.q;
        if (falcoLoadActionMonitor != null) {
            falcoLoadActionMonitor.n0(aVar);
        }
    }

    @Override // tb.tz8
    public raq k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (raq) ipChange.ipc$dispatch("4dfc557a", new Object[]{this, map});
        }
        return n(bw9.a.TEXT_MAP, new wlt(map));
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c26052a3", new Object[]{this})).longValue();
        }
        return this.h;
    }

    public long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d741d1f", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            w(yy8.a());
        }
    }

    public boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbf3b3d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.m.contains(str);
    }

    public boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68926a6d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.l.contains(str);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1fbf3e9", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public s9u() {
        super(new lz8());
        this.d = true;
        this.e = true;
        this.f = false;
        this.g = l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS;
        this.h = m.CONFIG_TRACK_1022_INTERVAL_TIME;
        this.i = false;
        this.j = new CopyOnWriteArrayList<>();
        this.k = new CopyOnWriteArrayList<>();
        this.l = new CopyOnWriteArrayList<>();
        this.m = new CopyOnWriteArrayList<>();
        ArrayList arrayList = new ArrayList(17);
        this.t = arrayList;
        arrayList.add(KEY_V3_ENABLE);
        arrayList.add(KEY_LOAD_ENABLE);
        arrayList.add(KEY_LOAD_HOOK_ACTIVITY_ENABLE);
        arrayList.add(KEY_LIFECYCLE_ENABLE);
        arrayList.add(KEY_LOAD_HOOK_WINDOW_ENABLE);
        arrayList.add(KEY_ENV_ENABLE);
        arrayList.add(KEY_ENV_INJECT_ENABLE);
        arrayList.add(KEY_ENV_CPU_REPORT_ENABLE);
        arrayList.add(KEY_EXCEPTION_REPORTER_ENABLE);
        arrayList.add(KEY_GC_MONITOR_ENABLE);
        arrayList.add(KEY_SCROLL_GC_MONITOR_ENABLE);
        arrayList.add(KEY_WEAK_GC_MONITOR_ENABLE);
        arrayList.add(KEY_DIAGNOSE_REPORT_ENABLE);
        arrayList.add(KEY_LOAD_HOOK_WINDOW_GLOBAL_ENABLE);
        arrayList.add("falco_report_tmq_enable");
        arrayList.add("falco_report_launch_ut");
        arrayList.add("falco_um_perception_enable");
        ArrayList arrayList2 = new ArrayList(3);
        this.u = arrayList2;
        arrayList2.add(KEY_DIAGNOSE_TRIGGER_THRESHOLD);
        arrayList2.add(KEY_DIAGNOSE_TRIGGER_PERIOD);
        arrayList2.add("falco_rage_click_distance");
    }

    public final CopyOnWriteArrayList<String> E(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("e6cf177", new Object[]{this, str, strArr});
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (TextUtils.isEmpty(str)) {
            if (strArr != null && strArr.length > 0) {
                copyOnWriteArrayList.addAll(Arrays.asList(strArr));
            }
            return copyOnWriteArrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
        } catch (Exception e) {
            ALog.e("falco.Tracer", "parse failed", null, e, new Object[0]);
        }
        return copyOnWriteArrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0252 A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0263 A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0279 A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001a, B:17:0x0024, B:19:0x0038, B:21:0x003e, B:24:0x0049, B:26:0x0065, B:28:0x0100, B:30:0x0106, B:31:0x016b, B:33:0x0175, B:34:0x018a, B:36:0x0194, B:42:0x01a0, B:44:0x01b3, B:49:0x01bd, B:51:0x01c8, B:56:0x01d2, B:58:0x01db, B:63:0x01e5, B:65:0x01ee, B:70:0x01f8, B:71:0x0210, B:73:0x0252, B:74:0x0263, B:75:0x026c, B:77:0x0279, B:78:0x0289, B:25:0x0053), top: B:83:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void w(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s9u.w(android.content.Context):void");
    }
}
