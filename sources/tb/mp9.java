package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24204a;
    public final u1a<? super Integer, ? super Integer, xhv> b;

    static {
        t2o.a(481296940);
    }

    public mp9(boolean z, u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        ckf.g(u1aVar, "process");
        this.f24204a = z;
        this.b = u1aVar;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76ce7ee1", new Object[]{this})).booleanValue();
        }
        return this.f24204a;
    }

    public final u1a<Integer, Integer, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("39ce3c3b", new Object[]{this});
        }
        return this.b;
    }
}
