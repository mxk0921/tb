package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.g92;
import tb.y91;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lx6 implements pq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final pq DEFAULT = new lx6();

        static {
            t2o.a(976224276);
        }
    }

    static {
        t2o.a(976224274);
        t2o.a(976224261);
    }

    @Override // tb.pq
    public y91 U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y91) ipChange.ipc$dispatch("cabd2823", new Object[]{this});
        }
        return new y91.b().b(true).f(true).c(true).d(81).e(56).a();
    }

    @Override // tb.pq
    public g92 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g92) ipChange.ipc$dispatch("eff749cf", new Object[]{this});
        }
        return new g92.b().a();
    }

    public lx6() {
    }
}
