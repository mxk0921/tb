package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wh1 extends rhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final iwd b;

    static {
        t2o.a(834666526);
    }

    public wh1(iwd iwdVar) {
        this.b = iwdVar;
    }

    public static /* synthetic */ Object ipc$super(wh1 wh1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/canvas/binding/AudioContext");
    }

    @Override // tb.rhb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.destroy();
        }
    }

    @Override // tb.rhb
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ce40d68", new Object[]{this})).intValue();
        }
        return this.b.b();
    }

    @Override // tb.rhb
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        return this.b.a();
    }

    @Override // tb.rhb
    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        return this.b.getDuration();
    }

    @Override // tb.rhb
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        return this.b.g();
    }

    @Override // tb.rhb
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.b.pause();
        }
    }

    @Override // tb.rhb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.b.play();
        }
    }

    @Override // tb.rhb
    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i)});
        } else {
            this.b.seek(i);
        }
    }

    @Override // tb.rhb
    public boolean k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c396e4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.b.i(z);
    }

    @Override // tb.rhb
    public boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d71591", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.b.h(z);
    }

    @Override // tb.rhb
    public boolean m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d0b0cb", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.b.setLoop(z);
    }

    @Override // tb.rhb
    public boolean n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c175601b", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.b.f(z);
    }

    @Override // tb.rhb
    public boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbfab37", new Object[]{this, str})).booleanValue();
        }
        return this.b.e(str);
    }

    @Override // tb.rhb
    public boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c94373", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.b.c(i);
    }

    @Override // tb.rhb
    public boolean q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3942a781", new Object[]{this, new Float(f)})).booleanValue();
        }
        return this.b.setVolume(f);
    }

    @Override // tb.rhb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.b.stop();
        }
    }
}
