package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gy<?, ?, ?> f28441a;
    public final boolean b;

    static {
        t2o.a(993001817);
    }

    public t2p(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
        this.b = z;
        this.f28441a = gyVar;
    }

    public static t2p a(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2p) ipChange.ipc$dispatch("da46a0c3", new Object[]{new Boolean(z), new Boolean(z2), gyVar});
        }
        return new t2p(z, z2, gyVar);
    }

    public gy<?, ?, ?> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy) ipChange.ipc$dispatch("3c93ce7a", new Object[]{this});
        }
        return this.f28441a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b5aa5a1", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
