package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexInstanceImpl;
import io.unicorn.adapter.muise.UnicornMuiseJNI;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.android.UnicornSurfaceView;
import io.unicorn.embedding.android.UnicornTextureView;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.xid;
import tb.zr9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dhv implements zr9.e, xid {
    public WeexInstanceImpl c;
    public final Context d;
    public zr9 e;
    public long h;

    /* renamed from: a  reason: collision with root package name */
    public final Set<hde> f17827a = new HashSet();
    public boolean b = false;
    public Bundle f = new Bundle();
    public qbq g = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f17828a;
        public boolean b;
        public RenderMode c;
        public TransparencyMode d;
        public final boolean e;
        public qbq f;

        static {
            t2o.a(945815642);
        }

        public /* synthetic */ a(String str, chv chvVar) {
            this(str);
        }

        public dhv a(Context context) {
            dhv dhvVar = new dhv(context);
            dhvVar.S(b());
            dhvVar.U(this.f);
            return dhvVar;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.f17828a);
            bundle.putBoolean("destroy_engine_with_fragment", this.b);
            RenderMode renderMode = this.c;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode.name());
            TransparencyMode transparencyMode = this.d;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.e);
            return bundle;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a e(RenderMode renderMode) {
            this.c = renderMode;
            return this;
        }

        public a f(qbq qbqVar) {
            this.f = qbqVar;
            return this;
        }

        public a g(TransparencyMode transparencyMode) {
            this.d = transparencyMode;
            return this;
        }

        public a(String str) {
            this.b = false;
            this.c = RenderMode.surface;
            this.d = TransparencyMode.opaque;
            this.e = true;
            this.f = null;
            this.f17828a = str;
        }

        public static void d() {
        }
    }

    static {
        t2o.a(945815640);
        t2o.a(945815628);
        t2o.a(945815633);
        t2o.a(982516226);
    }

    public dhv(Context context) {
        this.d = context;
    }

    public static void R() {
        a.d();
    }

    public static a X(String str) {
        return new a(str, null);
    }

    @Override // tb.xid
    public String A() {
        zr9 zr9Var = this.e;
        if (zr9Var == null || zr9Var.h() == null) {
            return "";
        }
        return this.e.h().r().getScreenshotPixelCheckInfo();
    }

    @Override // tb.xid
    public void B(Context context, WeexInstanceImpl weexInstanceImpl) {
        this.c = weexInstanceImpl;
        zr9 zr9Var = new zr9(this);
        this.e = zr9Var;
        zr9Var.l(context);
    }

    @Override // tb.xid
    public void C() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.E();
        }
    }

    @Override // tb.xid
    public void D() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().r().cleanOrRestoreImages(false);
        }
    }

    @Override // tb.rbq
    public qbq E() {
        Activity G = G();
        if (G instanceof rbq) {
            return ((rbq) G).E();
        }
        qbq qbqVar = this.g;
        if (qbqVar != null) {
            return qbqVar;
        }
        return null;
    }

    @Override // tb.xid
    public HashMap<String, String> F(int i) {
        synchronized (this) {
            try {
                long j = this.h;
                if (j == 0) {
                    return null;
                }
                return UnicornMuiseJNI.getUnicornMuiseFirstScreenInfo(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity G() {
        Context context = this.d;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public Bundle H() {
        return this.f;
    }

    public String I() {
        return H().getString("cached_engine_id", null);
    }

    public Context J() {
        return this.d;
    }

    public is9 K() {
        if (this.f.containsKey("initialization_args")) {
            String[] stringArray = this.f.getStringArray("initialization_args");
            if (stringArray != null) {
                return new is9(stringArray);
            }
        } else {
            Context context = this.d;
            if ((context instanceof Activity) && ((Activity) context).getIntent() != null) {
                return is9.a(((Activity) context).getIntent());
            }
        }
        return new is9(new String[0]);
    }

    public RenderMode L() {
        return RenderMode.valueOf(H().getString("flutterview_render_mode", RenderMode.surface.name()));
    }

    public TransparencyMode M() {
        return TransparencyMode.valueOf(H().getString("flutterview_transparency_mode", TransparencyMode.opaque.name()));
    }

    public void P() {
        Activity G = G();
        if (G instanceof js9) {
            ((js9) G).b();
        }
        Iterator it = ((HashSet) this.f17827a).iterator();
        while (it.hasNext()) {
            ((hde) it.next()).b();
        }
    }

    public void Q() {
        Activity G = G();
        if (G instanceof js9) {
            ((js9) G).a();
        }
        Iterator it = ((HashSet) this.f17827a).iterator();
        while (it.hasNext()) {
            ((hde) it.next()).a();
        }
    }

    public void S(Bundle bundle) {
        this.f = bundle;
    }

    public void T(long j) {
        this.h = j;
    }

    public void U(qbq qbqVar) {
        this.g = qbqVar;
    }

    public boolean V() {
        return H().getBoolean("should_attach_engine_to_activity");
    }

    public boolean W() {
        boolean z = H().getBoolean("destroy_engine_with_fragment", false);
        if (I() != null || this.e.j()) {
            return z;
        }
        return H().getBoolean("destroy_engine_with_fragment", true);
    }

    @Override // tb.xid
    public void a() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.B();
        }
    }

    @Override // tb.xid
    public void b(int i, int i2) {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.q(i, i2);
        }
    }

    @Override // tb.xid
    public void c(hde hdeVar) {
        ((HashSet) this.f17827a).add(hdeVar);
    }

    @Override // tb.xid
    public void d() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().q().l();
        }
    }

    @Override // tb.xid
    public void dispatchExternalEvent(l5x l5xVar) throws WeexExternalEventCheckException {
        WeexExternalEventType a2 = l5xVar.a();
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            if (a2 == WeexExternalEventType.START) {
                boolean z = this.b;
                if (!z) {
                    this.b = true;
                } else {
                    throw WeexExternalEventCheckException.fromState(z, a2);
                }
            } else if (a2 == WeexExternalEventType.UPDATE) {
                boolean z2 = this.b;
                if (!z2) {
                    throw WeexExternalEventCheckException.fromState(z2, a2);
                }
            } else if (a2 == WeexExternalEventType.END || a2 == WeexExternalEventType.CANCEL) {
                boolean z3 = this.b;
                if (z3) {
                    this.b = false;
                } else {
                    throw WeexExternalEventCheckException.fromState(z3, a2);
                }
            }
            this.e.h().q().e(l5xVar);
        }
    }

    @Override // tb.xid
    public void e() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().q().h();
        }
    }

    @Override // tb.xid
    public void f() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.e();
        }
    }

    @Override // tb.xid
    public HashMap<String, String> g(int i) {
        synchronized (this) {
            try {
                long j = this.h;
                if (j == 0) {
                    return null;
                }
                return UnicornMuiseJNI.getPerformanceInfo(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.xid
    public void h(float f, float f2) {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.C(f, f2);
        }
    }

    @Override // tb.xid
    public void i() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().r().cleanOrRestoreImages(true);
        }
    }

    @Override // tb.xid
    public int j() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            return zr9Var.g();
        }
        return -1;
    }

    @Override // tb.cs9
    public void k(io.unicorn.embedding.engine.a aVar) {
        Activity G = G();
        if (G instanceof cs9) {
            ((cs9) G).k(aVar);
        }
    }

    @Override // tb.xid
    public void l() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().r().cleanOrRestoreImages(true);
            this.e.h().r().clearEngineCache();
        }
    }

    @Override // tb.xid
    public void m(String str, Object obj) {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().q().f(str, obj);
        }
    }

    @Override // tb.cs9
    public void n(io.unicorn.embedding.engine.a aVar) {
        Activity G = G();
        if (G instanceof cs9) {
            ((cs9) G).n(aVar);
        }
    }

    @Override // tb.xid
    public void o(xid.b bVar) {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().q().j(bVar);
        }
    }

    @Override // tb.xid
    public View onCreateView() {
        Integer num;
        if (this.c.getInstanceConfig().f() != null) {
            num = this.c.getInstanceConfig().f().a();
        } else {
            num = null;
        }
        return this.e.m(null, null, null, num);
    }

    @Override // tb.xid
    public void onDestroyView() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.n();
        }
    }

    @Override // tb.xid
    public void onDetach() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.o();
            this.e.y();
            this.e = null;
        }
        synchronized (this) {
            try {
                long j = this.h;
                if (j != 0) {
                    UnicornMuiseJNI.destroyRenderEngine(j);
                    this.h = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.xid
    public void onPause() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.p();
        }
    }

    @Override // tb.xid
    public void onResume() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.r();
        }
    }

    @Override // tb.xid
    public void onStart() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.s();
        }
    }

    @Override // tb.xid
    public void onStop() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.t();
        }
    }

    @Override // tb.xid
    public void onViewAppear() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.w();
        }
    }

    @Override // tb.xid
    public void onViewDisappear() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.v();
        }
    }

    @Override // tb.xid
    public int p() {
        zr9 zr9Var = this.e;
        if (zr9Var == null || zr9Var.h() == null) {
            return 0;
        }
        return this.e.h().r().getAverageFPS();
    }

    @Override // tb.xid
    public Map<String, String> q(int i) {
        zr9 zr9Var = this.e;
        if (zr9Var == null || zr9Var.h() == null) {
            return new HashMap();
        }
        return ((WeexPlatformView) this.e.h().t().B(i)).checkWhiteScreenInfo();
    }

    @Override // tb.xid
    public void r(HashMap<String, String> hashMap) {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().r().regsiterFonts(hashMap);
        }
    }

    @Override // tb.xid
    public void s() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.i();
        }
    }

    @Override // tb.xid
    public void t(ide ideVar) {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.z(ideVar);
        }
    }

    @Override // tb.xid
    public void u() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.k(null);
        }
    }

    @Override // tb.xid
    public void updateViewport() {
        zr9 zr9Var = this.e;
        if (zr9Var != null) {
            zr9Var.D();
        }
    }

    @Override // tb.xid
    public void v() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().r().cleanOrRestoreImages(false);
        }
    }

    @Override // tb.xid
    public void w(boolean z, w6a w6aVar, xid.a aVar) {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null) {
            this.e.h().q().i(z, w6aVar, aVar);
        }
    }

    @Override // tb.xid
    public void x() {
        zr9 zr9Var = this.e;
        if (zr9Var != null && zr9Var.h() != null && RenderMode.image != L()) {
            this.e.h().r().invalidGlContext();
        }
    }

    @Override // tb.xid
    public void y(hde hdeVar) {
        ((HashSet) this.f17827a).remove(hdeVar);
    }

    @Override // tb.ds9
    public io.unicorn.embedding.engine.a z(Context context) {
        Activity G = G();
        if (!(G instanceof ds9)) {
            return null;
        }
        hdh.e("UnicornComponent", "Deferring to attached Activity to provide a FlutterEngine.");
        return ((ds9) G).z(J());
    }

    public void N(UnicornSurfaceView unicornSurfaceView) {
    }

    public void O(UnicornTextureView unicornTextureView) {
    }
}
