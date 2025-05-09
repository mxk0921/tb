package com.taobao.android.dinamicx.widget.calander;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class Calendar implements Serializable, Comparable<Calendar> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 141315161718191143L;
    private boolean booked;
    private a calendarInfo;
    private int day;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private int month;
    public RoundRectType roundRectType = RoundRectType.NONE;
    private int week;
    private int year;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RoundRectType {
        NONE,
        LEFT,
        RIGHT,
        ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RoundRectType roundRectType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/Calendar$RoundRectType");
        }

        public static RoundRectType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RoundRectType) ipChange.ipc$dispatch("502754c5", new Object[]{str});
            }
            return (RoundRectType) Enum.valueOf(RoundRectType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f7423a;
        public String b;

        static {
            t2o.a(444597468);
        }
    }

    static {
        t2o.a(444597467);
    }

    public boolean containHighLightCalendarInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0d5edd7", new Object[]{this})).booleanValue();
        }
        if (isBooked() || this.calendarInfo != null) {
            return true;
        }
        return false;
    }

    public final int differ(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20e475dc", new Object[]{this, calendar})).intValue();
        }
        return com.taobao.android.dinamicx.widget.calander.a.b(this, calendar);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public a getCalendarInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8253a349", new Object[]{this});
        }
        return this.calendarInfo;
    }

    public String getDateString() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc00ccc4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("-");
        int i = this.month;
        if (i < 10) {
            obj = "0" + this.month;
        } else {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        sb.append("-");
        int i2 = this.day;
        if (i2 < 10) {
            obj2 = "0" + this.day;
        } else {
            obj2 = Integer.valueOf(i2);
        }
        sb.append(obj2);
        return sb.toString();
    }

    public int getDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("940115e0", new Object[]{this})).intValue();
        }
        return this.day;
    }

    public int getLeapMonth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da6c78bc", new Object[]{this})).intValue();
        }
        return this.leapMonth;
    }

    public int getMonth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1e1d844", new Object[]{this})).intValue();
        }
        return this.month;
    }

    public RoundRectType getRoundRectType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundRectType) ipChange.ipc$dispatch("be476d41", new Object[]{this});
        }
        return this.roundRectType;
    }

    public long getTimeInMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51dc4da9", new Object[]{this})).longValue();
        }
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(1, this.year);
        instance.set(2, this.month - 1);
        instance.set(5, this.day);
        return instance.getTimeInMillis();
    }

    public int getWeek() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56ae47e4", new Object[]{this})).intValue();
        }
        return this.week;
    }

    public int getYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fffe3ad", new Object[]{this})).intValue();
        }
        return this.year;
    }

    public boolean hasBackgroundInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7e629c1", new Object[]{this})).booleanValue();
        }
        a aVar = this.calendarInfo;
        if (aVar == null || TextUtils.isEmpty(aVar.f7423a)) {
            return false;
        }
        return true;
    }

    public boolean isAvailable() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        int i = this.year;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.month;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z8 = z & z2;
        int i3 = this.day;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z8 & z3;
        if (i3 <= 31) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = z9 & z4;
        if (i2 <= 12) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = z10 & z5;
        if (i >= 1900) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z12 = z11 & z6;
        if (i <= 2099) {
            z7 = true;
        }
        return z7 & z12;
    }

    public boolean isBooked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2801ce9d", new Object[]{this})).booleanValue();
        }
        return this.booked;
    }

    public boolean isCurrentDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1bd238", new Object[]{this})).booleanValue();
        }
        return this.isCurrentDay;
    }

    public boolean isCurrentMonth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a03e9edc", new Object[]{this})).booleanValue();
        }
        return this.isCurrentMonth;
    }

    public boolean isLeapYear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e58fb41a", new Object[]{this})).booleanValue();
        }
        return this.isLeapYear;
    }

    public boolean isSameMonth(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb0e4ab", new Object[]{this, calendar})).booleanValue();
        }
        if (calendar != null && this.year == calendar.getYear() && this.month == calendar.getMonth()) {
            return true;
        }
        return false;
    }

    public boolean isWeekend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd7c09e8", new Object[]{this})).booleanValue();
        }
        return this.isWeekend;
    }

    public void setBooked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7fd523", new Object[]{this, new Boolean(z)});
        } else {
            this.booked = z;
        }
    }

    public void setCalendarInfo(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc2e95b", new Object[]{this, aVar});
        } else {
            this.calendarInfo = aVar;
        }
    }

    public void setCurrentDay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d220e8", new Object[]{this, new Boolean(z)});
        } else {
            this.isCurrentDay = z;
        }
    }

    public void setCurrentMonth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33196c4", new Object[]{this, new Boolean(z)});
        } else {
            this.isCurrentMonth = z;
        }
    }

    public void setDay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6da7bc2", new Object[]{this, new Integer(i)});
        } else {
            this.day = i;
        }
    }

    public void setLeapMonth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b197b66", new Object[]{this, new Integer(i)});
        } else {
            this.leapMonth = i;
        }
    }

    public void setLeapYear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5e4d46", new Object[]{this, new Boolean(z)});
        } else {
            this.isLeapYear = z;
        }
    }

    public void setMonth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87df2de", new Object[]{this, new Integer(i)});
        } else {
            this.month = i;
        }
    }

    public void setRoundRectType(RoundRectType roundRectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34fec39", new Object[]{this, roundRectType});
        } else {
            this.roundRectType = roundRectType;
        }
    }

    public void setWeek(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6ee9a6", new Object[]{this, new Integer(i)});
        } else {
            this.week = i;
        }
    }

    public void setWeekend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a280a8", new Object[]{this, new Boolean(z)});
        } else {
            this.isWeekend = z;
        }
    }

    public void setYear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c50c6fd", new Object[]{this, new Integer(i)});
        } else {
            this.year = i;
        }
    }

    public String toString() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("");
        int i = this.month;
        if (i < 10) {
            obj = "0" + this.month;
        } else {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        sb.append("");
        int i2 = this.day;
        if (i2 < 10) {
            obj2 = "0" + this.day;
        } else {
            obj2 = Integer.valueOf(i2);
        }
        sb.append(obj2);
        return sb.toString();
    }

    public int compareTo(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31ff2f2a", new Object[]{this, calendar})).intValue();
        }
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }
}
