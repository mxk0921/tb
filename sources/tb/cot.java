package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.d;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cot implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractMediaPlayer f17212a;
    public final /* synthetic */ d b;

    public cot(d dVar, AbstractMediaPlayer abstractMediaPlayer) {
        this.b = dVar;
        this.f17212a = abstractMediaPlayer;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            d.y0(this.b, this.f17212a);
        }
    }
}
