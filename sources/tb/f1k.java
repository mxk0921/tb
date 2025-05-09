package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f1k implements u9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final s f18942a;
    public asc b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912263148);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoView.e f18943a;

        public b(VideoView.e eVar) {
            this.f18943a = eVar;
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            } else {
                this.f18943a.a();
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            this.f18943a.b();
            this.f18943a.m(true);
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            this.f18943a.c(iMediaPlayer, i, i2);
            this.f18943a.m(false);
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else {
                this.f18943a.e(iMediaPlayer, (int) j, (int) j2);
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            } else {
                this.f18943a.g(z);
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            } else {
                this.f18943a.h();
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            } else {
                this.f18943a.i(iMediaPlayer);
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f18943a.j(i, i2, i3);
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
                this.f18943a.f();
            } else if (mediaPlayScreenType == MediaPlayScreenType.PORTRAIT_FULL_SCREEN) {
                this.f18943a.d();
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            } else {
                this.f18943a.k(i);
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            } else {
                this.f18943a.l();
            }
        }
    }

    static {
        t2o.a(912263147);
        t2o.a(912263146);
    }

    public f1k(s sVar) {
        ckf.h(sVar, "instance");
        this.f18942a = sVar;
    }

    @Override // tb.u9d
    public void a(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
        } else {
            this.f18942a.D(4015, qtbVar);
        }
    }

    @Override // tb.u9d
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309d1ba2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.u9d
    public void c(VideoView.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b76c5", new Object[]{this, eVar});
            return;
        }
        g();
        if (eVar != null) {
            b bVar = new b(eVar);
            this.b = bVar;
            this.f18942a.D(4009, bVar);
        }
    }

    @Override // tb.u9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7077718c", new Object[]{this});
        }
    }

    @Override // tb.u9d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f18942a.h();
        }
    }

    @Override // tb.u9d
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
        } else {
            this.f18942a.D(1026, Boolean.valueOf(z));
        }
    }

    @Override // tb.u9d
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        this.f18942a.c("setFrame", hashMap);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cad9ae", new Object[]{this});
            return;
        }
        asc ascVar = this.b;
        if (ascVar != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("IMediaPlayLifecycleListener", ascVar);
            this.f18942a.c("unRegisterIMediaPlayLifecycleListener", hashMap);
        }
    }

    @Override // tb.u9d
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f18942a.m(1501);
    }

    @Override // tb.u9d
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return (int) this.f18942a.m(1500);
    }

    @Override // tb.u9d
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f18942a.o();
    }

    @Override // tb.u9d
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.f18942a.t(z);
        }
    }

    @Override // tb.u9d
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.f18942a.u();
        }
    }

    @Override // tb.u9d
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.f18942a.F();
        }
    }

    @Override // tb.u9d
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.f18942a.y(i, false);
        }
    }

    @Override // tb.u9d
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f18942a.F();
        }
    }
}
