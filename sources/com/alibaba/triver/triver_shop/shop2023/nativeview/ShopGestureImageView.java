package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopGestureImageView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GestureDetector gestureDetector;
    private boolean isEnlarge;
    private ValueAnimator mAnimator;
    private int mCurrentX;
    private int mCurrentY;
    private float mInitScale;
    private boolean mIsOneLoad;
    private float mMaxScale;
    private float mMidScale;
    private ScaleGestureDetector mScaleGestureDetector;
    private Matrix mScaleMatrix;
    private View.OnClickListener onClickListener;
    private OverScroller scroller;
    private ValueAnimator translationAnimation;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopGestureImageView$1");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            ShopGestureImageView.this.scale(scaleGestureDetector);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
            } else {
                ShopGestureImageView.this.scaleEnd(scaleGestureDetector);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (ShopGestureImageView.access$500(ShopGestureImageView.this).computeScrollOffset()) {
                    int currX = ShopGestureImageView.access$500(ShopGestureImageView.this).getCurrX();
                    int access$200 = currX - ShopGestureImageView.access$200(ShopGestureImageView.this);
                    ShopGestureImageView.access$202(ShopGestureImageView.this, currX);
                    int currY = ShopGestureImageView.access$500(ShopGestureImageView.this).getCurrY();
                    int access$300 = currY - ShopGestureImageView.access$300(ShopGestureImageView.this);
                    ShopGestureImageView.access$302(ShopGestureImageView.this, currY);
                    if (access$200 != 0 && access$300 != 0) {
                        ShopGestureImageView.access$000(ShopGestureImageView.this, access$200, access$300);
                    }
                }
            }
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -223117518) {
                return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopGestureImageView$2");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            ShopGestureImageView.access$100(ShopGestureImageView.this, motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            ShopGestureImageView.access$202(ShopGestureImageView.this, (int) motionEvent2.getX());
            ShopGestureImageView.access$302(ShopGestureImageView.this, (int) motionEvent2.getY());
            RectF access$400 = ShopGestureImageView.access$400(ShopGestureImageView.this);
            if (access$400 == null) {
                return false;
            }
            int access$200 = ShopGestureImageView.access$200(ShopGestureImageView.this);
            int access$300 = ShopGestureImageView.access$300(ShopGestureImageView.this);
            int round = Math.round(f);
            int round2 = Math.round(f2);
            int round3 = Math.round(access$400.width());
            int round4 = Math.round(access$400.height());
            if (!(access$200 == round3 && access$300 == round4)) {
                ShopGestureImageView.access$500(ShopGestureImageView.this).fling(access$200, access$300, round, round2, 0, round3, 0, round4, round3, round4);
            }
            if (ShopGestureImageView.access$600(ShopGestureImageView.this) != null && ShopGestureImageView.access$600(ShopGestureImageView.this).isStarted()) {
                ShopGestureImageView.access$600(ShopGestureImageView.this).end();
            }
            ShopGestureImageView.access$602(ShopGestureImageView.this, ValueAnimator.ofFloat(0.0f, 1.0f));
            ShopGestureImageView.access$600(ShopGestureImageView.this).setDuration(500L);
            ShopGestureImageView.access$600(ShopGestureImageView.this).addUpdateListener(new a());
            ShopGestureImageView.access$600(ShopGestureImageView.this).start();
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            ShopGestureImageView.access$000(ShopGestureImageView.this, -f, -f2);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (ShopGestureImageView.access$700(ShopGestureImageView.this) != null) {
                ShopGestureImageView.access$700(ShopGestureImageView.this).onClick(ShopGestureImageView.this);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f3344a;
        public final /* synthetic */ float b;

        public c(float f, float f2) {
            this.f3344a = f;
            this.b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() / ShopGestureImageView.access$800(ShopGestureImageView.this);
            ShopGestureImageView.access$900(ShopGestureImageView.this).postScale(floatValue, floatValue, this.f3344a, this.b);
            ShopGestureImageView shopGestureImageView = ShopGestureImageView.this;
            shopGestureImageView.setImageMatrix(ShopGestureImageView.access$900(shopGestureImageView));
            ShopGestureImageView.access$1000(ShopGestureImageView.this);
        }
    }

    static {
        t2o.a(766510397);
    }

    public ShopGestureImageView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(ShopGestureImageView shopGestureImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9b3a1c", new Object[]{shopGestureImageView, new Float(f), new Float(f2)});
        } else {
            shopGestureImageView.onTranslationImage(f, f2);
        }
    }

    public static /* synthetic */ void access$100(ShopGestureImageView shopGestureImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4ca43b", new Object[]{shopGestureImageView, new Float(f), new Float(f2)});
        } else {
            shopGestureImageView.onDoubledrawScale(f, f2);
        }
    }

    public static /* synthetic */ void access$1000(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb88cd", new Object[]{shopGestureImageView});
        } else {
            shopGestureImageView.removeBorderAndTranslationCenter();
        }
    }

    public static /* synthetic */ int access$200(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1516e4cd", new Object[]{shopGestureImageView})).intValue();
        }
        return shopGestureImageView.mCurrentX;
    }

    public static /* synthetic */ int access$202(ShopGestureImageView shopGestureImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c17edde", new Object[]{shopGestureImageView, new Integer(i)})).intValue();
        }
        shopGestureImageView.mCurrentX = i;
        return i;
    }

    public static /* synthetic */ int access$300(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f30a4aac", new Object[]{shopGestureImageView})).intValue();
        }
        return shopGestureImageView.mCurrentY;
    }

    public static /* synthetic */ int access$302(ShopGestureImageView shopGestureImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c9143df", new Object[]{shopGestureImageView, new Integer(i)})).intValue();
        }
        shopGestureImageView.mCurrentY = i;
        return i;
    }

    public static /* synthetic */ RectF access$400(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("63647dcf", new Object[]{shopGestureImageView});
        }
        return shopGestureImageView.getMatrixRectF();
    }

    public static /* synthetic */ OverScroller access$500(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OverScroller) ipChange.ipc$dispatch("f59a54af", new Object[]{shopGestureImageView});
        }
        return shopGestureImageView.scroller;
    }

    public static /* synthetic */ ValueAnimator access$600(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("8b8a0dba", new Object[]{shopGestureImageView});
        }
        return shopGestureImageView.translationAnimation;
    }

    public static /* synthetic */ ValueAnimator access$602(ShopGestureImageView shopGestureImageView, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("5f138484", new Object[]{shopGestureImageView, valueAnimator});
        }
        shopGestureImageView.translationAnimation = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ View.OnClickListener access$700(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("e881c85e", new Object[]{shopGestureImageView});
        }
        return shopGestureImageView.onClickListener;
    }

    public static /* synthetic */ float access$800(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48cb4804", new Object[]{shopGestureImageView})).floatValue();
        }
        return shopGestureImageView.getScale();
    }

    public static /* synthetic */ Matrix access$900(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("c9cd3f7f", new Object[]{shopGestureImageView});
        }
        return shopGestureImageView.mScaleMatrix;
    }

    private float getDoubledrawScale() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf105476", new Object[]{this})).floatValue();
        }
        float scale = getScale();
        if (Math.abs(this.mInitScale - scale) < 0.05f) {
            scale = this.mInitScale;
        }
        if (Math.abs(this.mMidScale - scale) < 0.05f) {
            scale = this.mMidScale;
        }
        if (Math.abs(this.mMaxScale - scale) < 0.05f) {
            scale = this.mMaxScale;
        }
        float f = this.mMidScale;
        if (scale != f) {
            if (scale < f) {
                z = true;
            }
            this.isEnlarge = z;
            return f;
        } else if (this.isEnlarge) {
            return this.mMaxScale;
        } else {
            return this.mInitScale;
        }
    }

    private RectF getMatrixRectF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b4852fb5", new Object[]{this});
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        getImageMatrix().mapRect(rectF);
        return rectF;
    }

    private float getScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        float[] fArr = new float[9];
        this.mScaleMatrix.getValues(fArr);
        return fArr[0];
    }

    public static /* synthetic */ Object ipc$super(ShopGestureImageView shopGestureImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopGestureImageView");
        }
    }

    private void onDoubledrawScale(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9687641d", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            scaleAnimation(getDoubledrawScale(), f, f2);
        }
    }

    private void onTranslationImage(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2fb530", new Object[]{this, new Float(f), new Float(f2)});
        } else if (getDrawable() != null) {
            RectF matrixRectF = getMatrixRectF();
            if (matrixRectF.width() <= getWidth()) {
                f = 0.0f;
            }
            if (matrixRectF.height() <= getHeight()) {
                f2 = 0.0f;
            }
            if (f != 0.0f || f2 != 0.0f) {
                this.mScaleMatrix.postTranslate(f, f2);
                setImageMatrix(this.mScaleMatrix);
                removeBorderAndTranslationCenter();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void removeBorderAndTranslationCenter() {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "4f0d046"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            android.graphics.RectF r0 = r12.getMatrixRectF()
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            int r1 = r12.getWidth()
            int r2 = r12.getHeight()
            float r3 = r0.width()
            float r4 = r0.height()
            float r5 = r0.left
            float r6 = r0.right
            float r7 = r0.top
            float r0 = r0.bottom
            r8 = 0
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x004a
            float r1 = (float) r1
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0041
            float r1 = -r5
            goto L_0x0056
        L_0x0041:
            float r1 = r1 * r10
            float r1 = r1 / r9
            float r3 = r3 * r10
            float r3 = r3 / r9
            float r3 = r3 + r5
            float r1 = r1 - r3
            goto L_0x0056
        L_0x004a:
            float r1 = (float) r1
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x0055
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x0041
            float r1 = r1 - r6
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x006b
            float r0 = (float) r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0061
            float r8 = -r7
            goto L_0x0080
        L_0x0061:
            float r0 = r0 * r10
            float r0 = r0 / r9
            float r4 = r4 * r10
            float r4 = r4 / r9
            float r7 = r7 + r4
            float r8 = r0 - r7
            goto L_0x0080
        L_0x006b:
            float r2 = (float) r2
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0080
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0077
            float r8 = r2 - r0
            goto L_0x0080
        L_0x0077:
            float r2 = r2 * r10
            float r2 = r2 / r9
            float r4 = r4 * r10
            float r4 = r4 / r9
            float r7 = r7 + r4
            float r8 = r2 - r7
        L_0x0080:
            android.graphics.Matrix r0 = r12.mScaleMatrix
            r0.postTranslate(r1, r8)
            android.graphics.Matrix r0 = r12.mScaleMatrix
            r12.setImageMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.removeBorderAndTranslationCenter():void");
    }

    private void scaleAnimation(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4896eb3f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScale(), f);
            this.mAnimator = ofFloat;
            ofFloat.setDuration(300L);
            this.mAnimator.setInterpolator(new AccelerateInterpolator());
            this.mAnimator.addUpdateListener(new c(f2, f3));
            this.mAnimator.start();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null || matrixRectF.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (matrixRectF.right >= getWidth() + 1) {
                return true;
            }
            return false;
        } else if (matrixRectF.left <= -1.0f) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null || matrixRectF.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (matrixRectF.bottom >= getHeight() + 1) {
                return true;
            }
            return false;
        } else if (matrixRectF.top <= -1.0f) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else if (this.mIsOneLoad) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= width || intrinsicHeight > height) {
                    f = 1.0f;
                } else {
                    f = (width * 1.0f) / intrinsicWidth;
                }
                if (intrinsicWidth <= width && intrinsicHeight > height) {
                    f = (height * 1.0f) / intrinsicHeight;
                }
                if ((intrinsicWidth <= width && intrinsicHeight <= height) || (intrinsicWidth >= width && intrinsicHeight >= height)) {
                    f = Math.min((width * 1.0f) / intrinsicWidth, (height * 1.0f) / intrinsicHeight);
                }
                this.mInitScale = f;
                this.mMidScale = f * 2.0f;
                this.mMaxScale = f * 4.0f;
                float f2 = (width * 1.0f) / 2.0f;
                float f3 = (height * 1.0f) / 2.0f;
                this.mScaleMatrix.postTranslate(f2 - (intrinsicWidth / 2), f3 - (intrinsicHeight / 2));
                Matrix matrix = this.mScaleMatrix;
                float f4 = this.mInitScale;
                matrix.postScale(f4, f4, f2, f3);
                setImageMatrix(this.mScaleMatrix);
                this.mIsOneLoad = false;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.gestureDetector.onTouchEvent(motionEvent) | this.mScaleGestureDetector.onTouchEvent(motionEvent);
    }

    public void scale(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a48581", new Object[]{this, scaleGestureDetector});
        } else if (getDrawable() != null) {
            getScale();
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            this.mScaleMatrix.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            setImageMatrix(this.mScaleMatrix);
            removeBorderAndTranslationCenter();
        }
    }

    public void scaleEnd(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c5bdba", new Object[]{this, scaleGestureDetector});
            return;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() * getScale();
        float f = this.mInitScale;
        if (scaleFactor < f) {
            scaleAnimation(f, getWidth() / 2, getHeight() / 2);
            return;
        }
        float f2 = this.mMaxScale;
        if (scaleFactor > f2) {
            scaleAnimation(f2, getWidth() / 2, getHeight() / 2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.onClickListener = onClickListener;
        }
    }

    public ShopGestureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShopGestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsOneLoad = true;
        this.isEnlarge = false;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.scroller = new OverScroller(context);
        this.mScaleMatrix = new Matrix();
        this.mScaleGestureDetector = new ScaleGestureDetector(context, new a());
        this.gestureDetector = new GestureDetector(context, new b());
    }
}
