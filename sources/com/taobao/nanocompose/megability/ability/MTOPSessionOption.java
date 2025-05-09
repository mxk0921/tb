package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/MTOPSessionOption;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "AUTO_LOGIN_ONLY", "AUTO_LOGIN_AND_MANUAL_LOGIN", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTOPSessionOption extends Enum<MTOPSessionOption> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ MTOPSessionOption[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final MTOPSessionOption AUTO_LOGIN_ONLY = new MTOPSessionOption("AUTO_LOGIN_ONLY", 0, "AUTO_LOGIN_ONLY");
    public static final MTOPSessionOption AUTO_LOGIN_AND_MANUAL_LOGIN = new MTOPSessionOption("AUTO_LOGIN_AND_MANUAL_LOGIN", 1, "AUTO_LOGIN_AND_MANUAL_LOGIN");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361758);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ MTOPSessionOption[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTOPSessionOption[]) ipChange.ipc$dispatch("6bfeb2e7", new Object[0]) : new MTOPSessionOption[]{AUTO_LOGIN_ONLY, AUTO_LOGIN_AND_MANUAL_LOGIN};
    }

    static {
        MTOPSessionOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MTOPSessionOption(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<MTOPSessionOption> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(MTOPSessionOption mTOPSessionOption, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/MTOPSessionOption");
    }

    public static MTOPSessionOption valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPSessionOption) ipChange.ipc$dispatch("2042a65c", new Object[]{str});
        }
        return (MTOPSessionOption) Enum.valueOf(MTOPSessionOption.class, str);
    }

    public static MTOPSessionOption[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPSessionOption[]) ipChange.ipc$dispatch("197d438b", new Object[0]);
        }
        return (MTOPSessionOption[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
