package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.core.text.ICUCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.dah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocaleListCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
    private final LocaleListInterface mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Locale[] PSEUDO_LOCALE = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private Api21Impl() {
        }

        public static Locale forLanguageTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Locale) ipChange.ipc$dispatch("e075e061", new Object[]{str});
            }
            return Locale.forLanguageTag(str);
        }

        private static boolean isPseudoLocale(Locale locale) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b6472b42", new Object[]{locale})).booleanValue();
            }
            for (Locale locale2 : PSEUDO_LOCALE) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean matchesLanguageAndScript(Locale locale, Locale locale2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d6722cc", new Object[]{locale, locale2})).booleanValue();
            }
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
                return false;
            }
            String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (!maximizeAndGetScript.isEmpty()) {
                return maximizeAndGetScript.equals(ICUCompat.maximizeAndGetScript(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static LocaleList createLocaleList(Locale... localeArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("74c82fdd", new Object[]{localeArr});
            }
            return new LocaleList(localeArr);
        }

        public static LocaleList getAdjustedDefault() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("e37bcb32", new Object[0]);
            }
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList getDefault() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocaleList) ipChange.ipc$dispatch("4e8e0c00", new Object[0]);
            }
            return LocaleList.getDefault();
        }
    }

    private LocaleListCompat(LocaleListInterface localeListInterface) {
        this.mImpl = localeListInterface;
    }

    public static LocaleListCompat create(Locale... localeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("be1a699d", new Object[]{localeArr});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.createLocaleList(localeArr));
        }
        return new LocaleListCompat(new LocaleListCompatWrapper(localeArr));
    }

    public static LocaleListCompat forLanguageTags(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("845de7c1", new Object[]{str});
        }
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Api21Impl.forLanguageTag(split[i]);
        }
        return create(localeArr);
    }

    public static LocaleListCompat getEmptyLocaleList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("5631890c", new Object[0]);
        }
        return sEmptyLocaleList;
    }

    public static boolean matchesLanguageAndScript(Locale locale, Locale locale2) {
        boolean matchesLanguageAndScript;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d6722cc", new Object[]{locale, locale2})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 33) {
            return Api21Impl.matchesLanguageAndScript(locale, locale2);
        }
        matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
        return matchesLanguageAndScript;
    }

    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocaleListCompat) ipChange.ipc$dispatch("a5847ea3", new Object[]{obj}) : wrap(dah.a(obj));
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof LocaleListCompat) || !this.mImpl.equals(((LocaleListCompat) obj).mImpl)) {
            return false;
        }
        return true;
    }

    public Locale get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("a4938885", new Object[]{this, new Integer(i)});
        }
        return this.mImpl.get(i);
    }

    public Locale getFirstMatch(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("83e0593e", new Object[]{this, strArr});
        }
        return this.mImpl.getFirstMatch(strArr);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.mImpl.hashCode();
    }

    public int indexOf(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5ba4a38", new Object[]{this, locale})).intValue();
        }
        return this.mImpl.indexOf(locale);
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isEmpty();
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mImpl.size();
    }

    public String toLanguageTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a5e0cd", new Object[]{this});
        }
        return this.mImpl.toLanguageTags();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mImpl.toString();
    }

    public Object unwrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6468d308", new Object[]{this});
        }
        return this.mImpl.getLocaleList();
    }

    public static LocaleListCompat getAdjustedDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("ebc4553a", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat getDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("fae5d108", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.getDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat wrap(LocaleList localeList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocaleListCompat) ipChange.ipc$dispatch("ac9296c3", new Object[]{localeList}) : new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public static Locale forLanguageTagCompat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("d5d3fd3f", new Object[]{str});
        }
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }
}
