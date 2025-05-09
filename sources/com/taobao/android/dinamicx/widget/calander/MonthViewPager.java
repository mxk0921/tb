package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import tb.ef5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MonthViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isUpdateMonthView;
    private boolean isUsingScrollToCalendar;
    private int mCurrentViewHeight;
    private CalendarViewDelegate mDelegate;
    private int mMonthCount;
    private int mNextViewHeight;
    private int mPreViewHeight;
    public WeekBar mWeekBar;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class MonthViewPagerAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597489);
        }

        public MonthViewPagerAdapter() {
        }

        public static /* synthetic */ Object ipc$super(MonthViewPagerAdapter monthViewPagerAdapter, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/MonthViewPager$MonthViewPagerAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            BaseView baseView = (BaseView) obj;
            baseView.onDestroy();
            viewGroup.removeView(baseView);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return MonthViewPager.access$700(MonthViewPager.this);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (MonthViewPager.access$800(MonthViewPager.this)) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            int x = (((MonthViewPager.access$100(MonthViewPager.this).x() + i) - 1) / 12) + MonthViewPager.access$100(MonthViewPager.this).v();
            int x2 = (((MonthViewPager.access$100(MonthViewPager.this).x() + i) - 1) % 12) + 1;
            CustomMonthView customMonthView = new CustomMonthView(MonthViewPager.this.getContext());
            MonthViewPager monthViewPager = MonthViewPager.this;
            customMonthView.mMonthViewPager = monthViewPager;
            customMonthView.setup(MonthViewPager.access$100(monthViewPager));
            customMonthView.setTag(Integer.valueOf(i));
            customMonthView.initMonthWithDate(x, x2);
            customMonthView.setSelectedCalendar(MonthViewPager.access$100(MonthViewPager.this).F);
            viewGroup.addView(customMonthView);
            if (i == MonthViewPager.this.getCurrentItem() && MonthViewPager.access$100(MonthViewPager.this).D != null) {
                ((ef5.d) MonthViewPager.access$100(MonthViewPager.this).D).a(MonthViewPager.access$100(MonthViewPager.this).F, a.f(x, x2), MonthViewPager.access$100(MonthViewPager.this).z(x, x2));
            }
            return customMonthView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            return view.equals(obj);
        }
    }

    static {
        t2o.a(444597487);
    }

    public MonthViewPager(Context context) {
        this(context, null);
    }

    public static /* synthetic */ CalendarViewDelegate access$100(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarViewDelegate) ipChange.ipc$dispatch("5bca0934", new Object[]{monthViewPager});
        }
        return monthViewPager.mDelegate;
    }

    public static /* synthetic */ int access$200(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("413f9b5c", new Object[]{monthViewPager})).intValue();
        }
        return monthViewPager.mPreViewHeight;
    }

    public static /* synthetic */ int access$300(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d01171d", new Object[]{monthViewPager})).intValue();
        }
        return monthViewPager.mCurrentViewHeight;
    }

    public static /* synthetic */ int access$400(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8c292de", new Object[]{monthViewPager})).intValue();
        }
        return monthViewPager.mNextViewHeight;
    }

    public static /* synthetic */ boolean access$500(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4840eb0", new Object[]{monthViewPager})).booleanValue();
        }
        return monthViewPager.isUsingScrollToCalendar;
    }

    public static /* synthetic */ boolean access$502(MonthViewPager monthViewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905d89ea", new Object[]{monthViewPager, new Boolean(z)})).booleanValue();
        }
        monthViewPager.isUsingScrollToCalendar = z;
        return z;
    }

    public static /* synthetic */ void access$600(MonthViewPager monthViewPager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b038d", new Object[]{monthViewPager, new Integer(i), new Integer(i2)});
        } else {
            monthViewPager.updateMonthViewHeight(i, i2);
        }
    }

    public static /* synthetic */ int access$700(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c070621", new Object[]{monthViewPager})).intValue();
        }
        return monthViewPager.mMonthCount;
    }

    public static /* synthetic */ boolean access$800(MonthViewPager monthViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c881f3", new Object[]{monthViewPager})).booleanValue();
        }
        return monthViewPager.isUpdateMonthView;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setAdapter(new MonthViewPagerAdapter());
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.dinamicx.widget.calander.MonthViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                float access$300;
                int access$400;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                } else if (MonthViewPager.access$100(MonthViewPager.this).y() != 0) {
                    if (i < MonthViewPager.this.getCurrentItem()) {
                        access$300 = MonthViewPager.access$200(MonthViewPager.this) * (1.0f - f);
                        access$400 = MonthViewPager.access$300(MonthViewPager.this);
                    } else {
                        access$300 = MonthViewPager.access$300(MonthViewPager.this) * (1.0f - f);
                        access$400 = MonthViewPager.access$400(MonthViewPager.this);
                    }
                    int i3 = (int) (access$300 + (access$400 * f));
                    ViewGroup.LayoutParams layoutParams = MonthViewPager.this.getLayoutParams();
                    layoutParams.height = i3;
                    MonthViewPager.this.setLayoutParams(layoutParams);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                Calendar e = a.e(i, MonthViewPager.access$100(MonthViewPager.this));
                if (MonthViewPager.this.getVisibility() == 0) {
                    if (!(MonthViewPager.access$100(MonthViewPager.this).G == null || e.getYear() == MonthViewPager.access$100(MonthViewPager.this).G.getYear())) {
                        MonthViewPager.access$100(MonthViewPager.this).getClass();
                    }
                    MonthViewPager.access$100(MonthViewPager.this).G = e;
                }
                if (MonthViewPager.access$100(MonthViewPager.this).C != null) {
                    MonthViewPager.access$100(MonthViewPager.this).C.a(e.getYear(), e.getMonth());
                }
                if (MonthViewPager.access$100(MonthViewPager.this).A() == 0) {
                    if (!e.isCurrentMonth()) {
                        MonthViewPager.access$100(MonthViewPager.this).F = e;
                    } else {
                        MonthViewPager.access$100(MonthViewPager.this).F = a.m(e, MonthViewPager.access$100(MonthViewPager.this));
                    }
                    MonthViewPager.access$100(MonthViewPager.this).G = MonthViewPager.access$100(MonthViewPager.this).F;
                } else if (e.isSameMonth(MonthViewPager.access$100(MonthViewPager.this).F)) {
                    MonthViewPager.access$100(MonthViewPager.this).G = MonthViewPager.access$100(MonthViewPager.this).F;
                }
                if (!MonthViewPager.access$500(MonthViewPager.this) && MonthViewPager.access$100(MonthViewPager.this).A() == 0) {
                    MonthViewPager monthViewPager = MonthViewPager.this;
                    monthViewPager.mWeekBar.onDateSelected(MonthViewPager.access$100(monthViewPager).F, MonthViewPager.access$100(MonthViewPager.this).G(), false);
                    if (!(MonthViewPager.access$100(MonthViewPager.this).A == null || MonthViewPager.access$100(MonthViewPager.this).F == null)) {
                        MonthViewPager.access$100(MonthViewPager.this).A.b(MonthViewPager.access$100(MonthViewPager.this).F, false);
                    }
                }
                BaseMonthView baseMonthView = (BaseMonthView) MonthViewPager.this.findViewWithTag(Integer.valueOf(i));
                if (baseMonthView != null) {
                    int selectedIndex = baseMonthView.getSelectedIndex(MonthViewPager.access$100(MonthViewPager.this).G);
                    if (MonthViewPager.access$100(MonthViewPager.this).A() == 0) {
                        baseMonthView.mCurrentItem = selectedIndex;
                    }
                    baseMonthView.invalidate();
                    if (MonthViewPager.access$100(MonthViewPager.this).D != null) {
                        ((ef5.d) MonthViewPager.access$100(MonthViewPager.this).D).a(MonthViewPager.access$100(MonthViewPager.this).F, a.f(e.getYear(), e.getMonth()), MonthViewPager.access$100(MonthViewPager.this).z(e.getYear(), e.getMonth()));
                    }
                }
                MonthViewPager.access$600(MonthViewPager.this, e.getYear(), e.getMonth());
                MonthViewPager.access$502(MonthViewPager.this, false);
            }
        });
    }

    public static /* synthetic */ Object ipc$super(MonthViewPager monthViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1695733278) {
            super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/calander/MonthViewPager");
        }
    }

    private void notifyAdapterDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc715829", new Object[]{this});
        } else if (getAdapter() != null) {
            getAdapter().notifyDataSetChanged();
        }
    }

    private void updateMonthViewHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d357baa", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mDelegate.y() == 0) {
            this.mCurrentViewHeight = this.mDelegate.d() * 6;
            getLayoutParams().height = this.mCurrentViewHeight;
        } else {
            this.mCurrentViewHeight = a.k(i, i2, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            if (i2 == 1) {
                this.mPreViewHeight = a.k(i - 1, 12, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
                this.mNextViewHeight = a.k(i, 2, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
                return;
            }
            this.mPreViewHeight = a.k(i, i2 - 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            if (i2 == 12) {
                this.mNextViewHeight = a.k(i + 1, 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            } else {
                this.mNextViewHeight = a.k(i, i2 + 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            }
        }
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.mMonthCount = (((this.mDelegate.r() - this.mDelegate.v()) * 12) - this.mDelegate.x()) + 1 + this.mDelegate.t();
        notifyAdapterDataSetChanged();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mDelegate.M() || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mDelegate.M() || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed27201e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        this.isUsingScrollToCalendar = true;
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.mDelegate.g()));
        if (z3) {
            CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            calendarViewDelegate.G = calendar;
            calendarViewDelegate.F = calendar;
        }
        int year = (((calendar.getYear() - this.mDelegate.v()) * 12) + calendar.getMonth()) - this.mDelegate.x();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null && z3) {
            baseMonthView.setSelectedCalendar(this.mDelegate.G);
            baseMonthView.invalidate();
        }
        CalendarView.b bVar = this.mDelegate.A;
        if (bVar != null && z2 && z3) {
            bVar.b(calendar, false);
        }
        CalendarView.c cVar = this.mDelegate.B;
        if (cVar != null && z3) {
            ((CalendarView.a) cVar).a(calendar, false);
        }
        CalendarView.d dVar = this.mDelegate.C;
        if (dVar != null) {
            dVar.a(calendar.getYear(), calendar.getMonth());
        }
        updateSelected();
    }

    public void scrollToCurrent(boolean z) {
        CalendarViewDelegate calendarViewDelegate;
        Calendar calendar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11694f9c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isUsingScrollToCalendar = true;
        int year = (((this.mDelegate.g().getYear() - this.mDelegate.v()) * 12) + this.mDelegate.g().getMonth()) - this.mDelegate.x();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
        if (baseMonthView != null && this.mDelegate.g().equals(this.mDelegate.F)) {
            baseMonthView.setSelectedCalendar(this.mDelegate.g());
            baseMonthView.invalidate();
        }
        if (this.mDelegate.A != null && getVisibility() == 0 && (calendar = (calendarViewDelegate = this.mDelegate).F) != null) {
            calendarViewDelegate.A.b(calendar, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItem(i, true);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.a0(z);
        }
    }

    public void setup(CalendarViewDelegate calendarViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2667438a", new Object[]{this, calendarViewDelegate});
            return;
        }
        this.mDelegate = calendarViewDelegate;
        updateMonthViewHeight(calendarViewDelegate.g().getYear(), this.mDelegate.g().getMonth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        init();
    }

    public final void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateItemHeight();
            baseMonthView.requestLayout();
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        Calendar calendar = calendarViewDelegate.G;
        if (calendar == null) {
            calendar = calendarViewDelegate.g();
        }
        if (!a.q(calendar, this.mDelegate)) {
            calendar = this.mDelegate.u();
        }
        int year = calendar.getYear();
        int month = calendar.getMonth();
        this.mCurrentViewHeight = a.k(year, month, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
        if (month == 1) {
            this.mPreViewHeight = a.k(year - 1, 12, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            this.mNextViewHeight = a.k(year, 2, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
        } else {
            this.mPreViewHeight = a.k(year, month - 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            if (month == 12) {
                this.mNextViewHeight = a.k(year + 1, 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            } else {
                this.mNextViewHeight = a.k(year, month + 1, this.mDelegate.d(), this.mDelegate.G(), this.mDelegate.y());
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
    }

    public final void updateRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb907b", new Object[]{this});
            return;
        }
        this.isUpdateMonthView = true;
        notifyDataSetChanged();
        this.isUpdateMonthView = false;
        if (getVisibility() == 0) {
            this.isUsingScrollToCalendar = false;
            CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            Calendar calendar = calendarViewDelegate.E;
            if (calendar == null) {
                calendar = calendarViewDelegate.F;
            }
            if (calendar == null) {
                calendar = calendarViewDelegate.g();
            }
            CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
            if (calendar != calendarViewDelegate2.E && !a.q(calendar, calendarViewDelegate2)) {
                calendar = this.mDelegate.u();
            }
            int year = (((calendar.getYear() - this.mDelegate.v()) * 12) + calendar.getMonth()) - this.mDelegate.x();
            if (getCurrentItem() != year) {
                setCurrentItem(year, false);
            }
            BaseMonthView baseMonthView = (BaseMonthView) findViewWithTag(Integer.valueOf(year));
            if (baseMonthView != null) {
                baseMonthView.setSelectedCalendar(this.mDelegate.G);
                baseMonthView.invalidate();
            }
            CalendarViewDelegate calendarViewDelegate3 = this.mDelegate;
            Calendar calendar2 = calendarViewDelegate3.F;
            if (calendar2 != null) {
                CalendarView.c cVar = calendarViewDelegate3.B;
                if (cVar != null) {
                    ((CalendarView.a) cVar).a(calendar2, false);
                }
                CalendarViewDelegate calendarViewDelegate4 = this.mDelegate;
                CalendarView.b bVar = calendarViewDelegate4.A;
                if (bVar != null) {
                    bVar.b(calendarViewDelegate4.F, false);
                }
            }
            updateSelected();
        }
    }

    public void updateScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e5cd55", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((BaseMonthView) getChildAt(i)).update();
        }
    }

    public void updateSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d72590b", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.setSelectedCalendar(this.mDelegate.F);
            baseMonthView.invalidate();
        }
    }

    public final void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            BaseMonthView baseMonthView = (BaseMonthView) getChildAt(i);
            baseMonthView.updateStyle();
            baseMonthView.invalidate();
        }
    }

    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }
}
