package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.regex.Pattern;
import tb.nw0;
import tb.o3s;
import tb.t2o;
import tb.tkt;
import tb.wda;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PagerSlidingTabStripAType extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int defaultIndicatorRound;
    public int h;
    public boolean mCacheDataEnable;
    private int mCurrentPosition;
    private float mCurrentPositionOffset;
    private ViewPager.OnPageChangeListener mDelegatePageListener;
    public int mDividerColor;
    public int mDividerHeight;
    public int mDividerWidth;
    public int mIndicatorHeight;
    private final int mIndicatorMarginBottom;
    public int mIndicatorPaddingRight;
    public int mIndicatorWidth;
    private PageListener mInnerPageListener;
    private int mLastScrollX;
    private View.OnClickListener mOnClickListener;
    public Paint mPaint;
    private final int mScrollOffset;
    public int mTabCount;
    private LinearLayout.LayoutParams mTabLayoutParams;
    public LinearLayout mTabsContainer;
    private ViewPager mViewPager;
    private final int paintDefaultColor;
    private final RectF rect;
    private final int selectColor;
    private final int selectTextStyle;
    private final int textColor;
    private final int textDefaultMargin;
    private final int textSize;
    private final int textStyle;
    public int w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class PageListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699440);
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
                PagerSlidingTabStripAType pagerSlidingTabStripAType = PagerSlidingTabStripAType.this;
                PagerSlidingTabStripAType.access$400(pagerSlidingTabStripAType, PagerSlidingTabStripAType.access$100(pagerSlidingTabStripAType).getCurrentItem(), 0.0f);
            }
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) != null) {
                PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            PagerSlidingTabStripAType.access$202(PagerSlidingTabStripAType.this, i);
            PagerSlidingTabStripAType.access$302(PagerSlidingTabStripAType.this, f);
            PagerSlidingTabStripAType.access$400(PagerSlidingTabStripAType.this, i, f);
            PagerSlidingTabStripAType.this.invalidate();
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) != null) {
                PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            PagerSlidingTabStripAType.this.selectTab(i);
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) != null) {
                PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageSelected(i);
            }
        }

        public /* synthetic */ PageListener(PagerSlidingTabStripAType pagerSlidingTabStripAType, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int currentPosition;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("b0f4aeee", new Object[]{this, parcel});
                }
                return new SavedState(parcel, null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("7cc04d25", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        static {
            t2o.a(295699441);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                PagerSlidingTabStripAType.access$100(PagerSlidingTabStripAType.this).setCurrentItem(((Integer) view.getTag()).intValue());
            } catch (Exception e) {
                o3s.b("PagerSlidingTabStripAType", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        View b(int i);
    }

    static {
        t2o.a(295699438);
    }

    public PagerSlidingTabStripAType(Context context) {
        this(context, null);
    }

    public static /* synthetic */ ViewPager access$100(PagerSlidingTabStripAType pagerSlidingTabStripAType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("73b5673a", new Object[]{pagerSlidingTabStripAType});
        }
        return pagerSlidingTabStripAType.mViewPager;
    }

    public static /* synthetic */ int access$202(PagerSlidingTabStripAType pagerSlidingTabStripAType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f1df7e0", new Object[]{pagerSlidingTabStripAType, new Integer(i)})).intValue();
        }
        pagerSlidingTabStripAType.mCurrentPosition = i;
        return i;
    }

    public static /* synthetic */ float access$302(PagerSlidingTabStripAType pagerSlidingTabStripAType, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ede2039", new Object[]{pagerSlidingTabStripAType, new Float(f)})).floatValue();
        }
        pagerSlidingTabStripAType.mCurrentPositionOffset = f;
        return f;
    }

    public static /* synthetic */ void access$400(PagerSlidingTabStripAType pagerSlidingTabStripAType, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d734f3", new Object[]{pagerSlidingTabStripAType, new Integer(i), new Float(f)});
        } else {
            pagerSlidingTabStripAType.scrollToChild(i, f);
        }
    }

    public static /* synthetic */ ViewPager.OnPageChangeListener access$500(PagerSlidingTabStripAType pagerSlidingTabStripAType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("2e315862", new Object[]{pagerSlidingTabStripAType});
        }
        return pagerSlidingTabStripAType.mDelegatePageListener;
    }

    public static /* synthetic */ Object ipc$super(PagerSlidingTabStripAType pagerSlidingTabStripAType, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/view/PagerSlidingTabStripAType");
        }
    }

    private void scrollToChild(int i, float f) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08450b8", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.mTabCount != 0) {
            this.mCurrentPosition = i;
            View childAt = this.mTabsContainer.getChildAt(i);
            if (childAt != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null) {
                    i2 = layoutParams.leftMargin;
                } else {
                    i2 = 0;
                }
                int left = (int) ((childAt.getLeft() - i2) + (childAt.getWidth() * f));
                if (i > 0 || f > 0.0f) {
                    left -= this.mScrollOffset;
                }
                if (left != this.mLastScrollX) {
                    this.mLastScrollX = left;
                    scrollTo(left, 0);
                }
            }
        }
    }

    public void addTab(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7e872a", new Object[]{this, new Integer(i), view});
        } else {
            addTab(i, view, null);
        }
    }

    public void addTextTab(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5a19", new Object[]{this, new Integer(i), charSequence});
        } else if (charSequence != null) {
            String str = charSequence.toString().split(" {2}")[0];
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_multi_dynamic_tab_flexalocal, (ViewGroup) this.mTabsContainer, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.taolive_goods_strip_text);
            textView.setText(str);
            textView.setTextSize(0, this.textSize);
            textView.setTypeface(null, this.textStyle);
            textView.setGravity(17);
            relativeLayout.setGravity(17);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            textView.measure(makeMeasureSpec, makeMeasureSpec);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getMeasuredWidth(), -1);
            this.mTabLayoutParams = layoutParams;
            int i2 = this.textDefaultMargin;
            layoutParams.setMargins(i2, 0, i2, 0);
            addTab(i, relativeLayout, this.mTabLayoutParams);
        }
    }

    public void destroy() {
        PageListener pageListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.mTabsContainer;
        if (linearLayout != null) {
            for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                ViewProxy.setOnClickListener(this.mTabsContainer.getChildAt(childCount), null);
            }
            this.mTabsContainer.removeAllViews();
        }
        this.mOnClickListener = null;
        ViewPager viewPager = this.mViewPager;
        if (!(viewPager == null || (pageListener = this.mInnerPageListener) == null)) {
            viewPager.removeOnPageChangeListener(pageListener);
        }
        this.mViewPager = null;
        this.mInnerPageListener = null;
        this.mDelegatePageListener = null;
        this.mPaint = null;
    }

    public int getCategoryColor(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4cd8aaf", new Object[]{this, view})).intValue();
        }
        Object tag = view.getTag(R.id.tag_category_data);
        if (tag instanceof ItemCategory) {
            return nw0.j(((ItemCategory) tag).selectColor);
        }
        return -1;
    }

    public void notifyDataSetChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4b6b97", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabsContainer.removeAllViews();
        if (this.mViewPager.getAdapter() != null) {
            this.mTabCount = this.mViewPager.getAdapter().getCount();
            for (int i2 = 0; i2 < this.mTabCount; i2++) {
                if (this.mViewPager.getAdapter() instanceof b) {
                    addTab(i2, ((b) this.mViewPager.getAdapter()).b(i2));
                } else {
                    addTextTab(i2, this.mViewPager.getAdapter().getPageTitle(i2));
                }
            }
            selectTab(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (!this.mCacheDataEnable) {
            destroy();
        }
        super.onDetachedFromWindow();
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
        if (!isInEditMode() && this.mTabCount != 0 && this.mIndicatorWidth != 0 && this.mIndicatorHeight != 0 && wda.B()) {
            int height = getHeight();
            View childAt = this.mTabsContainer.getChildAt(this.mCurrentPosition);
            if (childAt != null) {
                float left = (childAt.getLeft() + (childAt.getRight() - this.mIndicatorPaddingRight)) / 2.0f;
                float f = this.mIndicatorWidth / 2.0f;
                float f2 = left - f;
                float f3 = f + left;
                int categoryColor = getCategoryColor(childAt);
                if (this.mCurrentPositionOffset > 0.0f && (i = this.mCurrentPosition) < this.mTabCount - 1) {
                    View childAt2 = this.mTabsContainer.getChildAt(i + 1);
                    float f4 = this.mCurrentPositionOffset;
                    float left2 = (((childAt2.getLeft() + (childAt2.getRight() - this.mIndicatorPaddingRight)) / 2.0f) - left) * f4;
                    f2 += left2;
                    f3 += left2;
                    if (f4 > 0.5f) {
                        categoryColor = getCategoryColor(childAt2);
                    }
                }
                if (categoryColor != -1) {
                    this.mPaint.setColor(categoryColor);
                } else {
                    this.mPaint.setColor(this.paintDefaultColor);
                }
                RectF rectF = this.rect;
                rectF.left = f2;
                int i2 = this.mIndicatorMarginBottom;
                rectF.top = (height - this.mIndicatorHeight) - i2;
                rectF.right = f3;
                rectF.bottom = height - i2;
                float f5 = this.defaultIndicatorRound;
                canvas.drawRoundRect(rectF, f5, f5, this.mPaint);
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
        this.mCurrentPosition = savedState.currentPosition;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.mCurrentPosition;
        return savedState;
    }

    public void selectTab(int i) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mTabCount; i2++) {
            View childAt = this.mTabsContainer.getChildAt(i2);
            RelativeLayout relativeLayout = (RelativeLayout) childAt;
            if (childAt != null && (textView = (TextView) relativeLayout.findViewById(R.id.taolive_goods_strip_text)) != null) {
                int categoryColor = getCategoryColor(relativeLayout);
                if (i2 == i) {
                    childAt.setSelected(true);
                    textView.setTextColor(this.selectColor);
                    textView.setTypeface(null, this.selectTextStyle);
                    if (categoryColor != -1) {
                        textView.setTextColor(categoryColor);
                    }
                } else {
                    childAt.setSelected(false);
                    textView.setTextColor(this.textColor);
                    textView.setTypeface(null, this.textStyle);
                }
            } else {
                return;
            }
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1037bbe", new Object[]{this, onPageChangeListener});
        } else {
            this.mDelegatePageListener = onPageChangeListener;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0412f4", new Object[]{this, viewPager});
            return;
        }
        this.mViewPager = viewPager;
        if (viewPager.getAdapter() != null) {
            if (this.mInnerPageListener == null) {
                this.mInnerPageListener = new PageListener(this, null);
            }
            viewPager.addOnPageChangeListener(this.mInnerPageListener);
            notifyDataSetChanged(0);
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public PagerSlidingTabStripAType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addTab(int i, View view, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5a99f", new Object[]{this, new Integer(i), view, layoutParams});
            return;
        }
        if (this.mOnClickListener == null) {
            this.mOnClickListener = new a();
        }
        view.setFocusable(true);
        ViewProxy.setOnClickListener(view, this.mOnClickListener);
        view.setTag(Integer.valueOf(i));
        if (layoutParams != null) {
            this.mTabsContainer.addView(view, i, this.mTabLayoutParams);
        } else {
            this.mTabsContainer.addView(view, i);
        }
    }

    public PagerSlidingTabStripAType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPosition = 0;
        this.mCurrentPositionOffset = 0.0f;
        this.mScrollOffset = nw0.d(getContext(), 52.0f);
        this.mLastScrollX = 0;
        this.h = 0;
        this.w = 0;
        this.mCacheDataEnable = false;
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        if (attributeSet != null) {
            for (int i2 = 0; i2 < attributeSet.getAttributeCount(); i2++) {
                if ("layout_height".equals(attributeSet.getAttributeName(i2))) {
                    String attributeValue = attributeSet.getAttributeValue(i2);
                    if (!zqq.a(attributeValue)) {
                        this.h = (int) Float.parseFloat(Pattern.compile("dip").matcher(attributeValue).replaceAll(""));
                    }
                }
                if ("layout_width".equals(attributeSet.getAttributeName(i2))) {
                    String attributeValue2 = attributeSet.getAttributeValue(i2);
                    if (!zqq.a(attributeValue2)) {
                        this.w = (int) Float.parseFloat(Pattern.compile("dip").matcher(attributeValue2).replaceAll(""));
                    }
                }
            }
        }
        if (this.h <= 0 || this.w <= 0) {
            this.mTabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        } else {
            this.mTabsContainer.setLayoutParams(new FrameLayout.LayoutParams(nw0.d(getContext(), this.w), nw0.d(getContext(), this.h)));
        }
        addView(this.mTabsContainer);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStripAType, i, 0);
        int color = obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_indicatorColor_AType, tkt.DEFAULT_SHADOW_COLOR);
        this.paintDefaultColor = color;
        this.mPaint.setColor(color);
        this.textColor = obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_psts_textColor_AType, Color.parseColor("#333333"));
        this.selectColor = obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_psts_selectTextColor_AType, Color.parseColor("#aaaaaa"));
        this.mIndicatorHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_indicatorHeight_AType, 12);
        this.mIndicatorWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_indicatorWidth_AType, 96);
        this.mIndicatorPaddingRight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_indicatorPaddingRight_AType, 0);
        this.mIndicatorMarginBottom = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PagerSlidingTabStripAType_indicatorMarginBottom_AType, 0);
        this.textSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_textSize_AType, 32);
        this.textStyle = obtainStyledAttributes.getInt(R.styleable.PagerSlidingTabStripAType_textStyle_AType, 0);
        this.selectTextStyle = obtainStyledAttributes.getInt(R.styleable.PagerSlidingTabStripAType_select_textStyle_AType, 0);
        this.textDefaultMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_textDefaultMargin_AType, 30);
        this.mDividerWidth = nw0.d(context, 0.5f);
        this.mDividerHeight = nw0.d(context, 15.0f);
        this.mDividerColor = getResources().getColor(R.color.taolive_light_gray);
        obtainStyledAttributes.recycle();
        this.mTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.defaultIndicatorRound = nw0.d(getContext(), 1.0f);
    }
}
