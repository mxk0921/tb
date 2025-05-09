package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t2g<T, TC> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f28425a;
    public final TC b;

    static {
        t2o.a(1002438713);
    }

    public t2g(T t, TC tc) {
        this.f28425a = t;
        this.b = tc;
    }

    public final String a() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7ae2a54", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((ns3) dun.b(t2g.class)).getSimpleName());
        T t = this.f28425a;
        if (t != null) {
            i = t.hashCode();
        }
        sb.append(i);
        return sb.toString();
    }

    public final T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("186dc460", new Object[]{this});
        }
        return this.f28425a;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc6e25", new Object[]{this, new Boolean(z)});
        }
    }
}
