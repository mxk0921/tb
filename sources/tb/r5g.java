package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\""}, d2 = {"Ltb/r5g;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "h", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Ltb/r5g;)I", "f", "(II)Z", at.f, "(III)Z", TLogTracker.LEVEL_INFO, TplMsg.VALUE_T_NATIVE_RETURN, "d", "c", "e", "version", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class r5g implements Comparable<r5g> {
    public static final int MAX_COMPONENT_VALUE = 255;

    /* renamed from: a  reason: collision with root package name */
    private final int f27123a;
    private final int b;
    private final int c;
    private final int d;
    public static final a Companion = new a(null);
    public static final r5g CURRENT = s5g.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public r5g(int i, int i2, int i3) {
        this.f27123a = i;
        this.b = i2;
        this.c = i3;
        this.d = h(i, i2, i3);
    }

    private final int h(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(r5g r5gVar) {
        ckf.g(r5gVar, "other");
        return this.d - r5gVar.d;
    }

    public final int b() {
        return this.f27123a;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        r5g r5gVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r5g) {
            r5gVar = (r5g) obj;
        } else {
            r5gVar = null;
        }
        if (r5gVar != null && this.d == r5gVar.d) {
            return true;
        }
        return false;
    }

    public final boolean f(int i, int i2) {
        int i3 = this.f27123a;
        if (i3 > i || (i3 == i && this.b >= i2)) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2, int i3) {
        int i4;
        int i5 = this.f27123a;
        if (i5 > i || (i5 == i && ((i4 = this.b) > i2 || (i4 == i2 && this.c >= i3)))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27123a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    public r5g(int i, int i2) {
        this(i, i2, 0);
    }
}
