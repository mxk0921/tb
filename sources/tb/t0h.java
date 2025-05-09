package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t0h implements IMediaPlayer.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f28388a;

    public t0h(LiveMediaManager liveMediaManager) {
        this.f28388a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
            return;
        }
        this.f28388a.O0("mediaPlayer: onPrepared");
        if (!LiveMediaManager.Z1(this.f28388a).isEmpty()) {
            Iterator it = LiveMediaManager.Z1(this.f28388a).iterator();
            while (it.hasNext()) {
                ((b3d) it.next()).onPrepared();
            }
        }
    }
}
