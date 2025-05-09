package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.b;
import tb.shw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FCanvasSurfaceView extends SurfaceView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FCanvas";
    private boolean isAttachedToFCanvasRenderer;
    private boolean isSurfaceAvailableForRendering;
    private boolean keepTransparentBeforeRender;
    private com.taobao.android.fcanvas.integration.a mFCanvasRenderer;
    private FCanvas mHost;
    private b.a mLifecycleListener;
    private FCanvasInstance.RenderType mRenderType;
    private final shw mViewportMetrics;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements SurfaceHolder.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                FCanvasSurfaceView.access$400(FCanvasSurfaceView.this, i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            FCanvasSurfaceView.access$002(FCanvasSurfaceView.this, true);
            if (FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                FCanvasSurfaceView.access$200(FCanvasSurfaceView.this);
            }
            if (FCanvasSurfaceView.access$300(FCanvasSurfaceView.this) != null) {
                FCanvasSurfaceView.access$300(FCanvasSurfaceView.this).a();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                return;
            }
            if (FCanvasSurfaceView.access$300(FCanvasSurfaceView.this) != null) {
                FCanvasSurfaceView.access$300(FCanvasSurfaceView.this).b();
            }
            FCanvasSurfaceView.access$002(FCanvasSurfaceView.this, false);
            if (FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                FCanvasSurfaceView.access$500(FCanvasSurfaceView.this);
            }
        }
    }

    static {
        t2o.a(945815570);
        t2o.a(945815574);
    }

    public FCanvasSurfaceView(Context context) {
        this(context, null, false, true);
    }

    public static /* synthetic */ boolean access$002(FCanvasSurfaceView fCanvasSurfaceView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61395e63", new Object[]{fCanvasSurfaceView, new Boolean(z)})).booleanValue();
        }
        fCanvasSurfaceView.isSurfaceAvailableForRendering = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dfbb77a", new Object[]{fCanvasSurfaceView})).booleanValue();
        }
        return fCanvasSurfaceView.isAttachedToFCanvasRenderer;
    }

    public static /* synthetic */ void access$200(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882b3f95", new Object[]{fCanvasSurfaceView});
        } else {
            fCanvasSurfaceView.connectSurfaceToRenderer();
        }
    }

    public static /* synthetic */ b.a access$300(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("611b13ff", new Object[]{fCanvasSurfaceView});
        }
        return fCanvasSurfaceView.mLifecycleListener;
    }

    public static /* synthetic */ void access$400(FCanvasSurfaceView fCanvasSurfaceView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63440773", new Object[]{fCanvasSurfaceView, new Integer(i), new Integer(i2)});
        } else {
            fCanvasSurfaceView.changeSurfaceSize(i, i2);
        }
    }

    public static /* synthetic */ void access$500(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b9d7f2", new Object[]{fCanvasSurfaceView});
        } else {
            fCanvasSurfaceView.disconnectSurfaceFromRenderer();
        }
    }

    private void changeSurfaceSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5b9125", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mFCanvasRenderer != null) {
            FCanvas fCanvas = this.mHost;
            if (fCanvas != null) {
                fCanvas.printLog(0, "Notifying FCanvasRenderer that Android surface size has changed to " + i + " x " + i2, null);
            }
            this.mFCanvasRenderer.d(i, i2, this.mRenderType);
        } else {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    private void connectSurfaceToRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7c2128", new Object[]{this});
        } else if (this.mFCanvasRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        } else {
            this.mFCanvasRenderer.b(getHolder().getSurface(), this.mRenderType);
        }
    }

    private void disconnectSurfaceFromRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a6af25", new Object[]{this});
            return;
        }
        com.taobao.android.fcanvas.integration.a aVar = this.mFCanvasRenderer;
        if (aVar != null) {
            aVar.c(this.mRenderType);
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        if (this.keepTransparentBeforeRender) {
            setAlpha(0.0f);
        }
    }

    public static /* synthetic */ Object ipc$super(FCanvasSurfaceView fCanvasSurfaceView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 880921750) {
            return super.onApplyWindowInsets((WindowInsets) objArr[0]);
        }
        if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fcanvas/integration/FCanvasSurfaceView");
    }

    @Override // com.taobao.android.fcanvas.integration.b
    public void attachToRenderer(com.taobao.android.fcanvas.integration.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec60f17", new Object[]{this, aVar});
            return;
        }
        FCanvas fCanvas = this.mHost;
        if (fCanvas != null) {
            fCanvas.printLog(0, "Attaching to FCanvasRenderer.", null);
        }
        com.taobao.android.fcanvas.integration.a aVar2 = this.mFCanvasRenderer;
        if (aVar2 != null) {
            aVar2.c(this.mRenderType);
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "Already connected to a FCanvasRenderer. Detaching from old one and attaching to new one.", null);
            }
        }
        this.mFCanvasRenderer = aVar;
        this.isAttachedToFCanvasRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            FCanvas fCanvas3 = this.mHost;
            if (fCanvas3 != null) {
                fCanvas3.printLog(0, "Surface is available for rendering. Connecting FCanvasRenderer to Android surface.", null);
            }
            connectSurfaceToRenderer();
        }
    }

    @Override // com.taobao.android.fcanvas.integration.b
    public void detachFromRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f0be47", new Object[]{this});
        } else if (this.mFCanvasRenderer != null) {
            if (getWindowToken() != null) {
                FCanvas fCanvas = this.mHost;
                if (fCanvas != null) {
                    fCanvas.printLog(0, "Disconnecting FCanvasRenderer from Android surface.", null);
                }
                disconnectSurfaceFromRenderer();
            }
            if (this.keepTransparentBeforeRender) {
                setAlpha(0.0f);
            }
            this.mFCanvasRenderer = null;
            this.isAttachedToFCanvasRenderer = false;
        } else {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "detachFromRenderer() invoked when no FCanvasRenderer was attached.", null);
            }
        }
    }

    public com.taobao.android.fcanvas.integration.a getAttachedRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fcanvas.integration.a) ipChange.ipc$dispatch("c7e22e5f", new Object[]{this});
        }
        return this.mFCanvasRenderer;
    }

    @Override // com.taobao.android.fcanvas.integration.b
    public View getCanvasView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("260878dc", new Object[]{this});
        }
        return this;
    }

    public FCanvasInstance.RenderType getRenderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvasInstance.RenderType) ipChange.ipc$dispatch("27e69ade", new Object[]{this});
        }
        return this.mRenderType;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, windowInsets});
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        shw shwVar = this.mViewportMetrics;
        shwVar.b = i;
        shwVar.c = i2;
        shwVar.f28063a = getResources().getDisplayMetrics().density;
        com.taobao.android.fcanvas.integration.a aVar = this.mFCanvasRenderer;
        if (aVar != null) {
            aVar.a(this.mViewportMetrics);
        }
    }

    @Override // com.taobao.android.fcanvas.integration.b
    public void setLifecycleListener(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b8f860", new Object[]{this, aVar});
        } else {
            this.mLifecycleListener = aVar;
        }
    }

    public FCanvasSurfaceView(Context context, FCanvas fCanvas, boolean z, boolean z2, FCanvasInstance.RenderType renderType) {
        this(context, null, z, z2);
        this.mRenderType = renderType;
        this.mHost = fCanvas;
    }

    public FCanvasSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, true);
    }

    private FCanvasSurfaceView(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFCanvasRenderer = false;
        this.mViewportMetrics = new shw();
        this.mRenderType = FCanvasInstance.RenderType.canvas2D;
        this.surfaceCallback = new a();
        this.renderTransparently = z;
        this.keepTransparentBeforeRender = z2;
        init();
    }
}
