package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tyy implements pfz<uyy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29038a;

    static {
        t2o.a(598737114);
        t2o.a(598737401);
    }

    public tyy(int i) {
        this.f29038a = i;
    }

    /* renamed from: b */
    public uyy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uyy) ipChange.ipc$dispatch("b6ba0607", new Object[]{this});
        }
        return new uyy(this.f29038a);
    }

    /* renamed from: c */
    public void a(uyy uyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8a9ea4", new Object[]{this, uyyVar});
            return;
        }
        ckf.g(uyyVar, "node");
        uyyVar.o(this.f29038a);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tyy) && this.f29038a == ((tyy) obj).f29038a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f29038a;
    }
}
