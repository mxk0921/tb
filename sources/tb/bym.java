package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bym extends lwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final d1a<? extends x7m> e;

    static {
        t2o.a(481297340);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bym(String str, d1a<? extends x7m> d1aVar) {
        super(str);
        ckf.g(d1aVar, "holdRunnable");
        this.e = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(bym bymVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/event/ProcessHoldEvent");
    }

    public final d1a<x7m> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("a7df7424", new Object[]{this});
        }
        return this.e;
    }
}
