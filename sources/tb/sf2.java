package tb;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sf2 extends kti<ny6, oy6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public sf2(MetricContext metricContext, ny6 ny6Var) {
        super(metricContext, null, ny6Var);
    }

    public static /* synthetic */ Object ipc$super(sf2 sf2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/stack/BlockStackProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{94};
    }

    /* renamed from: h */
    public void a(oy6 oy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90204af", new Object[]{this, oy6Var});
            return;
        }
        try {
            ud2 ud2Var = new ud2();
            ud2Var.f29301a = "HA_MAIN_THREAD_BLOCK";
            ud2Var.b = AggregationType.STACK;
            ud2Var.c = ud2Var.f29301a + SystemClock.uptimeMillis();
            ud2Var.l = null;
            ud2Var.e = "1.0.2";
            Map<String, ?> d = oy6Var.d();
            ud2Var.k = (Throwable) d.get(rf2.KEY_BLOCK_STACK);
            ud2Var.f = (String) d.get(rf2.KEY_ADDITION);
            vd2.a().c(this.f22911a.getApplication(), ud2Var);
            TLog.loge("MetricKit.BlockStackProcessor", "BlockStack", Log.getStackTraceString(ud2Var.k));
        } catch (Throwable th) {
            TLog.loge("MetricKit.BlockStackProcessor", "doProcess", Log.getStackTraceString(th));
        }
    }
}
