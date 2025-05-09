package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597471);
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1ceee9a", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        return calendar.compareTo(calendar2);
    }

    public static int b(Calendar calendar, Calendar calendar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1c7b0cc", new Object[]{calendar, calendar2})).intValue();
        }
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        if (calendar2 == null) {
            return Integer.MAX_VALUE;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay(), 12, 0, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(calendar2.getYear(), calendar2.getMonth() - 1, calendar2.getDay(), 12, 0, 0);
        return (int) ((timeInMillis - instance.getTimeInMillis()) / 86400000);
    }

    public static int c(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed50340", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int d(String str, Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e99a4989", new Object[]{str, date})).intValue();
        }
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    public static Calendar e(int i, CalendarViewDelegate calendarViewDelegate) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("3dbf57a4", new Object[]{new Integer(i), calendarViewDelegate});
        }
        Calendar calendar = new Calendar();
        calendar.setYear((((calendarViewDelegate.x() + i) - 1) / 12) + calendarViewDelegate.v());
        calendar.setMonth((((i + calendarViewDelegate.x()) - 1) % 12) + 1);
        if (calendarViewDelegate.m() != 0) {
            int g = g(calendar.getYear(), calendar.getMonth());
            Calendar calendar2 = calendarViewDelegate.G;
            if (calendar2 == null || calendar2.getDay() == 0) {
                g = 1;
            } else if (g >= calendar2.getDay()) {
                g = calendar2.getDay();
            }
            calendar.setDay(g);
        } else {
            calendar.setDay(1);
        }
        if (!(calendar.getYear() == calendarViewDelegate.g().getYear() && calendar.getMonth() == calendarViewDelegate.g().getMonth())) {
            z = false;
        }
        calendar.setCurrentMonth(z);
        calendar.setCurrentDay(calendar.equals(calendarViewDelegate.g()));
        return calendar;
    }

    public static String f(int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("704d05d7", new Object[]{new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        if (i2 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(i2);
        sb.append("-01");
        return sb.toString();
    }

    public static int g(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("586dd5e8", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) {
            i3 = 31;
        }
        if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = 30;
        }
        if (i2 != 2) {
            return i3;
        }
        if (s(i)) {
            return 29;
        }
        return 28;
    }

    public static int h(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e350d099", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return i(i, i2, g(i, i2), i3);
    }

    public static int i(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86c9b710", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        int i5 = instance.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return 8 - i5;
        } else if (i5 == 7) {
            return 6;
        } else {
            return 6 - i5;
        }
    }

    public static int j(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("158d3450", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        Calendar.getInstance().set(i, i2 - 1, 1, 12, 0, 0);
        int l = l(i, i2, i4);
        int g = g(i, i2);
        return (((l + g) + i(i, i2, g, i4)) / 7) * i3;
    }

    public static int k(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c19ca39", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        if (i5 == 0) {
            return i3 * 6;
        }
        return j(i, i2, i3, i4);
    }

    public static int l(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abcec7f7", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, 1, 12, 0, 0);
        int i4 = instance.get(7);
        if (i3 == 1) {
            return i4 - 1;
        }
        if (i3 == 2) {
            if (i4 == 1) {
                return 6;
            }
            return i4 - i3;
        } else if (i4 == 7) {
            return 0;
        } else {
            return i4;
        }
    }

    public static Calendar m(Calendar calendar, CalendarViewDelegate calendarViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("50d3a67", new Object[]{calendar, calendarViewDelegate});
        }
        if (q(calendarViewDelegate.g(), calendarViewDelegate) && calendarViewDelegate.m() != 2) {
            return calendarViewDelegate.a();
        }
        if (q(calendar, calendarViewDelegate)) {
            return calendar;
        }
        if (calendarViewDelegate.u().isSameMonth(calendar)) {
            return calendarViewDelegate.u();
        }
        return calendarViewDelegate.q();
    }

    public static List<Calendar> n(int i, int i2, CalendarViewDelegate calendarViewDelegate) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Calendar calendar;
        int i8;
        int i9;
        int i10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d517cff0", new Object[]{new Integer(i), new Integer(i2), calendarViewDelegate});
        }
        int i11 = i2 - 1;
        Calendar.getInstance().set(i, i11, 1);
        int l = l(i, i2, calendarViewDelegate.G());
        int g = g(i, i2);
        ArrayList arrayList = new ArrayList();
        int i12 = 12;
        if (i2 == 1) {
            i6 = i - 1;
            int i13 = i2 + 1;
            if (l == 0) {
                i10 = 0;
            } else {
                i10 = g(i6, 12);
            }
            i3 = i10;
            i4 = i13;
            i5 = i;
        } else if (i2 == 12) {
            int i14 = i + 1;
            if (l == 0) {
                i9 = 0;
            } else {
                i9 = g(i, i11);
            }
            i5 = i14;
            i3 = i9;
            i4 = 1;
            i12 = i11;
            i6 = i;
        } else {
            int i15 = i2 + 1;
            if (l == 0) {
                i8 = 0;
            } else {
                i8 = g(i, i11);
            }
            i12 = i11;
            i3 = i8;
            i6 = i;
            i4 = i15;
            i5 = i6;
        }
        Calendar[] calendarArr = new Calendar[2];
        int i16 = 0;
        int i17 = 1;
        while (i16 < 42) {
            Calendar calendar2 = new Calendar();
            if (i16 < l) {
                calendar2.setYear(i6);
                calendar2.setMonth(i12);
                i7 = i6;
                calendar2.setDay((i3 - l) + i16 + 1);
            } else {
                i7 = i6;
                if (i16 >= g + l) {
                    calendar2.setYear(i5);
                    calendar2.setMonth(i4);
                    calendar2.setDay(i17);
                    i17++;
                } else {
                    calendar2.setYear(i);
                    calendar2.setMonth(i2);
                    calendar2.setCurrentMonth(true);
                    calendar2.setDay((i16 - l) + 1);
                }
            }
            if (calendar2.equals(calendarViewDelegate.g())) {
                calendar2.setCurrentDay(true);
            }
            t(calendar2, calendarViewDelegate);
            if (i16 % 7 == 0) {
                calendar = null;
            } else {
                calendar = (Calendar) arrayList.get(i16 - 1);
            }
            u(calendar, calendar2);
            arrayList.add(calendar2);
            if (i16 == 0) {
                calendarArr[0] = calendar2;
            } else if (i16 == 41) {
                calendarArr[1] = calendar2;
            }
            i16++;
            i6 = i7;
        }
        calendarViewDelegate.N(i, i2, calendarArr[0], calendarArr[1]);
        return arrayList;
    }

    public static boolean o(Calendar calendar, List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9143b2c", new Object[]{calendar, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (Pair<Calendar, Calendar> pair : list) {
            if (calendar.compareTo((Calendar) pair.first) >= 0 && calendar.compareTo((Calendar) pair.second) <= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(Calendar calendar, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9873184b", new Object[]{calendar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).booleanValue();
        }
        if (calendar == null) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2 - 1, i3);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(i4, i5 - 1, i6);
        long timeInMillis2 = instance.getTimeInMillis();
        instance.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis3 = instance.getTimeInMillis();
        if (timeInMillis3 < timeInMillis || timeInMillis3 > timeInMillis2) {
            return false;
        }
        return true;
    }

    public static boolean q(Calendar calendar, CalendarViewDelegate calendarViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ab3eeb1", new Object[]{calendar, calendarViewDelegate})).booleanValue();
        }
        if (!p(calendar, calendarViewDelegate.v(), calendarViewDelegate.x(), calendarViewDelegate.w(), calendarViewDelegate.r(), calendarViewDelegate.t(), calendarViewDelegate.s()) || o(calendar, calendarViewDelegate.n())) {
            return false;
        }
        return true;
    }

    public static boolean r(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cd64a67", new Object[]{list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (Pair<Calendar, Calendar> pair : list) {
            if (((Calendar) pair.second).compareTo((Calendar) pair.first) < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc6741b1", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((i % 4 != 0 || i % 100 == 0) && i % 400 != 0) {
            return false;
        }
        return true;
    }

    public static void t(Calendar calendar, CalendarViewDelegate calendarViewDelegate) {
        HashMap<String, Calendar> c;
        Calendar calendar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81862e04", new Object[]{calendar, calendarViewDelegate});
        } else if (q(calendar, calendarViewDelegate) && (c = calendarViewDelegate.c()) != null) {
            String dateString = calendar.getDateString();
            if (c.containsKey(dateString) && (calendar2 = c.get(dateString)) != null) {
                calendar.setBooked(calendar2.isBooked());
                calendar.setCalendarInfo(calendar2.getCalendarInfo());
            }
        }
    }

    public static void u(Calendar calendar, Calendar calendar2) {
        Calendar.RoundRectType roundRectType;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6beb00a", new Object[]{calendar, calendar2});
            return;
        }
        if (calendar == null || !calendar.hasBackgroundInfo()) {
            z = false;
        }
        boolean hasBackgroundInfo = calendar2.hasBackgroundInfo();
        if (z) {
            if (hasBackgroundInfo) {
                if (calendar.getRoundRectType() == Calendar.RoundRectType.ALL) {
                    calendar.setRoundRectType(Calendar.RoundRectType.LEFT);
                } else if (calendar.getRoundRectType() == Calendar.RoundRectType.RIGHT) {
                    calendar.setRoundRectType(Calendar.RoundRectType.NONE);
                }
                calendar2.setRoundRectType(Calendar.RoundRectType.RIGHT);
            }
        } else if (hasBackgroundInfo) {
            if (hasBackgroundInfo) {
                roundRectType = Calendar.RoundRectType.ALL;
            } else {
                roundRectType = Calendar.RoundRectType.NONE;
            }
            calendar2.setRoundRectType(roundRectType);
        }
    }
}
