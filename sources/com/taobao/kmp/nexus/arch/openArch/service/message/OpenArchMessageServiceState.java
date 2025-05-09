package com.taobao.kmp.nexus.arch.openArch.service.message;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/OpenArchMessageServiceState;", "", "<init>", "(Ljava/lang/String;I)V", pg1.ATOM_EXT_Undefined, "Setup", "Shutdown", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageServiceState extends Enum<OpenArchMessageServiceState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchMessageServiceState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final OpenArchMessageServiceState Undefined = new OpenArchMessageServiceState(pg1.ATOM_EXT_Undefined, 0);
    public static final OpenArchMessageServiceState Setup = new OpenArchMessageServiceState("Setup", 1);
    public static final OpenArchMessageServiceState Shutdown = new OpenArchMessageServiceState("Shutdown", 2);

    private static final /* synthetic */ OpenArchMessageServiceState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchMessageServiceState[]) ipChange.ipc$dispatch("c478c29a", new Object[0]) : new OpenArchMessageServiceState[]{Undefined, Setup, Shutdown};
    }

    static {
        OpenArchMessageServiceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchMessageServiceState(String str, int i) {
    }

    public static fg8<OpenArchMessageServiceState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchMessageServiceState openArchMessageServiceState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/OpenArchMessageServiceState");
    }

    public static OpenArchMessageServiceState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageServiceState) ipChange.ipc$dispatch("26c8e905", new Object[]{str});
        }
        return (OpenArchMessageServiceState) Enum.valueOf(OpenArchMessageServiceState.class, str);
    }

    public static OpenArchMessageServiceState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageServiceState[]) ipChange.ipc$dispatch("e67d8776", new Object[0]);
        }
        return (OpenArchMessageServiceState[]) $VALUES.clone();
    }
}
