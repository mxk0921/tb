package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h69 implements e6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20435a;
    public final boolean b;
    public final boolean c;

    static {
        t2o.a(486539617);
        t2o.a(488636489);
    }

    public h69(boolean z, boolean z2, boolean z3) {
        this.f20435a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // tb.e6c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b569b45", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.e6c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("686687cb", new Object[]{this})).booleanValue();
        }
        return this.f20435a;
    }

    @Override // tb.e6c
    public boolean isLastPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3afa9a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
