package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/AppEditionHomeVersion;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "standard_version", "new_user_standard_version", "elder_version", "new_user_minimalist_version", "children_version", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class AppEditionHomeVersion extends Enum<AppEditionHomeVersion> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ AppEditionHomeVersion[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final AppEditionHomeVersion standard_version = new AppEditionHomeVersion("standard_version", 0, "standard_version");
    public static final AppEditionHomeVersion new_user_standard_version = new AppEditionHomeVersion("new_user_standard_version", 1, "new_user_standard_version");
    public static final AppEditionHomeVersion elder_version = new AppEditionHomeVersion("elder_version", 2, "elder_version");
    public static final AppEditionHomeVersion new_user_minimalist_version = new AppEditionHomeVersion("new_user_minimalist_version", 3, "new_user_minimalist_version");
    public static final AppEditionHomeVersion children_version = new AppEditionHomeVersion("children_version", 4, "children_version");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361611);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ AppEditionHomeVersion[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppEditionHomeVersion[]) ipChange.ipc$dispatch("68d29a0e", new Object[0]) : new AppEditionHomeVersion[]{standard_version, new_user_standard_version, elder_version, new_user_minimalist_version, children_version};
    }

    static {
        AppEditionHomeVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AppEditionHomeVersion(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<AppEditionHomeVersion> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(AppEditionHomeVersion appEditionHomeVersion, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/AppEditionHomeVersion");
    }

    public static AppEditionHomeVersion valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppEditionHomeVersion) ipChange.ipc$dispatch("aa55cb03", new Object[]{str});
        }
        return (AppEditionHomeVersion) Enum.valueOf(AppEditionHomeVersion.class, str);
    }

    public static AppEditionHomeVersion[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppEditionHomeVersion[]) ipChange.ipc$dispatch("1d9038b2", new Object[0]);
        }
        return (AppEditionHomeVersion[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
