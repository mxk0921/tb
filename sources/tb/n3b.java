package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n3b extends nv1 implements ged {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782821);
        t2o.a(488636431);
    }

    public n3b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(n3b n3bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomePullDownRefreshCallback");
    }

    @Override // tb.ged
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132b68d5", new Object[]{this});
        } else {
            w().w();
        }
    }

    @Override // tb.ged
    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        return w().t();
    }

    @Override // tb.ged
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af535fda", new Object[]{this, new Boolean(z)});
        } else {
            w().c(z);
        }
    }

    @Override // tb.ged
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b92130", new Object[]{this});
        } else {
            w().z();
        }
    }

    @Override // tb.ged
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return w().k();
    }
}
