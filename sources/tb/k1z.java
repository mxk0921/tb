package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class k1z implements pfz<m1z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22358a;
    public final int b;

    static {
        t2o.a(598737148);
        t2o.a(598737401);
    }

    public k1z(boolean z, int i) {
        this.f22358a = z;
        this.b = i;
    }

    /* renamed from: b */
    public m1z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m1z) ipChange.ipc$dispatch("7d33177c", new Object[]{this});
        }
        return new m1z(this.f22358a, this.b);
    }

    /* renamed from: c */
    public void a(m1z m1zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485dcab9", new Object[]{this, m1zVar});
            return;
        }
        ckf.g(m1zVar, "node");
        m1zVar.p(this.f22358a);
        m1zVar.q(this.b);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !ckf.b(dun.b(k1z.class), dun.b(obj.getClass()))) {
            return false;
        }
        k1z k1zVar = (k1z) obj;
        if (this.f22358a == k1zVar.f22358a && this.b == k1zVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (bbz.a(this.f22358a) * 31) + this.b;
    }
}
