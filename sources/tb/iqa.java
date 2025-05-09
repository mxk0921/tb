package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iqa implements dcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static iqa i;
    public static Rect j = null;

    /* renamed from: a  reason: collision with root package name */
    public cqa f21505a;
    public fnr b;
    public int c;
    public Rect d;
    public int f;
    public int g;
    public final kyw e = new kyw(this);
    public boolean h = true;

    static {
        t2o.a(473956430);
        t2o.a(806356530);
    }

    public iqa(Context context) {
        i(context);
    }

    public static /* synthetic */ kyw a(iqa iqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kyw) ipChange.ipc$dispatch("a40e9fa0", new Object[]{iqaVar});
        }
        return iqaVar.e;
    }

    public static /* synthetic */ fnr b(iqa iqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnr) ipChange.ipc$dispatch("b1c4842b", new Object[]{iqaVar});
        }
        return iqaVar.b;
    }

    public static /* synthetic */ int c(iqa iqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6908dcaf", new Object[]{iqaVar})).intValue();
        }
        return iqaVar.c;
    }

    public static iqa f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqa) ipChange.ipc$dispatch("ce17effb", new Object[]{context});
        }
        if (i == null) {
            i = new iqa(context);
        }
        return i;
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
            return;
        }
        bqa.d("HTBLiveVideoManager", "release");
        iqa iqaVar = i;
        if (iqaVar != null) {
            iqaVar.d();
        }
        i = null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        n();
        kyw kywVar = this.e;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        cqa cqaVar = this.f21505a;
        if (cqaVar != null) {
            cqaVar.a();
        }
        i = null;
    }

    public final Rect e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("cf714282", new Object[]{this});
        }
        if (j == null) {
            Rect rect = new Rect();
            j = rect;
            int i2 = this.f;
            int i3 = (int) (i2 * 0.4d);
            rect.set(0, i3, this.g, ((int) (i2 * 0.5d)) + i3);
        }
        return j;
    }

    public cqa g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqa) ipChange.ipc$dispatch("f61dff1", new Object[]{this});
        }
        return this.f21505a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a26114", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
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
        cqa cqaVar = new cqa((Activity) context, "TBLive");
        this.f21505a = cqaVar;
        cqaVar.i(false, 2, 0, 0, 0);
        this.f21505a.h(this.h);
        this.f21505a.l(f4b.b("enableUseBfrtc", true));
        this.f21505a.m(f4b.b("enableUseRtcLive", true));
        hqa hqaVar = new hqa(this);
        this.g = jw0.d(context);
        this.f = jw0.c(context);
        this.f21505a.c(hqaVar);
    }

    public boolean k(fnr fnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d916e8f", new Object[]{this, fnrVar})).booleanValue();
        }
        if (!jw0.e() || fnrVar == null) {
            return false;
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

    public void l(jsk jskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0bd44f", new Object[]{this, jskVar});
            return;
        }
        cqa cqaVar = this.f21505a;
        if (cqaVar != null) {
            cqaVar.g(jskVar);
        }
    }

    public final boolean m(fnr fnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74909e2", new Object[]{this, fnrVar})).booleanValue();
        }
        if (fnrVar == null) {
            return false;
        }
        kyw kywVar = this.e;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        this.f21505a.k(fnrVar.d);
        this.f21505a.j(fnrVar.e);
        this.f21505a.e(fnrVar.h);
        if (2 == fnrVar.e) {
            this.f21505a.n(fnrVar.j);
        } else {
            this.f21505a.n(false);
        }
        boolean z = this.h;
        boolean z2 = fnrVar.i;
        if (z == z2) {
            boolean z3 = !z2;
            this.h = z3;
            this.f21505a.h(z3);
        }
        cqa cqaVar = this.f21505a;
        if (cqaVar == null || fnrVar.c <= 0) {
            return false;
        }
        this.b = fnrVar;
        MediaLiveInfo mediaLiveInfo = fnrVar.l;
        if (mediaLiveInfo != null) {
            cqaVar.f(mediaLiveInfo, null);
        } else if (!TextUtils.isEmpty(fnrVar.b)) {
            this.f21505a.f(null, this.b.b);
        } else {
            this.b = null;
            return false;
        }
        cvd cvdVar = fnrVar.f19424a;
        if (cvdVar != null) {
            cvdVar.onVideoRequestAccept();
        }
        this.f21505a.o();
        this.f21505a.p();
        fnr fnrVar2 = this.b;
        this.c = fnrVar2.c;
        if (!fnrVar2.g.equals(this.d)) {
            this.d = this.b.g;
            cqa cqaVar2 = this.f21505a;
            if (!(cqaVar2 == null || cqaVar2.b() == null)) {
                this.f21505a.b().setOutlineProvider(new eot(this.d));
                this.f21505a.b().setClipToOutline(true);
            }
        }
        return true;
    }

    public void n() {
        cvd cvdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        cqa cqaVar = this.f21505a;
        if (cqaVar != null) {
            cqaVar.d();
            fnr fnrVar = this.b;
            if (!(fnrVar == null || (cvdVar = fnrVar.f19424a) == null)) {
                cvdVar.onVideoStop();
            }
        }
        this.b = null;
    }
}
