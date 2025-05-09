package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class f9l implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NS_SDK_CONFIG = "yixiu_sdk_config";
    public static f9l V;

    /* renamed from: a  reason: collision with root package name */
    public Context f19117a;
    public boolean b = true;
    public final Set<Long> c = new HashSet();
    public final Object d = new Object();
    public final Set<Long> e = new HashSet();
    public final Object f = new Object();
    public final Set<Long> g = new HashSet();
    public final Object h = new Object();
    public long i = m.CONFIG_TRACK_1022_INTERVAL_TIME;
    public long j = m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
    public long k = 60000;
    public boolean l = true;
    public boolean m = true;
    public final Set<String> n = new HashSet();
    public final Object o = new Object();
    public boolean p = true;
    public boolean q = true;
    public boolean r = true;
    public boolean s = false;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public int w = 10;
    public long x = 86400000;
    public boolean y = true;
    public boolean z = false;
    public final Set<String> A = new HashSet();
    public boolean B = true;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean G = true;
    public boolean H = true;
    public boolean I = true;
    public boolean J = true;
    public boolean K = true;
    public boolean L = true;
    public boolean M = true;
    public boolean N = true;
    public boolean O = true;
    public boolean P = true;
    public boolean Q = false;
    public boolean R = true;
    public boolean S = true;
    public boolean T = false;
    public boolean U = true;

    static {
        t2o.a(961544346);
        t2o.a(613416995);
    }

    public static f9l c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f9l) ipChange.ipc$dispatch("5553b326", new Object[0]);
        }
        if (V == null) {
            synchronized (f9l.class) {
                try {
                    if (V == null) {
                        V = new f9l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return V;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8f04683", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("900948ba", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6e7780", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95bc079c", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb3d191", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("587741bb", new Object[]{this})).booleanValue();
        }
        return this.L;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26594523", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c42b0e", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean I(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790a7063", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.d) {
                    contains = ((HashSet) this.c).contains(l);
                }
                return contains;
            } catch (Throwable th) {
                ku0.j("OrangeConfigService.isTrack1022ExperimentDisabled", th);
            }
        }
        return false;
    }

    public boolean J(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8651ace", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.h) {
                    contains = ((HashSet) this.g).contains(l);
                }
                return contains;
            } catch (Throwable th) {
                ku0.j("OrangeConfigService.isTrack1022ExperimentEnabled", th);
            }
        }
        return false;
    }

    public boolean K(Long l) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd638ee5", new Object[]{this, l})).booleanValue();
        }
        if (l != null && l.longValue() > 0) {
            try {
                synchronized (this.f) {
                    contains = ((HashSet) this.e).contains(l);
                }
                return contains;
            } catch (Throwable th) {
                ku0.j("OrangeConfigService.isTrack1022GroupDisabled", th);
            }
        }
        return false;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68aab0c", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e456ed9c", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9015414", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.A).contains(str);
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80451bfc", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8667d462", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d925e6", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public final void S(String str) {
        long[] m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42de05c", new Object[]{this, str});
            return;
        }
        try {
            ogh.e("OrangeConfigService", "checkTrack1022DisabledExperimentsUpdate. value=" + str);
            synchronized (this.d) {
                ((HashSet) this.c).clear();
                if (!TextUtils.isEmpty(str) && (m = wyv.m(str)) != null && m.length > 0) {
                    for (long j : m) {
                        ((HashSet) this.c).add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("OrangeConfigService.processTrack1022DisabledExpStr", th);
        }
    }

    public final void T(String str) {
        long[] m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e86137", new Object[]{this, str});
            return;
        }
        try {
            ogh.e("OrangeConfigService", "checkTrack1022DisabledGroupsUpdate. value=" + str);
            synchronized (this.f) {
                ((HashSet) this.e).clear();
                if (!TextUtils.isEmpty(str) && (m = wyv.m(str)) != null && m.length > 0) {
                    for (long j : m) {
                        ((HashSet) this.e).add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("OrangeConfigService.processTrack1022DisabledGroupsStr", th);
        }
    }

    public final void U(String str) {
        long[] m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e369458b", new Object[]{this, str});
            return;
        }
        try {
            ogh.e("OrangeConfigService", "checkTrack1022EnabledExperimentsUpdate. value=" + str);
            synchronized (this.h) {
                ((HashSet) this.g).clear();
                if (!TextUtils.isEmpty(str) && (m = wyv.m(str)) != null && m.length > 0) {
                    for (long j : m) {
                        ((HashSet) this.g).add(Long.valueOf(j));
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("OrangeConfigService.processTrack1022EnabledExpStr", th);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d33a1c9c", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf826886", new Object[]{this})).longValue();
        }
        return this.k;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c04cd", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76627e81", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c3de61a", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44423c49", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a681be39", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb701e10", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9c80c2", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843120e7", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142fc4a", new Object[]{this})).booleanValue();
        }
        return this.K;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2578988", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf99b052", new Object[]{this})).booleanValue();
        }
        return this.R;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb965f9a", new Object[]{this})).booleanValue();
        }
        return this.M;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        ogh.e("OrangeConfigService", "onConfigUpdate. namespace=" + str + ", map=" + map);
        if (TextUtils.equals(str, NS_SDK_CONFIG)) {
            W(this.f19117a);
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final boolean q(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ce1b46", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        int n = wyv.n(str2, -1);
        if (n >= 0) {
            return t(n, str);
        }
        return z;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d1b37da", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f32ea162", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb54172", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6430be8e", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ade509f3", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean x(String str) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abc74ce", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            synchronized (this.o) {
                contains = ((HashSet) this.n).contains(str);
            }
            return contains;
        } catch (Throwable th) {
            ku0.j("OrangeConfigService.isNavIgnored", th);
            return false;
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c329f0f", new Object[]{this})).booleanValue();
        }
        return this.N;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("641e174c", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public void R() {
        int size;
        int size2;
        int size3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a0d12d", new Object[]{this});
        } else if (ogh.c()) {
            try {
                synchronized (this.o) {
                    Set<String> set = this.n;
                    if (set != null) {
                        i = ((HashSet) set).size();
                    }
                }
                synchronized (this.f) {
                    size = ((HashSet) this.e).size();
                }
                synchronized (this.d) {
                    size2 = ((HashSet) this.c).size();
                }
                synchronized (this.h) {
                    size3 = ((HashSet) this.g).size();
                }
                StringBuilder sb = new StringBuilder("【系统配置】全局开启：");
                if (this.l) {
                    str = "是";
                } else {
                    str = "否";
                }
                sb.append(str);
                sb.append("，触发更新开启：");
                if (this.p) {
                    str2 = "是";
                } else {
                    str2 = "否";
                }
                sb.append(str2);
                sb.append("，自动埋点开启：");
                if (this.q) {
                    str3 = "是";
                } else {
                    str3 = "否";
                }
                sb.append(str3);
                sb.append("，APP级别埋点开启：");
                if (this.r) {
                    str4 = "是";
                } else {
                    str4 = "否";
                }
                sb.append(str4);
                sb.append("，更新实验数据间隔时间：");
                sb.append(this.j);
                sb.append("毫秒，更新实验数据延时范围：");
                sb.append(this.k);
                sb.append("毫秒，稳定性监控开启：");
                if (this.s) {
                    str5 = "是";
                } else {
                    str5 = "否";
                }
                sb.append(str5);
                sb.append("，导航拦截开启：");
                if (this.m) {
                    str6 = "是";
                } else {
                    str6 = "否";
                }
                sb.append(str6);
                sb.append("，导航拦截忽略数量：");
                sb.append(i);
                sb.append("，1022埋点是否打开：");
                if (this.b) {
                    str7 = "是";
                } else {
                    str7 = "否";
                }
                sb.append(str7);
                sb.append("，1022埋点更新间隔时间：");
                sb.append(this.i);
                sb.append("毫秒，1022埋点黑名单分组数量：");
                sb.append(size);
                sb.append("，1022埋点黑名单实验数量：");
                sb.append(size2);
                sb.append("，1022埋点白名单实验数量：");
                sb.append(size3);
                sb.append("，协议完整更新间隔时间");
                sb.append(this.x);
                sb.append("毫秒，导航V2开启：");
                if (this.y) {
                    str8 = "是";
                } else {
                    str8 = "否";
                }
                sb.append(str8);
                sb.append("，UT页面生命周期监听开启：");
                if (this.v) {
                    str9 = "是";
                } else {
                    str9 = "否";
                }
                sb.append(str9);
                sb.append("，EVO激活客户端实验方法开启：");
                if (this.t) {
                    str10 = "是";
                } else {
                    str10 = "否";
                }
                sb.append(str10);
                sb.append("，EVO激活服务端实验方法开启：");
                if (this.u) {
                    str11 = "是";
                } else {
                    str11 = "否";
                }
                sb.append(str11);
                sb.append("，需要提前加载启动实验开启：");
                if (this.B) {
                    str12 = "是";
                } else {
                    str12 = "否";
                }
                sb.append(str12);
                sb.append("，刷新全局空桶实验前清除缓存：");
                if (this.D) {
                    str13 = "是";
                } else {
                    str13 = "否";
                }
                sb.append(str13);
                sb.append("，url 转换异常时候进行 dp2 埋点：");
                if (this.E) {
                    str14 = "是";
                } else {
                    str14 = "否";
                }
                sb.append(str14);
                sb.append("，支持实验冷启动生效：");
                if (this.F) {
                    str15 = "是";
                } else {
                    str15 = "否";
                }
                sb.append(str15);
                sb.append("，是否支持ACCS下发白名单：");
                if (this.G) {
                    str16 = "是";
                } else {
                    str16 = "否";
                }
                sb.append(str16);
                sb.append("，是否支持ACCS下发 beta 配置数据：");
                if (this.H) {
                    str17 = "是";
                } else {
                    str17 = "否";
                }
                sb.append(str17);
                sb.append("，是否支持变量中是开关的实验");
                if (this.I) {
                    str18 = "是";
                } else {
                    str18 = "否";
                }
                sb.append(str18);
                sb.append("，是否支持懒加载：");
                if (this.J) {
                    str19 = "是";
                } else {
                    str19 = "否";
                }
                sb.append(str19);
                sb.append("，是否支持上报异常：");
                if (this.K) {
                    str20 = "是";
                } else {
                    str20 = "否";
                }
                sb.append(str20);
                sb.append("，是否支持参数配置说明：");
                if (this.L) {
                    str21 = "是";
                } else {
                    str21 = "否";
                }
                sb.append(str21);
                sb.append("，当数据插入失败的时候，是否drop表重新创建");
                if (this.M) {
                    str22 = "是";
                } else {
                    str22 = "否";
                }
                sb.append(str22);
                sb.append("，是否支持参数正则匹配：");
                if (this.N) {
                    str23 = "是";
                } else {
                    str23 = "否";
                }
                sb.append(str23);
                sb.append("，是否支持ACCS定量灰度：");
                if (this.O) {
                    str24 = "是";
                } else {
                    str24 = "否";
                }
                sb.append(str24);
                sb.append("，是否支持URL页面埋点前缀匹配：");
                if (this.P) {
                    str25 = "是";
                } else {
                    str25 = "否";
                }
                sb.append(str25);
                sb.append("，是否支持提前分流（懒加载实验）：");
                if (this.Q) {
                    str26 = "是";
                } else {
                    str26 = "否";
                }
                sb.append(str26);
                sb.append("，是否支持数据库中记录命中次数：");
                if (this.R) {
                    str27 = "是";
                } else {
                    str27 = "否";
                }
                sb.append(str27);
                sb.append("，是否可以取消后台下载实验：");
                if (this.T) {
                    str28 = "是";
                } else {
                    str28 = "否";
                }
                sb.append(str28);
                sb.append("，是否可以mtop请求索引：");
                if (this.U) {
                    str29 = "是";
                } else {
                    str29 = "否";
                }
                sb.append(str29);
                ogh.f("OrangeConfigService", sb.toString());
            } catch (Throwable th) {
                ogh.h("OrangeConfigService", "logConfig Fail", th);
            }
        }
    }

    public void V(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3470bf17", new Object[]{this, context});
            return;
        }
        this.f19117a = context;
        OrangeConfig.getInstance().registerListener(new String[]{NS_SDK_CONFIG}, this, true);
    }

    public void W(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6853c5be", new Object[]{this, context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(NS_SDK_CONFIG);
        if (ogh.c()) {
            StringBuilder sb = new StringBuilder("OrangeConfig: ");
            if (configs == null) {
                str = "null";
            } else {
                str = configs.toString();
            }
            sb.append(str);
            ogh.i("OrangeConfigService", sb.toString());
        }
        if (!(configs == null || configs.isEmpty() || context == null)) {
            SharedPreferences.Editor edit = context.getSharedPreferences("ut-ab", 0).edit();
            try {
                String d = d3r.c().d();
                String str2 = configs.get("track_1022_disabled_experiments");
                S(str2);
                edit.putString("cf_track_1022_disabled_experiments", str2);
                String str3 = configs.get("track_1022_disabled_groups");
                T(str3);
                edit.putString("cf_track_1022_disabled_groups", str3);
                String str4 = configs.get("track_1022_enabled_experiments");
                U(str4);
                edit.putString("cf_track_1022_enabled_experiments", str4);
                boolean q = q(d + Calendar.getInstance().get(3) + "SDK", configs.get("enabled"), true);
                if (q != this.l) {
                    this.l = q;
                    edit.putBoolean("cf_enabled", q);
                }
                boolean q2 = q(d + Calendar.getInstance().get(3) + "SDK", configs.get("nav_enabled"), true);
                if (q2 != this.m) {
                    this.m = q2;
                    edit.putBoolean("cf_nav_enabled", q2);
                }
                boolean q3 = q(d + Calendar.getInstance().get(3) + "DATA_TRIGGER", configs.get("data_trigger_enabled"), true);
                if (q3 != this.p) {
                    this.p = q3;
                    edit.putBoolean("cf_data_trigger_enabled", q3);
                }
                boolean q4 = q(d + Calendar.getInstance().get(3) + "TRACK_AUTO", configs.get("track_auto_enabled"), true);
                if (q4 != this.q) {
                    this.q = q4;
                    edit.putBoolean("cf_track_auto_enabled", q4);
                }
                boolean q5 = q(d + Calendar.getInstance().get(3) + "TRACK_AUTO", configs.get("track_app_enabled"), true);
                if (q5 != this.r) {
                    this.r = q5;
                    edit.putBoolean("cf_track_app_enabled", q5);
                }
                boolean q6 = q(d + Calendar.getInstance().get(3) + "STABILITY_MONITOR", configs.get("stability_monitor_enabled"), false);
                if (q6 != this.s) {
                    this.s = q6;
                    edit.putBoolean("cf_stability_monitor_enabled", q6);
                }
                boolean q7 = q(d + "EVO_ACTIVATE", configs.get("evo_activate_client_enabled"), true);
                if (q7 != this.t) {
                    this.t = q7;
                    edit.putBoolean("cf_evo_activate_client_enabled", q7);
                }
                boolean q8 = q(d + "EVO_ACTIVATE", configs.get("evo_activate_server_enabled"), true);
                if (q8 != this.u) {
                    this.u = q8;
                    edit.putBoolean("cf_evo_activate_client_enabled", q8);
                }
                boolean q9 = q(d + "SDK", configs.get("ut_page_lifecycle_listener_enabled"), true);
                if (q9 != this.v) {
                    this.v = q9;
                    edit.putBoolean("cf_ut_page_lifecycle_listener_enabled", q9);
                }
                long j = 86400000;
                long p = wyv.p(configs.get("protocol_complete_interval_time"), 86400000L);
                if (p >= 0) {
                    j = p;
                }
                if (this.x != j) {
                    this.x = j;
                    edit.putLong("cf_protocol_complete_interval_time", j);
                }
                boolean q10 = q(d + "Nav", configs.get("nav_v2_enabled"), true);
                if (q10 != this.y) {
                    edit.putBoolean("cf_nav_v2_enabled", q10);
                }
                boolean q11 = q(d + "Fix", configs.get("rollback_last_fix"), false);
                if (q11 != this.z) {
                    edit.putBoolean("cf_rollback_last_fix", q11);
                }
                edit.putString("cf_undecode_url_experiments", configs.get("undecode_url_experiments"));
                boolean q12 = q(d + "PRELOAD", configs.get("preload_launch_experiment"), true);
                if (q12 != this.B) {
                    edit.putBoolean("cf_preload_launch_experiment", q12);
                }
                boolean q13 = q(d + "RETAIN", configs.get("retain_experiment_enable"), true);
                if (q13 != this.C) {
                    edit.putBoolean("cf_retain_experiment_enable", q13);
                }
                boolean q14 = q(d + "CLEAR_RETAIN", configs.get("clear_retain_before_refresh"), true);
                if (q14 != this.D) {
                    edit.putBoolean("cf_clear_retain_before_refresh", q14);
                }
                boolean q15 = q(d + "URL_PARSE", configs.get("url_parse_error_to_dp2"), true);
                if (q15 != this.E) {
                    edit.putBoolean("cf_url_parse_error_to_dp2", q15);
                }
                boolean q16 = q(d + "CLOD_WORK", configs.get("clod_work_enable"), true);
                if (q16 != this.F) {
                    edit.putBoolean("cf_clod_work_enable", q16);
                }
                boolean q17 = q(d + "ACCS_WHITELIST", configs.get("accs_whitelist_enable"), true);
                if (q17 != this.G) {
                    edit.putBoolean("cf_accs_whitelist_enable", q17);
                }
                boolean q18 = q(d + "ACCS_BETA", configs.get("accs_beta_enable"), true);
                if (q18 != this.H) {
                    edit.putBoolean("cf_accs_beta_enable", q18);
                }
                boolean q19 = q(d + "SWITCH_VARATION", configs.get("switch_variation_enable"), true);
                if (q19 != this.I) {
                    edit.putBoolean("cf_switch_variation_enable", q19);
                }
                boolean q20 = q(d + "LAZY_LOAD", configs.get("lazy_load_enable"), true);
                if (q20 != this.J) {
                    edit.putBoolean("cf_lazy_load_enable", q20);
                }
                boolean q21 = q(d + "VARIATION_CONFIG", configs.get("support_variation_config"), true);
                if (q21 != this.L) {
                    edit.putBoolean("cf_support_variation_config", q21);
                }
            } catch (Throwable th) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th);
            }
            try {
                boolean q22 = q(d3r.c().d() + "COMMIT_THROWABLE", configs.get("commit_throwable_enable"), true);
                if (q22 != this.K) {
                    edit.putBoolean("cf_commit_throwable_enable", q22);
                }
            } catch (Throwable unused) {
                ogh.g("OrangeConfigService", "");
            }
            try {
                if (this.m) {
                    String str5 = configs.get("nav_ignores");
                    if (TextUtils.isEmpty(str5)) {
                        synchronized (this.o) {
                            ((HashSet) this.n).clear();
                        }
                    } else {
                        String[] l = wyv.l(str5, ",", true);
                        synchronized (this.o) {
                            ((HashSet) this.n).clear();
                            if (l != null) {
                                for (String str6 : l) {
                                    ((HashSet) this.n).add(str6);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th2);
            }
            try {
                long j2 = m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
                long p2 = wyv.p(configs.get("request_experiment_data_interval_time"), m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT);
                if (p2 >= 0) {
                    j2 = p2;
                }
                if (this.j != j2) {
                    this.j = j2;
                    edit.putLong("cf_request_experiment_data_interval_time", j2);
                }
            } catch (Throwable th3) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th3);
            }
            try {
                long j3 = 60000;
                long p3 = wyv.p(configs.get("download_experiment_data_delay_time"), 60000L);
                if (p3 >= 0) {
                    j3 = p3;
                }
                if (this.k != j3) {
                    this.k = j3;
                    edit.putLong("cf_download_experiment_data_delay_time", j3);
                }
            } catch (Throwable th4) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th4);
            }
            try {
                long j4 = m.CONFIG_TRACK_1022_INTERVAL_TIME;
                long p4 = wyv.p(configs.get("track_1022_interval_time"), m.CONFIG_TRACK_1022_INTERVAL_TIME);
                if (p4 >= 0) {
                    j4 = p4;
                }
                if (this.i != j4) {
                    this.i = j4;
                    edit.putLong("cf_track_1022_interval_time", j4);
                }
            } catch (Throwable th5) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th5);
            }
            try {
                int i = 10;
                int n = wyv.n(configs.get("activate_page_track_history_size"), 10);
                if (n > 0) {
                    i = n;
                }
                if (this.w != i) {
                    this.w = i;
                    edit.putInt("cf_activate_page_track_history_size", i);
                }
            } catch (Throwable th6) {
                ku0.j("OrangeConfigService.updateConfigFromOrange", th6);
            }
            try {
                String d2 = d3r.c().d();
                boolean q23 = q(d2 + "DROP", configs.get("drop_on_insert_fail"), true);
                if (q23 != this.M) {
                    edit.putBoolean("cf_drop_on_insert_fail", q23);
                    this.M = q23;
                }
                boolean q24 = q(d2 + "PARAM_REGEX", configs.get("param_regex_match_enable"), true);
                if (q24 != this.N) {
                    edit.putBoolean("cf_param_regex_match_enable", q24);
                    this.N = q24;
                }
                boolean q25 = q(d2 + "ACCS_GREY", configs.get("key_accs_grey_enable"), true);
                if (q25 != this.O) {
                    edit.putBoolean("cf_key_accs_grey_enable", q25);
                    this.O = q25;
                }
                boolean q26 = q(d2 + "URL_PREFIX_TRACK", configs.get("url_prefix_track_enable"), true);
                if (q26 != this.P) {
                    edit.putBoolean("cf_url_prefix_track_enable", q26);
                    this.P = q26;
                }
                boolean q27 = q(d2 + "PRE_DECISION", configs.get("pre_decision_enable"), false);
                if (q27 != this.Q) {
                    edit.putBoolean("cf_pre_decision_enable", q27);
                    this.Q = q27;
                }
                boolean q28 = q(d2 + "HIT_COUNT", configs.get("db_hit_count"), true);
                if (q28 != this.R) {
                    edit.putBoolean("cf_db_hit_count", q28);
                    this.R = q28;
                }
                boolean q29 = q(d2 + "PARSE_DB_CONFIG", configs.get("parse_db_config_when_using"), true);
                if (q29 != this.S) {
                    edit.putBoolean("cf_parse_db_config_when_using", q29);
                    this.S = q29;
                }
                boolean q30 = q(d2 + "CACNEL", configs.get("cancel_bg_download_experiments_enable"), false);
                if (q30 != this.T) {
                    edit.putBoolean("cf_cancel_bg_download_experiments_enable", q30);
                    this.T = q30;
                }
                boolean q31 = q(d2 + "MTOP", configs.get("mtop_index_enable"), true);
                if (q31 != this.U) {
                    edit.putBoolean("cf_mtop_index_enable", q31);
                    this.U = q31;
                }
                boolean q32 = q(d2 + "1022Enable", configs.get("track_1022_enabled"), true);
                if (q32 != this.b) {
                    edit.putBoolean("cf_track_1022_enabled", q32);
                    this.b = q32;
                }
            } catch (Throwable th7) {
                ku0.j("OrangeConfigService.updateConfigFromOrange.immediately", th7);
            }
            edit.apply();
            R();
        }
    }

    public void X(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ca1d6f", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ut-ab", 0);
        S(sharedPreferences.getString("cf_track_1022_disabled_experiments", null));
        T(sharedPreferences.getString("cf_track_1022_disabled_groups", null));
        U(sharedPreferences.getString("cf_track_1022_enabled_experiments", null));
        this.l = sharedPreferences.getBoolean("cf_enabled", true);
        this.w = sharedPreferences.getInt("cf_activate_page_track_history_size", 10);
        this.m = sharedPreferences.getBoolean("cf_nav_enabled", true);
        this.p = sharedPreferences.getBoolean("cf_data_trigger_enabled", true);
        this.q = sharedPreferences.getBoolean("cf_track_auto_enabled", true);
        this.r = sharedPreferences.getBoolean("cf_track_app_enabled", true);
        this.j = sharedPreferences.getLong("cf_request_experiment_data_interval_time", m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT);
        this.k = sharedPreferences.getLong("cf_download_experiment_data_delay_time", 60000L);
        this.s = sharedPreferences.getBoolean("cf_stability_monitor_enabled", false);
        this.i = sharedPreferences.getLong("cf_track_1022_interval_time", m.CONFIG_TRACK_1022_INTERVAL_TIME);
        this.t = sharedPreferences.getBoolean("cf_evo_activate_client_enabled", true);
        this.u = sharedPreferences.getBoolean("cf_evo_activate_server_enabled", true);
        this.v = sharedPreferences.getBoolean("cf_ut_page_lifecycle_listener_enabled", true);
        this.x = sharedPreferences.getLong("cf_protocol_complete_interval_time", 86400000L);
        this.y = sharedPreferences.getBoolean("cf_nav_v2_enabled", true);
        this.z = sharedPreferences.getBoolean("cf_rollback_last_fix", false);
        String string = sharedPreferences.getString("cf_undecode_url_experiments", "");
        try {
            ((HashSet) this.A).clear();
            if (string != null && string.length() > 0) {
                Collections.addAll(this.A, string.split(","));
            }
        } catch (Exception e) {
            ku0.j("OrangeConfigService.updateConfigFromSp.unDecodeUrlExps", e);
        }
        this.B = sharedPreferences.getBoolean("cf_preload_launch_experiment", true);
        this.C = sharedPreferences.getBoolean("cf_retain_experiment_enable", true);
        this.D = sharedPreferences.getBoolean("cf_clear_retain_before_refresh", true);
        this.E = sharedPreferences.getBoolean("cf_url_parse_error_to_dp2", true);
        this.F = sharedPreferences.getBoolean("cf_clod_work_enable", true);
        this.G = sharedPreferences.getBoolean("cf_accs_whitelist_enable", true);
        this.H = sharedPreferences.getBoolean("cf_accs_beta_enable", true);
        this.J = sharedPreferences.getBoolean("cf_lazy_load_enable", true);
        this.I = sharedPreferences.getBoolean("cf_switch_variation_enable", true);
        this.K = sharedPreferences.getBoolean("cf_commit_throwable_enable", true);
        this.L = sharedPreferences.getBoolean("cf_support_variation_config", true);
        this.M = sharedPreferences.getBoolean("cf_drop_on_insert_fail", true);
        this.N = sharedPreferences.getBoolean("cf_param_regex_match_enable", true);
        this.O = sharedPreferences.getBoolean("cf_key_accs_grey_enable", true);
        this.P = sharedPreferences.getBoolean("cf_url_prefix_track_enable", true);
        this.Q = sharedPreferences.getBoolean("cf_pre_decision_enable", false);
        this.R = sharedPreferences.getBoolean("cf_db_hit_count", true);
        this.S = sharedPreferences.getBoolean("cf_parse_db_config_when_using", true);
        this.T = sharedPreferences.getBoolean("cf_cancel_bg_download_experiments_enable", false);
        this.U = sharedPreferences.getBoolean("cf_mtop_index_enable", true);
        this.b = sharedPreferences.getBoolean("cf_track_1022_enabled", true);
        R();
    }

    public final boolean t(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbc6eb91", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 0) {
            return false;
        }
        int abs = Math.abs(iua.a().hashString(str, m.DEFAULT_CHARSET).asInt()) % 10000;
        ogh.e("OrangeConfigService", "isInSample, seed=" + str + ", configValue=" + i + ", sample=" + abs);
        return abs < i;
    }
}
