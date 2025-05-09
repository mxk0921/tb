package com.taobao.mediaplay.player;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.player.c;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.asc;
import tb.fsc;
import tb.gsc;
import tb.rgi;
import tb.t2o;
import tb.vrc;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class b implements IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnVFPluginListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float C = 0.8f;
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public boolean A;
    public boolean B = false;

    /* renamed from: a  reason: collision with root package name */
    public int f11026a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public String g;
    public int h;
    public boolean i;
    public Surface j;
    public c.b k;
    public Context l;
    public Context m;
    public rgi n;
    public Map<String, String> o;
    public MediaContext p;
    public String q;
    public SparseArray<Long> r;
    public SparseArray<Float> s;
    public int t;
    public ArrayList<asc> u;
    public List<fsc> v;
    public List<vrc> w;
    public List<IMediaPlayer.OnVideoClickListener> x;
    public gsc y;
    public boolean z;

    static {
        t2o.a(774897784);
        t2o.a(774898019);
        t2o.a(774898025);
        t2o.a(774898021);
        t2o.a(774898020);
        t2o.a(774898029);
        t2o.a(774898018);
        t2o.a(774898027);
    }

    public b(Context context) {
        new Rect();
        this.l = context;
        y();
    }

    public abstract boolean A();

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7af3400e", new Object[]{this})).booleanValue();
        }
        return this.n.j;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue();
        }
        return this.n.d;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82517b5", new Object[]{this})).booleanValue();
        }
        gsc gscVar = this.y;
        if (gscVar == null) {
            return false;
        }
        return gscVar.b();
    }

    public boolean E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20b4aeb8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        gsc gscVar = this.y;
        if (gscVar == null) {
            return false;
        }
        return gscVar.c(i, i2);
    }

    public abstract void F();

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f705fd12", new Object[]{this});
            return;
        }
        this.n.e = 4;
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaComplete();
            }
        }
    }

    public void H(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ce0abf", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        this.n.e = 3;
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaError(iMediaPlayer, i, i2);
            }
        }
    }

    public void I(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90374017", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaInfo(iMediaPlayer, j, j2, j3, obj);
            }
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174d08d6", new Object[]{this});
            return;
        }
        List<vrc> list = this.w;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((vrc) it.next()).onLoopCompletion();
            }
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d83b49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.e = 2;
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaPause(z);
            }
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb249a8d", new Object[]{this});
            return;
        }
        this.n.e = 1;
        F();
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaPlay();
            }
        }
    }

    public void M(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9758dcf8", new Object[]{this, iMediaPlayer});
            return;
        }
        this.n.e = 5;
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaPrepared(iMediaPlayer);
            }
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c3700a", new Object[]{this});
            return;
        }
        List<fsc> list = this.v;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((fsc) it.next()).a();
            }
        }
    }

    public void O(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d598", new Object[]{this, mediaPlayScreenType});
            return;
        }
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaScreenChanged(mediaPlayScreenType);
            }
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff920a17", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaSeekTo(i);
            }
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d309d57", new Object[]{this});
            return;
        }
        if (!this.p.mMediaPlayContext.mTBLive) {
            T();
        }
        this.n.e = 1;
        F();
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            Iterator<asc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onMediaStart();
            }
        }
    }

    public void R(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6427fe07", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayList<asc> arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.u.get(i4).onMediaProgressChanged(i, i2, i3);
            }
        }
    }

    public abstract void S(MediaPlayScreenType mediaPlayScreenType);

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41faa682", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.avplayer.start");
        intent.putExtra("isMute", this.p.mMediaPlayContext.isMute());
        Context context = this.l;
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    public abstract void U(boolean z);

    public abstract void V();

    public abstract void W();

    public void X(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17602ef", new Object[]{this, ascVar});
        } else if (ascVar != null) {
            if (this.u == null) {
                this.u = new ArrayList<>();
            }
            if (!this.u.contains(ascVar)) {
                this.u.add(ascVar);
            }
        }
    }

    public void Y(gsc gscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1251f", new Object[]{this, gscVar});
        } else {
            this.y = gscVar;
        }
    }

    public void Z(vrc vrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d4e58c", new Object[]{this, vrcVar});
            return;
        }
        if (this.w == null) {
            this.w = new ArrayList();
        }
        if (!this.w.contains(vrcVar)) {
            this.w.add(vrcVar);
        }
    }

    public void a0(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        if (this.x == null) {
            this.x = new LinkedList();
        }
        this.x.add(onVideoClickListener);
    }

    public void b0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427b9563", new Object[]{this, fscVar});
            return;
        }
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(fscVar);
    }

    public abstract void c0(int i);

    public abstract void d0(int i, boolean z, boolean z2);

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void e0(int i, boolean z);

    public abstract void f();

    public abstract void f0(String str);

    public abstract void g();

    public abstract void g0(MediaAspectRatio mediaAspectRatio);

    public abstract int getCurrentPosition();

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        }
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11fcc9b", new Object[]{this, new Integer(i)});
        } else {
            this.n.b = i;
        }
    }

    public abstract float i();

    public abstract void i0(boolean z);

    public abstract boolean isPlaying();

    public abstract Bitmap j();

    public abstract void j0(String str);

    public abstract int k();

    public abstract void k0(String str);

    public c.b l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("da75b4c0", new Object[]{this});
        }
        return this.k;
    }

    public void l0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3988a7c", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        return null;
    }

    public abstract void m0(float f);

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0bbd76e", new Object[]{this});
        }
        return this.q;
    }

    public abstract void n0(int i, float f);

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90eab22", new Object[]{this})).intValue();
        }
        return this.n.c;
    }

    public abstract void o0(int i, long j);

    public Surface p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
        }
        return this.j;
    }

    public void p0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670bed28", new Object[]{this, new Integer(i)});
        } else {
            this.n.c = i;
        }
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.n.f27360a;
    }

    public abstract void q0(TaoLiveVideoView.p pVar);

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62eff19a", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public abstract void r0(String str);

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public abstract void s0(float f);

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45bc20af", new Object[]{this});
        }
        return this.g;
    }

    public abstract void t0();

    public abstract float u();

    public void u0(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.x;
        if (list != null) {
            ((LinkedList) list).remove(onVideoClickListener);
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.n.e;
    }

    public void v0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41442e2a", new Object[]{this, fscVar});
            return;
        }
        List<fsc> list = this.v;
        if (list != null && fscVar != null) {
            ((ArrayList) list).remove(fscVar);
        }
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.f11026a;
    }

    public abstract View x();

    public abstract void y();

    public boolean z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a312b9a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 3 || i == 0 || i == 6) {
            return true;
        }
        return false;
    }
}
