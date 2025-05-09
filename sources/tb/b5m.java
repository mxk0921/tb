package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.TaobaoEvnInitializer;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b5m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f16188a;
    public static b b;
    public static w c;
    public static i d;
    public static m e;
    public static r f;
    public static a g;
    public static q h;
    public static u i;
    public static t j;
    public static f k;
    public static l l;
    public static c m;
    public static n n;
    public static g o;
    public static x p;
    public static o q;
    public static d r;
    public static e s;
    public static h t;
    public static v u;
    public static z v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(String str, Context context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a0 {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        Application a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(String str, String str2, String str3, View view, String... strArr);

        void b(String str, String str2, String str3, String... strArr);

        void c(String str, String str2, String str3, View view, String... strArr);

        void commitEnter(String str, String str2, Object obj, String... strArr);

        void commitLeave(String str, String str2, Object obj, String... strArr);

        void d(String str, Object obj, Map<String, String> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        boolean a(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
        void a(Activity activity, Float f, String str, String str2, String str3, Point point);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
        String a(String str, String str2);

        void a(boolean z, y yVar);

        boolean b(String str, int i, int i2, s sVar);

        boolean c(String str, k kVar);

        boolean d(String str, Map<String, String> map, k kVar);

        boolean e(String str, p pVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        String a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
        String a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
        boolean a(Context context);

        boolean b(Context context);

        boolean c(Context context);

        qi7 getDeviceLevel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f16189a;
        public w b;
        public i c;
        public m d;
        public r e;
        public a f;
        public q g;
        public u h;
        public t i;
        public f j;
        public l k;
        public c l;
        public n m;
        public g n;
        public x o;
        public o p;
        public d q;
        public e r;
        public h s;
        public v t;
        public z u;

        static {
            t2o.a(912262126);
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b257aa73", new Object[]{this});
            } else if (this.f16189a == null) {
                throw new IllegalArgumentException("must set AndroidEvn with builder");
            } else if (this.b == null) {
                throw new IllegalArgumentException("must set VideoEvn with builder");
            } else if (this.c == null) {
                throw new IllegalArgumentException("must set DeviceEvn with builder");
            } else if (this.d == null) {
                throw new IllegalArgumentException("must set LocationEvn with builder");
            } else if (this.e == null) {
                throw new IllegalArgumentException("must set RuntimeEvn with builder");
            } else if (this.f == null) {
                throw new IllegalArgumentException("must set ABEvn with builder");
            } else if (this.g == null) {
                throw new IllegalArgumentException("must set ReminderEvn with builder");
            } else if (this.h == null) {
                throw new IllegalArgumentException("must set ThemeEvn with builder");
            } else if (this.i == null) {
                throw new IllegalArgumentException("must set TCacheEvn with builder");
            } else if (this.j == null) {
                throw new IllegalArgumentException("must set CollectorEvn with builder");
            } else if (this.k == null) {
                throw new IllegalArgumentException("must set LocalizationEvn with builder");
            } else if (this.l == null) {
                throw new IllegalArgumentException("must set BehaviorTrackerEvn with builder");
            } else if (this.m == null) {
                throw new IllegalArgumentException("must set LoginEvn with builder");
            } else if (this.n == null) {
                throw new IllegalArgumentException("must set ConfigSpaceEvn with builder");
            } else if (this.p == null) {
                throw new IllegalArgumentException("must set SpmEvn with builder");
            } else if (this.q == null) {
                throw new IllegalArgumentException("must set BizContextInstaller with builder");
            } else if (this.u == null) {
                throw new IllegalArgumentException("must set MSOA with builder");
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b110817", new Object[]{this});
            } else if (!b5m.a()) {
                b5m.b(true);
                a();
                b5m.d(this.f16189a);
                b5m.o(this.b);
                b5m.p(this.c);
                b5m.q(this.d);
                b5m.r(this.e);
                b5m.s(this.f);
                b5m.t(this.g);
                b5m.u(this.h);
                b5m.v(this.i);
                b5m.c(this.j);
                b5m.e(this.k);
                b5m.f(this.l);
                b5m.g(this.m);
                b5m.h(this.n);
                b5m.i(this.o);
                b5m.j(this.p);
                b5m.k(this.q);
                b5m.l(this.r);
                b5m.m(this.s);
                b5m.n(this.t);
                b5m.T(this.u);
            }
        }

        public j c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("1a8030f3", new Object[]{this, aVar});
            }
            this.f = aVar;
            return this;
        }

        public j d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("8023dd61", new Object[]{this, bVar});
            }
            this.f16189a = bVar;
            return this;
        }

        public j e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("c13ab973", new Object[]{this, cVar});
            }
            this.l = cVar;
            return this;
        }

        public j f(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("849a4ab3", new Object[]{this, dVar});
            }
            this.q = dVar;
            return this;
        }

        public j g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("93407853", new Object[]{this, eVar});
            }
            this.r = eVar;
            return this;
        }

        public j h(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("de88bc65", new Object[]{this, fVar});
            }
            this.j = fVar;
            return this;
        }

        public j i(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("94eebe37", new Object[]{this, gVar});
            }
            this.n = gVar;
            return this;
        }

        public j j(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("443b4453", new Object[]{this, hVar});
            }
            this.s = hVar;
            return this;
        }

        public j k(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("41aed893", new Object[]{this, iVar});
            }
            this.c = iVar;
            return this;
        }

        public j l(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("da643d33", new Object[]{this, lVar});
            }
            this.k = lVar;
            return this;
        }

        public j m(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("ff29af33", new Object[]{this, mVar});
            }
            this.d = mVar;
            return this;
        }

        public j n(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("4ac0932d", new Object[]{this, nVar});
            }
            this.m = nVar;
            return this;
        }

        public j o(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("7e79ef73", new Object[]{this, oVar});
            }
            this.p = oVar;
            return this;
        }

        public j p(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("a4301013", new Object[]{this, qVar});
            }
            this.g = qVar;
            return this;
        }

        public j q(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("693ce64f", new Object[]{this, rVar});
            }
            this.e = rVar;
            return this;
        }

        public j r(t tVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("98a05793", new Object[]{this, tVar});
            }
            this.i = tVar;
            return this;
        }

        public j s(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("383f166d", new Object[]{this, uVar});
            }
            this.h = uVar;
            return this;
        }

        public j t(v vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("d5f02cd3", new Object[]{this, vVar});
            }
            this.t = vVar;
            return this;
        }

        public j u(w wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("c316e409", new Object[]{this, wVar});
            }
            this.b = wVar;
            return this;
        }

        public j v(x xVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("9867f153", new Object[]{this, xVar});
            }
            this.o = xVar;
            return this;
        }

        public j w(z zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("f84ecef5", new Object[]{this, zVar});
            }
            this.u = zVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
        void onFailure(String str, String str2);

        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
        String getLocation();

        boolean isI18nEdition();

        String localizedString(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface m {
        String a(Context context);

        String b(Context context);

        String c(Context context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface n {
        String getNick();

        String getUserId();

        boolean isSessionValid();

        void login(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface o {
        String a();

        String b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface p {
        void onFailure(String str, String str2);

        void onSuccess(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface q {
        boolean a(Context context, ze7 ze7Var, JSONObject jSONObject, k kVar);

        boolean b(Context context, ze7 ze7Var, JSONObject jSONObject, k kVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface r {
        String a();

        String b();

        String getAppVersion();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface s {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface t {
        void a(String... strArr);

        void b(SimpleEntry<String, String> simpleEntry);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface u {
        String a(String str, String str2);

        boolean b();

        int c(String str, String str2, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface v {
        String a();

        void b(String str, String str2);

        void c(String str, String str2, Map<String, String> map);

        void d(String str, String str2, String str3, String str4, Map<String, String> map);

        void e(String str, String str2);

        void f(String str, Map<String, String> map);

        void g(String str);

        void h(String str, String str2, String str3);

        void i(String str, Map<String, String> map);

        void j(String str);

        String k(Activity activity);

        void l(String str, String str2);

        v m();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface w {
        boolean a(Context context);

        boolean b(Context context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface x {
        Drawable a();

        void b(Context context, String str);

        Drawable c();

        Drawable d();

        Drawable e(boolean z, boolean z2);

        r8c f(Context context, ze7 ze7Var, GalleryCore galleryCore);

        Drawable g();

        int h();

        Drawable i(boolean z, boolean z2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface y {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface z {
        void a(String str, String str2, String str3, String str4, Map<String, Object> map, a0 a0Var);
    }

    static {
        t2o.a(912262115);
        x();
    }

    public static c A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cbe67b23", new Object[0]);
        }
        return m;
    }

    public static d B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("56eb0907", new Object[0]);
        }
        return r;
    }

    public static e C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3d9371e5", new Object[0]);
        }
        return s;
    }

    public static f D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("44123003", new Object[0]);
        }
        return k;
    }

    public static g E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f23f1563", new Object[0]);
        }
        return o;
    }

    public static h F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("8ff2fcd", new Object[0]);
        }
        return t;
    }

    public static i G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("142f7e11", new Object[0]);
        }
        return d;
    }

    public static l H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("b2969e97", new Object[0]);
        }
        return l;
    }

    public static m I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("17850ecf", new Object[0]);
        }
        return e;
    }

    public static n J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("40978583", new Object[0]);
        }
        return n;
    }

    public static o K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("da91cb03", new Object[0]);
        }
        return q;
    }

    public static q L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("2ed26c89", new Object[0]);
        }
        return h;
    }

    public static r M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("9435a563", new Object[0]);
        }
        return f;
    }

    public static t N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("eea4d441", new Object[0]);
        }
        return j;
    }

    public static u O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("aaa6c983", new Object[0]);
        }
        return i;
    }

    public static v P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("76775aad", new Object[0]);
        }
        return u;
    }

    public static w Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("a9913643", new Object[0]);
        }
        return c;
    }

    public static x R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("38c42ed", new Object[0]);
        }
        return p;
    }

    public static synchronized boolean S() {
        synchronized (b5m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[0])).booleanValue();
            }
            return f16188a;
        }
    }

    public static /* synthetic */ z T(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("9886c064", new Object[]{zVar});
        }
        v = zVar;
        return zVar;
    }

    public static z U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("f31cf03", new Object[0]);
        }
        return v;
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f16188a;
    }

    public static /* synthetic */ boolean b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z2)})).booleanValue();
        }
        f16188a = z2;
        return z2;
    }

    public static /* synthetic */ f c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5a563d14", new Object[]{fVar});
        }
        k = fVar;
        return fVar;
    }

    public static /* synthetic */ b d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2e5674c6", new Object[]{bVar});
        }
        b = bVar;
        return bVar;
    }

    public static /* synthetic */ l e(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("780653cd", new Object[]{lVar});
        }
        l = lVar;
        return lVar;
    }

    public static /* synthetic */ c f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f86fd104", new Object[]{cVar});
        }
        m = cVar;
        return cVar;
    }

    public static /* synthetic */ n g(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d4e93fe9", new Object[]{nVar});
        }
        n = nVar;
        return nVar;
    }

    public static /* synthetic */ g h(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ebdf8e7e", new Object[]{gVar});
        }
        o = gVar;
        return gVar;
    }

    public static /* synthetic */ x i(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("c26adfa9", new Object[]{xVar});
        }
        p = xVar;
        return xVar;
    }

    public static /* synthetic */ o j(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("776478a8", new Object[]{oVar});
        }
        q = oVar;
        return oVar;
    }

    public static /* synthetic */ d k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("16a6c307", new Object[]{dVar});
        }
        r = dVar;
        return dVar;
    }

    public static /* synthetic */ e l(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6d339906", new Object[]{eVar});
        }
        s = eVar;
        return eVar;
    }

    public static /* synthetic */ h m(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("9edff625", new Object[]{hVar});
        }
        t = hVar;
        return hVar;
    }

    public static /* synthetic */ v n(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("fe79cfcf", new Object[]{vVar});
        }
        u = vVar;
        return vVar;
    }

    public static /* synthetic */ w o(w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("3ed013fd", new Object[]{wVar});
        }
        c = wVar;
        return wVar;
    }

    public static /* synthetic */ i p(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("9e122bba", new Object[]{iVar});
        }
        d = iVar;
        return iVar;
    }

    public static /* synthetic */ m q(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("1cce7bb9", new Object[]{mVar});
        }
        e = mVar;
        return mVar;
    }

    public static /* synthetic */ r r(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("44576e94", new Object[]{rVar});
        }
        f = rVar;
        return rVar;
    }

    public static /* synthetic */ a s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("68f4efb7", new Object[]{aVar});
        }
        g = aVar;
        return aVar;
    }

    public static /* synthetic */ q t(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("6f8061b6", new Object[]{qVar});
        }
        h = qVar;
        return qVar;
    }

    public static /* synthetic */ u u(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("4df46853", new Object[]{uVar});
        }
        i = uVar;
        return uVar;
    }

    public static /* synthetic */ t v(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("85d89f74", new Object[]{tVar});
        }
        j = tVar;
        return tVar;
    }

    public static boolean x() {
        if (!S()) {
            try {
                IpChange ipChange = TaobaoEvnInitializer.$ipChange;
                TaobaoEvnInitializer.class.getDeclaredMethod("initialize", new Class[0]).invoke(null, new Object[0]);
                return true;
            } catch (Throwable th) {
                tgh.c("PlatformEvn", "initTaobaoEvn() error", th);
            }
        }
        return false;
    }

    public static a y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a5e7cce7", new Object[0]);
        }
        return g;
    }

    public static b z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cc90dac3", new Object[0]);
        }
        return b;
    }

    public static boolean w(Context context, ze7 ze7Var) {
        try {
            IpChange ipChange = TaobaoEvnInitializer.$ipChange;
            TaobaoEvnInitializer.class.getDeclaredMethod("overrideOrImplementDefaultBehaviors", Context.class, ze7.class).invoke(null, context, ze7Var);
            return true;
        } catch (Throwable th) {
            tgh.c("PlatformEvn", "defaultInitTaobaoBehaviors() error", th);
            return false;
        }
    }
}
