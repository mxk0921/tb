package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.avplayer.DWVideoScreenType;
import com.uc.webview.export.media.MessageID;
import tb.f9e;
import tb.vlc;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uei implements csc, vlc, f9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f29326a;
    public final olk<csc> b = new olk<>();
    public final olk<vlc> c = new olk<>();
    public final olk<f9e> d = new olk<>();
    public int e = -1;

    static {
        t2o.a(468714530);
        t2o.a(468714529);
        t2o.a(468714534);
        t2o.a(468714532);
        t2o.a(468714535);
    }

    public uei(FluidContext fluidContext) {
        this.f29326a = fluidContext;
    }

    public void addLivePlayerListener(vlc vlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce262d05", new Object[]{this, vlcVar});
        } else if (vlcVar != null) {
            this.c.a(vlcVar);
        }
    }

    public void addMediaPlayerListener(csc cscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1124b27", new Object[]{this, cscVar});
        } else if (cscVar != null) {
            this.b.a(cscVar);
        }
    }

    public void addVideoPlayerListener(f9e f9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa02b487", new Object[]{this, f9eVar});
        } else if (f9eVar != null) {
            this.d.a(f9eVar);
        }
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // tb.csc
    public boolean hook(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e726267f", new Object[]{this, uq9Var})).booleanValue();
        }
        for (csc cscVar : this.b.b()) {
            try {
                cscVar.hook(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, cscVar, d5d.POINT_HOOK, e);
            }
        }
        return false;
    }

    @Override // tb.vlc
    public void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77df115", new Object[]{this, uq9Var, iMediaPlayer});
            return;
        }
        for (vlc vlcVar : this.c.b()) {
            try {
                vlcVar.onCompletion(uq9Var, iMediaPlayer);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, vlcVar, "", e);
            }
        }
    }

    @Override // tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
            return;
        }
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onLoopCompletion(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onLoopCompletion", e);
            }
        }
    }

    @Override // tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onPreCompletion");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onPreCompletion(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onPreCompletion", e);
            }
        }
        igs.c();
    }

    @Override // tb.vlc
    public void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78defb6", new Object[]{this, uq9Var, iMediaPlayer});
            return;
        }
        igs.a(MessageID.onPrepared);
        for (vlc vlcVar : this.c.b()) {
            try {
                vlcVar.onPrepared(uq9Var, iMediaPlayer);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, vlcVar, MessageID.onPrepared, e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onVideoClose");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoClose(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoClose", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onVideoComplete");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoComplete(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoComplete", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
            return;
        }
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoError(uq9Var, obj, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoError", e);
            }
        }
    }

    @Override // tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        igs.a("onVideoPause");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoPause(uq9Var, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoPause", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onVideoPlay");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoPlay(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoPlay", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
            return;
        }
        igs.a("onVideoPrepared");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoPrepared(uq9Var, obj);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoPrepared", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        igs.a("onVideoProgressChanged");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoProgressChanged(uq9Var, i, i2, i3);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoProgressChanged", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
            return;
        }
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoScreenChanged(uq9Var, dWVideoScreenType);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoScreenChanged", e);
            }
        }
    }

    @Override // tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoSeekTo(uq9Var, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoSeekTo", e);
            }
        }
    }

    @Override // tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
            return;
        }
        igs.a("onVideoStart");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoStart(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoStart", e);
            }
        }
        igs.c();
    }

    @Override // tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        igs.a("onVideoStateChanged");
        this.e = i;
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoStateChanged(uq9Var, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoStateChanged", e);
            }
        }
        igs.c();
    }

    public void removeLivePlayerListener(vlc vlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8973fbc2", new Object[]{this, vlcVar});
        } else if (vlcVar != null) {
            this.c.e(vlcVar);
        }
    }

    public void removeMediaPlayerListener(csc cscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20275ea4", new Object[]{this, cscVar});
        } else if (cscVar != null) {
            this.b.e(cscVar);
        }
    }

    public void removeVideoPlayerListener(f9e f9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1917c804", new Object[]{this, f9eVar});
        } else if (f9eVar != null) {
            this.d.e(f9eVar);
        }
    }

    public void addLivePlayerListener(vlc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d6059a", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.c.a(aVar);
        }
    }

    public void addVideoPlayerListener(f9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fbeb1c", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.d.a(aVar);
        }
    }

    @Override // tb.vlc
    public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (vlc vlcVar : this.c.b()) {
            try {
                vlcVar.onError(uq9Var, iMediaPlayer, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, vlcVar, "onError", e);
            }
        }
        return false;
    }

    public void removeLivePlayerListener(vlc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fbc757", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.c.e(aVar);
        }
    }

    public void removeVideoPlayerListener(f9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b83199", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.d.e(aVar);
        }
    }

    @Override // tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        igs.a("onVideoInfo");
        for (f9e f9eVar : this.d.b()) {
            try {
                f9eVar.onVideoInfo(uq9Var, obj, j, j2, j3, obj2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, f9eVar, "onVideoInfo", e);
            }
        }
        igs.c();
    }

    @Override // tb.vlc
    public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        igs.a("onInfo");
        for (vlc vlcVar : this.c.b()) {
            try {
                vlcVar.onInfo(uq9Var, iMediaPlayer, j, j2, j3, obj);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29326a, vlcVar, "onInfo", e);
            }
        }
        igs.c();
        return false;
    }
}
