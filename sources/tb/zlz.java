package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zlz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f32856a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;

    static {
        t2o.a(598737093);
    }

    public zlz(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ckf.g(iArr, "mainAxisPositions");
        this.f32856a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = iArr;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1281c5", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4beaaa66", new Object[]{this})).intValue();
        }
        return this.f32856a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("183be427", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6d495a3", new Object[]{this});
        }
        return this.f;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1cb8a8b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a944eb00", new Object[]{this})).intValue();
        }
        return this.c;
    }
}
