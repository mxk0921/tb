package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cqa implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaPlayCenter f17230a;
    public List<IMediaPlayer.OnInfoListener> b;
    public WeakReference<jsk> c;

    static {
        t2o.a(473956428);
        t2o.a(774897787);
    }

    public cqa(Context context, String str) {
        MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(context);
        this.f17230a = mediaPlayCenter;
        mediaPlayCenter.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        mediaPlayCenter.setBusinessId(str);
        mediaPlayCenter.setNeedPlayControlView(false);
        mediaPlayCenter.setConfigGroup("MediaLive");
        mediaPlayCenter.hideController();
        mediaPlayCenter.setMediaLifecycleListener(this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f17230a.destroy();
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f17230a.getView();
    }

    public void c(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0468de", new Object[]{this, onInfoListener});
            return;
        }
        if (this.b == null) {
            this.b = new LinkedList();
        }
        this.b.add(onInfoListener);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f17230a.release();
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.f17230a.setMediaId(str);
        }
    }

    public void f(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a36608c", new Object[]{this, mediaLiveInfo, str});
        } else if (mediaLiveInfo != null) {
            this.f17230a.updateLiveMediaInfoData(mediaLiveInfo);
        } else if (!TextUtils.isEmpty(str)) {
            this.f17230a.updateLiveMediaInfoData(null);
            this.f17230a.setMediaUrl(str);
        }
    }

    public void g(jsk jskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0bd44f", new Object[]{this, jskVar});
        } else {
            this.c = new WeakReference<>(jskVar);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.f17230a.setMute(z);
        }
    }

    public void i(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc50c9bb", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.f17230a.setRenderType(z, i2, i3, i4);
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
        } else {
            this.f17230a.setScenarioType(i);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.f17230a.setBizCode(str);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7977a955", new Object[]{this, new Boolean(z)});
        } else {
            this.f17230a.setUseBfrtc(z);
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d482b6c5", new Object[]{this, new Boolean(z)});
        } else {
            this.f17230a.setUseRtcLive(z);
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.f17230a.setVideoLoop(z);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else {
            this.f17230a.setup();
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        jsk jskVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
            return;
        }
        WeakReference<jsk> weakReference = this.c;
        if (weakReference != null && (jskVar = weakReference.get()) != null) {
            jskVar.a(2);
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        jsk jskVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        WeakReference<jsk> weakReference = this.c;
        if (weakReference != null && (jskVar = weakReference.get()) != null) {
            jskVar.a(1);
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        List<IMediaPlayer.OnInfoListener> list = this.b;
        if (list != null) {
            for (IMediaPlayer.OnInfoListener onInfoListener : list) {
                if (onInfoListener != null) {
                    onInfoListener.onInfo(iMediaPlayer, j, j2, j3, obj);
                }
            }
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
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
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f17230a.start();
        }
    }
}
