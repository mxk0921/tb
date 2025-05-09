package com.taobao.infoflow.ad.impl.dx.view.flip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.ad.impl.dx.view.flip.CropImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlipView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator animator;
    private ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
    private Camera camera;
    private CropImageView contentView;
    private long duration;
    private AnimatorListenerAdapter endListener;
    private c listener;
    private Matrix matrix;
    private float rotateDegree;
    private TYPE type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum TYPE {
        TOP,
        BOTTOM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TYPE type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/FlipView$TYPE");
        }

        public static TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TYPE) ipChange.ipc$dispatch("82fbeef0", new Object[]{str});
            }
            return (TYPE) Enum.valueOf(TYPE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            FlipView.access$002(FlipView.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            FlipView.this.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/FlipView$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (FlipView.access$100(FlipView.this) != null) {
                FlipView.access$100(FlipView.this).a(FlipView.access$200(FlipView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(TYPE type);
    }

    public FlipView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ float access$002(FlipView flipView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31fdb9aa", new Object[]{flipView, new Float(f)})).floatValue();
        }
        flipView.rotateDegree = f;
        return f;
    }

    public static /* synthetic */ c access$100(FlipView flipView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1b08ebe8", new Object[]{flipView});
        }
        return flipView.listener;
    }

    public static /* synthetic */ TYPE access$200(FlipView flipView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TYPE) ipChange.ipc$dispatch("f4494c3", new Object[]{flipView});
        }
        return flipView.type;
    }

    public static /* synthetic */ Object ipc$super(FlipView flipView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/FlipView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int width = getWidth();
        int height = getHeight();
        long drawingTime = getDrawingTime();
        this.camera.save();
        this.camera.rotateX(this.rotateDegree);
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        if (this.type == TYPE.TOP) {
            this.matrix.postTranslate(width / 2.0f, height);
            this.matrix.preTranslate((-width) / 2.0f, -height);
        } else {
            this.matrix.postTranslate(width / 2.0f, 0.0f);
            this.matrix.preTranslate((-width) / 2.0f, 0.0f);
        }
        canvas.save();
        canvas.concat(this.matrix);
        drawChild(canvas, this.contentView, drawingTime);
        canvas.restore();
        Log.e("FlipView", "dispatchDraw: " + this.rotateDegree);
    }

    public CropImageView getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CropImageView) ipChange.ipc$dispatch("cf6b3a56", new Object[]{this});
        }
        return this.contentView;
    }

    public void init(TYPE type, CropImageView cropImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6151df9", new Object[]{this, type, cropImageView});
            return;
        }
        this.contentView = cropImageView;
        this.type = type;
        if (cropImageView.getParent() != null) {
            ((FrameLayout) cropImageView.getParent()).removeView(cropImageView);
        }
        addView(cropImageView, new FrameLayout.LayoutParams(-1, -1));
        if (type == TYPE.TOP) {
            cropImageView.setCropType(CropImageView.CropType.TOP);
            this.rotateDegree = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.animator = ofFloat;
            ofFloat.setInterpolator(new AccelerateInterpolator());
            this.animator.setStartDelay(1000L);
        } else {
            cropImageView.setCropType(CropImageView.CropType.BOTTOM);
            this.rotateDegree = 90.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(90.0f, 0.0f);
            this.animator = ofFloat2;
            ofFloat2.setInterpolator(new DecelerateInterpolator());
        }
        this.animator.setDuration(this.duration);
        this.animator.addUpdateListener(this.animatorUpdateListener);
        this.animator.addListener(this.endListener);
    }

    public boolean isFlipping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5a32b4", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        if (this.type == TYPE.TOP) {
            this.rotateDegree = 0.0f;
        } else {
            this.rotateDegree = 90.0f;
        }
        invalidate();
    }

    public void setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
        } else {
            this.duration = j;
        }
    }

    public void setListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5b1cd6", new Object[]{this, cVar});
        } else {
            this.listener = cVar;
        }
    }

    public void start(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
            return;
        }
        this.animator.setStartDelay(j);
        this.animator.start();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.animator.cancel();
        }
    }

    public FlipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.type = TYPE.TOP;
        this.rotateDegree = 0.0f;
        this.duration = 400L;
        this.animatorUpdateListener = new a();
        this.endListener = new b();
        this.camera = new Camera();
        this.matrix = new Matrix();
    }
}
