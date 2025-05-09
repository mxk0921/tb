package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cmm extends kti<ny6, oy6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public cmm(MetricContext metricContext, c0c c0cVar, ny6 ny6Var) {
        super(metricContext, c0cVar, ny6Var);
    }

    public static /* synthetic */ Object ipc$super(cmm cmmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/battery/PowerSaveModeProcessor");
    }

    @Override // tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{92};
    }

    /* renamed from: h */
    public void a(oy6 oy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90204af", new Object[]{this, oy6Var});
        } else if (this.b.getLong("powerSaveMode", -1L) == -1) {
            this.b.c().putLong("powerSaveMode", SystemClock.uptimeMillis()).commit();
        }
    }
}
