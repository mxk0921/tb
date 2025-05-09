package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMSubscribeStatus;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "getCode", "()Ljava/lang/Number;", "PMSubscribeStateWaitBind", "PMSubscribeStateBinding", "PMSubscribeStateBinded", "PMSubscribeStateBindTimeout", "PMSubscribeStateBindError", "PMSubscribeStateUnBinding", "PMSubscribeStateUnBindTimeout", "PMSubscribeStateUnBinded", "PMSubscribeStateUnBindError", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMSubscribeStatus extends Enum<PMSubscribeStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PMSubscribeStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Number code;
    public static final PMSubscribeStatus PMSubscribeStateWaitBind = new PMSubscribeStatus("PMSubscribeStateWaitBind", 0, 1);
    public static final PMSubscribeStatus PMSubscribeStateBinding = new PMSubscribeStatus("PMSubscribeStateBinding", 1, 2);
    public static final PMSubscribeStatus PMSubscribeStateBinded = new PMSubscribeStatus("PMSubscribeStateBinded", 2, 3);
    public static final PMSubscribeStatus PMSubscribeStateBindTimeout = new PMSubscribeStatus("PMSubscribeStateBindTimeout", 3, 4);
    public static final PMSubscribeStatus PMSubscribeStateBindError = new PMSubscribeStatus("PMSubscribeStateBindError", 4, 5);
    public static final PMSubscribeStatus PMSubscribeStateUnBinding = new PMSubscribeStatus("PMSubscribeStateUnBinding", 5, 6);
    public static final PMSubscribeStatus PMSubscribeStateUnBindTimeout = new PMSubscribeStatus("PMSubscribeStateUnBindTimeout", 6, 7);
    public static final PMSubscribeStatus PMSubscribeStateUnBinded = new PMSubscribeStatus("PMSubscribeStateUnBinded", 7, 8);
    public static final PMSubscribeStatus PMSubscribeStateUnBindError = new PMSubscribeStatus("PMSubscribeStateUnBindError", 8, 9);

    private static final /* synthetic */ PMSubscribeStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PMSubscribeStatus[]) ipChange.ipc$dispatch("50890024", new Object[0]) : new PMSubscribeStatus[]{PMSubscribeStateWaitBind, PMSubscribeStateBinding, PMSubscribeStateBinded, PMSubscribeStateBindTimeout, PMSubscribeStateBindError, PMSubscribeStateUnBinding, PMSubscribeStateUnBindTimeout, PMSubscribeStateUnBinded, PMSubscribeStateUnBindError};
    }

    static {
        PMSubscribeStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PMSubscribeStatus(String str, int i, Number number) {
        this.code = number;
    }

    public static fg8<PMSubscribeStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PMSubscribeStatus pMSubscribeStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/PMSubscribeStatus");
    }

    public static PMSubscribeStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeStatus) ipChange.ipc$dispatch("bb2b140f", new Object[]{str});
        }
        return (PMSubscribeStatus) Enum.valueOf(PMSubscribeStatus.class, str);
    }

    public static PMSubscribeStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeStatus[]) ipChange.ipc$dispatch("c58a9300", new Object[0]);
        }
        return (PMSubscribeStatus[]) $VALUES.clone();
    }

    public final Number getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("f339f03e", new Object[]{this});
        }
        return this.code;
    }
}
