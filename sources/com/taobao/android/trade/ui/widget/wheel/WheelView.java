package com.taobao.android.trade.ui.widget.wheel;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.ui.widget.wheel.a;
import com.taobao.taobao.R;
import java.util.LinkedList;
import java.util.List;
import tb.fax;
import tb.hax;
import tb.ipf;
import tb.lwk;
import tb.nwk;
import tb.pwk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WheelView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEF_VISIBLE_ITEMS = 5;
    private static final int ITEM_OFFSET_PERCENT = 0;
    private static final int PADDING = 10;
    private GradientDrawable bottomShadow;
    private Drawable centerDrawable;
    private int firstItem;
    private boolean isScrollingPerformed;
    private LinearLayout itemsLayout;
    private com.taobao.android.trade.ui.widget.wheel.a scroller;
    private int scrollingOffset;
    private GradientDrawable topShadow;
    private hax viewAdapter;
    private int[] SHADOWS_COLORS = {-1, -1325400065, -1862270977};
    private int currentItem = 0;
    private int visibleItems = 5;
    private int itemHeight = 0;
    private int wheelForeground = R.drawable.trade_wheel_center;
    private boolean drawShadows = true;
    public boolean isCyclic = false;
    private fax recycle = new fax(this);
    private List<lwk> changingListeners = new LinkedList();
    private List<pwk> scrollingListeners = new LinkedList();
    private List<nwk> clickingListeners = new LinkedList();
    public a.c scrollingListener = new a();
    private DataSetObserver dataObserver = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.trade.ui.widget.wheel.a.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39174778", new Object[]{this});
                return;
            }
            if (WheelView.access$000(WheelView.this)) {
                WheelView.this.notifyScrollingListenersAboutEnd();
                WheelView.access$002(WheelView.this, false);
            }
            WheelView.access$202(WheelView.this, 0);
            WheelView.this.invalidate();
        }

        @Override // com.taobao.android.trade.ui.widget.wheel.a.c
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
                return;
            }
            WheelView.access$100(WheelView.this, i);
            int height = WheelView.this.getHeight();
            if (WheelView.access$200(WheelView.this) > height) {
                WheelView.access$202(WheelView.this, height);
                WheelView.access$300(WheelView.this).p();
                return;
            }
            int i2 = -height;
            if (WheelView.access$200(WheelView.this) < i2) {
                WheelView.access$202(WheelView.this, i2);
                WheelView.access$300(WheelView.this).p();
            }
        }

        @Override // com.taobao.android.trade.ui.widget.wheel.a.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd2afb8", new Object[]{this});
            } else if (Math.abs(WheelView.access$200(WheelView.this)) > 1) {
                WheelView.access$300(WheelView.this).l(WheelView.access$200(WheelView.this), 0);
            }
        }

        @Override // com.taobao.android.trade.ui.widget.wheel.a.c
        public void onStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb092529", new Object[]{this});
                return;
            }
            WheelView.access$002(WheelView.this, true);
            WheelView.this.notifyScrollingListenersAboutStart();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/wheel/WheelView$2");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                WheelView.this.invalidateWheel(false);
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                WheelView.this.invalidateWheel(true);
            }
        }
    }

    static {
        t2o.a(724566061);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initData(context);
    }

    public static /* synthetic */ boolean access$000(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163971ac", new Object[]{wheelView})).booleanValue();
        }
        return wheelView.isScrollingPerformed;
    }

    public static /* synthetic */ boolean access$002(WheelView wheelView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacfa46e", new Object[]{wheelView, new Boolean(z)})).booleanValue();
        }
        wheelView.isScrollingPerformed = z;
        return z;
    }

    public static /* synthetic */ void access$100(WheelView wheelView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f901ba", new Object[]{wheelView, new Integer(i)});
        } else {
            wheelView.doScroll(i);
        }
    }

    public static /* synthetic */ int access$200(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37a50b1d", new Object[]{wheelView})).intValue();
        }
        return wheelView.scrollingOffset;
    }

    public static /* synthetic */ int access$202(WheelView wheelView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6d6fb4a", new Object[]{wheelView, new Integer(i)})).intValue();
        }
        wheelView.scrollingOffset = i;
        return i;
    }

    public static /* synthetic */ com.taobao.android.trade.ui.widget.wheel.a access$300(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.ui.widget.wheel.a) ipChange.ipc$dispatch("a431cbc7", new Object[]{wheelView});
        }
        return wheelView.scroller;
    }

    private boolean addViewItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6558a355", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        View itemView = getItemView(i);
        if (itemView == null) {
            return false;
        }
        if (z) {
            this.itemsLayout.addView(itemView, 0);
        } else {
            this.itemsLayout.addView(itemView);
        }
        return true;
    }

    private void buildViewForMeasuring() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9da1fac", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            this.recycle.f(linearLayout, this.firstItem, new ipf());
        } else {
            createItemsLayout();
        }
        int i = this.visibleItems / 2;
        for (int i2 = this.currentItem + i; i2 >= this.currentItem - i; i2--) {
            if (addViewItem(i2, true)) {
                this.firstItem = i2;
            }
        }
    }

    private int calculateLayoutWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d5c410", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        initResourcesIfNecessary();
        this.itemsLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.itemsLayout.getMeasuredWidth();
        if (i2 != 1073741824) {
            int max = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= max) {
                i = max;
            }
        }
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i - 20, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    private void createItemsLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67b6df5", new Object[]{this});
        } else if (this.itemsLayout == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.itemsLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.itemsLayout.setGravity(1);
        }
    }

    private void doScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce5b724", new Object[]{this, new Integer(i)});
            return;
        }
        this.scrollingOffset += i;
        int itemHeight = getItemHeight();
        int i2 = this.scrollingOffset / itemHeight;
        int i3 = this.currentItem - i2;
        int b2 = this.viewAdapter.b();
        int i4 = this.scrollingOffset % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (this.isCyclic && b2 > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += b2;
            }
            i3 %= b2;
        } else if (i3 < 0) {
            i2 = this.currentItem;
            i3 = 0;
        } else if (i3 >= b2) {
            i2 = (this.currentItem - b2) + 1;
            i3 = b2 - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < b2 - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = this.scrollingOffset;
        if (i3 != this.currentItem) {
            setCurrentItem(i3, false);
        } else {
            invalidate();
        }
        int i6 = i5 - (i2 * itemHeight);
        this.scrollingOffset = i6;
        if (i6 > getHeight()) {
            this.scrollingOffset = (this.scrollingOffset % getHeight()) + getHeight();
        }
    }

    private void drawCenterRect(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6d43a1", new Object[]{this, canvas});
            return;
        }
        int height = getHeight() / 2;
        int itemHeight = (int) ((getItemHeight() / 2) * 1.2d);
        this.centerDrawable.setBounds(dp2px(10.0f), height - itemHeight, getWidth() - dp2px(10.0f), height + itemHeight);
        this.centerDrawable.draw(canvas);
    }

    private void drawItems(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c51362", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        canvas.translate(10.0f, (-(((this.currentItem - this.firstItem) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.scrollingOffset);
        this.itemsLayout.draw(canvas);
        canvas.restore();
    }

    private int getDesiredHeight(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a708a68", new Object[]{this, linearLayout})).intValue();
        }
        if (!(linearLayout == null || linearLayout.getChildAt(0) == null)) {
            this.itemHeight = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        return Math.max((this.itemHeight * this.visibleItems) - (0 / 50), getSuggestedMinimumHeight());
    }

    private int getItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f9d28a", new Object[]{this})).intValue();
        }
        int i = this.itemHeight;
        if (i != 0) {
            return i;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout == null || linearLayout.getChildAt(0) == null) {
            return getHeight() / this.visibleItems;
        }
        int height = this.itemsLayout.getChildAt(0).getHeight();
        this.itemHeight = height;
        return height;
    }

    private View getItemView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("27202b10", new Object[]{this, new Integer(i)});
        }
        hax haxVar = this.viewAdapter;
        if (haxVar == null || haxVar.b() == 0) {
            return null;
        }
        int b2 = this.viewAdapter.b();
        if (!isValidItemIndex(i)) {
            return this.viewAdapter.c(this.recycle.d(), this.itemsLayout);
        }
        while (i < 0) {
            i += b2;
        }
        return this.viewAdapter.a(i % b2, this.recycle.e(), this.itemsLayout);
    }

    private ipf getItemsRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ipf) ipChange.ipc$dispatch("dce4b36c", new Object[]{this});
        }
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.currentItem;
        int i2 = 1;
        while (getItemHeight() * i2 < getHeight()) {
            i--;
            i2 += 2;
        }
        int i3 = this.scrollingOffset;
        if (i3 != 0) {
            if (i3 > 0) {
                i--;
            }
            int itemHeight = i3 / getItemHeight();
            i -= itemHeight;
            i2 = (int) (i2 + 1 + Math.asin(itemHeight));
        }
        return new ipf(i, i2);
    }

    private void initData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379c287", new Object[]{this, context});
        } else {
            this.scroller = new com.taobao.android.trade.ui.widget.wheel.a(getContext(), this.scrollingListener);
        }
    }

    private void initResourcesIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19f1a84", new Object[]{this});
            return;
        }
        if (this.centerDrawable == null) {
            this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
        }
        if (this.topShadow == null) {
            this.topShadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.SHADOWS_COLORS);
        }
        if (this.bottomShadow == null) {
            this.bottomShadow = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.SHADOWS_COLORS);
        }
        setBackgroundColor(-1);
    }

    public static /* synthetic */ Object ipc$super(WheelView wheelView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/wheel/WheelView");
    }

    private boolean isValidItemIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbbf5ed3", new Object[]{this, new Integer(i)})).booleanValue();
        }
        hax haxVar = this.viewAdapter;
        if (haxVar != null && haxVar.b() > 0) {
            if (this.isCyclic) {
                return true;
            }
            if (i >= 0 && i < this.viewAdapter.b()) {
                return true;
            }
        }
        return false;
    }

    private void layout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0d52d1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.itemsLayout.layout(0, 0, i - 20, i2);
        }
    }

    private boolean rebuildItems() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd22fa70", new Object[]{this})).booleanValue();
        }
        ipf itemsRange = getItemsRange();
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            int f = this.recycle.f(linearLayout, this.firstItem, itemsRange);
            if (this.firstItem != f) {
                z = true;
            } else {
                z = false;
            }
            this.firstItem = f;
        } else {
            createItemsLayout();
            z = true;
        }
        if (!z) {
            if (this.firstItem == itemsRange.c() && this.itemsLayout.getChildCount() == itemsRange.b()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (this.firstItem <= itemsRange.c() || this.firstItem > itemsRange.d()) {
            this.firstItem = itemsRange.c();
        } else {
            for (int i = this.firstItem - 1; i >= itemsRange.c() && addViewItem(i, true); i--) {
                this.firstItem = i;
            }
        }
        int i2 = this.firstItem;
        for (int childCount = this.itemsLayout.getChildCount(); childCount < itemsRange.b(); childCount++) {
            if (!addViewItem(this.firstItem + childCount, false) && this.itemsLayout.getChildCount() == 0) {
                i2++;
            }
        }
        this.firstItem = i2;
        return z;
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else if (rebuildItems()) {
            calculateLayoutWidth(getWidth(), 1073741824);
            layout(getWidth(), getHeight());
        }
    }

    public void addChangingListener(lwk lwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0ee7ca", new Object[]{this, lwkVar});
        } else {
            this.changingListeners.add(lwkVar);
        }
    }

    public void addClickingListener(nwk nwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a170f4aa", new Object[]{this, nwkVar});
        } else {
            this.clickingListeners.add(nwkVar);
        }
    }

    public void addScrollingListener(pwk pwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49862e3", new Object[]{this, pwkVar});
        } else {
            this.scrollingListeners.add(pwkVar);
        }
    }

    public int dp2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean drawShadows() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8e0967a", new Object[]{this})).booleanValue() : this.drawShadows;
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue();
        }
        return this.currentItem;
    }

    public hax getViewAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hax) ipChange.ipc$dispatch("3889449b", new Object[]{this});
        }
        return this.viewAdapter;
    }

    public int getVisibleItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b4835e", new Object[]{this})).intValue();
        }
        return this.visibleItems;
    }

    public void invalidateWheel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c11e44d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.recycle.b();
            LinearLayout linearLayout = this.itemsLayout;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.scrollingOffset = 0;
        } else {
            LinearLayout linearLayout2 = this.itemsLayout;
            if (linearLayout2 != null) {
                this.recycle.f(linearLayout2, this.firstItem, new ipf());
            }
        }
        invalidate();
    }

    public boolean isCyclic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4415018e", new Object[]{this})).booleanValue();
        }
        return this.isCyclic;
    }

    public void notifyChangingListeners(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54759070", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        for (lwk lwkVar : this.changingListeners) {
            lwkVar.a(this, i, i2);
        }
    }

    public void notifyClickListenersAboutClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149dce1", new Object[]{this, new Integer(i)});
            return;
        }
        for (nwk nwkVar : this.clickingListeners) {
            nwkVar.a(this, i);
        }
    }

    public void notifyScrollingListenersAboutEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad1a28", new Object[]{this});
            return;
        }
        for (pwk pwkVar : this.scrollingListeners) {
            pwkVar.b(this);
        }
    }

    public void notifyScrollingListenersAboutStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5bc0af", new Object[]{this});
            return;
        }
        for (pwk pwkVar : this.scrollingListeners) {
            pwkVar.a(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        hax haxVar = this.viewAdapter;
        if (haxVar != null && haxVar.b() > 0) {
            updateView();
            drawItems(canvas);
            if (this.drawShadows) {
                drawShadows(canvas);
            }
            drawCenterRect(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layout(i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        buildViewForMeasuring();
        int calculateLayoutWidth = calculateLayoutWidth(size, mode);
        if (mode2 != 1073741824) {
            int desiredHeight = getDesiredHeight(this.itemsLayout);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(desiredHeight, size2);
            } else {
                size2 = desiredHeight;
            }
        }
        setMeasuredDimension(calculateLayoutWidth, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (!this.isScrollingPerformed) {
            int y = ((int) motionEvent.getY()) - (getHeight() / 2);
            if (y > 0) {
                i = y + (getItemHeight() / 2);
            } else {
                i = y - (getItemHeight() / 2);
            }
            int itemHeight = i / getItemHeight();
            if (itemHeight != 0 && isValidItemIndex(this.currentItem + itemHeight)) {
                notifyClickListenersAboutClick(this.currentItem + itemHeight);
            }
        }
        return this.scroller.k(motionEvent);
    }

    public void removeChangingListener(lwk lwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c070dbc7", new Object[]{this, lwkVar});
        } else {
            this.changingListeners.remove(lwkVar);
        }
    }

    public void removeClickingListener(nwk nwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d2e8a7", new Object[]{this, nwkVar});
        } else {
            this.clickingListeners.remove(nwkVar);
        }
    }

    public void removeScrollingListener(pwk pwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fa56e0", new Object[]{this, pwkVar});
        } else {
            this.scrollingListeners.remove(pwkVar);
        }
    }

    public void scroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9093b834", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.scroller.l((i * getItemHeight()) - this.scrollingOffset, i2);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        int min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        hax haxVar = this.viewAdapter;
        if (haxVar != null && haxVar.b() != 0) {
            int b2 = this.viewAdapter.b();
            if (i < 0 || i >= b2) {
                if (this.isCyclic) {
                    while (i < 0) {
                        i += b2;
                    }
                    i %= b2;
                } else {
                    return;
                }
            }
            int i2 = this.currentItem;
            if (i == i2) {
                return;
            }
            if (z) {
                int i3 = i - i2;
                if (this.isCyclic && (min = (b2 + Math.min(i, i2)) - Math.max(i, this.currentItem)) < Math.abs(i3)) {
                    i3 = i3 < 0 ? min : -min;
                }
                scroll(i3, 0);
                return;
            }
            this.scrollingOffset = 0;
            this.currentItem = i;
            notifyChangingListeners(i2, i);
            invalidate();
        }
    }

    public void setCyclic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d30052", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isCyclic = z;
        invalidateWheel(false);
    }

    public void setDrawShadows(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf07e7a0", new Object[]{this, new Boolean(z)});
        } else {
            this.drawShadows = z;
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.scroller.m(interpolator);
        }
    }

    public void setShadowColor(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147cc53b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.SHADOWS_COLORS = new int[]{i, i2, i3};
        }
    }

    public void setViewAdapter(hax haxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa28721", new Object[]{this, haxVar});
            return;
        }
        hax haxVar2 = this.viewAdapter;
        if (haxVar2 != null) {
            haxVar2.unregisterDataSetObserver(this.dataObserver);
        }
        this.viewAdapter = haxVar;
        if (haxVar != null) {
            haxVar.registerDataSetObserver(this.dataObserver);
        }
        invalidateWheel(true);
    }

    public void setVisibleItems(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f72696c", new Object[]{this, new Integer(i)});
        } else {
            this.visibleItems = i;
        }
    }

    public void setWheelBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaf9d95", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(-1);
        }
    }

    public void setWheelForeground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c1cea0", new Object[]{this, new Integer(i)});
            return;
        }
        this.wheelForeground = i;
        this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
    }

    public void stopScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95325f1a", new Object[]{this});
        } else {
            this.scroller.p();
        }
    }

    private void drawShadows(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8533af", new Object[]{this, canvas});
            return;
        }
        int itemHeight = getItemHeight();
        this.topShadow.setBounds(0, 0, getWidth(), itemHeight);
        this.topShadow.draw(canvas);
        this.bottomShadow.setBounds(0, getHeight() - itemHeight, getWidth(), getHeight());
        this.bottomShadow.draw(canvas);
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItem(i, false);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initData(context);
    }

    public WheelView(Context context) {
        super(context);
        initData(context);
    }
}
