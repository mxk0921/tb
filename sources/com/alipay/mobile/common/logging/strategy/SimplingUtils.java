package com.alipay.mobile.common.logging.strategy;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import java.util.TimeZone;
import tb.wqx;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimplingUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SimplingUtils";
    public static final int maxRate = 1000;

    public static long getCurrentDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6081754", new Object[0])).longValue();
        }
        return ((((Calendar.getInstance(TimeZone.getTimeZone(wqx.SHANGHAI_ZONE_ID_NAME)).getTimeInMillis() + 28800000) / 1000) / 60) / 60) / 24;
    }

    public static int getOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23114566", new Object[]{new Integer(i)})).intValue();
        }
        return ((int) (getCurrentDay() % (1000 / i))) * i;
    }

    public static boolean isHitTest(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4181258f", new Object[]{new Integer(i), str})).booleanValue();
        }
        if (LoggingUtil.isOfflineMode()) {
            return true;
        }
        int i2 = 999;
        if (i > 999 || i < 0) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && str.length() >= 2) {
            try {
                i2 = ((int) IntUtil.a(str.substring(str.length() - 2, str.length()))) % 1000;
            } catch (Throwable unused) {
                i2 = 0;
            }
        }
        if ((i2 + getOffset(i)) % 1000 < i) {
            return true;
        }
        return false;
    }
}
