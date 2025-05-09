package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgMsgFetchMode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "PUSH_ONLY", "PULL_ONLY", "PUSH_AND_PULL", "PULL_EXT", "PULL_WHEN_DISCONNECT", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgMsgFetchMode extends Enum<KSPowerMsgMsgFetchMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSPowerMsgMsgFetchMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final KSPowerMsgMsgFetchMode PUSH_ONLY = new KSPowerMsgMsgFetchMode("PUSH_ONLY", 0, "PUSH_ONLY");
    public static final KSPowerMsgMsgFetchMode PULL_ONLY = new KSPowerMsgMsgFetchMode("PULL_ONLY", 1, "PULL_ONLY");
    public static final KSPowerMsgMsgFetchMode PUSH_AND_PULL = new KSPowerMsgMsgFetchMode("PUSH_AND_PULL", 2, "PUSH_AND_PULL");
    public static final KSPowerMsgMsgFetchMode PULL_EXT = new KSPowerMsgMsgFetchMode("PULL_EXT", 3, "PULL_EXT");
    public static final KSPowerMsgMsgFetchMode PULL_WHEN_DISCONNECT = new KSPowerMsgMsgFetchMode("PULL_WHEN_DISCONNECT", 4, "PULL_WHEN_DISCONNECT");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438920);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ KSPowerMsgMsgFetchMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSPowerMsgMsgFetchMode[]) ipChange.ipc$dispatch("81b1ad68", new Object[0]) : new KSPowerMsgMsgFetchMode[]{PUSH_ONLY, PULL_ONLY, PUSH_AND_PULL, PULL_EXT, PULL_WHEN_DISCONNECT};
    }

    static {
        KSPowerMsgMsgFetchMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KSPowerMsgMsgFetchMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<KSPowerMsgMsgFetchMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSPowerMsgMsgFetchMode kSPowerMsgMsgFetchMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPowerMsgMsgFetchMode");
    }

    public static KSPowerMsgMsgFetchMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgMsgFetchMode) ipChange.ipc$dispatch("34c6979d", new Object[]{str});
        }
        return (KSPowerMsgMsgFetchMode) Enum.valueOf(KSPowerMsgMsgFetchMode.class, str);
    }

    public static KSPowerMsgMsgFetchMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgMsgFetchMode[]) ipChange.ipc$dispatch("c9cea50c", new Object[0]);
        }
        return (KSPowerMsgMsgFetchMode[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
