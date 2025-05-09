package com.taobao.android.turbo.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
@ViewPager.DecorView
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EnhancedTabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    public static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    public static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final Pools.Pool<e> sTabPool = new Pools.SynchronizedPool(16);
    private AdapterChangeListener mAdapterChangeListener;
    private int mContentInsetStart;
    private c mCurrentVpSelectedListener;
    public int mMode;
    private EnhancedTabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private c mSelectedListener;
    private final ArrayList<c> mSelectedListeners;
    private e mSelectedTab;
    private boolean mSetupViewPagerImplicitly;
    public final int mTabBackgroundResId;
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f9813a;

        static {
            t2o.a(916455769);
        }

        public AdapterChangeListener() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ce5dd03", new Object[]{this, new Boolean(z)});
            } else {
                this.f9813a = z;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbf83ca", new Object[]{this, viewPager, pagerAdapter, pagerAdapter2});
                return;
            }
            EnhancedTabLayout enhancedTabLayout = EnhancedTabLayout.this;
            if (enhancedTabLayout.mViewPager == viewPager) {
                enhancedTabLayout.setPagerAdapter(pagerAdapter2, this.f9813a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class EnhancedTabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<EnhancedTabLayout> f9814a;
        public int b;
        public int c;

        static {
            t2o.a(916455771);
        }

        public EnhancedTabLayoutOnPageChangeListener(EnhancedTabLayout enhancedTabLayout) {
            this.f9814a = new WeakReference<>(enhancedTabLayout);
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
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            EnhancedTabLayout enhancedTabLayout = this.f9814a.get();
            if (enhancedTabLayout != null) {
                int i3 = this.c;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z2 = false;
                }
                enhancedTabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            EnhancedTabLayout enhancedTabLayout = this.f9814a.get();
            if (enhancedTabLayout != null && enhancedTabLayout.getSelectedTabPosition() != i && i < enhancedTabLayout.getTabCount()) {
                int i2 = this.c;
                if (!(i2 == 0 || (i2 == 2 && this.b == 0))) {
                    z = false;
                }
                enhancedTabLayout.selectTab(enhancedTabLayout.getTabAt(i), z);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ValueAnimator mIndicatorAnimator;
        private int mSelectedIndicatorHeight;
        public float mSelectionOffset;
        public int mSelectedPosition = -1;
        private int mLayoutDirection = -1;
        private int mIndicatorLeft = -1;
        private int mIndicatorRight = -1;
        private final Paint mSelectedIndicatorPaint = new Paint();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9815a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f9815a = i;
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
                SlidingTabStrip.this.setIndicatorPosition(b.a(this.f9815a, this.b, animatedFraction), b.a(this.c, this.d, animatedFraction));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9816a;

            public b(int i) {
                this.f9816a = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/EnhancedTabLayout$SlidingTabStrip$2");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                slidingTabStrip.mSelectedPosition = this.f9816a;
                slidingTabStrip.mSelectionOffset = 0.0f;
            }
        }

        static {
            t2o.a(916455775);
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/EnhancedTabLayout$SlidingTabStrip");
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
                int dpToPx = EnhancedTabLayout.this.dpToPx(24);
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
                valueAnimator2.setInterpolator(b.FAST_OUT_SLOW_IN_INTERPOLATOR);
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
            super.draw(canvas);
            int i = this.mIndicatorLeft;
            if (i >= 0 && this.mIndicatorRight > i) {
                canvas.drawRect(i, getHeight() - this.mSelectedIndicatorHeight, this.mIndicatorRight, getHeight(), this.mSelectedIndicatorPaint);
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
            } else {
                this.mIndicatorAnimator.cancel();
                animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * ((float) this.mIndicatorAnimator.getDuration())));
            }
            EnhancedTabLayout enhancedTabLayout = EnhancedTabLayout.this;
            enhancedTabLayout.setScrollPosition(enhancedTabLayout.getSelectedTabPosition(), 0.0f, false);
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
                EnhancedTabLayout enhancedTabLayout = EnhancedTabLayout.this;
                if (enhancedTabLayout.mMode == 1 && enhancedTabLayout.mTabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (EnhancedTabLayout.this.dpToPx(16) * 2)) {
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
                            EnhancedTabLayout enhancedTabLayout2 = EnhancedTabLayout.this;
                            enhancedTabLayout2.mTabGravity = 0;
                            enhancedTabLayout2.updateTabViews(false);
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
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface TabGravity {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            t2o.a(916455780);
        }

        public TabView(Context context) {
            super(context);
            int i = EnhancedTabLayout.this.mTabBackgroundResId;
            if (i != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, i));
            }
            ViewCompat.setPaddingRelative(this, EnhancedTabLayout.this.mTabPaddingStart, EnhancedTabLayout.this.mTabPaddingTop, EnhancedTabLayout.this.mTabPaddingEnd, EnhancedTabLayout.this.mTabPaddingBottom);
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/EnhancedTabLayout$TabView");
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
                    i = EnhancedTabLayout.this.dpToPx(8);
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
                return (e) ipChange.ipc$dispatch("b1cb3823", new Object[]{this});
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
            int tabMaxWidth = EnhancedTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(EnhancedTabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.mTextView != null) {
                getResources();
                float f = EnhancedTabLayout.this.mTabTextSize;
                int i3 = this.mDefaultMaxLines;
                ImageView imageView = this.mIconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.mTextView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = EnhancedTabLayout.this.mTabTextMultiLineSize;
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
                if (EnhancedTabLayout.this.mMode != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.mTextView.getLayout()) != null && approximateLineWidth(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
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
                ipChange.ipc$dispatch("a53d6833", new Object[]{this, eVar});
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
            if (this.mTab != null) {
                if (this.mCustomView == null) {
                    if (this.mIconView == null) {
                        ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                        addView(imageView2, 0);
                        this.mIconView = imageView2;
                    }
                    if (this.mTextView == null) {
                        TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                        addView(textView3);
                        this.mTextView = textView3;
                        this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView3);
                    }
                    TextViewCompat.setTextAppearance(this.mTextView, EnhancedTabLayout.this.mTabTextAppearance);
                    ColorStateList colorStateList = EnhancedTabLayout.this.mTabTextColors;
                    if (colorStateList != null) {
                        this.mTextView.setTextColor(colorStateList);
                    }
                    updateTextAndIcon(this.mTextView, this.mIconView);
                } else {
                    TextView textView4 = this.mCustomTextView;
                    if (!(textView4 == null && this.mCustomIconView == null)) {
                        updateTextAndIcon(textView4, this.mCustomIconView);
                    }
                }
            }
            if (eVar != null && eVar.f()) {
                z = true;
            }
            setSelected(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                EnhancedTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();

        static {
            t2o.a(916455770);
        }

        public static int a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("74398815", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue();
            }
            return i + Math.round(f * (i2 - i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void f(e eVar);

        void g(e eVar);

        void h(e eVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455774);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/EnhancedTabLayout$PagerAdapterObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                EnhancedTabLayout.this.populateFromPagerAdapter();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                EnhancedTabLayout.this.populateFromPagerAdapter();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f9819a;
        public int b = -1;
        public View c;
        public EnhancedTabLayout d;
        public TabView e;

        static {
            t2o.a(916455778);
        }

        public CharSequence a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
            }
            return null;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            return this.c;
        }

        public Drawable c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
            }
            return null;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public CharSequence e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
            }
            return this.f9819a;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
            }
            EnhancedTabLayout enhancedTabLayout = this.d;
            if (enhancedTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a EnhancedTabLayout");
            } else if (enhancedTabLayout.getSelectedTabPosition() == this.b) {
                return true;
            } else {
                return false;
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.d = null;
            this.e = null;
            this.f9819a = null;
            this.b = -1;
            this.c = null;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d39db83", new Object[]{this});
                return;
            }
            EnhancedTabLayout enhancedTabLayout = this.d;
            if (enhancedTabLayout != null) {
                enhancedTabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a EnhancedTabLayout");
        }

        public e i(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("c2682070", new Object[]{this, view});
            }
            this.c = view;
            l();
            return this;
        }

        public void j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public e k(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a47a6517", new Object[]{this, charSequence});
            }
            this.f9819a = charSequence;
            l();
            return this;
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b12a895", new Object[]{this});
                return;
            }
            TabView tabView = this.e;
            if (tabView != null) {
                tabView.update();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f9820a;

        static {
            t2o.a(916455781);
            t2o.a(916455773);
        }

        public f(ViewPager viewPager) {
            this.f9820a = viewPager;
        }

        @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
        public void f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61f4bbd5", new Object[]{this, eVar});
            } else {
                this.f9820a.setCurrentItem(eVar.d());
            }
        }

        @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
        public void g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f6d15dc", new Object[]{this, eVar});
            }
        }

        @Override // com.taobao.android.turbo.view.EnhancedTabLayout.c
        public void h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e07cd982", new Object[]{this, eVar});
            }
        }
    }

    static {
        t2o.a(916455767);
    }

    public EnhancedTabLayout(Context context) {
        this(context, null);
    }

    private void addTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bcfacd", new Object[]{this, eVar});
        } else {
            this.mTabStrip.addView(eVar.e, eVar.d(), createLayoutParamsForTabs());
        }
    }

    private void addViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a61c8", new Object[]{this, view});
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to EnhancedTabLayout");
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
            ipChange.ipc$dispatch("ead7b92c", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        eVar.j(i);
        this.mTabs.add(i, eVar);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.mTabs.get(i).j(i);
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
            return (TabView) ipChange.ipc$dispatch("8d0e1dc0", new Object[]{this, eVar});
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
        tabView.setMinimumWidth(getTabMinWidth());
        return tabView;
    }

    private void dispatchTabReselected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb17dd", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).h(eVar);
        }
    }

    private void dispatchTabSelected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5714d4f0", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).f(eVar);
        }
    }

    private void dispatchTabUnselected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceb5437", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).g(eVar);
        }
    }

    private void ensureScrollAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612c5839", new Object[]{this});
        } else if (this.mScrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mScrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(b.FAST_OUT_SLOW_IN_INTERPOLATOR);
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

    public static /* synthetic */ Object ipc$super(EnhancedTabLayout enhancedTabLayout, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/EnhancedTabLayout");
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
            this.mTabs.get(i).l();
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

    public void addOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa07fb92", new Object[]{this, cVar});
        } else if (!this.mSelectedListeners.contains(cVar)) {
            this.mSelectedListeners.add(cVar);
        }
    }

    public void addTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498da3f2", new Object[]{this, eVar});
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
            return (e) ipChange.ipc$dispatch("bf079a67", new Object[]{this, new Integer(i)});
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
            return (e) ipChange.ipc$dispatch("d18ba799", new Object[]{this});
        }
        e acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.d = this;
        acquire.e = createTabView(acquire);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        setScrollPosition(getSelectedTabPosition(), 0.0f, false);
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
                addTab(newTab().k(this.mPagerAdapter.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
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
            next.g();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    public void removeOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8909775", new Object[]{this, cVar});
        } else {
            this.mSelectedListeners.remove(cVar);
        }
    }

    public void removeTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8743f555", new Object[]{this, eVar});
        } else if (eVar.d == this) {
            removeTabAt(eVar.d());
        } else {
            throw new IllegalArgumentException("Tab does not belong to this EnhancedTabLayout.");
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
            remove.g();
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.mTabs.get(i3).j(i3);
        }
        if (i2 == i) {
            if (this.mTabs.isEmpty()) {
                eVar = null;
            } else {
                eVar = this.mTabs.get(Math.max(0, i - 1));
            }
            selectTab(eVar);
        }
    }

    public void selectTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb96dcd", new Object[]{this, eVar});
        } else {
            selectTab(eVar, true);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c27353", new Object[]{this, cVar});
            return;
        }
        c cVar2 = this.mSelectedListener;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.mSelectedListener = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
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

    public EnhancedTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8274d51", new Object[]{this, eVar, new Integer(i)});
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
            ipChange.ipc$dispatch("9b74fea7", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        e eVar2 = this.mSelectedTab;
        if (eVar2 != eVar) {
            int d2 = eVar != null ? eVar.d() : -1;
            if (z) {
                if ((eVar2 == null || eVar2.d() == -1) && d2 != -1) {
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
                dispatchTabSelected(eVar);
            }
        } else if (eVar2 != null) {
            dispatchTabReselected(eVar);
            animateToTab(eVar.d());
        }
    }

    public void setScrollPosition(int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1c297c", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
            return;
        }
        int round = Math.round(i + f2);
        if (round >= 0 && round < this.mTabStrip.getChildCount()) {
            if (z2) {
                this.mTabStrip.setIndicatorPositionFromTabPosition(i, f2);
            }
            ValueAnimator valueAnimator = this.mScrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mScrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f2), 0);
            if (z) {
                setSelectedTabView(round);
            }
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

    /* JADX WARN: Finally extract failed */
    public EnhancedTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mSelectedListeners = new ArrayList<>();
        this.mTabViewPool = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i, R.style.Widget_Design_TabLayout);
        slidingTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
        slidingTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.mTabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R.styleable.TextAppearance);
        try {
            this.mTabTextSize = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            this.mTabTextColors = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            int i2 = R.styleable.TabLayout_tabTextColor;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(i2);
            }
            int i3 = R.styleable.TabLayout_tabSelectedTextColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(i3, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.mTabBackgroundResId = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
            this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.mTabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.mScrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113f0e75", new Object[]{this, viewPager, new Boolean(z), new Boolean(z2)});
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            EnhancedTabLayoutOnPageChangeListener enhancedTabLayoutOnPageChangeListener = this.mPageChangeListener;
            if (enhancedTabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(enhancedTabLayoutOnPageChangeListener);
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
                this.mPageChangeListener = new EnhancedTabLayoutOnPageChangeListener(this);
            }
            this.mPageChangeListener.a();
            viewPager.addOnPageChangeListener(this.mPageChangeListener);
            f fVar = new f(viewPager);
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
            ipChange.ipc$dispatch("e8278d22", new Object[]{this, eVar, new Boolean(z)});
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

    public void addTab(e eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc30fa3", new Object[]{this, eVar, new Integer(i), new Boolean(z)});
        } else if (eVar.d == this) {
            configureTab(eVar, i);
            addTabView(eVar);
            if (z) {
                eVar.h();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different EnhancedTabLayout.");
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

    public void setTabTextColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e090dc57", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setTabTextColors(createColorStateList(i, i2));
        }
    }

    public e newTab(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9b776a33", new Object[]{this, view});
        }
        e acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.i(view);
        acquire.d = this;
        acquire.e = createTabView(acquire);
        return acquire;
    }
}
