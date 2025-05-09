package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.unicorn.embedding.android.UnicornView;
import tb.e1o;
import tb.hdh;
import tb.hs9;
import tb.js9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornSurfaceView extends SurfaceView implements e1o {
    private static final String TAG = "FlutterSurfaceView";
    private hs9 flutterRenderer;
    private final js9 flutterUiDisplayListener;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private int mCurrentHeight;
    private int mCurrentWidth;
    private c mSurfaceStateListener;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;
    private Runnable swapSurfaceCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            hdh.e(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
            UnicornSurfaceView unicornSurfaceView = UnicornSurfaceView.this;
            if (unicornSurfaceView.isAttachedToFlutterRenderer) {
                unicornSurfaceView.changeSurfaceSize(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            hdh.e(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
            UnicornSurfaceView unicornSurfaceView = UnicornSurfaceView.this;
            unicornSurfaceView.isSurfaceAvailableForRendering = true;
            if (unicornSurfaceView.isAttachedToFlutterRenderer) {
                unicornSurfaceView.connectSurfaceToRenderer();
            }
            unicornSurfaceView.promoteSwapSurface();
            if (unicornSurfaceView.mSurfaceStateListener != null) {
                ((UnicornView.b) unicornSurfaceView.mSurfaceStateListener).a();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            hdh.e(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
            UnicornSurfaceView unicornSurfaceView = UnicornSurfaceView.this;
            unicornSurfaceView.isSurfaceAvailableForRendering = false;
            if (unicornSurfaceView.isAttachedToFlutterRenderer) {
                unicornSurfaceView.disconnectSurfaceFromRenderer();
            }
            if (unicornSurfaceView.mSurfaceStateListener != null) {
                ((UnicornView.b) unicornSurfaceView.mSurfaceStateListener).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface c {
    }

    static {
        t2o.a(945815651);
        t2o.a(945815718);
    }

    public UnicornSurfaceView(Context context) {
        this(context, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i2) {
        if (this.flutterRenderer == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        } else if (this.mCurrentWidth != i || this.mCurrentHeight != i2) {
            this.mCurrentWidth = i;
            this.mCurrentHeight = i2;
            hdh.e(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.flutterRenderer.w(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.mCurrentWidth = getHolder().getSurfaceFrame().width();
        this.mCurrentHeight = getHolder().getSurfaceFrame().height();
        this.flutterRenderer.t(getHolder().getSurface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        hs9 hs9Var = this.flutterRenderer;
        if (hs9Var != null) {
            hs9Var.v();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promoteSwapSurface() {
        Runnable runnable;
        if (!this.isAttachedToFlutterRenderer && (runnable = this.swapSurfaceCallback) != null) {
            post(runnable);
            this.swapSurfaceCallback = null;
        }
    }

    @Override // tb.e1o
    public void attachToRenderer(hs9 hs9Var) {
        hdh.e(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            hdh.e(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.v();
            this.flutterRenderer.o(this.flutterUiDisplayListener);
        }
        this.flutterRenderer = hs9Var;
        this.isAttachedToFlutterRenderer = true;
        hs9Var.f(this.flutterUiDisplayListener);
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
            setAlpha(0.0f);
            this.flutterRenderer.o(this.flutterUiDisplayListener);
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        hdh.f(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // android.view.SurfaceView
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // tb.e1o
    public hs9 getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public boolean getRenderTransparently() {
        return this.renderTransparently;
    }

    public boolean hasSurface() {
        return this.isSurfaceAvailableForRendering;
    }

    public void initForPromote(Runnable runnable) {
        this.swapSurfaceCallback = runnable;
    }

    @Override // tb.e1o
    public void invalid() {
        if (this.isAttachedToFlutterRenderer) {
            disconnectSurfaceFromRenderer();
            setAlpha(0.0f);
        }
    }

    @Override // tb.e1o
    public void pause() {
        hs9 hs9Var = this.flutterRenderer;
        if (hs9Var != null) {
            hs9Var.o(this.flutterUiDisplayListener);
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        hdh.f(TAG, "pause() invoked when no FlutterRenderer was attached.");
    }

    public void setSurfaceStateListener(c cVar) {
        this.mSurfaceStateListener = cVar;
    }

    public void swapSurface(hs9 hs9Var) {
        this.mCurrentWidth = getHolder().getSurfaceFrame().width();
        this.mCurrentHeight = getHolder().getSurfaceFrame().height();
        this.flutterRenderer = hs9Var;
        this.isAttachedToFlutterRenderer = true;
        hs9Var.f(this.flutterUiDisplayListener);
        this.flutterRenderer.y(getHolder().getSurface(), true);
    }

    @Override // tb.e1o
    public void valid() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(1.0f);
            connectSurfaceToRenderer();
        }
    }

    public UnicornSurfaceView(Context context, boolean z) {
        this(context, null, z);
    }

    public UnicornSurfaceView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.mCurrentWidth = 0;
        this.mCurrentHeight = 0;
        this.surfaceCallback = new a();
        this.flutterUiDisplayListener = new b();
        this.renderTransparently = z;
        init();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements js9 {
        public b() {
        }

        @Override // tb.js9
        public void b() {
            hdh.e(UnicornSurfaceView.TAG, "onFlutterUiDisplayed()");
            UnicornSurfaceView unicornSurfaceView = UnicornSurfaceView.this;
            unicornSurfaceView.setAlpha(1.0f);
            if (unicornSurfaceView.flutterRenderer != null) {
                unicornSurfaceView.flutterRenderer.o(this);
            }
        }

        @Override // tb.js9
        public void a() {
        }
    }

    public static void preloadClass() {
    }
}
