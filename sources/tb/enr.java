package tb;

import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class enr implements dcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static enr l;
    public static boolean m = false;
    public static Rect n = null;

    /* renamed from: a  reason: collision with root package name */
    public r4d f18702a;
    public fnr b;
    public int c;
    public Rect d;
    public long e;
    public int g;
    public int h;
    public PreloadParams.a k;
    public final kyw f = new kyw(this);
    public int i = -1;
    public boolean j = true;

    static {
        t2o.a(779093682);
        t2o.a(806356530);
    }

    public enr(Context context) {
        i(context);
    }

    public static /* synthetic */ kyw a(enr enrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kyw) ipChange.ipc$dispatch("847f588b", new Object[]{enrVar});
        }
        return enrVar.f;
    }

    public static /* synthetic */ fnr b(enr enrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnr) ipChange.ipc$dispatch("a70f316", new Object[]{enrVar});
        }
        return enrVar.b;
    }

    public static /* synthetic */ int c(enr enrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f67c8e9a", new Object[]{enrVar})).intValue();
        }
        return enrVar.c;
    }

    public static enr g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enr) ipChange.ipc$dispatch("7c3335a6", new Object[]{context});
        }
        if (l == null) {
            l = new enr(context);
            m = false;
        }
        return l;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693c9c9a", new Object[0])).booleanValue();
        }
        return m;
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
            return;
        }
        enr enrVar = l;
        if (enrVar != null) {
            enrVar.d();
        }
        l = null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        n();
        kyw kywVar = this.f;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        r4d r4dVar = this.f18702a;
        if (r4dVar != null) {
            ((uy1) r4dVar).release();
            ((uy1) this.f18702a).destroy();
        }
        this.k = null;
        l = null;
        m = true;
    }

    public final Rect e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("cf714282", new Object[]{this});
        }
        if (n == null) {
            Rect rect = new Rect();
            n = rect;
            int i = this.g;
            int i2 = (int) (i * 0.4d);
            rect.set(0, i2, this.h, ((int) (i * 0.5d)) + i2);
        }
        return n;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e36535c7", new Object[]{this})).intValue();
        }
        if (-1 == this.i) {
            this.i = 0;
            int b = fkr.b();
            if (b == 0 || -1 == b) {
                this.i = frr.s();
            } else if (1 == b) {
                this.i = frr.v();
            } else if (2 == b) {
                this.i = frr.u();
            }
        }
        return this.i;
    }

    public r4d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("aaa4dd95", new Object[]{this});
        }
        return this.f18702a;
    }

    @Override // tb.dcc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        TLog.loge(PreloadParams.PlayerType.TB_LIVE_VIDEO_MANAGER_TYPE, "堆栈调用", new Throwable());
        this.e = 0L;
        this.k = new PreloadParams.a(context).N(this.j);
        o3s.b(PreloadParams.PlayerType.TB_LIVE_VIDEO_MANAGER_TYPE, "TBLiveVideoManager init标准化流程");
        uew uewVar = new uew(this.k.G());
        this.f18702a = uewVar;
        uewVar.A();
        ((uy1) this.f18702a).f(new dnr(this));
        this.h = jw0.d(context);
        this.g = jw0.c(context);
    }

    public boolean l(fnr fnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d916e8f", new Object[]{this, fnrVar})).booleanValue();
        }
        if (!jw0.e() || fnrVar == null) {
            return false;
        }
        int f = f();
        if (f != 0) {
            if (0 == this.e) {
                this.e = SystemClock.uptimeMillis();
                return false;
            } else if (SystemClock.uptimeMillis() - this.e < f * 1000) {
                return false;
            }
        }
        fnr fnrVar2 = this.b;
        if (fnrVar2 == null) {
            return m(fnrVar);
        }
        if (fnrVar2.f19424a == fnrVar.f19424a) {
            return true;
        }
        if (fnrVar.f < fnrVar2.f || !fnrVar.k.intersect(e())) {
            return false;
        }
        n();
        return m(fnrVar);
    }

    public void n() {
        cvd cvdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        if (this.f18702a != null) {
            if (frr.h()) {
                ((uy1) this.f18702a).release();
            } else {
                ((uy1) this.f18702a).pause();
            }
            fnr fnrVar = this.b;
            if (!(fnrVar == null || (cvdVar = fnrVar.f19424a) == null)) {
                cvdVar.onVideoStop();
            }
        }
        this.b = null;
    }

    public final boolean m(fnr fnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74909e2", new Object[]{this, fnrVar})).booleanValue();
        }
        if (fnrVar == null) {
            return false;
        }
        cvd cvdVar = fnrVar.f19424a;
        if (cvdVar != null) {
            cvdVar.onVideoRequestAccept();
        }
        kyw kywVar = this.f;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        this.b = fnrVar;
        if (this.f18702a == null || fnrVar.c <= 0) {
            return false;
        }
        if (fnrVar.l == null && TextUtils.isEmpty(fnrVar.b)) {
            return false;
        }
        fnr fnrVar2 = this.b;
        this.c = fnrVar2.c;
        if (!fnrVar2.g.equals(this.d)) {
            this.d = this.b.g;
        }
        boolean z = this.j;
        boolean z2 = fnrVar.i;
        if (z == z2) {
            this.j = !z2;
        }
        this.k.e0(fnrVar).F(fnrVar.d).Z(fnrVar.e).N(this.j).T(this.b.b).U(PreloadParams.PlayerType.TB_LIVE_VIDEO_MANAGER_TYPE).i0(this.d);
        o3s.b(PreloadParams.PlayerType.TB_LIVE_VIDEO_MANAGER_TYPE, "startVideo,播放器起播之前");
        ((uew) this.f18702a).p(this.k.G());
        if (!(((uy1) this.f18702a).getView() == null || this.d == null)) {
            ((uy1) this.f18702a).getView().setOutlineProvider(new eot(this.d));
            ((uy1) this.f18702a).getView().setClipToOutline(true);
        }
        return true;
    }
}
