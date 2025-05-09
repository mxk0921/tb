package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImageTouchView extends ImageView implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK = 3;
    public Context context;
    private OnImageClickListener imageClickListener;
    public float[] m;
    public GestureDetector mGestureDetector;
    public ScaleGestureDetector mScaleDetector;
    private float mTouchSlop;
    public Matrix matrix;
    public int oldMeasuredHeight;
    public int oldMeasuredWidth;
    public float origHeight;
    public float origWidth;
    public int viewHeight;
    public int viewWidth;
    public final int NONE = 0;
    public final int DOWN = 1;
    public final int DRAG = 2;
    public final int ZOOM = 3;
    public int mode = 0;
    public float minScale = 1.0f;
    public float maxScale = 4.0f;
    public float saveScale = 1.0f;
    private boolean mViewCanMove = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface OnImageClickListener {
        void onLongClick(View view);

        boolean onSingleClick(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(619708579);
        }

        private ScaleListener() {
        }

        public static /* synthetic */ Object ipc$super(ScaleListener scaleListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/ImageTouchView$ScaleListener");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f;
            float f2;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            ImageTouchView imageTouchView = ImageTouchView.this;
            float f3 = imageTouchView.saveScale;
            float f4 = f3 * scaleFactor;
            imageTouchView.saveScale = f4;
            float f5 = imageTouchView.maxScale;
            if (f4 > f5) {
                imageTouchView.saveScale = f5;
            } else {
                f5 = imageTouchView.minScale;
                if (f4 < f5) {
                    imageTouchView.saveScale = f5;
                }
                f = imageTouchView.origWidth;
                f2 = imageTouchView.saveScale;
                i = imageTouchView.viewWidth;
                if (f * f2 > i || imageTouchView.origHeight * f2 <= imageTouchView.viewHeight) {
                    imageTouchView.matrix.postScale(scaleFactor, scaleFactor, i / 2, imageTouchView.viewHeight / 2);
                } else {
                    imageTouchView.matrix.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                }
                ImageTouchView.this.fixTrans();
                return true;
            }
            scaleFactor = f5 / f3;
            f = imageTouchView.origWidth;
            f2 = imageTouchView.saveScale;
            i = imageTouchView.viewWidth;
            if (f * f2 > i) {
            }
            imageTouchView.matrix.postScale(scaleFactor, scaleFactor, i / 2, imageTouchView.viewHeight / 2);
            ImageTouchView.this.fixTrans();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            ImageTouchView.this.mode = 3;
            return true;
        }
    }

    static {
        t2o.a(619708576);
    }

    public ImageTouchView(Context context) {
        super(context);
        sharedConstructing(context);
    }

    public static /* synthetic */ Object ipc$super(ImageTouchView imageTouchView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2010225293) {
            super.setClickable(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/ui/ImageTouchView");
        }
    }

    private void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float min = Math.min(this.viewWidth / intrinsicWidth, this.viewHeight / intrinsicHeight);
            this.matrix.setScale(min, min);
            float f = (this.viewHeight - (intrinsicHeight * min)) / 2.0f;
            float f2 = (this.viewWidth - (min * intrinsicWidth)) / 2.0f;
            this.matrix.postTranslate(f2, f);
            this.origWidth = this.viewWidth - (f2 * 2.0f);
            this.origHeight = this.viewHeight - (f * 2.0f);
            setImageMatrix(this.matrix);
        }
    }

    private void sharedConstructing(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ae5971", new Object[]{this, context});
            return;
        }
        super.setClickable(true);
        this.context = context;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.mGestureDetector = new GestureDetector(context, this);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Matrix matrix = new Matrix();
        this.matrix = matrix;
        this.m = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void fixTrans() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b183e9a", new Object[]{this});
            return;
        }
        this.matrix.getValues(this.m);
        float[] fArr = this.m;
        float f = fArr[2];
        float f2 = fArr[5];
        float fixTrans = getFixTrans(f, this.viewWidth, this.origWidth * this.saveScale);
        float fixTrans2 = getFixTrans(f2, this.viewHeight, this.origHeight * this.saveScale);
        this.mViewCanMove = false;
        if (fixTrans != 0.0f || fixTrans2 != 0.0f) {
            this.mViewCanMove = true;
            this.matrix.postTranslate(fixTrans, fixTrans2);
        }
    }

    public float getFixDragTrans(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0de4074", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    public float getFixTrans(float f, float f2, float f3) {
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b05144a0", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mode = 1;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            return;
        }
        OnImageClickListener onImageClickListener = this.imageClickListener;
        if (onImageClickListener != null) {
            onImageClickListener.onLongClick(this);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.viewWidth = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.viewHeight = size;
        int i3 = this.oldMeasuredHeight;
        int i4 = this.viewWidth;
        if ((i3 != i4 || i3 != size) && i4 != 0 && size != 0) {
            this.oldMeasuredHeight = size;
            this.oldMeasuredWidth = i4;
            if (this.saveScale == 1.0f) {
                resetState();
            }
            fixTrans();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.mode == 1 && motionEvent2.getPointerCount() == 1) {
            this.matrix.postTranslate(getFixDragTrans(-f, this.viewWidth, this.origWidth * this.saveScale), getFixDragTrans(-f2, this.viewHeight, this.origHeight * this.saveScale));
            fixTrans();
        }
        setImageMatrix(this.matrix);
        invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        OnImageClickListener onImageClickListener = this.imageClickListener;
        if (onImageClickListener != null) {
            return onImageClickListener.onSingleClick(this);
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mScaleDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mode = 1;
        } else if (action == 1) {
            this.mode = 0;
        } else if (action == 5) {
            this.mode = 3;
        }
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    public boolean pagerCanScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c749c5", new Object[]{this})).booleanValue();
        }
        if (this.saveScale == this.minScale) {
            return true;
        }
        return false;
    }

    public void resetScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a356442", new Object[]{this});
            return;
        }
        resetState();
        this.mViewCanMove = false;
        this.saveScale = 1.0f;
        invalidate();
    }

    public void setImageClickListener(OnImageClickListener onImageClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62568f96", new Object[]{this, onImageClickListener});
        } else {
            this.imageClickListener = onImageClickListener;
        }
    }

    public void setMaxZoom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21494a4", new Object[]{this, new Float(f)});
        } else {
            this.maxScale = f;
        }
    }

    public boolean viewCanMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f70547e7", new Object[]{this})).booleanValue();
        }
        return this.mViewCanMove;
    }

    public ImageTouchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sharedConstructing(context);
    }
}
