package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ar7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f15945a;
    public final Integer b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(1029701644);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1029701643);
    }

    public ar7(Integer num, Integer num2, Double d, Double d2, Double d3, Double d4) {
        this.f15945a = num;
        this.b = num2;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
    }

    public final Double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("5c81229a", new Object[]{this});
        }
        return this.d;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9786c04b", new Object[]{this});
        }
        return this.b;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("ce3617fe", new Object[]{this});
        }
        return this.f15945a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar7)) {
            return false;
        }
        ar7 ar7Var = (ar7) obj;
        if (ckf.b(this.f15945a, ar7Var.f15945a) && ckf.b(this.b, ar7Var.b) && ckf.b(this.c, ar7Var.c) && ckf.b(this.d, ar7Var.d) && ckf.b(this.e, ar7Var.e) && ckf.b(this.f, ar7Var.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Integer num = this.f15945a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i7 = i * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            i2 = 0;
        } else {
            i2 = num2.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        Double d = this.c;
        if (d == null) {
            i3 = 0;
        } else {
            i3 = d.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        Double d2 = this.d;
        if (d2 == null) {
            i4 = 0;
        } else {
            i4 = d2.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        Double d3 = this.e;
        if (d3 == null) {
            i5 = 0;
        } else {
            i5 = d3.hashCode();
        }
        int i11 = (i10 + i5) * 31;
        Double d4 = this.f;
        if (d4 != null) {
            i6 = d4.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Display(width=" + this.f15945a + ", height=" + this.b + ", densityDPI=" + this.c + ", densityPixels=" + this.d + ", xDPI=" + this.e + ", yDPI=" + this.f + ')';
    }
}
