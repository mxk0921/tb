package com.taobao.message.kit.util;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TimeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CACHE_SIZE = 500;
    public static final String FORMAT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_WEEK = 604800000;
    public static final long ONE_YEAR = 31536000000L;
    private static final int SECONDS_OFFSET = 3;
    private static final int SUNDAY_OFFSET = -6;
    public static final int TIME_STATUS_BEFORE_WEEK = -3;
    public static final int TIME_STATUS_FUTURE = 1;
    public static final int TIME_STATUS_THIS_WEEK = -2;
    public static final int TIME_STATUS_TODAY = 0;
    public static final int TIME_STATUS_YESTERDAY = -1;
    private static final LruCache<String, String> mpFormatTimeCache = new LruCache<>(500);
    private static final Object cacheLock = new Object();

    static {
        t2o.a(529531017);
    }

    private static String convertHourAndMinus(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad91f229", new Object[]{new Integer(i), new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder(8);
        if (i < 10) {
            sb.append('0');
        }
        sb.append(i);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        return sb.toString();
    }

    public static String formatForeignTime(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("745c98ed", new Object[]{new Long(j)}) : formatForeignTime(j, true);
    }

    public static String formatTimeForMsgCenterCategory(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bfab3f2", new Object[]{new Long(j)}) : formatTimeForMsgCenterCategory(j, false);
    }

    private static String formatTodayTime(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8e98d2", new Object[]{new Long(j), new Boolean(z)});
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (!z) {
            return convertHourAndMinus(instance.get(11), instance.get(12));
        }
        String str = j + APower.e.KEY_DAY;
        synchronized (cacheLock) {
            try {
                LruCache<String, String> lruCache = mpFormatTimeCache;
                String str2 = lruCache.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                String convertHourAndMinus = convertHourAndMinus(instance.get(11), instance.get(12));
                lruCache.put(str, convertHourAndMinus);
                return convertHourAndMinus;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String formatWeekTime(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc692131", new Object[]{new Long(j), new Boolean(z)});
        }
        if (!z) {
            return getWeekOfTime(j);
        }
        String str = j + "week";
        synchronized (cacheLock) {
            try {
                LruCache<String, String> lruCache = mpFormatTimeCache;
                String str2 = lruCache.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                String weekOfTime = getWeekOfTime(j);
                lruCache.put(str, weekOfTime);
                return weekOfTime;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long getCurDay0ClockInMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2bd756", new Object[0])).longValue();
        }
        return getDayClockInMillis(Calendar.getInstance(Locale.getDefault()), 0);
    }

    public static long getCurDayByHourClockInMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7d19d84", new Object[]{new Integer(i)})).longValue();
        }
        if (i >= 0 && i <= 23) {
            return getDayClockInMillis(Calendar.getInstance(Locale.getDefault()), i);
        }
        throw new IllegalArgumentException("小时必须在0到23之间");
    }

    private static long getDayClockInMillis(Calendar calendar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caea784c", new Object[]{calendar, new Integer(i)})).longValue();
        }
        calendar.set(11, i);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private static String getDefaultFormatDate(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("864caf79", new Object[]{new Long(j), new Boolean(z)});
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (!z) {
            return getFormatDate(instance);
        }
        String str = j + "default";
        synchronized (cacheLock) {
            try {
                LruCache<String, String> lruCache = mpFormatTimeCache;
                String str2 = lruCache.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                String formatDate = getFormatDate(instance);
                lruCache.put(str, formatDate);
                return formatDate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long getFirstDayOfWeek(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21fc81e4", new Object[]{new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i2 = instance.get(7);
        if (i2 == 1) {
            i = -6;
        } else {
            i = 2 - i2;
        }
        instance.add(5, i);
        return instance.getTimeInMillis();
    }

    private static String getFormatDate(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7bcbfed", new Object[]{calendar});
        }
        if (DisplayUtil.isSimplifiedChinese()) {
            return DateFormatUtil.formatDate2(calendar.getTime());
        }
        return DisplayUtil.cldrFormatDate(calendar.getTimeInMillis());
    }

    private static long[] getTimeBaseInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("2dc0b2fc", new Object[0]);
        }
        long currentTimeStamp = AmpTimeStampManager.instance().getCurrentTimeStamp() + 3000;
        return new long[]{currentTimeStamp, currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 86400000)};
    }

    public static String getWeekOfTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ca32ef1", new Object[]{new Long(j)});
        }
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        switch (instance.get(7)) {
            case 1:
                return DisplayUtil.localizedString(R.string.mp_Sunday);
            case 2:
                return DisplayUtil.localizedString(R.string.mp_Monday);
            case 3:
                return DisplayUtil.localizedString(R.string.mp_Tuesday);
            case 4:
                return DisplayUtil.localizedString(R.string.mp_Wednesday);
            case 5:
                return DisplayUtil.localizedString(R.string.mp_Thursday);
            case 6:
                return DisplayUtil.localizedString(R.string.mp_Friday);
            case 7:
                return DisplayUtil.localizedString(R.string.mp_Saturday);
            default:
                return "";
        }
    }

    public static String formatForeignTime(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba74a99f", new Object[]{new Long(j), new Boolean(z)});
        }
        if (j <= 0) {
            return null;
        }
        long[] timeBaseInfo = getTimeBaseInfo();
        long j2 = timeBaseInfo[0];
        long j3 = timeBaseInfo[1];
        if (j2 < j) {
            return z ? DisplayUtil.cldrFormatDate(j) : DisplayUtil.cldrFormatDateTime(j);
        }
        if (j >= j3) {
            return DisplayUtil.cldrFormatTime(j);
        }
        return z ? DisplayUtil.cldrFormatDate(j) : DisplayUtil.cldrFormatDateTime(j);
    }

    public static String formatTimeForMsgCenterCategory(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d699ef3a", new Object[]{new Long(j), new Boolean(z)});
        }
        if (j <= 0) {
            return null;
        }
        if (!DisplayUtil.isSimplifiedChinese()) {
            return formatForeignTime(j);
        }
        long[] timeBaseInfo = getTimeBaseInfo();
        long j2 = timeBaseInfo[0];
        long j3 = timeBaseInfo[1];
        if (j2 < j) {
            return getDefaultFormatDate(j, z);
        }
        if (j >= j3) {
            return formatTodayTime(j, z);
        }
        if (j3 - j < 86400000) {
            return DisplayUtil.localizedString(R.string.mp_yesterday);
        }
        if (j > j3 - 604800000) {
            return formatWeekTime(j, z);
        }
        return getDefaultFormatDate(j, z);
    }

    public static int isToday(long j) throws ParseException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eca64139", new Object[]{new Long(j)})).intValue();
        }
        if (j <= 0) {
            return -3;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        long time = simpleDateFormat.parse(simpleDateFormat.format(new Date())).getTime();
        long j2 = time - j;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i <= 0) {
            return (i > 0 || j - time > 86400000) ? 1 : 0;
        }
        if (j2 <= 86400000) {
            return -1;
        }
        return j - getFirstDayOfWeek(time) > 0 ? -2 : -3;
    }
}
