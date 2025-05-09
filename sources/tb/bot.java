package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.player.a;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bot implements IMediaPlayer.OnSeekCompletionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16520a;
    public final /* synthetic */ a b;

    public bot(a aVar, int i) {
        this.b = aVar;
        this.f16520a = i;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
            return;
        }
        a.v0(this.b, true);
        a.w0(this.b, this.f16520a);
        a.x0(this.b);
    }
}
