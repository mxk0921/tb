package com.taobao.kmp.nexus.arch.openArch.dto_and_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/CoreDataRequestState;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "CoreDataRequestNone", "CoreDataRequestIsRequesting", "CoreDataRequestIsFinished", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CoreDataRequestState extends Enum<CoreDataRequestState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ CoreDataRequestState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    public static final CoreDataRequestState CoreDataRequestNone = new CoreDataRequestState("CoreDataRequestNone", 0, 1);
    public static final CoreDataRequestState CoreDataRequestIsRequesting = new CoreDataRequestState("CoreDataRequestIsRequesting", 1, 2);
    public static final CoreDataRequestState CoreDataRequestIsFinished = new CoreDataRequestState("CoreDataRequestIsFinished", 2, 3);

    private static final /* synthetic */ CoreDataRequestState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CoreDataRequestState[]) ipChange.ipc$dispatch("afd3dd54", new Object[0]) : new CoreDataRequestState[]{CoreDataRequestNone, CoreDataRequestIsRequesting, CoreDataRequestIsFinished};
    }

    static {
        CoreDataRequestState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CoreDataRequestState(String str, int i, int i2) {
        this.code = i2;
    }

    public static fg8<CoreDataRequestState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(CoreDataRequestState coreDataRequestState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/CoreDataRequestState");
    }

    public static CoreDataRequestState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoreDataRequestState) ipChange.ipc$dispatch("71b20c3f", new Object[]{str});
        }
        return (CoreDataRequestState) Enum.valueOf(CoreDataRequestState.class, str);
    }

    public static CoreDataRequestState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoreDataRequestState[]) ipChange.ipc$dispatch("ae140c30", new Object[0]);
        }
        return (CoreDataRequestState[]) $VALUES.clone();
    }

    public final int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
