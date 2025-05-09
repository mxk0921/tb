package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24958a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    static {
        t2o.a(815792884);
    }

    public nun(String str, int i, int i2, String str2, int i3) {
        ckf.g(str2, "text");
        this.f24958a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0fedb84", new Object[]{this});
        }
        return this.f24958a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.d;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62fc14ea", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nun)) {
            return false;
        }
        nun nunVar = (nun) obj;
        if (ckf.b(this.f24958a, nunVar.f24958a) && this.b == nunVar.b && this.c == nunVar.c && ckf.b(this.d, nunVar.d) && this.e == nunVar.e) {
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
        String str = this.f24958a;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RefreshGuide(lottie=" + this.f24958a + ", width=" + this.b + ", height=" + this.c + ", text=" + this.d + ", triggerIndex=" + this.e + ')';
    }
}
