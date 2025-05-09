package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/ContainerType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "KSerial", "KParallel", "KMain", "KGlobal", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ContainerType extends Enum<ContainerType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ ContainerType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final ContainerType KSerial = new ContainerType("KSerial", 0, 0);
    public static final ContainerType KParallel = new ContainerType("KParallel", 1, 1);
    public static final ContainerType KMain = new ContainerType("KMain", 2, 2);
    public static final ContainerType KGlobal = new ContainerType("KGlobal", 3, 3);

    private static final /* synthetic */ ContainerType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContainerType[]) ipChange.ipc$dispatch("7ad4d0eb", new Object[0]) : new ContainerType[]{KSerial, KParallel, KMain, KGlobal};
    }

    static {
        ContainerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContainerType(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<ContainerType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(ContainerType containerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/ContainerType");
    }

    public static ContainerType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerType) ipChange.ipc$dispatch("240c35d6", new Object[]{str});
        }
        return (ContainerType) Enum.valueOf(ContainerType.class, str);
    }

    public static ContainerType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerType[]) ipChange.ipc$dispatch("3aa637c7", new Object[0]);
        }
        return (ContainerType[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
