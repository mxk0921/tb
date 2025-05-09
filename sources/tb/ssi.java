package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ssi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28251a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    static {
        t2o.a(993001862);
    }

    public ssi(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.f28251a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.f28251a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a100bc0d", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19804c6c", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccbccb8b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1a2767", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ed674", new Object[]{this})).booleanValue();
        }
        return this.f;
    }
}
