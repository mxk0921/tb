package io.unicorn.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.concurrent.atomic.AtomicLong;
import tb.dwh;
import tb.hdh;
import tb.lnt;
import tb.t2o;
import tb.t5m;
import tb.wgw;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PlatformViewWrapper extends FrameLayout {
    private static final int HAS_NEW_FRAME = 1;
    private static final String TAG = "PlatformViewWrapper";
    ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int bufferHeight;
    private int bufferWidth;
    private boolean invalid;
    private int left;
    private final lnt.a listener;
    private boolean mCanAutoSwitch;
    private boolean mHasNotifySwitchToTexture;
    private boolean mIsDrawToTexture;
    private boolean mIsPendingToTexture;
    private t5m mPlatformViewsChannel;
    private int mTextDrawCount;
    private int mViewId;
    private FlutterMutatorsStack mutatorsStack;
    private final AtomicLong pendingFramesCount;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private Surface surface;
    private lnt.b textureEntry;
    private int top;
    private AndroidTouchProcessor touchProcessor;
    private SurfaceTexture tx;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements lnt.a {
        public a() {
        }

        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                PlatformViewWrapper.this.pendingFramesCount.decrementAndGet();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformViewWrapper.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f15209a;

        public c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f15209a = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
            this.f15209a.onFocusChange(platformViewWrapper, wgw.b(platformViewWrapper));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f15210a;

        static {
            t2o.a(945815812);
        }

        public d(Matrix matrix) {
            this.f15210a = matrix;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            transformation.getMatrix().set(this.f15210a);
        }
    }

    static {
        t2o.a(945815808);
    }

    public PlatformViewWrapper(Context context) {
        super(context);
        this.invalid = false;
        this.mCanAutoSwitch = false;
        this.mIsDrawToTexture = true;
        this.mHasNotifySwitchToTexture = false;
        this.mIsPendingToTexture = false;
        this.pendingFramesCount = new AtomicLong(0L);
        this.listener = new a();
        this.screenDensity = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.mutatorsStack.getFinalMatrix());
        float f = this.screenDensity;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.left, -this.top);
        return matrix;
    }

    private void notifyEngineSwitchToTextureLayer() {
        if (!this.mHasNotifySwitchToTexture) {
            this.mPlatformViewsChannel.a(this.mViewId, "PunchingToTexture", null);
            this.mHasNotifySwitchToTexture = true;
        }
    }

    private void onFrameProduced() {
        if (Build.VERSION.SDK_INT == 29) {
            this.pendingFramesCount.incrementAndGet();
        }
    }

    private boolean shouldDrawToSurfaceNow() {
        if (Build.VERSION.SDK_INT != 29 || this.pendingFramesCount.get() <= 0) {
            return true;
        }
        return false;
    }

    public Surface createSurface(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.mIsDrawToTexture) {
            drawTexture(canvas);
        } else if (this.mIsPendingToTexture) {
            if (drawTexture(canvas)) {
                super.draw(canvas);
            }
            notifyEngineSwitchToTextureLayer();
            invalidate();
        } else {
            super.draw(canvas);
        }
    }

    public boolean drawTexture(Canvas canvas) {
        boolean isReleased;
        Canvas canvas2;
        SurfaceTexture surfaceTexture;
        boolean isReleased2;
        if (!canvas.isHardwareAccelerated()) {
            super.draw(canvas);
            return false;
        }
        if (this.invalid && this.surface == null && (surfaceTexture = this.tx) != null) {
            isReleased2 = surfaceTexture.isReleased();
            if (!isReleased2) {
                this.surface = createSurface(this.tx);
                this.invalid = false;
            }
        }
        Surface surface = this.surface;
        if (surface == null || !surface.isValid()) {
            super.draw(canvas);
            hdh.b(TAG, "Invalid surface. The platform view cannot be displayed.");
            return false;
        }
        SurfaceTexture surfaceTexture2 = this.tx;
        if (surfaceTexture2 != null) {
            isReleased = surfaceTexture2.isReleased();
            if (!isReleased) {
                if (!shouldDrawToSurfaceNow()) {
                    invalidate();
                    return true;
                }
                try {
                    canvas2 = this.surface.lockHardwareCanvas();
                } catch (IllegalStateException e) {
                    dwh.g(TAG, "illegal surface", e);
                    this.surface.release();
                    Surface createSurface = createSurface(this.tx);
                    this.surface = createSurface;
                    if (createSurface == null || !createSurface.isValid()) {
                        return false;
                    }
                    canvas2 = this.surface.lockHardwareCanvas();
                }
                try {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(canvas2);
                    onFrameProduced();
                    return true;
                } finally {
                    this.surface.unlockCanvasAndPost(canvas2);
                }
            }
        }
        hdh.b(TAG, "Invalid texture. The platform view cannot be displayed.");
        return false;
    }

    public int getBufferHeight() {
        return this.bufferHeight;
    }

    public int getBufferWidth() {
        return this.bufferWidth;
    }

    public SurfaceTexture getTexture() {
        return this.tx;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void invalidateSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
            this.invalid = true;
        }
    }

    public boolean isCanAutoSwitch() {
        return this.mCanAutoSwitch;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.prevLeft = i;
        this.prevTop = i2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.left;
            this.prevLeft = i;
            int i2 = this.top;
            this.prevTop = i2;
            matrix.postTranslate(i, i2);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        this.touchProcessor.f(motionEvent, matrix);
        return true;
    }

    public void readyToDisplay(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i;
        this.top = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        Animation dVar = new d(getPlatformViewMatrix());
        setAnimation(dVar);
        dVar.setDuration(0L);
        dVar.setFillAfter(true);
    }

    public void release() {
        this.tx = null;
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
    }

    public void setAutoSwitchMode(boolean z) {
        this.mCanAutoSwitch = z;
    }

    public void setBufferSize(int i, int i2) {
        this.bufferWidth = i;
        this.bufferHeight = i2;
        SurfaceTexture surfaceTexture = this.tx;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            c cVar = new c(onFocusChangeListener);
            this.activeFocusListener = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    public void setPlatformViewsChannel(int i, t5m t5mVar) {
        this.mViewId = i;
        this.mPlatformViewsChannel = t5mVar;
    }

    public void setTexture(SurfaceTexture surfaceTexture) {
        Canvas lockHardwareCanvas;
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            hdh.b(TAG, "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.tx = surfaceTexture;
        int i2 = this.bufferWidth;
        if (i2 > 0 && (i = this.bufferHeight) > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i);
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        Surface createSurface = createSurface(surfaceTexture);
        this.surface = createSurface;
        lockHardwareCanvas = createSurface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            onFrameProduced();
        } finally {
            this.surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void setTouchProcessor(AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void switchToPunching() {
        this.mIsDrawToTexture = false;
    }

    public void switchToTexture() {
        this.mIsPendingToTexture = true;
        this.mTextDrawCount = 0;
        this.mHasNotifySwitchToTexture = false;
        invalidate();
    }

    public void tryToFinishToTexture(int i) {
        if (this.mIsPendingToTexture) {
            if (i == 1) {
                int i2 = this.mTextDrawCount + 1;
                this.mTextDrawCount = i2;
                if (i2 > 2) {
                    this.mIsDrawToTexture = true;
                    this.mIsPendingToTexture = false;
                }
            }
            invalidate();
        }
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.activeFocusListener) != null) {
            this.activeFocusListener = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void viewInvalidate() {
        post(new b());
    }

    public PlatformViewWrapper(Context context, lnt.b bVar) {
        this(context);
        this.textureEntry = bVar;
        bVar.b(this.listener);
        setTexture(bVar.a());
    }
}
