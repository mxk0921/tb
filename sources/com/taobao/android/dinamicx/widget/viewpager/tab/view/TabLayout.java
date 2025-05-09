package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.iz0;
import tb.t2o;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    public static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    public static final int DEFAULT_INDICATOR_Z_INDEX = 1;
    public static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener mAdapterChangeListener;
    private int mContentInsetStart;
    private c mCurrentVpSelectedListener;
    public int mMode;
    private final ArrayList<b> mOnTabClickListeners;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private int mRequestedTabMaxWidth;
    private int mRequestedTabMinWidth;
    private boolean mReselectAnimated;
    private ValueAnimator mScrollAnimator;
    private int mScrollableTabMinWidth;
    private c mSelectedListener;
    private final ArrayList<c> mSelectedListeners;
    private e mSelectedTab;
    private boolean mSetupViewPagerImplicitly;
    public int mTabGravity;
    public int mTabMaxWidth;
    public int mTabPaddingBottom;
    public int mTabPaddingEnd;
    public int mTabPaddingStart;
    public int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    public int mTabTextAppearance;
    public ColorStateList mTabTextColors;
    public float mTabTextMultiLineSize;
    public float mTabTextSize;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<e> mTabs;
    public ViewPager mViewPager;
    public boolean mViewPagerSmoothScroll;
    public static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    public static final Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final Interpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final Pools.Pool<e> sTabPool = new Pools.SynchronizedPool(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f7526a;

        static {
            t2o.a(444597710);
        }

        public AdapterChangeListener() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ce5dd03", new Object[]{this, new Boolean(z)});
            } else {
                this.f7526a = z;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbf83ca", new Object[]{this, viewPager, pagerAdapter, pagerAdapter2});
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.mViewPager == viewPager) {
                tabLayout.setPagerAdapter(pagerAdapter2, this.f7526a);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ValueAnimator mIndicatorAnimator;
        private int mSelectedIndicatorBottomGap;
        private int mSelectedIndicatorHeight;
        private int mSelectedIndicatorRadius;
        private int mSelectedIndicatorWidth;
        public float mSelectionOffset;
        private int mSelectedIndicatorZIndex = 1;
        public int mSelectedPosition = -1;
        private int mLayoutDirection = -1;
        private int mIndicatorLeft = -1;
        private int mIndicatorRight = -1;
        private final Paint mSelectedIndicatorPaint = new Paint();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7527a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f7527a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float animatedFraction = valueAnimator.getAnimatedFraction();
                SlidingTabStrip.this.setIndicatorPosition(iz0.a(this.f7527a, this.b, animatedFraction), iz0.a(this.c, this.d, animatedFraction));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7528a;

            public b(int i) {
                this.f7528a = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/TabLayout$SlidingTabStrip$2");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                slidingTabStrip.mSelectedPosition = this.f7528a;
                slidingTabStrip.mSelectionOffset = 0.0f;
            }
        }

        static {
            t2o.a(444597715);
        }

        public SlidingTabStrip(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public static /* synthetic */ Object ipc$super(SlidingTabStrip slidingTabStrip, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1665133574:
                    super.draw((Canvas) objArr[0]);
                    return null;
                case -244855388:
                    super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                case 650865254:
                    super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1933053926:
                    super.onRtlPropertiesChanged(((Number) objArr[0]).intValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/TabLayout$SlidingTabStrip");
            }
        }

        private void updateIndicatorPosition() {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a047396", new Object[]{this});
                return;
            }
            View childAt = getChildAt(this.mSelectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    float left = this.mSelectionOffset * childAt2.getLeft();
                    float f = this.mSelectionOffset;
                    i = (int) (left + ((1.0f - f) * i));
                    i2 = (int) ((f * childAt2.getRight()) + ((1.0f - this.mSelectionOffset) * i2));
                }
            }
            setIndicatorPosition(i, i2);
        }

        public void animateIndicatorToPosition(int i, int i2) {
            int i3;
            int i4;
            int i5;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d871d39", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                z = true;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (Math.abs(i - this.mSelectedPosition) <= 1) {
                i4 = this.mIndicatorLeft;
                i3 = this.mIndicatorRight;
            } else {
                int dpToPx = TabLayout.this.dpToPx(24);
                if (i >= this.mSelectedPosition ? !z : z) {
                    i5 = left - dpToPx;
                } else {
                    i5 = dpToPx + right;
                }
                i4 = i5;
                i3 = i4;
            }
            if (i4 != left || i3 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.mIndicatorAnimator = valueAnimator2;
                valueAnimator2.setInterpolator(iz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
                valueAnimator2.setDuration(i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new a(i4, left, i3, right));
                valueAnimator2.addListener(new b(i));
                valueAnimator2.start();
            }
        }

        public boolean childrenNeedLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e1603bca", new Object[]{this})).booleanValue();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            if (this.mSelectedIndicatorZIndex < 1) {
                drawIndicator(canvas);
            }
            super.draw(canvas);
            if (this.mSelectedIndicatorZIndex >= 1) {
                drawIndicator(canvas);
            }
        }

        public void drawIndicator(Canvas canvas) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7292173", new Object[]{this, canvas});
                return;
            }
            int i2 = this.mIndicatorLeft;
            if (i2 >= 0 && (i = this.mIndicatorRight) > i2) {
                int i3 = this.mSelectedIndicatorWidth;
                if (i3 > 0 && i - i2 > i3) {
                    int i4 = ((i - i2) - i3) / 2;
                    this.mIndicatorLeft = i2 + i4;
                    this.mIndicatorRight = i - i4;
                }
                RectF rectF = new RectF();
                rectF.left = this.mIndicatorLeft;
                rectF.right = this.mIndicatorRight;
                if (this.mSelectedIndicatorBottomGap > 0) {
                    rectF.top = (getHeight() - this.mSelectedIndicatorHeight) - this.mSelectedIndicatorBottomGap;
                    rectF.bottom = getHeight() - this.mSelectedIndicatorBottomGap;
                } else {
                    rectF.top = getHeight() - this.mSelectedIndicatorHeight;
                    rectF.bottom = getHeight();
                }
                int i5 = this.mSelectedIndicatorRadius;
                if (i5 > 0) {
                    canvas.drawRoundRect(rectF, i5, i5, this.mSelectedIndicatorPaint);
                } else {
                    canvas.drawRect(rectF, this.mSelectedIndicatorPaint);
                }
            }
        }

        public float getIndicatorPosition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46fca719", new Object[]{this})).floatValue();
            }
            return this.mSelectedPosition + this.mSelectionOffset;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                updateIndicatorPosition();
                return;
            }
            this.mIndicatorAnimator.cancel();
            animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * ((float) this.mIndicatorAnimator.getDuration())));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                if (tabLayout.mMode == 1 && tabLayout.mTabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.dpToPx(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.mTabGravity = 0;
                            tabLayout2.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73380fe6", new Object[]{this, new Integer(i)});
                return;
            }
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.mLayoutDirection != i) {
                requestLayout();
                this.mLayoutDirection = i;
            }
        }

        public void setIndicatorPosition(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90adc6bd", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i != this.mIndicatorLeft || i2 != this.mIndicatorRight) {
                this.mIndicatorLeft = i;
                this.mIndicatorRight = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2e0842", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }

        public void setSelectedIndicatorColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4398e8eb", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorPaint.getColor() != i) {
                this.mSelectedIndicatorPaint.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedIndicatorHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8017dc3", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorHeight != i) {
                this.mSelectedIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedIndicatorWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98207068", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorWidth != i) {
                this.mSelectedIndicatorWidth = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorBottomGap(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorBottomGap != i) {
                this.mSelectedIndicatorBottomGap = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorRadius(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873aa5d3", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorRadius != i) {
                this.mSelectedIndicatorRadius = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorZIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e89dad", new Object[]{this, new Integer(i)});
            } else {
                this.mSelectedIndicatorZIndex = i;
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface TabGravity {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f7529a;
        public int b;
        public int c;

        static {
            t2o.a(444597720);
        }

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f7529a = new WeakReference<>(tabLayout);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.c = 0;
            this.b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            this.b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            TabLayout tabLayout = this.f7529a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (zg5.A4()) {
                    int i4 = this.c;
                    if (i4 == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (this.b == 0 && i4 == 0) {
                        z3 = z6;
                        z5 = false;
                        z4 = false;
                    } else {
                        z4 = z2;
                        z3 = z6;
                        z5 = z;
                    }
                } else {
                    z4 = z2;
                    z5 = z;
                    z3 = false;
                }
                tabLayout.setScrollPosition(i, f, z5, z4, z3, !tabLayout.mViewPagerSmoothScroll);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            TabLayout tabLayout = this.f7529a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                if (i2 == 0 || (i2 == 2 && this.b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                e tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    tabAt.p(false);
                }
                tabLayout.selectTab(tabAt, z, true, 2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface TabSelectedIndexChangeType {
        public static final int AUTO_SELECT_SET = 1;
        public static final int IDLE = 0;
        public static final int SCROLL = 2;
        public static final int TAP = 3;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class TabView extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines = 2;
        private ImageView mIconView;
        private e mTab;
        private TextView mTextView;

        static {
            t2o.a(444597722);
        }

        public TabView(Context context) {
            super(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.mTabPaddingStart, TabLayout.this.mTabPaddingTop, TabLayout.this.mTabPaddingEnd, TabLayout.this.mTabPaddingBottom);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a88c261d", new Object[]{this, layout, new Integer(i), new Float(f)})).floatValue();
            }
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        public static /* synthetic */ Object ipc$super(TabView tabView, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1540204496:
                    super.setSelected(((Boolean) objArr[0]).booleanValue());
                    return null;
                case -376150200:
                    super.onInitializeAccessibilityEvent((AccessibilityEvent) objArr[0]);
                    return null;
                case 362356466:
                    super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) objArr[0]);
                    return null;
                case 650865254:
                    super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1774009266:
                    return new Boolean(super.performClick());
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/TabLayout$TabView");
            }
        }

        private void updateTextAndIcon(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("752d035d", new Object[]{this, textView, imageView});
                return;
            }
            e eVar = this.mTab;
            CharSequence charSequence3 = null;
            if (eVar != null) {
                drawable = eVar.c();
            } else {
                drawable = null;
            }
            e eVar2 = this.mTab;
            if (eVar2 != null) {
                charSequence = eVar2.e();
            } else {
                charSequence = null;
            }
            e eVar3 = this.mTab;
            if (eVar3 != null) {
                charSequence2 = eVar3.a();
            } else {
                charSequence2 = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!isEmpty) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!isEmpty && imageView.getVisibility() == 0) {
                    i = TabLayout.this.dpToPx(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (isEmpty) {
                charSequence3 = charSequence2;
            }
            TooltipCompat.setTooltipText(this, charSequence3);
        }

        public e getTab() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("6422f56e", new Object[]{this});
            }
            return this.mTab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9946748", new Object[]{this, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15991ef2", new Object[]{this, accessibilityNodeInfo});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.mTextView != null) {
                getResources();
                float f = TabLayout.this.mTabTextSize;
                int i3 = this.mDefaultMaxLines;
                ImageView imageView = this.mIconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.mTextView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.mTabTextMultiLineSize;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.mTextView.getTextSize();
                int lineCount = this.mTextView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.mTextView);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 == 0 && (maxLines < 0 || i3 == maxLines)) {
                    return;
                }
                if (TabLayout.this.mMode != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.mTextView.getLayout()) != null && approximateLineWidth(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.mTextView.setTextSize(0, f);
                    this.mTextView.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.mTab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.mTab.h();
            this.mTab.j(true);
            return true;
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
                return;
            }
            isSelected();
            super.setSelected(z);
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.mIconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.mCustomView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("995998be", new Object[]{this, eVar});
            } else if (eVar != this.mTab) {
                this.mTab = eVar;
                update();
            }
        }

        public final void update() {
            View view;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            e eVar = this.mTab;
            if (eVar != null) {
                view = eVar.b();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.mCustomView = view;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.mIconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.mCustomTextView = textView2;
                if (textView2 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.mCustomIconView = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.mCustomView;
                if (view2 != null) {
                    removeView(view2);
                    this.mCustomView = null;
                }
                this.mCustomTextView = null;
                this.mCustomIconView = null;
            }
            if (this.mCustomView != null) {
                TextView textView3 = this.mCustomTextView;
                if (!(textView3 == null && this.mCustomIconView == null)) {
                    updateTextAndIcon(textView3, this.mCustomIconView);
                }
            } else if (!zg5.s5()) {
                if (this.mIconView == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView2, 0);
                    this.mIconView = imageView2;
                }
                if (this.mTextView == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView4);
                    this.mTextView = textView4;
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView4);
                }
                TextViewCompat.setTextAppearance(this.mTextView, TabLayout.this.mTabTextAppearance);
                ColorStateList colorStateList = TabLayout.this.mTabTextColors;
                if (colorStateList != null) {
                    this.mTextView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.mTextView, this.mIconView);
            }
            if (eVar != null && eVar.f()) {
                z = true;
            }
            setSelected(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(e eVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(e eVar);

        void b(e eVar, int i);

        void c(e eVar, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597714);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/TabLayout$PagerAdapterObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                TabLayout.this.populateFromPagerAdapter();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                TabLayout.this.populateFromPagerAdapter();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public Drawable f7532a;
        public CharSequence b;
        public CharSequence c;
        public int d = -1;
        public View e;
        public boolean f;
        public TabLayout g;
        public TabView h;

        static {
            t2o.a(444597718);
        }

        public CharSequence a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
            }
            return this.c;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            return this.e;
        }

        public Drawable c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
            }
            return this.f7532a;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public CharSequence e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
            }
            return this.b;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
            }
            TabLayout tabLayout = this.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.getSelectedTabPosition() == this.d) {
                return true;
            } else {
                return false;
            }
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1326540c", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2c5e979", new Object[]{this});
                return;
            }
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.onTabClick(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.g = null;
            this.h = null;
            this.f7532a = null;
            this.b = null;
            this.c = null;
            this.d = -1;
            this.e = null;
        }

        public void j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0247b1", new Object[]{this, new Boolean(z)});
            } else if (this.g != null) {
                p(z);
                if (z) {
                    this.g.selectTab(this, true, true, 3);
                } else {
                    this.g.selectTab(this);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        public e k(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("31624378", new Object[]{this, charSequence});
            }
            this.c = charSequence;
            r();
            return this;
        }

        public e l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("bf43fbac", new Object[]{this, new Integer(i)});
            }
            return m(LayoutInflater.from(this.h.getContext()).inflate(i, (ViewGroup) this.h, false));
        }

        public e m(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f107a3bb", new Object[]{this, view});
            }
            this.e = view;
            r();
            return this;
        }

        public e n(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("1a342d2e", new Object[]{this, drawable});
            }
            this.f7532a = drawable;
            r();
            return this;
        }

        public void o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("209bab94", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }

        public e q(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("2ce1ba62", new Object[]{this, charSequence});
            }
            this.b = charSequence;
            r();
            return this;
        }

        public void r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b12a895", new Object[]{this});
                return;
            }
            TabView tabView = this.h;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f7533a;
        public final boolean b;

        static {
            t2o.a(444597723);
            t2o.a(444597713);
        }

        public f(ViewPager viewPager, boolean z) {
            this.f7533a = viewPager;
            this.b = z;
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0b2d467", new Object[]{this, eVar});
            }
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void b(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a4f6896", new Object[]{this, eVar, new Integer(i)});
            }
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void c(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaa416a3", new Object[]{this, eVar, new Integer(i)});
            } else if (this.b) {
                ViewPager viewPager = this.f7533a;
                if (viewPager instanceof DXNativeViewPagerView) {
                    ((DXNativeViewPagerView) viewPager).setCurrentItem(eVar.d(), i);
                } else {
                    viewPager.setCurrentItem(eVar.d());
                }
            } else {
                ViewPager viewPager2 = this.f7533a;
                if (viewPager2 instanceof DXNativeViewPagerView) {
                    ((DXNativeViewPagerView) viewPager2).setCurrentItem(eVar.d(), false, i);
                } else {
                    viewPager2.setCurrentItem(eVar.d(), false);
                }
            }
        }
    }

    static {
        t2o.a(444597708);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private void addTabFromItemView(TabItem tabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae2dbe3", new Object[]{this, tabItem});
            return;
        }
        e newTab = newTab();
        CharSequence charSequence = tabItem.mText;
        if (charSequence != null) {
            newTab.q(charSequence);
        }
        Drawable drawable = tabItem.mIcon;
        if (drawable != null) {
            newTab.n(drawable);
        }
        int i = tabItem.mCustomLayout;
        if (i != 0) {
            newTab.l(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.k(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    private void addTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a4b758", new Object[]{this, eVar});
        } else {
            this.mTabStrip.addView(eVar.h, eVar.d(), createLayoutParamsForTabs());
        }
    }

    private void addViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a61c8", new Object[]{this, view});
        } else if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
        } else {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
    }

    private void animateToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91a643", new Object[]{this, new Integer(i)});
        } else if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.mTabStrip.childrenNeedLayout()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.start();
            }
            this.mTabStrip.animateIndicatorToPosition(i, 300);
        }
    }

    private void applyModeAndGravity() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe0f", new Object[]{this});
            return;
        }
        if (this.mMode == 0) {
            i = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
        } else {
            i = 0;
        }
        ViewCompat.setPaddingRelative(this.mTabStrip, i, 0, 0, 0);
        int i2 = this.mMode;
        if (i2 == 0) {
            this.mTabStrip.setGravity(GravityCompat.START);
        } else if (i2 == 1) {
            this.mTabStrip.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f2) {
        View view;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb48e268", new Object[]{this, new Integer(i), new Float(f2)})).intValue();
        }
        if (this.mMode != 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.mTabStrip.getChildCount()) {
            view = this.mTabStrip.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) ((i2 + i3) * 0.5f * f2);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private void configureTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a2201", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        eVar.o(i);
        this.mTabs.add(i, eVar);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.mTabs.get(i).o(i);
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("1acfcf45", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("f3a7e4e9", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private TabView createTabView(e eVar) {
        TabView tabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("aa468d16", new Object[]{this, eVar});
        }
        Pools.Pool<TabView> pool = this.mTabViewPool;
        if (pool != null) {
            tabView = pool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(eVar);
        tabView.setFocusable(true);
        tabView.setLeft(0);
        tabView.setRight(0);
        return tabView;
    }

    private void dispatchTabReselected(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d304b9b", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).b(eVar, i);
        }
    }

    private void dispatchTabSelected(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fbf6e8", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).c(eVar, i);
        }
    }

    private void dispatchTabUnselected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3256fcc2", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).a(eVar);
        }
    }

    private void ensureScrollAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612c5839", new Object[]{this});
        } else if (this.mScrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mScrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(iz0.LINEAR_INTERPOLATOR);
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new a());
        }
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.mTabs.get(i);
            if (!(eVar == null || eVar.c() == null || TextUtils.isEmpty(eVar.e()))) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0463283", new Object[]{this})).floatValue();
        }
        return this.mTabStrip.getIndicatorPosition();
    }

    private int getTabMinWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d18030d", new Object[]{this})).intValue();
        }
        int i = this.mRequestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40fd048b", new Object[]{this})).intValue();
        }
        return Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static /* synthetic */ Object ipc$super(TabLayout tabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/viewpager/tab/view/TabLayout");
        }
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mTabStrip.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    private void updateAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9157bd3d", new Object[]{this});
            return;
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            this.mTabs.get(i).r();
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221c2bbd", new Object[]{this, layoutParams});
        } else if (this.mMode == 1 && this.mTabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4273baab", new Object[]{this, bVar});
        } else if (!this.mOnTabClickListeners.contains(bVar)) {
            this.mOnTabClickListeners.add(bVar);
        }
    }

    public void addOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e28415d", new Object[]{this, cVar});
        } else if (!this.mSelectedListeners.contains(cVar)) {
            this.mSelectedListeners.add(cVar);
        }
    }

    public void addTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f290767d", new Object[]{this, eVar});
        } else {
            addTab(eVar, this.mTabs.isEmpty());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            addViewInternal(view);
        }
    }

    public void clearOnTabClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ceb567", new Object[]{this});
        } else {
            this.mOnTabClickListeners.clear();
        }
    }

    public void clearOnTabSelectedListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502e6102", new Object[]{this});
        } else {
            this.mSelectedListeners.clear();
        }
    }

    public int dpToPx(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue();
        }
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public int getSelectedTabPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e05b0107", new Object[]{this})).intValue();
        }
        e eVar = this.mSelectedTab;
        if (eVar != null) {
            return eVar.d();
        }
        return -1;
    }

    public e getTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ed7a4fb2", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.mTabs.get(i);
    }

    public int getTabCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9428606a", new Object[]{this})).intValue();
        }
        return this.mTabs.size();
    }

    public int getTabGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bb7b5e9", new Object[]{this})).intValue();
        }
        return this.mTabGravity;
    }

    public int getTabMaxWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30d0d83b", new Object[]{this})).intValue();
        }
        return this.mTabMaxWidth;
    }

    public int getTabMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82553a1c", new Object[]{this})).intValue();
        }
        return this.mMode;
    }

    public ColorStateList getTabTextColors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("619b6371", new Object[]{this});
        }
        return this.mTabTextColors;
    }

    public e newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d971b8e4", new Object[]{this});
        }
        e acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.g = this;
        acquire.h = createTabView(acquire);
        return acquire;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mViewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mSetupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.mSetupViewPagerImplicitly = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mMode == 0 && (eVar = this.mSelectedTab) != null && eVar.d() > 0) {
            selectTab(this.mSelectedTab);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int dpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.mRequestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = size - dpToPx(56);
            }
            this.mTabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.mMode;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public void onTabClick(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8366d7f", new Object[]{this, eVar});
            return;
        }
        for (int i = 0; i < this.mOnTabClickListeners.size(); i++) {
            this.mOnTabClickListeners.get(i).a(eVar);
        }
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd80467", new Object[]{this});
            return;
        }
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().q(this.mPagerAdapter.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                e tabAt = getTabAt(currentItem);
                if (tabAt != null) {
                    tabAt.p(false);
                }
                selectTab(tabAt);
            }
        }
    }

    public void removeAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df36aa2", new Object[]{this});
            return;
        }
        for (int childCount = this.mTabStrip.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<e> it = this.mTabs.iterator();
        while (it.hasNext()) {
            e next = it.next();
            it.remove();
            next.i();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    public void removeOnTabClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60116ce", new Object[]{this, bVar});
        } else {
            this.mOnTabClickListeners.remove(bVar);
        }
    }

    public void removeOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbab740", new Object[]{this, cVar});
        } else {
            this.mSelectedListeners.remove(cVar);
        }
    }

    public void removeTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f535a1e0", new Object[]{this, eVar});
        } else if (eVar.g == this) {
            removeTabAt(eVar.d());
        } else {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i) {
        int i2;
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar2 = this.mSelectedTab;
        if (eVar2 != null) {
            i2 = eVar2.d();
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        e remove = this.mTabs.remove(i);
        if (remove != null) {
            remove.i();
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.mTabs.get(i3).o(i3);
        }
        if (i2 == i) {
            if (this.mTabs.isEmpty()) {
                eVar = null;
            } else {
                eVar = this.mTabs.get(Math.max(0, i - 1));
            }
            if (eVar != null) {
                eVar.p(false);
            }
            selectTab(eVar);
        }
    }

    public void selectTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5b2a58", new Object[]{this, eVar});
        } else {
            selectTab(eVar, true);
        }
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf5c0b0", new Object[]{this, pagerAdapter, new Boolean(z)});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.mPagerAdapterObserver) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new d();
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setReselectAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9158379", new Object[]{this, new Boolean(z)});
        } else {
            this.mReselectAnimated = z;
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7ad423", new Object[]{this, animatorListener});
            return;
        }
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac71458", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z)});
        } else {
            setScrollPosition(i, f2, z, true);
        }
    }

    public void setSelectedTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d88d4f9", new Object[]{this, eVar});
        } else {
            this.mSelectedTab = eVar;
        }
    }

    public void setSelectedTabIndicatorBottomGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorBottomGap(i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e50f0", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorColor(i);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef09165e", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorHeight(i);
        }
    }

    public void setSelectedTabIndicatorRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873aa5d3", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorRadius(i);
        }
    }

    public void setSelectedTabIndicatorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c5d86d", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorWidth(i);
        }
    }

    public void setSelectedTabIndicatorZIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e89dad", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorZIndex(i);
        }
    }

    public void setTabGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72161541", new Object[]{this, new Integer(i)});
        } else if (this.mTabGravity != i) {
            this.mTabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9b7906", new Object[]{this, new Integer(i)});
        } else if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256ecb5", new Object[]{this, colorStateList});
        } else if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee70210c", new Object[]{this, pagerAdapter});
        } else {
            setPagerAdapter(pagerAdapter, false);
        }
    }

    public void setViewPagerSmoothScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2056e776", new Object[]{this, new Boolean(z)});
        } else {
            this.mViewPagerSmoothScroll = z;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f2d35", new Object[]{this, viewPager});
        } else {
            setupWithViewPager(viewPager, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e4f226", new Object[]{this})).booleanValue();
        }
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public void updateTabViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348b24ab", new Object[]{this, new Boolean(z)});
            return;
        }
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            View childAt = this.mTabStrip.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7ecc26", new Object[]{this, eVar, new Integer(i)});
        } else {
            addTab(eVar, i, this.mTabs.isEmpty());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else {
            addViewInternal(view);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet}) : generateDefaultLayoutParams();
    }

    public void selectTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0ad37c", new Object[]{this, eVar, new Boolean(z)});
        } else {
            selectTab(eVar, z, true, 0);
        }
    }

    public void setScrollPosition(int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1c297c", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
        } else {
            setScrollPosition(i, f2, z, z2, false, false);
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a72c3f", new Object[]{this, viewPager, new Boolean(z)});
        } else {
            setupWithViewPager(viewPager, z, false);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mRequestedTabMinWidth = -1;
        this.mRequestedTabMaxWidth = -1;
        this.mTabGravity = 0;
        this.mMode = 1;
        this.mOnTabClickListeners = new ArrayList<>();
        this.mSelectedListeners = new ArrayList<>();
        this.mReselectAnimated = true;
        this.mTabViewPool = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        Resources resources = getResources();
        this.mTabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
        this.mScrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
        applyModeAndGravity();
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113f0e75", new Object[]{this, viewPager, new Boolean(z), new Boolean(z2)});
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.mPageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.mAdapterChangeListener;
            if (adapterChangeListener != null) {
                this.mViewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        c cVar = this.mCurrentVpSelectedListener;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.mCurrentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.mPageChangeListener.a();
            viewPager.addOnPageChangeListener(this.mPageChangeListener);
            f fVar = new f(viewPager, this.mViewPagerSmoothScroll);
            this.mCurrentVpSelectedListener = fVar;
            addOnTabSelectedListener(fVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new AdapterChangeListener();
            }
            this.mAdapterChangeListener.a(z);
            viewPager.addOnAdapterChangeListener(this.mAdapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.mViewPager = null;
            setPagerAdapter(null, false);
        }
        this.mSetupViewPagerImplicitly = z2;
    }

    public void addTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7f0bf7", new Object[]{this, eVar, new Boolean(z)});
        } else {
            addTab(eVar, this.mTabs.size(), z);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
        } else {
            addViewInternal(view);
        }
    }

    public void selectTab(e eVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5504ed8", new Object[]{this, eVar, new Boolean(z), new Boolean(z2)});
        } else {
            selectTab(eVar, z, z2, 0);
        }
    }

    public void setScrollPosition(int i, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ce14fc", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        int round = Math.round(i + f2);
        if (z3 && round != getSelectedTabPosition()) {
            round = getSelectedTabPosition();
        }
        if (round >= 0 && round < this.mTabStrip.getChildCount()) {
            if (z2) {
                this.mTabStrip.setIndicatorPositionFromTabPosition(i, f2);
            }
            ValueAnimator valueAnimator = this.mScrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mScrollAnimator.cancel();
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i, f2);
            if (!z4) {
                scrollTo(calculateScrollXForTab(i, f2), 0);
            } else if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.start();
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void addTab(e eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905b6b6e", new Object[]{this, eVar, new Integer(i), new Boolean(z)});
        } else if (eVar.g == this) {
            configureTab(eVar, i);
            addTabView(eVar);
            if (z) {
                eVar.j(false);
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
        } else {
            addViewInternal(view);
        }
    }

    public void selectTab(e eVar, boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b9ff2b", new Object[]{this, eVar, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        e eVar2 = this.mSelectedTab;
        if (eVar2 != eVar) {
            int d2 = eVar != null ? eVar.d() : -1;
            if (z) {
                if ((eVar2 == null || eVar2.d() == -1 || !z2) && d2 != -1) {
                    setScrollPosition(d2, 0.0f, true);
                } else {
                    animateToTab(d2);
                }
                if (d2 != -1) {
                    setSelectedTabView(d2);
                }
            }
            if (eVar2 != null) {
                dispatchTabUnselected(eVar2);
            }
            this.mSelectedTab = eVar;
            if (eVar != null) {
                dispatchTabSelected(eVar, i);
            }
        } else if (eVar2 != null) {
            dispatchTabReselected(eVar, i);
            if (this.mReselectAnimated) {
                animateToTab(eVar.d());
            } else {
                setScrollPosition(eVar.d(), 0.0f, true);
            }
        }
    }

    public void setTabTextColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e090dc57", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setTabTextColors(createColorStateList(i, i2));
        }
    }
}
