package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.pipeline.parser.Parsing;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class njz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ctz f24783a;
    public final Parsing b;
    public final abz c;
    public final AtomicBoolean d;
    public final Stack<olz> e;

    static {
        t2o.a(598737457);
    }

    public njz(ctz ctzVar, Parsing parsing, abz abzVar, AtomicBoolean atomicBoolean, Stack<olz> stack) {
        ckf.g(ctzVar, "variableRegion");
        ckf.g(parsing, "parsing");
        ckf.g(abzVar, "owner");
        ckf.g(atomicBoolean, "isParsing");
        ckf.g(stack, "invalidateStack");
        this.f24783a = ctzVar;
        this.b = parsing;
        this.c = abzVar;
        this.d = atomicBoolean;
        this.e = stack;
    }

    public final olz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (olz) ipChange.ipc$dispatch("f8c4dbb3", new Object[]{this});
        }
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.peek();
    }

    public final Stack<olz> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("9dd941e7", new Object[]{this});
        }
        return this.e;
    }

    public final abz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abz) ipChange.ipc$dispatch("51a7e21c", new Object[]{this});
        }
        return this.c;
    }

    public final Parsing d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parsing) ipChange.ipc$dispatch("986d6192", new Object[]{this});
        }
        return this.b;
    }

    public final ctz e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctz) ipChange.ipc$dispatch("8cdea5d0", new Object[]{this});
        }
        return this.f24783a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njz)) {
            return false;
        }
        njz njzVar = (njz) obj;
        if (ckf.b(this.f24783a, njzVar.f24783a) && ckf.b(this.b, njzVar.b) && ckf.b(this.c, njzVar.c) && ckf.b(this.d, njzVar.d) && ckf.b(this.e, njzVar.e)) {
            return true;
        }
        return false;
    }

    public final AtomicBoolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("81d42cad", new Object[]{this});
        }
        return this.d;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((this.f24783a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ParsingContext(variableRegion=" + this.f24783a + ", parsing=" + this.b + ", owner=" + this.c + ", isParsing=" + this.d + ", invalidateStack=" + this.e + ')';
    }

    public /* synthetic */ njz(ctz ctzVar, Parsing parsing, abz abzVar, AtomicBoolean atomicBoolean, Stack stack, int i, a07 a07Var) {
        this(ctzVar, parsing, abzVar, (i & 8) != 0 ? new AtomicBoolean(true) : atomicBoolean, (i & 16) != 0 ? new Stack() : stack);
    }
}
