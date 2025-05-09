package com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlServiceState;", "", "<init>", "(Ljava/lang/String;I)V", "setupService", "haltService", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PlayControlServiceState extends Enum<PlayControlServiceState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PlayControlServiceState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PlayControlServiceState setupService = new PlayControlServiceState("setupService", 0);
    public static final PlayControlServiceState haltService = new PlayControlServiceState("haltService", 1);

    private static final /* synthetic */ PlayControlServiceState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PlayControlServiceState[]) ipChange.ipc$dispatch("725a1ed4", new Object[0]) : new PlayControlServiceState[]{setupService, haltService};
    }

    static {
        PlayControlServiceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlayControlServiceState(String str, int i) {
    }

    public static fg8<PlayControlServiceState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PlayControlServiceState playControlServiceState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlServiceState");
    }

    public static PlayControlServiceState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlServiceState) ipChange.ipc$dispatch("21b088ff", new Object[]{str});
        }
        return (PlayControlServiceState) Enum.valueOf(PlayControlServiceState.class, str);
    }

    public static PlayControlServiceState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlServiceState[]) ipChange.ipc$dispatch("bc96ceb0", new Object[0]);
        }
        return (PlayControlServiceState[]) $VALUES.clone();
    }
}
