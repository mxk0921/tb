package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lj0 extends jnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public lj0(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(lj0 lj0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -830706570) {
            super.q((MetricContext) objArr[0]);
            return null;
        } else if (hashCode == 188604040) {
            lj0Var.u();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/metrickit/event/instrument/AlarmManagerProxy");
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{23, 24};
    }

    @Override // tb.jnq, tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            super.q(metricContext);
        }
    }
}
