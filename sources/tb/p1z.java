package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p1z implements pfz<q1z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z2z f25824a;

    static {
        t2o.a(598736998);
        t2o.a(598737401);
    }

    public p1z(z2z z2zVar) {
        ckf.g(z2zVar, "shape");
        this.f25824a = z2zVar;
    }

    /* renamed from: b */
    public q1z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q1z) ipChange.ipc$dispatch("985675d6", new Object[]{this});
        }
        return new q1z(this.f25824a);
    }

    /* renamed from: c */
    public void a(q1z q1zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d146ea93", new Object[]{this, q1zVar});
            return;
        }
        ckf.g(q1zVar, "node");
        q1zVar.o(this.f25824a);
    }

    public boolean equals(Object obj) {
        p1z p1zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1z) {
            p1zVar = (p1z) obj;
        } else {
            p1zVar = null;
        }
        if (p1zVar == null) {
            return false;
        }
        return ckf.b(this.f25824a, p1zVar.f25824a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f25824a.hashCode();
    }
}
