package com.taobao.taolive.uikit.favor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.AsyncTask;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.favor.a;
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
public class NewFavorLayout extends TextureView implements dcc, TextureView.SurfaceTextureListener, a.AbstractC0762a, o29 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ADD_FAVOR = 321;
    private static final int FAVOR_DURATION = 3000;
    private static final int MAX_COUNT = 50;
    private static final int SHOW_FAKE_FAVOR = 123;
    private static boolean mHasExecute = false;
    private static ArrayList<Drawable> s_defaultDrawables = new ArrayList<>();
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
    private int mHeight;
    private boolean mPaused;
    private double mScaleFactor;
    private boolean mTextureAvailable;
    private int mWidth;
    private Random random;

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
            t2o.a(779093602);
        }

        public static /* synthetic */ float access$300(FavorObject favorObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1b31dca4", new Object[]{favorObject})).floatValue();
            }
            return favorObject.alpha;
        }

        public static /* synthetic */ float access$302(FavorObject favorObject, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e689117e", new Object[]{favorObject, new Float(f)})).floatValue();
            }
            favorObject.alpha = f;
            return f;
        }

        public static /* synthetic */ float access$502(FavorObject favorObject, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e0c0900", new Object[]{favorObject, new Float(f)})).floatValue();
            }
            favorObject.scaleX = f;
            return f;
        }

        public static /* synthetic */ float access$602(FavorObject favorObject, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("79cd84c1", new Object[]{favorObject, new Float(f)})).floatValue();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5aa85a4b", new Object[]{this, arrayList});
                return;
            }
            NewFavorLayout.access$002(NewFavorLayout.this, arrayList);
            NewFavorLayout.access$100(NewFavorLayout.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NewFavorLayout.access$002(NewFavorLayout.this, NewFavorLayout.access$200());
            NewFavorLayout.access$100(NewFavorLayout.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FavorObject f13340a;

        static {
            t2o.a(779093598);
        }

        public c(NewFavorLayout newFavorLayout, FavorObject favorObject) {
            new WeakReference(newFavorLayout);
            this.f13340a = favorObject;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/favor/NewFavorLayout$AnimEndListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            FavorObject.access$302(this.f13340a, 0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private FavorObject f13341a;
        private WeakReference<NewFavorLayout> b;

        static {
            t2o.a(779093599);
        }

        public d(FavorObject favorObject, NewFavorLayout newFavorLayout) {
            this.f13341a = favorObject;
            this.b = new WeakReference<>(newFavorLayout);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            PointF pointF = (PointF) valueAnimator.getAnimatedValue();
            this.f13341a.setX(pointF.x);
            this.f13341a.setY(pointF.y);
            this.f13341a.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e extends AsyncTask<Object, Object, ArrayList<Drawable>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f13342a;
        public final a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public interface a {
        }

        static {
            t2o.a(779093600);
        }

        public e(Context context, a aVar) {
            this.f13342a = new WeakReference<>(context);
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/favor/NewFavorLayout$CreateDrawableAsyncTask");
        }

        /* renamed from: a */
        public ArrayList<Drawable> doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("48bbe306", new Object[]{this, objArr});
            }
            WeakReference<Context> weakReference = this.f13342a;
            if (weakReference == null || weakReference.get() == null) {
                return new ArrayList<>();
            }
            return NewFavorLayout.access$400(this.f13342a.get());
        }

        /* renamed from: b */
        public void onPostExecute(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb2ec0ed", new Object[]{this, arrayList});
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                ((a) aVar).a(arrayList);
            }
        }
    }

    static {
        t2o.a(779093595);
        t2o.a(806356530);
        t2o.a(779093593);
        t2o.a(779093591);
    }

    public NewFavorLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ ArrayList access$002(NewFavorLayout newFavorLayout, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f9f8cc36", new Object[]{newFavorLayout, arrayList});
        }
        newFavorLayout.mDefaultDrawables = arrayList;
        return arrayList;
    }

    public static /* synthetic */ void access$100(NewFavorLayout newFavorLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6269ef", new Object[]{newFavorLayout});
        } else {
            newFavorLayout.completeLoad();
        }
    }

    public static /* synthetic */ ArrayList access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6033ab53", new Object[0]);
        }
        return s_defaultDrawables;
    }

    public static /* synthetic */ ArrayList access$400(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8c245307", new Object[]{context});
        }
        return createDefaultDrawables(context);
    }

    private void completeLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558ab2c6", new Object[]{this});
            return;
        }
        this.mDrawables.clear();
        this.mDrawables.addAll(this.mDefaultDrawables);
        this.mDrawableWidth = this.mDrawables.get(0).getIntrinsicHeight();
        this.mDrawableHeight = this.mDrawables.get(0).getIntrinsicWidth();
        this.mCurrentIndex = this.random.nextInt(this.mDrawables.size());
    }

    private static ArrayList<Drawable> createDefaultDrawables(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca5cb10b", new Object[]{context});
        }
        if (s_defaultDrawables.size() > 0) {
            return s_defaultDrawables;
        }
        ArrayList<Drawable> arrayList = s_defaultDrawables;
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
            return (Animator) ipChange.ipc$dispatch("bb68fc69", new Object[]{this, favorObject});
        }
        ObjectAnimator enterAnimator = getEnterAnimator(favorObject);
        ValueAnimator bezierValueAnimator = getBezierValueAnimator(favorObject, this.mWidth / 2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(enterAnimator, bezierValueAnimator);
        animatorSet.setInterpolator(this.accdec);
        return animatorSet;
    }

    private ValueAnimator getBezierValueAnimator(FavorObject favorObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("f0f323a3", new Object[]{this, favorObject, new Integer(i)});
        }
        float f = i;
        ValueAnimator ofObject = ValueAnimator.ofObject(new m92(getBreakPointF(2, 3)), new PointF(f, this.mHeight - 10), new PointF(f, 0.0f));
        ofObject.addUpdateListener(new d(favorObject, this));
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
        setSurfaceTextureListener(this);
    }

    public static /* synthetic */ Object ipc$super(NewFavorLayout newFavorLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/favor/NewFavorLayout");
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
                    FavorObject.access$502(favorObject, 1.2f);
                    FavorObject.access$602(favorObject, 1.2f);
                } else {
                    favorObject.setDrawable(this.mDrawables.get(this.mCurrentIndex));
                }
                this.mCurrentIndex++;
                this.mFavorObjects.add(favorObject);
                Animator animator = getAnimator(favorObject);
                animator.addListener(new c(this, favorObject));
                animator.start();
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

    @Override // com.taobao.taolive.uikit.favor.a.AbstractC0762a
    public void drawFavor() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0312e1", new Object[]{this});
        } else if (this.mTextureAvailable) {
            Canvas lockCanvas = lockCanvas();
            ArrayList<FavorObject> arrayList = this.mFavorObjects;
            if (!(arrayList == null || arrayList.size() <= 0 || lockCanvas == null)) {
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                for (int i2 = 0; i2 < this.mFavorObjects.size(); i2++) {
                    this.mDrawableLeft = (int) (this.mFavorObjects.get(i2).getX() - (((this.mDrawableWidth * this.mFavorObjects.get(i2).getScaleX()) * this.mScaleFactor) / 2.0d));
                    this.mDrawableTop = (int) (this.mFavorObjects.get(i2).getY() - (((this.mDrawableHeight * this.mFavorObjects.get(i2).getScaleY()) * this.mScaleFactor) / 2.0d));
                    this.mDrawableRight = (int) (this.mFavorObjects.get(i2).getX() + (((this.mDrawableWidth * this.mFavorObjects.get(i2).getScaleX()) * this.mScaleFactor) / 2.0d));
                    this.mDrawableBottom = (int) (this.mFavorObjects.get(i2).getY() + (((this.mDrawableHeight * this.mFavorObjects.get(i2).getScaleY()) * this.mScaleFactor) / 2.0d));
                    this.mFavorObjects.get(i2).getDrawable().setAlpha((int) (this.mFavorObjects.get(i2).getAlpha() * 255.0f));
                    this.mFavorObjects.get(i2).getDrawable().setBounds(this.mDrawableLeft, this.mDrawableTop, this.mDrawableRight, this.mDrawableBottom);
                    if (!this.mTextureAvailable) {
                        break;
                    }
                    this.mFavorObjects.get(i2).getDrawable().draw(lockCanvas);
                }
                int size = this.mFavorObjects.size();
                while (i < size) {
                    FavorObject favorObject = this.mFavorObjects.get(i);
                    if (favorObject != null && FavorObject.access$300(favorObject) == 0.0f) {
                        this.mFavorObjects.remove(i);
                        i--;
                        size--;
                    }
                    i++;
                }
            }
            unlockCanvasAndPost(lockCanvas);
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
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        com.taobao.taolive.uikit.favor.b.b().c(this);
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
        } else {
            this.mTextureAvailable = true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        this.mTextureAvailable = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.mPaused = true;
        com.taobao.taolive.uikit.favor.b.b().c(this);
    }

    public void removeFavor(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6fb9ed", new Object[]{this, favorObject});
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
            return;
        }
        this.mPaused = false;
        com.taobao.taolive.uikit.favor.b.b().a(this);
    }

    public void setDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9817c5d", new Object[]{this});
        } else if (this.mDefaultDrawables.size() > 0) {
            completeLoad();
        } else if (!mHasExecute) {
            mHasExecute = true;
            new e(getContext(), new a()).execute(new Object[0]);
        } else {
            postDelayed(new b(), 300L);
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
    public void setScaleFactor(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb580", new Object[]{this, new Double(d2)});
        } else {
            this.mScaleFactor = d2;
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
        com.taobao.taolive.uikit.favor.b.b().a(this);
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
        com.taobao.taolive.uikit.favor.b.b().c(this);
    }

    public NewFavorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewFavorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.random = new Random();
        this.mDrawableHeight = 60;
        this.mDrawableWidth = 60;
        this.line = new LinearInterpolator();
        this.acc = new AccelerateInterpolator();
        this.dce = new DecelerateInterpolator();
        this.accdec = new AccelerateDecelerateInterpolator();
        this.mTextureAvailable = false;
        this.mCurrentIndex = 0;
        this.mFavorDuration = 3000;
        this.mScaleFactor = 1.0d;
        this.mHandler = null;
        this.mPaused = false;
        init();
    }

    private ObjectAnimator getEnterAnimator(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("2c8b75f6", new Object[]{this, favorObject});
        }
        return ObjectAnimator.ofPropertyValuesHolder(favorObject, PropertyValuesHolder.ofFloat("alpha", 0.2f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.2f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.2f, 1.0f)).setDuration(200L);
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
