package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import tb.puk;
import tb.w2m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaterialTextInputPicker<S> extends w2m<S> {
    public DateSelector<S> c;
    public CalendarConstraints d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends puk<S> {
        public a() {
        }

        @Override // tb.puk
        public void a() {
            Iterator<puk<S>> it = MaterialTextInputPicker.this.f30411a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // tb.puk
        public void b(S s) {
            Iterator<puk<S>> it = MaterialTextInputPicker.this.f30411a.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    public static <T> MaterialTextInputPicker<T> s2(DateSelector<T> dateSelector, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.c.onCreateTextInputView(layoutInflater, viewGroup, bundle, this.d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}
