package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wx8 {

    /* renamed from: a  reason: collision with root package name */
    public static final vx8 f30984a = new a();
    public static final vx8 b = new b();
    public static final vx8 c = new c();
    public static final vx8 d = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements vx8 {
        @Override // tb.vx8
        public zx8 a(float f, float f2, float f3) {
            return zx8.a(255, com.google.android.material.transition.b.l(0, 255, f2, f3, f));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements vx8 {
        @Override // tb.vx8
        public zx8 a(float f, float f2, float f3) {
            return zx8.b(com.google.android.material.transition.b.l(255, 0, f2, f3, f), 255);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements vx8 {
        @Override // tb.vx8
        public zx8 a(float f, float f2, float f3) {
            return zx8.b(com.google.android.material.transition.b.l(255, 0, f2, f3, f), com.google.android.material.transition.b.l(0, 255, f2, f3, f));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements vx8 {
        @Override // tb.vx8
        public zx8 a(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return zx8.b(com.google.android.material.transition.b.l(255, 0, f2, f4, f), com.google.android.material.transition.b.l(0, 255, f4, f3, f));
        }
    }

    public static vx8 a(int i, boolean z) {
        vx8 vx8Var = f30984a;
        vx8 vx8Var2 = b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return c;
                }
                if (i == 3) {
                    return d;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return vx8Var2;
            } else {
                return vx8Var;
            }
        } else if (z) {
            return vx8Var;
        } else {
            return vx8Var2;
        }
    }
}
