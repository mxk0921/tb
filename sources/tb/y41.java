package tb;

import android.os.SystemClock;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y41 extends kti<da1, ca1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public y41(MetricContext metricContext, c0c c0cVar, da1 da1Var) {
        super(metricContext, c0cVar, da1Var);
    }

    public static /* synthetic */ Object ipc$super(y41 y41Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/time/AppExitMetricProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{16};
    }

    /* renamed from: h */
    public void a(ca1 ca1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5d479d", new Object[]{this, ca1Var});
        } else if (ca1Var != ca1.k) {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
            c0c.a c = this.b.c();
            c.putString("packageName", ca1Var.b());
            c.putLong("exitTime", ca1Var.j() - currentTimeMillis);
            c.putLong("exitTimestampInterval", currentTimeMillis);
            c.putInt(MspDBHelper.BizEntry.COLUMN_NAME_PID, ca1Var.c());
            c.putString("reason", ca1Var.e());
            c.putString("subReason", ca1Var.i());
            c.putInt("status", ca1Var.g());
            c.putString("description", ca1Var.a());
            c.putLong("pss", ca1Var.d());
            c.putLong("rss", ca1Var.f());
            c.commit();
            TLog.loge("MetricKit.AppExitMetric", ca1Var.toString());
        }
    }
}
