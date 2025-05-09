package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final CalendarConstraints f5078a;
    public final DateSelector<?> b;
    public final MaterialCalendar.k c;
    public final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f5079a;
        public final MaterialCalendarGridView b;

        public ViewHolder(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f5079a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public MonthsPagerAdapter(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.k kVar) {
        int i;
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (openAt.compareTo(end) <= 0) {
            int O2 = MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.O2(context);
            if (MaterialDatePicker.O2(context)) {
                i = MaterialCalendar.O2(context);
            } else {
                i = 0;
            }
            this.d = O2 + i;
            this.f5078a = calendarConstraints;
            this.b = dateSelector;
            this.c = kVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public Month N(int i) {
        return this.f5078a.getStart().monthsLater(i);
    }

    public CharSequence O(int i) {
        return N(i).getLongName();
    }

    public int P(Month month) {
        return this.f5078a.getStart().monthsUntil(month);
    }

    /* renamed from: Q */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        CalendarConstraints calendarConstraints = this.f5078a;
        Month monthsLater = calendarConstraints.getStart().monthsLater(i);
        viewHolder.f5079a.setText(monthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !monthsLater.equals(materialCalendarGridView.getAdapter2().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthsLater, this.b, calendarConstraints);
            materialCalendarGridView.setNumColumns(monthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter2().withinMonth(i2)) {
                    ((MaterialCalendar.d) MonthsPagerAdapter.this.c).a(materialCalendarGridView.getAdapter2().getItem(i2).longValue());
                }
            }
        });
    }

    /* renamed from: S */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.O2(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.d));
        return new ViewHolder(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5078a.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f5078a.getStart().monthsLater(i).getStableId();
    }
}
