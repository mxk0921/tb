package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.adaemon.power.APower;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.metrickit.context.MetricContext;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r52 extends kti<ny6, oy6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public r52(MetricContext metricContext, c0c c0cVar, ny6 ny6Var) {
        super(metricContext, c0cVar, ny6Var);
    }

    public static /* synthetic */ Object ipc$super(r52 r52Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/battery/BatteryHardwareStatProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 0, 1, 2};
    }

    public final void h(c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2d3a9a", new Object[]{this, c0cVar});
            return;
        }
        for (String str : c0cVar.keySet()) {
            c0c a2 = c0cVar.a(str);
            if ("started".equals(a2.getString("status", "inited"))) {
                a2.c().d("bgNotCancelCount");
            }
        }
    }

    public final void j(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dae47e3", new Object[]{this, oy6Var, c0cVar});
        } else {
            c0cVar.a(oy6Var.h("uniqueKey")).c().putInt("type", oy6Var.f("type", -1)).putLong("nowInThisType", oy6Var.g("nowInThisType", -1L)).putLong("triggerAtMillis", oy6Var.g("triggerAtMillis", -1L)).putLong("intervalMillis", oy6Var.g("intervalMillis", -1L)).putLong("startTime", oy6Var.g("startTime", -1L)).putString("operation", oy6Var.h("operation")).putString("tag", oy6Var.h("tag")).putString("method", oy6Var.h("method")).putString(DataReceiveMonitor.CB_LISTENER, oy6Var.h(DataReceiveMonitor.CB_LISTENER)).putString("targetHandler", oy6Var.h("targetHandler"));
        }
    }

    public final void l(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ad8073", new Object[]{this, oy6Var, c0cVar});
        } else {
            o(c0cVar.a(oy6Var.h("uniqueKey")), oy6Var.g("endTime", SystemClock.uptimeMillis()));
        }
    }

    public final void m(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05a1357", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        c0c a2 = c0cVar.a(oy6Var.h(pg1.ATOM_caller));
        String string = a2.getString("status", "inited");
        long j = a2.getLong("duration", 0L);
        long j2 = a2.getLong("startTime", -1L);
        if ("started".equals(string) && SystemClock.uptimeMillis() - j2 <= 12000) {
            a2.c().putLong("startTime", oy6Var.g("startTime", SystemClock.uptimeMillis())).putLong("duration", (j - 12000) + (SystemClock.uptimeMillis() - j2)).putString("status", DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    public final void o(c0c c0cVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5955fc64", new Object[]{this, c0cVar, new Long(j)});
            return;
        }
        c0c.a c = c0cVar.c();
        String string = c0cVar.getString("status", "inited");
        "inited".equals(string);
        if ("started".equals(string)) {
            if (this.f22911a.isInBackground()) {
                str = "bgDuration";
            } else {
                str = "fgDuration";
            }
            c.putLong("endTime", j).putLong(str, (j - c0cVar.getLong("startTime", j)) + c0cVar.getLong(str, 0L)).d("endCount");
        }
        if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(string)) {
            c.putLong("endTime", j);
        }
        c.putString("status", DXRecyclerLayout.LOAD_MORE_STOPED);
    }

    public final void p(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f03b8", new Object[]{this, oy6Var, c0cVar});
        } else {
            o(c0cVar.a(oy6Var.h("uniqueKey")), oy6Var.g("endTime", SystemClock.uptimeMillis()));
        }
    }

    public final void q(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da54caa7", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        c0c a2 = c0cVar.a(oy6Var.h("uniqueKey"));
        a2.c().a("provider", oy6Var.h("provider")).putLong("minTimeMs", oy6Var.g("minTimeMs", -1L)).putFloat("minDistanceM", oy6Var.e("minDistanceM", -1.0f)).a(DataReceiveMonitor.CB_LISTENER, oy6Var.h(DataReceiveMonitor.CB_LISTENER)).a("thread", oy6Var.h("thread")).a("criteria", oy6Var.h("criteria")).a("pendingIntent", oy6Var.h("pendingIntent"));
        t(a2, oy6Var.g("startTine", SystemClock.uptimeMillis()));
    }

    public final void r(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d3bfc", new Object[]{this, oy6Var, c0cVar});
        } else {
            c0cVar.a(oy6Var.h("uniqueKey")).c().putString("tag", oy6Var.h("tag")).putInt("levelAndFlags", oy6Var.f("levelAndFlags", -1));
        }
    }

    public final void u(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c5b419", new Object[]{this, oy6Var, c0cVar});
        } else {
            o(c0cVar.a(oy6Var.h("uniqueKey")), oy6Var.g("endTime", SystemClock.uptimeMillis()));
        }
    }

    public final void v(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b860b4", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        String h = oy6Var.h("uniqueKey");
        long g = oy6Var.g("timeout", -1L);
        long g2 = oy6Var.g("startTime", SystemClock.uptimeMillis());
        c0c a2 = c0cVar.a(h);
        c0c.a c = a2.c();
        if (a2.getLong("timeout", -1L) == -1 && g != -1) {
            c.putLong("timeout", g);
        }
        t(a2, g2);
    }

    public final void x(c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa23373", new Object[]{this, c0cVar});
            return;
        }
        for (String str : c0cVar.keySet()) {
            c0c a2 = c0cVar.a(str);
            if ("started".equals(a2.getString("status", "inited"))) {
                a2.c().putLong("bgDuration", (SystemClock.uptimeMillis() - a2.getLong("startTime", SystemClock.uptimeMillis())) + a2.getLong("bgDuration", 0L)).putLong("startTime", SystemClock.uptimeMillis());
            }
        }
    }

    public final void y(c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3de34eb", new Object[]{this, c0cVar});
            return;
        }
        for (String str : c0cVar.keySet()) {
            c0c a2 = c0cVar.a(str);
            if ("started".equals(a2.getString("status", "inited"))) {
                a2.c().putLong("fgDuration", (SystemClock.uptimeMillis() - a2.getLong("startTime", SystemClock.uptimeMillis())) + a2.getLong("fgDuration", 0L)).putLong("startTime", SystemClock.uptimeMillis());
            }
        }
    }

    public final void s(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252de520", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        String h = oy6Var.h("handler");
        c0c a2 = c0cVar.a(oy6Var.h("uniqueKey"));
        String string = c0cVar.getString("sensorType", null);
        String h2 = oy6Var.h("sensorType");
        c0c.a c = a2.c();
        c.putString(DataReceiveMonitor.CB_LISTENER, oy6Var.h(DataReceiveMonitor.CB_LISTENER)).putInt("delay", oy6Var.f("delayUs", -1)).putInt("maxReportLatencyUs", oy6Var.f("maxReportLatencyUs", 0));
        if (TextUtils.isEmpty(string)) {
            c.putString("sensorType", h2);
        } else if (!string.contains(h2)) {
            c.putString("sensorType", string + "|" + h2);
        }
        if (!TextUtils.isEmpty(h)) {
            c.putString("handler", h);
        }
        t(a2, oy6Var.g("startTime", SystemClock.uptimeMillis()));
    }

    public final void w(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27743325", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        int f = oy6Var.f("flags", 0);
        float e = oy6Var.e("power", -1.0f);
        c0c a2 = c0cVar.a(oy6Var.h("uniqueKey"));
        c0c.a c = a2.c();
        if (a2.getInt("flags", 0) == 0 && f != 0) {
            c.putLong("flags", f);
        }
        if (a2.getFloat("power", -1.0f) < 0.0f && e > 0.0f) {
            c.putFloat("power", e);
        }
        o(a2, oy6Var.g("endTime", SystemClock.uptimeMillis()));
    }

    /* renamed from: i */
    public void a(oy6 oy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90204af", new Object[]{this, oy6Var});
            return;
        }
        if (oy6Var.i() == 23 || oy6Var.i() == 24) {
            j(oy6Var, this.b.a("alarm"));
        }
        if (oy6Var.i() == 18) {
            r(oy6Var, this.b.a("wakeLock"));
        }
        if (oy6Var.i() == 19) {
            v(oy6Var, this.b.a("wakeLock"));
        }
        if (oy6Var.i() == 20) {
            w(oy6Var, this.b.a("wakeLock"));
        }
        if (oy6Var.i() == 21) {
            s(oy6Var, this.b.a(APower.TYPE_SENSOR));
        }
        if (oy6Var.i() == 22) {
            u(oy6Var, this.b.a(APower.TYPE_SENSOR));
        }
        if (oy6Var.i() == 25) {
            n(oy6Var, this.b.a("bluetooth").a("normal"));
        }
        if (oy6Var.i() == 26) {
            m(oy6Var, this.b.a("bluetooth").a("normal"));
        }
        if (oy6Var.i() == 27) {
            k(oy6Var, this.b.a("bluetooth").a("le"));
        }
        if (oy6Var.i() == 28) {
            l(oy6Var, this.b.a("bluetooth").a("le"));
        }
        if (oy6Var.i() == 31) {
            k(oy6Var, this.b.a("bluetooth").a("le"));
        }
        if (oy6Var.i() == 32) {
            l(oy6Var, this.b.a("bluetooth").a("le"));
        }
        if (oy6Var.i() == 29) {
            q(oy6Var, this.b.a("location"));
        }
        if (oy6Var.i() == 30) {
            p(oy6Var, this.b.a("location"));
        }
        if (oy6Var.i() == 0) {
            x(this.b.a("wakeLock"));
            x(this.b.a(APower.TYPE_SENSOR));
            x(this.b.a("bluetooth").a("le"));
            x(this.b.a("location"));
        }
        if (oy6Var.i() == 1) {
            y(this.b.a("wakeLock"));
            y(this.b.a(APower.TYPE_SENSOR));
            y(this.b.a("bluetooth").a("le"));
            y(this.b.a("location"));
        }
        if (oy6Var.i() == 2) {
            h(this.b.a("wakeLock"));
            h(this.b.a(APower.TYPE_SENSOR));
            h(this.b.a("bluetooth").a("le"));
            h(this.b.a("location"));
        }
        c0c.a c = this.b.c();
        if (c.b()) {
            c.commit();
        }
    }

    public final void k(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348a59b9", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        c0c a2 = c0cVar.a(oy6Var.h("uniqueKey"));
        a2.c().putString("callback", oy6Var.h("callback")).a("serviceUuids", oy6Var.h("serviceUuids")).a("filters", oy6Var.h("filters")).a("callbackIntent", oy6Var.h("callbackIntent"));
        if (oy6Var.a("scanMode")) {
            a2.c().putInt("scanMode", oy6Var.f("scanMode", 0)).putInt("callbackType", oy6Var.f("callbackType", 1)).putLong("reportDelayMillis", oy6Var.g("reportDelayMillis", 0L)).putBoolean("legacy", oy6Var.b("legacy", true)).putInt("phy", oy6Var.f("phy", 255));
        }
        t(a2, oy6Var.g("startTine", SystemClock.uptimeMillis()));
    }

    public final void n(oy6 oy6Var, c0c c0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dbc2c9", new Object[]{this, oy6Var, c0cVar});
            return;
        }
        c0c a2 = c0cVar.a(oy6Var.h(pg1.ATOM_caller));
        String string = a2.getString("status", "inited");
        long j = a2.getLong("duration", 0L);
        long j2 = a2.getLong("startTime", -1L);
        if ("inited".equals(string) || DXRecyclerLayout.LOAD_MORE_STOPED.equals(string) || ("started".equals(string) && SystemClock.uptimeMillis() - j2 > 12000)) {
            a2.c().putLong("startTime", oy6Var.g("startTime", SystemClock.uptimeMillis())).putLong("duration", j + 12000).putString("status", "started");
        }
        if ("started".equals(string) && SystemClock.uptimeMillis() - j2 <= 12000) {
            a2.c().putLong("startTime", oy6Var.g("startTime", SystemClock.uptimeMillis())).putLong("duration", (j - 12000) + (SystemClock.uptimeMillis() - j2));
        }
    }

    public final void t(c0c c0cVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef02e2b", new Object[]{this, c0cVar, new Long(j)});
            return;
        }
        c0c.a c = c0cVar.c();
        String string = c0cVar.getString("status", "inited");
        if ("started".equals(string)) {
            long j2 = c0cVar.getLong("startTime", j);
            if (this.f22911a.isInBackground()) {
                str = "bgDuration";
            } else {
                str = "fgDuration";
            }
            c.putLong("startTime", j).putLong(str, (j - j2) + c0cVar.getLong(str, 0L));
        }
        if ("inited".equals(string) || DXRecyclerLayout.LOAD_MORE_STOPED.equals(string)) {
            int i = c0cVar.getInt("bgStartCount", 0);
            c0c.a d = c.putLong("startTime", j).d("startCount");
            if (this.f22911a.isInBackground()) {
                i++;
            }
            d.putInt("bgStartCount", i);
        }
        c.putString("status", "started");
    }
}
