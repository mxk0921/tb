package com.taobao.kmp.live.updown;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/live/updown/TaoLiveKtUpDownRequestType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FirstBatch", "NextBatch", "NormalRealtime", "ForceBatch", "AdRealtime", "AutoRealtime", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtUpDownRequestType extends Enum<TaoLiveKtUpDownRequestType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtUpDownRequestType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtUpDownRequestType FirstBatch = new TaoLiveKtUpDownRequestType("FirstBatch", 0, "FirstBatch");
    public static final TaoLiveKtUpDownRequestType NextBatch = new TaoLiveKtUpDownRequestType("NextBatch", 1, "NextBatch");
    public static final TaoLiveKtUpDownRequestType NormalRealtime = new TaoLiveKtUpDownRequestType("NormalRealtime", 2, "NormalRealtime");
    public static final TaoLiveKtUpDownRequestType ForceBatch = new TaoLiveKtUpDownRequestType("ForceBatch", 3, "ForceBatch");
    public static final TaoLiveKtUpDownRequestType AdRealtime = new TaoLiveKtUpDownRequestType("AdRealtime", 4, "AdRealtime");
    public static final TaoLiveKtUpDownRequestType AutoRealtime = new TaoLiveKtUpDownRequestType("AutoRealtime", 5, "AutoRealtime");

    private static final /* synthetic */ TaoLiveKtUpDownRequestType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtUpDownRequestType[]) ipChange.ipc$dispatch("c7cec37d", new Object[0]) : new TaoLiveKtUpDownRequestType[]{FirstBatch, NextBatch, NormalRealtime, ForceBatch, AdRealtime, AutoRealtime};
    }

    static {
        TaoLiveKtUpDownRequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtUpDownRequestType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtUpDownRequestType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtUpDownRequestType taoLiveKtUpDownRequestType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/updown/TaoLiveKtUpDownRequestType");
    }

    public static TaoLiveKtUpDownRequestType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtUpDownRequestType) ipChange.ipc$dispatch("ad17b2b2", new Object[]{str});
        }
        return (TaoLiveKtUpDownRequestType) Enum.valueOf(TaoLiveKtUpDownRequestType.class, str);
    }

    public static TaoLiveKtUpDownRequestType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtUpDownRequestType[]) ipChange.ipc$dispatch("d91f9f21", new Object[0]);
        }
        return (TaoLiveKtUpDownRequestType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
