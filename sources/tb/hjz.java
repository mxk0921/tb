package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f20698a;
    public final t2z b;
    public final i6z c;
    public final q7z d;
    public final fjz e;

    static {
        t2o.a(598737424);
    }

    public /* synthetic */ hjz(int i, t2z t2zVar, i6z i6zVar, q7z q7zVar, fjz fjzVar, a07 a07Var) {
        this(i, t2zVar, i6zVar, q7zVar, fjzVar);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d1bea63", new Object[]{this})).intValue();
        }
        return this.f20698a;
    }

    public final fjz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("29477d6f", new Object[]{this});
        }
        return this.e;
    }

    public final t2z c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2z) ipChange.ipc$dispatch("9ae6dd02", new Object[]{this});
        }
        return this.b;
    }

    public final i6z d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6z) ipChange.ipc$dispatch("81d93224", new Object[]{this});
        }
        return this.c;
    }

    public final q7z e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q7z) ipChange.ipc$dispatch("d16180c2", new Object[]{this});
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjz)) {
            return false;
        }
        hjz hjzVar = (hjz) obj;
        if (this.f20698a == hjzVar.f20698a && ckf.b(this.b, hjzVar.b) && ckf.b(this.c, hjzVar.c) && ckf.b(this.d, hjzVar.d) && ckf.b(this.e, hjzVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((this.f20698a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OriginParams(codeExprIndex=" + ((Object) fwu.j0(this.f20698a)) + ", constantSectionResult=" + this.b + ", exprSectionResult=" + this.c + ", funcSectionResult=" + this.d + ", composeFuncRootNodes=" + this.e + ')';
    }

    public hjz(int i, t2z t2zVar, i6z i6zVar, q7z q7zVar, fjz fjzVar) {
        this.f20698a = i;
        this.b = t2zVar;
        this.c = i6zVar;
        this.d = q7zVar;
        this.e = fjzVar;
    }
}
