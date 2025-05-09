package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g8z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte f19791a;
    public final short b;
    public final String c;
    public final long d;
    public final List<pnz> e;

    static {
        t2o.a(598737441);
    }

    public /* synthetic */ g8z(byte b, short s, String str, long j, List list, a07 a07Var) {
        this(b, s, str, j, list);
    }

    public final List<pnz> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ad66df0a", new Object[]{this});
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8z)) {
            return false;
        }
        g8z g8zVar = (g8z) obj;
        if (this.f19791a == g8zVar.f19791a && this.b == g8zVar.b && ckf.b(this.c, g8zVar.c) && this.d == g8zVar.d && ckf.b(this.e, g8zVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((this.f19791a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + kwu.v(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HeaderSectionResult(buildVersionMajor=" + ((Object) tru.h0(this.f19791a)) + ", buildVersionMinor=" + ((Object) tyu.h0(this.b)) + ", templateName=" + this.c + ", templateVersion=" + ((Object) kwu.j0(this.d)) + ", sectionInfos=" + this.e + ')';
    }

    public g8z(byte b, short s, String str, long j, List<pnz> list) {
        this.f19791a = b;
        this.b = s;
        this.c = str;
        this.d = j;
        this.e = list;
    }
}
