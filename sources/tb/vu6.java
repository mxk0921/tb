package tb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vu6 {
    public static Calendar a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyyMMddHHmmss");
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

    static {
        t2o.a(693108794);
        new SimpleDateFormat("yyyy-MM-dd");
        new SimpleDateFormat("yyyy.MM");
    }
}
