package com.taobao.android.fluid.business.videocollection.common.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir9;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CollectionTabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AVERAGE = 2;
    public static final int CORNER_RADIUS = 4;
    public static final int DEFAULT_TAB_WIDTH = 100;
    private static final int INDICATOR_DEFAUT_COLOR = -15656659;
    public static final int OUTSIDE_ID = 1000;
    private static final int SELECTED_TEXT_COLOR = -15656659;
    public static final int SLIDING_DURATION = 300;
    public static final String TAG = "CollectionTabLayout";
    private static final int UNSELECTED_TEXT_COLOR = -11509638;
    public static final int VERTICAL_PADDING = 10;
    private ValueAnimator animator;
    private boolean hasFixedView;
    private int horizonPadding;
    private GradientDrawable indicatorDrawable;
    private int indicatorHeight;
    private float indicatorLeft;
    private int indicatorWidth;
    private boolean isOutofTabsContainer;
    private float lastScrollX;
    private g onTabSelectedListener;
    private ObjectAnimator outViewAnimation;
    private int scrollToX;
    private Typeface selectedTabTypeface;
    private int tabCurPosition;
    private LinearLayout tabsContainer;
    private Typeface unselectedTabTypeface;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int indexOfChild = CollectionTabLayout.access$000(CollectionTabLayout.this).indexOfChild(view);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                CollectionTabLayout.this.setScrollPosition(indexOfChild, true);
                if (CollectionTabLayout.access$100(CollectionTabLayout.this) != null) {
                    CollectionTabLayout.access$100(CollectionTabLayout.this).a(indexOfChild);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HorizontalScrollView f7710a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CollectionTabLayout collectionTabLayout = CollectionTabLayout.this;
                collectionTabLayout.smoothScrollTo(CollectionTabLayout.access$200(collectionTabLayout), 0);
            }
        }

        public b(HorizontalScrollView horizontalScrollView) {
            this.f7710a = horizontalScrollView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.f7710a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f7710a.post(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7712a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public c(View view, View view2, View view3) {
            this.f7712a = view;
            this.b = view2;
            this.c = view3;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/common/view/CollectionTabLayout$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            StringBuilder sb = new StringBuilder(":fixedView.getLeft()");
            sb.append(this.f7712a.getLeft());
            sb.append("tabsContainer.getRight()");
            sb.append(CollectionTabLayout.access$000(CollectionTabLayout.this).getRight());
            sb.append("getScrollX()");
            sb.append(CollectionTabLayout.this.getScrollX());
            sb.append(" selectedTab.getLeft()");
            sb.append(this.b.getLeft());
            sb.append(" selectedTab.getWidth()");
            sb.append(this.b.getWidth());
            sb.append("fixedView.getWidth()");
            sb.append(this.f7712a.getWidth());
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin + this.c.getTranslationX());
                this.c.setLayoutParams(marginLayoutParams);
            }
            this.c.setTranslationX(0.0f);
            CollectionTabLayout.access$302(CollectionTabLayout.this, this.f7712a.getLeft() + (this.b.getWidth() / 2.0f) + CollectionTabLayout.this.getScrollX());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7715a;

        public e(float f) {
            this.f7715a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            CollectionTabLayout collectionTabLayout = CollectionTabLayout.this;
            CollectionTabLayout.access$702(collectionTabLayout, CollectionTabLayout.access$300(collectionTabLayout) + ((this.f7715a - CollectionTabLayout.access$300(CollectionTabLayout.this)) * animatedFraction));
            ViewCompat.postInvalidateOnAnimation(CollectionTabLayout.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/common/view/CollectionTabLayout$6");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            CollectionTabLayout collectionTabLayout = CollectionTabLayout.this;
            CollectionTabLayout.access$302(collectionTabLayout, CollectionTabLayout.access$700(collectionTabLayout));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
        void a(int i);
    }

    static {
        t2o.a(468713689);
    }

    public CollectionTabLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ LinearLayout access$000(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("112290d3", new Object[]{collectionTabLayout});
        }
        return collectionTabLayout.tabsContainer;
    }

    public static /* synthetic */ g access$100(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9f0365bd", new Object[]{collectionTabLayout});
        }
        return collectionTabLayout.onTabSelectedListener;
    }

    public static /* synthetic */ int access$200(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("153927ad", new Object[]{collectionTabLayout})).intValue();
        }
        return collectionTabLayout.scrollToX;
    }

    public static /* synthetic */ float access$300(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2a02c9", new Object[]{collectionTabLayout})).floatValue();
        }
        return collectionTabLayout.lastScrollX;
    }

    public static /* synthetic */ float access$302(CollectionTabLayout collectionTabLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a2649f9", new Object[]{collectionTabLayout, new Float(f2)})).floatValue();
        }
        collectionTabLayout.lastScrollX = f2;
        return f2;
    }

    public static /* synthetic */ int access$400(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("851addeb", new Object[]{collectionTabLayout})).intValue();
        }
        return collectionTabLayout.indicatorWidth;
    }

    public static /* synthetic */ ObjectAnimator access$500(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("ea2685fd", new Object[]{collectionTabLayout});
        }
        return collectionTabLayout.outViewAnimation;
    }

    public static /* synthetic */ ObjectAnimator access$502(CollectionTabLayout collectionTabLayout, ObjectAnimator objectAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("a2cd2a1", new Object[]{collectionTabLayout, objectAnimator});
        }
        collectionTabLayout.outViewAnimation = objectAnimator;
        return objectAnimator;
    }

    public static /* synthetic */ boolean access$602(CollectionTabLayout collectionTabLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ca62f64", new Object[]{collectionTabLayout, new Boolean(z)})).booleanValue();
        }
        collectionTabLayout.isOutofTabsContainer = z;
        return z;
    }

    public static /* synthetic */ float access$700(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ced6f45", new Object[]{collectionTabLayout})).floatValue();
        }
        return collectionTabLayout.indicatorLeft;
    }

    public static /* synthetic */ float access$702(CollectionTabLayout collectionTabLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d06cfd", new Object[]{collectionTabLayout, new Float(f2)})).floatValue();
        }
        collectionTabLayout.indicatorLeft = f2;
        return f2;
    }

    private void animateIndicatorToPosition(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2802bc7", new Object[]{this, new Float(f2)});
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new e(f2));
        this.animator.addListener(new f());
        this.animator.setDuration(300L);
        this.animator.start();
    }

    public static /* synthetic */ Object ipc$super(CollectionTabLayout collectionTabLayout, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/common/view/CollectionTabLayout");
    }

    public void addTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, str});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(UNSELECTED_TEXT_COLOR);
        textView.setText(str);
        Paint paint = new Paint();
        paint.setTypeface(this.selectedTabTypeface);
        paint.setTextSize(pr9.c(getContext(), 15));
        textView.setLayoutParams(new LinearLayout.LayoutParams((int) Math.ceil(paint.measureText(str) + (this.horizonPadding * 2)), -2));
        int i = this.horizonPadding;
        textView.setPadding(i, 10, i, 10);
        textView.setOnTouchListener(new a());
        this.tabsContainer.addView(textView);
    }

    public void clickOutSide(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d0365f", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        View childAt = viewGroup.getChildAt(i);
        if ((childAt instanceof TextView) && (i2 = this.tabCurPosition) >= 0 && i2 < this.tabsContainer.getChildCount()) {
            this.isOutofTabsContainer = true;
            outAnimation(viewGroup, childAt, this.tabsContainer.getChildAt(this.tabCurPosition));
            selectTab(this.tabsContainer.getChildCount(), true);
            invalidate();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.tabsContainer.getChildCount() > 0 && !this.isOutofTabsContainer && (childAt = this.tabsContainer.getChildAt(this.tabCurPosition)) != null && childAt.getLeft() >= 0) {
            int width = (childAt.getWidth() - this.indicatorWidth) / 2;
            int i = ((int) this.indicatorLeft) + width;
            if (Float.compare(this.lastScrollX, -1.0f) == 0) {
                i = childAt.getLeft() + width;
                this.indicatorLeft = childAt.getLeft();
                this.lastScrollX = childAt.getLeft();
            }
            this.indicatorDrawable.setBounds(i, getHeight() - this.indicatorHeight, this.indicatorWidth + i, getHeight());
            this.indicatorDrawable.draw(canvas);
        }
        super.draw(canvas);
    }

    public int getSelectedTabPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e05b0107", new Object[]{this})).intValue();
        }
        return this.tabCurPosition;
    }

    public int getTabWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408409a1", new Object[]{this})).intValue();
        }
        if (this.tabsContainer.getChildCount() > 0) {
            return this.tabsContainer.getChildAt(0).getWidth();
        }
        return 100;
    }

    public LinearLayout getTabsContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("8e02044b", new Object[]{this});
        }
        return this.tabsContainer;
    }

    public void setHasFixedView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d101b8c", new Object[]{this, new Boolean(z)});
        } else {
            this.hasFixedView = z;
        }
    }

    public void setOnTabSelectedListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2521628", new Object[]{this, gVar});
        } else {
            this.onTabSelectedListener = gVar;
        }
    }

    public void setScrollPosition(int i, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e5a910", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i >= 0 && i < this.tabsContainer.getChildCount() && (i2 = this.tabCurPosition) != i) {
            if (i2 < this.tabsContainer.getChildCount()) {
                this.isOutofTabsContainer = false;
            }
            View childAt = this.tabsContainer.getChildAt(i);
            int left = (childAt.getLeft() + (childAt.getLeft() / 2)) - (getWidth() / 2);
            this.scrollToX = left;
            if (this.hasFixedView) {
                this.scrollToX = left - childAt.getWidth();
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
            selectTab(i, z);
        }
    }

    public CollectionTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7713a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewGroup c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/common/view/CollectionTabLayout$4$1");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                d dVar = d.this;
                CollectionTabLayout.access$302(CollectionTabLayout.this, dVar.b.getLeft());
                d dVar2 = d.this;
                dVar2.c.removeView(dVar2.f7713a);
                CollectionTabLayout.access$602(CollectionTabLayout.this, false);
                CollectionTabLayout.this.invalidate();
            }
        }

        public d(View view, View view2, ViewGroup viewGroup) {
            this.f7713a = view;
            this.b = view2;
            this.c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int left = this.f7713a.getLeft();
            CollectionTabLayout.access$502(CollectionTabLayout.this, ObjectAnimator.ofFloat(this.f7713a, "translationX", 0.0f, ((this.b.getLeft() - Math.min(CollectionTabLayout.this.getScrollX(), Math.max(CollectionTabLayout.access$200(CollectionTabLayout.this), 0))) + ((this.b.getWidth() - CollectionTabLayout.access$400(CollectionTabLayout.this)) / 2)) - left));
            CollectionTabLayout.access$500(CollectionTabLayout.this).setDuration(300L);
            CollectionTabLayout.access$500(CollectionTabLayout.this).setInterpolator(new LinearInterpolator());
            CollectionTabLayout.access$500(CollectionTabLayout.this).addListener(new a());
            CollectionTabLayout.access$500(CollectionTabLayout.this).start();
        }
    }

    public CollectionTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectedTabTypeface = Typeface.DEFAULT_BOLD;
        this.unselectedTabTypeface = Typeface.DEFAULT;
        this.horizonPadding = 0;
        this.isOutofTabsContainer = false;
        this.hasFixedView = false;
        this.indicatorDrawable = new GradientDrawable();
        this.indicatorWidth = 0;
        this.indicatorHeight = 0;
        this.tabCurPosition = -1;
        this.indicatorLeft = -1.0f;
        this.lastScrollX = -1.0f;
        this.horizonPadding = pr9.c(getContext(), 18);
        this.indicatorWidth = pr9.c(getContext(), 12);
        this.indicatorHeight = pr9.c(getContext(), 2);
        setFillViewport(true);
        setWillNotDraw(false);
        this.indicatorDrawable.setColor(-15656659);
        this.indicatorDrawable.setCornerRadius(4.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.tabsContainer);
    }

    private void selectTab(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe4e131", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i >= 0 && i <= this.tabsContainer.getChildCount()) {
            int i2 = this.tabCurPosition;
            if (i2 >= 0 && i2 < this.tabsContainer.getChildCount()) {
                TextView textView = (TextView) this.tabsContainer.getChildAt(this.tabCurPosition);
                textView.setTextColor(UNSELECTED_TEXT_COLOR);
                textView.setTypeface(this.unselectedTabTypeface);
                textView.setSelected(false);
            } else if (this.tabCurPosition == this.tabsContainer.getChildCount()) {
                View childAt = ((ViewGroup) getParent()).getChildAt(1);
                if (childAt instanceof TextView) {
                    TextView textView2 = (TextView) childAt;
                    textView2.setTextColor(UNSELECTED_TEXT_COLOR);
                    textView2.setTypeface(this.unselectedTabTypeface);
                    childAt.setSelected(false);
                }
                if (i < this.tabsContainer.getChildCount()) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    View childAt2 = this.tabsContainer.getChildAt(i);
                    View findViewById = viewGroup.findViewById(1000);
                    ObjectAnimator objectAnimator = this.outViewAnimation;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.outViewAnimation.cancel();
                    }
                    viewGroup.post(new d(findViewById, childAt2, viewGroup));
                }
            }
            if (i == this.tabsContainer.getChildCount() && this.isOutofTabsContainer) {
                View childAt3 = ((ViewGroup) getParent()).getChildAt(1);
                if (childAt3 instanceof TextView) {
                    TextView textView3 = (TextView) childAt3;
                    textView3.setTextColor(-15656659);
                    textView3.setTypeface(this.selectedTabTypeface);
                    childAt3.setSelected(true);
                }
            } else if (i < this.tabsContainer.getChildCount()) {
                TextView textView4 = (TextView) this.tabsContainer.getChildAt(i);
                textView4.setTextColor(-15656659);
                textView4.setTypeface(this.selectedTabTypeface);
                textView4.setSelected(true);
                float left = this.tabsContainer.getChildAt(i).getLeft();
                if (this.lastScrollX >= 0.0f && z) {
                    animateIndicatorToPosition(left);
                } else if (!z) {
                    this.indicatorLeft = left;
                    this.lastScrollX = left;
                }
            }
            this.tabCurPosition = i;
            invalidate();
            ir9.b(TAG, "select postion:" + this.tabCurPosition);
        }
    }

    private void outAnimation(ViewGroup viewGroup, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a2385c", new Object[]{this, viewGroup, view, view2});
            return;
        }
        View view3 = new View(getContext());
        view3.setBackground(this.indicatorDrawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.indicatorWidth, this.indicatorHeight);
        layoutParams.topMargin = getHeight() - this.indicatorHeight;
        layoutParams.leftMargin = (view2.getLeft() - getScrollX()) + ((view2.getWidth() - this.indicatorWidth) / 2);
        ObjectAnimator objectAnimator = this.outViewAnimation;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.outViewAnimation.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "translationX", 0.0f, (view.getLeft() - layoutParams.leftMargin) + ((view.getWidth() - this.indicatorWidth) / 2.0f));
        this.outViewAnimation = ofFloat;
        ofFloat.setDuration(300L);
        this.outViewAnimation.setInterpolator(new LinearInterpolator());
        view3.setId(1000);
        viewGroup.addView(view3, layoutParams);
        this.outViewAnimation.addListener(new c(view, view2, view3));
        this.outViewAnimation.start();
    }
}
