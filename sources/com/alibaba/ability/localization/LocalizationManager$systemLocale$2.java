package com.alibaba.ability.localization;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LocalizationManager$systemLocale$2 extends Lambda implements d1a<Locale> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LocalizationManager$systemLocale$2 INSTANCE = new LocalizationManager$systemLocale$2();

    public LocalizationManager$systemLocale$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(LocalizationManager$systemLocale$2 localizationManager$systemLocale$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/localization/LocalizationManager$systemLocale$2");
    }

    @Override // tb.d1a
    public final Locale invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("43cf0a6c", new Object[]{this});
        }
        Locale locale = Locale.getDefault();
        return locale != null ? locale : Locale.SIMPLIFIED_CHINESE;
    }
}
