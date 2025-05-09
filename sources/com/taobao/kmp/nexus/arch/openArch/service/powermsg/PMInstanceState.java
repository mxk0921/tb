package com.taobao.kmp.nexus.arch.openArch.service.powermsg;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.pg1;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/PMInstanceState;", "", "", "state", "<init>", "(Ljava/lang/String;II)V", TLogTracker.LEVEL_INFO, "getState", "()I", "Companion", "a", pg1.ATOM_EXT_Undefined, "SetupCompleted", "ShutdownCompleted", "Subscribed", "Unsubscribed", "AboutToSubscribe", "AboutToUnsubscribe", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMInstanceState extends Enum<PMInstanceState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PMInstanceState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int state;
    public static final PMInstanceState Undefined = new PMInstanceState(pg1.ATOM_EXT_Undefined, 0, 0);
    public static final PMInstanceState SetupCompleted = new PMInstanceState("SetupCompleted", 1, 1);
    public static final PMInstanceState ShutdownCompleted = new PMInstanceState("ShutdownCompleted", 2, 2);
    public static final PMInstanceState Subscribed = new PMInstanceState("Subscribed", 3, 3);
    public static final PMInstanceState Unsubscribed = new PMInstanceState("Unsubscribed", 4, 4);
    public static final PMInstanceState AboutToSubscribe = new PMInstanceState("AboutToSubscribe", 5, -1);
    public static final PMInstanceState AboutToUnsubscribe = new PMInstanceState("AboutToUnsubscribe", 6, -2);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536657);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ PMInstanceState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PMInstanceState[]) ipChange.ipc$dispatch("ce962435", new Object[0]) : new PMInstanceState[]{Undefined, SetupCompleted, ShutdownCompleted, Subscribed, Unsubscribed, AboutToSubscribe, AboutToUnsubscribe};
    }

    static {
        PMInstanceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PMInstanceState(String str, int i, int i2) {
        this.state = i2;
    }

    public static fg8<PMInstanceState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PMInstanceState pMInstanceState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/powermsg/PMInstanceState");
    }

    public static PMInstanceState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMInstanceState) ipChange.ipc$dispatch("487dd2aa", new Object[]{str});
        }
        return (PMInstanceState) Enum.valueOf(PMInstanceState.class, str);
    }

    public static PMInstanceState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMInstanceState[]) ipChange.ipc$dispatch("985bd0d9", new Object[0]);
        }
        return (PMInstanceState[]) $VALUES.clone();
    }

    public final int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }
}
