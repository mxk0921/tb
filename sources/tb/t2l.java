package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.component.OpenArchObserveMode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OpenArchObserveMode f28432a;
    public final g1a<oyk, xhv> b;
    public final List<i3d> c;
    public int d;

    static {
        t2o.a(1004535835);
    }

    public t2l() {
        this(null, null, null, 0, 15, null);
    }

    public final g1a<oyk, xhv> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("3a26a1ca", new Object[]{this});
        }
        return this.b;
    }

    public final OpenArchObserveMode b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchObserveMode) ipChange.ipc$dispatch("6e8a4802", new Object[]{this});
        }
        return this.f28432a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3afd6a7", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de17f43", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2l(OpenArchObserveMode openArchObserveMode, g1a<? super oyk, xhv> g1aVar, List<? extends i3d> list, int i) {
        ckf.g(openArchObserveMode, "observeMode");
        this.f28432a = openArchObserveMode;
        this.b = g1aVar;
        this.c = list;
        this.d = i;
    }

    public /* synthetic */ t2l(OpenArchObserveMode openArchObserveMode, g1a g1aVar, List list, int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? OpenArchObserveMode.Once : openArchObserveMode, (i2 & 2) != 0 ? null : g1aVar, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? 0 : i);
    }
}
