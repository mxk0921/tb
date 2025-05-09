package com.taobao.tao.flexbox.layoutmanager.filter;

import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import tb.nwv;
import tb.put;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DateFilters {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317243);
    }

    @FilterHandler(name = "countDown")
    public static String countDown(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80362", new Object[]{obj, str});
        }
        return format(Long.valueOf(nwv.y(obj, 0L) - System.currentTimeMillis()), str);
    }

    @FilterHandler(name = "date")
    public static String date(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79e6f6c1", new Object[]{str});
        }
        return new SimpleDateFormat(str).format(new Date(new Date().getTime()));
    }

    @FilterHandler(name = APower.e.KEY_DAY)
    public static int day(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba40a732", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(5);
    }

    @FilterHandler(name = "feedTime")
    public static String feedTime(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("299c6a72", new Object[]{obj});
        }
        return put.a(nwv.y(obj, 0L));
    }

    @FilterHandler(name = "feedtime")
    public static String feedtime(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ca4292", new Object[]{obj});
        }
        return feedTime(obj);
    }

    @FilterHandler(name = "format")
    public static String format(Object obj, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48a0747c", new Object[]{obj, str});
        }
        long y = nwv.y(obj, 0L);
        long j = y / 86400000;
        long j2 = (y % 86400000) / 3600000;
        long j3 = (y % 3600000) / 60000;
        long j4 = (y % 60000) / 1000;
        if (TextUtils.isEmpty(str)) {
            str = "dd HH:mm:ss";
        }
        if (str.indexOf("dd") >= 0) {
            String valueOf = String.valueOf(j);
            if (j <= 9) {
                valueOf = "0" + valueOf;
            }
            str2 = str.replace("dd", valueOf);
        } else {
            str2 = str;
        }
        if (str.indexOf("HH") >= 0) {
            String valueOf2 = String.valueOf(j2);
            if (j2 <= 9) {
                valueOf2 = "0" + valueOf2;
            }
            str2 = str2.replace("HH", valueOf2);
        }
        if (str.indexOf("mm") >= 0) {
            String valueOf3 = String.valueOf(j3);
            if (j3 <= 9) {
                valueOf3 = "0" + valueOf3;
            }
            str2 = str2.replace("mm", valueOf3);
        }
        if (str.indexOf(EnvironmentSwitcher.SPKEY_SS) < 0) {
            return str2;
        }
        String valueOf4 = String.valueOf(j4);
        if (j4 <= 9) {
            valueOf4 = "0" + valueOf4;
        }
        return str2.replace(EnvironmentSwitcher.SPKEY_SS, valueOf4);
    }

    @FilterHandler(name = "hour")
    public static int hour(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d161b37a", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(11);
    }

    @FilterHandler(name = "minute")
    public static int minute(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40551faa", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(12);
    }

    @FilterHandler(name = UiUtil.INPUT_TYPE_VALUE_MONTH)
    public static int month(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfb54316", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(2) + 1;
    }

    @FilterHandler(name = c.LOCATION_SECOND)
    public static int second(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a043b60a", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(13);
    }

    @FilterHandler(name = "timestamp")
    public static long timestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d83291", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    @FilterHandler(name = "toString")
    public static String toString(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba26eba7", new Object[]{obj, str});
        }
        return new SimpleDateFormat(str).format(new Date(nwv.y(obj, 0L)));
    }

    @FilterHandler(name = "year")
    public static int year(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16ce0d13", new Object[]{obj})).intValue();
        }
        long y = nwv.y(obj, 0L);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(y);
        return instance.get(1);
    }

    public static Object a(String str, List list) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            switch (str.hashCode()) {
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1268779017:
                    if (str.equals("format")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1074026988:
                    if (str.equals("minute")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -906279820:
                    if (str.equals(c.LOCATION_SECOND)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -191910517:
                    if (str.equals("feedTime")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -190957205:
                    if (str.equals("feedtime")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 99228:
                    if (str.equals(APower.e.KEY_DAY)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3076014:
                    if (str.equals("date")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3208676:
                    if (str.equals("hour")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3704893:
                    if (str.equals("year")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (str.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 104080000:
                    if (str.equals(UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1351273041:
                    if (str.equals("countDown")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return format(list.get(0), (String) list.get(1));
                case 1:
                case 2:
                    return feedtime(list.get(0));
                case 3:
                    return toString(list.get(0), (String) list.get(1));
                case 4:
                    return date((String) list.get(0));
                case 5:
                    return Long.valueOf(timestamp());
                case 6:
                    return countDown(list.get(0), (String) list.get(1));
                case 7:
                    return Integer.valueOf(year(list.get(0)));
                case '\b':
                    return Integer.valueOf(month(list.get(0)));
                case '\t':
                    return Integer.valueOf(day(list.get(0)));
                case '\n':
                    return Integer.valueOf(hour(list.get(0)));
                case 11:
                    return Integer.valueOf(minute(list.get(0)));
                case '\f':
                    return Integer.valueOf(second(list.get(0)));
                default:
                    return "";
            }
        } catch (Throwable th) {
            tfs.e("date.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
