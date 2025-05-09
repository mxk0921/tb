package com.huawei.hms.push.utils;

import com.huawei.hms.support.log.HMSLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DateUtil {
    private DateUtil() {
    }

    public static long parseUtcToMillisecond(String str) throws ParseException, StringIndexOutOfBoundsException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(pg1.ATOM_EXT_UTC));
        String substring = str.substring(0, str.indexOf("."));
        String substring2 = str.substring(str.indexOf("."));
        return simpleDateFormat.parse(substring + (substring2.substring(0, 4) + "Z")).getTime();
    }

    public static String parseMilliSecondToString(Long l) {
        if (l == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(l);
        } catch (Exception e) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e);
            return null;
        }
    }
}
