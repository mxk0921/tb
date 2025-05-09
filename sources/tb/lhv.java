package tb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.taobao.android.weex_framework.common.SurfaceTextureWrapper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class lhv implements e1o {

    /* renamed from: a  reason: collision with root package name */
    public hs9 f23347a;
    public SurfaceTextureWrapper b;
    public SurfaceTexture c;
    public Surface d;
    public final int e;
    public final int f;
    public boolean g;
    public boolean h;
    public final SurfaceTexture.OnFrameAvailableListener i;
    public final Runnable j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        public a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            lhv lhvVar = lhv.this;
            if (!lhvVar.h) {
                lhvVar.getClass();
            }
        }
    }

    static {
        t2o.a(945815648);
        t2o.a(945815718);
    }

    public lhv(Context context, int i, int i2) {
        this.g = false;
        this.h = false;
        this.i = new a();
        this.j = new b();
        this.e = i;
        this.f = i2;
    }

    @Override // tb.e1o
    public void attachToRenderer(hs9 hs9Var) {
        this.f23347a = hs9Var;
        this.g = true;
        if (this.c == null) {
            c();
        }
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(f());
        this.d = surface2;
        this.f23347a.t(surface2);
    }

    public final void c() {
        int i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        surfaceTexture.setOnFrameAvailableListener(this.i, new Handler());
        int i2 = this.e;
        if (i2 > 0 && (i = this.f) > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i);
        }
        this.c = surfaceTexture;
        this.b = new SurfaceTextureWrapper(surfaceTexture, this.j);
    }

    public void d() {
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
            this.d = null;
        }
    }

    @Override // tb.e1o
    public void detachFromRenderer() {
        if (this.g) {
            hs9 hs9Var = this.f23347a;
            if (hs9Var != null) {
                hs9Var.v();
                this.f23347a = null;
            }
            d();
            this.g = false;
        }
    }

    public void e() {
        if (!this.h) {
            SurfaceTextureWrapper surfaceTextureWrapper = this.b;
            if (surfaceTextureWrapper != null) {
                surfaceTextureWrapper.release();
                this.b = null;
                this.c = null;
            }
            this.h = true;
        }
    }

    public SurfaceTexture f() {
        return this.b.surfaceTexture();
    }

    @Override // tb.e1o
    public hs9 getAttachedRenderer() {
        return this.f23347a;
    }

    public lhv(Context context) {
        this(context, 1, 1);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Override // tb.e1o
    public void invalid() {
    }

    @Override // tb.e1o
    public void pause() {
    }

    @Override // tb.e1o
    public void valid() {
    }
}
