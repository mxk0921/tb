package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import tb.xvv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    private final Month end;
    private final int monthSpan;
    private final Month openAt;
    private final Month start;
    private final DateValidator validator;
    private final int yearSpan;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Parcelable.Creator<CalendarConstraints> {
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static final long e = xvv.a(Month.create(1900, 0).timeInMillis);
        public static final long f = xvv.a(Month.create(2100, 11).timeInMillis);

        /* renamed from: a  reason: collision with root package name */
        public final long f5063a;
        public final long b;
        public Long c;
        public final DateValidator d;

        public b(CalendarConstraints calendarConstraints) {
            this.f5063a = e;
            this.b = f;
            this.d = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.f5063a = calendarConstraints.start.timeInMillis;
            this.b = calendarConstraints.end.timeInMillis;
            this.c = Long.valueOf(calendarConstraints.openAt.timeInMillis);
            this.d = calendarConstraints.validator;
        }

        public CalendarConstraints a() {
            Long l = this.c;
            long j = this.b;
            long j2 = this.f5063a;
            if (l == null) {
                long R2 = MaterialDatePicker.R2();
                if (j2 > R2 || R2 > j) {
                    R2 = j2;
                }
                this.c = Long.valueOf(R2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            return new CalendarConstraints(Month.create(j2), Month.create(j), Month.create(this.c.longValue()), (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, a aVar) {
        this(month, month2, month3, dateValidator);
    }

    public Month clamp(Month month) {
        if (month.compareTo(this.start) < 0) {
            return this.start;
        }
        if (month.compareTo(this.end) > 0) {
            return this.end;
        }
        return month;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.start.equals(calendarConstraints.start) || !this.end.equals(calendarConstraints.end) || !this.openAt.equals(calendarConstraints.openAt) || !this.validator.equals(calendarConstraints.validator)) {
            return false;
        }
        return true;
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    public Month getEnd() {
        return this.end;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    public Month getOpenAt() {
        return this.openAt;
    }

    public Month getStart() {
        return this.start;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, this.validator});
    }

    public boolean isWithinBounds(long j) {
        if (this.start.getDay(1) <= j) {
            Month month = this.end;
            if (j <= month.getDay(month.daysInMonth)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.validator = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.monthSpan = month.monthsUntil(month2) + 1;
            this.yearSpan = (month2.year - month.year) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
