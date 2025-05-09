package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CalendarView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CalendarViewDelegate mDelegate;
    private MonthViewPager mMonthPager;
    private WeekBar mWeekBar;
    private View mWeekLine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(Calendar calendar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c31df93", new Object[]{this, calendar, new Boolean(z)});
            } else if (calendar.getYear() != CalendarView.access$000(CalendarView.this).g().getYear() || calendar.getMonth() != CalendarView.access$000(CalendarView.this).g().getMonth() || CalendarView.access$100(CalendarView.this).getCurrentItem() == CalendarView.access$000(CalendarView.this).z) {
                CalendarView.access$000(CalendarView.this).G = calendar;
                if (CalendarView.access$000(CalendarView.this).A() == 0 || z) {
                    CalendarView.access$000(CalendarView.this).F = calendar;
                }
                CalendarView.access$100(CalendarView.this).updateSelected();
                if (CalendarView.access$200(CalendarView.this) == null) {
                    return;
                }
                if (CalendarView.access$000(CalendarView.this).A() == 0 || z) {
                    CalendarView.access$200(CalendarView.this).onDateSelected(calendar, CalendarView.access$000(CalendarView.this).G(), z);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(Calendar calendar);

        void b(Calendar calendar, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    static {
        t2o.a(444597472);
    }

    public CalendarView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ CalendarViewDelegate access$000(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarViewDelegate) ipChange.ipc$dispatch("5bb2309a", new Object[]{calendarView});
        }
        return calendarView.mDelegate;
    }

    public static /* synthetic */ MonthViewPager access$100(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonthViewPager) ipChange.ipc$dispatch("d7128823", new Object[]{calendarView});
        }
        return calendarView.mMonthPager;
    }

    public static /* synthetic */ WeekBar access$200(CalendarView calendarView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeekBar) ipChange.ipc$dispatch("82c44f37", new Object[]{calendarView});
        }
        return calendarView.mWeekBar;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.datepicker_layout_calendar_view, (ViewGroup) this, true);
        WeekBar weekBar = new WeekBar(context);
        this.mWeekBar = weekBar;
        ((FrameLayout) findViewById(R.id.frameContent)).addView(weekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.G());
        View findViewById = findViewById(R.id.line);
        this.mWeekLine = findViewById;
        findViewById.setBackgroundColor(this.mDelegate.E());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mWeekLine.getLayoutParams();
        layoutParams.setMargins(this.mDelegate.F(), this.mDelegate.D(), this.mDelegate.F(), 0);
        this.mWeekLine.setLayoutParams(layoutParams);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(R.id.vp_month);
        this.mMonthPager = monthViewPager;
        WeekBar weekBar2 = this.mWeekBar;
        monthViewPager.mWeekBar = weekBar2;
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        calendarViewDelegate.B = new a();
        weekBar2.onDateSelected(calendarViewDelegate.F, calendarViewDelegate.G(), false);
        this.mMonthPager.setup(this.mDelegate);
        this.mMonthPager.setCurrentItem(this.mDelegate.z);
    }

    public static /* synthetic */ Object ipc$super(CalendarView calendarView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/CalendarView");
        }
    }

    public final boolean isDisable(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ac6f5d9", new Object[]{this, calendar})).booleanValue();
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || !com.taobao.android.dinamicx.widget.calander.a.o(calendar, calendarViewDelegate.n())) {
            return false;
        }
        return true;
    }

    public final boolean isInRange(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5159e209", new Object[]{this, calendar})).booleanValue();
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || !com.taobao.android.dinamicx.widget.calander.a.q(calendar, calendarViewDelegate)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            super.onMeasure(i, i2);
            return;
        }
        setCalendarItemHeight(((size - calendarViewDelegate.D()) - this.mDelegate.k()) / 6);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        if (this.mDelegate == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(pg1.ATOM_super, super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.mDelegate.F);
        bundle.putSerializable("index_calendar", this.mDelegate.G);
        return bundle;
    }

    public void scrollToCalendar(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf74ac76", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            scrollToCalendar(i, i2, i3, false, true);
        }
    }

    public void scrollToCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742caa38", new Object[]{this});
        } else {
            scrollToCurrent(false);
        }
    }

    public void scrollToNext(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdcaed2", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
    }

    public void scrollToPre(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490068b2", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() - 1, z);
    }

    public void setAnchorCalendar(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db58facc", new Object[]{this, calendar});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.E = calendar;
        }
    }

    public void setAutoChangeMonth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c570fce", new Object[]{this, new Boolean(z)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.O(z);
        }
    }

    public void setBackground(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4d1657", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mWeekBar.setBackgroundColor(i);
        this.mWeekLine.setBackgroundColor(i2);
    }

    public final void setCalendarItemHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6187a2", new Object[]{this, new Integer(i)});
        } else if (this.mDelegate.d() != i) {
            this.mDelegate.R(i);
            this.mMonthPager.updateItemHeight();
        }
    }

    public void setCurrentDayTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100a7be9", new Object[]{this, new Integer(i)});
        } else {
            this.mDelegate.S(i);
        }
    }

    public void setDateTextFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb11bfd", new Object[]{this, str});
        } else {
            this.mDelegate.T(str);
        }
    }

    public void setDateTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d078eeb", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        CalendarDateTextGravity calendarDateTextGravity = CalendarDateTextGravity.Top;
        if (i != calendarDateTextGravity.getCode()) {
            calendarDateTextGravity = CalendarDateTextGravity.Center;
        }
        calendarViewDelegate.P(calendarDateTextGravity);
    }

    public void setDateTopGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a9f16b", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.U(i);
            MonthViewPager monthViewPager = this.mMonthPager;
            if (monthViewPager != null) {
                ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = com.taobao.android.dinamicx.widget.calander.a.c(getContext(), 41.0f) + i;
                    this.mMonthPager.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public void setDayTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918f3b94", new Object[]{this, new Integer(i)});
        } else {
            this.mDelegate.V(i);
        }
    }

    public void setDisableRanges(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391014", new Object[]{this, list});
        } else if (com.taobao.android.dinamicx.widget.calander.a.r(list)) {
            this.mDelegate.W(list);
            Calendar calendar = this.mDelegate.F;
            if (calendar != null && !isInRange(calendar)) {
                CalendarViewDelegate calendarViewDelegate = this.mDelegate;
                calendarViewDelegate.F = calendarViewDelegate.u();
                CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
                calendarViewDelegate2.G = calendarViewDelegate2.F;
            }
            this.mMonthPager.updateRange();
        }
    }

    public void setHighLightCurrentDayUnSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c062ff44", new Object[]{this, new Boolean(z)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.X(z);
        }
    }

    public void setItemBottomPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69af72b", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.Y(i);
        }
    }

    public void setItemTopPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84bd48b", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            calendarViewDelegate.Z(i);
        }
    }

    public void setOnCalendarSelectListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e2f41e", new Object[]{this, bVar});
        } else {
            this.mDelegate.A = bVar;
        }
    }

    public void setOnMonthChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af26cc74", new Object[]{this, dVar});
        } else {
            this.mDelegate.C = dVar;
        }
    }

    public void setOnMonthUIRangeChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4096560", new Object[]{this, eVar});
        } else {
            this.mDelegate.D = eVar;
        }
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7118a2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            setRange(i, i2, i3, i4, i5, i6, null);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        MonthViewPager monthViewPager = this.mMonthPager;
        if (monthViewPager != null) {
            monthViewPager.setScrollable(z);
        }
    }

    public void setSelectedTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db6963", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null && calendarViewDelegate.B() != i) {
            this.mDelegate.d0(i);
            MonthViewPager monthViewPager = this.mMonthPager;
            if (monthViewPager != null) {
                monthViewPager.updateStyle();
            }
        }
    }

    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f8eca8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null && this.mMonthPager != null) {
            calendarViewDelegate.e0(i, i2, i3, i4, i5);
            this.mMonthPager.updateStyle();
        }
    }

    public void setWeekBarTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e37903", new Object[]{this, new Integer(i)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null && calendarViewDelegate.H() != i) {
            this.mDelegate.f0(i);
            WeekBar weekBar = this.mWeekBar;
            if (weekBar != null) {
                weekBar.setTextColor(this.mDelegate.H());
            }
        }
    }

    public final void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        this.mWeekBar.onWeekStartChange(this.mDelegate.G());
        this.mMonthPager.updateScheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateMonthArrowStatus() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.calander.CalendarView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "54f5182b"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r2 = r5.mMonthPager
            androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x005b
            int r3 = r2.getCount()
            r4 = 2
            if (r3 != r4) goto L_0x0038
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r2 = r5.mMonthPager
            int r2 = r2.getCurrentItem()
            if (r2 == 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r3 = r5.mMonthPager
            int r3 = r3.getCurrentItem()
            if (r3 != 0) goto L_0x0035
            r0 = 1
        L_0x0035:
            r1 = r0
            r0 = r2
            goto L_0x005c
        L_0x0038:
            int r3 = r2.getCount()
            r4 = 3
            if (r3 < r4) goto L_0x005b
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r3 = r5.mMonthPager
            int r3 = r3.getCurrentItem()
            if (r3 == 0) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            com.taobao.android.dinamicx.widget.calander.MonthViewPager r4 = r5.mMonthPager
            int r4 = r4.getCurrentItem()
            int r2 = r2.getCount()
            int r2 = r2 - r1
            if (r4 == r2) goto L_0x0058
            r0 = 1
        L_0x0058:
            r1 = r0
            r0 = r3
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            int r2 = com.taobao.taobao.R.id.iv_left
            java.lang.Object r2 = r5.getTag(r2)
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x006b
            android.view.View r2 = (android.view.View) r2
            r2.setEnabled(r0)
        L_0x006b:
            int r0 = com.taobao.taobao.R.id.iv_right
            java.lang.Object r0 = r5.getTag(r0)
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x007a
            android.view.View r0 = (android.view.View) r0
            r0.setEnabled(r1)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.calander.CalendarView.updateMonthArrowStatus():void");
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDelegate = new CalendarViewDelegate(context, attributeSet);
        init(context);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Calendar calendar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable(pg1.ATOM_super);
        this.mDelegate.F = (Calendar) bundle.getSerializable("selected_calendar");
        this.mDelegate.G = (Calendar) bundle.getSerializable("index_calendar");
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        b bVar = calendarViewDelegate.A;
        if (!(bVar == null || (calendar = calendarViewDelegate.F) == null)) {
            bVar.b(calendar, false);
        }
        Calendar calendar2 = this.mDelegate.G;
        if (calendar2 != null) {
            scrollToCalendar(calendar2.getYear(), this.mDelegate.G.getMonth(), this.mDelegate.G.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b511c176", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
        } else {
            scrollToCalendar(i, i2, i3, z, z2, true);
        }
    }

    public void scrollToCurrent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11694f9c", new Object[]{this, new Boolean(z)});
        } else {
            scrollToCurrent(z, false);
        }
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6, List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae2193", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), list});
        } else {
            setRange(i, i2, i3, i4, i5, i6, list, null);
        }
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed27201e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (calendar.isAvailable() && isInRange(calendar)) {
            this.mDelegate.getClass();
            this.mMonthPager.scrollToCalendar(i, i2, i3, z, z2, z3);
        }
    }

    public void scrollToCurrent(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc156b8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (isInRange(this.mDelegate.g())) {
            this.mDelegate.a();
            this.mDelegate.getClass();
            if (!z2) {
                CalendarViewDelegate calendarViewDelegate = this.mDelegate;
                calendarViewDelegate.F = calendarViewDelegate.a();
                CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
                Calendar calendar = calendarViewDelegate2.F;
                calendarViewDelegate2.G = calendar;
                this.mWeekBar.onDateSelected(calendar, calendarViewDelegate2.G(), false);
            } else {
                CalendarViewDelegate calendarViewDelegate3 = this.mDelegate;
                calendarViewDelegate3.F = null;
                calendarViewDelegate3.G = null;
            }
            if (this.mMonthPager.getVisibility() == 0) {
                this.mMonthPager.scrollToCurrent(z);
            }
        }
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6, List<Pair<Calendar, Calendar>> list, HashMap<String, Calendar> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404ae940", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), list, hashMap});
        } else if (com.taobao.android.dinamicx.widget.calander.a.a(i, i2, i3, i4, i5, i6) <= 0) {
            if (list == null || com.taobao.android.dinamicx.widget.calander.a.r(list)) {
                this.mDelegate.c0(i, i2, i3, i4, i5, i6);
                this.mDelegate.W(list);
                this.mDelegate.Q(hashMap);
                Calendar calendar = this.mDelegate.F;
                if (calendar != null && !isInRange(calendar)) {
                    CalendarViewDelegate calendarViewDelegate = this.mDelegate;
                    calendarViewDelegate.F = calendarViewDelegate.u();
                    CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
                    calendarViewDelegate2.G = calendarViewDelegate2.F;
                }
                this.mMonthPager.updateRange();
            }
        }
    }
}
