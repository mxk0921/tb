package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y0h implements IMediaPlayer.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f31761a;

    public y0h(LiveMediaManager liveMediaManager) {
        this.f31761a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
        } else if (!LiveMediaManager.Z1(this.f31761a).isEmpty()) {
            Iterator it = LiveMediaManager.Z1(this.f31761a).iterator();
            while (it.hasNext()) {
                ((b3d) it.next()).onPause(iMediaPlayer);
            }
        }
    }
}
