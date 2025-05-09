package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.Surface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class c32 implements IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnBufferingUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public static final float z = 0.8f;

    /* renamed from: a  reason: collision with root package name */
    public int f16808a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public String h;
    public Surface i;
    public boolean j;
    public qbi k;
    public final Context l;
    public final Context m;
    public rgi n;
    public Map<String, String> o;
    public final DWContext p;
    public int q;
    public ArrayList<ytb> r;
    public ArrayList<eub> s;
    public fsc t;
    public List<dub> u;
    public List<aub> v;
    public WeakReference<gsc> w;
    public boolean x;
    public boolean y;

    static {
        t2o.a(452985126);
        t2o.a(774898019);
        t2o.a(774898025);
        t2o.a(774898021);
        t2o.a(774898020);
        t2o.a(774898029);
        t2o.a(774898018);
    }

    public c32(DWContext dWContext) {
        new Rect();
        this.l = dWContext.getActivity();
        this.m = dWContext.mApplicationontext;
        this.p = dWContext;
        v();
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7af3400e", new Object[]{this})).booleanValue();
        }
        return this.n.j;
    }

    public abstract boolean B();

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue();
        }
        return this.n.d;
    }

    public abstract boolean D();

    public boolean E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20b4aeb8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            if (this.w.get() != null) {
                return this.w.get().c(i, i2);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef58fbed", new Object[]{this});
            return;
        }
        this.n.e = 6;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoClose();
            }
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f705fd12", new Object[]{this});
            return;
        }
        this.n.e = 4;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoComplete();
            }
        }
    }

    public void H(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4650b9", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        this.n.e = 3;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoError(obj, i, i2);
            }
        }
    }

    public void I(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c675dd", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoInfo(obj, j, j2, j3, obj2);
            }
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174d08d6", new Object[]{this});
            return;
        }
        List<aub> list = this.v;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((aub) it.next()).onLoopCompletion();
            }
        }
    }

    public void K(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d83b49", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.n.e = 2;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoPause(z2);
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
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoPlay();
            }
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c3a671", new Object[]{this});
            return;
        }
        List<dub> list = this.u;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((dub) it.next()).v();
            }
        }
    }

    public void N(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa01472", new Object[]{this, obj});
            return;
        }
        this.n.e = 5;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoPrepared(obj);
            }
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c3700a", new Object[]{this});
            return;
        }
        ArrayList<eub> arrayList = this.s;
        if (arrayList != null) {
            Iterator<eub> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoRecycled();
            }
            fsc fscVar = this.t;
            if (fscVar != null) {
                fscVar.a();
            }
        }
    }

    public void P(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbac5f3c", new Object[]{this, dWVideoScreenType});
            return;
        }
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoScreenChanged(dWVideoScreenType);
            }
        }
    }

    public void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff920a17", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoSeekTo(i);
            }
        }
    }

    public void R(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e3c05d", new Object[]{this, new Boolean(z2)});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + notifyVideoStart");
        if (z2) {
            U();
        }
        this.n.e = 1;
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            Iterator<ytb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onVideoStart();
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "TextureVideoView " + this + ", + notifyVideoStart finished");
        }
    }

    public void S(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6427fe07", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayList<ytb> arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.r.get(i4).onVideoProgressChanged(i, i2, i3);
            }
        }
    }

    public abstract void T(DWVideoScreenType dWVideoScreenType);

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41faa682", new Object[]{this});
            return;
        }
        Intent intent = new Intent("com.taobao.avplayer.start");
        intent.putExtra("isMute", this.p.isMute());
        Context context = this.l;
        if (context != null) {
            context.sendBroadcast(intent);
        }
    }

    public abstract void V(boolean z2);

    public abstract void W();

    public abstract void X();

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
        }
    }

    public void Z(gsc gscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1251f", new Object[]{this, gscVar});
        } else {
            this.w = new WeakReference<>(gscVar);
        }
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a312b9a8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 3 || i == 0 || i == 6) {
            return true;
        }
        return false;
    }

    public void a0(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b71d026", new Object[]{this, ytbVar});
        } else if (ytbVar != null) {
            if (this.r == null) {
                this.r = new ArrayList<>();
            }
            if (!this.r.contains(ytbVar)) {
                this.r.add(ytbVar);
            }
        }
    }

    public void b0(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68f6586", new Object[]{this, aubVar});
            return;
        }
        if (this.v == null) {
            this.v = new ArrayList();
        }
        if (!this.v.contains(aubVar)) {
            this.v.add(aubVar);
        }
    }

    public void c0(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97f5814", new Object[]{this, dubVar});
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        if (!this.u.contains(dubVar)) {
            this.u.add(dubVar);
        }
    }

    public void d0(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2ad669", new Object[]{this, eubVar});
            return;
        }
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        if (!this.s.contains(eubVar)) {
            this.s.add(eubVar);
        }
    }

    public abstract void e();

    public void e0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694f7761", new Object[]{this, fscVar});
        } else if (fscVar != null) {
            this.t = fscVar;
        }
    }

    public abstract void f();

    public abstract void f0(int i);

    public abstract void g();

    public abstract void g0(int i, boolean z2, boolean z3);

    public abstract int getCurrentPosition();

    public abstract float h();

    public abstract void h0(int i, boolean z2);

    public abstract int i();

    public void i0(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        return null;
    }

    public void j0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11fcc9b", new Object[]{this, new Integer(i)});
        } else {
            this.n.b = i;
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90eab22", new Object[]{this})).intValue();
        }
        return this.n.c;
    }

    public abstract void k0(boolean z2);

    public Surface l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
        }
        return this.i;
    }

    public void l0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3988a7c", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906945f8", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public abstract void m0(float f);

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fea6ec89", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public void n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670bed28", new Object[]{this, new Integer(i)});
        } else {
            this.n.c = i;
        }
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82244988", new Object[]{this})).floatValue();
        }
        try {
            return ((AudioManager) this.l.getApplicationContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception unused) {
            return 0.5f;
        }
    }

    public abstract void o0(float f);

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.n.f27360a;
    }

    public abstract void p0(String str);

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public abstract void q0(float f);

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45bc20af", new Object[]{this});
        }
        return this.h;
    }

    public abstract void r0();

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.n.e;
    }

    public void s0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5499d60", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.f16808a;
    }

    public abstract View u();

    public abstract void v();

    public abstract void w(int i);

    public abstract boolean x();

    public abstract boolean y();
}
