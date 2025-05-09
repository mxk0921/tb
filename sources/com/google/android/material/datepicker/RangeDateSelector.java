package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.textfield.TextInputLayout;
import com.taobao.taobao.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import tb.k6i;
import tb.ogw;
import tb.ou6;
import tb.puk;
import tb.x2i;
import tb.xvv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();
    private String invalidRangeStartError;
    private final String invalidRangeEndError = " ";
    private Long selectedStartItem = null;
    private Long selectedEndItem = null;
    private Long proposedTextStart = null;
    private Long proposedTextEnd = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends com.google.android.material.datepicker.a {
        public final /* synthetic */ TextInputLayout f;
        public final /* synthetic */ TextInputLayout g;
        public final /* synthetic */ puk h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, puk pukVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f = textInputLayout2;
            this.g = textInputLayout3;
            this.h = pukVar;
        }

        @Override // com.google.android.material.datepicker.a
        public void a() {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.proposedTextStart = null;
            rangeDateSelector.updateIfValidTextProposal(this.f, this.g, this.h);
        }

        @Override // com.google.android.material.datepicker.a
        public void b(Long l) {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.proposedTextStart = l;
            rangeDateSelector.updateIfValidTextProposal(this.f, this.g, this.h);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends com.google.android.material.datepicker.a {
        public final /* synthetic */ TextInputLayout f;
        public final /* synthetic */ TextInputLayout g;
        public final /* synthetic */ puk h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, puk pukVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f = textInputLayout2;
            this.g = textInputLayout3;
            this.h = pukVar;
        }

        @Override // com.google.android.material.datepicker.a
        public void a() {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.proposedTextEnd = null;
            rangeDateSelector.updateIfValidTextProposal(this.f, this.g, this.h);
        }

        @Override // com.google.android.material.datepicker.a
        public void b(Long l) {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.proposedTextEnd = l;
            rangeDateSelector.updateIfValidTextProposal(this.f, this.g, this.h);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Parcelable.Creator<RangeDateSelector> {
        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    private void clearInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private boolean isValidRange(long j, long j2) {
        if (j <= j2) {
            return true;
        }
        return false;
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, puk<Pair<Long, Long>> pukVar) {
        Long l = this.proposedTextStart;
        if (l == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            pukVar.a();
        } else if (isValidRange(l.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            pukVar.b(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            pukVar.a();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = R.attr.materialCalendarTheme;
        } else {
            i = R.attr.materialCalendarFullscreenTheme;
        }
        return k6i.c(context, i, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, ou6.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, ou6.c(l2.longValue()));
        }
        Pair<String, String> a2 = ou6.a(l, l2);
        return resources.getString(R.string.mtrl_picker_range_header_selected, a2.first, a2.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l = this.selectedStartItem;
        if (l == null || this.selectedEndItem == null || !isValidRange(l.longValue(), this.selectedEndItem.longValue())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, puk<Pair<Long, Long>> pukVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (x2i.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat l = xvv.l();
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            editText.setText(l.format(l2));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l3 = this.selectedEndItem;
        if (l3 != null) {
            editText2.setText(l.format(l3));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String m = xvv.m(inflate.getResources(), l);
        editText.addTextChangedListener(new a(m, l, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, pukVar));
        editText2.addTextChangedListener(new b(m, l, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, pukVar));
        ogw.k(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem != null || !isValidRange(l.longValue(), j)) {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = Long.valueOf(j);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.selectedStartItem, this.selectedEndItem);
    }

    public void setSelection(Pair<Long, Long> pair) {
        Long l = pair.first;
        if (!(l == null || pair.second == null)) {
            Preconditions.checkArgument(isValidRange(l.longValue(), pair.second.longValue()));
        }
        Long l2 = pair.first;
        Long l3 = null;
        this.selectedStartItem = l2 == null ? null : Long.valueOf(xvv.a(l2.longValue()));
        Long l4 = pair.second;
        if (l4 != null) {
            l3 = Long.valueOf(xvv.a(l4.longValue()));
        }
        this.selectedEndItem = l3;
    }
}
