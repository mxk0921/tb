package tb;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g84 {
    public static String a(int i) {
        if (i == 0) {
            return b();
        }
        return b() + "-" + i + "-" + (Calendar.getInstance().get(11) / i);
    }

    public static String b() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
