package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g1a<? super n0g, xhv> f26425a;

    static {
        t2o.a(1002438912);
    }

    public final g1a<n0g, xhv> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.f26425a;
    }

    public final void b(g1a<? super n0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.f26425a = g1aVar;
        }
    }
}
