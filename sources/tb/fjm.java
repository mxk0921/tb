package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fjm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f19343a;
    public final int b;
    public final int c;

    static {
        t2o.a(995098664);
    }

    public fjm(int i, int i2, int i3) {
        this.f19343a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af0244ff", new Object[]{this})).intValue();
        }
        return this.f19343a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cde3a09", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof fjm) {
                fjm fjmVar = (fjm) obj;
                if (!(this.f19343a == fjmVar.f19343a && this.b == fjmVar.b && this.c == fjmVar.c)) {
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
        return (((this.f19343a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PositionInfo(page=" + this.f19343a + ", pagePos=" + this.b + ", pageSize=" + this.c + f7l.BRACKET_END_STR;
    }
}
