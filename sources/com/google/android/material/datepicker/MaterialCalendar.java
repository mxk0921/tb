package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.taobao.taobao.R;
import java.util.Calendar;
import java.util.Iterator;
import tb.puk;
import tb.u7q;
import tb.vu2;
import tb.w2m;
import tb.xvv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaterialCalendar<S> extends w2m<S> {
    public int c;
    public DateSelector<S> d;
    public CalendarConstraints e;
    public Month f;
    public CalendarSelector g;
    public vu2 h;
    public RecyclerView i;
    public RecyclerView j;
    public View k;
    public View l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5064a;

        public a(int i) {
            this.f5064a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.j.smoothScrollToPosition(this.f5064a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends AccessibilityDelegateCompat {
        public b(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends u7q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f5065a = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            int i = this.f5065a;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i == 0) {
                iArr[0] = materialCalendar.j.getWidth();
                iArr[1] = materialCalendar.j.getWidth();
                return;
            }
            iArr[0] = materialCalendar.j.getHeight();
            iArr[1] = materialCalendar.j.getHeight();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements k {
        public d() {
        }

        public void a(long j) {
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.e.getDateValidator().isValid(j)) {
                materialCalendar.d.select(j);
                Iterator<puk<S>> it = materialCalendar.f30411a.iterator();
                while (it.hasNext()) {
                    it.next().b((S) materialCalendar.d.getSelection());
                }
                materialCalendar.j.getAdapter().notifyDataSetChanged();
                if (materialCalendar.i != null) {
                    materialCalendar.i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public final Calendar f5067a = xvv.r();
        public final Calendar b = xvv.r();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                for (Pair<Long, Long> pair : materialCalendar.d.getSelectedRanges()) {
                    Long l = pair.first;
                    if (!(l == null || pair.second == null)) {
                        long longValue = l.longValue();
                        Calendar calendar = this.f5067a;
                        calendar.setTimeInMillis(longValue);
                        long longValue2 = pair.second.longValue();
                        Calendar calendar2 = this.b;
                        calendar2.setTimeInMillis(longValue2);
                        int O = yearGridAdapter.O(calendar.get(1));
                        int O2 = yearGridAdapter.O(calendar2.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(O);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(O2);
                        int spanCount = O / gridLayoutManager.getSpanCount();
                        int spanCount2 = O2 / gridLayoutManager.getSpanCount();
                        for (int i3 = spanCount; i3 <= spanCount2; i3++) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i3);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + materialCalendar.h.d.c();
                                int bottom = findViewByPosition3.getBottom() - materialCalendar.h.d.b();
                                if (i3 == spanCount) {
                                    i = findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i3 == spanCount2) {
                                    i2 = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, i2, bottom, materialCalendar.h.h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends AccessibilityDelegateCompat {
        public f() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.l.getVisibility() == 0) {
                str = materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection);
            } else {
                str = materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection);
            }
            accessibilityNodeInfoCompat.setHintText(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MonthsPagerAdapter f5068a;
        public final /* synthetic */ MaterialButton b;

        public g(MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
            this.f5068a = monthsPagerAdapter;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i < 0) {
                i3 = materialCalendar.getLayoutManager().findFirstVisibleItemPosition();
            } else {
                i3 = materialCalendar.getLayoutManager().findLastVisibleItemPosition();
            }
            MonthsPagerAdapter monthsPagerAdapter = this.f5068a;
            materialCalendar.f = monthsPagerAdapter.N(i3);
            this.b.setText(monthsPagerAdapter.O(i3));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.U2();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MonthsPagerAdapter f5070a;

        public i(MonthsPagerAdapter monthsPagerAdapter) {
            this.f5070a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            int findFirstVisibleItemPosition = materialCalendar.getLayoutManager().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < materialCalendar.j.getAdapter().getItemCount()) {
                materialCalendar.S2(this.f5070a.N(findFirstVisibleItemPosition));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MonthsPagerAdapter f5071a;

        public j(MonthsPagerAdapter monthsPagerAdapter) {
            this.f5071a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            int findLastVisibleItemPosition = materialCalendar.getLayoutManager().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                materialCalendar.S2(this.f5071a.N(findLastVisibleItemPosition));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface k {
    }

    public static int O2(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    public static <T> MaterialCalendar<T> Q2(DateSelector<T> dateSelector, int i2, CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    public final void D2(View view, MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag("SELECTOR_TOGGLE_TAG");
        ViewCompat.setAccessibilityDelegate(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.month_navigation_previous);
        materialButton2.setTag("NAVIGATION_PREV_TAG");
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.month_navigation_next);
        materialButton3.setTag("NAVIGATION_NEXT_TAG");
        this.k = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.l = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        T2(CalendarSelector.DAY);
        materialButton.setText(this.f.getLongName());
        this.j.addOnScrollListener(new g(monthsPagerAdapter, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(monthsPagerAdapter));
        materialButton2.setOnClickListener(new j(monthsPagerAdapter));
    }

    public final RecyclerView.ItemDecoration E2() {
        return new e();
    }

    public CalendarConstraints J2() {
        return this.e;
    }

    public vu2 K2() {
        return this.h;
    }

    public Month M2() {
        return this.f;
    }

    public DateSelector<S> N2() {
        return this.d;
    }

    public final void R2(int i2) {
        this.j.post(new a(i2));
    }

    public void S2(Month month) {
        boolean z;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.j.getAdapter();
        int P = monthsPagerAdapter.P(month);
        int P2 = P - monthsPagerAdapter.P(this.f);
        boolean z2 = false;
        if (Math.abs(P2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (P2 > 0) {
            z2 = true;
        }
        this.f = month;
        if (z && z2) {
            this.j.scrollToPosition(P - 3);
            R2(P);
        } else if (z) {
            this.j.scrollToPosition(P + 3);
            R2(P);
        } else {
            R2(P);
        }
    }

    public void T2(CalendarSelector calendarSelector) {
        this.g = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.i.getLayoutManager().scrollToPosition(((YearGridAdapter) this.i.getAdapter()).O(this.f.year));
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            S2(this.f);
        }
    }

    public void U2() {
        CalendarSelector calendarSelector = this.g;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            T2(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            T2(calendarSelector2);
        }
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.j.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("THEME_RES_ID_KEY");
        this.d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.c);
        this.h = new vu2(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.e.getStart();
        if (MaterialDatePicker.O2(contextThemeWrapper)) {
            i3 = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new DaysOfWeekAdapter());
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.j.setLayoutManager(new c(getContext(), i2, false, i2));
        this.j.setTag("MONTHS_VIEW_GROUP_TAG");
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.d, this.e, new d());
        this.j.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.i.setAdapter(new YearGridAdapter(this));
            this.i.addItemDecoration(E2());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            D2(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.O2(contextThemeWrapper)) {
            new LinearSnapHelper().attachToRecyclerView(this.j);
        }
        this.j.scrollToPosition(monthsPagerAdapter.P(this.f));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
