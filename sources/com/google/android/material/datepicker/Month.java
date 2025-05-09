package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import tb.xvv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private final String longName;
    final int month;
    final long timeInMillis;
    final int year;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Parcelable.Creator<Month> {
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = xvv.f(calendar);
        this.firstOfMonth = f;
        this.month = f.get(2);
        this.year = f.get(1);
        this.daysInWeek = f.getMaximum(7);
        this.daysInMonth = f.getActualMaximum(5);
        this.longName = xvv.v().format(f.getTime());
        this.timeInMillis = f.getTimeInMillis();
    }

    public static Month create(long j) {
        Calendar r = xvv.r();
        r.setTimeInMillis(j);
        return new Month(r);
    }

    public static Month current() {
        return new Month(xvv.p());
    }

    public int daysFromStartOfWeekToFirstOfMonth() {
        int firstDayOfWeek = this.firstOfMonth.get(7) - this.firstOfMonth.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.daysInWeek;
        }
        return firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.month == month.month && this.year == month.year) {
            return true;
        }
        return false;
    }

    public long getDay(int i) {
        Calendar f = xvv.f(this.firstOfMonth);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public String getLongName() {
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    public Month monthsLater(int i) {
        Calendar f = xvv.f(this.firstOfMonth);
        f.add(2, i);
        return new Month(f);
    }

    public int monthsUntil(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    public int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    public static Month create(int i, int i2) {
        Calendar r = xvv.r();
        r.set(1, i);
        r.set(2, i2);
        return new Month(r);
    }
}
