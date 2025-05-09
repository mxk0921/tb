package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u0h implements IMediaPlayer.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f29056a;

    public u0h(LiveMediaManager liveMediaManager) {
        this.f29056a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        LiveMediaManager liveMediaManager = this.f29056a;
        liveMediaManager.O0("mediaPlayer: onError what---" + i + "  extra---" + i2);
        if (!LiveMediaManager.Z1(this.f29056a).isEmpty()) {
            for (int i3 = 0; i3 < LiveMediaManager.Z1(this.f29056a).size(); i3++) {
                ((b3d) LiveMediaManager.Z1(this.f29056a).get(i3)).onError(iMediaPlayer, i, i2);
            }
        }
        return false;
    }
}
