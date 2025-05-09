package com.taobao.kmp.nexus.arch.openArch.observe;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/observe/OpenArchObservableStateCompareResult;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undetermined", "Equal", "Bigger", "Smaller", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchObservableStateCompareResult extends Enum<OpenArchObservableStateCompareResult> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchObservableStateCompareResult[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final OpenArchObservableStateCompareResult Undetermined = new OpenArchObservableStateCompareResult("Undetermined", 0, 0);
    public static final OpenArchObservableStateCompareResult Equal = new OpenArchObservableStateCompareResult("Equal", 1, 1);
    public static final OpenArchObservableStateCompareResult Bigger = new OpenArchObservableStateCompareResult("Bigger", 2, 2);
    public static final OpenArchObservableStateCompareResult Smaller = new OpenArchObservableStateCompareResult("Smaller", 3, 3);

    private static final /* synthetic */ OpenArchObservableStateCompareResult[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchObservableStateCompareResult[]) ipChange.ipc$dispatch("a4fcf6b4", new Object[0]) : new OpenArchObservableStateCompareResult[]{Undetermined, Equal, Bigger, Smaller};
    }

    static {
        OpenArchObservableStateCompareResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchObservableStateCompareResult(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchObservableStateCompareResult> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchObservableStateCompareResult openArchObservableStateCompareResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/observe/OpenArchObservableStateCompareResult");
    }

    public static OpenArchObservableStateCompareResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchObservableStateCompareResult) ipChange.ipc$dispatch("8cb19da9", new Object[]{str});
        }
        return (OpenArchObservableStateCompareResult) Enum.valueOf(OpenArchObservableStateCompareResult.class, str);
    }

    public static OpenArchObservableStateCompareResult[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchObservableStateCompareResult[]) ipChange.ipc$dispatch("c390cd58", new Object[0]);
        }
        return (OpenArchObservableStateCompareResult[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
