package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
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
public class FCanvasTextureView extends TextureView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAttachedToFCanvasRenderer;
    private boolean isSurfaceAvailableForRendering;
    private com.taobao.android.fcanvas.integration.a mFCanvasRenderer;
    private final FCanvas mHost;
    private b.a mLifecycleListener;
    private FCanvasInstance.RenderType mRenderType;
    private final shw mViewportMetrics;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TextureView.SurfaceTextureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
                return;
            }
            if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                access$000.printLog(0, "[" + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureAvailable()", null);
            }
            FCanvasTextureView.access$202(FCanvasTextureView.this, true);
            if (FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                FCanvasTextureView.access$400(FCanvasTextureView.this);
            }
            if (FCanvasTextureView.access$500(FCanvasTextureView.this) != null) {
                FCanvasTextureView.access$500(FCanvasTextureView.this).a();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
            }
            if (FCanvasTextureView.access$500(FCanvasTextureView.this) != null) {
                FCanvasTextureView.access$500(FCanvasTextureView.this).b();
            }
            if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                access$000.printLog(0, "[" + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureDestroyed()", null);
            }
            FCanvasTextureView.access$202(FCanvasTextureView.this, false);
            if (FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                FCanvasTextureView.access$700(FCanvasTextureView.this);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
                return;
            }
            if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                access$000.printLog(0, "[" + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureSizeChanged()", null);
            }
            if (FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                FCanvasTextureView.access$600(FCanvasTextureView.this, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
            } else {
                FCanvasTextureView.this.postInvalidate();
            }
        }
    }

    static {
        t2o.a(945815572);
        t2o.a(945815574);
    }

    public FCanvasTextureView(Context context, FCanvas fCanvas, FCanvasInstance.RenderType renderType) {
        this(context, fCanvas, null, renderType);
    }

    public static /* synthetic */ FCanvas access$000(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvas) ipChange.ipc$dispatch("312a281d", new Object[]{fCanvasTextureView});
        }
        return fCanvasTextureView.mHost;
    }

    public static /* synthetic */ FCanvasInstance.RenderType access$100(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvasInstance.RenderType) ipChange.ipc$dispatch("6c636bf9", new Object[]{fCanvasTextureView});
        }
        return fCanvasTextureView.mRenderType;
    }

    public static /* synthetic */ boolean access$202(FCanvasTextureView fCanvasTextureView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49aff053", new Object[]{fCanvasTextureView, new Boolean(z)})).booleanValue();
        }
        fCanvasTextureView.isSurfaceAvailableForRendering = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("473278a", new Object[]{fCanvasTextureView})).booleanValue();
        }
        return fCanvasTextureView.isAttachedToFCanvasRenderer;
    }

    public static /* synthetic */ void access$400(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea2afa5", new Object[]{fCanvasTextureView});
        } else {
            fCanvasTextureView.connectSurfaceToRenderer();
        }
    }

    public static /* synthetic */ b.a access$500(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("a290f1ef", new Object[]{fCanvasTextureView});
        }
        return fCanvasTextureView.mLifecycleListener;
    }

    public static /* synthetic */ void access$600(FCanvasTextureView fCanvasTextureView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899fb383", new Object[]{fCanvasTextureView, new Integer(i), new Integer(i2)});
        } else {
            fCanvasTextureView.changeSurfaceSize(i, i2);
        }
    }

    public static /* synthetic */ void access$700(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad314802", new Object[]{fCanvasTextureView});
        } else {
            fCanvasTextureView.disconnectSurfaceFromRenderer();
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
        } else if (this.mFCanvasRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        } else {
            this.mFCanvasRenderer.b(new Surface(getSurfaceTexture()), this.mRenderType);
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
        } else {
            setSurfaceTextureListener(this.surfaceTextureListener);
        }
    }

    public static /* synthetic */ Object ipc$super(FCanvasTextureView fCanvasTextureView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 880921750) {
            return super.onApplyWindowInsets((WindowInsets) objArr[0]);
        }
        if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fcanvas/integration/FCanvasTextureView");
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
        if (this.mFCanvasRenderer != null) {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.", null);
            }
            this.mFCanvasRenderer.c(this.mRenderType);
        }
        this.mFCanvasRenderer = aVar;
        this.isAttachedToFCanvasRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            FCanvas fCanvas3 = this.mHost;
            if (fCanvas3 != null) {
                fCanvas3.printLog(0, "[" + this.mRenderType.toString() + "] Surface is available for rendering. Connecting FCanvasRenderer to Android surface.", null);
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
            FCanvas fCanvas = this.mHost;
            if (fCanvas != null) {
                fCanvas.printLog(0, "[" + this.mRenderType.toString() + "] Disconnecting FCanvasRenderer from Android surface.", null);
            }
            disconnectSurfaceFromRenderer();
            this.mFCanvasRenderer = null;
            this.isAttachedToFCanvasRenderer = false;
        } else {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "[" + this.mRenderType.toString() + "] detachFromRenderer() invoked when no FCanvasRenderer was attached.", null);
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

    @Override // android.view.TextureView, android.view.View
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

    public FCanvasTextureView(Context context, FCanvas fCanvas, AttributeSet attributeSet, FCanvasInstance.RenderType renderType) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFCanvasRenderer = false;
        this.mViewportMetrics = new shw();
        this.surfaceTextureListener = new a();
        this.mRenderType = renderType;
        this.mHost = fCanvas;
        init();
    }
}
