package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] ATTRS = {16842901, 16842904};
    private int currentPosition;
    private float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    private final PageListener pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class PageListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(724566040);
        }

        public PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, PagerSlidingTabStrip.access$200(pagerSlidingTabStrip).getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            PagerSlidingTabStrip.access$102(PagerSlidingTabStrip.this, i);
            PagerSlidingTabStrip.access$402(PagerSlidingTabStrip.this, f);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, i, (int) (PagerSlidingTabStrip.access$500(pagerSlidingTabStrip).getChildAt(i).getWidth() * f));
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i);
            }
        }

        public /* synthetic */ PageListener(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int currentPosition;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("9dc37e9c", new Object[]{this, parcel});
                }
                return new SavedState(parcel, null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("68200505", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        static {
            t2o.a(724566041);
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPosition);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPosition = parcel.readInt();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            PagerSlidingTabStrip.access$102(pagerSlidingTabStrip, PagerSlidingTabStrip.access$200(pagerSlidingTabStrip).getCurrentItem());
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            PagerSlidingTabStrip.access$300(pagerSlidingTabStrip2, PagerSlidingTabStrip.access$100(pagerSlidingTabStrip2), 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9697a;

        public b(int i) {
            this.f9697a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PagerSlidingTabStrip.access$200(PagerSlidingTabStrip.this).setCurrentItem(this.f9697a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        int a(int i);
    }

    static {
        t2o.a(724566036);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$100(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("384deb80", new Object[]{pagerSlidingTabStrip})).intValue();
        }
        return pagerSlidingTabStrip.currentPosition;
    }

    public static /* synthetic */ int access$102(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b88f018b", new Object[]{pagerSlidingTabStrip, new Integer(i)})).intValue();
        }
        pagerSlidingTabStrip.currentPosition = i;
        return i;
    }

    public static /* synthetic */ ViewPager access$200(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("3fe17653", new Object[]{pagerSlidingTabStrip});
        }
        return pagerSlidingTabStrip.pager;
    }

    public static /* synthetic */ void access$300(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30eeaceb", new Object[]{pagerSlidingTabStrip, new Integer(i), new Integer(i2)});
        } else {
            pagerSlidingTabStrip.scrollToChild(i, i2);
        }
    }

    public static /* synthetic */ float access$402(PagerSlidingTabStrip pagerSlidingTabStrip, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1cd5e48", new Object[]{pagerSlidingTabStrip, new Float(f)})).floatValue();
        }
        pagerSlidingTabStrip.currentPositionOffset = f;
        return f;
    }

    public static /* synthetic */ LinearLayout access$500(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("4e674e0", new Object[]{pagerSlidingTabStrip});
        }
        return pagerSlidingTabStrip.tabsContainer;
    }

    private void addIconTab(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4233b62", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        addTab(i, imageButton);
    }

    private void addTab(int i, View view) {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7e872a", new Object[]{this, new Integer(i), view});
            return;
        }
        view.setFocusable(true);
        ViewProxy.setOnClickListener(view, new b(i));
        int i2 = this.tabPadding;
        view.setPadding(i2, 0, i2, 0);
        LinearLayout linearLayout = this.tabsContainer;
        if (this.shouldExpand) {
            layoutParams = this.expandedTabLayoutParams;
        } else {
            layoutParams = this.defaultTabLayoutParams;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    private void addTextTab(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af91aff", new Object[]{this, new Integer(i), str});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        addTab(i, textView);
    }

    public static /* synthetic */ Object ipc$super(PagerSlidingTabStrip pagerSlidingTabStrip, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 27005610) {
            return super.onSaveInstanceState();
        } else {
            if (hashCode == 80153535) {
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/trade/ui/widget/PagerSlidingTabStrip");
        }
    }

    private void scrollToChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0845bfb", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.tabCount != 0) {
            int left = this.tabsContainer.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.scrollOffset;
            }
            if (left != this.lastScrollX) {
                this.lastScrollX = left;
                scrollTo(left, 0);
            }
        }
    }

    private void updateTabStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d0795", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setBackgroundResource(this.tabBackgroundResId);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.tabTextSize);
                textView.setTypeface(this.tabTypeface, this.tabTypefaceStyle);
                textView.setTextColor(this.tabTextColor);
                if (this.textAllCaps) {
                    textView.setAllCaps(true);
                }
            }
        }
    }

    public int getDividerColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5902aba", new Object[]{this})).intValue();
        }
        return this.dividerColor;
    }

    public int getDividerPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91908d28", new Object[]{this})).intValue();
        }
        return this.dividerPadding;
    }

    public int getIndicatorColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce626f04", new Object[]{this})).intValue();
        }
        return this.indicatorColor;
    }

    public int getIndicatorHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca59a5a", new Object[]{this})).intValue();
        }
        return this.indicatorHeight;
    }

    public int getScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b1e35b0", new Object[]{this})).intValue();
        }
        return this.scrollOffset;
    }

    public boolean getShouldExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dc19bae", new Object[]{this})).booleanValue();
        }
        return this.shouldExpand;
    }

    public int getTabBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7bb3ce7", new Object[]{this})).intValue();
        }
        return this.tabBackgroundResId;
    }

    public int getTabPaddingLeftRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccc006bd", new Object[]{this})).intValue();
        }
        return this.tabPadding;
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return this.tabTextColor;
    }

    public int getTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue();
        }
        return this.tabTextSize;
    }

    public int getUnderlineColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c829eae7", new Object[]{this})).intValue();
        }
        return this.underlineColor;
    }

    public int getUnderlineHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bcd9ad7", new Object[]{this})).intValue();
        }
        return this.underlineHeight;
    }

    public boolean isTextAllCaps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b73c19b6", new Object[]{this})).booleanValue();
        }
        return this.textAllCaps;
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof c) {
                addIconTab(i, ((c) this.pager.getAdapter()).a(i));
            } else {
                addTextTab(i, this.pager.getAdapter().getPageTitle(i).toString());
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!(isInEditMode() || this.tabCount == 0)) {
            int height = getHeight();
            this.rectPaint.setColor(this.indicatorColor);
            View childAt = this.tabsContainer.getChildAt(this.currentPosition);
            float left = childAt.getLeft();
            float right = childAt.getRight();
            if (this.currentPositionOffset > 0.0f && (i = this.currentPosition) < this.tabCount - 1) {
                View childAt2 = this.tabsContainer.getChildAt(i + 1);
                float f = this.currentPositionOffset;
                left = (childAt2.getLeft() * f) + ((1.0f - f) * left);
                right = (childAt2.getRight() * f) + ((1.0f - f) * right);
            }
            float f2 = height;
            canvas.drawRect(left, height - this.indicatorHeight, right, f2, this.rectPaint);
            this.rectPaint.setColor(this.underlineColor);
            canvas.drawRect(0.0f, height - this.underlineHeight, this.tabsContainer.getWidth(), f2, this.rectPaint);
            this.dividerPaint.setColor(this.dividerColor);
            for (int i2 = 0; i2 < this.tabCount - 1; i2++) {
                View childAt3 = this.tabsContainer.getChildAt(i2);
                canvas.drawLine(childAt3.getRight(), this.dividerPadding, childAt3.getRight(), height - this.dividerPadding, this.dividerPaint);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPosition = savedState.currentPosition;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.textAllCaps = z;
        }
    }

    public void setDividerColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e675fe22", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec64be2", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerPadding = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c776a018", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2615488", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorHeight = i;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1037bbe", new Object[]{this, onPageChangeListener});
        } else {
            this.delegatePageListener = onPageChangeListener;
        }
    }

    public void setScrollOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f015a", new Object[]{this, new Integer(i)});
            return;
        }
        this.scrollOffset = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260898de", new Object[]{this, new Boolean(z)});
            return;
        }
        this.shouldExpand = z;
        requestLayout();
    }

    public void setTabBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d8569b", new Object[]{this, new Integer(i)});
        } else {
            this.tabBackgroundResId = i;
        }
    }

    public void setTabPaddingLeftRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0e0e85", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabPadding = i;
        updateTabStyles();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextColor = i;
        updateTabStyles();
    }

    public void setTextColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d587707a", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextColor = getResources().getColor(i);
        updateTabStyles();
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextSize = i;
        updateTabStyles();
    }

    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        this.tabTypeface = typeface;
        this.tabTypefaceStyle = i;
        updateTabStyles();
    }

    public void setUnderlineColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b58a603", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c408d395", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83963ab", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineHeight = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0412f4", new Object[]{this, viewPager});
            return;
        }
        this.pager = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.pageListener);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pageListener = new PageListener(this, null);
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorColor = -10066330;
        this.underlineColor = 436207616;
        this.dividerColor = 436207616;
        this.shouldExpand = false;
        this.textAllCaps = true;
        this.scrollOffset = 52;
        this.indicatorHeight = 8;
        this.underlineHeight = 2;
        this.dividerPadding = 12;
        this.tabPadding = 24;
        this.dividerWidth = 1;
        this.tabTextSize = 12;
        this.tabTextColor = -10066330;
        this.tabTypeface = null;
        this.tabTypefaceStyle = 1;
        this.lastScrollX = 0;
        this.tabBackgroundResId = R.drawable.psts_tab_bg;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, this.indicatorHeight, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, this.tabPadding, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, this.tabTextSize, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(0, this.tabTextSize);
        this.tabTextColor = obtainStyledAttributes.getColor(1, this.tabTextColor);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStrip);
        this.indicatorColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_indicator_color, this.indicatorColor);
        this.underlineColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_underline_color, this.underlineColor);
        this.dividerColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_divider_color, this.dividerColor);
        this.indicatorHeight = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_indicator_height, this.indicatorHeight);
        this.underlineHeight = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_underline_height, this.underlineHeight);
        this.dividerPadding = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_divider_padding, this.dividerPadding);
        this.tabPadding = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tab_padding_left_right, this.tabPadding);
        this.tabBackgroundResId = obtainStyledAttributes2.getResourceId(R.styleable.PagerSlidingTabStrip_tab_background, this.tabBackgroundResId);
        this.shouldExpand = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_should_expand, this.shouldExpand);
        this.scrollOffset = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_scroll_offset, this.scrollOffset);
        this.textAllCaps = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_text_all_caps, this.textAllCaps);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.dividerPaint = paint2;
        paint2.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth(this.dividerWidth);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
    }
}
