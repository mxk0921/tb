package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.imb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class h1z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public imb.a f20365a;
    public g1a<? super oc3, xhv> b;

    static {
        t2o.a(479199604);
    }

    public final imb.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imb.a) ipChange.ipc$dispatch("654cbc1c", new Object[]{this});
        }
        return this.f20365a;
    }

    public final g1a<oc3, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ec0e8370", new Object[]{this});
        }
        return this.b;
    }

    public final void c(imb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf5ea", new Object[]{this, aVar});
        } else {
            this.f20365a = aVar;
        }
    }

    public final void d(g1a<? super oc3, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b1243e", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }
}
