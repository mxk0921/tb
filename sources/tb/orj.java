package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class orj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qrj<?, ?> f25600a = null;
    public weq<?, ?> b = null;
    public qrj<?, ?> c = null;
    public qrj<r7b, nsj> d = null;

    static {
        t2o.a(993001968);
    }

    public qrj<?, ?> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrj) ipChange.ipc$dispatch("edde6611", new Object[]{this});
        }
        return this.f25600a;
    }

    public qrj<r7b, nsj> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrj) ipChange.ipc$dispatch("bc33637", new Object[]{this});
        }
        return this.d;
    }

    public qrj<?, ?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrj) ipChange.ipc$dispatch("6db8475", new Object[]{this});
        }
        return this.c;
    }

    public weq<?, ?> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (weq) ipChange.ipc$dispatch("a5754ca7", new Object[]{this});
        }
        return this.b;
    }

    public void e(qrj<?, ?> qrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c192c171", new Object[]{this, qrjVar});
        } else {
            this.f25600a = qrjVar;
        }
    }

    public void f(qrj<r7b, nsj> qrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af2dba3", new Object[]{this, qrjVar});
        } else {
            this.d = qrjVar;
        }
    }

    public void g(qrj<?, ?> qrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e45525", new Object[]{this, qrjVar});
        } else {
            this.c = qrjVar;
        }
    }

    public void h(weq<?, ?> weqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4171d4b", new Object[]{this, weqVar});
        } else {
            this.b = weqVar;
        }
    }
}
