package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.d;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dot implements IMediaPlayer.OnSeekCompletionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17989a;

    public dot(d dVar) {
        this.f17989a = dVar;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
            return;
        }
        d.z0(this.f17989a, true);
        d.A0(this.f17989a);
    }
}
