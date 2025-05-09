package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w0h implements IMediaPlayer.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f30382a;

    public w0h(LiveMediaManager liveMediaManager) {
        this.f30382a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        this.f30382a.O0("mediaPlayer: onCompletion");
        if (!LiveMediaManager.Z1(this.f30382a).isEmpty()) {
            for (int i = 0; i < LiveMediaManager.Z1(this.f30382a).size(); i++) {
                ((b3d) LiveMediaManager.Z1(this.f30382a).get(i)).onCompletion(iMediaPlayer);
            }
        }
    }
}
