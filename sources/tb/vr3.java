package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yko f30195a;
    public boolean b;
    public boolean c = false;
    public boolean d = false;

    static {
        t2o.a(993001724);
    }

    public vr3(yko ykoVar) {
        this.f30195a = ykoVar;
        this.b = ykoVar.g().isDebug();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aafb874c", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ad57d0c", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec280182", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = this.f30195a.g().isDebug();
        this.c = false;
        this.d = false;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4dd094", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854bdade", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
