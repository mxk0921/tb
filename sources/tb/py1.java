package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class py1 implements m2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26395a = false;
    public Long b = null;
    public boolean c = false;
    public boolean d = false;

    static {
        t2o.a(730857627);
        t2o.a(481297503);
    }

    @Override // tb.m2d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.m2d
    public void b(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0130b9", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.m2d
    public void c(fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62b543", new Object[]{this, fzbVar});
        }
    }

    @Override // tb.m2d
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.m2d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.m2d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7059d467", new Object[]{this});
        }
    }

    @Override // tb.m2d
    public qu3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("3941f463", new Object[]{this});
        }
        return null;
    }

    @Override // tb.m2d
    public FrameLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return null;
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b50c471", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.m2d
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    @Override // tb.m2d
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.d = true;
        }
    }
}
