package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/PMSubscribeType;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "PMSubscribeTypeBind", "PMSubscribeTypeUnBind", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PMSubscribeType extends Enum<PMSubscribeType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PMSubscribeType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PMSubscribeType PMSubscribeTypeBind = new PMSubscribeType("PMSubscribeTypeBind", 0, 1);
    public static final PMSubscribeType PMSubscribeTypeUnBind = new PMSubscribeType("PMSubscribeTypeUnBind", 1, 2);
    private final int code;

    private static final /* synthetic */ PMSubscribeType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PMSubscribeType[]) ipChange.ipc$dispatch("30e5d49c", new Object[0]) : new PMSubscribeType[]{PMSubscribeTypeBind, PMSubscribeTypeUnBind};
    }

    static {
        PMSubscribeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PMSubscribeType(String str, int i, int i2) {
        this.code = i2;
    }

    public static fg8<PMSubscribeType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PMSubscribeType pMSubscribeType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/PMSubscribeType");
    }

    public static PMSubscribeType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeType) ipChange.ipc$dispatch("8241e747", new Object[]{str});
        }
        return (PMSubscribeType) Enum.valueOf(PMSubscribeType.class, str);
    }

    public static PMSubscribeType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeType[]) ipChange.ipc$dispatch("53a66e78", new Object[0]);
        }
        return (PMSubscribeType[]) $VALUES.clone();
    }

    public final int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
