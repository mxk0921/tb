package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vf2 extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public vf2(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(vf2 vf2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/instrument/BluetoothLeScannerProxy");
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{31, 32};
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        }
    }
}
