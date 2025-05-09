package com.taobao.kmp.nexus.arch.openArch.service.playcontrol.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/context/PlayControlStreamType;", "", "code", "", "<init>", "(Ljava/lang/String;IS)V", "getCode", "()S", pg1.ATOM_EXT_Undefined, "VideoOnDemand", "Live", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PlayControlStreamType extends Enum<PlayControlStreamType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PlayControlStreamType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final short code;
    public static final PlayControlStreamType Undefined = new PlayControlStreamType(pg1.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlStreamType VideoOnDemand = new PlayControlStreamType("VideoOnDemand", 1, 1);
    public static final PlayControlStreamType Live = new PlayControlStreamType("Live", 2, 2);

    private static final /* synthetic */ PlayControlStreamType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PlayControlStreamType[]) ipChange.ipc$dispatch("8a47e0f8", new Object[0]) : new PlayControlStreamType[]{Undefined, VideoOnDemand, Live};
    }

    static {
        PlayControlStreamType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlayControlStreamType(String str, int i, short s) {
        this.code = s;
    }

    public static fg8<PlayControlStreamType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PlayControlStreamType playControlStreamType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/context/PlayControlStreamType");
    }

    public static PlayControlStreamType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlStreamType) ipChange.ipc$dispatch("399e4b23", new Object[]{str});
        }
        return (PlayControlStreamType) Enum.valueOf(PlayControlStreamType.class, str);
    }

    public static PlayControlStreamType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlStreamType[]) ipChange.ipc$dispatch("d48490d4", new Object[0]);
        }
        return (PlayControlStreamType[]) $VALUES.clone();
    }

    public final short getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb167", new Object[]{this})).shortValue();
        }
        return this.code;
    }
}
