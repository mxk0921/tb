package com.taobao.tao.flexbox.layoutmanager.view.tabbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.akt;
import tb.bk2;
import tb.ey8;
import tb.i5c;
import tb.jfw;
import tb.pg1;
import tb.rbi;
import tb.t2o;
import tb.ymt;

/* compiled from: Taobao */
@ViewPager.DecorView
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomTabLayout extends ObservableHorizontalScrollView implements i5c {
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
    private b animateTabRunnable;
    private ey8 fadingEdge;
    public boolean fixedOffset;
    private Handler handler;
    private int isRequestScroll;
    private int mContentInsetStart;
    public int mMode;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private c mSelectedListener;
    private final ArrayList<c> mSelectedListeners;
    private e mSelectedTab;
    public String mTabAlign;
    public int mTabGravity;
    public int mTabMaxWidth;
    public int mTabPaddingBottom;
    public int mTabPaddingEnd;
    public int mTabPaddingStart;
    public int mTabPaddingTop;
    private final d mTabStrip;
    private int mTabStripHeight;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<e> mTabs;
    private Object rawselectFontColor;
    private Object rawselectFontSize;
    private Object rawselectFontStyle;
    private Object rawunselectFontColor;
    private Object rawunselectFontSize;
    private Object rawunselectFontStyle;
    private int selectFontColor;
    private int selectFontSize;
    private int selectFontStyle;
    private n tNode;
    private final HashMap<n, e> tNodeTabHashMap;
    private int unselectFontColor;
    private int unselectFontSize;
    private int unselectFontStyle;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SlidingTabStrip extends LinearLayout implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Drawable indicatorDrawable;
        private int mDiffHeight;
        private ValueAnimator mIndicatorAnimator;
        private int mSelectedIndicatorHeight;
        private int mSelectedIndicatorWidth;
        public float mSelectionOffset;
        public int mSelectedPosition = -1;
        private int mIndicatorLeft = -1;
        public int mIndicatorRight = -1;
        private final Paint mSelectedIndicatorPaint = new Paint();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12408a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f12408a = i;
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
                SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                slidingTabStrip.setIndicatorPosition(slidingTabStrip.lerp(this.f12408a, this.b, animatedFraction), SlidingTabStrip.this.lerp(this.c, this.d, animatedFraction));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12409a;

            public b(int i) {
                this.f12409a = i;
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
                SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                slidingTabStrip.mSelectedPosition = this.f12409a;
                slidingTabStrip.mSelectionOffset = 0.0f;
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
                }
            }
        }

        static {
            t2o.a(503317544);
            t2o.a(503317547);
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
                case 1273305472:
                    super.removeViewAt(((Number) objArr[0]).intValue());
                    return null;
                case 1992612095:
                    super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/tabbar/CustomTabLayout$SlidingTabStrip");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams, rbi rbiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19b0028e", new Object[]{this, view, new Integer(i), layoutParams, rbiVar});
            } else {
                super.addView(view, i, layoutParams);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
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
                int dpToPx = CustomTabLayout.this.dpToPx(24);
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
                valueAnimator2.setInterpolator(new FastOutSlowInInterpolator());
                valueAnimator2.setDuration(i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new a(i4, left, i3, right));
                valueAnimator2.addListener(new b(i));
                valueAnimator2.start();
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
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
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            super.draw(canvas);
            int i2 = this.mSelectedIndicatorWidth;
            if (i2 > 0) {
                int i3 = this.mIndicatorRight;
                int i4 = this.mIndicatorLeft;
                int i5 = ((i3 - i4) - i2) / 2;
                if (i5 >= 0) {
                    i = i5;
                }
                if (i4 >= 0 && i3 > i4) {
                    Drawable drawable = this.indicatorDrawable;
                    if (drawable != null) {
                        drawable.setBounds(i4 + i, (getHeight() - this.mSelectedIndicatorHeight) - this.mDiffHeight, this.mIndicatorRight - i, getHeight() - this.mDiffHeight);
                        this.indicatorDrawable.draw(canvas);
                        return;
                    }
                    canvas.drawRect(i4 + i, (getHeight() - this.mSelectedIndicatorHeight) - this.mDiffHeight, this.mIndicatorRight - i, getHeight() - this.mDiffHeight, this.mSelectedIndicatorPaint);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public int getCurrentImplementVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0a83a12", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public float getIndicatorPosition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46fca719", new Object[]{this})).floatValue();
            }
            return this.mSelectedPosition + this.mSelectionOffset;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public View getSelfView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("865eef50", new Object[]{this});
            }
            return this;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public boolean isRunningIndicatorAnimation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d2c43d5", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }

        public int lerp(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("74398815", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).intValue();
            }
            return i + Math.round(f * (i2 - i));
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
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            if (customTabLayout.fixedOffset) {
                CustomTabLayout.access$500(customTabLayout);
            }
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
                CustomTabLayout customTabLayout = CustomTabLayout.this;
                if (customTabLayout.mMode == 1 && customTabLayout.mTabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (CustomTabLayout.this.dpToPx(16) * 2)) {
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
                            CustomTabLayout customTabLayout2 = CustomTabLayout.this;
                            customTabLayout2.mTabGravity = 0;
                            customTabLayout2.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewGroup, com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void removeViewAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            } else {
                super.removeViewAt(i);
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void setSelectedIndicatorColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4398e8eb", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorPaint.getColor() != i) {
                this.mSelectedIndicatorPaint.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void setSelectedIndicatorDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bedcd05b", new Object[]{this, drawable});
            } else if (drawable != this.indicatorDrawable) {
                this.indicatorDrawable = drawable;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void setSelectedIndicatorHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8017dc3", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorHeight != i) {
                this.mSelectedIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void setSelectedIndicatorWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98207068", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorWidth != i) {
                this.mSelectedIndicatorWidth = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void setmDiffHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4774cd85", new Object[]{this, new Integer(i)});
            } else {
                this.mDiffHeight = i;
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.d
        public void updateIndicatorPosition() {
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
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface TabGravity {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TabView extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View mCustomView;
        private e mTab;

        static {
            t2o.a(503317550);
        }

        public TabView(Context context) {
            super(context);
            ViewCompat.setPaddingRelative(this, CustomTabLayout.this.mTabPaddingStart, CustomTabLayout.this.mTabPaddingTop, CustomTabLayout.this.mTabPaddingEnd, CustomTabLayout.this.mTabPaddingBottom);
            setClickable(true);
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/tabbar/CustomTabLayout$TabView");
            }
        }

        public e getTab() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("6552d9d0", new Object[]{this});
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            View view = this.mCustomView;
            if (view != null) {
                view.measure(i, i2);
                setMeasuredDimension(this.mCustomView.getLayoutParams().width, this.mCustomView.getLayoutParams().height);
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = CustomTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(CustomTabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
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
            this.mTab.i(true);
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
            View view = this.mCustomView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edad99fa", new Object[]{this, eVar});
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
                view = eVar.c();
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
            } else {
                View view2 = this.mCustomView;
                if (view2 != null) {
                    removeView(view2);
                    this.mCustomView = null;
                }
            }
            if (eVar != null && eVar.f()) {
                z = true;
            }
            setSelected(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                CustomTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f12411a;

        static {
            t2o.a(503317541);
        }

        private b() {
        }

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9a5e791", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.f12411a = i;
            return i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CustomTabLayout.access$200(CustomTabLayout.this, this.f12411a);
            }
        }

        public /* synthetic */ b(CustomTabLayout customTabLayout, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(e eVar);

        void b(e eVar);

        void c(e eVar, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        public static final int SLIDING_VERSION_FLATVIEWGROUP = 2;
        public static final int SLIDING_VERSION_LINEALAYOUT = 1;

        void addView(View view, int i, ViewGroup.LayoutParams layoutParams, rbi rbiVar);

        void animateIndicatorToPosition(int i, int i2);

        boolean childrenNeedLayout();

        View getChildAt(int i);

        int getChildCount();

        int getCurrentImplementVersion();

        float getIndicatorPosition();

        View getSelfView();

        int getWidth();

        boolean isRunningIndicatorAnimation();

        void removeViewAt(int i);

        void setClipChildren(boolean z);

        void setGravity(int i);

        void setIndicatorPositionFromTabPosition(int i, float f);

        void setSelectedIndicatorColor(int i);

        void setSelectedIndicatorDrawable(Drawable drawable);

        void setSelectedIndicatorHeight(int i);

        void setSelectedIndicatorWidth(int i);

        void setWillNotDraw(boolean z);

        void setmDiffHeight(int i);

        void updateIndicatorPosition();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f12412a = -1;
        public View b;
        public n c;
        public CustomTabLayout d;
        public TabView e;

        static {
            t2o.a(503317548);
        }

        public static /* synthetic */ n a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("435700d9", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ View b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("3d45859a", new Object[]{eVar});
            }
            return eVar.b;
        }

        public View c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            return this.b;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.f12412a;
        }

        public n e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("45ec8f69", new Object[]{this});
            }
            return this.c;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
            }
            CustomTabLayout customTabLayout = this.d;
            if (customTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
            } else if (customTabLayout.getSelectedTabPosition() == this.f12412a) {
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
            this.f12412a = -1;
            this.b = null;
            this.c = null;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d39db83", new Object[]{this});
                return;
            }
            CustomTabLayout customTabLayout = this.d;
            if (customTabLayout != null) {
                customTabLayout.selectTab(this, false);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
        }

        public void i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0247b1", new Object[]{this, new Boolean(z)});
                return;
            }
            CustomTabLayout customTabLayout = this.d;
            if (customTabLayout != null) {
                customTabLayout.selectTab(this, z);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
        }

        public e j(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7503f523", new Object[]{this, view});
            }
            this.b = view;
            m();
            return this;
        }

        public void k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
            } else {
                this.f12412a = i;
            }
        }

        public e l(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("423dc4ff", new Object[]{this, nVar});
            }
            this.c = nVar;
            if (!(this.e == null || nVar == null || nVar.K().getViewParams().a0)) {
                this.e.setClipChildren(false);
            }
            return this;
        }

        public void m() {
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

    static {
        t2o.a(503317539);
        t2o.a(503316910);
    }

    public CustomTabLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$200(CustomTabLayout customTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f856f9", new Object[]{customTabLayout, new Integer(i)});
        } else {
            customTabLayout.animateToTab(i);
        }
    }

    public static /* synthetic */ void access$500(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2447a4d", new Object[]{customTabLayout});
        } else {
            customTabLayout.fixedOffset();
        }
    }

    private void addTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec64ea0", new Object[]{this, eVar});
        } else {
            this.mTabStrip.addView(eVar.e, eVar.d(), createLayoutParamsForTabs(eVar), e.a(eVar).S());
        }
    }

    private void animateToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91a643", new Object[]{this, new Integer(i)});
            return;
        }
        this.handler.removeCallbacks(this.animateTabRunnable);
        if (i != -1) {
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

    private int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb48e268", new Object[]{this, new Integer(i), new Float(f)})).intValue();
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
        int i5 = (int) ((i2 + i3) * 0.5f * f);
        if (this.fixedOffset) {
            left -= getLeftRightDiffOffset();
        }
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    private void configureTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849be7cd", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        eVar.k(i);
        this.mTabs.add(i, eVar);
        this.tNodeTabHashMap.put(e.a(eVar), eVar);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.mTabs.get(i).k(i);
            } else {
                return;
            }
        }
    }

    private ViewGroup.LayoutParams createLayoutParamsForTabs(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6890c8f", new Object[]{this, eVar});
        }
        if (this.mTabStrip.getCurrentImplementVersion() == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (e.a(eVar).K() != null) {
                jfw viewParams = e.a(eVar).K().getViewParams();
                layoutParams.leftMargin = viewParams.k;
                layoutParams.rightMargin = viewParams.l;
            }
            updateTabViewLayoutParams(layoutParams);
            return layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(e.a(eVar).S().f27261a, -1);
        if (e.a(eVar).K() != null) {
            jfw viewParams2 = e.a(eVar).K().getViewParams();
            marginLayoutParams.leftMargin = viewParams2.k;
            marginLayoutParams.rightMargin = viewParams2.l;
        }
        replaceMeasureResultToChildLayout(eVar);
        return marginLayoutParams;
    }

    private TabView createTabView(e eVar) {
        TabView tabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("654d8dcc", new Object[]{this, eVar});
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
            ipChange.ipc$dispatch("b903f390", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).b(eVar);
        }
    }

    private void dispatchTabSelected(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24ef97", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).c(eVar, z);
        }
    }

    private void dispatchTabUnselected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745cb676", new Object[]{this, eVar});
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
            valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new a());
        }
    }

    private void fixedOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11f6a2e", new Object[]{this});
        } else if (canScrollHorizontally(1) || canScrollHorizontally(-1)) {
            this.mTabStrip.getSelfView().setTranslationX(0.0f);
        } else {
            this.mTabStrip.getSelfView().setTranslationX(getLeftRightDiffOffset() - (this.mTabStrip.getSelfView().getPaddingLeft() / 2));
        }
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        return 48;
    }

    private int getLeftRightDiffOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffd8e6f1", new Object[]{this})).intValue();
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return (((this.tNode.g0().w0().getWidth() - iArr[0]) - getWidth()) - iArr[0]) / 2;
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

    public static /* synthetic */ Object ipc$super(CustomTabLayout customTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/tabbar/CustomTabLayout");
        }
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
        if (tabView != null) {
            this.mTabStrip.removeViewAt(i);
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    private boolean replaceMeasureResultToChildLayout(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b0ad4f", new Object[]{this, eVar})).booleanValue();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.b(eVar).getLayoutParams();
        if (marginLayoutParams.width == e.a(eVar).S().f27261a && marginLayoutParams.topMargin == e.a(eVar).S().d && marginLayoutParams.height == e.a(eVar).S().b) {
            return false;
        }
        marginLayoutParams.topMargin = e.a(eVar).S().d;
        marginLayoutParams.width = e.a(eVar).S().f27261a;
        marginLayoutParams.height = e.a(eVar).S().b;
        e.b(eVar).setLayoutParams(marginLayoutParams);
        e.b(eVar).invalidate();
        return true;
    }

    private boolean replaceMeasureResultToTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40827fc3", new Object[]{this, eVar})).booleanValue();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eVar.e.getLayoutParams();
        if (marginLayoutParams.width == e.a(eVar).S().f27261a) {
            return false;
        }
        marginLayoutParams.width = e.a(eVar).S().f27261a;
        eVar.e.setLayoutParams(marginLayoutParams);
        eVar.e.invalidate();
        return true;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        int i3;
        int i4;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 == i) {
                    z = true;
                } else {
                    z = false;
                }
                this.mTabStrip.getChildAt(i5).setSelected(z);
                e eVar = this.mTabs.get(i5);
                if (eVar != null) {
                    n x = eVar.e().x(TextComponent.class);
                    if (z) {
                        obj = getRawselectFontSize();
                    } else {
                        obj = getRawunselectFontSize();
                    }
                    if (z) {
                        obj2 = getRawselectFontColor();
                    } else {
                        obj2 = getRawunselectFontColor();
                    }
                    if (z) {
                        obj3 = getRawselectFontStyle();
                    } else {
                        obj3 = getRawunselectFontStyle();
                    }
                    if (z) {
                        i2 = getSelectFontSize();
                    } else {
                        i2 = getUnselectFontSize();
                    }
                    if (z) {
                        i3 = getSelectFontColor();
                    } else {
                        i3 = getUnselectFontColor();
                    }
                    if (z) {
                        i4 = getSelectFontStyle();
                    } else {
                        i4 = getUnselectFontStyle();
                    }
                    if (x != null) {
                        TextComponent textComponent = (TextComponent) x.K();
                        ymt ymtVar = (ymt) textComponent.getViewParams();
                        if (i2 > 0) {
                            x.g1(pg1.ATOM_EXT_UDL_font_size, obj);
                            ymtVar.w0 = i2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i3 != 1) {
                            x.g1("color", obj2);
                            ymtVar.C0 = i3;
                            z2 = true;
                        }
                        if (i4 > -1) {
                            x.g1(pg1.ATOM_EXT_UDL_font_style, obj3);
                            ymtVar.B0 = i4;
                            z2 = true;
                        }
                        if (z2) {
                            textComponent.refreshText();
                        }
                    }
                }
            }
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
            ipChange.ipc$dispatch("ba22425b", new Object[]{this, cVar});
        } else if (!this.mSelectedListeners.contains(cVar)) {
            this.mSelectedListeners.add(cVar);
        }
    }

    public void addTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb52741b", new Object[]{this, eVar});
        } else {
            addTab(eVar, this.mTabs.isEmpty());
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

    public void customScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e01120", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            scrollTo(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.fadingEdge.c()) {
            int e2 = this.fadingEdge.e(canvas);
            super.dispatchDraw(canvas);
            this.fadingEdge.f(canvas);
            this.fadingEdge.d(canvas, e2);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public int dpToPx(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue();
        }
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView
    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
            return;
        }
        setOverScrollMode(0);
        bk2.a(this, false);
    }

    public Object getRawselectFontColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3424b9c5", new Object[]{this});
        }
        return this.rawselectFontColor;
    }

    public Object getRawselectFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d05c34cd", new Object[]{this});
        }
        return this.rawselectFontSize;
    }

    public Object getRawselectFontStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff606837", new Object[]{this});
        }
        return this.rawselectFontStyle;
    }

    public Object getRawunselectFontColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83ccfb5e", new Object[]{this});
        }
        return this.rawunselectFontColor;
    }

    public Object getRawunselectFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e48dc14", new Object[]{this});
        }
        return this.rawunselectFontSize;
    }

    public Object getRawunselectFontStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4f08a9d0", new Object[]{this});
        }
        return this.rawunselectFontStyle;
    }

    public int getSelectFontColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eb097fc", new Object[]{this})).intValue();
        }
        return this.selectFontColor;
    }

    public int getSelectFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b97e7c", new Object[]{this})).intValue();
        }
        return this.selectFontSize;
    }

    public int getSelectFontStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8438af4a", new Object[]{this})).intValue();
        }
        return this.selectFontStyle;
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
            return (e) ipChange.ipc$dispatch("6e6c80c", new Object[]{this, new Integer(i)});
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

    public int getUnselectFontColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b9ede43", new Object[]{this})).intValue();
        }
        return this.unselectFontColor;
    }

    public int getUnselectFontSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a55d355", new Object[]{this})).intValue();
        }
        return this.unselectFontSize;
    }

    public int getUnselectFontStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8126f591", new Object[]{this})).intValue();
        }
        return this.unselectFontStyle;
    }

    public e newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("99dc851a", new Object[]{this});
        }
        e acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.d = this;
        acquire.e = createTabView(acquire);
        return acquire;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.isRequestScroll != -1 && this.mTabStrip.getSelfView().getWidth() != 0) {
            scrollTo(this.isRequestScroll, 0);
            this.isRequestScroll = -1;
        } else if (akt.q0() && !this.mTabStrip.isRunningIndicatorAnimation()) {
            this.mTabStrip.updateIndicatorPosition();
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
            ipChange.ipc$dispatch("6dde88d8", new Object[]{this, cVar});
        } else {
            this.mSelectedListeners.remove(cVar);
        }
    }

    public void removeTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52b518", new Object[]{this, eVar});
        } else if (eVar.d == this) {
            removeTabAt(eVar.d());
        } else {
            throw new IllegalArgumentException("Tab does not belong to this CustomTabLayout.");
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
        if (i >= 0 && i < this.mTabs.size()) {
            e remove = this.mTabs.remove(i);
            this.tNodeTabHashMap.remove(e.a(remove));
            if (remove != null) {
                remove.g();
                sTabPool.release(remove);
            }
            int size = this.mTabs.size();
            for (int i3 = i; i3 < size; i3++) {
                this.mTabs.get(i3).k(i3);
            }
            if (i2 == i) {
                if (this.mTabs.isEmpty()) {
                    eVar = null;
                } else {
                    eVar = this.mTabs.get(Math.max(0, i - 1));
                }
                selectTab(eVar, false);
            }
        }
    }

    public void scrollToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601c632f", new Object[]{this, new Integer(i)});
        } else {
            setScrollPosition(i, 0.0f, false, false, false);
        }
    }

    public void selectTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
            return;
        }
        e tabAt = getTabAt(i);
        if (tabAt != null) {
            tabAt.i(true);
        }
    }

    public void setDiffHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ee508e", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setmDiffHeight(i);
        }
    }

    @Override // tb.i5c
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
        } else {
            this.fadingEdge.g(iArr);
        }
    }

    public void setIndicatorWillNotDraw(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f001b5", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabStrip.setWillNotDraw(z);
        }
    }

    public void setIsRequestScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ff24ec", new Object[]{this, new Integer(i)});
        } else {
            this.isRequestScroll = i;
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc024ba", new Object[]{this, cVar});
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

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7ad423", new Object[]{this, animatorListener});
            return;
        }
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac71458", new Object[]{this, new Integer(i), new Float(f), new Boolean(z)});
        } else {
            setScrollPosition(i, f, z, true, false);
        }
    }

    public void setSelectFontColor(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a05740a", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontColor = obj;
        this.selectFontColor = i;
    }

    public void setSelectFontSize(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6743f2", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontSize = obj;
        this.selectFontSize = i;
    }

    public void setSelectFontStyle(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f4dfc", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontStyle = obj;
        this.selectFontStyle = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e50f0", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorColor(i);
        }
    }

    public void setSelectedTabIndicatorDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a390ca0", new Object[]{this, drawable});
        } else {
            this.mTabStrip.setSelectedIndicatorDrawable(drawable);
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

    public void setSelectedTabIndicatorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c5d86d", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorWidth(i);
        }
    }

    public void setTabAlign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f9403", new Object[]{this, str});
        } else if (this.mTabStrip.getCurrentImplementVersion() == 1 && !this.mTabAlign.equals(str)) {
            this.mTabAlign = str;
            applyModeAndGravity();
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

    public void setUnselectFontColor(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0670f63", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontColor = obj;
        this.unselectFontColor = i;
    }

    public void setUnselectFontSize(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af285979", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontSize = obj;
        this.unselectFontSize = i;
    }

    public void setUnselectFontStyle(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb70e955", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontStyle = obj;
        this.unselectFontStyle = i;
    }

    public void settNode(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b642cb7", new Object[]{this, nVar});
            return;
        }
        this.tNode = nVar;
        if (nVar != null && !nVar.K().getViewParams().a0) {
            this.mTabStrip.setClipChildren(false);
        }
        ((ViewGroup) this.mTabStrip.getSelfView()).setClipToPadding(false);
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

    public void updateFixedOffset(e.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20f6598", new Object[]{this, hVar});
            return;
        }
        boolean z = hVar.Y0;
        this.fixedOffset = z;
        this.fadingEdge.b(z);
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

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefc8248", new Object[]{this, eVar, new Integer(i)});
        } else {
            addTab(eVar, i, this.mTabs.isEmpty());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet}) : generateDefaultLayoutParams();
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3569b8d8", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        int round = Math.round(i + f);
        if (round >= 0 && round < this.mTabStrip.getChildCount()) {
            if (z2) {
                this.mTabStrip.setIndicatorPositionFromTabPosition(i, f);
            }
            ValueAnimator valueAnimator = this.mScrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mScrollAnimator.cancel();
            }
            int calculateScrollXForTab = calculateScrollXForTab(i, f);
            if (z3) {
                smoothScrollTo(calculateScrollXForTab, 0);
            } else {
                scrollTo(calculateScrollXForTab, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fadingEdge = new ey8(this);
        this.mTabs = new ArrayList<>();
        this.tNodeTabHashMap = new HashMap<>();
        this.mTabStripHeight = 0;
        this.isRequestScroll = -1;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mTabAlign = "";
        this.mSelectedListeners = new ArrayList<>();
        this.mTabViewPool = new Pools.SimplePool(12);
        this.selectFontSize = -1;
        this.rawselectFontSize = null;
        this.unselectFontSize = -1;
        this.rawunselectFontSize = null;
        this.selectFontColor = 1;
        this.rawselectFontColor = null;
        this.unselectFontColor = 1;
        this.rawunselectFontColor = null;
        this.selectFontStyle = -1;
        this.rawselectFontStyle = null;
        this.unselectFontStyle = -1;
        this.rawunselectFontStyle = null;
        this.handler = new Handler();
        this.animateTabRunnable = new b(this, null);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        super.addView(slidingTabStrip.getSelfView(), 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i, R.style.Widget_Design_TabLayout);
        slidingTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
        slidingTabStrip.setSelectedIndicatorColor(17170445);
        this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
        this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
        this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
        this.mMode = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
        this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
        obtainStyledAttributes.recycle();
        this.mScrollableTabMinWidth = dpToPx(72);
        applyModeAndGravity();
    }

    private void applyModeAndGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe0f", new Object[]{this});
            return;
        }
        if (this.mMode == 0) {
            Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
        }
        if ("right".equals(this.mTabAlign)) {
            this.mTabStrip.setGravity(GravityCompat.END);
        } else if ("center".equals(this.mTabAlign)) {
            this.mTabStrip.setGravity(1);
        } else {
            int i = this.mMode;
            if (i == 0) {
                this.mTabStrip.setGravity(GravityCompat.START);
            } else if (i == 1) {
                this.mTabStrip.setGravity(1);
            }
        }
        updateTabViews(true);
    }

    public void addTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefcc219", new Object[]{this, eVar, new Boolean(z)});
        } else {
            addTab(eVar, this.mTabs.size(), z);
        }
    }

    public int getTabPosition(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6452dff6", new Object[]{this, nVar})).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.mTabs.size(); i2++) {
            if (nVar == e.a(this.mTabs.get(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            return i;
        }
        throw new IllegalArgumentException("tnode is not child");
    }

    public void selectTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e9eb34", new Object[]{this, eVar, new Boolean(z)});
        } else {
            selectTab(eVar, true, z);
        }
    }

    public void addTab(e eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3094798c", new Object[]{this, eVar, new Integer(i), new Boolean(z)});
        } else if (eVar.d == this) {
            configureTab(eVar, i);
            addTabView(eVar);
            if (z) {
                eVar.h();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different CustomTabLayout.");
        }
    }

    public void selectTab(e eVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99542e20", new Object[]{this, eVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        e eVar2 = this.mSelectedTab;
        if (eVar2 != eVar) {
            int d2 = eVar != null ? eVar.d() : -1;
            if (z) {
                if ((eVar2 == null || eVar2.d() == -1) && d2 != -1) {
                    setScrollPosition(d2, 0.0f, true);
                    if (d2 > 0) {
                        this.handler.removeCallbacks(this.animateTabRunnable);
                        b.a(this.animateTabRunnable, d2);
                        this.handler.post(this.animateTabRunnable);
                    }
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
                dispatchTabSelected(eVar, z2);
            }
        } else if (eVar2 != null) {
            dispatchTabReselected(eVar);
            animateToTab(eVar.d());
        }
    }
}
