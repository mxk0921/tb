package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeSecondTabView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.arq;
import tb.as7;
import tb.frr;
import tb.gpt;
import tb.iy4;
import tb.jz0;
import tb.pg1;
import tb.sj7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveHomeTabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    private static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int SELECTED_TAB_ADD_WIDTH = 20;
    private static final int TAB_MIN_WIDTH_MARGIN = 24;
    private static final Pools.Pool<h> sTabPool = new Pools.SynchronizedPool(16);
    private int dividerColor;
    private int dividerGravity;
    private int dividerHeight;
    private int dividerWidth;
    private int mContentInsetStart;
    private int mMode;
    private d mOnTabClickListener;
    private e mOnTabSelectedListener;
    private List<e> mOnTabSelectedListenerList;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private g mRightTopMarkListener;
    private com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private List<HomeSecondTabView.SecondTab> mSecondTabs;
    private h mSelectedTab;
    private int mTabGravity;
    private boolean mTabImageChange;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private float mTabSelectedTextSize;
    private final SlidingTabStrip mTabStrip;
    private int mTabTextAppearance;
    private ColorStateList mTabTextColors;
    private float mTabTextMultiLineSize;
    private int mTabTextNormalColor;
    private int mTabTextSelectedColor;
    private float mTabTextSize;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<h> mTabs;
    private ViewPager mViewPager;
    private c mXTabCustomListener;
    private final int xTabBackgroundColor;
    private int xTabDisplayNum;
    private boolean xTabDividerWidthWidthText;
    private final int xTabSelectedBackgroundColor;
    private boolean xTabTextAllCaps;
    private boolean xTabTextBold;
    private boolean xTabTextSelectedBold;
    private boolean xTabTextShadowLayer;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a mIndicatorAnimator;
        private int mSelectedIndicatorBottomGap;
        private int mSelectedIndicatorHeight;
        private int mSelectedIndicatorWidth;
        private float mSelectionOffset;
        private int mSelectedPosition = -1;
        private int mIndicatorLeft = -1;
        private int mIndicatorRight = -1;
        private final Paint mSelectedIndicatorPaint = new Paint();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements a.e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8849a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f8849a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a.e
            public void a(com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53c3b125", new Object[]{this, aVar});
                    return;
                }
                float b = aVar.b();
                SlidingTabStrip.access$3900(SlidingTabStrip.this, jz0.a(this.f8849a, this.b, b), jz0.a(this.c, this.d, b));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b extends a.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8850a;

            public b(int i) {
                this.f8850a = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/LiveHomeTabLayout$SlidingTabStrip$2");
            }

            public void c(com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4d22e3cd", new Object[]{this, aVar});
                    return;
                }
                SlidingTabStrip.access$4002(SlidingTabStrip.this, this.f8850a);
                SlidingTabStrip.access$4102(SlidingTabStrip.this, 0.0f);
            }
        }

        static {
            t2o.a(310378816);
        }

        public SlidingTabStrip(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public static /* synthetic */ void access$3900(SlidingTabStrip slidingTabStrip, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d4fd896", new Object[]{slidingTabStrip, new Integer(i), new Integer(i2)});
            } else {
                slidingTabStrip.setIndicatorPosition(i, i2);
            }
        }

        public static /* synthetic */ int access$4002(SlidingTabStrip slidingTabStrip, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ebea8468", new Object[]{slidingTabStrip, new Integer(i)})).intValue();
            }
            slidingTabStrip.mSelectedPosition = i;
            return i;
        }

        public static /* synthetic */ float access$4102(SlidingTabStrip slidingTabStrip, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("823cc81", new Object[]{slidingTabStrip, new Float(f)})).floatValue();
            }
            slidingTabStrip.mSelectionOffset = f;
            return f;
        }

        public static /* synthetic */ Object ipc$super(SlidingTabStrip slidingTabStrip, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == -244855388) {
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            } else if (hashCode == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/LiveHomeTabLayout$SlidingTabStrip");
            }
        }

        private void setIndicatorPosition(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90adc6bd", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int access$1400 = i + LiveHomeTabLayout.access$1400(LiveHomeTabLayout.this);
            int access$1600 = i2 - LiveHomeTabLayout.access$1600(LiveHomeTabLayout.this);
            if (access$1400 != this.mIndicatorLeft || access$1600 != this.mIndicatorRight) {
                this.mIndicatorLeft = access$1400;
                this.mIndicatorRight = access$1600;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        private void updateIndicatorPosition() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a047396", new Object[]{this});
                return;
            }
            View childAt = getChildAt(this.mSelectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.mSelectedIndicatorWidth == 0 && !LiveHomeTabLayout.access$3800(LiveHomeTabLayout.this)) {
                    this.mSelectedIndicatorWidth = 16843039;
                }
                int i5 = this.mSelectedIndicatorWidth;
                if (i5 != 0 && (i3 = this.mIndicatorRight - this.mIndicatorLeft) > i5) {
                    i4 = (i3 - i5) / 2;
                    i += i4;
                    i2 -= i4;
                }
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    int left = childAt2.getLeft() + i4;
                    int right = childAt2.getRight() - i4;
                    float f = this.mSelectionOffset;
                    i = (int) ((left * f) + ((1.0f - f) * i));
                    i2 = (int) ((right * f) + ((1.0f - f) * i2));
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
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar = this.mIndicatorAnimator;
            if (aVar != null && aVar.e()) {
                this.mIndicatorAnimator.a();
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
                int access$2800 = LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 24);
                if (i >= this.mSelectedPosition ? !z : z) {
                    i5 = left - access$2800;
                } else {
                    i5 = access$2800 + right;
                }
                i4 = i5;
                i3 = i4;
            }
            if (i4 != left || i3 != right) {
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a a2 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.c.a();
                this.mIndicatorAnimator = a2;
                a2.i(jz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
                a2.f(i2);
                a2.g(0.0f, 1.0f);
                a2.k(new a(i4, left, i3, right));
                a2.j(new b(i));
                a2.l();
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
                if (this.mSelectedIndicatorWidth == 0 || LiveHomeTabLayout.access$3800(LiveHomeTabLayout.this)) {
                    int i2 = this.mIndicatorRight - this.mIndicatorLeft;
                    if (i2 > LiveHomeTabLayout.access$4200(LiveHomeTabLayout.this).p()) {
                        this.mIndicatorLeft += (i2 - LiveHomeTabLayout.access$4200(LiveHomeTabLayout.this).p()) / 2;
                        this.mIndicatorRight -= (i2 - LiveHomeTabLayout.access$4200(LiveHomeTabLayout.this).p()) / 2;
                    }
                } else {
                    int i3 = this.mIndicatorRight;
                    int i4 = this.mIndicatorLeft;
                    int i5 = i3 - i4;
                    int i6 = this.mSelectedIndicatorWidth;
                    if (i5 > i6) {
                        this.mIndicatorLeft = i4 + ((i5 - i6) / 2);
                        this.mIndicatorRight = i3 - ((i5 - i6) / 2);
                    }
                }
                canvas.drawRoundRect(new RectF(this.mIndicatorLeft, (getHeight() - this.mSelectedIndicatorHeight) - this.mSelectedIndicatorBottomGap, this.mIndicatorRight, getHeight() - this.mSelectedIndicatorBottomGap), 2.0f, 2.0f, this.mSelectedIndicatorPaint);
            }
        }

        public float getIndicatorPosition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46fca719", new Object[]{this})).floatValue();
            }
            return this.mSelectedPosition + this.mSelectionOffset;
        }

        public int getmSelectedIndicatorWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("930ac923", new Object[]{this})).intValue();
            }
            return this.mSelectedIndicatorWidth;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar = this.mIndicatorAnimator;
            if (aVar == null || !aVar.e()) {
                updateIndicatorPosition();
                return;
            }
            this.mIndicatorAnimator.a();
            animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.b()) * ((float) this.mIndicatorAnimator.d())));
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
            if (View.MeasureSpec.getMode(i) == 1073741824 && LiveHomeTabLayout.access$3200(LiveHomeTabLayout.this) == 1 && LiveHomeTabLayout.access$3600(LiveHomeTabLayout.this) == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 16) * 2)) {
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
                        LiveHomeTabLayout.access$3602(LiveHomeTabLayout.this, 0);
                        LiveHomeTabLayout.access$3700(LiveHomeTabLayout.this, false);
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2e0842", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar = this.mIndicatorAnimator;
            if (aVar != null && aVar.e()) {
                this.mIndicatorAnimator.a();
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

        public void setSelectedTabIndicatorBottomGap(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorBottomGap != i) {
                this.mSelectedIndicatorBottomGap = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setmSelectedIndicatorWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c93832df", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorWidth != i) {
                this.mSelectedIndicatorWidth = i;
                ViewCompat.postInvalidateOnAnimation(this);
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
        public final WeakReference<LiveHomeTabLayout> f8851a;
        public int b;
        public int c;

        static {
            t2o.a(310378821);
        }

        public TabLayoutOnPageChangeListener(LiveHomeTabLayout liveHomeTabLayout) {
            this.f8851a = new WeakReference<>(liveHomeTabLayout);
        }

        public static /* synthetic */ void a(TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52ad51a9", new Object[]{tabLayoutOnPageChangeListener});
            } else {
                tabLayoutOnPageChangeListener.b();
            }
        }

        public final void b() {
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
            LiveHomeTabLayout liveHomeTabLayout = this.f8851a.get();
            if (liveHomeTabLayout != null) {
                int i3 = this.c;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z2 = false;
                }
                LiveHomeTabLayout.access$4300(liveHomeTabLayout, i, f, z, z2);
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
            LiveHomeTabLayout liveHomeTabLayout = this.f8851a.get();
            if (liveHomeTabLayout != null && liveHomeTabLayout.getSelectedTabPosition() != i) {
                int i2 = this.c;
                if (!(i2 == 0 || (i2 == 2 && this.b == 0))) {
                    z = false;
                }
                liveHomeTabLayout.selectTab(liveHomeTabLayout.getTabAt(i), z);
            }
        }
    }

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
            } else if (LiveHomeTabLayout.access$000(LiveHomeTabLayout.this) > 0) {
                LinearLayout linearLayout = (LinearLayout) LiveHomeTabLayout.this.getChildAt(0);
                linearLayout.setShowDividers(2);
                as7 as7Var = new as7(LiveHomeTabLayout.this.getContext());
                as7Var.c(LiveHomeTabLayout.access$000(LiveHomeTabLayout.this), LiveHomeTabLayout.access$100(LiveHomeTabLayout.this));
                as7Var.b(LiveHomeTabLayout.access$200(LiveHomeTabLayout.this));
                as7Var.d(LiveHomeTabLayout.access$300(LiveHomeTabLayout.this));
                linearLayout.setDividerDrawable(as7Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a.e
        public void a(com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53c3b125", new Object[]{this, aVar});
            } else {
                LiveHomeTabLayout.this.scrollTo(aVar.c(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378814);
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/LiveHomeTabLayout$PagerAdapterObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                LiveHomeTabLayout.access$4400(LiveHomeTabLayout.this);
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                LiveHomeTabLayout.access$4400(LiveHomeTabLayout.this);
            }
        }

        public /* synthetic */ f(LiveHomeTabLayout liveHomeTabLayout, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
        void a(HomeSecondTabView.SecondTab secondTab);

        void b(HomeSecondTabView.SecondTab secondTab);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class h {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public Drawable f8855a;
        public CharSequence b;
        public int c;
        public View d;
        public LiveHomeTabLayout e;
        public TabView f;
        public HomeSecondTabView.SecondTab g;

        static {
            t2o.a(310378819);
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        public static /* synthetic */ void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cae8092c", new Object[]{hVar});
            } else {
                hVar.y();
            }
        }

        public static /* synthetic */ LiveHomeTabLayout b(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveHomeTabLayout) ipChange.ipc$dispatch("c87970c", new Object[]{hVar});
            }
            return hVar.e;
        }

        public static /* synthetic */ LiveHomeTabLayout c(h hVar, LiveHomeTabLayout liveHomeTabLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveHomeTabLayout) ipChange.ipc$dispatch("96108254", new Object[]{hVar, liveHomeTabLayout});
            }
            hVar.e = liveHomeTabLayout;
            return liveHomeTabLayout;
        }

        public static /* synthetic */ TabView d(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("a816ebf4", new Object[]{hVar});
            }
            return hVar.f;
        }

        public static /* synthetic */ TabView e(h hVar, TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("b74ec6d2", new Object[]{hVar, tabView});
            }
            hVar.f = tabView;
            return tabView;
        }

        public static /* synthetic */ HomeSecondTabView.SecondTab f(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HomeSecondTabView.SecondTab) ipChange.ipc$dispatch("530fbf31", new Object[]{hVar});
            }
            return hVar.g;
        }

        public static /* synthetic */ HomeSecondTabView.SecondTab g(h hVar, HomeSecondTabView.SecondTab secondTab) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HomeSecondTabView.SecondTab) ipChange.ipc$dispatch("fe464687", new Object[]{hVar, secondTab});
            }
            hVar.g = secondTab;
            return secondTab;
        }

        public static /* synthetic */ void h(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f65a82c4", new Object[]{hVar});
            } else {
                hVar.r();
            }
        }

        public CharSequence i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
            }
            return null;
        }

        public View j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            TabView tabView = this.f;
            if (tabView != null) {
                return tabView.getCustomView();
            }
            return this.d;
        }

        public HomeSecondTabView.SecondTab k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HomeSecondTabView.SecondTab) ipChange.ipc$dispatch("b82b655", new Object[]{this});
            }
            return this.g;
        }

        public Drawable l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
            }
            return this.f8855a;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
            }
            return null;
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public CharSequence o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
            }
            return this.b;
        }

        public int p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue();
            }
            return this.f.getTextWidth();
        }

        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("471b6d84", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public final void r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.e = null;
            this.f = null;
            this.f8855a = null;
            this.b = null;
            this.c = -1;
            this.d = null;
        }

        public void s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d39db83", new Object[]{this});
                return;
            }
            LiveHomeTabLayout liveHomeTabLayout = this.e;
            if (liveHomeTabLayout != null) {
                liveHomeTabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public h t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("787bfa77", new Object[]{this, new Integer(i)});
            }
            return u(LayoutInflater.from(this.f.getContext()).inflate(i, (ViewGroup) this.f, false));
        }

        public h u(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("e48ba008", new Object[]{this, view});
            }
            this.d = view;
            y();
            return this;
        }

        public h v(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("d970c9b5", new Object[]{this, drawable});
            }
            this.f8855a = drawable;
            y();
            return this;
        }

        public void w(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public h x(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("e879001", new Object[]{this, charSequence});
            }
            this.b = charSequence;
            y();
            return this;
        }

        public final void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b12a895", new Object[]{this});
                return;
            }
            TabView tabView = this.f;
            if (tabView != null) {
                tabView.update();
            }
        }

        public h() {
            this.c = -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f8856a;

        static {
            t2o.a(310378823);
            t2o.a(310378813);
        }

        public i(ViewPager viewPager) {
            this.f8856a = viewPager;
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00e0a3d", new Object[]{this, hVar});
            } else {
                this.f8856a.setCurrentItem(hVar.n());
            }
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void b(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9631f70", new Object[]{this, hVar});
            }
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.e
        public void c(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76c7a8d6", new Object[]{this, hVar});
            }
        }
    }

    static {
        t2o.a(310378807);
    }

    public LiveHomeTabLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$000(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e43cada0", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.dividerWidth;
    }

    public static /* synthetic */ int access$100(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24679461", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.dividerHeight;
    }

    public static /* synthetic */ int access$1400(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1f59253", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabPaddingStart;
    }

    public static /* synthetic */ int access$1500(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2207914", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabPaddingTop;
    }

    public static /* synthetic */ int access$1600(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("224b5fd5", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabPaddingEnd;
    }

    public static /* synthetic */ int access$1700(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62764696", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabPaddingBottom;
    }

    public static /* synthetic */ int access$1800(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2a12d57", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.xTabBackgroundColor;
    }

    public static /* synthetic */ float access$1900(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2cc1415", new Object[]{liveHomeTabLayout})).floatValue();
        }
        return liveHomeTabLayout.mTabTextSize;
    }

    public static /* synthetic */ int access$200(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64927b22", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.dividerColor;
    }

    public static /* synthetic */ boolean access$2000(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("667be8bf", new Object[]{liveHomeTabLayout})).booleanValue();
        }
        return liveHomeTabLayout.xTabTextSelectedBold;
    }

    public static /* synthetic */ boolean access$2100(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a6cf80", new Object[]{liveHomeTabLayout})).booleanValue();
        }
        return liveHomeTabLayout.xTabTextBold;
    }

    public static /* synthetic */ int access$2200(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6d1b630", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabTextNormalColor;
    }

    public static /* synthetic */ int access$2300(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26fc9cf1", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.xTabSelectedBackgroundColor;
    }

    public static /* synthetic */ boolean access$2400(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("672783c3", new Object[]{liveHomeTabLayout})).booleanValue();
        }
        return liveHomeTabLayout.xTabTextShadowLayer;
    }

    public static /* synthetic */ int access$2500(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7526a73", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabTextSelectedColor;
    }

    public static /* synthetic */ float access$2600(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e77d5131", new Object[]{liveHomeTabLayout})).floatValue();
        }
        return liveHomeTabLayout.mTabSelectedTextSize;
    }

    public static /* synthetic */ g access$2700(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5d8114ee", new Object[]{liveHomeTabLayout});
        }
        return liveHomeTabLayout.mRightTopMarkListener;
    }

    public static /* synthetic */ int access$2800(LiveHomeTabLayout liveHomeTabLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92912c93", new Object[]{liveHomeTabLayout, new Integer(i2)})).intValue();
        }
        return liveHomeTabLayout.dpToPx(i2);
    }

    public static /* synthetic */ int access$2900(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7fe0577", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.getTabMaxWidth();
    }

    public static /* synthetic */ int access$300(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4bd61e3", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.dividerGravity;
    }

    public static /* synthetic */ int access$3000(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2badda0d", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabMaxWidth;
    }

    public static /* synthetic */ float access$3100(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bd8c0cb", new Object[]{liveHomeTabLayout})).floatValue();
        }
        return liveHomeTabLayout.mTabTextMultiLineSize;
    }

    public static /* synthetic */ int access$3200(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac03a78f", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mMode;
    }

    public static /* synthetic */ View access$3300(LiveHomeTabLayout liveHomeTabLayout, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d44bd64", new Object[]{liveHomeTabLayout, hVar});
        }
        return liveHomeTabLayout.createCustomView(hVar);
    }

    public static /* synthetic */ int access$3400(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c597511", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabTextAppearance;
    }

    public static /* synthetic */ boolean access$3500(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c845be3", new Object[]{liveHomeTabLayout})).booleanValue();
        }
        return liveHomeTabLayout.xTabTextAllCaps;
    }

    public static /* synthetic */ int access$3600(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acaf4293", new Object[]{liveHomeTabLayout})).intValue();
        }
        return liveHomeTabLayout.mTabGravity;
    }

    public static /* synthetic */ int access$3602(LiveHomeTabLayout liveHomeTabLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c412fe94", new Object[]{liveHomeTabLayout, new Integer(i2)})).intValue();
        }
        liveHomeTabLayout.mTabGravity = i2;
        return i2;
    }

    public static /* synthetic */ void access$3700(LiveHomeTabLayout liveHomeTabLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6bb593", new Object[]{liveHomeTabLayout, new Boolean(z)});
        } else {
            liveHomeTabLayout.updateTabViews(z);
        }
    }

    public static /* synthetic */ boolean access$3800(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d051026", new Object[]{liveHomeTabLayout})).booleanValue();
        }
        return liveHomeTabLayout.xTabDividerWidthWidthText;
    }

    public static /* synthetic */ h access$4200(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c3352840", new Object[]{liveHomeTabLayout});
        }
        return liveHomeTabLayout.mSelectedTab;
    }

    public static /* synthetic */ void access$4300(LiveHomeTabLayout liveHomeTabLayout, int i2, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f461e19", new Object[]{liveHomeTabLayout, new Integer(i2), new Float(f2), new Boolean(z), new Boolean(z2)});
        } else {
            liveHomeTabLayout.setScrollPosition(i2, f2, z, z2);
        }
    }

    public static /* synthetic */ void access$4400(LiveHomeTabLayout liveHomeTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18b667d", new Object[]{liveHomeTabLayout});
        } else {
            liveHomeTabLayout.populateFromPagerAdapter();
        }
    }

    private void addDivider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00693bf", new Object[]{this});
        } else {
            post(new a());
        }
    }

    private void addTabFromItemView(LiveHomeTabItem liveHomeTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ba80ea", new Object[]{this, liveHomeTabItem});
            return;
        }
        h newTab = newTab();
        CharSequence charSequence = liveHomeTabItem.mText;
        if (charSequence != null) {
            newTab.x(charSequence);
        }
        Drawable drawable = liveHomeTabItem.mIcon;
        if (drawable != null) {
            newTab.v(drawable);
        }
        int i2 = liveHomeTabItem.mCustomLayout;
        if (i2 != 0) {
            newTab.t(i2);
        }
        addTab(newTab);
    }

    private void addTabView(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8855232f", new Object[]{this, hVar, new Boolean(z)});
            return;
        }
        TabView d2 = h.d(hVar);
        this.mTabStrip.addView(d2, createLayoutParamsForTabs());
        if (z) {
            d2.setSelected(true);
        }
    }

    private void addViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a61c8", new Object[]{this, view});
        } else if (view instanceof LiveHomeTabItem) {
            addTabFromItemView((LiveHomeTabItem) view);
        } else {
            throw new IllegalArgumentException("Only LiveHomeTabItem instances can be added to TabLayout");
        }
    }

    private void animateToTab(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91a643", new Object[]{this, new Integer(i2)});
        } else if (i2 != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.mTabStrip.childrenNeedLayout()) {
                setScrollPosition(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i2, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                if (this.mScrollAnimator == null) {
                    com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a a2 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.c.a();
                    this.mScrollAnimator = a2;
                    a2.i(jz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
                    this.mScrollAnimator.f(300);
                    this.mScrollAnimator.k(new b());
                }
                this.mScrollAnimator.h(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.l();
            }
            this.mTabStrip.animateIndicatorToPosition(i2, 300);
        }
    }

    private void applyModeAndGravity() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe0f", new Object[]{this});
            return;
        }
        if (this.mMode == 0) {
            i2 = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
        } else {
            i2 = 0;
        }
        ViewCompat.setPaddingRelative(this.mTabStrip, i2, 0, 0, 0);
        int i3 = this.mMode;
        if (i3 == 0) {
            this.mTabStrip.setGravity(GravityCompat.START);
        } else if (i3 == 1) {
            this.mTabStrip.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb48e268", new Object[]{this, new Integer(i2), new Float(f2)})).intValue();
        }
        if (this.mMode != 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.mTabStrip.getChildCount()) {
            view = this.mTabStrip.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i3 = childAt.getWidth();
        } else {
            i3 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        return ((childAt.getLeft() + ((int) (((i3 + i4) * f2) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
    }

    private void configureTab(h hVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf07848", new Object[]{this, hVar, new Integer(i2)});
            return;
        }
        hVar.w(i2);
        this.mTabs.add(i2, hVar);
        int size = this.mTabs.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.mTabs.get(i2).w(i2);
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("1acfcf45", new Object[]{new Integer(i2), new Integer(i3)});
        }
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private View createCustomView(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f2e4b360", new Object[]{this, hVar});
        }
        return null;
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

    private TabView createTabView(h hVar) {
        TabView tabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("efc47d2c", new Object[]{this, hVar});
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
        TabView.access$1200(tabView, hVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        return tabView;
    }

    private int dpToPx(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i2)})).intValue();
        }
        return Math.round(getResources().getDisplayMetrics().density * i2);
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        int size = this.mTabs.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.mTabs.get(i2);
            if (!(hVar == null || hVar.l() == null || TextUtils.isEmpty(hVar.o()))) {
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

    private int getTabMaxWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30d0d83b", new Object[]{this})).intValue();
        }
        return this.mTabMaxWidth;
    }

    private int getTabScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40fd048b", new Object[]{this})).intValue();
        }
        return Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static /* synthetic */ Object ipc$super(LiveHomeTabLayout liveHomeTabLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1992612095) {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/LiveHomeTabLayout");
        }
    }

    private void populateFromPagerAdapter() {
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
            for (int i2 = 0; i2 < count; i2++) {
                h newTab = newTab(i2);
                newTab.x(this.mPagerAdapter.getPageTitle(i2));
                addTab(newTab, false);
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                this.mSelectedTab = getTabAt(currentItem);
                selectTab(getTabAt(currentItem), false);
                return;
            }
            return;
        }
        removeAllTabs();
    }

    private void removeTabViewAt(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i2)});
            return;
        }
        View childAt = this.mTabStrip.getChildAt(i2);
        this.mTabStrip.removeViewAt(i2);
        if (childAt instanceof TabView) {
            TabView.access$1300((TabView) childAt);
        }
        requestLayout();
    }

    private void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
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
                this.mPagerAdapterObserver = new f(this, null);
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private void setSelectedTabView(int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i2)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i2 < childCount && !this.mTabStrip.getChildAt(i2).isSelected()) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.mTabStrip.getChildAt(i3);
                if (i3 == i2) {
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
        for (int i2 = 0; i2 < size; i2++) {
            h.a(this.mTabs.get(i2));
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

    private void updateTabViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348b24ab", new Object[]{this, new Boolean(z)});
            return;
        }
        for (int i2 = 0; i2 < this.mTabStrip.getChildCount(); i2++) {
            View childAt = this.mTabStrip.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addOnTabSelectedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42184200", new Object[]{this, eVar});
            return;
        }
        List<e> list = this.mOnTabSelectedListenerList;
        if (list != null && !list.contains(eVar)) {
            this.mOnTabSelectedListenerList.add(eVar);
        }
    }

    public void addTab(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee59f00", new Object[]{this, hVar});
        } else {
            addTab(hVar, this.mTabs.isEmpty());
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

    public int getSelectedTabPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e05b0107", new Object[]{this})).intValue();
        }
        h hVar = this.mSelectedTab;
        if (hVar != null) {
            return hVar.n();
        }
        return -1;
    }

    public h getTabAt(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("e68078b1", new Object[]{this, new Integer(i2)});
        }
        return this.mTabs.get(i2);
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

    public h newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("21a1723f", new Object[]{this});
        }
        h acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new h(null);
        }
        h.c(acquire, this);
        h.e(acquire, createTabView(acquire));
        return acquire;
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
        Iterator<h> it = this.mTabs.iterator();
        while (it.hasNext()) {
            h next = it.next();
            it.remove();
            h.h(next);
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    public void removeTab(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250b60bd", new Object[]{this, hVar});
        } else if (h.b(hVar) == this) {
            removeTabAt(hVar.n());
        } else {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i2) {
        int i3;
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i2)});
            return;
        }
        h hVar2 = this.mSelectedTab;
        if (hVar2 != null) {
            i3 = hVar2.n();
        } else {
            i3 = 0;
        }
        removeTabViewAt(i2);
        h remove = this.mTabs.remove(i2);
        if (remove != null) {
            h.h(remove);
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i4 = i2; i4 < size; i4++) {
            this.mTabs.get(i4).w(i4);
        }
        if (i3 == i2) {
            if (this.mTabs.isEmpty()) {
                hVar = null;
            } else {
                hVar = this.mTabs.get(Math.max(0, i2 - 1));
            }
            selectTab(hVar);
        }
    }

    public void selectTab(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45b4545", new Object[]{this, hVar});
        } else {
            selectTab(hVar, true);
        }
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.xTabTextAllCaps = z;
        }
    }

    public void setDividerColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i2)});
            return;
        }
        this.dividerColor = i2;
        addDivider();
    }

    public void setDividerGravity(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c773c5", new Object[]{this, new Integer(i2)});
            return;
        }
        this.dividerGravity = i2;
        addDivider();
    }

    public void setDividerSize(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0b321f", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.dividerWidth = i2;
        this.dividerHeight = i3;
        addDivider();
    }

    public void setOnTabClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25af2a1", new Object[]{this, dVar});
        } else {
            this.mOnTabClickListener = dVar;
        }
    }

    public void setOnTabSelectedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02ccc9f", new Object[]{this, eVar});
        } else {
            this.mOnTabSelectedListener = eVar;
        }
    }

    public void setRightTopMarkListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26306339", new Object[]{this, gVar});
        } else {
            this.mRightTopMarkListener = gVar;
        }
    }

    public void setScrollPosition(int i2, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac71458", new Object[]{this, new Integer(i2), new Float(f2), new Boolean(z)});
        } else {
            setScrollPosition(i2, f2, z, true);
        }
    }

    public void setSelectedTabIndicatorBottomGap(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i2)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorBottomGap(i2);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e50f0", new Object[]{this, new Integer(i2)});
        } else {
            this.mTabStrip.setSelectedIndicatorColor(i2);
        }
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef09165e", new Object[]{this, new Integer(i2)});
        } else {
            this.mTabStrip.setSelectedIndicatorHeight(i2);
        }
    }

    public void setTabData(List<HomeSecondTabView.SecondTab> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0fcd15", new Object[]{this, list});
        } else {
            this.mSecondTabs = list;
        }
    }

    public void setTabGravity(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72161541", new Object[]{this, new Integer(i2)});
        } else if (this.mTabGravity != i2) {
            this.mTabGravity = i2;
            applyModeAndGravity();
        }
    }

    public void setTabImageChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc97715", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabImageChange = z;
        }
    }

    public void setTabMode(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9b7906", new Object[]{this, new Integer(i2)});
        } else if (i2 != this.mMode) {
            this.mMode = i2;
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

    public void setXTabCustomListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ce9c76", new Object[]{this, cVar});
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f2d35", new Object[]{this, viewPager});
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        if (!(viewPager2 == null || (tabLayoutOnPageChangeListener = this.mPageChangeListener) == null)) {
            viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
        }
        if (viewPager != null) {
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                this.mViewPager = viewPager;
                if (this.mPageChangeListener == null) {
                    this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
                }
                TabLayoutOnPageChangeListener.a(this.mPageChangeListener);
                viewPager.addOnPageChangeListener(this.mPageChangeListener);
                setOnTabSelectedListener(new i(viewPager));
                setPagerAdapter(adapter, true);
                return;
            }
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = null;
        setOnTabSelectedListener(null);
        setPagerAdapter(null, true);
    }

    public void setxTabDisplayNum(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d5119", new Object[]{this, new Integer(i2)});
        } else {
            this.xTabDisplayNum = i2;
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

    public LiveHomeTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setScrollPosition(int i2, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1c297c", new Object[]{this, new Integer(i2), new Float(f2), new Boolean(z), new Boolean(z2)});
            return;
        }
        int round = Math.round(i2 + f2);
        if (round >= 0 && round < this.mTabStrip.getChildCount()) {
            if (z2) {
                this.mTabStrip.setIndicatorPositionFromTabPosition(i2, f2);
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.a aVar = this.mScrollAnimator;
            if (aVar != null && aVar.e()) {
                this.mScrollAnimator.a();
            }
            scrollTo(calculateScrollXForTab(i2, f2), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void addTab(h hVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dceb403", new Object[]{this, hVar, new Integer(i2)});
        } else {
            addTab(hVar, i2, this.mTabs.isEmpty());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i2)});
        } else {
            addViewInternal(view);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet}) : generateDefaultLayoutParams();
    }

    public void selectTab(h hVar, boolean z) {
        d dVar;
        e eVar;
        e eVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70e162f", new Object[]{this, hVar, new Boolean(z)});
            return;
        }
        h hVar2 = this.mSelectedTab;
        if (hVar2 != hVar) {
            if (z) {
                int n = hVar != null ? hVar.n() : -1;
                if (n != -1) {
                    setSelectedTabView(n);
                }
                h hVar3 = this.mSelectedTab;
                if ((hVar3 == null || hVar3.n() == -1) && n != -1) {
                    setScrollPosition(n, 0.0f, true);
                } else {
                    animateToTab(n);
                }
            }
            h hVar4 = this.mSelectedTab;
            if (!(hVar4 == null || (eVar2 = this.mOnTabSelectedListener) == null)) {
                eVar2.c(hVar4);
            }
            for (e eVar3 : this.mOnTabSelectedListenerList) {
                eVar3.c(this.mSelectedTab);
            }
            this.mSelectedTab = hVar;
            if (!(hVar == null || (eVar = this.mOnTabSelectedListener) == null)) {
                eVar.a(hVar);
            }
            h hVar5 = this.mSelectedTab;
            if (!(hVar5 == null || (dVar = this.mOnTabClickListener) == null || !z)) {
                ((HomeSecondTabView.b) dVar).a(hVar5);
            }
            for (e eVar4 : this.mOnTabSelectedListenerList) {
                eVar4.a(this.mSelectedTab);
            }
        } else if (hVar2 != null) {
            e eVar5 = this.mOnTabSelectedListener;
            if (eVar5 != null) {
                eVar5.b(hVar2);
            }
            for (e eVar6 : this.mOnTabSelectedListenerList) {
                eVar6.b(this.mSelectedTab);
            }
            animateToTab(hVar.n());
        }
    }

    /* JADX WARN: Finally extract failed */
    public LiveHomeTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.xTabTextAllCaps = false;
        this.xTabDividerWidthWidthText = false;
        this.mTabs = new ArrayList<>();
        this.mTabTextSize = 0.0f;
        this.mTabSelectedTextSize = 0.0f;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mOnTabSelectedListenerList = new ArrayList();
        this.mTabViewPool = new Pools.SimplePool(12);
        gpt.a(context);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        slidingTabStrip.setClipChildren(false);
        slidingTabStrip.setClipToPadding(false);
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LiveHomeTabLayout, i2, R.style.Widget_Design_TabLayout);
        slidingTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabIndicatorHeight, dpToPx(2)));
        slidingTabStrip.setSelectedTabIndicatorBottomGap(obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabIndicatorBottomGap, 0));
        slidingTabStrip.setmSelectedIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabIndicatorWidth, 0));
        slidingTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R.styleable.LiveHomeTabLayout_lhTabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabPaddingStart, dimensionPixelSize);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabPaddingBottom, this.mTabPaddingBottom);
        this.xTabTextAllCaps = obtainStyledAttributes.getBoolean(R.styleable.LiveHomeTabLayout_lhTabTextAllCaps, false);
        this.mTabTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.LiveHomeTabLayout_lhTabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.mTabTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabTextSize, 0);
        this.xTabTextBold = obtainStyledAttributes.getBoolean(R.styleable.LiveHomeTabLayout_lhTabTextBold, false);
        this.mTabSelectedTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabSelectedTextSize, 0);
        this.xTabTextSelectedBold = obtainStyledAttributes.getBoolean(R.styleable.LiveHomeTabLayout_lhTabTextSelectedBold, false);
        this.xTabTextShadowLayer = obtainStyledAttributes.getBoolean(R.styleable.LiveHomeTabLayout_lhTabTextShadowLayer, false);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.mTabTextAppearance, R.styleable.TextAppearance);
        try {
            if (this.mTabTextSize == 0.0f) {
                this.mTabTextSize = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            }
            obtainStyledAttributes2.recycle();
            int i3 = R.styleable.LiveHomeTabLayout_lhTabTextColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mTabTextNormalColor = obtainStyledAttributes.getColor(i3, 0);
            }
            int i4 = R.styleable.LiveHomeTabLayout_lhTabSelectedTextColor;
            if (obtainStyledAttributes.hasValue(i4)) {
                this.mTabTextSelectedColor = obtainStyledAttributes.getColor(i4, 0);
            }
            this.xTabDisplayNum = obtainStyledAttributes.getInt(R.styleable.LiveHomeTabLayout_lhTabDisplayNum, 0);
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabMaxWidth, -1);
            this.xTabBackgroundColor = obtainStyledAttributes.getColor(R.styleable.LiveHomeTabLayout_lhTabBackgroundColor, 0);
            this.xTabSelectedBackgroundColor = obtainStyledAttributes.getColor(R.styleable.LiveHomeTabLayout_lhTabSelectedBackgroundColor, 0);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R.styleable.LiveHomeTabLayout_lhTabMode, 1);
            this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.LiveHomeTabLayout_lhTabGravity, 0);
            this.dividerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabDividerWidth, 0);
            this.dividerHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveHomeTabLayout_lhTabDividerHeight, 0);
            this.dividerColor = obtainStyledAttributes.getColor(R.styleable.LiveHomeTabLayout_lhTabDividerColor, -16777216);
            this.dividerGravity = obtainStyledAttributes.getInteger(R.styleable.LiveHomeTabLayout_lhTabDividerGravity, 1);
            this.xTabDividerWidthWidthText = obtainStyledAttributes.getBoolean(R.styleable.LiveHomeTabLayout_lhTabDividerWidthWidthText, false);
            obtainStyledAttributes.recycle();
            this.mTabTextMultiLineSize = getResources().getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.mScrollableTabMinWidth = dpToPx(36);
            applyModeAndGravity();
            addDivider();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private int getTabMinWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d18030d", new Object[]{this})).intValue();
        }
        if (this.mPagerAdapter != null && this.xTabDisplayNum != 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window);
            if (this.mPagerAdapter.getCount() == 1 || this.xTabDisplayNum == 1) {
                return windowManager.getDefaultDisplay().getWidth();
            }
            if (this.mPagerAdapter.getCount() < this.xTabDisplayNum) {
                return windowManager.getDefaultDisplay().getWidth() / this.mPagerAdapter.getCount();
            }
            return windowManager.getDefaultDisplay().getWidth() / this.xTabDisplayNum;
        } else if (this.xTabDisplayNum != 0) {
            return ((WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth() / this.xTabDisplayNum;
        } else {
            int i2 = this.mRequestedTabMinWidth;
            if (i2 != -1) {
                return i2;
            }
            if (this.mMode == 0) {
                return this.mScrollableTabMinWidth;
            }
            return 0;
        }
    }

    public void addTab(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcef3d4", new Object[]{this, hVar, new Boolean(z)});
        } else if (h.b(hVar) == this) {
            addTabView(hVar, z);
            configureTab(hVar, this.mTabs.size());
            if (z) {
                hVar.s();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        int dpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            new StringBuilder("specWidth:").append(size);
            PagerAdapter pagerAdapter = this.mPagerAdapter;
            if (pagerAdapter == null || this.xTabDisplayNum == 0) {
                int i4 = this.mRequestedTabMaxWidth;
                if (i4 <= 0) {
                    i4 = size - dpToPx(24);
                }
                this.mTabMaxWidth = i4;
            } else if (pagerAdapter.getCount() == 1 || this.xTabDisplayNum == 1) {
                this.mTabMaxWidth = ((WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
            } else {
                int i5 = this.mRequestedTabMaxWidth;
                if (i5 <= 0) {
                    i5 = size - dpToPx(24);
                }
                this.mTabMaxWidth = i5;
            }
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.mMode;
            if (i6 != 0) {
                if (i6 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    private void addTabView(h hVar, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82483b36", new Object[]{this, hVar, new Integer(i2), new Boolean(z)});
            return;
        }
        TabView d2 = h.d(hVar);
        this.mTabStrip.addView(d2, i2, createLayoutParamsForTabs());
        if (z) {
            d2.setSelected(true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i2), layoutParams});
        } else {
            addViewInternal(view);
        }
    }

    public void setTabTextColors(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e090dc57", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            setTabTextColors(createColorStateList(i2, i3));
        }
    }

    public h newTab(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("db6c3514", new Object[]{this, new Integer(i2)});
        }
        h acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new h(null);
        }
        h.c(acquire, this);
        List<HomeSecondTabView.SecondTab> list = this.mSecondTabs;
        if (list != null) {
            h.g(acquire, list.get(i2));
        }
        h.e(acquire, createTabView(acquire));
        return acquire;
    }

    public void addTab(h hVar, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c087f31", new Object[]{this, hVar, new Integer(i2), new Boolean(z)});
        } else if (h.b(hVar) == this) {
            addTabView(hVar, i2, z);
            configureTab(hVar, i2);
            if (z) {
                hVar.s();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class TabView extends RelativeLayout implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimatorSet animatorSet;
        private View mAnimView;
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines = 2;
        private View mIconView;
        private View mRedPointView;
        private TextView mRightTopMarkView;
        private TUrlImageView mTUrlImageView;
        private h mTab;
        private TUrlImageView mTabImageView;
        private TextView mTextView;
        private boolean rightTopMarkClicked;

        static {
            t2o.a(310378822);
        }

        public TabView(Context context) {
            super(context);
            ViewCompat.setPaddingRelative(this, LiveHomeTabLayout.access$1400(LiveHomeTabLayout.this), LiveHomeTabLayout.access$1500(LiveHomeTabLayout.this), LiveHomeTabLayout.access$1600(LiveHomeTabLayout.this), LiveHomeTabLayout.access$1700(LiveHomeTabLayout.this));
            setClickable(true);
        }

        public static /* synthetic */ void access$1200(TabView tabView, h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a573c84d", new Object[]{tabView, hVar});
            } else {
                tabView.setTab(hVar);
            }
        }

        public static /* synthetic */ void access$1300(TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da981c9", new Object[]{tabView});
            } else {
                tabView.reset();
            }
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/LiveHomeTabLayout$TabView");
            }
        }

        private void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            setTab(null);
            setSelected(false);
        }

        private void setTab(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45068d1f", new Object[]{this, hVar});
            } else if (hVar != this.mTab) {
                this.mTab = hVar;
                update();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x00ad, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ad, blocks: (B:6:0x001b, B:8:0x0021, B:10:0x0027, B:12:0x003a, B:14:0x0040, B:16:0x0047, B:18:0x0055, B:20:0x005b, B:22:0x0068, B:24:0x0072), top: B:27:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void updateImageTab(java.lang.String r9) {
            /*
                r8 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                java.lang.String r3 = "-"
                java.lang.String r4 = "/"
                java.lang.String r5 = "."
                com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.TabView.$ipChange
                boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r7 == 0) goto L_0x001b
                java.lang.String r3 = "90ac4e74"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r1] = r8
                r2[r0] = r9
                r6.ipc$dispatch(r3, r2)
                return
            L_0x001b:
                boolean r6 = r9.contains(r5)     // Catch: Exception -> 0x00ad
                if (r6 == 0) goto L_0x0064
                boolean r6 = r9.contains(r4)     // Catch: Exception -> 0x00ad
                if (r6 == 0) goto L_0x0064
                int r4 = r9.lastIndexOf(r4)     // Catch: Exception -> 0x00ad
                int r4 = r4 + r0
                int r5 = r9.lastIndexOf(r5)     // Catch: Exception -> 0x00ad
                java.lang.String r9 = r9.substring(r4, r5)     // Catch: Exception -> 0x00ad
                boolean r4 = tb.arq.a(r9)     // Catch: Exception -> 0x00ad
                if (r4 != 0) goto L_0x0064
                boolean r4 = r9.contains(r3)     // Catch: Exception -> 0x00ad
                if (r4 == 0) goto L_0x0064
                java.lang.String[] r9 = r9.split(r3)     // Catch: Exception -> 0x00ad
                int r3 = r9.length     // Catch: Exception -> 0x00ad
                if (r3 <= r2) goto L_0x0064
                int r3 = r9.length     // Catch: Exception -> 0x00ad
                int r3 = r3 - r0
                r0 = r9[r3]     // Catch: Exception -> 0x00ad
                int r3 = r9.length     // Catch: Exception -> 0x00ad
                int r3 = r3 - r2
                r9 = r9[r3]     // Catch: Exception -> 0x00ad
                boolean r2 = tb.arq.a(r0)     // Catch: Exception -> 0x00ad
                if (r2 != 0) goto L_0x0064
                boolean r2 = tb.arq.a(r9)     // Catch: Exception -> 0x00ad
                if (r2 != 0) goto L_0x0064
                float r0 = tb.arq.d(r0)     // Catch: Exception -> 0x00ad
                float r9 = tb.arq.d(r9)     // Catch: Exception -> 0x00ad
                goto L_0x0068
            L_0x0064:
                r0 = 1106247680(0x41f00000, float:30.0)
                r9 = 1119092736(0x42b40000, float:90.0)
            L_0x0068:
                com.taobao.uikit.extend.feature.view.TUrlImageView r2 = r8.mTabImageView     // Catch: Exception -> 0x00ad
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: Exception -> 0x00ad
                android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2     // Catch: Exception -> 0x00ad
                if (r2 == 0) goto L_0x00ad
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout r3 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.this     // Catch: Exception -> 0x00ad
                float r3 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.access$1900(r3)     // Catch: Exception -> 0x00ad
                int r3 = (int) r3     // Catch: Exception -> 0x00ad
                r2.height = r3     // Catch: Exception -> 0x00ad
                float r3 = (float) r3     // Catch: Exception -> 0x00ad
                float r3 = r3 * r9
                float r3 = r3 / r0
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout r9 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.this     // Catch: Exception -> 0x00ad
                r0 = 16
                int r9 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.access$2800(r9, r0)     // Catch: Exception -> 0x00ad
                float r9 = (float) r9     // Catch: Exception -> 0x00ad
                float r3 = r3 + r9
                int r9 = (int) r3     // Catch: Exception -> 0x00ad
                r2.width = r9     // Catch: Exception -> 0x00ad
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout r9 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.this     // Catch: Exception -> 0x00ad
                r0 = 3
                int r9 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.access$2800(r9, r0)     // Catch: Exception -> 0x00ad
                r2.bottomMargin = r9     // Catch: Exception -> 0x00ad
                com.taobao.uikit.extend.feature.view.TUrlImageView r9 = r8.mTabImageView     // Catch: Exception -> 0x00ad
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout r0 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.this     // Catch: Exception -> 0x00ad
                r3 = 8
                int r0 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.access$2800(r0, r3)     // Catch: Exception -> 0x00ad
                com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout r4 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.this     // Catch: Exception -> 0x00ad
                int r3 = com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.access$2800(r4, r3)     // Catch: Exception -> 0x00ad
                r9.setPadding(r0, r1, r3, r1)     // Catch: Exception -> 0x00ad
                com.taobao.uikit.extend.feature.view.TUrlImageView r9 = r8.mTabImageView     // Catch: Exception -> 0x00ad
                r9.setLayoutParams(r2)     // Catch: Exception -> 0x00ad
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.LiveHomeTabLayout.TabView.updateImageTab(java.lang.String):void");
        }

        private void updateTextAndIcon(TextView textView, TUrlImageView tUrlImageView, View view, TUrlImageView tUrlImageView2, View view2) {
            Drawable drawable;
            String str;
            CharSequence charSequence;
            CharSequence charSequence2;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c887aa3", new Object[]{this, textView, tUrlImageView, view, tUrlImageView2, view2});
                return;
            }
            h hVar = this.mTab;
            if (hVar != null) {
                drawable = hVar.l();
            } else {
                drawable = null;
            }
            h hVar2 = this.mTab;
            if (hVar2 != null) {
                str = hVar2.m();
            } else {
                str = null;
            }
            h hVar3 = this.mTab;
            if (hVar3 != null) {
                charSequence = hVar3.o();
            } else {
                charSequence = null;
            }
            h hVar4 = this.mTab;
            if (hVar4 != null) {
                charSequence2 = hVar4.i();
            } else {
                charSequence2 = null;
            }
            h hVar5 = this.mTab;
            if (hVar5 == null || h.f(hVar5) == null || TextUtils.isEmpty(h.f(this.mTab).showPic)) {
                str2 = null;
            } else {
                str2 = h.f(this.mTab).showPic;
            }
            if (view != null) {
                if (!TextUtils.isEmpty(str) && tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl(str, new PhenixOptions().bitmapProcessors(new iy4()));
                    view.setVisibility(0);
                    setVisibility(0);
                    iconAnim(view2, tUrlImageView2);
                } else if (drawable != null) {
                    view.setVisibility(0);
                    setVisibility(0);
                } else {
                    view.setVisibility(8);
                    AnimatorSet animatorSet = this.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.animatorSet = null;
                    }
                }
                view.setContentDescription(charSequence2);
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!isEmpty) {
                    textView.setAllCaps(LiveHomeTabLayout.access$3500(LiveHomeTabLayout.this));
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (tUrlImageView != null) {
                if (!arq.a(str2)) {
                    tUrlImageView.setImageUrl(str2);
                    tUrlImageView.setSkipAutoSize(true);
                    tUrlImageView.setVisibility(0);
                    if (textView != null) {
                        textView.setVisibility(8);
                        textView.setText((CharSequence) null);
                    }
                    setVisibility(0);
                } else {
                    tUrlImageView.setVisibility(8);
                }
            }
            if (view != null && view.getVisibility() == 0) {
                view.requestLayout();
            }
            if (!isEmpty || TextUtils.isEmpty(charSequence2)) {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        public View getCustomView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            return this.mCustomView;
        }

        public h getTab() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("cc9b1975", new Object[]{this});
            }
            return this.mTab;
        }

        public String getText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            TextView textView = this.mTextView;
            if (textView == null) {
                return "";
            }
            return textView.getText().toString();
        }

        public int getTextWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue();
            }
            TextView textView = this.mTextView;
            if (textView == null || TextUtils.isEmpty(textView.getText().toString())) {
                return 0;
            }
            Rect rect = new Rect();
            String charSequence = this.mTextView.getText().toString();
            this.mTextView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
            return rect.width();
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

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.mTab.i(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public void onMeasure(int i, int i2) {
            boolean z;
            Layout layout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int access$2900 = LiveHomeTabLayout.access$2900(LiveHomeTabLayout.this);
            View view = this.mIconView;
            if (view == null || view.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (access$2900 > 0 && (mode == 0 || size > access$2900 || z)) {
                i = View.MeasureSpec.makeMeasureSpec(LiveHomeTabLayout.access$3000(LiveHomeTabLayout.this), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            TextView textView = this.mTextView;
            if (textView != null && textView.getText() != null) {
                getResources();
                float access$1900 = LiveHomeTabLayout.access$1900(LiveHomeTabLayout.this);
                int i3 = this.mDefaultMaxLines;
                View view2 = this.mIconView;
                if (view2 == null || view2.getVisibility() != 0) {
                    TextView textView2 = this.mTextView;
                    if (textView2 != null && textView2.getLineCount() > 1) {
                        access$1900 = LiveHomeTabLayout.access$3100(LiveHomeTabLayout.this);
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.mTextView.getTextSize();
                int lineCount = this.mTextView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.mTextView);
                int i4 = (access$1900 > textSize ? 1 : (access$1900 == textSize ? 0 : -1));
                if (i4 == 0 && (maxLines < 0 || i3 == maxLines)) {
                    return;
                }
                if (LiveHomeTabLayout.access$3200(LiveHomeTabLayout.this) != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.mTextView.getLayout()) != null && approximateLineWidth(layout, 0, access$1900) <= layout.getWidth())) {
                    if (!this.mTextView.isSelected() || LiveHomeTabLayout.access$2600(LiveHomeTabLayout.this) == 0.0f) {
                        this.mTextView.setTextSize(0, LiveHomeTabLayout.access$1900(LiveHomeTabLayout.this));
                    } else {
                        this.mTextView.setTextSize(0, LiveHomeTabLayout.access$2600(LiveHomeTabLayout.this));
                    }
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
            h hVar = this.mTab;
            if (hVar == null) {
                return performClick;
            }
            hVar.s();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            h hVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
                return;
            }
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (!z) {
                if (LiveHomeTabLayout.access$1800(LiveHomeTabLayout.this) != 0) {
                    setBackgroundColor(LiveHomeTabLayout.access$1800(LiveHomeTabLayout.this));
                }
                TextView textView = this.mTextView;
                if (!(textView == null || textView.getText() == null)) {
                    this.mTextView.setTextSize(0, LiveHomeTabLayout.access$1900(LiveHomeTabLayout.this));
                    this.mTextView.invalidate();
                }
            }
            TextView textView2 = this.mTextView;
            if (textView2 != null) {
                if (!z) {
                    textView2.setTypeface(Typeface.defaultFromStyle(0));
                    this.mTextView.setTextColor(LiveHomeTabLayout.access$2200(LiveHomeTabLayout.this));
                } else if (LiveHomeTabLayout.access$2000(LiveHomeTabLayout.this) || LiveHomeTabLayout.access$2100(LiveHomeTabLayout.this)) {
                    this.mTextView.setTypeface(Typeface.defaultFromStyle(1));
                }
            }
            if (z2 && z) {
                if (LiveHomeTabLayout.access$2300(LiveHomeTabLayout.this) != 0) {
                    setBackgroundColor(LiveHomeTabLayout.access$2300(LiveHomeTabLayout.this));
                }
                sendAccessibilityEvent(4);
                TextView textView3 = this.mTextView;
                if (!(textView3 == null || textView3.getText() == null)) {
                    if (LiveHomeTabLayout.access$2400(LiveHomeTabLayout.this) && frr.k() && (hVar = this.mTab) != null && hVar.q()) {
                        this.mTextView.setShadowLayer(5.0f, 0.0f, 1.0f, Color.parseColor("#33343434"));
                    }
                    this.mTextView.setTextColor(LiveHomeTabLayout.access$2500(LiveHomeTabLayout.this));
                    this.mTextView.setSelected(z);
                    this.mTextView.setAlpha(1.0f);
                    if (LiveHomeTabLayout.access$2600(LiveHomeTabLayout.this) != 0.0f) {
                        this.mTextView.setTextSize(0, LiveHomeTabLayout.access$2600(LiveHomeTabLayout.this));
                    }
                }
                TextView textView4 = this.mRightTopMarkView;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                    if (LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this) != null && !this.rightTopMarkClicked) {
                        LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this).b(h.f(this.mTab));
                        this.rightTopMarkClicked = true;
                    }
                    TextView textView5 = this.mTextView;
                    if (textView5 != null) {
                        textView5.setPadding(LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 8), 0, LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 8), 0);
                    }
                }
                View view = this.mRedPointView;
                if (view != null) {
                    view.setVisibility(8);
                    if (LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this) != null && !this.rightTopMarkClicked) {
                        LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this).b(h.f(this.mTab));
                        this.rightTopMarkClicked = true;
                    }
                }
                View view2 = this.mIconView;
                if (view2 != null) {
                    view2.setSelected(z);
                }
            }
        }

        public final void update() {
            View view;
            TextView textView;
            TextView textView2;
            TUrlImageView tUrlImageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            h hVar = this.mTab;
            if (hVar == null) {
                view = null;
            } else if (hVar.j() == null) {
                view = LiveHomeTabLayout.access$3300(LiveHomeTabLayout.this, hVar);
            } else {
                view = hVar.j();
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
                TextView textView3 = this.mTextView;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view2 = this.mIconView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                TextView textView4 = (TextView) view.findViewById(16908308);
                this.mCustomTextView = textView4;
                if (textView4 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView4);
                }
                this.mCustomIconView = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.mCustomView;
                if (view3 != null) {
                    removeView(view3);
                    this.mCustomView = null;
                }
                this.mCustomTextView = null;
                this.mCustomIconView = null;
            }
            if (this.mCustomView == null) {
                if (this.mIconView == null) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_tab_icon_layout_flexalocal, (ViewGroup) this, false);
                    addView(inflate, 0);
                    this.mIconView = inflate;
                    this.mTUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_xtab_view);
                    this.mAnimView = inflate.findViewById(R.id.live_xtab_view_anim);
                }
                if (this.mTextView == null) {
                    TextView textView5 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.live_home_tab_layout_tab_text_flexalocal, (ViewGroup) this, false);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView5.getLayoutParams();
                    layoutParams.addRule(13);
                    textView5.setId(View.generateViewId());
                    addView(textView5, layoutParams);
                    this.mTextView = textView5;
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView5);
                }
                int access$2800 = LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 8);
                TextView textView6 = this.mRightTopMarkView;
                if (!(textView6 == null || textView6.getVisibility() == 8)) {
                    access$2800 = (TextUtils.isEmpty(this.mRightTopMarkView.getText()) || this.mRightTopMarkView.getText().length() <= 1) ? LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 11) : LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 13);
                }
                this.mTextView.setPadding(LiveHomeTabLayout.access$2800(LiveHomeTabLayout.this, 8), 0, access$2800, 0);
                this.mTextView.setTextAppearance(getContext(), LiveHomeTabLayout.access$3400(LiveHomeTabLayout.this));
                this.mTextView.setGravity(1);
                this.mTextView.setTextColor(LiveHomeTabLayout.access$2200(LiveHomeTabLayout.this));
                if (!(hVar == null || h.f(hVar) == null || TextUtils.isEmpty(h.f(hVar).showPic) || this.mTabImageView != null || (tUrlImageView = (TUrlImageView) LayoutInflater.from(getContext()).inflate(R.layout.live_home_tab_image_layout_flexalocal, (ViewGroup) this, false)) == null)) {
                    ViewGroup viewGroup = (ViewGroup) tUrlImageView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(tUrlImageView);
                    }
                    this.mTabImageView = tUrlImageView;
                    tUrlImageView.setId(View.generateViewId());
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mTabImageView.getLayoutParams();
                    layoutParams2.addRule(13);
                    this.mTabImageView.setImageUrl(h.f(hVar).showPic);
                    updateImageTab(h.f(hVar).showPic);
                    addView(this.mTabImageView, layoutParams2);
                }
                if (!(hVar == null || h.f(hVar) == null || !h.f(hVar).redPoint || this.mRedPointView != null || (textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.live_home_tab_red_point_flexalocal, (ViewGroup) this, false)) == null)) {
                    this.mRedPointView = textView2;
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
                    View view4 = this.mTabImageView;
                    if (view4 == null) {
                        view4 = this.mTextView;
                    }
                    layoutParams3.addRule(6, view4.getId());
                    View view5 = this.mTabImageView;
                    if (view5 == null) {
                        view5 = this.mTextView;
                    }
                    layoutParams3.addRule(19, view5.getId());
                    layoutParams3.rightMargin = sj7.b(getContext(), 6.0f);
                    addView(textView2, layoutParams3);
                    if (LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this) != null) {
                        LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this).a(h.f(hVar));
                    }
                }
                if (hVar != null && h.f(hVar) != null && !h.f(hVar).redPoint && !TextUtils.isEmpty(h.f(hVar).followLiveNum) && this.mRightTopMarkView == null && (textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.live_home_tab_right_top_mark_flexalocal, (ViewGroup) this, false)) != null) {
                    this.mRightTopMarkView = textView;
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    View view6 = this.mTabImageView;
                    if (view6 == null) {
                        view6 = this.mTextView;
                    }
                    layoutParams4.addRule(6, view6.getId());
                    View view7 = this.mTabImageView;
                    if (view7 == null) {
                        view7 = this.mTextView;
                    }
                    layoutParams4.addRule(19, view7.getId());
                    layoutParams4.topMargin = sj7.b(getContext(), -5.0f);
                    addView(textView, layoutParams4);
                    textView.setText(h.f(hVar).followLiveNum);
                    if (LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this) != null) {
                        LiveHomeTabLayout.access$2700(LiveHomeTabLayout.this).a(h.f(hVar));
                    }
                }
                updateTextAndIcon(this.mTextView, this.mTabImageView, this.mIconView, this.mTUrlImageView, this.mAnimView);
                return;
            }
            TextView textView7 = this.mCustomTextView;
            if (textView7 != null || this.mCustomIconView != null) {
                updateTextAndIcon(textView7, null, this.mCustomIconView, null, null);
            }
        }

        private void iconAnim(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29d1fbb1", new Object[]{this, view, view2});
            } else if (view != null && view2 != null) {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet == null) {
                    this.animatorSet = new AnimatorSet();
                } else {
                    animatorSet.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 0.8f, 1.0f, 0.8f);
                ofFloat.setDuration(1500L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 0.8f, 1.0f, 0.8f);
                ofFloat2.setDuration(1500L);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat3.setDuration(1200L);
                ofFloat3.setRepeatCount(-1);
                ofFloat3.setRepeatMode(1);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.1f, 0.8f);
                ofFloat4.setDuration(1200L);
                ofFloat4.setRepeatCount(-1);
                ofFloat4.setRepeatMode(1);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.1f, 0.8f);
                ofFloat5.setDuration(1200L);
                ofFloat5.setRepeatCount(-1);
                ofFloat5.setRepeatMode(1);
                this.animatorSet.setDuration(1500L);
                this.animatorSet.playTogether(ofFloat, ofFloat2, ofFloat4, ofFloat5, ofFloat3);
                this.animatorSet.start();
            }
        }
    }
}
