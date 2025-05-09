package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ncq implements lcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final acq f24646a;

    static {
        t2o.a(677380231);
        t2o.a(676331552);
    }

    public ncq(acq acqVar) {
        this.f24646a = acqVar;
    }

    @Override // tb.lcq
    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c7b29338", new Object[]{this});
        }
        return this.f24646a.r();
    }
}
