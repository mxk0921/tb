package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.vtt;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jhl implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f21997a;
    public final Context b;
    public s.d c;
    public s d;
    public a e;
    public final boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(779093106);
        t2o.a(774897787);
    }

    public jhl(Context context, a aVar, boolean z) {
        this.b = context;
        this.e = aVar;
        this.f = z;
        this.f21997a = new FrameLayout(context);
        h();
    }

    public static /* synthetic */ s.d a(jhl jhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.d) ipChange.ipc$dispatch("996cc9ce", new Object[]{jhlVar});
        }
        return jhlVar.c;
    }

    public static /* synthetic */ void b(jhl jhlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90604dd", new Object[]{jhlVar, str});
        } else {
            jhlVar.i(str);
        }
    }

    public static /* synthetic */ FrameLayout c(jhl jhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("55d76267", new Object[]{jhlVar});
        }
        return jhlVar.f21997a;
    }

    public static /* synthetic */ s d(jhl jhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("9a0d55ea", new Object[]{jhlVar});
        }
        return jhlVar.d;
    }

    public final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca4464", new Object[]{this, view});
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f21997a.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab121b8", new Object[]{this});
            return;
        }
        s c = s.c.c(null, this.c);
        this.d = c;
        if (c.e.f != 0) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("context", this.b);
            this.d.c("reattach", hashMap);
        }
        e(this.d.o());
        l();
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        return this.f21997a;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            TLog.loge("TBLive", "P2FFPreloadInstance", str);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.d.v();
        }
    }

    public void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0813876", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17065538", new Object[]{this, str});
        } else {
            this.c.n(str);
        }
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
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        } else if (((int) j) == 13000 && (aVar = this.e) != null) {
            ((vtt.a) aVar).a();
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

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a231a7", new Object[]{this});
            return;
        }
        if (this.d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(MediaConstant.TIMEMOVING_P2FF_BY_CONTROL_PARAM, String.valueOf(true));
            this.d.D(4003, hashMap);
        }
        i("setExtraParamsForReAddP2ffView,mplayerInstance: " + this.d);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e78566", new Object[]{this});
            return;
        }
        s.d dVar = new s.d();
        this.c = dVar;
        Context context = this.b;
        dVar.g = (Activity) context;
        dVar.h = context;
        dVar.r = 0;
        if (pvs.S0()) {
            this.c.p = true;
        }
        this.c.l(true);
        this.c.m(this.f);
        s.d dVar2 = this.c;
        dVar2.i = true;
        dVar2.j = "TBVideo";
        dVar2.t = this;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isLiveDomainRequiredParams", "true");
        this.c.w = hashMap;
    }

    public void k(LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e612a5", new Object[]{this, spfPlayVideo});
        } else if ("m3u8".equalsIgnoreCase(spfPlayVideo.videoType)) {
            String str = spfPlayVideo.playInfo;
            s.d dVar = this.c;
            dVar.l = str;
            dVar.k = 2;
            dVar.n = "TBLive";
            i("p2ff 使用m3u8Url");
        } else {
            s.d dVar2 = this.c;
            dVar2.k = 1;
            String str2 = spfPlayVideo.playInfo;
            dVar2.n = "TBVideoVideoIDPlayer";
            dVar2.o = "TimeMovingPlay";
            dVar2.getClass();
            s.d dVar3 = this.c;
            dVar3.r = 2;
            dVar3.m = str2;
            i("p2ff 使用videoId: " + str2);
        }
    }

    public jhl(Context context, a aVar) {
        this(context, aVar, false);
    }

    public jhl(Context context) {
        this(context, null);
    }
}
