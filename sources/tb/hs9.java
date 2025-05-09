package tb;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.embedding.engine.renderer.SurfaceTextureWrapper;
import io.unicorn.plugin.platform.PlatformViewWrapper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import tb.lnt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hs9 implements lnt {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f20854a;
    public Surface c;
    public final js9 f;
    public final AtomicLong b = new AtomicLong(0);
    public boolean d = false;
    public final Handler e = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f20856a;
        private final FlutterJNI b;

        static {
            t2o.a(945815712);
        }

        public b(long j, FlutterJNI flutterJNI) {
            this.f20856a = j;
            this.b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.isAttached()) {
                hdh.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f20856a + ").");
                this.b.unregisterTexture(this.f20856a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class c implements lnt.b {

        /* renamed from: a  reason: collision with root package name */
        public final long f20857a;
        public final SurfaceTextureWrapper b;
        public boolean c;
        public lnt.a d;
        public final Runnable e;
        public final SurfaceTexture.OnFrameAvailableListener f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.d != null) {
                    ((PlatformViewWrapper.a) c.this.d).a();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class b implements SurfaceTexture.OnFrameAvailableListener {
            public b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                c cVar = c.this;
                if (!cVar.c) {
                    hs9 hs9Var = hs9.this;
                    if (hs9Var.f20854a.isAttached()) {
                        hs9Var.l(cVar.f20857a);
                    }
                }
            }
        }

        static {
            t2o.a(945815713);
            t2o.a(945815870);
        }

        public c(long j, SurfaceTexture surfaceTexture) {
            a aVar = new a();
            b bVar = new b();
            this.f20857a = j;
            this.b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            a().setOnFrameAvailableListener(bVar, new Handler());
        }

        @Override // tb.lnt.b
        public SurfaceTexture a() {
            return this.b.surfaceTexture();
        }

        @Override // tb.lnt.b
        public void b(lnt.a aVar) {
            this.d = aVar;
        }

        public long f() {
            return this.f20857a;
        }

        public void finalize() throws Throwable {
            hs9 hs9Var = hs9.this;
            try {
                if (!this.c) {
                    hs9Var.e.post(new b(this.f20857a, hs9Var.f20854a));
                }
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper g() {
            return this.b;
        }

        @Override // tb.lnt.b
        public void release() {
            if (!this.c) {
                StringBuilder sb = new StringBuilder("Releasing a SurfaceTexture (");
                long j = this.f20857a;
                sb.append(j);
                sb.append(").");
                hdh.e("FlutterRenderer", sb.toString());
                this.b.release();
                hs9.this.z(j);
                this.c = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public float f20860a = 1.0f;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;
        public int q = 0;

        static {
            t2o.a(945815716);
        }
    }

    static {
        t2o.a(945815710);
        t2o.a(945815868);
    }

    public hs9(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f = aVar;
        this.f20854a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public static void m() {
        a.c();
    }

    public void f(js9 js9Var) {
        this.f20854a.addIsDisplayingFlutterUiListener(js9Var);
        if (this.d) {
            js9Var.b();
        }
    }

    public lnt.b g() {
        hdh.e("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        c cVar = new c(this.b.getAndIncrement(), surfaceTexture);
        hdh.e("FlutterRenderer", "New SurfaceTexture ID: " + cVar.f());
        n(cVar.f(), cVar.g());
        return cVar;
    }

    public void h() {
        this.f20854a.destroyImageByteBuffer();
    }

    public void i(ByteBuffer byteBuffer, int i) {
        this.f20854a.dispatchPointerDataPacket(byteBuffer, i);
    }

    public ByteBuffer j() {
        return this.f20854a.getImageByteBuffer();
    }

    public boolean k() {
        return this.d;
    }

    public final void l(long j) {
        this.f20854a.markTextureFrameAvailable(j);
    }

    public final void n(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f20854a.registerTexture(j, surfaceTextureWrapper);
    }

    public void o(js9 js9Var) {
        this.f20854a.removeIsDisplayingFlutterUiListener(js9Var);
    }

    public void p() {
        this.d = false;
    }

    public void q(FlutterJNI.c cVar) {
        this.f20854a.setOnFrameAvailableListener(cVar);
    }

    public void r(boolean z) {
        this.f20854a.setSemanticsEnabled(z);
    }

    public void s(d dVar) {
        hdh.e("FlutterRenderer", "Setting viewport metrics\nSize: " + dVar.b + " x " + dVar.c + "\nScreen:" + dVar.p + " x " + dVar.q + "\nPadding - L: " + dVar.g + ", T: " + dVar.d + ", R: " + dVar.e + ", B: " + dVar.f + "\nInsets - L: " + dVar.k + ", T: " + dVar.h + ", R: " + dVar.i + ", B: " + dVar.j + "\nSystem Gesture Insets - L: " + dVar.o + ", T: " + dVar.l + ", R: " + dVar.m + ", B: " + dVar.j);
        this.f20854a.setViewportMetrics(dVar.f20860a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i, dVar.j, dVar.k, dVar.l, dVar.m, dVar.n, dVar.o, dVar.p, dVar.q);
    }

    public void t(Surface surface) {
        u(surface, false);
    }

    public void u(Surface surface, boolean z) {
        if (this.c != null) {
            v();
        }
        this.c = surface;
        this.f20854a.onSurfaceCreated(surface, z);
    }

    public void v() {
        if (this.c != null) {
            this.f20854a.onSurfaceDestroyed();
            this.c = null;
            if (this.d) {
                ((a) this.f).a();
            }
            this.d = false;
        }
    }

    public void w(int i, int i2) {
        if (this.c != null) {
            this.f20854a.onSurfaceChanged(i, i2);
        }
    }

    public void x(Surface surface) {
        y(surface, false);
    }

    public void y(Surface surface, boolean z) {
        this.c = surface;
        this.f20854a.onSurfaceWindowChanged(surface, z);
    }

    public final void z(long j) {
        this.f20854a.unregisterTexture(j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final hs9 f20855a;

        static {
            t2o.a(945815711);
            t2o.a(945815717);
        }

        public a(hs9 hs9Var) {
            this.f20855a = hs9Var;
        }

        @Override // tb.js9
        public void a() {
            this.f20855a.d = false;
        }

        @Override // tb.js9
        public void b() {
            this.f20855a.d = true;
        }

        public static void c() {
        }
    }
}
