package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class j9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21855a;
    public final long b;

    static {
        t2o.a(815792175);
    }

    public j9u() {
        this(null, 0L, 3, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c16c816e", new Object[]{this});
        }
        return this.f21855a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public j9u(String str, long j) {
        ckf.g(str, "spanName");
        this.f21855a = str;
        this.b = j;
    }

    public /* synthetic */ j9u(String str, long j, int i, a07 a07Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j);
    }
}
