package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class civ {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f17089a;
    public int b;

    static {
        t2o.a(116391942);
    }

    public civ() {
        this(0L, 0, 3, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.f17089a;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687a9b9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof civ) {
                civ civVar = (civ) obj;
                if (!(this.f17089a == civVar.f17089a && this.b == civVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (en9.a(this.f17089a) * 31) + this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UnitWindowLog(timestamp=" + this.f17089a + ", size=" + this.b + f7l.BRACKET_END_STR;
    }

    public civ(long j, int i) {
        this.f17089a = j;
        this.b = i;
    }

    public /* synthetic */ civ(long j, int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}
