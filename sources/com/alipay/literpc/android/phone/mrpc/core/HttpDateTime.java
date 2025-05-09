package com.alipay.literpc.android.phone.mrpc.core;

import android.text.format.Time;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class HttpDateTime {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f3846a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");
    public static final Pattern b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TimeOfDay {
        public int hour;
        public int minute;
        public int second;

        public TimeOfDay(int i, int i2, int i3) {
            this.hour = i;
            this.minute = i2;
            this.second = i3;
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b811fa8", new Object[]{str})).intValue();
        }
        if (str.length() == 2) {
            return ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
        }
        return str.charAt(0) - '0';
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3c9efce", new Object[]{str})).intValue();
        }
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static TimeOfDay c(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeOfDay) ipChange.ipc$dispatch("702419a5", new Object[]{str});
        }
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            charAt = (charAt * 10) + (str.charAt(1) - '0');
            i = 2;
        } else {
            i = 1;
        }
        return new TimeOfDay(charAt, ((str.charAt(1 + i) - '0') * 10) + (str.charAt(2 + i) - '0'), ((str.charAt(i + 4) - '0') * 10) + (str.charAt(i + 5) - '0'));
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c37d52f7", new Object[]{str})).intValue();
        }
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            if (charAt >= 70) {
                return charAt + 1900;
            }
            return charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() == 4) {
                return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
            }
            return 1970;
        }
    }

    public static long parse(String str) throws IllegalArgumentException {
        int i;
        int i2;
        int i3;
        TimeOfDay timeOfDay;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f571fcf8", new Object[]{str})).longValue();
        }
        Matcher matcher = f3846a.matcher(str);
        if (matcher.find()) {
            i = a(matcher.group(1));
            i3 = b(matcher.group(2));
            i2 = d(matcher.group(3));
            timeOfDay = c(matcher.group(4));
        } else {
            Matcher matcher2 = b.matcher(str);
            if (matcher2.find()) {
                i3 = b(matcher2.group(1));
                int a2 = a(matcher2.group(2));
                TimeOfDay c = c(matcher2.group(3));
                i2 = d(matcher2.group(4));
                i = a2;
                timeOfDay = c;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (i2 >= 2038) {
            i6 = 1;
            i5 = 0;
            i4 = 2038;
        } else {
            i6 = i;
            i5 = i3;
            i4 = i2;
        }
        Time time = new Time(pg1.ATOM_EXT_UTC);
        time.set(timeOfDay.second, timeOfDay.minute, timeOfDay.hour, i6, i5, i4);
        return time.toMillis(false);
    }
}
