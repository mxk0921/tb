package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.player.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w75 implements wtb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f30496a;
    public final DWContext b;

    static {
        t2o.a(452984857);
        t2o.a(452985007);
    }

    public w75(DWContext dWContext, boolean z) {
        this.b = dWContext;
        s(z);
        dWContext.setVideo(this);
    }

    @Override // tb.wtb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // tb.wtb
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.w(i);
        }
    }

    @Override // tb.wtb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
        } else if (this.f30496a.s() == 4 || (this.f30496a.C() && this.f30496a.k() == 4)) {
            if (this.f30496a.C()) {
                this.f30496a.j0(0);
            } else {
                this.f30496a.f0(0);
            }
            playVideo();
        } else {
            this.f30496a.r0();
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e698da2", new Object[]{this})).booleanValue();
        }
        if (this.f30496a.s() == 1 || this.f30496a.s() == 2) {
            return false;
        }
        return true;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // tb.wtb
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba74df4a", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.W0(z);
        }
    }

    @Override // tb.wtb
    public void g(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68f6586", new Object[]{this, aubVar});
        } else {
            this.f30496a.b0(aubVar);
        }
    }

    @Override // tb.wtb
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // tb.wtb
    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.i();
        }
        return 0;
    }

    @Override // tb.wtb
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.q();
        }
        return 0;
    }

    @Override // tb.wtb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.f30496a.s();
    }

    @Override // tb.wtb
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.t();
        }
        return 0;
    }

    @Override // tb.wtb
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fea6ec89", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.n();
        }
        return 0;
    }

    @Override // tb.wtb
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d912e60", new Object[]{this})).intValue();
        }
        if (this.f30496a.C()) {
            return this.f30496a.k();
        }
        return this.f30496a.s();
    }

    @Override // tb.wtb
    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5bb934", new Object[]{this, new Float(f)});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.o0(f);
        }
    }

    @Override // tb.wtb
    public void k(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97f5814", new Object[]{this, dubVar});
        } else {
            this.f30496a.c0(dubVar);
        }
    }

    @Override // tb.wtb
    public void l(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b71d026", new Object[]{this, ytbVar});
        } else {
            this.f30496a.a0(ytbVar);
        }
    }

    @Override // tb.wtb
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906945f8", new Object[]{this})).intValue();
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            return aVar.m();
        }
        return 0;
    }

    @Override // tb.wtb
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        }
    }

    @Override // tb.wtb
    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82244988", new Object[]{this})).floatValue();
        }
        a aVar = this.f30496a;
        if (aVar == null) {
            return 0.0f;
        }
        aVar.o();
        return 0.0f;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a931730", new Object[]{this})).booleanValue();
        }
        a aVar = this.f30496a;
        if (aVar == null || !aVar.y()) {
            return false;
        }
        return true;
    }

    @Override // tb.wtb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.V(false);
        }
    }

    @Override // tb.wtb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.W();
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f39d7bc", new Object[]{this})).booleanValue();
        }
        a aVar = this.f30496a;
        if (aVar == null || !aVar.D()) {
            return false;
        }
        return true;
    }

    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f30496a.u();
    }

    @Override // tb.wtb
    public void refreshScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
        }
    }

    @Override // tb.wtb
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
        } else if (this.f30496a.s() == 3 || (this.f30496a.C() && this.f30496a.k() == 3)) {
            this.f30496a.r0();
        }
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = new a(this.b, false);
        this.f30496a = aVar;
        aVar.k0(z);
        if (!TextUtils.isEmpty(this.b.mPlayContext.getVideoUrl())) {
            w(this.b.mPlayContext.getVideoUrl());
        }
        t();
    }

    @Override // tb.wtb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.f0(i);
        }
    }

    @Override // tb.wtb
    public void setFov(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b02220", new Object[]{this});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.q0(0.0f);
        }
    }

    public void u(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989adb79", new Object[]{this, ytbVar});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.a0(ytbVar);
        }
    }

    public void v(ttb ttbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f552515a", new Object[]{this, ttbVar});
            return;
        }
        a aVar = this.f30496a;
        if (aVar != null) {
            aVar.w1(ttbVar);
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            psb psbVar = this.b.mConfigAdapter;
            if (psbVar == null || ((b75) psbVar).h()) {
                str = uyv.HTTPS_SCHEMA.concat(str);
            } else {
                str = "http:".concat(str);
            }
        }
        this.f30496a.p0(str);
    }
}
