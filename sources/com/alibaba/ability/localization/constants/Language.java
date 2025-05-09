package com.alibaba.ability.localization.constants;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum Language {
    SIMPLIFIED_CHINESE("zh", o78.CHINA_MAINLAND, "zh_CN"),
    ENGLISH("en", "US", "en_US"),
    RUSSIAN("ru", "RU", "ru_RU"),
    MALAY("ms", "MY", "ms_MY"),
    THAI("th", "TH", "th_TH");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final String country;
    private final String language;
    private final String tag;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(82837518);
        }

        public a() {
        }

        @JvmStatic
        public final Language a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Language) ipChange.ipc$dispatch("3b752f6e", new Object[]{this, str});
            }
            Language language = Language.ENGLISH;
            if (ckf.b(str, language.getTag())) {
                return language;
            }
            Language language2 = Language.SIMPLIFIED_CHINESE;
            if (ckf.b(str, language2.getTag())) {
                return language2;
            }
            Language language3 = Language.RUSSIAN;
            if (ckf.b(str, language3.getTag())) {
                return language3;
            }
            Language language4 = Language.MALAY;
            if (ckf.b(str, language4.getTag())) {
                return language4;
            }
            Language language5 = Language.THAI;
            if (ckf.b(str, language5.getTag())) {
                return language5;
            }
            return null;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    Language(String str, String str2, String str3) {
        this.language = str;
        this.country = str2;
        this.tag = str3;
    }

    @JvmStatic
    public static final Language cast2Enum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("3b752f6e", new Object[]{str});
        }
        return Companion.a(str);
    }

    public static /* synthetic */ Object ipc$super(Language language, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/localization/constants/Language");
    }

    public static Language valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("fcbe6d22", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(Language.class, str);
        }
        return (Language) valueOf;
    }

    public final boolean compare$Localization_release(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("860943a0", new Object[]{this, locale})).booleanValue();
        }
        if (locale == null || !TextUtils.equals(this.language, locale.getLanguage()) || !TextUtils.equals(this.country, locale.getCountry())) {
            return false;
        }
        return true;
    }

    public final String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[]{this});
        }
        return this.country;
    }

    public final String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this});
        }
        return this.language;
    }

    public final String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.tag;
    }
}
