package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lxw implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f23631a;
    public final MediaLiveInfo b;
    public final s.d c = new s.d();
    public FrameLayout d;

    static {
        t2o.a(779093116);
        t2o.a(774897787);
    }

    public lxw(Activity activity, MediaLiveInfo mediaLiveInfo) {
        this.f23631a = activity;
        this.b = mediaLiveInfo;
        a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcab4719", new Object[]{this});
        }
        Activity activity = this.f23631a;
        if (activity == null || activity.getWindow() == null || !(this.f23631a.getWindow().getDecorView() instanceof ViewGroup)) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(this.f23631a);
        this.d = frameLayout;
        ((ViewGroup) this.f23631a.getWindow().getDecorView()).addView(frameLayout, new ViewGroup.LayoutParams(1, 1));
        s c = s.c.c(null, this.c);
        c.M(new MediaLiveWarmupConfig());
        frameLayout.addView(c.o(), new FrameLayout.LayoutParams(-1, -1));
        return this.c.f();
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
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (((int) j) == 12000) {
            TLog.loge("tblive", "WarmUpLiveInstance", "预热成功");
            Activity activity = this.f23631a;
            if (activity != null && activity.getWindow() != null && (this.f23631a.getWindow().getDecorView() instanceof ViewGroup)) {
                ((ViewGroup) this.f23631a.getWindow().getDecorView()).removeView(this.d);
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

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a7b354", new Object[]{this});
            return;
        }
        s.d dVar = this.c;
        dVar.h = this.f23631a;
        dVar.U = this.b;
        dVar.p = false;
        dVar.t = this;
        dVar.j = "TBVideo";
        dVar.n = "TBLive";
        dVar.o = "LiveRoom";
        dVar.r = 0;
        dVar.l(true);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isLiveDomainRequiredParams", "true");
        this.c.w = hashMap;
    }
}
