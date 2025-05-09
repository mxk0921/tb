package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class idl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final float f21255a = uel.j();
    public static final float b = uel.c();
    public static final float c = uel.i();
    public static final boolean d = uel.b();
    public static final boolean e = yv6.a();
    public static final String sPid = "28046-tracker";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(297795658);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a238cd3", new Object[]{str, str2});
            }
            return new a(str, str2, idl.sPid, idl.a(str));
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/utils/OrderJSTracker$OrderCustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(297795659);
        }

        public b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/utils/OrderJSTracker$OrderMtopModel");
        }

        public static b o(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4d3a4c24", new Object[]{str, str2, new Boolean(z)});
            }
            return new b(str, idl.sPid, idl.a(str), str2, z);
        }
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79338cc", new Object[]{new Float(f)})).floatValue();
        }
        if (yv6.a()) {
            return 1.0f;
        }
        return f;
    }

    public static void c(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (d) {
            if (h15Var instanceof a) {
                float f = b;
                if (f <= 0.0f) {
                    f = h15Var.getSampling();
                }
                f9v.p(h15Var.sampling(b(f)));
                return;
            }
            throw new IllegalArgumentException("请使用OrderCustomModel");
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c623f59", new Object[]{str, str2, str3});
        } else if (d) {
            f9v.q(xh8.b(ncl.b, sPid, a(str)).c(str2).message(str3));
        }
    }

    public static void e(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (d) {
            if (p5jVar instanceof b) {
                float f = c;
                if (f <= 0.0f) {
                    f = p5jVar.getSampling();
                }
                f9v.r(p5jVar.sampling(b(f)));
                return;
            }
            throw new IllegalArgumentException("请使用OrderMtopModel");
        }
    }

    public static void f(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f3f206", new Object[]{str, new Float(f)});
        } else if (d) {
            bkl bklVar = new bkl(ncl.b, sPid, a(str));
            float f2 = f21255a;
            if (f2 > 0.0f) {
                f = f2;
            }
            f9v.s(bklVar.sampling(b(f)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r11.equals(com.taobao.android.order.constants.OrderBizCode.orderDetail) == false) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r11.equals(com.taobao.android.order.constants.OrderBizCode.orderDetail) == false) goto L_0x008d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.idl.a(java.lang.String):java.lang.String");
    }

    static {
        t2o.a(297795657);
        uel.f("order_perf_sampling_of_jstracker");
    }
}
