package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.orange.OConstant;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a51 extends kti<i91, h91> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a51(MetricContext metricContext, c0c c0cVar, i91 i91Var) {
        super(metricContext, c0cVar, i91Var);
        c0cVar.c().putLong(OConstant.DIMEN_PROCESS_START_TIME, metricContext.getProcessStartTime()).putLong("appLauncherStartTime", metricContext.getLauncherStartTime()).putLong("startupTimestampInterval", System.currentTimeMillis() - SystemClock.uptimeMillis()).commit();
    }

    public static /* synthetic */ Object ipc$super(a51 a51Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/time/AppFgTimeMetricProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{1};
    }

    /* renamed from: h */
    public void a(h91 h91Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895fd39d", new Object[]{this, h91Var});
        } else if (h91Var.a() != 0) {
            c0c.a c = this.b.c();
            c.putLong("cumulativeForegroundTime", h91Var.a() + this.b.getLong("cumulativeForegroundTime", 0L));
            c.commit();
        }
    }
}
