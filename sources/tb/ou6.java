package tb;

import android.os.Build;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ou6 {
    public static Pair<String, String> a(Long l, Long l2) {
        return b(l, l2, null);
    }

    public static Pair<String, String> b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return Pair.create(d(l.longValue(), simpleDateFormat), null);
        }
        Calendar p = xvv.p();
        Calendar r = xvv.r();
        r.setTimeInMillis(l.longValue());
        Calendar r2 = xvv.r();
        r2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (r.get(1) != r2.get(1)) {
            return Pair.create(j(l.longValue(), Locale.getDefault()), j(l2.longValue(), Locale.getDefault()));
        } else {
            if (r.get(1) == p.get(1)) {
                return Pair.create(f(l.longValue(), Locale.getDefault()), f(l2.longValue(), Locale.getDefault()));
            }
            return Pair.create(f(l.longValue(), Locale.getDefault()), j(l2.longValue(), Locale.getDefault()));
        }
    }

    public static String c(long j) {
        return d(j, null);
    }

    public static String d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar p = xvv.p();
        Calendar r = xvv.r();
        r.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (p.get(1) == r.get(1)) {
            return e(j);
        }
        return i(j);
    }

    public static String e(long j) {
        return f(j, Locale.getDefault());
    }

    public static String f(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return xvv.j(locale).format(new Date(j));
        }
        format = xvv.c(locale).format(new Date(j));
        return format;
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return xvv.h(locale).format(new Date(j));
        }
        format = xvv.d(locale).format(new Date(j));
        return format;
    }

    public static String i(long j) {
        return j(j, Locale.getDefault());
    }

    public static String j(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return xvv.i(locale).format(new Date(j));
        }
        format = xvv.t(locale).format(new Date(j));
        return format;
    }

    public static String k(long j) {
        return l(j, Locale.getDefault());
    }

    public static String l(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return xvv.h(locale).format(new Date(j));
        }
        format = xvv.u(locale).format(new Date(j));
        return format;
    }
}
