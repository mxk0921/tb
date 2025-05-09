package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ConfigurationCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static LocaleList getLocales(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("1a4e4974", new Object[]{configuration});
            }
            return configuration.getLocales();
        }

        public static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85396334", new Object[]{configuration, localeListCompat});
            } else {
                configuration.setLocales((LocaleList) localeListCompat.unwrap());
            }
        }
    }

    private ConfigurationCompat() {
    }

    public static LocaleListCompat getLocales(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("7291807c", new Object[]{configuration});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
        }
        return LocaleListCompat.create(configuration.locale);
    }

    public static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85396334", new Object[]{configuration, localeListCompat});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setLocales(configuration, localeListCompat);
        } else if (!localeListCompat.isEmpty()) {
            configuration.setLocale(localeListCompat.get(0));
        }
    }
}
