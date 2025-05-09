package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.playcontrol.state.PlayControlPlayerState;
import tb.j9d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a6m<T extends j9d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PlayControlPlayerState f15569a = PlayControlPlayerState.Undefined;

    static {
        t2o.a(1004536628);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((j9d) ipChange.ipc$dispatch("7da3fd3", new Object[]{this}));
        }
        return null;
    }

    public final PlayControlPlayerState b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControlPlayerState) ipChange.ipc$dispatch("143778b3", new Object[]{this});
        }
        return this.f15569a;
    }

    public final void c(PlayControlPlayerState playControlPlayerState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d323ad", new Object[]{this, playControlPlayerState});
            return;
        }
        ckf.g(playControlPlayerState, "<set-?>");
        this.f15569a = playControlPlayerState;
    }
}
