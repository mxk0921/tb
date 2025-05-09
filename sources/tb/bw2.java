package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bw2 extends lwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1a<? super y7m, xhv> e;

    static {
        t2o.a(481297337);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(g1a<? super y7m, xhv> g1aVar) {
        super(null, 1, null);
        ckf.g(g1aVar, "callback");
        this.e = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(bw2 bw2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/event/CallbackEvent");
    }

    public final void g(y7m y7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6dc3c6", new Object[]{this, y7mVar});
            return;
        }
        ckf.g(y7mVar, "pipLineEventBus");
        this.e.invoke(y7mVar);
    }
}
