package com.taobao.kmp.nexus.arch.openArch.channel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/channel/OpenArchChannelName;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OpenArchChannelGetPowermsgHeartbeatInfo", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchChannelName extends Enum<OpenArchChannelName> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchChannelName[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final OpenArchChannelName OpenArchChannelGetPowermsgHeartbeatInfo = new OpenArchChannelName("OpenArchChannelGetPowermsgHeartbeatInfo", 0, 1);
    private final int value;

    private static final /* synthetic */ OpenArchChannelName[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchChannelName[]) ipChange.ipc$dispatch("e080b3b9", new Object[0]) : new OpenArchChannelName[]{OpenArchChannelGetPowermsgHeartbeatInfo};
    }

    static {
        OpenArchChannelName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchChannelName(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchChannelName> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchChannelName openArchChannelName, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/channel/OpenArchChannelName");
    }

    public static OpenArchChannelName valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchChannelName) ipChange.ipc$dispatch("90091024", new Object[]{str});
        }
        return (OpenArchChannelName) Enum.valueOf(OpenArchChannelName.class, str);
    }

    public static OpenArchChannelName[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchChannelName[]) ipChange.ipc$dispatch("9c02b095", new Object[0]);
        }
        return (OpenArchChannelName[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
