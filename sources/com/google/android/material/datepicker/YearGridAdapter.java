package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.taobao.taobao.R;
import java.util.Calendar;
import java.util.Locale;
import tb.ku2;
import tb.vu2;
import tb.xvv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCalendar<?> f5080a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f5081a;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f5081a = textView;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5082a;

        public a(int i) {
            this.f5082a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            YearGridAdapter yearGridAdapter = YearGridAdapter.this;
            yearGridAdapter.f5080a.S2(yearGridAdapter.f5080a.J2().clamp(Month.create(this.f5082a, yearGridAdapter.f5080a.M2().month)));
            yearGridAdapter.f5080a.T2(MaterialCalendar.CalendarSelector.DAY);
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.f5080a = materialCalendar;
    }

    public final View.OnClickListener N(int i) {
        return new a(i);
    }

    public int O(int i) {
        return i - this.f5080a.J2().getStart().year;
    }

    public int P(int i) {
        return this.f5080a.J2().getStart().year + i;
    }

    /* renamed from: Q */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ku2 ku2Var;
        int P = P(i);
        String string = viewHolder.f5081a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(P));
        TextView textView = viewHolder.f5081a;
        textView.setText(format);
        textView.setContentDescription(String.format(string, Integer.valueOf(P)));
        MaterialCalendar<?> materialCalendar = this.f5080a;
        vu2 K2 = materialCalendar.K2();
        Calendar p = xvv.p();
        if (p.get(1) == P) {
            ku2Var = K2.f;
        } else {
            ku2Var = K2.d;
        }
        for (Long l : materialCalendar.N2().getSelectedDays()) {
            p.setTimeInMillis(l.longValue());
            if (p.get(1) == P) {
                ku2Var = K2.e;
            }
        }
        ku2Var.d(textView);
        textView.setOnClickListener(N(P));
    }

    /* renamed from: S */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5080a.J2().getYearSpan();
    }
}
