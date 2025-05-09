package com.taobao.taolive.uikit.favor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.AsyncTask;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;
import tb.dcc;
import tb.kyw;
import tb.m92;
import tb.o29;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FavorLayout extends View implements dcc, o29 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ADD_FAVOR = 321;
    private static final int FAVOR_DURATION = 3000;
    private static final int MAX_COUNT = 50;
    private static final int SHOW_FAKE_FAVOR = 123;
    private Interpolator acc;
    private Interpolator accdec;
    private Interpolator dce;
    private Interpolator[] interpolators;
    private Interpolator line;
    private int mCurrentIndex;
    private ArrayList<Drawable> mDefaultDrawables;
    private int mDrawableBottom;
    private int mDrawableHeight;
    private int mDrawableLeft;
    private int mDrawableRight;
    private int mDrawableTop;
    private int mDrawableWidth;
    private ArrayList<Drawable> mDrawables;
    private int mFavorDuration;
    private ArrayList<FavorObject> mFavorObjects;
    private kyw mHandler;
    private boolean mHasExecute;
    private int mHeight;
    private boolean mPaused;
    private double mScaleFactor;
    private int mWidth;
    private Random random;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AnimEndListener extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<FavorLayout> mFavorLayout;
        private FavorObject target;

        static {
            t2o.a(779093587);
        }

        public AnimEndListener(FavorLayout favorLayout, FavorObject favorObject) {
            this.mFavorLayout = new WeakReference<>(favorLayout);
            this.target = favorObject;
        }

        public static /* synthetic */ Object ipc$super(AnimEndListener animEndListener, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/favor/FavorLayout$AnimEndListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            FavorLayout favorLayout = this.mFavorLayout.get();
            if (favorLayout != null) {
                favorLayout.removeFavor(this.target);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BezierListener implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<FavorLayout> mWeakRef;
        private FavorObject target;

        static {
            t2o.a(779093588);
        }

        public BezierListener(FavorObject favorObject, FavorLayout favorLayout) {
            this.target = favorObject;
            this.mWeakRef = new WeakReference<>(favorLayout);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            if (valueAnimator != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                if (pointF != null) {
                    this.target.setX(pointF.x);
                    this.target.setY(pointF.y);
                }
                this.target.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            FavorLayout favorLayout = this.mWeakRef.get();
            if (favorLayout != null) {
                favorLayout.invalidate();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class CreateDrawableAsyncTask extends AsyncTask<Object, Object, ArrayList<Drawable>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<Context> mWeakContext;

        static {
            t2o.a(779093589);
        }

        public CreateDrawableAsyncTask(Context context) {
            this.mWeakContext = new WeakReference<>(context);
        }

        public static /* synthetic */ Object ipc$super(CreateDrawableAsyncTask createDrawableAsyncTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/favor/FavorLayout$CreateDrawableAsyncTask");
        }

        @Override // android.os.AsyncTask
        public ArrayList<Drawable> doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("48bbe306", new Object[]{this, objArr});
            }
            WeakReference<Context> weakReference = this.mWeakContext;
            if (weakReference == null || weakReference.get() == null) {
                return new ArrayList<>();
            }
            return FavorLayout.access$000(this.mWeakContext.get());
        }

        public void onPostExecute(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb2ec0ed", new Object[]{this, arrayList});
                return;
            }
            FavorLayout.access$102(FavorLayout.this, arrayList);
            FavorLayout.access$200(FavorLayout.this).clear();
            FavorLayout.access$200(FavorLayout.this).addAll(FavorLayout.access$100(FavorLayout.this));
            FavorLayout favorLayout = FavorLayout.this;
            FavorLayout.access$302(favorLayout, ((Drawable) FavorLayout.access$200(favorLayout).get(0)).getIntrinsicHeight());
            FavorLayout favorLayout2 = FavorLayout.this;
            FavorLayout.access$402(favorLayout2, ((Drawable) FavorLayout.access$200(favorLayout2).get(0)).getIntrinsicWidth());
            FavorLayout.access$502(FavorLayout.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class FavorObject implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float alpha;
        private Drawable drawable;
        private float scaleX;
        private float scaleY;
        private float x;
        private float y;

        static {
            t2o.a(779093590);
        }

        public static /* synthetic */ float access$602(FavorObject favorObject, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1daee211", new Object[]{favorObject, new Float(f)})).floatValue();
            }
            favorObject.scaleX = f;
            return f;
        }

        public static /* synthetic */ float access$702(FavorObject favorObject, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c0fe5f0", new Object[]{favorObject, new Float(f)})).floatValue();
            }
            favorObject.scaleY = f;
            return f;
        }

        public float getAlpha() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
            }
            return this.alpha;
        }

        public Drawable getDrawable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
            }
            return this.drawable;
        }

        public float getScaleX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
            }
            return this.scaleX;
        }

        public float getScaleY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
            }
            return this.scaleY;
        }

        public float getX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
            }
            return this.x;
        }

        public float getY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
            }
            return this.y;
        }

        public void setAlpha(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
            } else {
                this.alpha = f;
            }
        }

        public void setDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17dcaf4b", new Object[]{this, drawable});
            } else {
                this.drawable = drawable;
            }
        }

        public void setScaleX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            } else {
                this.scaleX = f;
            }
        }

        public void setScaleY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            } else {
                this.scaleY = f;
            }
        }

        public void setX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27ad55a3", new Object[]{this, new Float(f)});
            } else {
                this.x = f;
            }
        }

        public void setY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29622e42", new Object[]{this, new Float(f)});
            } else {
                this.y = f;
            }
        }
    }

    static {
        t2o.a(779093586);
        t2o.a(806356530);
        t2o.a(779093591);
    }

    public FavorLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ ArrayList access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d4c1e98b", new Object[]{context});
        }
        return createDefaultDrawables(context);
    }

    public static /* synthetic */ ArrayList access$100(FavorLayout favorLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e9c2b10b", new Object[]{favorLayout});
        }
        return favorLayout.mDefaultDrawables;
    }

    public static /* synthetic */ ArrayList access$102(FavorLayout favorLayout, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d738c631", new Object[]{favorLayout, arrayList});
        }
        favorLayout.mDefaultDrawables = arrayList;
        return arrayList;
    }

    public static /* synthetic */ ArrayList access$200(FavorLayout favorLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ccee644c", new Object[]{favorLayout});
        }
        return favorLayout.mDrawables;
    }

    public static /* synthetic */ int access$302(FavorLayout favorLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41035a61", new Object[]{favorLayout, new Integer(i)})).intValue();
        }
        favorLayout.mDrawableWidth = i;
        return i;
    }

    public static /* synthetic */ int access$402(FavorLayout favorLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6edbf4c0", new Object[]{favorLayout, new Integer(i)})).intValue();
        }
        favorLayout.mDrawableHeight = i;
        return i;
    }

    public static /* synthetic */ boolean access$502(FavorLayout favorLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cb4cf01", new Object[]{favorLayout, new Boolean(z)})).booleanValue();
        }
        favorLayout.mHasExecute = z;
        return z;
    }

    private static ArrayList<Drawable> createDefaultDrawables(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca5cb10b", new Object[]{context});
        }
        ArrayList<Drawable> arrayList = new ArrayList<>();
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_1));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_2));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_3));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_4));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_5));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_6));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_7));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_8));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_9));
        arrayList.add(ContextCompat.getDrawable(context, R.drawable.tbliveuikit_f_10));
        return arrayList;
    }

    private LayerDrawable createLayerDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayerDrawable) ipChange.ipc$dispatch("97f3116d", new Object[]{this, drawable});
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicHeight(drawable.getIntrinsicHeight());
        shapeDrawable.setIntrinsicWidth(drawable.getIntrinsicWidth());
        shapeDrawable.getPaint().setColor(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        layerDrawable.setLayerInset(1, 8, 8, 8, 8);
        return layerDrawable;
    }

    private Animator getAnimator(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("7cf98a8f", new Object[]{this, favorObject});
        }
        int i = this.mWidth / 2;
        AnimatorSet enterAnimtor = getEnterAnimtor(favorObject, i);
        ValueAnimator bezierValueAnimator = getBezierValueAnimator(favorObject, i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(enterAnimtor, bezierValueAnimator);
        animatorSet.setInterpolator(this.accdec);
        animatorSet.setTarget(favorObject);
        return animatorSet;
    }

    private ValueAnimator getBezierValueAnimator(FavorObject favorObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("fea5747d", new Object[]{this, favorObject, new Integer(i)});
        }
        float f = i;
        ValueAnimator ofObject = ValueAnimator.ofObject(new m92(getBreakPointF(2, 3)), new PointF(f, this.mHeight - 10), new PointF(f, 0.0f));
        ofObject.addUpdateListener(new BezierListener(favorObject, this));
        ofObject.setTarget(favorObject);
        ofObject.setDuration(this.mFavorDuration);
        return ofObject;
    }

    private PointF getBreakPointF(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("89a46b7d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Random random = new Random();
        PointF pointF = new PointF();
        int measuredWidth = ((getMeasuredWidth() - getPaddingRight()) + getPaddingLeft()) / i;
        if (measuredWidth <= 0) {
            measuredWidth = 1;
        }
        pointF.x = random.nextInt(measuredWidth) + (getMeasuredWidth() / i2);
        int measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) + getPaddingTop()) / i;
        if (measuredHeight > 0) {
            i3 = measuredHeight;
        }
        pointF.y = random.nextInt(i3) + (getMeasuredHeight() / i2);
        return pointF;
    }

    private PointF getPointF(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("b6bb90a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        PointF pointF = new PointF();
        pointF.x = i;
        pointF.y = i2;
        return pointF;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mDrawables = new ArrayList<>();
        this.mDefaultDrawables = new ArrayList<>();
        setDefaultDrawables();
        this.interpolators = r2;
        Interpolator[] interpolatorArr = {this.line, this.acc, this.dce, this.accdec};
        this.mFavorObjects = new ArrayList<>();
    }

    public static /* synthetic */ Object ipc$super(FavorLayout favorLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/favor/FavorLayout");
        }
    }

    public void addFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b257730", new Object[]{this, new Boolean(z)});
        } else if (this.mFavorObjects.size() < 50) {
            if (this.mCurrentIndex >= this.mDrawables.size()) {
                this.mCurrentIndex = 0;
            }
            int i = this.mCurrentIndex;
            if (i >= 0 && i < this.mDrawables.size()) {
                FavorObject favorObject = new FavorObject();
                if (z) {
                    favorObject.setDrawable(createLayerDrawable(this.mDrawables.get(this.mCurrentIndex)));
                    FavorObject.access$602(favorObject, 1.2f);
                    FavorObject.access$702(favorObject, 1.2f);
                } else {
                    favorObject.setDrawable(this.mDrawables.get(this.mCurrentIndex));
                }
                this.mCurrentIndex++;
                this.mFavorObjects.add(favorObject);
                Animator animator = getAnimator(favorObject);
                animator.addListener(new AnimEndListener(this, favorObject));
                animator.start();
                invalidate();
            }
        }
    }

    public void clearFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416ba3f8", new Object[]{this});
            return;
        }
        kyw kywVar = this.mHandler;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // tb.o29
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        stopFakeFavor();
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public ArrayList<Drawable> getDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1147f6c0", new Object[]{this});
        }
        return this.mDrawables;
    }

    @Override // tb.dcc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i != 123) {
            if (i == ADD_FAVOR) {
                addFavor(false);
            }
        } else if (message.obj.equals(this.mHandler.toString())) {
            addFavor(2);
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 123;
            obtainMessage.obj = this.mHandler.toString();
            this.mHandler.sendMessageDelayed(obtainMessage, 700L);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i = 0; i < this.mFavorObjects.size(); i++) {
                this.mDrawableLeft = (int) (this.mFavorObjects.get(i).getX() - (((this.mDrawableWidth * this.mFavorObjects.get(i).getScaleX()) * this.mScaleFactor) / 2.0d));
                this.mDrawableTop = (int) (this.mFavorObjects.get(i).getY() - (((this.mDrawableHeight * this.mFavorObjects.get(i).getScaleY()) * this.mScaleFactor) / 2.0d));
                this.mDrawableRight = (int) (this.mFavorObjects.get(i).getX() + (((this.mDrawableWidth * this.mFavorObjects.get(i).getScaleX()) * this.mScaleFactor) / 2.0d));
                this.mDrawableBottom = (int) (this.mFavorObjects.get(i).getY() + (((this.mDrawableHeight * this.mFavorObjects.get(i).getScaleY()) * this.mScaleFactor) / 2.0d));
                this.mFavorObjects.get(i).getDrawable().setAlpha((int) (this.mFavorObjects.get(i).getAlpha() * 255.0f));
                this.mFavorObjects.get(i).getDrawable().setBounds(this.mDrawableLeft, this.mDrawableTop, this.mDrawableRight, this.mDrawableBottom);
                canvas.save();
                canvas.clipRect(this.mDrawableLeft, this.mDrawableTop, this.mDrawableRight, this.mDrawableBottom);
                this.mFavorObjects.get(i).getDrawable().draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mPaused = true;
        }
    }

    public void removeFavor(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95033d21", new Object[]{this, favorObject});
            return;
        }
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null) {
            arrayList.remove(favorObject);
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.mPaused = false;
        }
    }

    public void setDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9817c5d", new Object[]{this});
        } else if (this.mDefaultDrawables.size() > 0) {
            this.mDrawables.clear();
            this.mDrawables.addAll(this.mDefaultDrawables);
            this.mDrawableWidth = this.mDrawables.get(0).getIntrinsicHeight();
            this.mDrawableHeight = this.mDrawables.get(0).getIntrinsicWidth();
        } else if (!this.mHasExecute) {
            this.mHasExecute = true;
            new CreateDrawableAsyncTask(getContext()).execute(new Object[0]);
        }
    }

    @Override // tb.o29
    public void setDrawables(ArrayList<Drawable> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cafcd90", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.mDrawables = arrayList;
        }
    }

    @Override // tb.o29
    public void setFavorDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4653f8ac", new Object[]{this, new Integer(i)});
        } else {
            this.mFavorDuration = i;
        }
    }

    @Override // tb.o29
    public void setScaleFactor(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb580", new Object[]{this, new Double(d)});
        } else {
            this.mScaleFactor = d;
        }
    }

    @Override // tb.o29
    public void startFakeFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9c46ae", new Object[]{this});
            return;
        }
        if (this.mHandler == null) {
            this.mHandler = new kyw(this);
        }
        this.mHandler.removeCallbacksAndMessages(null);
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = 123;
        obtainMessage.obj = this.mHandler.toString();
        this.mHandler.sendMessage(obtainMessage);
    }

    @Override // tb.o29
    public void stopFakeFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533e70e", new Object[]{this});
            return;
        }
        kyw kywVar = this.mHandler;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        invalidate();
    }

    public FavorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FavorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.random = new Random();
        this.mDrawableHeight = 60;
        this.mDrawableWidth = 60;
        this.line = new LinearInterpolator();
        this.acc = new AccelerateInterpolator();
        this.dce = new DecelerateInterpolator();
        this.accdec = new AccelerateDecelerateInterpolator();
        this.mCurrentIndex = 0;
        this.mFavorDuration = 3000;
        this.mScaleFactor = 1.0d;
        this.mHandler = null;
        this.mPaused = false;
        this.mHasExecute = false;
        init();
    }

    private AnimatorSet getEnterAnimtor(FavorObject favorObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("5cd4c3b9", new Object[]{this, favorObject, new Integer(i)});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(favorObject, "alpha", 0.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(favorObject, "scaleX", 0.2f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(favorObject, "scaleY", 0.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setTarget(favorObject);
        return animatorSet;
    }

    public void addFavor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25375f", new Object[]{this, new Integer(i)});
        } else if (!this.mPaused && i > 0) {
            if (this.mHandler == null) {
                this.mHandler = new kyw(this);
            }
            int i2 = this.mFavorDuration / i;
            for (int i3 = 0; i3 < i; i3++) {
                this.mHandler.sendEmptyMessageDelayed(ADD_FAVOR, i3 * i2);
            }
        }
    }
}
