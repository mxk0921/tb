package com.taobao.live.home.widget.tab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.a;
import com.taobao.taobao.R;
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
import tb.ipt;
import tb.oz0;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class XTabLayout extends HorizontalScrollView {
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
    private static final Pools.Pool<g> sTabPool = new Pools.SynchronizedPool(16);
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
    private com.taobao.live.home.widget.tab.a mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private g mSelectedTab;
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
    private float mTabTextSize;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<g> mTabs;
    private ViewPager mViewPager;
    private com.taobao.live.home.widget.tab.d mXTabCustomListener;
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.live.home.widget.tab.a mIndicatorAnimator;
        private int mSelectedIndicatorHeight;
        private int mSelectedIndicatorWidth;
        private float mSelectionOffset;
        private int mSelectedPosition = -1;
        private int mIndicatorLeft = -1;
        private int mIndicatorRight = -1;
        private final Paint mSelectedIndicatorPaint = new Paint();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements a.e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f10971a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f10971a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // com.taobao.live.home.widget.tab.a.e
            public void a(com.taobao.live.home.widget.tab.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1419b9b7", new Object[]{this, aVar});
                    return;
                }
                float b = aVar.b();
                SlidingTabStrip.access$3700(SlidingTabStrip.this, oz0.a(this.f10971a, this.b, b), oz0.a(this.c, this.d, b));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b extends a.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f10972a;

            public b(int i) {
                this.f10972a = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/widget/tab/XTabLayout$SlidingTabStrip$2");
            }

            public void c(com.taobao.live.home.widget.tab.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8758a20f", new Object[]{this, aVar});
                    return;
                }
                SlidingTabStrip.access$3802(SlidingTabStrip.this, this.f10972a);
                SlidingTabStrip.access$3902(SlidingTabStrip.this, 0.0f);
            }
        }

        static {
            t2o.a(806355549);
        }

        public SlidingTabStrip(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public static /* synthetic */ void access$3700(SlidingTabStrip slidingTabStrip, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d44ed81", new Object[]{slidingTabStrip, new Integer(i), new Integer(i2)});
            } else {
                slidingTabStrip.setIndicatorPosition(i, i2);
            }
        }

        public static /* synthetic */ int access$3802(SlidingTabStrip slidingTabStrip, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f04a52", new Object[]{slidingTabStrip, new Integer(i)})).intValue();
            }
            slidingTabStrip.mSelectedPosition = i;
            return i;
        }

        public static /* synthetic */ float access$3902(SlidingTabStrip slidingTabStrip, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a45e3b6b", new Object[]{slidingTabStrip, new Float(f)})).floatValue();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/widget/tab/XTabLayout$SlidingTabStrip");
            }
        }

        private void setIndicatorPosition(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90adc6bd", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int access$1500 = i + XTabLayout.access$1500(XTabLayout.this);
            int access$1700 = i2 - XTabLayout.access$1700(XTabLayout.this);
            if (access$1500 != this.mIndicatorLeft || access$1700 != this.mIndicatorRight) {
                this.mIndicatorLeft = access$1500;
                this.mIndicatorRight = access$1700;
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
                if (this.mSelectedIndicatorWidth == 0 && !XTabLayout.access$3600(XTabLayout.this)) {
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
            com.taobao.live.home.widget.tab.a aVar = this.mIndicatorAnimator;
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
                int access$1300 = XTabLayout.access$1300(XTabLayout.this, 24);
                if (i >= this.mSelectedPosition ? !z : z) {
                    i5 = left - access$1300;
                } else {
                    i5 = access$1300 + right;
                }
                i4 = i5;
                i3 = i4;
            }
            if (i4 != left || i3 != right) {
                com.taobao.live.home.widget.tab.a a2 = com.taobao.live.home.widget.tab.c.a();
                this.mIndicatorAnimator = a2;
                a2.i(oz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
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
                if (this.mSelectedIndicatorWidth == 0 || XTabLayout.access$3600(XTabLayout.this)) {
                    int i2 = this.mIndicatorRight - this.mIndicatorLeft;
                    if (i2 > XTabLayout.access$4000(XTabLayout.this).q()) {
                        this.mIndicatorLeft += (i2 - XTabLayout.access$4000(XTabLayout.this).q()) / 2;
                        this.mIndicatorRight -= (i2 - XTabLayout.access$4000(XTabLayout.this).q()) / 2;
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
                canvas.drawRoundRect(new RectF(this.mIndicatorLeft, getHeight() - this.mSelectedIndicatorHeight, this.mIndicatorRight, getHeight()), 3.0f, 2.0f, this.mSelectedIndicatorPaint);
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
            com.taobao.live.home.widget.tab.a aVar = this.mIndicatorAnimator;
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
            if (View.MeasureSpec.getMode(i) == 1073741824 && XTabLayout.access$2900(XTabLayout.this) == 1 && XTabLayout.access$3400(XTabLayout.this) == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (XTabLayout.access$1300(XTabLayout.this, 16) * 2)) {
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
                        XTabLayout.access$3402(XTabLayout.this, 0);
                        XTabLayout.access$3500(XTabLayout.this, false);
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
            com.taobao.live.home.widget.tab.a aVar = this.mIndicatorAnimator;
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface TabGravity {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<XTabLayout> f10973a;
        public int b;
        public int c;

        static {
            t2o.a(806355554);
        }

        public TabLayoutOnPageChangeListener(XTabLayout xTabLayout) {
            this.f10973a = new WeakReference<>(xTabLayout);
        }

        public static /* synthetic */ void a(TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d798c915", new Object[]{tabLayoutOnPageChangeListener});
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
            XTabLayout xTabLayout = this.f10973a.get();
            if (xTabLayout != null) {
                int i3 = this.c;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z2 = false;
                }
                XTabLayout.access$4100(xTabLayout, i, f, z, z2);
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
            XTabLayout xTabLayout = this.f10973a.get();
            if (xTabLayout != null && xTabLayout.getSelectedTabPosition() != i) {
                int i2 = this.c;
                if (!(i2 == 0 || (i2 == 2 && this.b == 0))) {
                    z = false;
                }
                xTabLayout.selectTab(xTabLayout.getTabAt(i), z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (XTabLayout.access$000(XTabLayout.this) > 0) {
                LinearLayout linearLayout = (LinearLayout) XTabLayout.this.getChildAt(0);
                linearLayout.setShowDividers(2);
                as7 as7Var = new as7(XTabLayout.this.getContext());
                as7Var.c(XTabLayout.access$000(XTabLayout.this), XTabLayout.access$100(XTabLayout.this));
                as7Var.b(XTabLayout.access$200(XTabLayout.this));
                as7Var.d(XTabLayout.access$300(XTabLayout.this));
                linearLayout.setDividerDrawable(as7Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TabView f10975a;

        public b(TabView tabView) {
            this.f10975a = tabView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int width = this.f10975a.getWidth();
            String text = this.f10975a.getText();
            if (!TextUtils.isEmpty(text)) {
                Paint paint = new Paint();
                paint.setTextSize(XTabLayout.access$1200(XTabLayout.this));
                Rect rect = new Rect();
                paint.getTextBounds(text, 0, text.length(), rect);
                if (width - rect.width() < XTabLayout.access$1300(XTabLayout.this, 20)) {
                    int width2 = rect.width() + XTabLayout.access$1300(XTabLayout.this, 20);
                    ViewGroup.LayoutParams layoutParams = this.f10975a.getLayoutParams();
                    layoutParams.width = width2;
                    this.f10975a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.live.home.widget.tab.a.e
        public void a(com.taobao.live.home.widget.tab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419b9b7", new Object[]{this, aVar});
            } else {
                XTabLayout.this.scrollTo(aVar.c(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void k2(g gVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        void onTabReselected(g gVar);

        void onTabSelected(g gVar);

        void onTabUnselected(g gVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355548);
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/widget/tab/XTabLayout$PagerAdapterObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                XTabLayout.access$4200(XTabLayout.this);
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                XTabLayout.access$4200(XTabLayout.this);
            }
        }

        public /* synthetic */ f(XTabLayout xTabLayout, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class g {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public Drawable f10978a;
        public String b;
        public CharSequence c;
        public int d;
        public View e;
        public XTabLayout f;
        public TabView g;
        public String h;
        public String i;
        public String j;
        public String k;
        public boolean l;
        public int m;

        static {
            t2o.a(806355552);
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public static /* synthetic */ void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1af59098", new Object[]{gVar});
            } else {
                gVar.H();
            }
        }

        public static /* synthetic */ XTabLayout b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XTabLayout) ipChange.ipc$dispatch("ce7d2aac", new Object[]{gVar});
            }
            return gVar.f;
        }

        public static /* synthetic */ XTabLayout c(g gVar, XTabLayout xTabLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XTabLayout) ipChange.ipc$dispatch("c8349d27", new Object[]{gVar, xTabLayout});
            }
            gVar.f = xTabLayout;
            return xTabLayout;
        }

        public static /* synthetic */ TabView d(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("2fa88394", new Object[]{gVar});
            }
            return gVar.g;
        }

        public static /* synthetic */ TabView e(g gVar, TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("b605c8a5", new Object[]{gVar, tabView});
            }
            gVar.g = tabView;
            return tabView;
        }

        public static /* synthetic */ void f(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d59b230", new Object[]{gVar});
            } else {
                gVar.u();
            }
        }

        public g A(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("f1f27a2", new Object[]{this, drawable});
            }
            this.f10978a = drawable;
            H();
            return this;
        }

        public g B(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("2de347e3", new Object[]{this, str});
            }
            this.b = str;
            H();
            return this;
        }

        public void C(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7152273", new Object[]{this, str});
            } else {
                this.i = str;
            }
        }

        public void D(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86076b9a", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void E(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("742c468c", new Object[]{this, new Boolean(z)});
            } else {
                this.l = z;
            }
        }

        public g G(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("95941ee", new Object[]{this, charSequence});
            }
            this.c = charSequence;
            H();
            return this;
        }

        public final void H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b12a895", new Object[]{this});
                return;
            }
            TabView tabView = this.g;
            if (tabView != null) {
                tabView.update();
            }
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2068abba", new Object[]{this});
            }
            return this.j;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b76e74f3", new Object[]{this});
            }
            return this.k;
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
            TabView tabView = this.g;
            if (tabView != null) {
                return tabView.getCustomView();
            }
            return this.e;
        }

        public Drawable k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("b3e39c04", new Object[]{this});
            }
            return this.f10978a;
        }

        public String l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
            }
            return this.b;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("89654563", new Object[]{this});
            }
            return this.i;
        }

        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d3ab485c", new Object[]{this});
            }
            return this.h;
        }

        public int o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public CharSequence p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
            }
            return this.c;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue();
            }
            return this.g.getTextWidth();
        }

        public TabView r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("7ef15f81", new Object[]{this});
            }
            return this.g;
        }

        public boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
            }
            XTabLayout xTabLayout = this.f;
            if (xTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (xTabLayout.getSelectedTabPosition() == this.d) {
                return true;
            } else {
                return false;
            }
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("471b6d84", new Object[]{this})).booleanValue();
            }
            return this.l;
        }

        public final void u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f = null;
            this.g = null;
            this.f10978a = null;
            this.c = null;
            this.d = -1;
            this.e = null;
        }

        public void v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d39db83", new Object[]{this});
                return;
            }
            XTabLayout xTabLayout = this.f;
            if (xTabLayout != null) {
                xTabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void w(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("507e86fc", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public void x(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa9d1e3", new Object[]{this, str});
            } else {
                this.k = str;
            }
        }

        public g y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("daad8664", new Object[]{this, new Integer(i)});
            }
            return z(LayoutInflater.from(this.g.getContext()).inflate(i, (ViewGroup) this.g, false));
        }

        public g z(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("6ef812f5", new Object[]{this, view});
            }
            this.e = view;
            H();
            return this;
        }

        public g() {
            this.d = -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f10979a;

        static {
            t2o.a(806355556);
            t2o.a(806355547);
        }

        public h(ViewPager viewPager) {
            this.f10979a = viewPager;
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.e
        public void onTabReselected(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6330981d", new Object[]{this, gVar});
            }
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.e
        public void onTabSelected(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85f34dea", new Object[]{this, gVar});
            } else {
                this.f10979a.setCurrentItem(gVar.o());
            }
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.e
        public void onTabUnselected(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0e8b83", new Object[]{this, gVar});
            }
        }
    }

    static {
        t2o.a(806355541);
    }

    public XTabLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93dd8cd", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.dividerWidth;
    }

    public static /* synthetic */ int access$100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecc8f68e", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.dividerHeight;
    }

    public static /* synthetic */ float access$1200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2fd36fb", new Object[]{xTabLayout})).floatValue();
        }
        return xTabLayout.mTabSelectedTextSize;
    }

    public static /* synthetic */ int access$1300(XTabLayout xTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea82b7aa", new Object[]{xTabLayout, new Integer(i)})).intValue();
        }
        return xTabLayout.dpToPx(i);
    }

    public static /* synthetic */ int access$1500(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d9e9041", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabPaddingStart;
    }

    public static /* synthetic */ int access$1600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b129ae02", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabPaddingTop;
    }

    public static /* synthetic */ int access$1700(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4b4cbc3", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabPaddingEnd;
    }

    public static /* synthetic */ int access$1800(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("383fe984", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabPaddingBottom;
    }

    public static /* synthetic */ int access$1900(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bcb0745", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.xTabBackgroundColor;
    }

    public static /* synthetic */ int access$200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3054144f", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.dividerColor;
    }

    public static /* synthetic */ boolean access$2000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49bf95ec", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.xTabTextShadowLayer;
    }

    public static /* synthetic */ float access$2100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d4ab399", new Object[]{xTabLayout})).floatValue();
        }
        return xTabLayout.mTabTextSize;
    }

    public static /* synthetic */ boolean access$2200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0d5d16e", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.mTabImageChange;
    }

    public static /* synthetic */ boolean access$2300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1460ef2f", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.xTabTextSelectedBold;
    }

    public static /* synthetic */ boolean access$2400(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57ec0cf0", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.xTabTextBold;
    }

    public static /* synthetic */ int access$2500(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b772aa0", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.xTabSelectedBackgroundColor;
    }

    public static /* synthetic */ int access$2600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df024861", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.getTabMaxWidth();
    }

    public static /* synthetic */ int access$2700(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("228d6622", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabMaxWidth;
    }

    public static /* synthetic */ float access$2800(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("661883e0", new Object[]{xTabLayout})).floatValue();
        }
        return xTabLayout.mTabTextMultiLineSize;
    }

    public static /* synthetic */ int access$2900(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a3a1a4", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mMode;
    }

    public static /* synthetic */ int access$300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73df3210", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.dividerGravity;
    }

    public static /* synthetic */ View access$3000(XTabLayout xTabLayout, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22fb823b", new Object[]{xTabLayout, gVar});
        }
        return xTabLayout.createCustomView(gVar);
    }

    public static /* synthetic */ int access$3100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb234dfb", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabTextAppearance;
    }

    public static /* synthetic */ ColorStateList access$3200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a1b53b2b", new Object[]{xTabLayout});
        }
        return xTabLayout.mTabTextColors;
    }

    public static /* synthetic */ boolean access$3300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4239898e", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.xTabTextAllCaps;
    }

    public static /* synthetic */ int access$3400(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85c4a73e", new Object[]{xTabLayout})).intValue();
        }
        return xTabLayout.mTabGravity;
    }

    public static /* synthetic */ int access$3402(XTabLayout xTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16240149", new Object[]{xTabLayout, new Integer(i)})).intValue();
        }
        xTabLayout.mTabGravity = i;
        return i;
    }

    public static /* synthetic */ void access$3500(XTabLayout xTabLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a98f48", new Object[]{xTabLayout, new Boolean(z)});
        } else {
            xTabLayout.updateTabViews(z);
        }
    }

    public static /* synthetic */ boolean access$3600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdae2d1", new Object[]{xTabLayout})).booleanValue();
        }
        return xTabLayout.xTabDividerWidthWidthText;
    }

    public static /* synthetic */ g access$4000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("deea7222", new Object[]{xTabLayout});
        }
        return xTabLayout.mSelectedTab;
    }

    public static /* synthetic */ void access$4100(XTabLayout xTabLayout, int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4573944", new Object[]{xTabLayout, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
        } else {
            xTabLayout.setScrollPosition(i, f2, z, z2);
        }
    }

    public static /* synthetic */ void access$4200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c870628", new Object[]{xTabLayout});
        } else {
            xTabLayout.populateFromPagerAdapter();
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

    private void addTabFromItemView(TabItem tabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d454a861", new Object[]{this, tabItem});
            return;
        }
        g newTab = newTab();
        CharSequence charSequence = tabItem.mText;
        if (charSequence != null) {
            newTab.G(charSequence);
        }
        Drawable drawable = tabItem.mIcon;
        if (drawable != null) {
            newTab.A(drawable);
        }
        int i = tabItem.mCustomLayout;
        if (i != 0) {
            newTab.y(i);
        }
        addTab(newTab);
    }

    private void addTabView(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d659d22", new Object[]{this, gVar, new Boolean(z)});
            return;
        }
        TabView d2 = g.d(gVar);
        if (this.mTabSelectedTextSize != 0.0f) {
            d2.post(new b(d2));
        }
        this.mTabStrip.addView(d2, createLayoutParamsForTabs());
        if (z) {
            d2.setSelected(true);
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
                if (this.mScrollAnimator == null) {
                    com.taobao.live.home.widget.tab.a a2 = com.taobao.live.home.widget.tab.c.a();
                    this.mScrollAnimator = a2;
                    a2.i(oz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
                    this.mScrollAnimator.f(300);
                    this.mScrollAnimator.k(new c());
                }
                this.mScrollAnimator.h(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.l();
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
        return ((childAt.getLeft() + ((int) (((i2 + i3) * f2) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
    }

    private void configureTab(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f586b83b", new Object[]{this, gVar, new Integer(i)});
            return;
        }
        gVar.E(i);
        this.mTabs.add(i, gVar);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                this.mTabs.get(i).E(i);
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

    private View createCustomView(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15291ccd", new Object[]{this, gVar});
        }
        com.taobao.live.home.widget.tab.d dVar = this.mXTabCustomListener;
        if (dVar != null) {
            return dVar.a(gVar);
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

    private TabView createTabView(g gVar) {
        TabView tabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("628824cc", new Object[]{this, gVar});
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
        TabView.access$1100(tabView, gVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        return tabView;
    }

    private int dpToPx(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue();
        }
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.mTabs.get(i);
            if (!(gVar == null || gVar.k() == null || TextUtils.isEmpty(gVar.p()))) {
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

    public static /* synthetic */ Object ipc$super(XTabLayout xTabLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1992612095) {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/widget/tab/XTabLayout");
        }
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (childAt instanceof TabView) {
            TabView.access$1400((TabView) childAt);
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

    private void setSelectedTabView(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount && !this.mTabStrip.getChildAt(i).isSelected()) {
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
            g.a(this.mTabs.get(i));
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
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            View childAt = this.mTabStrip.getChildAt(i);
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
            ipChange.ipc$dispatch("4eebc96d", new Object[]{this, eVar});
        } else {
            this.mOnTabSelectedListenerList.add(eVar);
        }
    }

    public void addTab(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8707ad", new Object[]{this, gVar});
        } else {
            addTab(gVar, this.mTabs.isEmpty());
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
        g gVar = this.mSelectedTab;
        if (gVar != null) {
            return gVar.o();
        }
        return -1;
    }

    public g getTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1b13fa9e", new Object[]{this, new Integer(i)});
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

    public g newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a944f62c", new Object[]{this});
        }
        g acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new g(null);
        }
        g.c(acquire, this);
        g.e(acquire, createTabView(acquire));
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
        Iterator<g> it = this.mTabs.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            g.f(next);
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    public void removeTab(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f66246a", new Object[]{this, gVar});
        } else if (g.b(gVar) == this) {
            removeTabAt(gVar.o());
        } else {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i) {
        int i2;
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar2 = this.mSelectedTab;
        if (gVar2 != null) {
            i2 = gVar2.o();
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        g remove = this.mTabs.remove(i);
        if (remove != null) {
            g.f(remove);
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.mTabs.get(i3).E(i3);
        }
        if (i2 == i) {
            if (this.mTabs.isEmpty()) {
                gVar = null;
            } else {
                gVar = this.mTabs.get(Math.max(0, i - 1));
            }
            selectTab(gVar);
        }
    }

    public void selectTab(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01540f2", new Object[]{this, gVar});
        } else {
            selectTab(gVar, true);
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

    public void setDividerColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = i;
        addDivider();
    }

    public void setDividerGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c773c5", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerGravity = i;
        addDivider();
    }

    public void setDividerSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0b321f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.dividerWidth = i;
        this.dividerHeight = i2;
        addDivider();
    }

    public void setOnTabClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0522e54", new Object[]{this, dVar});
        } else {
            this.mOnTabClickListener = dVar;
        }
    }

    public void setOnTabSelectedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c283bd0c", new Object[]{this, eVar});
        } else {
            this.mOnTabSelectedListener = eVar;
        }
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

    public void setTabImageChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc97715", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabImageChange = z;
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

    public void setXTabCustomListener(com.taobao.live.home.widget.tab.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7bfc93", new Object[]{this, dVar});
        } else {
            this.mXTabCustomListener = dVar;
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
                setOnTabSelectedListener(new h(viewPager));
                setPagerAdapter(adapter, true);
                return;
            }
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = null;
        setOnTabSelectedListener(null);
        setPagerAdapter(null, true);
    }

    public void setxTabDisplayNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d5119", new Object[]{this, new Integer(i)});
        } else {
            this.xTabDisplayNum = i;
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

    public XTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setScrollPosition(int i, float f2, boolean z, boolean z2) {
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
            com.taobao.live.home.widget.tab.a aVar = this.mScrollAnimator;
            if (aVar != null && aVar.e()) {
                this.mScrollAnimator.a();
            }
            scrollTo(calculateScrollXForTab(i, f2), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void addTab(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515a60f6", new Object[]{this, gVar, new Integer(i)});
        } else {
            addTab(gVar, i, this.mTabs.isEmpty());
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

    public void selectTab(g gVar, boolean z) {
        d dVar;
        e eVar;
        e eVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12939022", new Object[]{this, gVar, new Boolean(z)});
            return;
        }
        g gVar2 = this.mSelectedTab;
        if (gVar2 != gVar) {
            if (z) {
                int o = gVar != null ? gVar.o() : -1;
                if (o != -1) {
                    setSelectedTabView(o);
                }
                g gVar3 = this.mSelectedTab;
                if ((gVar3 == null || gVar3.o() == -1) && o != -1) {
                    setScrollPosition(o, 0.0f, true);
                } else {
                    animateToTab(o);
                }
            }
            g gVar4 = this.mSelectedTab;
            if (!(gVar4 == null || (eVar2 = this.mOnTabSelectedListener) == null)) {
                eVar2.onTabUnselected(gVar4);
            }
            for (e eVar3 : this.mOnTabSelectedListenerList) {
                eVar3.onTabUnselected(this.mSelectedTab);
            }
            this.mSelectedTab = gVar;
            if (!(gVar == null || (eVar = this.mOnTabSelectedListener) == null)) {
                eVar.onTabSelected(gVar);
            }
            g gVar5 = this.mSelectedTab;
            if (!(gVar5 == null || (dVar = this.mOnTabClickListener) == null || !z)) {
                dVar.k2(gVar5);
            }
            for (e eVar4 : this.mOnTabSelectedListenerList) {
                eVar4.onTabSelected(this.mSelectedTab);
            }
        } else if (gVar2 != null) {
            e eVar5 = this.mOnTabSelectedListener;
            if (eVar5 != null) {
                eVar5.onTabReselected(gVar2);
            }
            for (e eVar6 : this.mOnTabSelectedListenerList) {
                eVar6.onTabReselected(this.mSelectedTab);
            }
            animateToTab(gVar.o());
        }
    }

    public XTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xTabTextAllCaps = false;
        this.xTabDividerWidthWidthText = false;
        this.mTabs = new ArrayList<>();
        this.mTabTextSize = 0.0f;
        this.mTabSelectedTextSize = 0.0f;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mOnTabSelectedListenerList = new ArrayList();
        this.mTabViewPool = new Pools.SimplePool(12);
        ipt.a(context);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.mTabStrip = slidingTabStrip;
        slidingTabStrip.setClipChildren(false);
        slidingTabStrip.setClipToPadding(false);
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.XTabLayout, i, R.style.Widget_Design_TabLayout);
        slidingTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabIndicatorHeight, dpToPx(2)));
        slidingTabStrip.setmSelectedIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabIndicatorWidth, 0));
        slidingTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingStart, dimensionPixelSize);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingBottom, this.mTabPaddingBottom);
        this.xTabTextAllCaps = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextAllCaps, false);
        this.mTabTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.XTabLayout_xTabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.mTabTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabTextSize, 0);
        this.xTabTextBold = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextBold, false);
        this.mTabSelectedTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabSelectedTextSize, 0);
        this.xTabTextSelectedBold = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextSelectedBold, false);
        this.xTabTextShadowLayer = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextShadowLayer, false);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.mTabTextAppearance, R.styleable.TextAppearance);
        try {
            if (this.mTabTextSize == 0.0f) {
                this.mTabTextSize = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            }
            this.mTabTextColors = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            int i2 = R.styleable.XTabLayout_xTabTextColor;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(i2);
            }
            int i3 = R.styleable.XTabLayout_xTabSelectedTextColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(i3, 0));
            }
            this.xTabDisplayNum = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabDisplayNum, 0);
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabMaxWidth, -1);
            this.xTabBackgroundColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabBackgroundColor, 0);
            this.xTabSelectedBackgroundColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabSelectedBackgroundColor, 0);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabMode, 1);
            this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabGravity, 0);
            this.dividerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabDividerWidth, 0);
            this.dividerHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabDividerHeight, 0);
            this.dividerColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabDividerColor, -16777216);
            this.dividerGravity = obtainStyledAttributes.getInteger(R.styleable.XTabLayout_xTabDividerGravity, 1);
            this.xTabDividerWidthWidthText = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabDividerWidthWidthText, false);
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
            int i = this.mRequestedTabMinWidth;
            if (i != -1) {
                return i;
            }
            if (this.mMode == 0) {
                return this.mScrollableTabMinWidth;
            }
            return 0;
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
            for (int i = 0; i < count; i++) {
                if (frr.j()) {
                    CharSequence pageTitle = this.mPagerAdapter.getPageTitle(i);
                    g newTab = newTab(i);
                    if (pageTitle != null) {
                        String str = (String) pageTitle;
                        if (!arq.a(str)) {
                            try {
                                JSONObject parseObject = JSON.parseObject(str);
                                String string = parseObject.getString("name");
                                JSONObject jSONObject = parseObject.getJSONObject("tabPic");
                                boolean c2 = !arq.a(parseObject.getString("setShadowLaye")) ? arq.c(parseObject.getString("setShadowLaye")) : false;
                                newTab.G(string);
                                if (jSONObject != null) {
                                    String string2 = jSONObject.getString("normalColorNoSelectIcon");
                                    String string3 = jSONObject.getString("normalColorSelectIcon");
                                    String string4 = jSONObject.getString("changeColorSelectIcon");
                                    String string5 = jSONObject.getString("changeColorNoSelectIcon");
                                    newTab.F(c2);
                                    newTab.w(string4);
                                    newTab.x(string5);
                                    newTab.C(string3);
                                    newTab.D(string2);
                                }
                            } catch (Exception unused) {
                                newTab.G(this.mPagerAdapter.getPageTitle(i));
                            }
                        }
                    }
                    addTab(newTab, false);
                } else {
                    addTab(newTab(i).G(this.mPagerAdapter.getPageTitle(i)), false);
                }
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
                return;
            }
            return;
        }
        removeAllTabs();
    }

    public void addTab(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515aa0c7", new Object[]{this, gVar, new Boolean(z)});
        } else if (g.b(gVar) == this) {
            addTabView(gVar, z);
            configureTab(gVar, this.mTabs.size());
            if (z) {
                gVar.v();
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
            new StringBuilder("specWidth:").append(size);
            PagerAdapter pagerAdapter = this.mPagerAdapter;
            if (pagerAdapter == null || this.xTabDisplayNum == 0) {
                int i3 = this.mRequestedTabMaxWidth;
                if (i3 <= 0) {
                    i3 = size - dpToPx(24);
                }
                this.mTabMaxWidth = i3;
            } else if (pagerAdapter.getCount() == 1 || this.xTabDisplayNum == 1) {
                this.mTabMaxWidth = ((WindowManager) getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
            } else {
                int i4 = this.mRequestedTabMaxWidth;
                if (i4 <= 0) {
                    i4 = size - dpToPx(24);
                }
                this.mTabMaxWidth = i4;
            }
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.mMode;
            if (i5 != 0) {
                if (i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
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

    public g newTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("76773c01", new Object[]{this, new Integer(i)});
        }
        g acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new g(null);
        }
        g.c(acquire, this);
        acquire.m = i;
        g.e(acquire, createTabView(acquire));
        return acquire;
    }

    private void addTabView(g gVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f46ffa3", new Object[]{this, gVar, new Integer(i), new Boolean(z)});
            return;
        }
        TabView d2 = g.d(gVar);
        this.mTabStrip.addView(d2, i, createLayoutParamsForTabs());
        if (z) {
            d2.setSelected(true);
        }
    }

    public void addTab(g gVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f2709e", new Object[]{this, gVar, new Integer(i), new Boolean(z)});
        } else if (g.b(gVar) == this) {
            addTabView(gVar, i, z);
            configureTab(gVar, i);
            if (z) {
                gVar.v();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class TabView extends LinearLayout implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimatorSet animatorSet;
        private View mAnimView;
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines = 2;
        private View mIconView;
        private TUrlImageView mTUrlImageView;
        private g mTab;
        private TUrlImageView mTabImageView;
        private TextView mTextView;

        static {
            t2o.a(806355555);
        }

        public TabView(Context context) {
            super(context);
            ViewCompat.setPaddingRelative(this, XTabLayout.access$1500(XTabLayout.this), XTabLayout.access$1600(XTabLayout.this), XTabLayout.access$1700(XTabLayout.this), XTabLayout.access$1800(XTabLayout.this));
            setGravity(17);
            setOrientation(0);
            setClickable(true);
        }

        public static /* synthetic */ void access$1100(TabView tabView, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6b49c66", new Object[]{tabView, gVar});
            } else {
                tabView.setTab(gVar);
            }
        }

        public static /* synthetic */ void access$1400(TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36b7ab7", new Object[]{tabView});
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/widget/tab/XTabLayout$TabView");
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

        private void setTab(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c12bdecc", new Object[]{this, gVar});
            } else if (gVar != this.mTab) {
                this.mTab = gVar;
                update();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void updateTextAndIcon(android.widget.TextView r17, com.taobao.uikit.extend.feature.view.TUrlImageView r18, android.view.View r19, com.taobao.uikit.extend.feature.view.TUrlImageView r20, android.view.View r21) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.widget.tab.XTabLayout.TabView.updateTextAndIcon(android.widget.TextView, com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View, com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View):void");
        }

        public View getCustomView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this});
            }
            return this.mCustomView;
        }

        public g getTab() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("263bb762", new Object[]{this});
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

        @Override // android.widget.LinearLayout, android.view.View
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
            int access$2600 = XTabLayout.access$2600(XTabLayout.this);
            View view = this.mIconView;
            if (view == null || view.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (access$2600 > 0 && (mode == 0 || size > access$2600 || z)) {
                i = View.MeasureSpec.makeMeasureSpec(XTabLayout.access$2700(XTabLayout.this), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            TextView textView = this.mTextView;
            if (textView != null && textView.getText() != null) {
                getResources();
                float access$2100 = XTabLayout.access$2100(XTabLayout.this);
                int i3 = this.mDefaultMaxLines;
                View view2 = this.mIconView;
                if (view2 == null || view2.getVisibility() != 0) {
                    TextView textView2 = this.mTextView;
                    if (textView2 != null && textView2.getLineCount() > 1) {
                        access$2100 = XTabLayout.access$2800(XTabLayout.this);
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.mTextView.getTextSize();
                int lineCount = this.mTextView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.mTextView);
                int i4 = (access$2100 > textSize ? 1 : (access$2100 == textSize ? 0 : -1));
                if (i4 == 0 && (maxLines < 0 || i3 == maxLines)) {
                    return;
                }
                if (XTabLayout.access$2900(XTabLayout.this) != 1 || i4 <= 0 || lineCount != 1 || ((layout = this.mTextView.getLayout()) != null && approximateLineWidth(layout, 0, access$2100) <= layout.getWidth())) {
                    if (!this.mTextView.isSelected() || XTabLayout.access$1200(XTabLayout.this) == 0.0f) {
                        this.mTextView.setTextSize(0, XTabLayout.access$2100(XTabLayout.this));
                    } else {
                        this.mTextView.setTextSize(0, XTabLayout.access$1200(XTabLayout.this));
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
            g gVar = this.mTab;
            if (gVar == null) {
                return performClick;
            }
            gVar.v();
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:141:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017b A[ADDED_TO_REGION] */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setSelected(boolean r19) {
            /*
                Method dump skipped, instructions count: 700
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.widget.tab.XTabLayout.TabView.setSelected(boolean):void");
        }

        public final void update() {
            View view;
            View inflate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            g gVar = this.mTab;
            if (gVar == null) {
                view = null;
            } else if (gVar.j() == null) {
                view = XTabLayout.access$3000(XTabLayout.this, gVar);
            } else {
                view = gVar.j();
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
                View view2 = this.mIconView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.mCustomTextView = textView2;
                if (textView2 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView2);
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
                    View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_icon_layout, (ViewGroup) this, false);
                    addView(inflate2, 0);
                    this.mIconView = inflate2;
                    this.mTUrlImageView = (TUrlImageView) inflate2.findViewById(R.id.live_xtab_view);
                    this.mAnimView = inflate2.findViewById(R.id.live_xtab_view_anim);
                }
                if (this.mTextView == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_layout_tab_text, (ViewGroup) this, false);
                    textView3.setMinWidth(110);
                    addView(textView3);
                    this.mTextView = textView3;
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView3);
                }
                this.mTextView.setTextAppearance(getContext(), XTabLayout.access$3100(XTabLayout.this));
                this.mTextView.setGravity(1);
                if (XTabLayout.access$3200(XTabLayout.this) != null) {
                    this.mTextView.setTextColor(XTabLayout.access$3200(XTabLayout.this));
                }
                if (frr.j() && this.mTabImageView == null && (inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_image_layout, (ViewGroup) this, false)) != null) {
                    ViewGroup viewGroup = (ViewGroup) inflate.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(inflate);
                    }
                    addView(inflate);
                    this.mTabImageView = (TUrlImageView) inflate.findViewById(R.id.live_xtab_image_view);
                }
                updateTextAndIcon(this.mTextView, this.mTabImageView, this.mIconView, this.mTUrlImageView, this.mAnimView);
                return;
            }
            TextView textView4 = this.mCustomTextView;
            if (textView4 != null || this.mCustomIconView != null) {
                updateTextAndIcon(textView4, null, this.mCustomIconView, null, null);
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
