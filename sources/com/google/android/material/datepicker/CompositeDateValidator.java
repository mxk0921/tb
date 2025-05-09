package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.Preconditions;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new a();
    private final List<CalendarConstraints.DateValidator> validators;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Parcelable.Creator<CompositeDateValidator> {
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            return new CompositeDateValidator((List) Preconditions.checkNotNull(parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader())), null);
        }

        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public /* synthetic */ CompositeDateValidator(List list, a aVar) {
        this(list);
    }

    public static CalendarConstraints.DateValidator allOf(List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        return this.validators.equals(((CompositeDateValidator) obj).validators);
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        for (CalendarConstraints.DateValidator dateValidator : this.validators) {
            if (dateValidator != null && !dateValidator.isValid(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.validators);
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list) {
        this.validators = list;
    }
}
