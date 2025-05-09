package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.android.UnicornImageView;
import io.unicorn.embedding.android.UnicornSurfaceView;
import io.unicorn.embedding.android.UnicornTextureView;
import io.unicorn.embedding.android.UnicornView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zr9 {

    /* renamed from: a  reason: collision with root package name */
    public e f32967a;
    public io.unicorn.embedding.engine.a b;
    public UnicornView c;
    public boolean d;
    public int[] f;
    public Context h;
    public lhv i;
    public boolean e = false;
    public final js9 j = new d(this);
    public final ComponentCallbacks2 k = new c(this);
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface e extends rbq, ds9, cs9 {
    }

    static {
        t2o.a(945815622);
    }

    public zr9(e eVar) {
        this.f32967a = eVar;
    }

    public static void x() {
        d.c();
        c.a();
    }

    public void A() {
        hdh.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String I = ((dhv) this.f32967a).I();
        if (I != null) {
            io.unicorn.embedding.engine.a a2 = bs9.b().a(I);
            this.b = a2;
            this.d = true;
            if (a2 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + I + "'");
            }
            return;
        }
        dhv dhvVar = (dhv) this.f32967a;
        io.unicorn.embedding.engine.a z = dhvVar.z(dhvVar.J());
        this.b = z;
        if (z != null) {
            this.d = true;
            return;
        }
        hdh.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.b = new io.unicorn.embedding.engine.a(((dhv) this.f32967a).J(), ((dhv) this.f32967a).K().b());
        this.d = false;
    }

    public void B() {
        this.b.q().k();
        f();
        this.b.s().c();
        this.c.showRecoverSurface();
    }

    public void C(float f, float f2) {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.updateScreenSize(f, f2);
        }
    }

    public void D() {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.updateViewport();
        }
    }

    public void E() {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.validRenderSurface();
        }
    }

    public void e() {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.convertToSurfaceView();
        }
    }

    public final void f() {
        if (this.f32967a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public int g() {
        UnicornView unicornView = this.c;
        int[] iArr = this.f;
        unicornView.convertToOnScreenSurface(iArr[0], iArr[1]);
        return this.c.promoteRenderSurface();
    }

    public io.unicorn.embedding.engine.a h() {
        return this.b;
    }

    public void i() {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.invalidRenderSurface();
        }
    }

    public boolean j() {
        return this.d;
    }

    public void k(Bundle bundle) {
        hdh.e("FlutterActivityAndFragmentDelegate", "onActivityCreated. Giving framework and plugins an opportunity to restore state.");
        f();
    }

    public void l(Context context) {
        f();
        this.h = context;
        context.registerComponentCallbacks(this.k);
        if (this.b == null) {
            A();
        }
        if (((dhv) this.f32967a).V()) {
            hdh.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this Fragment.");
            this.b.j(context);
        }
        ((dhv) this.f32967a).k(this.b);
    }

    public View m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Integer num) {
        boolean z;
        boolean z2;
        boolean z3;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        hdh.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        u8x.a("onCreateView");
        u8x.a("onCreateView/newView");
        f();
        if (((dhv) this.f32967a).L() == RenderMode.surface) {
            Context J = ((dhv) this.f32967a).J();
            TransparencyMode M = ((dhv) this.f32967a).M();
            TransparencyMode transparencyMode = TransparencyMode.transparent;
            if (M == transparencyMode) {
                z3 = true;
            } else {
                z3 = false;
            }
            UnicornSurfaceView unicornSurfaceView = new UnicornSurfaceView(J, null, z3);
            ((dhv) this.f32967a).N(unicornSurfaceView);
            this.c = new UnicornView(((dhv) this.f32967a).J(), unicornSurfaceView);
            if (((dhv) this.f32967a).M() != transparencyMode && z) {
                unicornSurfaceView.getHolder().setFormat(-2);
                unicornSurfaceView.setZOrderMediaOverlay(true);
                unicornSurfaceView.setAlpha(0.0f);
                SurfaceView surfaceView = new SurfaceView(((dhv) this.f32967a).J());
                surfaceView.getHolder().addCallback(new a(this, num));
                this.c.addOnFirstFrameRenderedListener(new b(surfaceView, unicornSurfaceView));
                this.c.addView(surfaceView, 0, new FrameLayout.LayoutParams(-1, -1));
            }
        } else if (((dhv) this.f32967a).L() == RenderMode.texture) {
            Context J2 = ((dhv) this.f32967a).J();
            if (((dhv) this.f32967a).M() == TransparencyMode.transparent) {
                z2 = true;
            } else {
                z2 = false;
            }
            UnicornTextureView unicornTextureView = new UnicornTextureView(J2, z2);
            ((dhv) this.f32967a).O(unicornTextureView);
            this.c = new UnicornView(((dhv) this.f32967a).J(), unicornTextureView);
        } else if (((dhv) this.f32967a).L() == RenderMode.image) {
            this.c = new UnicornView(((dhv) this.f32967a).J(), new UnicornImageView(((dhv) this.f32967a).J()));
        } else if (((dhv) this.f32967a).L() == RenderMode.offscreen) {
            this.i = new lhv(((dhv) this.f32967a).J());
            this.c = new UnicornView(((dhv) this.f32967a).J(), this.i);
        }
        this.c.addOnFirstFrameRenderedListener(this.j);
        u8x.b("onCreateView/newView");
        this.c.setSplashView(((dhv) this.f32967a).E());
        hdh.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.c.attachToFlutterEngine(this.b);
        if (this.e) {
            UnicornView unicornView = this.c;
            int[] iArr = this.f;
            unicornView.setViewportMetrics(iArr[0], iArr[1]);
        }
        u8x.b("onCreateView");
        return this.c;
    }

    public void n() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        f();
        this.c.detachFromFlutterEngine();
        this.c.removeOnFirstFrameRenderedListener(this.j);
        this.b.t().J();
    }

    public void o() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        f();
        ((dhv) this.f32967a).n(this.b);
        if (((dhv) this.f32967a).V()) {
            hdh.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
        }
        this.b.s().a();
        if (((dhv) this.f32967a).W()) {
            boolean z = true;
            if (w4x.e() && this.b.x() && this.b.m()) {
                z = true ^ bs9.b().e(this.b);
            }
            if (z) {
                this.b.n();
            }
            if (((dhv) this.f32967a).I() != null) {
                bs9.b().f(((dhv) this.f32967a).I());
            }
            this.b = null;
        }
        this.h.unregisterComponentCallbacks(this.k);
        this.h = null;
    }

    public void p() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onPause()");
        f();
        this.b.s().b();
        this.b.t().L();
    }

    public void q(int i, int i2) {
        StringBuilder sb = new StringBuilder("onPreRendering [");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        if (i <= 0 || i2 <= 0) {
            hdh.f("FlutterActivityAndFragmentDelegate", "Illegal width or height of viewport");
            return;
        }
        f();
        this.f = r0;
        int[] iArr = {i, i2};
        this.e = true;
    }

    public void r() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onResume()");
        f();
        this.b.s().d();
        this.b.t().M();
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.onResume();
        }
    }

    public void s() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onStart()");
        f();
        this.b.t().N();
    }

    public void t() {
        hdh.e("FlutterActivityAndFragmentDelegate", "onStop()");
        f();
        this.b.s().c();
        this.b.t().O();
    }

    public void u(int i) {
        f();
        io.unicorn.embedding.engine.a aVar = this.b;
        if (aVar == null) {
            hdh.f("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
        } else if (this.g && i >= 10) {
            aVar.v().e();
        }
    }

    public void v() {
        this.b.s().c();
    }

    public void w() {
        this.b.s().d();
    }

    public void y() {
        this.f32967a = null;
        this.b = null;
        this.c = null;
    }

    public void z(ide ideVar) {
        UnicornView unicornView = this.c;
        if (unicornView != null) {
            unicornView.setWeexUnicornListener(ideVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SurfaceView f32969a;
        public final /* synthetic */ UnicornSurfaceView b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ js9 f32970a;

            public a(js9 js9Var) {
                this.f32970a = js9Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                zr9.this.c.removeOnFirstFrameRenderedListener(this.f32970a);
            }
        }

        public b(SurfaceView surfaceView, UnicornSurfaceView unicornSurfaceView) {
            this.f32969a = surfaceView;
            this.b = unicornSurfaceView;
        }

        @Override // tb.js9
        public void b() {
            SurfaceView surfaceView = this.f32969a;
            ViewParent parent = surfaceView.getParent();
            zr9 zr9Var = zr9.this;
            if (parent == zr9Var.c) {
                zr9Var.c.removeView(surfaceView);
            }
            this.b.setZOrderOnTop(false);
            zr9Var.c.post(new a(this));
        }

        @Override // tb.js9
        public void a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        public final zr9 f32971a;

        static {
            t2o.a(945815626);
        }

        public c(zr9 zr9Var) {
            this.f32971a = zr9Var;
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            zr9 zr9Var = this.f32971a;
            if (zr9Var.b != null && Build.VERSION.SDK_INT >= 29 && i == 80) {
                zr9Var.b.t().H();
            }
            zr9Var.u(i);
        }

        public static void a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final zr9 f32972a;

        static {
            t2o.a(945815627);
            t2o.a(945815717);
        }

        public d(zr9 zr9Var) {
            this.f32972a = zr9Var;
        }

        @Override // tb.js9
        public void a() {
            ((dhv) this.f32972a.f32967a).Q();
        }

        @Override // tb.js9
        public void b() {
            zr9 zr9Var = this.f32972a;
            ((dhv) zr9Var.f32967a).P();
            zr9Var.g = true;
        }

        public static void c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements SurfaceHolder.Callback2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Integer f32968a;

        public a(zr9 zr9Var, Integer num) {
            this.f32968a = num;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            lockCanvas.drawColor(this.f32968a.intValue());
            surfaceHolder.unlockCanvasAndPost(lockCanvas);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback2
        public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }
    }
}
