package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g3g<C extends h2g<C>> extends f2g<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438683);
    }

    public g3g(C c) {
        super(c);
    }

    public static /* synthetic */ Object ipc$super(g3g g3gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/arch/kernel/component/performanceComponent/KernelPerformanceComponent");
    }

    @Override // tb.f2g
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, c});
        }
    }
}
