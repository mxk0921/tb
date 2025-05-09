package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x0h implements IMediaPlayer.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f31050a;

    public x0h(LiveMediaManager liveMediaManager) {
        this.f31050a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
        } else if (!LiveMediaManager.Z1(this.f31050a).isEmpty()) {
            Iterator it = LiveMediaManager.Z1(this.f31050a).iterator();
            while (it.hasNext()) {
                ((b3d) it.next()).onStart(iMediaPlayer);
            }
        }
    }
}
