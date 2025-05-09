package com.taobao.android.megadesign.ZoomableGesture;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.ZoomableGesture.MegaImageZoomableGestureHandler;
import com.taobao.android.megadesign.ZoomableGesture.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MegaImageZoomableImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static float MAX_SCALE_FACTOR = 3.0f;
    private static float MIN_SCALE_FACTOR = 0.9f;
    private static final WeakHashMap<Context, WeakReference<MegaImageZoomableImageView>> instanceMap = new WeakHashMap<>();
    public float compensateX;
    public float compensateY;
    private float mScaleFactor;
    private Matrix matrix;
    public MegaImageZoomableGestureHandler megaImageZoomableGestureHandler;
    private MotionEvent onDownMotionEvent;
    private c onZoomEndListener;
    private Matrix savedMatrix;
    private ScaleGestureDetector scaleGestureDetector;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MegaImageZoomableGestureHandler.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("951909eb", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            MegaImageZoomableImageView.access$400(MegaImageZoomableImageView.this).postTranslate(f, f2);
            MegaImageZoomableImageView megaImageZoomableImageView = MegaImageZoomableImageView.this;
            megaImageZoomableImageView.setImageMatrix(MegaImageZoomableImageView.access$400(megaImageZoomableImageView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MegaImageZoomableGestureHandler.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("525a814", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            MegaImageZoomableImageView.access$400(MegaImageZoomableImageView.this).postTranslate(f, f2);
            MegaImageZoomableImageView megaImageZoomableImageView = MegaImageZoomableImageView.this;
            megaImageZoomableImageView.setImageMatrix(MegaImageZoomableImageView.access$400(megaImageZoomableImageView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/ZoomableGesture/MegaImageZoomableImageView$ScaleListener");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            MegaImageZoomableImageView megaImageZoomableImageView = MegaImageZoomableImageView.this;
            MegaImageZoomableImageView.access$102(megaImageZoomableImageView, MegaImageZoomableImageView.access$100(megaImageZoomableImageView) * scaleFactor);
            float focusX = scaleGestureDetector.getFocusX() + MegaImageZoomableImageView.this.compensateX;
            float focusY = scaleGestureDetector.getFocusY();
            MegaImageZoomableImageView megaImageZoomableImageView2 = MegaImageZoomableImageView.this;
            float f = focusY + megaImageZoomableImageView2.compensateY;
            if (MegaImageZoomableImageView.access$100(megaImageZoomableImageView2) >= MegaImageZoomableImageView.access$200() && MegaImageZoomableImageView.access$100(MegaImageZoomableImageView.this) <= MegaImageZoomableImageView.access$300()) {
                MegaImageZoomableImageView.access$400(MegaImageZoomableImageView.this).postScale(scaleFactor, scaleFactor, focusX, f);
                MegaImageZoomableImageView megaImageZoomableImageView3 = MegaImageZoomableImageView.this;
                megaImageZoomableImageView3.setImageMatrix(MegaImageZoomableImageView.access$400(megaImageZoomableImageView3));
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            return true;
        }

        public /* synthetic */ d(MegaImageZoomableImageView megaImageZoomableImageView, a aVar) {
            this();
        }
    }

    public MegaImageZoomableImageView(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ float access$100(MegaImageZoomableImageView megaImageZoomableImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d9c26e", new Object[]{megaImageZoomableImageView})).floatValue();
        }
        return megaImageZoomableImageView.mScaleFactor;
    }

    public static /* synthetic */ float access$102(MegaImageZoomableImageView megaImageZoomableImageView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6145c0b0", new Object[]{megaImageZoomableImageView, new Float(f)})).floatValue();
        }
        megaImageZoomableImageView.mScaleFactor = f;
        return f;
    }

    public static /* synthetic */ float access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27de9", new Object[0])).floatValue();
        }
        return MIN_SCALE_FACTOR;
    }

    public static /* synthetic */ float access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92a", new Object[0])).floatValue();
        }
        return MAX_SCALE_FACTOR;
    }

    public static /* synthetic */ Matrix access$400(MegaImageZoomableImageView megaImageZoomableImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("6ebd0c0d", new Object[]{megaImageZoomableImageView});
        }
        return megaImageZoomableImageView.matrix;
    }

    public static synchronized MegaImageZoomableImageView getInstance(Context context) {
        synchronized (MegaImageZoomableImageView.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MegaImageZoomableImageView) ipChange.ipc$dispatch("991f5466", new Object[]{context});
            }
            MegaImageZoomableImageView megaImageZoomableImageView = null;
            if (context == null) {
                return null;
            }
            WeakHashMap<Context, WeakReference<MegaImageZoomableImageView>> weakHashMap = instanceMap;
            WeakReference<MegaImageZoomableImageView> weakReference = weakHashMap.get(context);
            if (weakReference != null) {
                megaImageZoomableImageView = weakReference.get();
            }
            if (megaImageZoomableImageView == null) {
                megaImageZoomableImageView = new MegaImageZoomableImageView(context);
                weakHashMap.put(context, new WeakReference<>(megaImageZoomableImageView));
            }
            return megaImageZoomableImageView;
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        this.scaleGestureDetector = new ScaleGestureDetector(context, new d(this, null));
        this.megaImageZoomableGestureHandler = new MegaImageZoomableGestureHandler();
        setSingleDragMoveListener();
        setDoubleDragMoveListener();
    }

    public static /* synthetic */ Object ipc$super(MegaImageZoomableImageView megaImageZoomableImageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/ZoomableGesture/MegaImageZoomableImageView");
    }

    private float spacing(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a5a20cf", new Object[]{this, motionEvent})).floatValue();
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void freshData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac09e7f", new Object[]{this});
            return;
        }
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.compensateX = 0.0f;
        this.compensateY = 0.0f;
        this.mScaleFactor = 1.0f;
        this.megaImageZoomableGestureHandler.a();
        this.onDownMotionEvent = null;
    }

    public float getCompensateX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d55b5bc2", new Object[]{this})).floatValue();
        }
        return this.compensateX;
    }

    public float getCompensateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5697343", new Object[]{this})).floatValue();
        }
        return this.compensateY;
    }

    public float getmScaleFactor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f19e259", new Object[]{this})).floatValue();
        }
        return this.mScaleFactor;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        this.scaleGestureDetector.onTouchEvent(motionEvent);
        this.megaImageZoomableGestureHandler.onTouch(this, motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            c cVar = this.onZoomEndListener;
            if (cVar != null) {
                ((a.C0462a) cVar).a(this.matrix);
            }
        } else if (action == 5 && motionEvent.getPointerCount() == 2) {
            this.savedMatrix.set(this.matrix);
        }
        return true;
    }

    public void setCompensateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0d1b3a", new Object[]{this, new Float(f)});
        } else {
            this.compensateX = f;
        }
    }

    public void setCompensateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc1f3d9", new Object[]{this, new Float(f)});
        } else {
            this.compensateY = f;
        }
    }

    public void setDoubleDragMoveListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a81673", new Object[]{this});
        } else {
            this.megaImageZoomableGestureHandler.b(new a());
        }
    }

    public void setImageMatrixAndPosition(int[] iArr, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2c04e1", new Object[]{this, iArr, matrix});
            return;
        }
        this.matrix.set(matrix);
        setImageMatrix(this.matrix);
        this.savedMatrix.set(this.matrix);
        this.megaImageZoomableGestureHandler.c(this.onDownMotionEvent);
        this.compensateX = iArr[0];
        this.compensateY = iArr[1];
    }

    public void setOnDownMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4ee67d", new Object[]{this, motionEvent});
        } else {
            this.onDownMotionEvent = motionEvent;
        }
    }

    public void setOnZoomEndListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c65b2f", new Object[]{this, cVar});
        } else {
            this.onZoomEndListener = cVar;
        }
    }

    public void setSingleDragMoveListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82f3d6a", new Object[]{this});
        } else {
            this.megaImageZoomableGestureHandler.d(new b());
        }
    }

    public void setmScaleFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb8deeb", new Object[]{this, new Float(f)});
        } else {
            this.mScaleFactor = f;
        }
    }

    public MegaImageZoomableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MegaImageZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.mScaleFactor = 1.0f;
        this.compensateX = 0.0f;
        this.compensateY = 0.0f;
        init(context);
    }
}
