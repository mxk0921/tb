package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kgf implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InteractVideoManager";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f22650a;
    public final nwi b;
    public s c;

    static {
        t2o.a(573571197);
        t2o.a(774897787);
    }

    public kgf(nwi nwiVar) {
        this.b = nwiVar;
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        return this.f22650a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        jgh.a(TAG, "release: playerInstance=" + this.c);
        try {
            s sVar = this.c;
            if (sVar != null) {
                if (!(this.f22650a == null || sVar.o() == null || this.f22650a.indexOfChild(this.c.o()) < 0)) {
                    this.f22650a.removeView(this.c.o());
                    if (lf4.d()) {
                        jgh.a(TAG, "release: playerInstance.destroy() with removeView");
                        this.c.h();
                    }
                }
                if (!lf4.d()) {
                    jgh.a(TAG, "release: playerInstance.destroy() do not check removeView");
                    this.c.h();
                }
            }
        } catch (Throwable th) {
            jgh.b(TAG, "release error ", th);
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
        } else if (this.b.a().d()) {
            this.b.a().h(false);
            ik8.a(this.b);
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

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2312adb8", new Object[]{this});
        }
        Activity a2 = qq4.a(this.b);
        if (a2 == null) {
            jgh.a(TAG, "renderInteractVideo: activity is null.");
            return null;
        }
        String i = t5l.i(this.b);
        if (TextUtils.isEmpty(i)) {
            jgh.a(TAG, "renderInteractVideo: video path is empty.");
            return null;
        }
        this.f22650a = new FrameLayout(a2);
        s.d dVar = new s.d();
        int f = kr7.f();
        int d = kr7.d(this.b);
        dVar.n = "mama";
        dVar.o = "topshow_festival";
        dVar.g = a2;
        dVar.i = true;
        dVar.q = DWAspectRatio.DW_CENTER_CROP;
        dVar.k = 2;
        dVar.r = 2;
        dVar.j = "NonTBVideo";
        dVar.l = i;
        dVar.t = this;
        dVar.x = f;
        dVar.y = d;
        s c = s.c.c(TAG, dVar);
        this.c = c;
        this.f22650a.addView(c.o(), new ViewGroup.LayoutParams(f, d));
        this.f22650a.setAlpha(0.0f);
        this.c.v();
        return this.f22650a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        jgh.a(TAG, "start: playerInstance=" + this.c);
        s sVar = this.c;
        if (sVar == null) {
            return false;
        }
        sVar.F();
        return true;
    }
}
