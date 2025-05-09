package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r87 extends tzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714128);
    }

    public r87(FluidContext fluidContext, a aVar) {
        super(fluidContext, aVar);
    }

    public static /* synthetic */ Object ipc$super(r87 r87Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/vcard/DefaultVCard");
    }

    @Override // tb.tzv
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342d6281", new Object[]{this});
        }
    }

    @Override // tb.tzv
    public void m(int i, int i2, WarmUpReason warmUpReason, mxw mxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed6b4f3", new Object[]{this, new Integer(i), new Integer(i2), warmUpReason, mxwVar});
        }
    }
}
