package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.unicorn.embedding.engine.FlutterJNI;
import tb.e1o;
import tb.hdh;
import tb.hs9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornTextureView extends TextureView implements e1o {
    private static final String TAG = "FlutterTextureView";
    private hs9 flutterRenderer;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private final FlutterJNI.c mUpdateListener;
    private Surface renderSurface;
    private boolean renderTransparently;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements FlutterJNI.c {
        public b() {
        }

        public void a() {
            UnicornTextureView unicornTextureView = UnicornTextureView.this;
            if (unicornTextureView.isAttachedToFlutterRenderer) {
                boolean isOpaque = unicornTextureView.isOpaque();
                unicornTextureView.setOpaque(!isOpaque);
                unicornTextureView.setOpaque(isOpaque);
            }
        }
    }

    static {
        t2o.a(945815655);
        t2o.a(945815718);
    }

    public UnicornTextureView(Context context) {
        this(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i2) {
        if (this.flutterRenderer != null) {
            hdh.e(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.flutterRenderer.w(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = new Surface(getSurfaceTexture());
        this.renderSurface = surface;
        this.flutterRenderer.u(surface, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        hs9 hs9Var = this.flutterRenderer;
        if (hs9Var != null) {
            hs9Var.v();
            Surface surface = this.renderSurface;
            if (surface != null) {
                surface.release();
                this.renderSurface = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
        if (this.renderTransparently) {
            setOpaque(false);
        }
    }

    @Override // tb.e1o
    public void attachToRenderer(hs9 hs9Var) {
        hdh.e(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            hdh.e(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.v();
        }
        this.flutterRenderer = hs9Var;
        hs9Var.q(this.mUpdateListener);
        this.isAttachedToFlutterRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            hdh.e(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
    }

    @Override // tb.e1o
    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (getWindowToken() != null) {
                hdh.e(TAG, "Disconnecting FlutterRenderer from Android surface.");
                disconnectSurfaceFromRenderer();
            }
            this.flutterRenderer.q(null);
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        hdh.f(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // tb.e1o
    public hs9 getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @Override // tb.e1o
    public void invalid() {
        if (this.isAttachedToFlutterRenderer) {
            disconnectSurfaceFromRenderer();
        }
    }

    @Override // tb.e1o
    public void pause() {
        if (this.flutterRenderer != null) {
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        hdh.f(TAG, "pause() invoked when no FlutterRenderer was attached.");
    }

    @Override // tb.e1o
    public void valid() {
        if (this.isAttachedToFlutterRenderer) {
            connectSurfaceToRenderer();
        }
    }

    public UnicornTextureView(Context context, boolean z) {
        super(context);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.surfaceTextureListener = new a();
        this.mUpdateListener = new b();
        this.renderTransparently = z;
        init();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            hdh.e(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureAvailable()");
            UnicornTextureView unicornTextureView = UnicornTextureView.this;
            unicornTextureView.isSurfaceAvailableForRendering = true;
            if (unicornTextureView.isAttachedToFlutterRenderer) {
                unicornTextureView.connectSurfaceToRenderer();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            hdh.e(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            UnicornTextureView unicornTextureView = UnicornTextureView.this;
            unicornTextureView.isSurfaceAvailableForRendering = false;
            if (!unicornTextureView.isAttachedToFlutterRenderer) {
                return true;
            }
            unicornTextureView.disconnectSurfaceFromRenderer();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            hdh.e(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            UnicornTextureView unicornTextureView = UnicornTextureView.this;
            if (unicornTextureView.isAttachedToFlutterRenderer) {
                unicornTextureView.changeSurfaceSize(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
