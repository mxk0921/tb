package tb;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xvv {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<kut> f31631a = new AtomicReference<>();

    public static long a(long j) {
        Calendar r = r();
        r.setTimeInMillis(j);
        return f(r).getTimeInMillis();
    }

    public static int b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    public static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    public static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    public static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(q());
        return instanceForSkeleton;
    }

    public static Calendar f(Calendar calendar) {
        Calendar s = s(calendar);
        Calendar r = r();
        r.set(s.get(1), s.get(2), s.get(5));
        return r;
    }

    public static java.text.DateFormat g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(o());
        return dateInstance;
    }

    public static java.text.DateFormat h(Locale locale) {
        return g(0, locale);
    }

    public static java.text.DateFormat i(Locale locale) {
        return g(2, locale);
    }

    public static java.text.DateFormat j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) i(locale);
        simpleDateFormat.applyPattern(x(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    public static SimpleDateFormat k(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(o());
        return simpleDateFormat;
    }

    public static SimpleDateFormat l() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(o());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String m(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(R.string.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(R.string.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(R.string.mtrl_picker_text_input_year_abbr));
    }

    public static kut n() {
        kut kutVar = f31631a.get();
        if (kutVar == null) {
            return kut.c;
        }
        return kutVar;
    }

    public static TimeZone o() {
        return TimeZone.getTimeZone(pg1.ATOM_EXT_UTC);
    }

    public static Calendar p() {
        Calendar a2 = n().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(o());
        return a2;
    }

    public static android.icu.util.TimeZone q() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone(pg1.ATOM_EXT_UTC);
        return timeZone;
    }

    public static Calendar r() {
        return s(null);
    }

    public static Calendar s(Calendar calendar) {
        Calendar instance = Calendar.getInstance(o());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static DateFormat t(Locale locale) {
        return e("yMMMd", locale);
    }

    public static DateFormat u(Locale locale) {
        return e("yMMMEd", locale);
    }

    public static SimpleDateFormat v() {
        return w(Locale.getDefault());
    }

    public static SimpleDateFormat w(Locale locale) {
        return k("LLLL, yyyy", locale);
    }

    public static String x(String str) {
        int b = b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
