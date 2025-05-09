package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import com.taobao.taobao.R;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CalendarViewDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_DAY_OF_MONTH = 0;
    public static final int LAST_MONTH_VIEW_SELECT_DAY = 1;
    public static final int LAST_MONTH_VIEW_SELECT_DAY_IGNORE_CURRENT = 2;
    public static final int MIN_YEAR = 1900;
    public static final int MODE_ALL_MONTH = 0;
    public static final int MODE_FIT_MONTH = 2;
    public static final int MODE_ONLY_CURRENT_MONTH = 1;
    public static final int SELECT_MODE_DEFAULT = 0;
    public static final int SELECT_MODE_SINGLE = 1;
    public static final int WEEK_START_WITH_MON = 2;
    public static final int WEEK_START_WITH_SAT = 7;
    public static final int WEEK_START_WITH_SUN = 1;
    public CalendarView.b A;
    public CalendarView.c B;
    public CalendarView.d C;
    public CalendarView.e D;
    public Calendar E;
    public Calendar F;
    public Calendar G;
    public List<Pair<Calendar, Calendar>> H;
    public HashMap<String, Calendar> I;
    public CalendarDateTextGravity K;
    public String L;
    public int M;
    public int N;
    public int O;

    /* renamed from: a  reason: collision with root package name */
    public final int f7425a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final int w;
    public Calendar x;
    public boolean y;
    public int z;
    public final ConcurrentHashMap<String, Pair<String, String>> J = new ConcurrentHashMap<>();
    public boolean P = true;
    public boolean Q = false;

    static {
        t2o.a(444597482);
    }

    public CalendarViewDelegate(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarView);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding, 0.0f);
        this.h = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_left, 0.0f);
        this.i = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_right, 0.0f);
        if (dimension != 0) {
            this.h = dimension;
            this.i = dimension;
        }
        this.m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_week_text_size, a.c(context, 12.0f));
        this.w = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_week_bar_height, a.c(context, 40.0f));
        this.l = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_week_line_margin, a.c(context, 0.0f));
        this.y = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_month_view_scrollable, true);
        this.f7425a = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_auto_select_day, 0);
        this.c = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_show_mode, 0);
        this.b = obtainStyledAttributes.getInt(R.styleable.CalendarView_week_start_with, 2);
        this.d = obtainStyledAttributes.getInt(R.styleable.CalendarView_select_mode, 0);
        this.k = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_background, -1);
        this.j = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_line_background, 0);
        this.e = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_text_color, -13421773);
        obtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_text_color, -65536);
        this.g = obtainStyledAttributes.getColor(R.styleable.CalendarView_selected_text_color, -1);
        this.f = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_text_color, -15658735);
        this.n = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year, 1971);
        this.o = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year, 2055);
        this.p = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_month, 1);
        this.q = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_month, 12);
        this.r = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_day, 1);
        this.s = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_day, -1);
        this.N = pb6.c(context, 3.0f);
        this.O = pb6.c(context, 5.0f);
        this.t = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_day_text_size, a.c(context, 16.0f));
        this.v = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_height, a.c(context, 56.0f));
        if (this.n <= 1900) {
            this.n = 1900;
        }
        if (this.o >= 2099) {
            this.o = 2099;
        }
        obtainStyledAttributes.recycle();
        J();
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("257deaf", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34aa0b1f", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecbd65b2", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("317f6a4a", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2de551c6", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("add58146", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c03692", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61fd4b66", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efb3b5d2", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc4602", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c74dcc", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a0182cd", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public void N(int i, int i2, Calendar calendar, Calendar calendar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd549a", new Object[]{this, new Integer(i), new Integer(i2), calendar, calendar2});
            return;
        }
        Pair<String, String> pair = new Pair<>(calendar.getDateString(), calendar2.getDateString());
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap = this.J;
        concurrentHashMap.put(i + "-" + i2, pair);
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c570fce", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public void P(CalendarDateTextGravity calendarDateTextGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25acf93", new Object[]{this, calendarDateTextGravity});
        } else {
            this.K = calendarDateTextGravity;
        }
    }

    public void Q(HashMap<String, Calendar> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6616e7", new Object[]{this, hashMap});
        } else {
            this.I = hashMap;
        }
    }

    public void R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6187a2", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100a7be9", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb11bfd", new Object[]{this, str});
        } else {
            this.L = str;
        }
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a9f16b", new Object[]{this, new Integer(i)});
        } else {
            this.M = i;
        }
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918f3b94", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public void W(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391014", new Object[]{this, list});
        } else {
            this.H = list;
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c062ff44", new Object[]{this, new Boolean(z)});
        } else {
            this.Q = z;
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69af72b", new Object[]{this, new Integer(i)});
        } else {
            this.O = i;
        }
    }

    public void Z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84bd48b", new Object[]{this, new Integer(i)});
        } else {
            this.N = i;
        }
    }

    public Calendar a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("d435d094", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.x.getYear());
        calendar.setWeek(this.x.getWeek());
        calendar.setMonth(this.x.getMonth());
        calendar.setDay(this.x.getDay());
        calendar.setCurrentDay(true);
        return calendar;
    }

    public void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32651063", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public CalendarDateTextGravity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CalendarDateTextGravity) ipChange.ipc$dispatch("29c64fc3", new Object[]{this});
        }
        return this.K;
    }

    public final void b0(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d7e0c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.n = i;
        this.p = i2;
        this.o = i3;
        this.q = i4;
        if (i3 < this.x.getYear()) {
            this.o = this.x.getYear();
        }
        if (this.s == -1) {
            this.s = a.g(this.o, this.q);
        }
        this.z = (((this.x.getYear() - this.n) * 12) + this.x.getMonth()) - this.p;
    }

    public HashMap<String, Calendar> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2e351ba3", new Object[]{this});
        }
        return this.I;
    }

    public void c0(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7118a2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        this.n = i;
        this.p = i2;
        this.r = i3;
        this.o = i4;
        this.q = i5;
        this.s = i6;
        if (i6 == -1) {
            this.s = a.g(i4, i5);
        }
        this.z = (((this.x.getYear() - this.n) * 12) + this.x.getMonth()) - this.p;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40a6bf68", new Object[]{this})).intValue();
        }
        return this.v;
    }

    public void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db6963", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a0748de", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public void e0(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f8eca8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            this.f = i2;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("344a5459", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public void f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d817fc", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public Calendar g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("4aafbf26", new Object[]{this});
        }
        return this.x;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b57aa641", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f561cfb3", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc6cb99", new Object[]{this});
        }
        return this.L;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff82ac7f", new Object[]{this})).intValue();
        }
        return this.M;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b46c7ce", new Object[]{this})).intValue();
        }
        return this.t;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5385591", new Object[]{this})).intValue();
        }
        return this.f7425a;
    }

    public List<Pair<Calendar, Calendar>> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cbf3e1b8", new Object[]{this});
        }
        return this.H;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("675da457", new Object[]{this})).intValue();
        }
        return this.O;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7052cb5f", new Object[]{this})).intValue();
        }
        return this.N;
    }

    public final Calendar q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("73a308f2", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.o);
        calendar.setMonth(this.q);
        calendar.setDay(this.s);
        calendar.setCurrentDay(calendar.equals(this.x));
        return calendar;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f71e5285", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("630de40b", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0f3c7af", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public final Calendar u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("a643af60", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.n);
        calendar.setMonth(this.p);
        calendar.setDay(this.r);
        calendar.setCurrentDay(calendar.equals(this.x));
        return calendar;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cebd8573", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a35a25d", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed253981", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db31ee9", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Pair<String, String> z(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("56e2d14b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap = this.J;
        return concurrentHashMap.get(i + "-" + i2);
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.x = new Calendar();
        Date date = new Date();
        this.x.setYear(a.d("yyyy", date));
        this.x.setMonth(a.d("MM", date));
        this.x.setDay(a.d("dd", date));
        this.x.setCurrentDay(true);
        b0(this.n, this.p, this.o, this.q);
    }
}
