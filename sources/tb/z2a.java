package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class z2a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kxd f32481a;

    static {
        t2o.a(689963222);
    }

    public z2a(kxd kxdVar) {
        ckf.g(kxdVar, "serviceDelegate");
        this.f32481a = kxdVar;
    }

    public final kxd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxd) ipChange.ipc$dispatch("9a2b8ecc", new Object[]{this});
        }
        return this.f32481a;
    }
}
