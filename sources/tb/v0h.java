package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v0h implements IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveMediaManager f29714a;

    public v0h(LiveMediaManager liveMediaManager) {
        this.f29714a = liveMediaManager;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (!LiveMediaManager.Z1(this.f29714a).isEmpty()) {
            Iterator it = LiveMediaManager.Z1(this.f29714a).iterator();
            while (it.hasNext()) {
                ((b3d) it.next()).c(iMediaPlayer, j, j2, obj);
            }
        }
        return false;
    }
}
