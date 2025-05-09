package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class njm extends gyl<n52, m52> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String h = "MetricKit.BatteryMetric";
    private static final String i = "battery_level";
    private static final String j = "battery_temperature";
    private m52 g;

    public njm(MetricContext metricContext, c0c c0cVar, n52 n52Var) {
        super(metricContext, c0cVar, n52Var);
    }

    public static /* synthetic */ Object ipc$super(njm njmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/battery/PowerConsumeProcessor");
    }

    private void o(m52 m52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf66d040", new Object[]{this, m52Var});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(i, Integer.valueOf(m52Var.j()));
        hashMap.put(j, Integer.valueOf(m52Var.k()));
        EventCenter.f().h(this).k(95, hashMap);
    }

    private void q(m52 m52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd5371", new Object[]{this, m52Var});
        } else if (m52Var.l() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", m52Var.n().c());
                jSONObject.put("scrollDuration", m52Var.n().b());
                jSONObject.put("charging", m52Var.o());
                jSONObject.put("chargeCounter", m52Var.l());
                TLog.loge(h, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // tb.gyl
    public long i(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d1e09a", new Object[]{this, new Integer(i2)})).longValue();
        }
        if (i2 == 1) {
            return 180L;
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

    /* renamed from: p */
    public void a(m52 m52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fa8496", new Object[]{this, m52Var});
            return;
        }
        q(m52Var);
        o(m52Var);
        boolean d = m52Var.n().d(i(m52Var.i()) * 1000);
        if (this.g == null || m52Var.o() || d) {
            TLog.loge(h, "lastCollectResult=" + this.g + " isCharging=" + m52Var.o() + " isSkippedScroll=" + d);
            this.g = m52Var;
            return;
        }
        this.b.c().putLong("consumedChargeCounter", (this.g.l() - m52Var.l()) + this.b.getLong("consumedChargeCounter", 0L)).putLong("durationMs", (m52Var.m() - this.g.m()) + this.b.getLong("durationMs", 0L)).commit();
        this.g = m52Var;
    }
}
