package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cpp implements xpd.a.AbstractC1101a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d1a<xhv> f17220a;
    public d1a<xhv> b;

    static {
        t2o.a(766509183);
        t2o.a(766509128);
    }

    @Override // tb.xpd.a.AbstractC1101a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
        }
    }

    public final d1a<xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("ddfa1344", new Object[]{this});
        }
        return this.f17220a;
    }

    public final d1a<xhv> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("6f4d2ff2", new Object[]{this});
        }
        return this.b;
    }

    public final void g(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53d67b4", new Object[]{this, d1aVar});
        } else {
            this.f17220a = d1aVar;
        }
    }

    public final void h(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb5fd5e", new Object[]{this, d1aVar});
        } else {
            this.b = d1aVar;
        }
    }
}
