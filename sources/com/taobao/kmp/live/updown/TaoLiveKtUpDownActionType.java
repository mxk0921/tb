package com.taobao.kmp.live.updown;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/live/updown/TaoLiveKtUpDownActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RemoveAction", "InsertAction", "ReplaceAction", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtUpDownActionType extends Enum<TaoLiveKtUpDownActionType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtUpDownActionType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtUpDownActionType RemoveAction = new TaoLiveKtUpDownActionType("RemoveAction", 0, "RemoveAction");
    public static final TaoLiveKtUpDownActionType InsertAction = new TaoLiveKtUpDownActionType("InsertAction", 1, "InsertAction");
    public static final TaoLiveKtUpDownActionType ReplaceAction = new TaoLiveKtUpDownActionType("ReplaceAction", 2, "ReplaceAction");

    private static final /* synthetic */ TaoLiveKtUpDownActionType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtUpDownActionType[]) ipChange.ipc$dispatch("82cb11c0", new Object[0]) : new TaoLiveKtUpDownActionType[]{RemoveAction, InsertAction, ReplaceAction};
    }

    static {
        TaoLiveKtUpDownActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtUpDownActionType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtUpDownActionType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtUpDownActionType taoLiveKtUpDownActionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/updown/TaoLiveKtUpDownActionType");
    }

    public static TaoLiveKtUpDownActionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtUpDownActionType) ipChange.ipc$dispatch("bbbce7eb", new Object[]{str});
        }
        return (TaoLiveKtUpDownActionType) Enum.valueOf(TaoLiveKtUpDownActionType.class, str);
    }

    public static TaoLiveKtUpDownActionType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtUpDownActionType[]) ipChange.ipc$dispatch("93de319c", new Object[0]);
        }
        return (TaoLiveKtUpDownActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
