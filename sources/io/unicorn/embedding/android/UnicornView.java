package io.unicorn.embedding.android;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import io.unicorn.adapter.muise.UnicornMuiseJNI;
import io.unicorn.embedding.android.UnicornImageReaderView;
import io.unicorn.embedding.android.UnicornSurfaceView;
import io.unicorn.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import tb.dwh;
import tb.e1o;
import tb.hdh;
import tb.hs9;
import tb.ide;
import tb.js9;
import tb.lhv;
import tb.nxh;
import tb.pg1;
import tb.qbq;
import tb.t2o;
import tb.u8x;
import tb.w4x;
import tb.x8x;
import tb.z9x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornView extends FrameLayout {
    public static final int PROMOTE_FAILED_FLUTTER_ENGINE_NULL = 1;
    public static final int PROMOTE_FAILED_RENDER_SURFACE_NULL = 2;
    public static final int PROMOTE_SURFACE_SUCCESS = 0;
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private io.unicorn.embedding.engine.a flutterEngine;
    private final Set<n> flutterEngineAttachmentListeners;
    private final js9 flutterUiDisplayListener;
    private final Set<js9> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private View mCurEditTextFocusView;
    private boolean mEnableFixInputBlurSwitch;
    private boolean mEnableFixSurfaceCrash;
    private boolean mIsShowSurfaceCover;
    private ImageView mSurfaceCoverImageView;
    private boolean mSurfaceIsDestroyed;
    private UnicornSurfaceView.c mSurfaceStateListener;
    private ide mWeexUnicornListener;
    private final AccessibilityBridge.j onAccessibilityChangeListener;
    private View.OnTouchListener onTouchListener;
    private final Runnable onTransitionComplete;
    private e1o previousRenderSurface;
    private e1o renderSurface;
    private View splashScreenView;
    private UnicornImageReaderView unicornImageReaderView;
    private UnicornImageView unicornImageView;
    private lhv unicornSurfaceTexture;
    private UnicornSurfaceView unicornSurfaceView;
    private UnicornTextureView unicornTextureView;
    private final hs9.d viewportMetrics;

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum RenderMode {
        surface,
        texture,
        image
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum TransparencyMode {
        opaque,
        transparent
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements UnicornSurfaceView.c {
        public b() {
        }

        public void a() {
            UnicornView unicornView = UnicornView.this;
            unicornView.mIsShowSurfaceCover = false;
            unicornView.mSurfaceIsDestroyed = false;
        }

        public void b() {
            UnicornView.this.mSurfaceIsDestroyed = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnicornView.this.promoteRenderSurface();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements AccessibilityBridge.j {
        public e() {
        }

        public void a(boolean z, boolean z2) {
            UnicornView.this.resetWillNotDraw(z, z2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f implements js9 {
        public f() {
        }

        @Override // tb.js9
        public void a() {
            UnicornView unicornView = UnicornView.this;
            unicornView.isFlutterUiDisplayed = false;
            for (js9 js9Var : unicornView.flutterUiDisplayListeners) {
                js9Var.a();
            }
        }

        @Override // tb.js9
        public void b() {
            UnicornView unicornView = UnicornView.this;
            unicornView.isFlutterUiDisplayed = true;
            for (js9 js9Var : unicornView.flutterUiDisplayListeners) {
                js9Var.b();
            }
            if (!(unicornView.mSurfaceCoverImageView == null || unicornView.mIsShowSurfaceCover)) {
                unicornView.mSurfaceCoverImageView.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnicornView.this.splashScreenView != null) {
                UnicornView unicornView = UnicornView.this;
                unicornView.removeView(unicornView.splashScreenView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnicornView.this.unicornSurfaceView != null && UnicornView.this.renderSurface != UnicornView.this.unicornSurfaceView) {
                UnicornView unicornView = UnicornView.this;
                unicornView.removeView(unicornView.unicornSurfaceView);
                UnicornView.this.unicornSurfaceView = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnicornView.this.previousRenderSurface != null) {
                ((UnicornTextureView) UnicornView.this.previousRenderSurface).setAlpha(0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnicornView.this.previousRenderSurface != null) {
                ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setAlpha(0.0f);
                ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setZOrderOnTop(false);
                ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setVisibility(8);
                ((UnicornSurfaceView) UnicornView.this.previousRenderSurface).setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface n {
        void a(io.unicorn.embedding.engine.a aVar);

        void b();
    }

    static {
        t2o.a(945815658);
    }

    public UnicornView(Context context) {
        this(context, (AttributeSet) null, new UnicornSurfaceView(context, null, false));
    }

    private void addPendingPromoteRenderSurface() {
        this.unicornImageView.setFirstFrameRunable(new d());
    }

    private ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        int i2 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRotation();
        if (i2 == 2) {
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                if (Build.VERSION.SDK_INT >= 23) {
                    return ZeroSides.LEFT;
                }
                return ZeroSides.RIGHT;
            } else if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    private void clearForceInput(MotionEvent motionEvent) {
        if (!this.mEnableFixInputBlurSwitch && motionEvent.getAction() == 0) {
            View view = this.mCurEditTextFocusView;
            if (isShouldHideInput(view, motionEvent.getX(), motionEvent.getY())) {
                view.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySurfaceView() {
        postDelayed(new k(), 30L);
    }

    private View findViewByAccessibilityIdRootedAtCurrentView(int i2, View view) {
        int i3;
        Method declaredMethod;
        try {
            i3 = 0;
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, new Object[0]).equals(Integer.valueOf(i2))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i2, viewGroup.getChildAt(i3));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i3++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void hideSurfaceRecoverView() {
        ImageView imageView = this.mSurfaceCoverImageView;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.mSurfaceCoverImageView.setVisibility(8);
        }
    }

    private void init() {
        hdh.e(TAG, "Initializing FlutterView");
        if (this.unicornSurfaceView != null) {
            hdh.e(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.unicornSurfaceView);
        } else if (this.unicornTextureView != null) {
            hdh.e(TAG, "Internally using a FlutterTextureView.");
            addView(this.unicornTextureView);
        } else if (this.unicornImageView != null) {
            hdh.e(TAG, "Internally using a UnicornImageView.");
            addView(this.unicornImageView);
        } else {
            hdh.e(TAG, "Internally using a FlutterImageView.");
            addView(this.unicornImageReaderView);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
        this.mEnableFixSurfaceCrash = w4x.s("enable-fix-surface-crash", true, true);
    }

    private boolean isShouldHideInput(View view, float f2, float f3) {
        if (!(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int height = view.getHeight() + i3;
        int width = view.getWidth() + i2;
        if (f2 <= i2 || f2 >= width || f3 <= i3 || f3 >= height) {
            return true;
        }
        return false;
    }

    private boolean isSplashScreenNeededNow() {
        return !hasRenderedFirstFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z2) {
        boolean z3;
        if (z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            hdh.f(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.f20860a = getResources().getDisplayMetrics().density;
        this.flutterEngine.u().s(this.viewportMetrics);
    }

    private void setFlutterViewFocusable() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    private void updateViewportPadding() {
        if (isAttachedToWindow()) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            hs9.d dVar = this.viewportMetrics;
            dVar.g = iArr[0];
            dVar.d = iArr[1];
            Rect rect = new Rect();
            boolean globalVisibleRect = getGlobalVisibleRect(rect);
            int height = rect.height();
            int d2 = nxh.d(getContext());
            hs9.d dVar2 = this.viewportMetrics;
            int i2 = d2 - (dVar2.d + height);
            if (height == 0 || !globalVisibleRect || i2 < 0) {
                dVar2.d = nxh.d(getContext());
                this.viewportMetrics.f = 0;
            } else {
                dVar2.f = i2;
            }
            if (globalVisibleRect && rect.width() == getMeasuredWidth()) {
                this.viewportMetrics.g = 0;
            }
        } else if (getResources() != null && getResources().getDisplayMetrics() != null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hs9.d dVar3 = this.viewportMetrics;
            dVar3.g = displayMetrics.widthPixels;
            dVar3.d = displayMetrics.heightPixels;
        }
    }

    public boolean acquireLatestImageViewFrame() {
        UnicornImageReaderView unicornImageReaderView = this.unicornImageReaderView;
        if (unicornImageReaderView != null) {
            return unicornImageReaderView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(n nVar) {
        this.flutterEngineAttachmentListeners.add(nVar);
    }

    public void addOnFirstFrameRenderedListener(js9 js9Var) {
        this.flutterUiDisplayListeners.add(js9Var);
    }

    public void attachOverlaySurfaceToRender(UnicornImageReaderView unicornImageReaderView) {
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar != null) {
            unicornImageReaderView.attachToRenderer(aVar.u());
        }
    }

    public void attachToFlutterEngine(io.unicorn.embedding.engine.a aVar) {
        u8x.a("attachToFlutterEngine");
        hdh.e(TAG, "Attaching to a FlutterEngine: " + aVar);
        if (isAttachedToFlutterEngine()) {
            if (aVar == this.flutterEngine) {
                hdh.e(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                hdh.e(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = aVar;
        hs9 u = aVar.u();
        this.isFlutterUiDisplayed = u.k();
        u8x.a("attachToRenderer");
        this.renderSurface.attachToRenderer(u);
        u8x.b("attachToRenderer");
        u.f(this.flutterUiDisplayListener);
        u8x.a("newAndroidTouchProcessor");
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.u(), false);
        u8x.b("newAndroidTouchProcessor");
        u8x.a("newAccessibilityBridge");
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, aVar.p(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.flutterEngine.t());
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.P(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.z(), this.accessibilityBridge.A());
        this.flutterEngine.t().d(this.accessibilityBridge);
        u8x.b("newAccessibilityBridge");
        this.flutterEngine.t().e(this.flutterEngine.u());
        sendUserSettingsToFlutter();
        sendViewportMetricsToFlutter();
        aVar.t().f(this);
        for (n nVar : this.flutterEngineAttachmentListeners) {
            nVar.a(aVar);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.b();
        }
        u8x.b("attachToFlutterEngine");
    }

    public void clearCurEditTextFocusView(View view) {
        if (this.mCurEditTextFocusView == view) {
            this.mCurEditTextFocusView = null;
        }
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        if (this.unicornImageReaderView == null) {
            UnicornImageReaderView createImageView = createImageView();
            this.unicornImageReaderView = createImageView;
            addView(createImageView);
        } else {
            int width = getWidth();
            int height = getHeight();
            if (width <= 0) {
                width = this.viewportMetrics.b;
            }
            if (height <= 0) {
                height = this.viewportMetrics.c;
            }
            this.unicornImageReaderView.resizeIfNeeded(width, height);
        }
        this.previousRenderSurface = this.renderSurface;
        UnicornImageReaderView unicornImageReaderView = this.unicornImageReaderView;
        this.renderSurface = unicornImageReaderView;
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar != null) {
            unicornImageReaderView.attachToRenderer(aVar.u());
            e1o e1oVar = this.previousRenderSurface;
            if (e1oVar instanceof UnicornTextureView) {
                if (!((UnicornTextureView) e1oVar).isOpaque()) {
                    post(new l());
                }
            } else if ((e1oVar instanceof UnicornSurfaceView) && ((UnicornSurfaceView) e1oVar).getRenderTransparently()) {
                post(new m());
            }
        }
    }

    public void convertToOffScreenSurface() {
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView != null && this.renderSurface == unicornImageView) {
            unicornImageView.stopRendering();
        }
    }

    public void convertToOnScreenSurface(int i2, int i3) {
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView != null && this.renderSurface == unicornImageView) {
            unicornImageView.startRendering(i2, i3);
            this.unicornImageView.setAlpha(1.0f);
            this.flutterEngine.r().syncForceBeginFrame();
            this.flutterEngine.s().d();
        }
    }

    public void convertToSurfaceView() {
        if (!(this.renderSurface instanceof UnicornTextureView)) {
            hdh.d(TAG, "Tried to convert to the surface view, but no texture view is used.");
            return;
        }
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar == null || aVar.u() == null) {
            hdh.d(TAG, "Tried to convert to the surface view, but flutterEngine is null.");
            return;
        }
        this.renderSurface.pause();
        if (this.unicornSurfaceView == null) {
            UnicornSurfaceView unicornSurfaceView = new UnicornSurfaceView(getContext(), false);
            this.unicornSurfaceView = unicornSurfaceView;
            addView(unicornSurfaceView);
        }
        this.renderSurface = this.unicornSurfaceView;
        hs9 u = this.flutterEngine.u();
        u.p();
        this.renderSurface.attachToRenderer(u);
        u.f(new i(u));
        hdh.d(TAG, "Convert to SurfaceView!");
    }

    public void convertToTextureView() {
        if (!(this.renderSurface instanceof UnicornSurfaceView)) {
            hdh.d(TAG, "Tried to surface the texture view, but no surface view is used.");
            return;
        }
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar == null || aVar.u() == null) {
            hdh.d(TAG, "Tried to convert to the surface view, but flutterEngine is null.");
            return;
        }
        this.renderSurface.pause();
        if (this.unicornTextureView == null) {
            UnicornTextureView unicornTextureView = new UnicornTextureView(getContext());
            this.unicornTextureView = unicornTextureView;
            addView(unicornTextureView);
        }
        this.unicornTextureView.setOpaque(false);
        this.renderSurface = this.unicornTextureView;
        hs9 u = this.flutterEngine.u();
        u.p();
        this.renderSurface.attachToRenderer(u);
        u.f(new j(u));
        hdh.d(TAG, "Convert to TextureView!");
    }

    public UnicornImageReaderView createImageView() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            width = this.viewportMetrics.b;
        }
        if (height <= 0) {
            height = this.viewportMetrics.c;
        }
        return new UnicornImageReaderView(getContext(), width, height, UnicornImageReaderView.SurfaceKind.background);
    }

    public void detachFromFlutterEngine() {
        hdh.e(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            hdh.e(TAG, "Not attached to an engine. Doing nothing.");
            return;
        }
        for (n nVar : this.flutterEngineAttachmentListeners) {
            nVar.b();
        }
        this.flutterEngine.t().s();
        this.flutterEngine.t().r();
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge != null) {
            accessibilityBridge.J();
            this.accessibilityBridge = null;
        }
        hs9 u = this.flutterEngine.u();
        this.isFlutterUiDisplayed = false;
        u.o(this.flutterUiDisplayListener);
        u.v();
        u.r(false);
        e1o e1oVar = this.previousRenderSurface;
        if (e1oVar != null && this.renderSurface == this.unicornImageReaderView) {
            this.renderSurface = e1oVar;
        }
        this.renderSurface.detachFromRenderer();
        UnicornImageReaderView unicornImageReaderView = this.unicornImageReaderView;
        if (unicornImageReaderView != null) {
            unicornImageReaderView.closeImageReader();
            removeView(this.unicornImageReaderView);
            this.unicornImageReaderView = null;
        }
        UnicornImageView unicornImageView = this.unicornImageView;
        if (unicornImageView != null) {
            unicornImageView.closeImageReader();
            this.unicornImageView = null;
        }
        lhv lhvVar = this.unicornSurfaceTexture;
        if (lhvVar != null) {
            lhvVar.e();
            this.unicornSurfaceTexture = null;
        }
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    public View findViewByAccessibilityIdTraversal(int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i2, this);
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i2));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.z()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public io.unicorn.embedding.engine.a getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    public PointerIcon getSystemPointerIcon(int i2) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(getContext(), i2);
        return systemIcon;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public void invalidRenderSurface() {
        e1o e1oVar = this.renderSurface;
        if (e1oVar != null) {
            e1oVar.invalid();
        }
    }

    public boolean isAttachedToFlutterEngine() {
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar == null || aVar.u() != this.renderSurface.getAttachedRenderer()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        Insets insets;
        int i6;
        int i7;
        int i8;
        int i9;
        int ime;
        Insets insets2;
        int i10;
        int i11;
        int i12;
        int i13;
        int systemGestures;
        Insets insets3;
        int i14;
        int i15;
        int i16;
        int i17;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        int i18;
        int safeInsetTop;
        int i19;
        int safeInsetRight;
        int i20;
        int safeInsetBottom;
        int i21;
        int safeInsetLeft;
        int statusBars;
        Insets systemGestureInsets;
        int i22;
        int i23;
        int i24;
        int i25;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i26 = Build.VERSION.SDK_INT;
        if (i26 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            hs9.d dVar = this.viewportMetrics;
            i22 = systemGestureInsets.top;
            dVar.l = i22;
            hs9.d dVar2 = this.viewportMetrics;
            i23 = systemGestureInsets.right;
            dVar2.m = i23;
            hs9.d dVar3 = this.viewportMetrics;
            i24 = systemGestureInsets.bottom;
            dVar3.n = i24;
            hs9.d dVar4 = this.viewportMetrics;
            i25 = systemGestureInsets.left;
            dVar4.o = i25;
        }
        boolean z2 = true;
        int i27 = 0;
        if ((getWindowSystemUiVisibility() & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z2 = false;
        }
        if (i26 >= 30) {
            if (z2) {
                i27 = WindowInsets.Type.navigationBars();
            }
            if (z) {
                statusBars = WindowInsets.Type.statusBars();
                i27 |= statusBars;
            }
            insets = windowInsets.getInsets(i27);
            hs9.d dVar5 = this.viewportMetrics;
            i6 = insets.top;
            dVar5.d = i6;
            hs9.d dVar6 = this.viewportMetrics;
            i7 = insets.right;
            dVar6.e = i7;
            hs9.d dVar7 = this.viewportMetrics;
            i8 = insets.bottom;
            dVar7.f = i8;
            hs9.d dVar8 = this.viewportMetrics;
            i9 = insets.left;
            dVar8.g = i9;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            hs9.d dVar9 = this.viewportMetrics;
            i10 = insets2.top;
            dVar9.h = i10;
            hs9.d dVar10 = this.viewportMetrics;
            i11 = insets2.right;
            dVar10.i = i11;
            hs9.d dVar11 = this.viewportMetrics;
            i12 = insets2.bottom;
            dVar11.j = i12;
            hs9.d dVar12 = this.viewportMetrics;
            i13 = insets2.left;
            dVar12.k = i13;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            hs9.d dVar13 = this.viewportMetrics;
            i14 = insets3.top;
            dVar13.l = i14;
            hs9.d dVar14 = this.viewportMetrics;
            i15 = insets3.right;
            dVar14.m = i15;
            hs9.d dVar15 = this.viewportMetrics;
            i16 = insets3.bottom;
            dVar15.n = i16;
            hs9.d dVar16 = this.viewportMetrics;
            i17 = insets3.left;
            dVar16.o = i17;
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                hs9.d dVar17 = this.viewportMetrics;
                int i28 = dVar17.d;
                i18 = waterfallInsets.top;
                int max = Math.max(i28, i18);
                safeInsetTop = displayCutout.getSafeInsetTop();
                dVar17.d = Math.max(max, safeInsetTop);
                hs9.d dVar18 = this.viewportMetrics;
                int i29 = dVar18.e;
                i19 = waterfallInsets.right;
                int max2 = Math.max(i29, i19);
                safeInsetRight = displayCutout.getSafeInsetRight();
                dVar18.e = Math.max(max2, safeInsetRight);
                hs9.d dVar19 = this.viewportMetrics;
                int i30 = dVar19.f;
                i20 = waterfallInsets.bottom;
                int max3 = Math.max(i30, i20);
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                dVar19.f = Math.max(max3, safeInsetBottom);
                hs9.d dVar20 = this.viewportMetrics;
                int i31 = dVar20.g;
                i21 = waterfallInsets.left;
                int max4 = Math.max(i31, i21);
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                dVar20.g = Math.max(max4, safeInsetLeft);
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z2) {
                zeroSides = calculateShouldZeroSides();
            }
            hs9.d dVar21 = this.viewportMetrics;
            if (z) {
                i2 = windowInsets.getSystemWindowInsetTop();
            } else {
                i2 = 0;
            }
            dVar21.d = i2;
            hs9.d dVar22 = this.viewportMetrics;
            if (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) {
                i3 = 0;
            } else {
                i3 = windowInsets.getSystemWindowInsetRight();
            }
            dVar22.e = i3;
            hs9.d dVar23 = this.viewportMetrics;
            dVar23.f = 0;
            if (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) {
                i4 = 0;
            } else {
                i4 = windowInsets.getSystemWindowInsetLeft();
            }
            dVar23.g = i4;
            hs9.d dVar24 = this.viewportMetrics;
            dVar24.h = 0;
            dVar24.i = 0;
            if (z2) {
                i5 = windowInsets.getSystemWindowInsetBottom();
            } else {
                i5 = guessBottomKeyboardInset(windowInsets);
            }
            dVar24.j = i5;
            this.viewportMetrics.k = 0;
        }
        hdh.e(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.d + ", Left: " + this.viewportMetrics.g + ", Right: " + this.viewportMetrics.e + "\nKeyboard insets: Bottom: " + this.viewportMetrics.j + ", Left: " + this.viewportMetrics.k + ", Right: " + this.viewportMetrics.i + "System Gesture Insets - Left: " + this.viewportMetrics.o + ", Top: " + this.viewportMetrics.l + ", Right: " + this.viewportMetrics.m + ", Bottom: " + this.viewportMetrics.j);
        updateViewportPadding();
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            hdh.e(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            sendUserSettingsToFlutter();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine() || !this.androidTouchProcessor.d(motionEvent)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onHoverEvent(motionEvent);
        }
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null) {
            return false;
        }
        return accessibilityBridge.D(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onKeyDown(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onKeyUp(i2, keyEvent);
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
    }

    public void onResume() {
        ImageView imageView;
        if (this.unicornSurfaceView != null && (imageView = this.mSurfaceCoverImageView) != null && imageView.getVisibility() == 0 && !this.mSurfaceIsDestroyed) {
            this.mSurfaceCoverImageView.setVisibility(8);
            this.mIsShowSurfaceCover = false;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        hdh.e(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i4 + " x " + i5 + ", it is now " + i2 + " x " + i3);
        hs9.d dVar = this.viewportMetrics;
        dVar.b = i2;
        dVar.c = i3;
        updateViewportPadding();
        sendViewportMetricsToFlutter();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
            return true;
        }
        clearForceInput(motionEvent);
        hideSurfaceRecoverView();
        if (!(this.mWeexUnicornListener == null || motionEvent.getAction() == 2)) {
            ((x8x.h) this.mWeexUnicornListener).a("actionType:" + motionEvent.getAction() + ",x:" + motionEvent.getRawX() + ",y:" + motionEvent.getRawY());
        }
        z9x.d(1, "onTouch", motionEvent, this);
        this.androidTouchProcessor.e(motionEvent);
        return true;
    }

    public int promoteRenderSurface() {
        if (this.flutterEngine == null) {
            dwh.f("UnicornView", "FlutterView.promoteRenderSurface failed flutterEngine is null");
            return 1;
        }
        e1o e1oVar = this.renderSurface;
        if (e1oVar == null) {
            dwh.f("UnicornView", "FlutterView.promoteRenderSurface failed - renderSurface is null");
            return 2;
        } else if (e1oVar == this.unicornSurfaceView) {
            dwh.f("UnicornView", "当前是unicornSurfaceView return不执行");
            return 0;
        } else if (!(e1oVar instanceof UnicornImageView) || ((UnicornImageView) e1oVar).hasContent()) {
            hdh.b("UnicornView", "开始做SurfaceView的转换");
            if (this.unicornSurfaceView == null) {
                this.unicornSurfaceView = new UnicornSurfaceView(getContext());
                int indexOfChild = indexOfChild(this.unicornImageView);
                if (indexOfChild != -1) {
                    addView(this.unicornSurfaceView, indexOfChild + 1);
                } else {
                    addView(this.unicornSurfaceView);
                }
            }
            c cVar = new c();
            if (this.unicornSurfaceView.hasSurface()) {
                cVar.run();
            } else {
                this.unicornSurfaceView.initForPromote(cVar);
            }
            return 0;
        } else {
            hdh.b("UnicornView", "此时imageView无内容 做pending机制");
            addPendingPromoteRenderSurface();
            return 0;
        }
    }

    public void registerEditTextFocusView(View view) {
        this.mCurEditTextFocusView = view;
    }

    public void removeFlutterEngineAttachmentListener(n nVar) {
        this.flutterEngineAttachmentListeners.remove(nVar);
    }

    public void removeOnFirstFrameRenderedListener(js9 js9Var) {
        this.flutterUiDisplayListeners.remove(js9Var);
    }

    public void revertImageView(Runnable runnable) {
        if (this.unicornImageReaderView == null) {
            hdh.e(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        e1o e1oVar = this.previousRenderSurface;
        if (e1oVar == null) {
            hdh.e(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        if (e1oVar instanceof UnicornTextureView) {
            if (!((UnicornTextureView) e1oVar).isOpaque()) {
                ((UnicornTextureView) this.previousRenderSurface).setAlpha(1.0f);
            }
        } else if ((e1oVar instanceof UnicornSurfaceView) && ((UnicornSurfaceView) e1oVar).getRenderTransparently()) {
            ((UnicornSurfaceView) this.previousRenderSurface).setAlpha(1.0f);
            ((UnicornSurfaceView) this.previousRenderSurface).setZOrderOnTop(true);
        }
        this.renderSurface = this.previousRenderSurface;
        this.previousRenderSurface = null;
        io.unicorn.embedding.engine.a aVar = this.flutterEngine;
        if (aVar == null) {
            this.unicornImageReaderView.detachFromRenderer();
            runnable.run();
            return;
        }
        hs9 u = aVar.u();
        if (u == null) {
            this.unicornImageReaderView.detachFromRenderer();
            runnable.run();
            return;
        }
        this.renderSurface.attachToRenderer(u);
        u.f(new a(u, runnable));
    }

    public void setRenderSurfaceOpaque(boolean z) {
        e1o e1oVar = this.renderSurface;
        if (e1oVar instanceof UnicornTextureView) {
            ((UnicornTextureView) e1oVar).setOpaque(z);
        }
    }

    public void setSplashView(qbq qbqVar) {
        if (qbqVar != null && isSplashScreenNeededNow()) {
            hdh.e(TAG, "Showing splash screen UI.");
            View a2 = ((UnicornMuiseJNI.c) qbqVar).a(getContext(), null);
            this.splashScreenView = a2;
            addView(a2);
            addOnFirstFrameRenderedListener(new g(qbqVar));
        }
    }

    public void setTouchListener(View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public void setViewportMetrics(int i2, int i3) {
        hs9.d dVar = this.viewportMetrics;
        dVar.b = i2;
        dVar.c = i3;
        sendViewportMetricsToFlutter();
    }

    public void setWeexUnicornListener(ide ideVar) {
        this.mWeexUnicornListener = ideVar;
    }

    public void showRecoverSurface() {
        if (this.unicornSurfaceView != null && !this.mIsShowSurfaceCover) {
            this.mIsShowSurfaceCover = true;
            ByteBuffer j2 = getAttachedFlutterEngine().u().j();
            if (this.mSurfaceCoverImageView == null) {
                ImageView imageView = new ImageView(getContext());
                this.mSurfaceCoverImageView = imageView;
                imageView.setBackgroundColor(-1);
                this.mSurfaceCoverImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                addView(this.mSurfaceCoverImageView, new FrameLayout.LayoutParams(-1, -1));
            }
            if (j2 != null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.unicornSurfaceView.getWidth(), this.unicornSurfaceView.getHeight(), Bitmap.Config.RGB_565);
                createBitmap.copyPixelsFromBuffer(j2);
                this.mSurfaceCoverImageView.setImageBitmap(createBitmap);
            }
            getAttachedFlutterEngine().u().h();
            if (this.mSurfaceCoverImageView.getVisibility() == 8) {
                this.mSurfaceCoverImageView.setVisibility(0);
            }
            if (this.mSurfaceStateListener == null) {
                b bVar = new b();
                this.mSurfaceStateListener = bVar;
                this.unicornSurfaceView.setSurfaceStateListener(bVar);
            }
        }
    }

    public void updateScreenSize(float f2, float f3) {
        hs9.d dVar = this.viewportMetrics;
        dVar.p = (int) f2;
        dVar.q = (int) f3;
        sendViewportMetricsToFlutter();
    }

    public void updateViewport() {
        updateViewportPadding();
        sendViewportMetricsToFlutter();
    }

    public void validRenderSurface() {
        e1o e1oVar = this.renderSurface;
        if (e1oVar != null) {
            e1oVar.valid();
        }
    }

    @Deprecated
    public UnicornView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new UnicornSurfaceView(context, null, transparencyMode == TransparencyMode.transparent));
    }

    public UnicornView(Context context, UnicornSurfaceView unicornSurfaceView) {
        this(context, (AttributeSet) null, unicornSurfaceView);
    }

    public UnicornView(Context context, UnicornTextureView unicornTextureView) {
        this(context, (AttributeSet) null, unicornTextureView);
    }

    public UnicornView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new UnicornSurfaceView(context, null, false));
    }

    private UnicornView(Context context, AttributeSet attributeSet, UnicornSurfaceView unicornSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixInputBlurSwitch = w4x.g();
        this.mEnableFixSurfaceCrash = false;
        this.mIsShowSurfaceCover = false;
        this.mSurfaceIsDestroyed = false;
        this.viewportMetrics = new hs9.d();
        this.onAccessibilityChangeListener = new e();
        this.flutterUiDisplayListener = new f();
        this.onTransitionComplete = new h();
        this.unicornSurfaceView = unicornSurfaceView;
        this.renderSurface = unicornSurfaceView;
        init();
    }

    private UnicornView(Context context, AttributeSet attributeSet, UnicornTextureView unicornTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixInputBlurSwitch = w4x.g();
        this.mEnableFixSurfaceCrash = false;
        this.mIsShowSurfaceCover = false;
        this.mSurfaceIsDestroyed = false;
        this.viewportMetrics = new hs9.d();
        this.onAccessibilityChangeListener = new e();
        this.flutterUiDisplayListener = new f();
        this.onTransitionComplete = new h();
        this.unicornTextureView = unicornTextureView;
        this.renderSurface = unicornTextureView;
        init();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnicornView unicornView = UnicornView.this;
            unicornView.renderSurface = unicornView.unicornSurfaceView;
            hs9 u = UnicornView.this.flutterEngine.u();
            u.p();
            if (UnicornView.this.mEnableFixSurfaceCrash) {
                UnicornView.this.unicornSurfaceView.swapSurface(u);
            } else {
                UnicornView.this.renderSurface.attachToRenderer(u);
            }
            u.f(new a(u));
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class a implements js9 {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ hs9 f15179a;

            public a(hs9 hs9Var) {
                this.f15179a = hs9Var;
            }

            @Override // tb.js9
            public void b() {
                this.f15179a.o(this);
                c cVar = c.this;
                if (UnicornView.this.unicornImageView != null) {
                    UnicornView.this.unicornImageView.destroy();
                    UnicornView unicornView = UnicornView.this;
                    unicornView.removeView(unicornView.unicornImageView);
                    UnicornView.this.unicornImageView = null;
                }
            }

            @Override // tb.js9
            public void a() {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hs9 f15176a;
        public final /* synthetic */ Runnable b;

        public a(hs9 hs9Var, Runnable runnable) {
            this.f15176a = hs9Var;
            this.b = runnable;
        }

        @Override // tb.js9
        public void b() {
            this.f15176a.o(this);
            this.b.run();
            UnicornView unicornView = UnicornView.this;
            if (!(unicornView.renderSurface instanceof UnicornImageReaderView) && unicornView.unicornImageReaderView != null) {
                unicornView.unicornImageReaderView.detachFromRenderer();
            }
        }

        @Override // tb.js9
        public void a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class g implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qbq f15183a;

        public g(qbq qbqVar) {
            this.f15183a = qbqVar;
        }

        @Override // tb.js9
        public void b() {
            ((UnicornMuiseJNI.c) this.f15183a).b(UnicornView.this.onTransitionComplete);
        }

        @Override // tb.js9
        public void a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class i implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hs9 f15185a;

        public i(hs9 hs9Var) {
            this.f15185a = hs9Var;
        }

        @Override // tb.js9
        public void b() {
            this.f15185a.o(this);
            UnicornView unicornView = UnicornView.this;
            if (unicornView.unicornTextureView != null) {
                unicornView.removeView(unicornView.unicornTextureView);
                unicornView.unicornTextureView = null;
            }
        }

        @Override // tb.js9
        public void a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class j implements js9 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hs9 f15186a;

        public j(hs9 hs9Var) {
            this.f15186a = hs9Var;
        }

        @Override // tb.js9
        public void b() {
            UnicornView unicornView = UnicornView.this;
            unicornView.unicornTextureView.setOpaque(true);
            this.f15186a.o(this);
            unicornView.destroySurfaceView();
        }

        @Override // tb.js9
        public void a() {
        }
    }

    public static void preloadClass() {
    }

    public void sendUserSettingsToFlutter() {
    }

    public UnicornView(Context context, UnicornImageView unicornImageView) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixInputBlurSwitch = w4x.g();
        this.mEnableFixSurfaceCrash = false;
        this.mIsShowSurfaceCover = false;
        this.mSurfaceIsDestroyed = false;
        this.viewportMetrics = new hs9.d();
        this.onAccessibilityChangeListener = new e();
        this.flutterUiDisplayListener = new f();
        this.onTransitionComplete = new h();
        this.unicornImageView = unicornImageView;
        this.renderSurface = unicornImageView;
        init();
    }

    public UnicornView(Context context, lhv lhvVar) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.mEnableFixInputBlurSwitch = w4x.g();
        this.mEnableFixSurfaceCrash = false;
        this.mIsShowSurfaceCover = false;
        this.mSurfaceIsDestroyed = false;
        this.viewportMetrics = new hs9.d();
        this.onAccessibilityChangeListener = new e();
        this.flutterUiDisplayListener = new f();
        this.onTransitionComplete = new h();
        this.unicornSurfaceTexture = lhvVar;
        this.renderSurface = lhvVar;
    }
}
