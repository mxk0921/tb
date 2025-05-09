package com.taobao.android.detail.core.standard.widget.lightoff;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout;
import java.util.ArrayList;
import tb.pfh;
import tb.t2o;
import tb.tgh;
import tb.u1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TransAnimLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DURATION = 200;
    private static final String SCALE_HEIGHT = "SCALE_HEIGHT";
    private static final String SCALE_WIDTH = "SCALE_WIDTH";
    private static final String TRANSITION_X = "TRANSITION_X";
    private static final String TRANSITION_Y = "TRANSITION_Y";
    private View mBackgroundView;
    private boolean mDismissing;
    private ImageView mImageView;
    private FrameLayout mInnerLayout;
    private int mOriginHeight;
    private int mOriginWidth;
    private FrameLayout mPullContainer;
    private PullDismissLayout mPullDismissLayout;
    private int mPullInnerBottomMargin;
    private Rect mRect;
    private int mScreenHeight;
    private int mScreenWidth;
    private Rect mTransEndRect;
    private d mTransListener;
    private static final String TAG = pfh.a("TransAni", BTags.XLightOff);
    private static final AccelerateDecelerateInterpolator DEFAULT_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private Bundle mScaleBundle = new Bundle();
    private Bundle mTransitionBundle = new Bundle();
    private Animator.AnimatorListener mExitListener = new a();
    private Animator.AnimatorListener mEnterListener = new b();
    private PullDismissLayout.b mPullListener = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).d();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            TransAnimLayout.access$102(TransAnimLayout.this, new Rect());
            TransAnimLayout.access$200(TransAnimLayout.this).getGlobalVisibleRect(TransAnimLayout.access$100(TransAnimLayout.this));
            if (TransAnimLayout.access$300(TransAnimLayout.this) != null) {
                TransAnimLayout.access$400(TransAnimLayout.this);
            }
            if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).b(TransAnimLayout.access$500(TransAnimLayout.this));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(438304832);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public void b(FrameLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f659760", new Object[]{this, layoutParams});
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("601a70e0", new Object[]{this});
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77af6893", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae04205a", new Object[]{this});
            }
        }

        public void f(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a3cb62d", new Object[]{this, new Float(f)});
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c096d94", new Object[]{this});
            }
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47202f1c", new Object[]{this});
            }
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b2132f", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(438304827);
    }

    public TransAnimLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ d access$000(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5278ccd", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mTransListener;
    }

    public static /* synthetic */ Rect access$100(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("bf953d87", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mTransEndRect;
    }

    public static /* synthetic */ Bundle access$1000(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("6a909154", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mTransitionBundle;
    }

    public static /* synthetic */ Rect access$102(TransAnimLayout transAnimLayout, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("398852a6", new Object[]{transAnimLayout, rect});
        }
        transAnimLayout.mTransEndRect = rect;
        return rect;
    }

    public static /* synthetic */ String access$1100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2afaf99", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ AccelerateDecelerateInterpolator access$1200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccelerateDecelerateInterpolator) ipChange.ipc$dispatch("10708644", new Object[0]);
        }
        return DEFAULT_INTERPOLATOR;
    }

    public static /* synthetic */ View access$1300(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7dab12f", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mBackgroundView;
    }

    public static /* synthetic */ FrameLayout access$200(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("80fc7a1c", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mInnerLayout;
    }

    public static /* synthetic */ PullDismissLayout access$300(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullDismissLayout) ipChange.ipc$dispatch("5c694df6", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mPullDismissLayout;
    }

    public static /* synthetic */ void access$400(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d7605b", new Object[]{transAnimLayout});
        } else {
            transAnimLayout.resetPullLayout();
        }
    }

    public static /* synthetic */ FrameLayout.LayoutParams access$500(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("40a04783", new Object[]{transAnimLayout});
        }
        return transAnimLayout.getTransEndPositon();
    }

    public static /* synthetic */ boolean access$600(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34be2c1d", new Object[]{transAnimLayout})).booleanValue();
        }
        return transAnimLayout.mDismissing;
    }

    public static /* synthetic */ boolean access$602(TransAnimLayout transAnimLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7159ce61", new Object[]{transAnimLayout, new Boolean(z)})).booleanValue();
        }
        transAnimLayout.mDismissing = z;
        return z;
    }

    public static /* synthetic */ Rect access$700(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("71ca1941", new Object[]{transAnimLayout});
        }
        return transAnimLayout.mRect;
    }

    public static /* synthetic */ int access$800(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0a4f7ca", new Object[]{transAnimLayout})).intValue();
        }
        return transAnimLayout.mScreenHeight;
    }

    public static /* synthetic */ int access$900(TransAnimLayout transAnimLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce985da9", new Object[]{transAnimLayout})).intValue();
        }
        return transAnimLayout.mScreenWidth;
    }

    private void getBundleInfo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57c2ed", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mScaleBundle.putFloat(SCALE_WIDTH, this.mScreenWidth / this.mOriginWidth);
        this.mScaleBundle.putFloat(SCALE_HEIGHT, (this.mScreenWidth / (i / i2)) / this.mOriginHeight);
        Bundle bundle = this.mTransitionBundle;
        Rect rect = this.mRect;
        int i3 = rect.left;
        bundle.putFloat(TRANSITION_X, (this.mScreenWidth / 2) - (i3 + ((rect.right - i3) / 2)));
        Bundle bundle2 = this.mTransitionBundle;
        Rect rect2 = this.mRect;
        int i4 = rect2.top;
        bundle2.putFloat(TRANSITION_Y, (((this.mScreenHeight / 2) - (i4 + ((rect2.bottom - i4) / 2))) + u1m.a()) - (this.mPullInnerBottomMargin / 2));
    }

    private void getScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e0418a", new Object[]{this});
            return;
        }
        Display defaultDisplay = ((Activity) getContext()).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.mScreenWidth = point.x;
        this.mScreenHeight = point.y;
    }

    private FrameLayout.LayoutParams getTransEndPositon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("1f440f25", new Object[]{this});
        }
        if (this.mTransEndRect == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mTransEndRect.width(), this.mTransEndRect.height());
        Rect rect = this.mTransEndRect;
        int i = rect.left;
        int a2 = rect.top - u1m.a();
        Rect rect2 = this.mTransEndRect;
        layoutParams.setMargins(i, a2, rect2.right, rect2.bottom);
        return layoutParams;
    }

    private void initPullDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f3f5c", new Object[]{this});
            return;
        }
        this.mPullDismissLayout.setAnimateAlpha(false);
        this.mPullDismissLayout.setAnimateScale(true);
        this.mPullDismissLayout.setMinFlingVelocity(100.0f);
        this.mPullDismissLayout.setListener(this.mPullListener);
    }

    public static /* synthetic */ Object ipc$super(TransAnimLayout transAnimLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/TransAnimLayout");
    }

    private void resetPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47700605", new Object[]{this});
            return;
        }
        this.mInnerLayout.removeView(this.mImageView);
        this.mPullContainer.removeView(this.mInnerLayout);
        FrameLayout.LayoutParams transEndPositon = getTransEndPositon();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mInnerLayout = frameLayout;
        frameLayout.addView(this.mImageView, new FrameLayout.LayoutParams(-1, -1));
        this.mPullContainer.addView(this.mInnerLayout, transEndPositon);
        initPullDismiss();
    }

    private void setTransViewRect(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeb14da", new Object[]{this, drawable});
            return;
        }
        Rect rect = new Rect(this.mRect);
        if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight()) {
                int width = (this.mRect.width() * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
                Rect rect2 = this.mRect;
                rect.left = rect2.left;
                rect.right = rect2.right;
                int height = rect2.top + ((rect2.height() - width) / 2);
                rect.top = height;
                rect.bottom = height + width;
                this.mRect = rect;
                return;
            }
            int height2 = (this.mRect.height() * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
            Rect rect3 = this.mRect;
            rect.top = rect3.top;
            rect.bottom = rect3.bottom;
            int width2 = rect3.left + ((rect3.width() - height2) / 2);
            rect.left = width2;
            rect.right = width2 + height2;
            this.mRect = rect;
        }
    }

    public void addPullInnerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d927f16", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = this.mPullInnerBottomMargin;
        this.mPullContainer.addView(view, 0, layoutParams);
    }

    public void hideTransView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78298152", new Object[]{this});
        } else {
            this.mImageView.setVisibility(8);
        }
    }

    public void init(Rect rect, Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3965aa4e", new Object[]{this, rect, drawable, new Boolean(z)});
            return;
        }
        getScreenSize();
        this.mRect = rect;
        setTransViewRect(drawable);
        Rect rect2 = this.mRect;
        this.mOriginWidth = rect2.right - rect2.left;
        this.mOriginHeight = rect2.bottom - rect2.top;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mOriginWidth, this.mOriginHeight);
        Rect rect3 = this.mRect;
        int i = rect3.left;
        int a2 = rect3.top - u1m.a();
        Rect rect4 = this.mRect;
        layoutParams.setMargins(i, a2, rect4.right, rect4.bottom);
        this.mInnerLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.mImageView = imageView;
        this.mInnerLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        if (z) {
            this.mPullDismissLayout = new PullDismissLayout(getContext());
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.mPullContainer = frameLayout;
            this.mPullDismissLayout.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            addView(this.mPullDismissLayout, new FrameLayout.LayoutParams(-1, -1));
            this.mPullContainer.addView(this.mInnerLayout, layoutParams);
        } else {
            addView(this.mInnerLayout, layoutParams);
        }
        this.mImageView.setImageDrawable(drawable);
        this.mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mImageView.setClickable(true);
        getBundleInfo(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.mDismissing = false;
    }

    public boolean isTransViewHiden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ae229d4", new Object[]{this})).booleanValue();
        }
        if (this.mImageView.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public void setPullInnerBottomMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17167e34", new Object[]{this, new Integer(i)});
        } else {
            this.mPullInnerBottomMargin = i;
        }
    }

    public void setTransListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a576d25d", new Object[]{this, dVar});
        } else {
            this.mTransListener = dVar;
        }
    }

    public void showTransImage(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26390e9b", new Object[]{this, drawable});
            return;
        }
        if (drawable != null) {
            updataTransImage(drawable);
        }
        this.mImageView.setVisibility(0);
    }

    public void updataTransImage(Drawable drawable) {
        ImageView imageView;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c016a63", new Object[]{this, drawable});
        } else if (drawable != null && (imageView = this.mImageView) != null) {
            imageView.setImageDrawable(drawable);
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && this.mInnerLayout != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                ViewGroup.LayoutParams layoutParams = this.mInnerLayout.getLayoutParams();
                int i = this.mScreenWidth;
                layoutParams.width = i;
                layoutParams.height = (i * height) / width;
                setTransViewRect(drawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends PullDismissLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    TransAnimLayout.access$602(TransAnimLayout.this, false);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$000(TransAnimLayout.this).d();
                }
                TransAnimLayout.access$602(TransAnimLayout.this, false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$000(TransAnimLayout.this).e();
                }
            }
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/TransAnimLayout$3");
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.b
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue();
            }
            if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                return TransAnimLayout.access$000(TransAnimLayout.this).a();
            }
            return false;
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.b
        public void c(float f, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf63f4d", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).f(f);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47202f1c", new Object[]{this});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).h();
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b2132f", new Object[]{this});
            } else if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                TransAnimLayout.access$000(TransAnimLayout.this).i();
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.b
        public void b(float f, View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3f5bb43", new Object[]{this, new Float(f), view, new Integer(i), new Integer(i2)});
            } else if (!TransAnimLayout.access$600(TransAnimLayout.this)) {
                TransAnimLayout.access$602(TransAnimLayout.this, true);
                if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                    TransAnimLayout.access$000(TransAnimLayout.this).g();
                }
                view.getGlobalVisibleRect(new Rect());
                float width = TransAnimLayout.access$700(TransAnimLayout.this).width() * (TransAnimLayout.access$800(TransAnimLayout.this) / TransAnimLayout.access$900(TransAnimLayout.this));
                float width2 = TransAnimLayout.access$700(TransAnimLayout.this).width() / view.getWidth();
                float height = width / view.getHeight();
                float f2 = (i + TransAnimLayout.access$1000(TransAnimLayout.this).getFloat(TransAnimLayout.TRANSITION_X)) * (-1.0f);
                float centerY = (float) (TransAnimLayout.access$700(TransAnimLayout.this).centerY() - (Math.ceil((view.getHeight() + u1m.a()) / 2.0f) + i2));
                if (Float.isNaN(width2) || Float.isNaN(height) || Float.isNaN(f2) || Float.isNaN(centerY)) {
                    String access$1100 = TransAnimLayout.access$1100();
                    tgh.b(access$1100, "PullListener onDismissed isNaN:scaleX" + width2 + ",scaleY" + height + ",transX" + f2 + ",transY" + centerY);
                    if (TransAnimLayout.access$000(TransAnimLayout.this) != null) {
                        TransAnimLayout.access$000(TransAnimLayout.this).d();
                    }
                    TransAnimLayout.this.hideTransView();
                    return;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(200L).setInterpolator(TransAnimLayout.access$1200());
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(view, "translationX", f2));
                arrayList.add(ObjectAnimator.ofFloat(view, "translationY", centerY));
                arrayList.add(ObjectAnimator.ofFloat(view, "scaleX", width2));
                arrayList.add(ObjectAnimator.ofFloat(view, "scaleY", height));
                if (TransAnimLayout.access$1300(TransAnimLayout.this) != null) {
                    arrayList.add(ObjectAnimator.ofFloat(TransAnimLayout.access$1300(TransAnimLayout.this), View.ALPHA, 0.0f));
                }
                animatorSet.addListener(new a());
                animatorSet.playTogether(arrayList);
                animatorSet.start();
            }
        }
    }

    public void runEnterAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d77686d", new Object[]{this, view});
            return;
        }
        float f = this.mScaleBundle.getFloat(SCALE_WIDTH);
        float f2 = this.mScaleBundle.getFloat(SCALE_HEIGHT);
        float f3 = this.mTransitionBundle.getFloat(TRANSITION_X);
        float f4 = this.mTransitionBundle.getFloat(TRANSITION_Y);
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4) || Float.isInfinite(f) || Float.isInfinite(f2) || Float.isInfinite(f3) || Float.isInfinite(f4)) {
            String str = TAG;
            tgh.b(str, "runEnterAnim isNaN or isInfinite scaleX: " + f + ",scaleY: " + f2 + ",transX: " + f3 + ",transY: " + f4);
            d dVar = this.mTransListener;
            if (dVar != null) {
                dVar.b(getTransEndPositon());
            }
            hideTransView();
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L).setInterpolator(DEFAULT_INTERPOLATOR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationX", f3));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationY", f4));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleX", f));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleY", f2));
        if (view != null) {
            this.mBackgroundView = view;
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
        }
        animatorSet.addListener(this.mEnterListener);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.mInnerLayout.setVisibility(0);
    }

    public void runExitAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f53b1", new Object[]{this, view});
            return;
        }
        this.mInnerLayout.getGlobalVisibleRect(new Rect());
        float f = this.mTransitionBundle.getFloat(TRANSITION_X) * (-1.0f);
        float f2 = this.mTransitionBundle.getFloat(TRANSITION_Y) * (-1.0f);
        float f3 = 1.0f / this.mScaleBundle.getFloat(SCALE_WIDTH);
        float f4 = 1.0f / this.mScaleBundle.getFloat(SCALE_HEIGHT);
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f) || Float.isNaN(f2) || Float.isInfinite(f3) || Float.isInfinite(f4) || Float.isInfinite(f) || Float.isInfinite(f2)) {
            String str = TAG;
            tgh.b(str, "runExitAnim isNaN or isInfinite scaleX: " + f3 + ",scaleY: " + f4 + ",transX: " + f + ",transY: " + f2);
            d dVar = this.mTransListener;
            if (dVar != null) {
                dVar.d();
            }
            hideTransView();
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L).setInterpolator(DEFAULT_INTERPOLATOR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationX", 0.0f, f));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "translationY", 0.0f, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleX", 1.0f, f3));
        arrayList.add(ObjectAnimator.ofFloat(this.mInnerLayout, "scaleY", 1.0f, f4));
        if (view != null) {
            this.mBackgroundView = view;
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f));
        }
        animatorSet.addListener(this.mExitListener);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public TransAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TransAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
