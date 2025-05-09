package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f24518a;
    public final Context b;
    public JSONObject c;
    public Future d;
    public final String e;
    public n f;
    public final g g;
    public final String h;
    public boolean i;
    public lgs.b j;
    public o k;
    public final View l;
    public boolean m;
    public Map n;
    public final o.y.a o;
    public boolean p;
    public Object q;
    public TNodeView r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            if (!n54.a(n54.this) && n54.c(n54.this).getMeasuredHeight() > 0) {
                n54 n54Var = n54.this;
                n54.d(n54Var, n54.c(n54Var).getMeasuredWidth(), n54.c(n54.this).getMeasuredHeight());
                n54.b(n54.this, true);
                n54.c(n54.this).getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f24520a;

        public b(e eVar) {
            this.f24520a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n54 n54Var = n54.this;
            n54Var.c = n54.e(n54Var);
            ((d) this.f24520a).a(n54.this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements o.w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.y f24521a;

        public c(o.y yVar) {
            this.f24521a = yVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
        public void b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                return;
            }
            n54.f(n54.this, false);
            n54 n54Var = n54.this;
            n54Var.f = nVar;
            if (nVar != null) {
                nVar.m1(n54.g(n54Var));
            }
            g gVar = n54.this.g;
            if (gVar == null) {
                return;
            }
            if (nVar != null) {
                gVar.onLayoutCompleted(nVar);
            } else if (gVar instanceof f) {
                ((f) gVar).a(this.f24521a);
            } else {
                gVar.onLayoutError();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24522a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        public d(int i, int i2, long j) {
            this.f24522a = i;
            this.b = i2;
            this.c = j;
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8251d27f", new Object[]{this, obj});
            } else {
                n54.i(n54.this, n54.h(n54.this, this.f24522a, this.b), this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface f extends g {
        void a(o.y yVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void onLayoutCompleted(n nVar);

        void onLayoutError();
    }

    static {
        t2o.a(503317531);
    }

    public n54(o.y.a aVar, o oVar, g gVar) {
        this.f24518a = new JSONObject();
        this.m = false;
        this.p = false;
        this.o = aVar;
        this.k = oVar;
        this.g = gVar;
        Map f2 = aVar.f();
        String h = aVar.h() != null ? aVar.h() : aVar.g();
        if (h != null) {
            if (f2 == null) {
                f2 = new HashMap();
                aVar.s(f2);
            }
            f2.put("url", h);
        }
        this.h = h == null ? "" : h;
        if (this.b == null) {
            this.b = aVar.e();
        }
    }

    public static /* synthetic */ boolean a(n54 n54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f17a5f", new Object[]{n54Var})).booleanValue();
        }
        return n54Var.m;
    }

    public static /* synthetic */ boolean b(n54 n54Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51254f9b", new Object[]{n54Var, new Boolean(z)})).booleanValue();
        }
        n54Var.m = z;
        return z;
    }

    public static /* synthetic */ View c(n54 n54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a410899e", new Object[]{n54Var});
        }
        return n54Var.l;
    }

    public static /* synthetic */ void d(n54 n54Var, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6182637d", new Object[]{n54Var, new Integer(i), new Integer(i2)});
        } else {
            n54Var.o(i, i2);
        }
    }

    public static /* synthetic */ JSONObject e(n54 n54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("22e32f7e", new Object[]{n54Var});
        }
        return n54Var.p();
    }

    public static /* synthetic */ boolean f(n54 n54Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beaf817", new Object[]{n54Var, new Boolean(z)})).booleanValue();
        }
        n54Var.p = z;
        return z;
    }

    public static /* synthetic */ TNodeView g(n54 n54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("cef6bcbd", new Object[]{n54Var});
        }
        return n54Var.r;
    }

    public static /* synthetic */ o.y h(n54 n54Var, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o.y) ipChange.ipc$dispatch("10c6fbae", new Object[]{n54Var, new Integer(i), new Integer(i2)});
        }
        return n54Var.k(i, i2);
    }

    public static /* synthetic */ void i(n54 n54Var, o.y yVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab85d8c9", new Object[]{n54Var, yVar, new Long(j)});
        } else {
            n54Var.t(yVar, j);
        }
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f121678", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void j(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2fcca7", new Object[]{this, map});
        } else if (map != null) {
            HashMap hashMap = new HashMap();
            map.put("env", hashMap);
            ILogin q = od0.D().q();
            if (q != null) {
                HashMap hashMap2 = new HashMap();
                hashMap.put("user", hashMap2);
                boolean b2 = q.b();
                hashMap2.put("isLogin", Boolean.valueOf(b2));
                if (b2) {
                    ILogin.a a2 = q.a();
                    hashMap2.put("uId", a2.f12001a);
                    hashMap2.put("nick", a2.b);
                    hashMap2.put("userLogo", a2.c);
                }
            }
            IFestival k = od0.D().k();
            if (k != null) {
                hashMap.put("festival", k.t().toMap());
            }
            if (od0.D().f().E(this.h, this.b)) {
                map.put("scene", "launch");
            }
        }
    }

    public final o.y k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o.y) ipChange.ipc$dispatch("f59cc8b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        o.y.a aVar = this.o;
        if (aVar != null) {
            aVar.l(i);
            this.o.k(i2);
            j(this.o.f());
            return this.o.d();
        }
        o.y.a aVar2 = new o.y.a(this.b);
        aVar2.v(this.h);
        aVar2.x(this.i);
        if (!TextUtils.isEmpty(this.e)) {
            aVar2.o(this.e);
        }
        aVar2.r(this.f24518a);
        aVar2.l(i);
        aVar2.k(i2);
        aVar2.n(this.c);
        aVar2.t(this.n);
        aVar2.w(this.j);
        j(this.f24518a);
        return aVar2.d();
    }

    public o l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("49f66b1f", new Object[]{this});
        }
        return this.k;
    }

    public n m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("59438703", new Object[]{this});
        }
        return this.f;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.h;
    }

    public final void o(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0d52d1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        igs.a("delegate layout");
        q(new d(i, i2, System.nanoTime()));
        igs.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject p() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.n54.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4d3b01ba"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
        L_0x0015:
            r0 = 0
            java.util.concurrent.Future r1 = r4.d     // Catch: InterruptedException -> 0x001d, ExecutionException -> 0x001f
            java.lang.Object r1 = r1.get()     // Catch: InterruptedException -> 0x001d, ExecutionException -> 0x001f
            goto L_0x0029
        L_0x001d:
            r1 = move-exception
            goto L_0x0021
        L_0x001f:
            r1 = move-exception
            goto L_0x0025
        L_0x0021:
            r1.printStackTrace()
            goto L_0x0028
        L_0x0025:
            r1.printStackTrace()
        L_0x0028:
            r1 = r0
        L_0x0029:
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONObject
            if (r2 == 0) goto L_0x0031
            r0 = r1
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            goto L_0x004f
        L_0x0031:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x004f
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: Exception -> 0x003d
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: Exception -> 0x003d
            goto L_0x004f
        L_0x003d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "initData is invalid json"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            tb.tfs.d(r1)
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.n54.p():com.alibaba.fastjson.JSONObject");
    }

    public final void q(e eVar) {
        Future future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5c907c", new Object[]{this, eVar});
            return;
        }
        if (this.c == null && (future = this.d) != null) {
            if (future.isDone()) {
                this.c = p();
            } else {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(eVar));
                return;
            }
        }
        ((d) eVar).a(this.c);
    }

    public final void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6b7c81", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                if (value == null || ((value instanceof String) && TextUtils.isEmpty((CharSequence) value))) {
                    it.remove();
                }
            }
        }
    }

    public final void t(o.y yVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218f891", new Object[]{this, yVar, new Long(j)});
            return;
        }
        Object obj = this.q;
        if (obj != null) {
            this.k.u1(obj);
        }
        if (this.k.W() == null && (yVar.n() instanceof Activity)) {
            this.k.u1(yVar.n());
        }
        this.k.s1(this.r);
        this.k.f1(yVar, new c(yVar));
    }

    public void u(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b13242", new Object[]{this, tNodeView});
        } else {
            this.r = tNodeView;
        }
    }

    public void v(Future future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44db9610", new Object[]{this, future});
        } else {
            this.d = future;
        }
    }

    public void w(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcae8a4d", new Object[]{this, obj});
        } else {
            this.q = obj;
        }
    }

    public void x(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b7d8c", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f38b2", new Object[]{this});
        } else {
            this.m = false;
        }
    }

    public void z(lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f82ce1", new Object[]{this, bVar});
        } else if (bVar != null && bVar.g) {
            this.j = bVar;
        }
    }

    public void B(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd00dee", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.h == null) {
            tfs.d("url is Null");
        } else {
            igs.a("setupLayout");
            o.o0(this.b);
            if (this.p) {
                igs.c();
                return;
            }
            this.p = true;
            if (this.k == null) {
                this.k = PreloadDelegate.p(this.h);
                StringBuilder sb = new StringBuilder("setupLayout hit preload engine:");
                if (this.k == null) {
                    z = false;
                }
                sb.append(z);
                sb.append(",url:");
                sb.append(this.h);
                tfs.f(sb.toString());
                if (this.k == null) {
                    o oVar = new o(akt.j2() ? this.b : null);
                    this.k = oVar;
                    oVar.v1(this.h);
                }
            }
            if (i > 0 || i2 > 0) {
                o(i, i2);
            } else {
                View view = this.l;
                if (view != null) {
                    view.getViewTreeObserver().addOnPreDrawListener(new a());
                }
            }
            igs.c();
        }
    }

    public o r() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("46d6a524", new Object[]{this});
        }
        if (this.k == null) {
            this.k = PreloadDelegate.p(this.h);
            StringBuilder sb = new StringBuilder("peekEngine engine:");
            if (this.k != null) {
                z = true;
            }
            sb.append(z);
            sb.append(",url:");
            sb.append(this.h);
            tfs.f(sb.toString());
        }
        return this.k;
    }

    public n54(Context context, o oVar, String str, JSONObject jSONObject, HashMap hashMap, g gVar) {
        JSONObject jSONObject2 = new JSONObject();
        this.f24518a = jSONObject2;
        this.m = false;
        this.p = false;
        this.c = jSONObject;
        this.k = oVar;
        this.b = context;
        this.g = gVar;
        this.h = str;
        jSONObject2.put("url", (Object) str);
        jSONObject2.put("query", (Object) hashMap);
    }

    public n54(Context context, View view, o oVar, String str, String str2, JSONObject jSONObject, HashMap hashMap, int i, g gVar) {
        JSONObject jSONObject2 = new JSONObject();
        this.f24518a = jSONObject2;
        this.m = false;
        this.p = false;
        str = str == null ? "" : str;
        this.c = jSONObject;
        s(jSONObject);
        this.l = view;
        this.k = oVar;
        this.b = context;
        this.g = gVar;
        this.h = str;
        this.e = str2;
        jSONObject2.put("url", (Object) str);
        jSONObject2.put("query", (Object) hashMap);
        if (i == 0) {
            jSONObject2.put(o.LAYOUT_STRATEGY_KEY, (Object) Boolean.TRUE);
        }
    }
}
