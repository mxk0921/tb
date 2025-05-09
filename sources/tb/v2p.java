package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29748a;
    public final int b;

    static {
        t2o.a(993001819);
    }

    public v2p(int i, int i2) {
        this.f29748a = i;
        this.b = i2;
    }

    public static v2p a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v2p) ipChange.ipc$dispatch("c51db5a5", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new v2p(i, i2);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3197f49a", new Object[]{this})).intValue();
        }
        return this.f29748a;
    }
}
