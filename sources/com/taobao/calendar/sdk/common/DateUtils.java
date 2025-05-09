package com.taobao.calendar.sdk.common;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DateUtils {
    private static int[] truncateList = {1, 2, 5, 11, 12, 13, 14};
    private static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat yyyyMM = new SimpleDateFormat("yyyy.MM");

    public static Date easter(int i) {
        int i2 = i / 100;
        int i3 = i - ((i / 19) * 19);
        int i4 = i2 / 4;
        int i5 = ((i2 - i4) - ((i2 - ((i2 - 17) / 25)) / 3)) + (i3 * 19) + 15;
        int i6 = i5 - ((i5 / 30) * 30);
        int i7 = i6 / 28;
        int i8 = i6 - (i7 * (1 - (((29 / (i6 + 1)) * i7) * ((21 - i3) / 11))));
        int i9 = (((((i / 4) + i) + i8) + 2) - i2) + i4;
        int i10 = i8 - (i9 - ((i9 / 7) * 7));
        int i11 = (i10 + 40) / 44;
        Calendar instance = Calendar.getInstance();
        instance.set(i, i11 + 2, (i10 + 28) - (((i11 + 3) / 4) * 31));
        return instance.getTime();
    }

    public static String formatCompat(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            Date parse = simpleDateFormat.parse(str);
            simpleDateFormat.applyPattern(str3);
            return simpleDateFormat.format(parse);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String formatDate(long j) {
        return formatDate(j, "yyyy-MM-dd HH:mm:ss");
    }

    public static int getDayOfMonth(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(5);
    }

    public static int getDayOfWeek(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(7);
    }

    public static int getDaysOfMonth(int i, int i2) {
        boolean isLeapYear = isLeapYear(i);
        switch (i2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public static int getMonth(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(2);
    }

    public static int getWeek(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return getWeek(instance);
    }

    public static int getWeekForFirstMonthDay(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, 1);
        return getWeek(instance);
    }

    public static String getYYYYMM(Calendar calendar) {
        return yyyyMM.format(calendar.getTime());
    }

    public static String getYYYYMMDD(Calendar calendar) {
        return yyyyMMdd.format(calendar.getTime());
    }

    public static int getYear(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(1);
    }

    public static boolean isLeapYear(int i) {
        int i2 = i % 100;
        if ((i2 != 0 || i % 400 != 0) && (i2 == 0 || i % 4 != 0)) {
            return false;
        }
        return true;
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (truncate(calendar).getTimeInMillis() == truncate(calendar2).getTimeInMillis()) {
            return true;
        }
        return false;
    }

    public static boolean isSameMonth(Calendar calendar, Calendar calendar2) {
        if (truncate(calendar, 2).getTimeInMillis() == truncate(calendar2, 2).getTimeInMillis()) {
            return true;
        }
        return false;
    }

    public static boolean isSameWeek(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(3);
        int i2 = calendar.get(1);
        int i3 = calendar2.get(3);
        int i4 = calendar.get(1);
        if (i == i3 && i2 == i4) {
            return true;
        }
        return false;
    }

    public static boolean isToday(Calendar calendar) {
        return isSameDay(calendar, Calendar.getInstance());
    }

    public static boolean isWeekend(Calendar calendar) {
        if (getWeek(calendar) >= 5) {
            return true;
        }
        return false;
    }

    public static int minus(Date date, Date date2) {
        return (int) Math.floor(((((date.getTime() - date2.getTime()) / 1000) / 60) / 60) / 24);
    }

    public static Date parseDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(str.trim());
        } catch (ParseException unused) {
            return null;
        }
    }

    public static Calendar parseDateToCalendar(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = null;
        try {
            Date parse = simpleDateFormat.parse(str.trim());
            calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return calendar;
        } catch (ParseException unused) {
            return calendar;
        }
    }

    public static Calendar parseDateToCalendarFromyyyyMMdd(String str) {
        Calendar calendar = null;
        try {
            Date parse = yyyyMMdd.parse(str.trim());
            calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return calendar;
        } catch (ParseException unused) {
            return calendar;
        }
    }

    public static Calendar truncate(Calendar calendar) {
        return truncate(calendar, 5);
    }

    public static String formatDate(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            long parseLong = Long.parseLong(str);
            Date date = new Date();
            date.setTime(parseLong);
            return simpleDateFormat.format(date);
        } catch (Exception unused) {
            return str;
        }
    }

    public static int getDaysOfMonth(Calendar calendar) {
        return getDaysOfMonth(calendar.get(1), calendar.get(2) + 1);
    }

    public static Calendar truncate(Calendar calendar, int i) {
        Calendar calendar2 = (Calendar) calendar.clone();
        int length = truncateList.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (truncateList[i2] == i) {
                i2++;
                break;
            } else {
                i2++;
            }
        }
        while (i2 < length) {
            int i3 = truncateList[i2];
            if (i3 == 5) {
                calendar2.set(i3, 1);
                i2++;
            } else {
                calendar2.set(i3, 0);
                i2++;
            }
        }
        return calendar2;
    }

    static {
        t2o.a(414187548);
    }

    public static int getWeek(Date date, int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return getWeek(instance, i);
    }

    public static int getWeek(Calendar calendar) {
        int i = calendar.get(7) - 2;
        if (i == -1) {
            return 6;
        }
        return i;
    }

    public static int getWeek(Calendar calendar, int i) {
        int week = getWeek(calendar);
        if (i == 7) {
            return week;
        }
        if (i > 7) {
            i %= 7;
        }
        int i2 = (((week + i) + 1) % 7) - 1;
        if (i2 < -1) {
            return 6;
        }
        if (i2 > 6) {
            return 0;
        }
        return i2;
    }

    public static String formatDate(long j, String str) {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return simpleDateFormat.format(instance.getTime());
    }

    public static String formatDate(Long l) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(instance.getTime());
    }
}
