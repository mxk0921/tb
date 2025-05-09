package tb;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kut {
    public static final kut c = new kut(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f22938a;
    public final TimeZone b;

    public kut(Long l, TimeZone timeZone) {
        this.f22938a = l;
        this.b = timeZone;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f22938a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
