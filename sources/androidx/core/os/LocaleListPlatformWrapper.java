package androidx.core.os;

import android.os.LocaleList;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.dah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocaleListPlatformWrapper implements LocaleListInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LocaleList mLocaleList;

    public LocaleListPlatformWrapper(Object obj) {
        this.mLocaleList = dah.a(obj);
    }

    public boolean equals(Object obj) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        equals = this.mLocaleList.equals(((LocaleListInterface) obj).getLocaleList());
        return equals;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("a4938885", new Object[]{this, new Integer(i)});
        }
        locale = this.mLocaleList.get(i);
        return locale;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(String[] strArr) {
        Locale firstMatch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("83e0593e", new Object[]{this, strArr});
        }
        firstMatch = this.mLocaleList.getFirstMatch(strArr);
        return firstMatch;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e29183d", new Object[]{this});
        }
        return this.mLocaleList;
    }

    public int hashCode() {
        int hashCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        hashCode = this.mLocaleList.hashCode();
        return hashCode;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5ba4a38", new Object[]{this, locale})).intValue();
        }
        indexOf = this.mLocaleList.indexOf(locale);
        return indexOf;
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        boolean isEmpty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        isEmpty = this.mLocaleList.isEmpty();
        return isEmpty;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        size = this.mLocaleList.size();
        return size;
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        String languageTags;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a5e0cd", new Object[]{this});
        }
        languageTags = this.mLocaleList.toLanguageTags();
        return languageTags;
    }

    public String toString() {
        String localeList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        localeList = this.mLocaleList.toString();
        return localeList;
    }
}
