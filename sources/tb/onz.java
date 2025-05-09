package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class onz<ResultT, ErrorT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25519a;
    public final ResultT b;
    public final ErrorT c;

    static {
        t2o.a(598737447);
    }

    public onz(int i, ResultT resultt, ErrorT errort) {
        this.f25519a = i;
        this.b = resultt;
        this.c = errort;
    }

    public final ResultT a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultT) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.b;
    }

    public final ErrorT b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorT) ipChange.ipc$dispatch("7b6a079", new Object[]{this});
        }
        return this.c;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onz)) {
            return false;
        }
        onz onzVar = (onz) obj;
        if (this.f25519a == onzVar.f25519a && ckf.b(this.b, onzVar.b) && ckf.b(this.c, onzVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.f25519a * 31;
        ResultT resultt = this.b;
        if (resultt == null) {
            i = 0;
        } else {
            i = resultt.hashCode();
        }
        int i4 = (i3 + i) * 31;
        ErrorT errort = this.c;
        if (errort != null) {
            i2 = errort.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SectionExecuteResult(type=" + this.f25519a + ", data=" + this.b + ", error=" + this.c + ')';
    }

    public /* synthetic */ onz(int i, Object obj, Object obj2, int i2, a07 a07Var) {
        this(i, obj, (i2 & 4) != 0 ? null : obj2);
    }
}
