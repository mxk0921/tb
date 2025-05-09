package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qok implements u9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final q f26855a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements ztb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoView.e f26856a;

        public a(VideoView.e eVar) {
            this.f26856a = eVar;
        }

        @Override // tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                this.f26856a.a();
            }
        }

        @Override // tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                this.f26856a.b();
            }
        }

        @Override // tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else {
                this.f26856a.c(obj, i, i2);
            }
        }

        @Override // tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            } else {
                this.f26856a.d();
            }
        }

        @Override // tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else {
                this.f26856a.e(obj, i, i2);
            }
        }

        @Override // tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            } else {
                this.f26856a.f();
            }
        }

        @Override // tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                this.f26856a.g(z);
            }
        }

        @Override // tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                this.f26856a.h();
            }
        }

        @Override // tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else {
                this.f26856a.i(obj);
            }
        }

        @Override // tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f26856a.j(i, i2, i3);
            }
        }

        @Override // tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                this.f26856a.k(i);
            }
        }

        @Override // tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else {
                this.f26856a.l();
            }
        }
    }

    static {
        t2o.a(912263150);
        t2o.a(912263146);
    }

    public qok(q qVar) {
        ckf.h(qVar, "instance");
        this.f26855a = qVar;
    }

    @Override // tb.u9d
    public void a(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
        } else {
            this.f26855a.setRootViewClickListener(qtbVar);
        }
    }

    @Override // tb.u9d
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309d1ba2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.u9d
    public void c(VideoView.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b76c5", new Object[]{this, eVar});
        } else if (eVar != null) {
            this.f26855a.setVideoLifecycleListener(new a(eVar));
        } else {
            this.f26855a.setVideoLifecycleListener(null);
        }
    }

    @Override // tb.u9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7077718c", new Object[]{this});
        } else {
            this.f26855a.setDWLifecycleType(DWLifecycleType.BEFORE);
        }
    }

    @Override // tb.u9d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f26855a.destroy();
        }
    }

    @Override // tb.u9d
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
        } else {
            this.f26855a.setShowNotWifiHint(z);
        }
    }

    @Override // tb.u9d
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f26855a.setFrame(i, i2);
        }
    }

    @Override // tb.u9d
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f26855a.getDuration();
    }

    @Override // tb.u9d
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.f26855a.getVideoState();
    }

    @Override // tb.u9d
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f26855a.getView();
    }

    @Override // tb.u9d
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.f26855a.mute(z);
        }
    }

    @Override // tb.u9d
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.f26855a.pauseVideo();
        }
    }

    @Override // tb.u9d
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.f26855a.playVideo();
        }
    }

    @Override // tb.u9d
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.f26855a.seekTo(i);
        }
    }

    @Override // tb.u9d
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f26855a.start();
        }
    }
}
