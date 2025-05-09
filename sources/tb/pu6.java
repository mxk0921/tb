package tb;

import com.alibaba.fastjson2.time.DateTimeFormatter;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class pu6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26308a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Locale h;
    public final boolean i;
    public final boolean j;
    public DateTimeFormatter k;

    public pu6(String str) {
        this(str, null);
    }

    public DateTimeFormatter H() {
        String str;
        if (this.k == null && (str = this.f26308a) != null && !this.c && !this.d && !this.b) {
            Locale locale = this.h;
            if (locale == null) {
                this.k = DateTimeFormatter.e(str);
            } else {
                this.k = DateTimeFormatter.f(str, locale);
            }
        }
        return this.k;
    }

    public DateTimeFormatter I(Locale locale) {
        String str = this.f26308a;
        if (str == null || this.c || this.d || this.b) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = this.k;
        Locale locale2 = this.h;
        if (dateTimeFormatter != null && ((locale2 == null && (locale == null || locale == Locale.getDefault())) || (locale2 != null && locale2.equals(locale)))) {
            return this.k;
        }
        if (locale != null) {
            DateTimeFormatter f = DateTimeFormatter.f(str, locale);
            this.k = f;
            return f;
        } else if (locale2 == null) {
            DateTimeFormatter e = DateTimeFormatter.e(str);
            this.k = e;
            return e;
        } else {
            DateTimeFormatter f2 = DateTimeFormatter.f(str, locale2);
            this.k = f2;
            return f2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public pu6(String str, Locale locale) {
        boolean z;
        boolean z2;
        char c;
        boolean z3 = true;
        boolean z4 = false;
        str = str != null ? str.replaceAll("aa", "a") : str;
        this.f26308a = str;
        this.h = locale;
        this.i = "yyyy-MM-dd HH:mm:ss".equals(str);
        this.j = "yyyy-MM-dd HH:mm".equals(str);
        if (str != null) {
            switch (str.hashCode()) {
                case -1074095546:
                    if (str.equals("millis")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -288020395:
                    if (str.equals("unixtime")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2095190916:
                    if (str.equals("iso8601")) {
                        c = 2;
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
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                    z3 = false;
                    break;
                case 1:
                    z = false;
                    z2 = false;
                    z3 = false;
                    break;
                case 2:
                    z = true;
                    break;
                default:
                    z2 = str.indexOf(100) != -1;
                    if (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) {
                        z3 = false;
                    }
                    z = false;
                    z3 = false;
                    break;
            }
            this.b = z3;
            this.c = z4;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = "yyyyMMddHHmmssSSSZ".equals(str);
        }
        z = false;
        z2 = false;
        z3 = false;
        z3 = false;
        this.b = z3;
        this.c = z4;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = "yyyyMMddHHmmssSSSZ".equals(str);
    }
}
