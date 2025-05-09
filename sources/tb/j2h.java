package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.c;
import com.taobao.avplayer.r;
import com.taobao.avplayer.s;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.player.IPlayBack;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j2h extends IPlayBack implements asc, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, TaoLiveVideoView.m, TaoLiveVideoView.n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c j;
    public s k;
    public final boolean l;
    public boolean m = false;

    static {
        t2o.a(502268283);
        t2o.a(774897787);
        t2o.a(774898021);
        t2o.a(774898025);
        t2o.a(774898019);
        t2o.a(774898020);
        t2o.a(774897985);
        t2o.a(774897986);
    }

    public j2h(TBVideoComponent tBVideoComponent) {
        super(tBVideoComponent);
        this.l = true;
        this.l = akt.p2("tnode_update_live_player", true);
    }

    public static /* synthetic */ Object ipc$super(j2h j2hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/player/LivePlayBack");
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
    public void I(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        onVideoStart();
        onVideoPlay();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda41214", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c06fe4d", new Object[]{this})).booleanValue();
        }
        if (this.k == null && this.j == null) {
            return false;
        }
        return this.f;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void j(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else if (!this.l || (sVar = this.k) == null) {
            c cVar = this.j;
            if (cVar != null) {
                cVar.s(z);
            }
        } else {
            sVar.t(z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd55d6b9", new Object[]{this})).booleanValue();
        }
        s sVar = this.k;
        if (sVar == null && this.j == null) {
            return false;
        }
        if (!this.l || sVar == null) {
            c cVar = this.j;
            if (cVar == null || cVar.n() != 2) {
                return false;
            }
            return true;
        } else if (sVar.m(1500) == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void n(View view) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269adb37", new Object[]{this, view});
        } else if (!this.l || (sVar = this.k) == null) {
            c cVar = this.j;
            if (cVar != null) {
                cVar.b0();
                this.b = System.currentTimeMillis();
            }
        } else {
            sVar.F();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4a8db9", new Object[]{this})).booleanValue();
        }
        s sVar = this.k;
        if (sVar == null && this.j == null) {
            return false;
        }
        if (!this.l || sVar == null) {
            c cVar = this.j;
            if (cVar == null || cVar.n() != 1) {
                return false;
            }
            return true;
        } else if (sVar.m(1500) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        } else {
            onVideoComplete();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        onVideoError(iMediaPlayer, i, i2);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        onVideoInfo(iMediaPlayer, (int) j, (int) j2);
        return false;
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        } else {
            onVideoComplete();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            onVideoError(iMediaPlayer, i, i2);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else {
            onVideoInfo(iMediaPlayer, (int) j, (int) j2);
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        } else {
            onVideoPause(false);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            onVideoPlay();
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        } else {
            onVideoPrepared(iMediaPlayer);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            onVideoStart();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        } else {
            onVideoPrepared(iMediaPlayer);
        }
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.l && this.k != null) {
            TBVideoComponent.u videoParams = this.c.getVideoParams();
            if (e(videoParams)) {
                this.k.t(this.c.isMute());
            } else {
                this.k.t(videoParams.L0);
            }
            this.c.attachVideoView(w());
        } else if (this.j != null) {
            TBVideoComponent.u videoParams2 = this.c.getVideoParams();
            if (e(videoParams2)) {
                this.j.s(this.c.isMute());
            } else {
                this.j.s(videoParams2.L0);
            }
            this.c.attachVideoView(w());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f56123", new Object[]{this})).intValue();
        }
        if (this.k == null && this.j == null) {
            return -1;
        }
        return this.d;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public r q(Context context, int i, int i2, boolean z, boolean z2, TBVideoComponent tBVideoComponent, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("f4c51b6b", new Object[]{this, context, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), tBVideoComponent, new Boolean(z3), new Boolean(z4)});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        if (this.l) {
            y(context, i, i2, z, z2, tBVideoComponent, z3, z4);
            return null;
        }
        TBVideoComponent.u viewParams = tBVideoComponent.getViewParams();
        c.C0535c cVar = new c.C0535c((Activity) context);
        cVar.t(0);
        if (i2 > 0) {
            cVar.k(i2);
        }
        if (i > 0) {
            cVar.E(i);
        }
        cVar.e("TBLive");
        cVar.d(viewParams.D0);
        cVar.C(viewParams.F0);
        cVar.x(viewParams.G0);
        if (d(viewParams)) {
            cVar.n(true);
        }
        cVar.u(false);
        cVar.B(viewParams.K0);
        cVar.f(viewParams.x0);
        cVar.p(true);
        cVar.r(viewParams.Y0);
        cVar.A(viewParams.A0);
        if (!TextUtils.isEmpty(viewParams.Z0)) {
            try {
                cVar.m(new JSONObject(viewParams.Z0));
            } catch (Exception e) {
                tfs.e("LivePlayBack", e + "");
            }
        }
        if (!TextUtils.isEmpty(viewParams.M0)) {
            if ("center_crop".equals(viewParams.M0)) {
                cVar.z(DWAspectRatio.DW_CENTER_CROP);
            } else if ("fit_center".equals(viewParams.M0)) {
                cVar.z(DWAspectRatio.DW_FIT_CENTER);
            } else if ("fit_xy".equals(viewParams.M0)) {
                cVar.z(DWAspectRatio.DW_FIT_X_Y);
            }
        }
        if (z) {
            cVar.o(false);
        }
        c a2 = cVar.a();
        a2.B(this);
        a2.z(this);
        a2.y(this);
        a2.x(this);
        a2.w(this);
        a2.A(this);
        a2.L(x(viewParams), null);
        a2.a0();
        this.d = 0;
        TBVideoComponent.VideoView videoView = new TBVideoComponent.VideoView(context);
        this.c = videoView;
        this.j = a2;
        videoView.setLiveDwInstance(a2);
        this.c.setMuteInfo(tBVideoComponent);
        long j = viewParams.E0;
        if (j != -1) {
            this.j.K(j);
        }
        this.g = viewParams.b1;
        this.m = false;
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void s() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (!this.l || (sVar = this.k) == null) {
            c cVar = this.j;
            if (cVar != null) {
                cVar.u();
            }
        } else {
            sVar.F();
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.m
    public void v(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
        } else {
            onVideoPause(false);
        }
    }

    public final void y(Context context, int i, int i2, boolean z, boolean z2, TBVideoComponent tBVideoComponent, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808059c9", new Object[]{this, context, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2), tBVideoComponent, new Boolean(z3), new Boolean(z4)});
            return;
        }
        tfs.e("liveplayback", "initTBPlayerInstance");
        TBVideoComponent.u viewParams = tBVideoComponent.getViewParams();
        s.d dVar = new s.d();
        dVar.h = context;
        dVar.r = 0;
        if (i2 > 0) {
            dVar.y = i2;
        }
        if (i > 0) {
            dVar.x = i;
        }
        dVar.n = "DWTBLive";
        dVar.o = viewParams.D0;
        dVar.j = viewParams.F0;
        dVar.c0 = viewParams.G0;
        if (d(viewParams)) {
            dVar.i = true;
        }
        dVar.A = viewParams.K0;
        dVar.O = true;
        dVar.W = viewParams.Y0;
        dVar.m = viewParams.A0;
        if (!TextUtils.isEmpty(viewParams.Z0)) {
            try {
                dVar.V = new JSONObject(viewParams.Z0);
            } catch (Exception e) {
                tfs.e("LivePlayBack", e + "");
            }
        }
        if (!TextUtils.isEmpty(viewParams.M0)) {
            if ("center_crop".equals(viewParams.M0)) {
                dVar.q = DWAspectRatio.DW_CENTER_CROP;
            } else if ("fit_center".equals(viewParams.M0)) {
                dVar.q = DWAspectRatio.DW_FIT_CENTER;
            } else if ("fit_xy".equals(viewParams.M0)) {
                dVar.q = DWAspectRatio.DW_FIT_X_Y;
            }
        }
        dVar.U = x(viewParams);
        dVar.t = this;
        this.k = s.c.c("", dVar);
        this.d = 0;
        TBVideoComponent.VideoView videoView = new TBVideoComponent.VideoView(context);
        this.c = videoView;
        videoView.setLiveInstanceNew(this.k);
        this.c.setMuteInfo(tBVideoComponent);
        this.g = viewParams.b1;
        this.m = false;
    }

    @Override // tb.eub
    public void onVideoRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3803834", new Object[]{this});
            return;
        }
        tfs.e("liveplayback", "onVideoRecycled");
        this.m = true;
        if (this.f12345a != null && TBVideoComponent.i0()) {
            this.f12345a.U0();
        }
    }

    public final MediaLiveInfo x(TBVideoComponent.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("6e43bf7a", new Object[]{this, uVar});
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = false;
        mediaLiveInfo.liveUrlList = new ArrayList<>();
        mediaLiveInfo.liveId = uVar.i1;
        QualityLiveItem qualityLiveItem = new QualityLiveItem();
        qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
        String str = uVar.k1;
        String str2 = uVar.j1;
        if ("flv".equalsIgnoreCase(str)) {
            qualityLiveItem.flvUrl = str2;
        } else if ("hls".equalsIgnoreCase(str)) {
            qualityLiveItem.hlsUrl = str2;
        } else if ("artp".equalsIgnoreCase(str)) {
            qualityLiveItem.artpUrl = str2;
        } else if (MediaConstant.BFRTC_URL_NAME.equals(str)) {
            qualityLiveItem.bfrtcUrl = str2;
        } else if (MediaConstant.RTCLIVE_URL_NAME.equals(str)) {
            qualityLiveItem.rtcLiveUrl = str2;
        }
        mediaLiveInfo.liveUrlList.add(qualityLiveItem);
        return mediaLiveInfo;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4791a7f", new Object[]{this, new Boolean(z), view});
        } else if (!this.l || this.k == null) {
            c cVar = this.j;
            if (cVar != null) {
                if (z) {
                    cVar.M(true);
                }
                this.j.i0(this);
                this.j.e0(this);
                this.j.f0(this);
                this.j.g0(this);
                this.j.h0(this);
                this.j.j0(this);
                this.j.S(null);
                this.j.Y(null);
                this.j.d();
                this.j.g();
                k();
                h(null);
                this.c = null;
                this.j = null;
                this.d = 0;
                this.m = false;
            }
        } else {
            k();
            this.k.c("unRegisterIMediaPlayLifecycleListener", null);
            this.k.E(4015, null);
            this.k.E(RSoException.ERROR_LOAD_ASYNC_FAILED, null);
            this.k.h();
            this.c = null;
            this.k = null;
            this.d = 0;
            this.m = false;
        }
    }
}
