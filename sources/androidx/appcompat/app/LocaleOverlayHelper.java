package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocaleOverlayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private LocaleOverlayHelper() {
    }

    private static LocaleListCompat combineLocales(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("8a672c57", new Object[]{localeListCompat, localeListCompat2});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < localeListCompat.size() + localeListCompat2.size(); i++) {
            if (i < localeListCompat.size()) {
                locale = localeListCompat.get(i);
            } else {
                locale = localeListCompat2.get(i - localeListCompat.size());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("8f13f4f2", new Object[]{localeListCompat, localeListCompat2});
        }
        if (localeListCompat == null || localeListCompat.isEmpty()) {
            return LocaleListCompat.getEmptyLocaleList();
        }
        return combineLocales(localeListCompat, localeListCompat2);
    }

    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleList localeList, LocaleList localeList2) {
        boolean isEmpty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleListCompat) ipChange.ipc$dispatch("e0e028f2", new Object[]{localeList, localeList2});
        }
        if (localeList != null) {
            isEmpty = localeList.isEmpty();
            if (!isEmpty) {
                return combineLocales(LocaleListCompat.wrap(localeList), LocaleListCompat.wrap(localeList2));
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }
}
