package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qgi implements IMediaPlayer, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, TaoLiveVideoView.n, AudioManager.OnAudioFocusChangeListener, TaoLiveVideoView.m, isc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jgi f26738a;
    public ywg b;
    public final List<IMediaPlayer.b> c = new ArrayList();
    public final List<IMediaPlayer.d> d = new ArrayList();
    public final List<Object> e = new ArrayList();
    public final List<IMediaPlayer.h> f = new ArrayList();
    public final List<IMediaPlayer.c> g = new CopyOnWriteArrayList();
    public final List<IMediaPlayer.e> h = new CopyOnWriteArrayList();
    public final List<IMediaPlayer.i> i = new CopyOnWriteArrayList();
    public final List<IMediaPlayer.f> j = new ArrayList();
    public final List<AudioManager.OnAudioFocusChangeListener> k = new CopyOnWriteArrayList();

    static {
        t2o.a(779092320);
        t2o.a(806356431);
        t2o.a(774898025);
        t2o.a(774898019);
        t2o.a(774898020);
        t2o.a(774898021);
        t2o.a(774897986);
        t2o.a(774897985);
        t2o.a(774897794);
    }

    public qgi() {
        IpChange ipChange = IMediaPlayer.WarmState.$ipChange;
        R();
    }

    @Override // tb.isc
    public void A(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed540ac", new Object[]{this, hashMap});
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
    public void I(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < ((CopyOnWriteArrayList) this.i).size(); i++) {
            if (((CopyOnWriteArrayList) this.i).get(i) != null) {
                ((IMediaPlayer.i) ((CopyOnWriteArrayList) this.i).get(i)).onStart(this);
            }
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7823e741", new Object[]{this});
            return;
        }
        ywg ywgVar = this.b;
        if (ywgVar != null) {
            ywgVar.d();
            this.b = null;
        }
    }

    public ywg Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywg) ipChange.ipc$dispatch("8d768ff7", new Object[]{this});
        }
        return this.b;
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        new Handler(Looper.getMainLooper());
        try {
            Integer.parseInt(sbt.t());
        } catch (NumberFormatException e) {
            TLog.loge("TBLive", "MediaPlayerProxy", e.getMessage());
        }
    }

    public void S(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee1eec9", new Object[]{this, eVar});
            return;
        }
        ywg ywgVar = this.b;
        if (ywgVar != null) {
            ywgVar.u(eVar);
        } else if (!((CopyOnWriteArrayList) this.h).contains(eVar)) {
            ((CopyOnWriteArrayList) this.h).remove(eVar);
        }
    }

    public void T(jgi jgiVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73ddeaa", new Object[]{this, jgiVar, context, str});
            return;
        }
        U(jgiVar, context);
        if (this.f26738a != null) {
            ywg ywgVar = new ywg(new PreloadParams.a(context).R(this.f26738a).S(str).G());
            this.b = ywgVar;
            ywgVar.r();
            this.b.setMuted(true);
        }
    }

    public final void U(jgi jgiVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5aecefd", new Object[]{this, jgiVar, context});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy set instance");
        this.f26738a = jgiVar;
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        throw new RuntimeException("Deprecated method");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31feaeb4", new Object[]{this});
        }
        throw new RuntimeException("Deprecated method");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01f600", new Object[]{this, cVar});
        } else if (!((CopyOnWriteArrayList) this.g).contains(cVar)) {
            ((CopyOnWriteArrayList) this.g).add(cVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.f26738a != null) {
            this.f26738a = null;
        }
        ((ArrayList) this.d).clear();
        ((ArrayList) this.c).clear();
        TLog.loge("TBLive", TLogTracker.SCENE_EXCEPTION, pg1.ATOM_EXT_clear);
        ((ArrayList) this.e).clear();
        ((ArrayList) this.f).clear();
        ((CopyOnWriteArrayList) this.g).clear();
        ((CopyOnWriteArrayList) this.h).clear();
        ((CopyOnWriteArrayList) this.i).clear();
        ((ArrayList) this.j).clear();
        ((CopyOnWriteArrayList) this.k).clear();
        IpChange ipChange2 = IMediaPlayer.WarmState.$ipChange;
    }

    public void f(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bedf90c", new Object[]{this, eVar});
            return;
        }
        ywg ywgVar = this.b;
        if (ywgVar != null) {
            ywgVar.m(eVar);
        } else if (!((CopyOnWriteArrayList) this.h).contains(eVar)) {
            ((CopyOnWriteArrayList) this.h).add(eVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public MediaData getDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("3cd3ad82", new Object[]{this});
        }
        return null;
    }

    @Override // tb.v4q
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        throw new RuntimeException("Deprecated method");
    }

    @Override // tb.v4q
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        throw new RuntimeException("Deprecated method");
    }

    @Override // tb.v4q
    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.v4q
    public void n(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d5dfee", new Object[]{this, hVar});
        } else if (!((ArrayList) this.f).contains(hVar)) {
            ((ArrayList) this.f).add(hVar);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < ((CopyOnWriteArrayList) this.k).size(); i2++) {
            if (((CopyOnWriteArrayList) this.k).get(i2) != null) {
                ((AudioManager.OnAudioFocusChangeListener) ((CopyOnWriteArrayList) this.k).get(i2)).onAudioFocusChange(i);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (int i3 = 0; i3 < ((CopyOnWriteArrayList) this.g).size(); i3++) {
            if (((CopyOnWriteArrayList) this.g).get(i3) != null) {
                ((IMediaPlayer.c) ((CopyOnWriteArrayList) this.g).get(i3)).onError(this, i, i2);
            }
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.f).size(); i++) {
            if (((ArrayList) this.f).get(i) != null) {
                ((IMediaPlayer.h) ((ArrayList) this.f).get(i)).onPrepared(this);
            }
        }
    }

    @Override // tb.v4q
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy pause");
        Trace.endSection();
    }

    @Override // tb.v4q
    public void q(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80efd3c0", new Object[]{this, fVar});
        } else if (!((ArrayList) this.j).contains(fVar)) {
            ((ArrayList) this.j).add(fVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy release");
        Trace.endSection();
    }

    @Override // tb.v4q
    public void s(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97d43b0", new Object[]{this, bVar});
            return;
        }
        if (!((ArrayList) this.c).contains(bVar)) {
            ((ArrayList) this.c).add(bVar);
        }
        TLog.loge("TBLive", TLogTracker.SCENE_EXCEPTION, "addOnCompletionListener");
    }

    @Override // tb.v4q
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy set Muted");
        Trace.endSection();
    }

    @Override // tb.v4q
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy start");
        TLog.loge("TBLive", "MediaPlayerProxy", this + "start");
        System.currentTimeMillis();
        Trace.endSection();
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.m
    public void v(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.j).size(); i++) {
            if (((ArrayList) this.j).get(i) != null) {
                ((IMediaPlayer.f) ((ArrayList) this.j).get(i)).onPause(this);
            }
        }
    }

    @Override // tb.v4q
    public void z(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560f6140", new Object[]{this, iVar});
        } else if (!((CopyOnWriteArrayList) this.i).contains(iVar)) {
            ((CopyOnWriteArrayList) this.i).add(iVar);
        }
    }

    @Override // tb.v4q
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        throw new RuntimeException("Deprecated method");
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            try {
                if (((ArrayList) this.c).get(i) != null) {
                    ((IMediaPlayer.b) ((ArrayList) this.c).get(i)).onCompletion(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
                TLog.loge("TBLive", TLogTracker.SCENE_EXCEPTION, "stack = " + Log.getStackTraceString(new Throwable()));
                return;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3) {
            TLog.loge("TBLive", "MediaPlayerProxy", "l = " + j + "this = " + this);
        } else if (j == 12000) {
            IpChange ipChange2 = IMediaPlayer.WarmState.$ipChange;
            TLog.loge("TBLive", "MediaPlayerProxy", "l = " + j + "this = " + this);
        }
        int i2 = 0;
        while (i2 < ((CopyOnWriteArrayList) this.h).size()) {
            if (((CopyOnWriteArrayList) this.h).get(i2) != null) {
                i = i2;
                ((IMediaPlayer.e) ((CopyOnWriteArrayList) this.h).get(i2)).onInfo(this, j, j2, j3, obj);
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        return false;
    }
}
