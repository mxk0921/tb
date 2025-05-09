package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26666a;
    public final String b;
    public final String c;
    public final long d;

    static {
        t2o.a(804257840);
    }

    public qc4(String str, String str2, String str3, long j) {
        ckf.g(str, "name");
        ckf.g(str2, "type");
        ckf.g(str3, "url");
        this.f26666a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f26666a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1d", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof qc4)) {
            return false;
        }
        qc4 qc4Var = (qc4) obj;
        if (!ckf.b(this.f26666a, qc4Var.f26666a) || !ckf.b(this.b, qc4Var.b) || !ckf.b(this.c, qc4Var.c) || this.d != qc4Var.d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.f26666a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + en9.a(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ComponentMeta(name=" + this.f26666a + ", type=" + this.b + ", url=" + this.c + ", version=" + this.d + f7l.BRACKET_END_STR;
    }
}
