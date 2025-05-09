package tb;

import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.minutes.collector.MTSEnvMonitor;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ith {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DecimalFormat B;
    public static HashMap<String, Boolean> C;
    public static Boolean D;
    public int A = -1;

    /* renamed from: a  reason: collision with root package name */
    public final fvh f21573a;
    public final ArrayList<mth> b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public m04 z;

    public ith(fvh fvhVar, ArrayList<mth> arrayList) {
        fvhVar = fvhVar == null ? gvh.a() : fvhVar;
        this.f21573a = fvhVar;
        this.b = arrayList;
        z(fvhVar);
    }

    public static DecimalFormat s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecimalFormat) ipChange.ipc$dispatch("63beb9d7", new Object[0]);
        }
        DecimalFormat decimalFormat = B;
        if (decimalFormat != null) {
            return decimalFormat;
        }
        DecimalFormat decimalFormat2 = new DecimalFormat("#.###");
        B = decimalFormat2;
        return decimalFormat2;
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5fd7bd", new Object[]{this, str});
        } else if (!this.x) {
            this.w = true;
            guh.a(guh.DOWNGRADE_LOG, str);
        }
    }

    public final void B(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fb8b20", new Object[]{this, iuhVar});
        } else if (iuhVar.x() == 3) {
            if (this.r) {
                A("降级: 不采集公共信息。(updateAndClearCounters)");
                return;
            }
            iuhVar.U(s());
            iuhVar.f();
        }
    }

    public final void a(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d978d2", new Object[]{this, iuhVar});
        } else if (iuhVar.z() == 1 && iuhVar.x() == 2) {
            this.w = false;
            this.x = false;
        }
    }

    public final void f(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a885f26f", new Object[]{this, iuhVar});
        } else if (iuhVar.x() == 3) {
            if (this.l) {
                A("降级: 不记录设备等级。");
            } else {
                iuhVar.T(gvh.a().m("device_level", r().b()), "tb");
            }
            if (this.m) {
                A("降级: 不统计进程创建及启动时间。");
                return;
            }
            long e = cvh.e();
            iuhVar.T(gvh.a().m("create_ts", Long.valueOf(cvh.f())).m("app_launcher_ts", Long.valueOf(cvh.d())).m("process_start_time", Long.valueOf(e)).m("launcher_type", jhg.W).m("launcher_start_ts", Long.valueOf(cvh.c())), "prog");
        }
    }

    public final void g(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628aa529", new Object[]{this, iuhVar});
        } else if (iuhVar.x() == 3) {
            if (this.r) {
                A("降级: 不采集公共信息。(collectBaseInfo02)");
            } else if (this.i) {
                A("降级: 不统计 cpu 物理核心数。");
            } else {
                iuhVar.T(gvh.a().m("cores", Integer.valueOf(MTSEnvMonitor.n().m())), APower.TYPE_CPU);
            }
        }
    }

    public final void h(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f33256", new Object[]{this, iuhVar});
        } else if (this.p) {
            A("降级: 不统计计数类型信息。");
        } else {
            oth w = MTSEnvMonitor.n().w();
            iuhVar.V(gvh.a().m("warn_cnt", Long.valueOf(w.f25642a)), "mem");
            iuhVar.V(gvh.a().m("type_change_cnt", Long.valueOf(w.b)).m("down_cnt", Long.valueOf(w.c)), "nw");
        }
    }

    public final void i(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea98094", new Object[]{this, iuhVar});
        } else if (!this.n) {
            A("feat: 开始统计数据流量相关信息。");
            ruh x = MTSEnvMonitor.n().x(this.v);
            if (x != null) {
                fvh m = gvh.a().m("data_total_tx", Float.valueOf(((float) x.f) / 1024.0f)).m("data_app_tx", Float.valueOf(((float) x.g) / 1024.0f));
                if (this.v) {
                    m.m("data_out_wifi", Float.valueOf(((float) x.f27616a) / 1024.0f)).m("data_in_wifi", Float.valueOf(((float) x.b) / 1024.0f)).m("data_out_wwan", Float.valueOf(((float) x.c) / 1024.0f)).m("data_in_wwan", Float.valueOf(((float) x.d) / 1024.0f));
                }
                iuhVar.V(m, "nw");
            }
        }
    }

    public final void j(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af502c94", new Object[]{this, iuhVar});
        } else if (this.r) {
            A("降级: 不采集公共信息。(FeaturesAndStats)");
        } else {
            long g = cvh.g() - iuhVar.v();
            fvh m = gvh.a().m("collector_delay", Long.valueOf(g));
            int i = this.c;
            if (g >= i) {
                m.m("collector_max_delay", Integer.valueOf(i));
            }
            iuhVar.T(m, g4.a.f2721a);
            fvh a2 = gvh.a();
            n(iuhVar, a2);
            if (this.k) {
                A("降级: 不统计低功耗模式状态。");
            } else if (iuhVar.x() == 3) {
                a2.m("save_mode", Boolean.valueOf(r().c()));
            }
            if (this.j) {
                A("降级: 不统计 cpu 可用核心数。");
            } else if (iuhVar.x() == 3) {
                a2.m("active_cores", Integer.valueOf(r().a()));
            }
            iuhVar.T(a2, APower.TYPE_CPU);
            if (g < this.c) {
                p(iuhVar, g);
            }
        }
    }

    public final void m(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a0d4e4", new Object[]{this, iuhVar});
        } else if (this.f) {
            A("降级: 不统计网络状态信息。");
        } else if (iuhVar.x() == 3) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (status != null) {
                iuhVar.T(gvh.a().m("type", status.getType()).m("quality", Integer.valueOf(z5r.d())).m(TBImageFlowMonitor.SPEED_MEASURE, Integer.valueOf(z5r.m())), "nw");
            } else {
                iuhVar.T(gvh.a().m("data_status", "skip"), "nw");
            }
        }
    }

    public final void p(iuh iuhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ee5ec9", new Object[]{this, iuhVar, new Long(j)});
            return;
        }
        m(iuhVar);
        l(iuhVar, j);
        h(iuhVar);
        i(iuhVar);
    }

    public final int q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9694d58e", new Object[]{this, new Boolean(z)})).intValue();
        }
        return z ? 1 : 0;
    }

    public m04 r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m04) ipChange.ipc$dispatch("751bc247", new Object[]{this});
        }
        m04 m04Var = this.z;
        if (m04Var != null) {
            return m04Var;
        }
        m04 m04Var2 = new m04();
        this.z = m04Var2;
        return m04Var2;
    }

    public final String t(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98ff2a4b", new Object[]{this, iuhVar});
        }
        if (iuhVar.s() == null || iuhVar.s().v() == null) {
            return null;
        }
        return iuhVar.s().v().a();
    }

    public final void u(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147f47b", new Object[]{this, iuhVar});
        } else if (this.y == null) {
            this.y = t(iuhVar);
        }
    }

    public void w(cuh cuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b51ea9", new Object[]{this, cuhVar});
            return;
        }
        try {
            Iterator<mth> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().b(cuhVar);
            }
        } catch (Throwable th) {
            guh.b(guh.TAG, "collector-output-processEvent error。", th);
        }
    }

    public final void z(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ab2cdc", new Object[]{this, fvhVar});
        } else if (fvhVar != null) {
            this.c = fvhVar.f("feat_delay_max", 500);
            this.d = fvhVar.f("feat_mem_usage_delay_max", 100);
            this.e = fvhVar.d("feat_disable_mem_usage_v2", false);
            this.f = fvhVar.d("feat_disable_network_stat", false);
            this.g = fvhVar.d("feat_disable_gc_event", false);
            this.h = fvhVar.d("feat_disable_gc_count", false);
            this.i = fvhVar.d("feat_disable_cpu_cores", false);
            this.j = fvhVar.d("feat_disable_active_cores", false);
            this.l = fvhVar.d("feat_disable_device_level", false);
            this.k = fvhVar.d("feat_disable_power_mode", false);
            this.m = fvhVar.d("feat_disable_process_time", false);
            this.n = fvhVar.d("feat_disable_data_tx", true);
            this.p = fvhVar.d("feat_disable_count_stat", false);
            this.q = fvhVar.d("feat_disable_thermal_stat", false);
            this.o = fvhVar.d("feat_disable_thread_info", false);
            this.r = fvhVar.d("feat_disable_all_features", false);
            this.v = this.f21573a.d("feat_enable_wifi_mobile_send_received", false);
            this.A = fvhVar.f("collect_sample_value", -1);
        }
    }

    @Deprecated
    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c25c2", new Object[]{this});
        } else if (!this.t) {
            this.t = true;
            String str = this.y;
            if (str != null) {
                this.s = this.f21573a.h("sceneConfig_".concat(str));
                guh.a(guh.DOWNGRADE_LOG, "场景降级控制: config:" + this.s + " sceneName:" + str);
            } else {
                guh.a(guh.TAG, "异常: 无法从 Meter 中获取到场景，请检查 Scene 是否有初始化。");
            }
            String str2 = this.s;
            if (str2 != null) {
                if (str2.contains("feat_disable_mem_usage_v2")) {
                    this.e = true;
                }
                if (this.s.contains("feat_disable_network_stat")) {
                    this.f = true;
                }
                if (this.s.contains("feat_disable_gc_event")) {
                    this.g = true;
                }
                if (this.s.contains("feat_disable_gc_count")) {
                    this.h = true;
                }
                if (this.s.contains("feat_disable_cpu_cores")) {
                    this.i = true;
                }
                if (this.s.contains("feat_disable_active_cores")) {
                    this.j = true;
                }
                if (this.s.contains("feat_disable_device_level")) {
                    this.l = true;
                }
                if (this.s.contains("feat_disable_power_mode")) {
                    this.k = true;
                }
                if (this.s.contains("feat_disable_data_tx")) {
                    this.n = true;
                }
                if (this.s.contains("feat_disable_count_stat")) {
                    this.p = true;
                }
                if (this.s.contains("feat_disable_thermal_stat")) {
                    this.q = true;
                }
                if (this.s.contains("feat_disable_all_features")) {
                    this.r = true;
                }
                if (this.s.contains("feat_enable_wifi_mobile_send_received")) {
                    this.v = true;
                }
            }
            e(str);
        }
    }

    public final void l(iuh iuhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59357f87", new Object[]{this, iuhVar, new Long(j)});
        } else if (this.e) {
            A("降级: 不统计内存用量。");
        } else {
            luh v = MTSEnvMonitor.n().v();
            if (v != null) {
                long j2 = j - (v.c - v.d);
                if (Math.abs(j2) <= this.d) {
                    fvh m = gvh.a().m("usage", s().format(((float) v.f23573a) / 1024.0f)).m("usage_clct_delay", Long.valueOf(j2)).m("usage_clct_index", Long.valueOf(v.e));
                    if (iuhVar.x() == 3) {
                        m.m(iiz.PERF_STAG_TOTAL, s().format(((float) v.b) / 1024.0f));
                        long j3 = v.b;
                        if (j3 > 0) {
                            m.m("usage_rate", s().format(v.f23573a / j3));
                        }
                    }
                    iuhVar.T(m, "mem");
                    return;
                }
                iuhVar.T(gvh.a().m("usage_clct_delay", Long.valueOf(j2)), "mem");
                return;
            }
            iuhVar.T(gvh.a().m("data_status", "skip"), "mem");
        }
    }

    public final void n(iuh iuhVar, fvh fvhVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e0556d", new Object[]{this, iuhVar, fvhVar});
        } else if (this.q) {
            A("降级: 不记录温度信息。");
        } else {
            bvh y = MTSEnvMonitor.n().y();
            if (iuhVar.x() == 3 && (i = y.f16663a) > 0) {
                fvhVar.m("thermal_state", Integer.valueOf(i));
            }
            int i2 = y.b;
            if (i2 > 0) {
                fvhVar.m("battery_temp", Integer.valueOf(i2));
            }
            fvh m = gvh.a().m("thermal_rise_cnt", Long.valueOf(y.c)).m("battery_rise_cnt", Long.valueOf(y.d));
            int i3 = y.b;
            if (i3 > 0) {
                m.m("battery_rise_val", Integer.valueOf(i3));
            }
            iuhVar.V(m, APower.TYPE_CPU);
        }
    }

    public final void o(iuh iuhVar) {
        uuh uuhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a80b4", new Object[]{this, iuhVar});
        } else if (this.o) {
            A("降级: 不采集线程信息。");
        } else {
            int x = iuhVar.x();
            if (x != 2) {
                uuhVar = x != 3 ? null : iuhVar.o();
            } else {
                uuhVar = iuhVar.j();
            }
            if (uuhVar != null) {
                iuhVar.T(gvh.a().m("is_main", Integer.valueOf(q(uuhVar.b()))).m("tid", Long.valueOf(uuhVar.getTid())), "thread");
            }
        }
    }

    public void x(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a69a29", new Object[]{this, iuhVar});
            return;
        }
        try {
            long b = cvh.b();
            a(iuhVar);
            u(iuhVar);
            d(iuhVar);
            y(iuhVar);
            iuhVar.T(gvh.a().m("collector_cost", Long.valueOf(cvh.b() - b)), g4.a.f2721a);
            if (this.w && !this.x) {
                guh.a(guh.DOWNGRADE_LOG, "本次度量降级日志开始静默。sceneName:" + this.y);
                this.x = true;
            }
        } catch (Throwable th) {
            guh.b(guh.TAG, "collector-collectFeaturesAndStatsForMeasurement-error。", th);
        }
        try {
            Iterator<mth> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().c(iuhVar);
            }
        } catch (Throwable th2) {
            guh.b(guh.TAG, "collector-output-processMeasurement error。", th2);
        }
    }

    public final void y(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f4db45", new Object[]{this, iuhVar});
            return;
        }
        o(iuhVar);
        if (iuhVar.u() == null) {
            k(iuhVar);
            f(iuhVar);
            g(iuhVar);
            j(iuhVar);
            B(iuhVar);
            b(iuhVar);
        } else if (iuhVar.u().z() != 3 || iuhVar.z() != 2) {
            f(iuhVar);
        } else if (cw6.b()) {
            guh.a(guh.DETAIL_LOG, "the task sub-stage will not collect any data.");
        }
    }

    public final void b(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44bdd11e", new Object[]{this, iuhVar});
        } else if (iuhVar.z() == 1 && iuhVar.x() == 3) {
            int f = this.f21573a.f("dirty_duration", 20000);
            int f2 = this.f21573a.f("dirty_min_duration", 0);
            if (f > 0) {
                if (iuhVar.n() > f || (f2 >= 0 && iuhVar.n() <= f2)) {
                    iuhVar.C("dirty", Boolean.TRUE);
                } else {
                    iuhVar.C("dirty", Boolean.FALSE);
                }
            }
            int f3 = this.f21573a.f("poor_duration", -1);
            if (f3 <= 0) {
                return;
            }
            if (iuhVar.n() > f3) {
                iuhVar.C("poor", Boolean.TRUE);
            } else {
                iuhVar.C("poor", Boolean.FALSE);
            }
        }
    }

    public final void d(iuh iuhVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229701f", new Object[]{this, iuhVar});
        } else if (!this.u) {
            this.u = true;
            fvh fvhVar = this.f21573a;
            if (fvhVar == null || !fvhVar.d("scene_config_downgrade_to_v1", false)) {
                guh.a(guh.DOWNGRADE_LOG, "hit checkAndSetSceneConfigV2");
                fvh fvhVar2 = this.f21573a;
                JSONObject jSONObject = fvhVar2 == null ? null : (JSONObject) fvhVar2.c("localSceneConfigData", JSONObject.class);
                if (jSONObject == null || !jSONObject.containsKey("collect_sample_value")) {
                    z = false;
                }
                v(z, t(iuhVar));
                return;
            }
            guh.a(guh.DOWNGRADE_LOG, "场景个性化配置，降级至旧版本");
            c();
        }
    }

    @Deprecated
    public final void e(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c6d3b", new Object[]{this, str});
            return;
        }
        if (str != null) {
            String concat = "sampleConfig_".concat(str);
            if (this.f21573a.a(concat)) {
                this.A = this.f21573a.f(concat, -1);
                v(z, str);
            }
        }
        z = false;
        v(z, str);
    }

    public final void k(iuh iuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a4cfa2", new Object[]{this, iuhVar});
            return;
        }
        if (iuhVar.z() == 1) {
            if (!this.g || !this.h) {
                int x = iuhVar.x();
                if (x == 2) {
                    euh.j();
                } else if (x != 3) {
                    guh.a(guh.TAG, "指标状态异常，无法进行 gc 采集信息控制。");
                } else {
                    if (this.g) {
                        A("降级: 不上报 GC 事件序列。 scene:" + this.y);
                    } else if (iuhVar.s() != null) {
                        ArrayList<cuh> p = euh.p(iuhVar.k());
                        iuhVar.s().E(p);
                        guh.a(guh.DETAIL_LOG, "gc 信息采集成功。event size:" + p.size() + " scene:" + this.y);
                    } else {
                        guh.a(guh.TAG, "指标状态异常，无法进行 gc 采集信息控制。 scene:" + this.y);
                    }
                    euh.s();
                }
            } else {
                A("降级: 不采集 GC 事件。");
                return;
            }
        }
        if (this.h) {
            A("降级: 不进行 GC 计数统计。");
        } else {
            iuhVar.V(gvh.a().m("gc_cnt", Long.valueOf(euh.o())), "mem");
        }
    }

    public final void v(boolean z, String str) {
        Boolean bool;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8c0c8f", new Object[]{this, new Boolean(z), str});
        } else if (this.A >= 0) {
            if (z) {
                if (C == null) {
                    C = new HashMap<>();
                }
                bool = C.get(str);
            } else {
                bool = D;
            }
            if (bool == null) {
                if (cvh.g() % 100 <= this.A) {
                    z2 = true;
                }
                if (z2) {
                    if (z) {
                        guh.a(guh.DOWNGRADE_LOG, "mts-命中采样。for:Self scene:" + str);
                        C.put(str, Boolean.TRUE);
                    } else {
                        guh.a(guh.DOWNGRADE_LOG, "mts-命中采样。for:All scene:" + str);
                        D = Boolean.TRUE;
                    }
                } else if (z) {
                    guh.a(guh.DOWNGRADE_LOG, "mts-未命中采样。for:Self scene:" + str);
                    C.put(str, Boolean.FALSE);
                } else {
                    guh.a(guh.DOWNGRADE_LOG, "mts-未命中采样。for:All scene:" + str);
                    D = Boolean.FALSE;
                }
                bool = Boolean.valueOf(z2);
            }
            if (bool.booleanValue()) {
                guh.a(guh.DOWNGRADE_LOG, "mts hit sample. scene:" + str);
                return;
            }
            guh.a(guh.DOWNGRADE_LOG, "mts not-hit sample. scene:" + str);
            this.r = true;
            this.o = true;
        }
    }
}
