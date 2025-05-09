package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29090a;

    static {
        t2o.a(993001818);
    }

    public u2p(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
        this.f29090a = z;
    }

    public static u2p a(boolean z, boolean z2, gy<?, ?, ?> gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2p) ipChange.ipc$dispatch("a0fe2238", new Object[]{new Boolean(z), new Boolean(z2), gyVar});
        }
        return new u2p(z, z2, gyVar);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b5aa5a1", new Object[]{this})).booleanValue();
        }
        return this.f29090a;
    }
}
