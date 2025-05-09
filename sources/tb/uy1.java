package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class uy1 implements r4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29668a;
    public BaseStatePlayer b;
    public final PreloadParams c;
    public final SimpleLiveInfo d;
    public final VideoInfo e;
    public final Map<String, String> f;

    static {
        t2o.a(779093134);
        t2o.a(779093135);
    }

    public uy1(PreloadParams preloadParams) {
        this.c = preloadParams;
        this.f29668a = preloadParams.b();
        this.d = preloadParams.r();
        this.e = preloadParams.v();
        this.f = preloadParams.x();
    }

    @Override // tb.r4d
    public void D(RoomPlayerObserver roomPlayerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8416b852", new Object[]{this, roomPlayerObserver});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.w1(roomPlayerObserver);
        }
    }

    @Override // tb.r4d
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1131826", new Object[]{this, str});
        }
    }

    @Override // tb.r4d
    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.f0();
        }
        return null;
    }

    @Override // tb.r4d
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.Y();
        }
        return null;
    }

    @Override // tb.r4d
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.c0();
        }
        return null;
    }

    @Override // tb.r4d
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b8459e8", new Object[]{this});
        }
        PreloadParams preloadParams = this.c;
        if (preloadParams != null) {
            return preloadParams.l();
        }
        return null;
    }

    @Override // tb.r4d
    public void d(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01f600", new Object[]{this, cVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.t(cVar);
        }
    }

    @Override // tb.r4d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.N(0L);
        }
    }

    @Override // tb.r4d
    public void f(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bedf90c", new Object[]{this, eVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.u(eVar);
        }
    }

    @Override // tb.r4d
    public void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.H(map);
        }
    }

    @Override // tb.r4d
    public long getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.U();
        }
        return 0L;
    }

    @Override // tb.v4q
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.g0();
        }
        return 0;
    }

    @Override // tb.r4d
    public View getVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.j0();
        }
        return null;
    }

    @Override // tb.v4q
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.k0();
        }
        return 0;
    }

    @Override // tb.v4q
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.l0();
        }
        return null;
    }

    @Override // tb.v4q
    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.x0();
        }
        return false;
    }

    @Override // tb.r4d
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            return baseStatePlayer.y0();
        }
        return false;
    }

    @Override // tb.r4d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777cfc3d", new Object[]{this});
        } else {
            start();
        }
    }

    @Override // tb.v4q
    public void n(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d5dfee", new Object[]{this, hVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.z(hVar);
        }
    }

    @Override // tb.r4d
    public void p(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebe548f", new Object[]{this, preloadParams});
        } else {
            start();
        }
    }

    @Override // tb.v4q
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.R0();
        }
    }

    @Override // tb.v4q
    public void q(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80efd3c0", new Object[]{this, fVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.w(fVar);
        }
    }

    @Override // tb.r4d
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.N(0L);
        }
    }

    @Override // tb.v4q
    public void s(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97d43b0", new Object[]{this, bVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.v(bVar);
        }
    }

    @Override // tb.v4q
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.n1(z);
        }
    }

    @Override // tb.v4q
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.I1();
        }
    }

    public void v(e7m e7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1fac7b", new Object[]{this, e7mVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.t1(e7mVar);
        }
    }

    @Override // tb.v4q
    public void z(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560f6140", new Object[]{this, iVar});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null) {
            baseStatePlayer.B(iVar);
        }
    }
}
