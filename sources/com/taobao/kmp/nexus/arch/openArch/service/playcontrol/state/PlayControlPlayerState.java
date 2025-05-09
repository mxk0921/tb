package com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.esu;
import tb.fg8;
import tb.ied;
import tb.pg1;
import tb.prp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlPlayerState;", "", "state", "", "<init>", "(Ljava/lang/String;II)V", "getState", "()I", pg1.ATOM_EXT_Undefined, ied.PULL_INIT, "Prepared", "Play", "Stop", prp.CARD_MISS_VIDEO_STATUS_PAUSE, esu.KEY_RESUME, "Seek", "Error", "Stalled", "InfoReport", "ProgressReport", "Playing", "PreparedFinished", "Pausing", "Completed", "LoopCompleted", "Destroy", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PlayControlPlayerState extends Enum<PlayControlPlayerState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PlayControlPlayerState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int state;
    public static final PlayControlPlayerState Undefined = new PlayControlPlayerState(pg1.ATOM_EXT_Undefined, 0, 0);
    public static final PlayControlPlayerState Init = new PlayControlPlayerState(ied.PULL_INIT, 1, 1);
    public static final PlayControlPlayerState Prepared = new PlayControlPlayerState("Prepared", 2, 2);
    public static final PlayControlPlayerState Play = new PlayControlPlayerState("Play", 3, 3);
    public static final PlayControlPlayerState Stop = new PlayControlPlayerState("Stop", 4, 4);
    public static final PlayControlPlayerState Pause = new PlayControlPlayerState(prp.CARD_MISS_VIDEO_STATUS_PAUSE, 5, 5);
    public static final PlayControlPlayerState Resume = new PlayControlPlayerState(esu.KEY_RESUME, 6, 6);
    public static final PlayControlPlayerState Seek = new PlayControlPlayerState("Seek", 7, 7);
    public static final PlayControlPlayerState Error = new PlayControlPlayerState("Error", 8, 16);
    public static final PlayControlPlayerState Stalled = new PlayControlPlayerState("Stalled", 9, 17);
    public static final PlayControlPlayerState InfoReport = new PlayControlPlayerState("InfoReport", 10, 18);
    public static final PlayControlPlayerState ProgressReport = new PlayControlPlayerState("ProgressReport", 11, 19);
    public static final PlayControlPlayerState Playing = new PlayControlPlayerState("Playing", 12, 20);
    public static final PlayControlPlayerState PreparedFinished = new PlayControlPlayerState("PreparedFinished", 13, 21);
    public static final PlayControlPlayerState Pausing = new PlayControlPlayerState("Pausing", 14, 22);
    public static final PlayControlPlayerState Completed = new PlayControlPlayerState("Completed", 15, 23);
    public static final PlayControlPlayerState LoopCompleted = new PlayControlPlayerState("LoopCompleted", 16, 24);
    public static final PlayControlPlayerState Destroy = new PlayControlPlayerState("Destroy", 17, 255);

    private static final /* synthetic */ PlayControlPlayerState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PlayControlPlayerState[]) ipChange.ipc$dispatch("4b2e1b76", new Object[0]) : new PlayControlPlayerState[]{Undefined, Init, Prepared, Play, Stop, Pause, Resume, Seek, Error, Stalled, InfoReport, ProgressReport, Playing, PreparedFinished, Pausing, Completed, LoopCompleted, Destroy};
    }

    static {
        PlayControlPlayerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlayControlPlayerState(String str, int i, int i2) {
        this.state = i2;
    }

    public static fg8<PlayControlPlayerState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PlayControlPlayerState playControlPlayerState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/state/PlayControlPlayerState");
    }

    public static PlayControlPlayerState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlPlayerState) ipChange.ipc$dispatch("699c3feb", new Object[]{str});
        }
        return (PlayControlPlayerState) Enum.valueOf(PlayControlPlayerState.class, str);
    }

    public static PlayControlPlayerState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlPlayerState[]) ipChange.ipc$dispatch("b8ee001a", new Object[0]);
        }
        return (PlayControlPlayerState[]) $VALUES.clone();
    }

    public final int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }
}
