package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q3b extends nv1 implements ukd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782822);
        t2o.a(488636432);
    }

    public q3b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(q3b q3bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeRocketCallback");
    }

    @Override // tb.ukd
    public void setRocketState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a598d3b2", new Object[]{this, new Boolean(z)});
        } else {
            w().A(z);
        }
    }
}
