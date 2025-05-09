package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ne3 {
    public static final c Companion = new c(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f24675a;

        static {
            t2o.a(478151021);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(c9x.CART_BIZ_NAME, str, ub3.PID, "http://taobao.com/jstracker/weex/cart.html");
            ckf.g(str, "cartCode");
            this.f24675a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/jstracker/CartWeexJSTracker$CartCustomModel");
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67ecf836", new Object[]{this});
            }
            return this.f24675a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj || ((obj instanceof a) && ckf.b(this.f24675a, ((a) obj).f24675a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f24675a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CartCustomModel(cartCode=" + this.f24675a + f7l.BRACKET_END_STR;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends pwl {
        static {
            t2o.a(478151022);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(c9x.CART_BIZ_NAME, ub3.PID, "http://taobao.com/jstracker/weex/cart.html");
            ckf.g(str, "cartName");
            e(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151023);
        }

        public c() {
        }

        public static /* synthetic */ void b(c cVar, String str, Throwable th, float f, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85312c76", new Object[]{cVar, str, th, new Float(f), new Integer(i), obj});
                return;
            }
            if ((i & 4) != 0) {
                f = 1.0f;
            }
            cVar.a(str, th, f);
        }

        public static /* synthetic */ void e(c cVar, String str, String str2, float f, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de15a3b", new Object[]{cVar, str, str2, new Float(f), new Integer(i), obj});
                return;
            }
            if ((i & 4) != 0) {
                f = 1.0f;
            }
            cVar.d(str, str2, f);
        }

        public static /* synthetic */ void h(c cVar, String str, String str2, long j, float f, int i, Object obj) {
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4e2c90", new Object[]{cVar, str, str2, new Long(j), new Float(f), new Integer(i), obj});
                return;
            }
            if ((i & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            cVar.f(str, str2, j, f2);
        }

        public final void c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c7e84e8", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, "model");
            m9u.a aVar2 = m9u.Companion;
            aVar2.a("Cart#reportCustom#" + aVar.a());
            aVar.sampling(1.0f);
            f9v.p(aVar);
            aVar2.b("Cart#reportCustom#" + aVar.a());
        }

        public final void d(String str, String str2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b82651", new Object[]{this, str, str2, new Float(f)});
                return;
            }
            ckf.g(str, "code");
            ckf.g(str2, "message");
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#reportError#".concat(str));
            f9v.q(xh8.b(c9x.CART_BIZ_NAME, ub3.PID, "http://taobao.com/jstracker/weex/cart.html").c(str).sampling(f).message(str2));
            aVar.b("Cart#reportError#".concat(str));
        }

        public final void f(String str, String str2, long j, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36bf56d4", new Object[]{this, str, str2, new Long(j), new Float(f)});
                return;
            }
            ckf.g(str, "name");
            ckf.g(str2, "stageName");
            if (j > 0) {
                m9u.a aVar = m9u.Companion;
                aVar.a("Cart#reportPef#".concat(str2));
                b bVar = new b(str);
                bVar.a(str2, j);
                bVar.sampling(f);
                g(bVar);
                aVar.b("Cart#reportPef#".concat(str2));
            }
        }

        public final void g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9735c0e8", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "model");
            bVar.sampling(1.0f);
            f9v.t(bVar);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public final void a(String str, Throwable th, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfd03864", new Object[]{this, str, th, new Float(f)});
                return;
            }
            ckf.g(str, "code");
            ckf.g(th, "throwable");
            m9u.Companion.a("Cart#reportCatchException#".concat(str));
            try {
                String a2 = sgq.a(th);
                String str2 = "";
                if (a2 != null) {
                    str2 = a2.substring(0, 100);
                    ckf.f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                d(str, "错误堆栈：".concat(str2), f);
                hav.d(c9x.TAG, "reportErrorJSTracker code=" + str + ",stackTrace=" + a2);
            } catch (Exception unused) {
            }
            m9u.Companion.b("Cart#reportCatchException#".concat(str));
        }
    }

    static {
        t2o.a(478151020);
    }
}
