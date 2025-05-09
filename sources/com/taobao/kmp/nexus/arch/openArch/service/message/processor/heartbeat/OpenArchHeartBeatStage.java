package com.taobao.kmp.nexus.arch.openArch.service.message.processor.heartbeat;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/processor/heartbeat/OpenArchHeartBeatStage;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Start", "Finish", "Normal", "OnPause", "OnResume", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchHeartBeatStage extends Enum<OpenArchHeartBeatStage> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchHeartBeatStage[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final OpenArchHeartBeatStage Start = new OpenArchHeartBeatStage("Start", 0, 0);
    public static final OpenArchHeartBeatStage Finish = new OpenArchHeartBeatStage("Finish", 1, 1);
    public static final OpenArchHeartBeatStage Normal = new OpenArchHeartBeatStage("Normal", 2, 2);
    public static final OpenArchHeartBeatStage OnPause = new OpenArchHeartBeatStage("OnPause", 3, 3);
    public static final OpenArchHeartBeatStage OnResume = new OpenArchHeartBeatStage("OnResume", 4, 4);

    private static final /* synthetic */ OpenArchHeartBeatStage[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchHeartBeatStage[]) ipChange.ipc$dispatch("10458c27", new Object[0]) : new OpenArchHeartBeatStage[]{Start, Finish, Normal, OnPause, OnResume};
    }

    static {
        OpenArchHeartBeatStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchHeartBeatStage(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchHeartBeatStage> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchHeartBeatStage openArchHeartBeatStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/processor/heartbeat/OpenArchHeartBeatStage");
    }

    public static OpenArchHeartBeatStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchHeartBeatStage) ipChange.ipc$dispatch("b2dc625c", new Object[]{str});
        }
        return (OpenArchHeartBeatStage) Enum.valueOf(OpenArchHeartBeatStage.class, str);
    }

    public static OpenArchHeartBeatStage[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchHeartBeatStage[]) ipChange.ipc$dispatch("acfaf3cb", new Object[0]);
        }
        return (OpenArchHeartBeatStage[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
