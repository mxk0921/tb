package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/LocalizationLanguage;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "zh_CN", "en_US", "ru_RU", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LocalizationLanguage extends Enum<LocalizationLanguage> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ LocalizationLanguage[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final LocalizationLanguage zh_CN = new LocalizationLanguage("zh_CN", 0, "zh_CN");
    public static final LocalizationLanguage en_US = new LocalizationLanguage("en_US", 1, "en_US");
    public static final LocalizationLanguage ru_RU = new LocalizationLanguage("ru_RU", 2, "ru_RU");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361731);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ LocalizationLanguage[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalizationLanguage[]) ipChange.ipc$dispatch("9e8bf6bb", new Object[0]) : new LocalizationLanguage[]{zh_CN, en_US, ru_RU};
    }

    static {
        LocalizationLanguage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LocalizationLanguage(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<LocalizationLanguage> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(LocalizationLanguage localizationLanguage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/LocalizationLanguage");
    }

    public static LocalizationLanguage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalizationLanguage) ipChange.ipc$dispatch("4e145326", new Object[]{str});
        }
        return (LocalizationLanguage) Enum.valueOf(LocalizationLanguage.class, str);
    }

    public static LocalizationLanguage[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalizationLanguage[]) ipChange.ipc$dispatch("5a0df397", new Object[0]);
        }
        return (LocalizationLanguage[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
