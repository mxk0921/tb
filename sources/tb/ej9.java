package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ej9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final l7j f18613a;
    public final int b;
    public final Object c;

    static {
        t2o.a(745537679);
    }

    public ej9(l7j l7jVar, int i, Object obj) {
        this.f18613a = l7jVar;
        this.b = i;
        this.c = obj;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26fdecb1", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("505a38d3", new Object[]{this});
        }
        return this.c;
    }

    public final l7j c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l7j) ipChange.ipc$dispatch("6940199f", new Object[]{this});
        }
        return this.f18613a;
    }
}
