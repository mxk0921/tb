package com.taobao.message.notification.util;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Calendar;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TimeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_WEEK = 604800000;
    public static final long ONE_YEAR = 31536000000L;
    private static long lastClickTime = 0;

    static {
        t2o.a(610271348);
    }

    public static String formatTimeForInnerNotification(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f383503f", new Object[]{new Long(j)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        long j2 = currentTimeMillis - j;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            return instance.get(1) + "/" + (instance.get(2) + 1) + "/" + instance.get(5);
        } else if (i >= 0 && j2 < 60000) {
            return Localization.q(R.string.mp_notification_now);
        } else {
            if (j2 >= 60000 && j2 < 3600000) {
                return (j2 / 60000) + Localization.q(R.string.mp_notification_minutes_ago);
            } else if (j2 < 3600000 || j2 >= 86400000) {
                return instance.get(1) + "/" + (instance.get(2) + 1) + "/" + instance.get(5);
            } else {
                return (j2 / 3600000) + Localization.q(R.string.mp_notification_hours_ago);
            }
        }
    }

    public static boolean isFastDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57bf07bc", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < 500) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }
}
