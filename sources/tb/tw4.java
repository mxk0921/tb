package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tw4 extends gyl<yw4, ww4> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String k = "MetricKit.CpuLoadMetric";
    private final int g = 10;
    private final int h = 60;
    private boolean i = true;
    private final cnh<ww4> j = new cnh<>(18);

    public tw4(MetricContext metricContext, c0c c0cVar, yw4 yw4Var) {
        super(metricContext, c0cVar, yw4Var);
    }

    private void A(ww4 ww4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790cb2d6", new Object[]{this, ww4Var});
            return;
        }
        c0c.a c = this.b.c();
        long l = ww4Var.l();
        if (this.i && l > 0) {
            c.putLong("CPUJiffyHz", l);
            this.i = false;
        }
    }

    private void B(boolean z, ww4 ww4Var, ww4 ww4Var2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f42248b", new Object[]{this, new Boolean(z), ww4Var, ww4Var2});
            return;
        }
        if (ww4Var2.o() != null) {
            this.b.c().putLong("cumulativeCPUProcessJiffy", ww4Var2.o().b());
        }
        if (ww4Var2.m() != null) {
            this.b.c().putLong("cumulativeCPUMainThreadJiffy", ww4Var2.m().b());
        }
        if (!(ww4Var2.o() == null || ww4Var == null || ww4Var.o() == null)) {
            if (z) {
                str = "cumulativeCPUForegroundProcessJiffy";
            } else {
                str = "cumulativeCPUBackgroundProcessJiffy";
            }
            if (z) {
                str2 = "cumulativeCPUForegroundAllocationMs";
            } else {
                str2 = "cumulativeCPUBackgroundAllocationMs";
            }
            this.b.c().f(str, ww4Var2.o().b() - ww4Var.o().b()).f(str2, ww4Var2.p() - ww4Var.p());
        }
        this.b.c().putLong("lastRecordTime", SystemClock.uptimeMillis());
        boolean d = ww4Var2.q().d(i(ww4Var2.i()) * 1000);
        if (!(ww4Var2.o() == null || ww4Var == null || ww4Var.o() == null || d)) {
            long b = ww4Var2.o().b() - ww4Var.o().b();
            long p = ww4Var2.p() - ww4Var.p();
            this.b.a(ww4Var2.q().c()).c().f("cumulativeCPUProcessJiffy", b).f("cumulativeCPUAllocationMs", p);
            this.b.a(ww4Var2.q().c()).a(ww4Var2.q().a()).c().f("cumulativeCPUProcessJiffy", b).f("cumulativeCPUAllocationMs", p);
        }
        if (d) {
            TLog.loge(k, "isSkippedScroll=true");
        }
    }

    private void D(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb656a0", new Object[]{this, new Float(f)});
        } else if (f > 0.8d) {
            this.b.c().d("highProcessLoadCount");
        }
    }

    private void E(Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd00382", new Object[]{this, map});
            return;
        }
        c0c.a c = this.b.a("highLoadThreads").c();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null && entry.getValue().floatValue() >= 0.5d) {
                c.d(entry.getKey());
            }
        }
    }

    private void F(Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f32584", new Object[]{this, map});
            return;
        }
        c0c.a c = this.b.a("threads").c();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                c.c(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(tw4 tw4Var, String str, Object... objArr) {
        if (str.hashCode() == -1064623319) {
            super.n();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/cpu/CpuLoadProcessor");
    }

    private void o(int i, float f) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a71d1da", new Object[]{this, new Integer(i), new Float(f)});
        } else if (f > 0.5d) {
            HashMap hashMap = new HashMap();
            hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
            hashMap.put("processLoadRate", Float.valueOf(f));
            if (i == 0) {
                str = "fg3minOver50";
            } else {
                str = "bg1minOver50";
            }
            hashMap.put("type", str);
            EventCenter.f().h(this).k(80, hashMap);
            if (i == 0) {
                str2 = "fgProcessLoadAbnormalCount";
            } else {
                str2 = "bgProcessLoadAbnormalCount";
            }
            this.b.c().d(str2);
        }
    }

    private void p(String str, ww4 ww4Var, ww4 ww4Var2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b9474", new Object[]{this, str, ww4Var, ww4Var2, new Float(f)});
            return;
        }
        float u = u(ww4Var, ww4Var2);
        if (u > f) {
            HashMap hashMap = new HashMap();
            hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
            hashMap.put("processLoadRate", Float.valueOf(u));
            hashMap.put("type", str);
            EventCenter.f().h(this).k(80, hashMap);
            this.b.a(str).c().d("processLoadAbnormalCount");
        }
    }

    private float q(boolean z, float f, ww4 ww4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1601093", new Object[]{this, new Boolean(z), new Float(f), ww4Var})).floatValue();
        }
        if (z && this.j.j() != this.j.c()) {
            return 0.0f;
        }
        if (z) {
            return u(this.j.e(), ww4Var);
        }
        return f;
    }

    private float r(ww4 ww4Var, ww4 ww4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fb641fa", new Object[]{this, ww4Var, ww4Var2})).floatValue();
        }
        if (ww4Var == null || !ww4Var.r() || !ww4Var2.r()) {
            return 0.0f;
        }
        long k2 = ww4Var2.k() - ww4Var.k();
        long p = ww4Var2.p() - ww4Var.p();
        if (p <= 0) {
            return 0.0f;
        }
        return (((float) (p - k2)) * 1.0f) / ((float) p);
    }

    private float s(ww4 ww4Var, ww4 ww4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84af0cc3", new Object[]{this, ww4Var, ww4Var2})).floatValue();
        }
        if (ww4Var == null || !ww4Var.r() || !ww4Var2.r()) {
            return 0.0f;
        }
        long p = ww4Var2.p() - ww4Var.p();
        long j = ((ww4Var2.m().g + ww4Var2.m().f) - ww4Var.m().g) - ww4Var.m().f;
        if (p <= 0) {
            return 0.0f;
        }
        return (((1000.0f / ((float) ysg.c())) * ((float) j)) * 1.0f) / ((float) p);
    }

    private Map<String, Float> t(ww4 ww4Var, ww4 ww4Var2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb5a05d1", new Object[]{this, ww4Var, ww4Var2});
        }
        if (ww4Var == null || !ww4Var.r() || !ww4Var2.r()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        long p = ww4Var2.p() - ww4Var.p();
        for (Map.Entry<String, jft> entry : ww4Var2.n().entrySet()) {
            jft jftVar = ww4Var.n().get(entry.getKey());
            jft value = entry.getValue();
            if (!(jftVar == null || value == null)) {
                long j = ((ww4Var2.m().g + ww4Var2.m().f) - ww4Var.m().g) - ww4Var.m().f;
                if (p <= 0) {
                    f = 0.0f;
                } else {
                    f = ww4Var.j() * (((1000.0f / ((float) ysg.c())) * ((float) j)) / ((float) p));
                }
                hashMap.put(entry.getKey(), Float.valueOf(f));
            }
        }
        return hashMap;
    }

    private float u(ww4 ww4Var, ww4 ww4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b43b2241", new Object[]{this, ww4Var, ww4Var2})).floatValue();
        }
        if (ww4Var == null || !ww4Var.r() || !ww4Var2.r()) {
            return 0.0f;
        }
        long p = ww4Var2.p() - ww4Var.p();
        long j = ((ww4Var2.o().g + ww4Var2.o().f) - ww4Var.o().g) - ww4Var.o().f;
        if (p <= 0) {
            return 0.0f;
        }
        return (((1000.0f / ((float) ysg.c())) * ((float) j)) * 1.0f) / ((float) p);
    }

    private void v(ww4 ww4Var, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5be8bf", new Object[]{this, ww4Var, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dispatchNanos", Long.valueOf(System.nanoTime()));
        hashMap.put("wholeCpuLoadRate", Float.valueOf(f));
        hashMap.put("processLoadRate", Float.valueOf(f2));
        hashMap.put("mainThreadLoadRate", Float.valueOf(f3));
        jft m = ww4Var.m();
        jft o = ww4Var.o();
        if (!(m == null || o == null)) {
            hashMap.put("mainThreadSTime", Long.valueOf(m.g));
            hashMap.put("mainThreadUTime", Long.valueOf(m.f));
            hashMap.put("totalCpuTime", Long.valueOf(ww4Var.p()));
            hashMap.put("processSTime", Long.valueOf(o.g));
            hashMap.put("processUTime", Long.valueOf(o.f));
        }
        EventCenter.f().h(this).k(81, hashMap);
    }

    private void w(ww4 ww4Var, ww4 ww4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26524243", new Object[]{this, ww4Var, ww4Var2});
        } else if (ww4Var != null && ww4Var.r() && ww4Var2.r()) {
            ysg.b(ww4Var.o(), ww4Var2.o());
            ysg.b(ww4Var.m(), ww4Var2.m());
        }
    }

    private boolean y(ww4 ww4Var, ww4 ww4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea2c31ec", new Object[]{this, ww4Var, ww4Var2})).booleanValue();
        }
        if (ww4Var != null && ww4Var.i() == ww4Var2.i() && ww4Var2.i() == 0) {
            return true;
        }
        if ((ww4Var != null && ww4Var.i() == ww4Var2.i() && ww4Var2.i() == 1) || ww4Var2.i() == 0) {
            return false;
        }
        ww4Var2.i();
        return true;
    }

    @Override // tb.gyl
    public long i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d1e09a", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i == 1) {
            return 60L;
        }
        return 10L;
    }

    @Override // tb.gyl
    public int[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("dd6ab5f7", new Object[]{this});
        }
        return new int[]{0, 1};
    }

    @Override // tb.gyl
    public int[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ba5881ab", new Object[]{this});
        }
        return new int[]{1, 0};
    }

    @Override // tb.gyl
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08b2329", new Object[]{this});
            return;
        }
        super.n();
        this.j.a();
    }

    /* renamed from: x */
    public void a(ww4 ww4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8dfcdf1", new Object[]{this, ww4Var});
        } else if (ww4Var.p() != 0) {
            A(ww4Var);
            ww4 d = this.j.d();
            w(d, ww4Var);
            float r = r(d, ww4Var);
            float u = u(d, ww4Var);
            float s = s(d, ww4Var);
            Map<String, Float> t = t(d, ww4Var);
            D(u);
            boolean y = y(this.j.d(), ww4Var);
            B(y, d, ww4Var);
            F(t);
            E(t);
            z(ww4Var, r, u, s, t);
            v(ww4Var, r, u, s);
            o(ww4Var.i(), q(y, u, ww4Var));
            if (y) {
                p("50sOver80", this.j.b(4), ww4Var, 0.8f);
                p("90sOver50", this.j.b(8), ww4Var, 0.5f);
            }
            this.j.g(ww4Var);
            if (this.b.c().b()) {
                this.b.c().commit();
            }
        }
    }

    private void z(ww4 ww4Var, float f, float f2, float f3, Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378c3e4f", new Object[]{this, ww4Var, new Float(f), new Float(f2), new Float(f3), map});
        } else if (ww4Var.r() && f > 0.0f && f2 > 0.0f && f3 > 0.0f) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventType", ww4Var.i());
                jSONObject.put("optType", ww4Var.q().c());
                jSONObject.put("jiffyHz", ww4Var.l());
                jSONObject.put("cpuLoadRate", (((int) ((f * 100.0f) * 100.0f)) / 100.0f) + f7l.MOD);
                jSONObject.put("processLoadRate", (((float) ((int) ((f2 * 100.0f) * 100.0f))) / 100.0f) + f7l.MOD);
                jSONObject.put("mainThreadLoadRate", (((float) ((int) ((f3 * 100.0f) * 100.0f))) / 100.0f) + f7l.MOD);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("stat", ww4Var.o().e);
                jSONObject2.put("utime", ww4Var.o().f);
                jSONObject2.put("stime", ww4Var.o().g);
                jSONObject2.put("cutime", ww4Var.o().h);
                jSONObject2.put("cstime", ww4Var.o().i);
                jSONObject2.put("diffJiffy", ww4Var.o().k);
                jSONObject.put("processStat", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("stat", ww4Var.m().e);
                jSONObject3.put("utime", ww4Var.m().f);
                jSONObject3.put("stime", ww4Var.m().g);
                jSONObject3.put("cutime", ww4Var.m().h);
                jSONObject3.put("cstime", ww4Var.m().i);
                jSONObject3.put("diffJiffy", ww4Var.m().k);
                jSONObject.put("mainThreadStat", jSONObject3);
                jSONObject.put("threads", new JSONObject(map));
                TLog.loge(k, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
