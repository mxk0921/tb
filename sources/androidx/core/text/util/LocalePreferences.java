package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocalePreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LocalePreferences";
    private static final String[] WEATHER_FAHRENHEIT_COUNTRIES = {"BS", "BZ", "KY", AmnetMonitorLoggerListener.LogModel.PORT_REMOTE, "PW", "US"};

    /* compiled from: Taobao */
    /* renamed from: androidx.core.text.util.LocalePreferences$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle;

        static {
            DateFormat.HourCycle[] values;
            DateFormat.HourCycle hourCycle;
            int ordinal;
            DateFormat.HourCycle hourCycle2;
            int ordinal2;
            DateFormat.HourCycle hourCycle3;
            int ordinal3;
            DateFormat.HourCycle hourCycle4;
            int ordinal4;
            values = DateFormat.HourCycle.values();
            int[] iArr = new int[values.length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle = iArr;
            try {
                hourCycle4 = DateFormat.HourCycle.HOUR_CYCLE_11;
                ordinal4 = hourCycle4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                ordinal3 = hourCycle3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle2 = DateFormat.HourCycle.HOUR_CYCLE_23;
                ordinal2 = hourCycle2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle = DateFormat.HourCycle.HOUR_CYCLE_24;
                ordinal = hourCycle.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static String getCalendarType(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9ffb5d96", new Object[]{locale});
            }
            return Calendar.getInstance(locale).getType();
        }

        public static Locale getDefaultLocale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Locale) ipChange.ipc$dispatch("c6fe88bf", new Object[0]);
            }
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static String getHourCycle(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e61e9738", new Object[]{locale});
            }
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        public static String getResolvedTemperatureUnit(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57d9765a", new Object[]{locale});
            }
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(TemperatureUnit.FAHRENHEIT) ? TemperatureUnit.FAHRENHEIT : identifier;
        }

        private static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d4d9dc1d", new Object[]{hourCycle});
            }
            int i = AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()];
            if (i == 1) {
                return HourCycle.H11;
            }
            if (i == 2) {
                return HourCycle.H12;
            }
            if (i == 3) {
                return HourCycle.H23;
            }
            if (i != 4) {
                return "";
            }
            return HourCycle.H24;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CalendarType {
        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";
        private static final String U_EXTENSION_TAG = "ca";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface CalendarTypes {
        }

        private CalendarType() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FirstDayOfWeek {
        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        private static final String U_EXTENSION_TAG = "fw";
        public static final String WEDNESDAY = "wed";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface Days {
        }

        private FirstDayOfWeek() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HourCycle {
        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";
        private static final String U_EXTENSION_TAG = "hc";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface HourCycleTypes {
        }

        private HourCycle() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TemperatureUnit {
        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";
        private static final String U_EXTENSION_TAG = "mu";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
        }
    }

    private LocalePreferences() {
    }

    private static String getBaseFirstDayOfWeek(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35377226", new Object[]{locale});
        }
        return getStringOfFirstDayOfWeek(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String getBaseHourCycle(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d4a7129", new Object[]{locale});
        }
        if (android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H")) {
            return HourCycle.H23;
        }
        return HourCycle.H12;
    }

    public static String getCalendarType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c43ae1ab", new Object[0]) : getCalendarType(true);
    }

    private static Locale getDefaultLocale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("c6fe88bf", new Object[0]);
        }
        return Locale.getDefault();
    }

    public static String getFirstDayOfWeek() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1cf227cc", new Object[0]) : getFirstDayOfWeek(true);
    }

    public static String getHourCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8709fcd", new Object[0]) : getHourCycle(true);
    }

    private static String getTemperatureHardCoded(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7de40456", new Object[]{locale});
        }
        if (Arrays.binarySearch(WEATHER_FAHRENHEIT_COUNTRIES, locale.getCountry()) >= 0) {
            return TemperatureUnit.FAHRENHEIT;
        }
        return TemperatureUnit.CELSIUS;
    }

    public static String getTemperatureUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95d52557", new Object[0]) : getTemperatureUnit(true);
    }

    private static String getUnicodeLocaleType(String str, String str2, Locale locale, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4dd4bd7", new Object[]{str, str2, locale, new Boolean(z)});
        }
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (!z) {
            return str2;
        }
        return null;
    }

    public static String getCalendarType(Locale locale) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ffb5d96", new Object[]{locale}) : getCalendarType(locale, true);
    }

    public static String getFirstDayOfWeek(Locale locale) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a3bd77", new Object[]{locale}) : getFirstDayOfWeek(locale, true);
    }

    public static String getHourCycle(Locale locale) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e61e9738", new Object[]{locale}) : getHourCycle(locale, true);
    }

    private static String getStringOfFirstDayOfWeek(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fa03e39", new Object[]{new Integer(i)});
        }
        String[] strArr = {FirstDayOfWeek.SUNDAY, FirstDayOfWeek.MONDAY, FirstDayOfWeek.TUESDAY, FirstDayOfWeek.WEDNESDAY, FirstDayOfWeek.THURSDAY, FirstDayOfWeek.FRIDAY, FirstDayOfWeek.SATURDAY};
        if (i < 1 || i > 7) {
            return "";
        }
        return strArr[i - 1];
    }

    public static String getTemperatureUnit(Locale locale) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5248e42", new Object[]{locale}) : getTemperatureUnit(locale, true);
    }

    public static String getCalendarType(boolean z) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("665f78a1", new Object[]{new Boolean(z)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = Api24Impl.getDefaultLocale();
        } else {
            locale = getDefaultLocale();
        }
        return getCalendarType(locale, z);
    }

    public static String getFirstDayOfWeek(boolean z) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2490f6a0", new Object[]{new Boolean(z)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = Api24Impl.getDefaultLocale();
        } else {
            locale = getDefaultLocale();
        }
        return getFirstDayOfWeek(locale, z);
    }

    public static String getHourCycle(boolean z) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8e17ebf", new Object[]{new Boolean(z)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = Api24Impl.getDefaultLocale();
        } else {
            locale = getDefaultLocale();
        }
        return getHourCycle(locale, z);
    }

    public static String getTemperatureUnit(boolean z) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c80daa75", new Object[]{new Boolean(z)});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = Api24Impl.getDefaultLocale();
        } else {
            locale = getDefaultLocale();
        }
        return getTemperatureUnit(locale, z);
    }

    public static String getCalendarType(Locale locale, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ae7a16", new Object[]{locale, new Boolean(z)});
        }
        String unicodeLocaleType = getUnicodeLocaleType("ca", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getCalendarType(locale);
        }
        return z ? CalendarType.GREGORIAN : "";
    }

    public static String getFirstDayOfWeek(Locale locale, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5121655", new Object[]{locale, new Boolean(z)});
        }
        String unicodeLocaleType = getUnicodeLocaleType("fw", "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : getBaseFirstDayOfWeek(locale);
    }

    public static String getHourCycle(Locale locale, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80f274b4", new Object[]{locale, new Boolean(z)});
        }
        String unicodeLocaleType = getUnicodeLocaleType("hc", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getHourCycle(locale);
        }
        return getBaseHourCycle(locale);
    }

    public static String getTemperatureUnit(Locale locale, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82ab5eea", new Object[]{locale, new Boolean(z)});
        }
        String unicodeLocaleType = getUnicodeLocaleType("mu", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getResolvedTemperatureUnit(locale);
        }
        return getTemperatureHardCoded(locale);
    }
}
