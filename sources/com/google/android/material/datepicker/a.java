package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.taobao.taobao.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import tb.ou6;
import tb.xvv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class a implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final String f5083a;
    public final DateFormat b;
    public final TextInputLayout c;
    public final CalendarConstraints d;
    public final String e;

    public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f5083a = str;
        this.b = dateFormat;
        this.c = textInputLayout;
        this.d = calendarConstraints;
        this.e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
    }

    public abstract void a();

    public abstract void b(Long l);

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.d;
        DateFormat dateFormat = this.b;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextInputLayout textInputLayout = this.c;
        if (isEmpty) {
            textInputLayout.setError(null);
            b(null);
            return;
        }
        try {
            Date parse = dateFormat.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = parse.getTime();
            if (!calendarConstraints.getDateValidator().isValid(time) || !calendarConstraints.isWithinBounds(time)) {
                textInputLayout.setError(String.format(this.e, ou6.c(time)));
                a();
            } else {
                b(Long.valueOf(parse.getTime()));
            }
        } catch (ParseException unused) {
            String string = textInputLayout.getContext().getString(R.string.mtrl_picker_invalid_format);
            String format = String.format(textInputLayout.getContext().getString(R.string.mtrl_picker_invalid_format_use), this.f5083a);
            String format2 = String.format(textInputLayout.getContext().getString(R.string.mtrl_picker_invalid_format_example), dateFormat.format(new Date(xvv.p().getTimeInMillis())));
            textInputLayout.setError(string + "\n" + format + "\n" + format2);
            a();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
