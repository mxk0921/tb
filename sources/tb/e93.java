package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class e93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TemplateBean f18367a;
    public rpc.c b;
    public boolean c;

    static {
        t2o.a(815792821);
    }

    public e93(TemplateBean templateBean, rpc.c cVar, boolean z) {
        ckf.g(templateBean, "templateBean");
        this.f18367a = templateBean;
        this.b = cVar;
        this.c = z;
    }

    public final rpc.c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("344e8ba3", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff19e206", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final TemplateBean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("20fa3ee9", new Object[]{this});
        }
        return this.f18367a;
    }

    public final void d(rpc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4018cd5", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a888486", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e93)) {
            return false;
        }
        e93 e93Var = (e93) obj;
        if (ckf.b(this.f18367a, e93Var.f18367a) && ckf.b(this.b, e93Var.b) && this.c == e93Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f18367a.hashCode() * 31;
        rpc.c cVar = this.b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode + i) * 31) + bbz.a(this.c);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CardTemplate(templateBean=" + this.f18367a + ", file=" + this.b + ", loaded=" + this.c + ')';
    }

    public /* synthetic */ e93(TemplateBean templateBean, rpc.c cVar, boolean z, int i, a07 a07Var) {
        this(templateBean, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? false : z);
    }
}
