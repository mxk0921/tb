package com.etao.feimagesearch.cip.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.agh;
import tb.ckf;
import tb.iai;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AutoFitSurfaceView extends SurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int STATE_SURFACE_CREATED = 0;
    private float aspectRatio;
    private SurfaceHolder.Callback callback;
    private int curState;
    private int formatCache;
    private int heightCache;
    private SurfaceHolder holderCache;
    private int rotation;
    private int widthCache;
    public static final b Companion = new b(null);
    private static final String TAG = "AutoSize_AutoFitSurfaceView";
    private static final int STATE_SURFACE_CHANGED = 1;
    private static final int STATE_SURFACE_DESTROYED = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements SurfaceHolder.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            ckf.g(surfaceHolder, "holder");
            AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_CHANGED$cp());
            AutoFitSurfaceView.access$setHolderCache$p(AutoFitSurfaceView.this, surfaceHolder);
            AutoFitSurfaceView.access$setFormatCache$p(AutoFitSurfaceView.this, i);
            AutoFitSurfaceView.access$setWidthCache$p(AutoFitSurfaceView.this, i2);
            AutoFitSurfaceView.access$setHeightCache$p(AutoFitSurfaceView.this, i3);
            SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
            if (access$getCallback$p != null) {
                access$getCallback$p.surfaceChanged(surfaceHolder, i, i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            ckf.g(surfaceHolder, "holder");
            AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_CREATED$cp());
            SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
            if (access$getCallback$p != null) {
                access$getCallback$p.surfaceCreated(surfaceHolder);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                return;
            }
            ckf.g(surfaceHolder, "holder");
            AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_DESTROYED$cp());
            SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
            if (access$getCallback$p != null) {
                access$getCallback$p.surfaceDestroyed(surfaceHolder);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        static {
            t2o.a(481296840);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(481296838);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context) {
        this(context, null, 0, 6, null);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ SurfaceHolder.Callback access$getCallback$p(AutoFitSurfaceView autoFitSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceHolder.Callback) ipChange.ipc$dispatch("8c6307ee", new Object[]{autoFitSurfaceView});
        }
        return autoFitSurfaceView.callback;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_CHANGED$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1205eb0d", new Object[0])).intValue();
        }
        return STATE_SURFACE_CHANGED;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_CREATED$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a086c59", new Object[0])).intValue();
        }
        return STATE_SURFACE_CREATED;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_DESTROYED$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57163a88", new Object[0])).intValue();
        }
        return STATE_SURFACE_DESTROYED;
    }

    public static final /* synthetic */ void access$setCurState$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1938f7d4", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.curState = i;
        }
    }

    public static final /* synthetic */ void access$setFormatCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c015be", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.formatCache = i;
        }
    }

    public static final /* synthetic */ void access$setHeightCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd5a2ee", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.heightCache = i;
        }
    }

    public static final /* synthetic */ void access$setHolderCache$p(AutoFitSurfaceView autoFitSurfaceView, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80078050", new Object[]{autoFitSurfaceView, surfaceHolder});
        } else {
            autoFitSurfaceView.holderCache = surfaceHolder;
        }
    }

    public static final /* synthetic */ void access$setWidthCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bd0d09", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.widthCache = i;
        }
    }

    public static /* synthetic */ Object ipc$super(AutoFitSurfaceView autoFitSurfaceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/AutoFitSurfaceView");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        String str = TAG;
        agh.h(str, "onMeasure: " + size + " x " + size2 + "，aspectRatio=" + this.aspectRatio + ", rotation=" + this.rotation);
        float f = this.aspectRatio;
        if (f == 0.0f) {
            setMeasuredDimension(size, size2);
            return;
        }
        agh.h(str, ckf.p("actualRatio=", Float.valueOf(f)));
        float f2 = size;
        float f3 = size2;
        float f4 = this.aspectRatio;
        if (f2 < f3 * f4) {
            i4 = iai.d(f3 * f4);
            i3 = size2;
        } else {
            i3 = iai.d(f2 / f4);
            i4 = size;
        }
        agh.h(str, "Measured dimensions set: " + i4 + " x " + i3 + ", ratio:" + this.aspectRatio + ", view:" + size + '_' + size2);
        setMeasuredDimension(i4, i3);
    }

    public final void registerCallback(SurfaceHolder.Callback callback) {
        SurfaceHolder surfaceHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbd22b8", new Object[]{this, callback});
            return;
        }
        ckf.g(callback, "callback");
        this.callback = callback;
        int i = this.curState;
        if (i == STATE_SURFACE_CREATED) {
            SurfaceHolder surfaceHolder2 = this.holderCache;
            if (surfaceHolder2 != null) {
                callback.surfaceCreated(surfaceHolder2);
            }
        } else if (i == STATE_SURFACE_CHANGED) {
            SurfaceHolder surfaceHolder3 = this.holderCache;
            if (surfaceHolder3 != null) {
                callback.surfaceCreated(surfaceHolder3);
                callback.surfaceChanged(surfaceHolder3, this.formatCache, this.widthCache, this.heightCache);
            }
        } else if (i == STATE_SURFACE_DESTROYED && (surfaceHolder = this.holderCache) != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void setAspectRatio(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f49ecb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            this.aspectRatio = f3;
            this.rotation = i3;
            if (i3 == 90 || i3 == 270) {
                this.aspectRatio = f3;
                getHolder().setFixedSize(i, i2);
            } else {
                this.aspectRatio = f2 / f;
                getHolder().setFixedSize(i2, i);
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ckf.g(context, "context");
    }

    public /* synthetic */ AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.curState = -1;
        this.widthCache = -1;
        this.heightCache = -1;
        getHolder().addCallback(new a());
    }
}
