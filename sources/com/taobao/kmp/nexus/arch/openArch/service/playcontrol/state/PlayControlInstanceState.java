package com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlInstanceState;", "", "state", "", "Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/TPlayControlInstanceState;", "<init>", "(Ljava/lang/String;II)V", "getState", "()I", pg1.ATOM_EXT_Undefined, "InitInstance", "InitPlayerControl", "LoadContext", "PerformUIAction", "ComponentLoaded", "PerformPlayerAction", "DestroyInstance", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PlayControlInstanceState extends Enum<PlayControlInstanceState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PlayControlInstanceState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int state;
    public static final PlayControlInstanceState Undefined = new PlayControlInstanceState(pg1.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlInstanceState InitInstance = new PlayControlInstanceState("InitInstance", 1, 1);
    public static final PlayControlInstanceState InitPlayerControl = new PlayControlInstanceState("InitPlayerControl", 2, 2);
    public static final PlayControlInstanceState LoadContext = new PlayControlInstanceState("LoadContext", 3, 4);
    public static final PlayControlInstanceState PerformUIAction = new PlayControlInstanceState("PerformUIAction", 4, 8);
    public static final PlayControlInstanceState ComponentLoaded = new PlayControlInstanceState("ComponentLoaded", 5, 16);
    public static final PlayControlInstanceState PerformPlayerAction = new PlayControlInstanceState("PerformPlayerAction", 6, 32);
    public static final PlayControlInstanceState DestroyInstance = new PlayControlInstanceState("DestroyInstance", 7, 64);

    private static final /* synthetic */ PlayControlInstanceState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PlayControlInstanceState[]) ipChange.ipc$dispatch("b489cf6a", new Object[0]) : new PlayControlInstanceState[]{Undefined, InitInstance, InitPlayerControl, LoadContext, PerformUIAction, ComponentLoaded, PerformPlayerAction, DestroyInstance};
    }

    static {
        PlayControlInstanceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlayControlInstanceState(String str, int i, int i2) {
        this.state = i2;
    }

    public static fg8<PlayControlInstanceState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PlayControlInstanceState playControlInstanceState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlInstanceState");
    }

    public static PlayControlInstanceState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlInstanceState) ipChange.ipc$dispatch("f000aa9f", new Object[]{str});
        }
        return (PlayControlInstanceState) Enum.valueOf(PlayControlInstanceState.class, str);
    }

    public static PlayControlInstanceState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlInstanceState[]) ipChange.ipc$dispatch("b1e31b0e", new Object[0]);
        }
        return (PlayControlInstanceState[]) $VALUES.clone();
    }

    public final int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }
}
