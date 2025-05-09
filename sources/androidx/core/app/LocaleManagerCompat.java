package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocaleManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static String toLanguageTag(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ff9d1dd", new Object[]{locale});
            }
            return locale.toLanguageTag();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static LocaleListCompat getLocales(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleListCompat) ipChange.ipc$dispatch("7291807c", new Object[]{configuration});
            }
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static LocaleList localeManagerGetApplicationLocales(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("179f7c7d", new Object[]{obj});
            }
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static LocaleList localeManagerGetSystemLocales(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("7eafccd8", new Object[]{obj});
            }
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private LocaleManagerCompat() {
    }

    public static LocaleListCompat getApplicationLocales(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("48403998", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT < 33) {
            return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        if (localeManagerForApplication != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static LocaleListCompat getConfigurationLocales(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("d721be66", new Object[]{configuration});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getLocales(configuration);
        }
        return LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(configuration.locale));
    }

    private static Object getLocaleManagerForApplication(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cc18e395", new Object[]{context});
        }
        return context.getSystemService("locale");
    }

    public static LocaleListCompat getSystemLocales(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("44377663", new Object[]{context});
        }
        LocaleListCompat emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) {
            return getConfigurationLocales(Resources.getSystem().getConfiguration());
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        if (localeManagerForApplication != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication));
        }
        return emptyLocaleList;
    }
}
