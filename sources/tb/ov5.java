package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ov5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public k8 f25677a;
    public Object b;
    public Object c;
    public Object d;
    public DXEvent e;
    public boolean f;

    static {
        t2o.a(444596680);
    }

    public k8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k8) ipChange.ipc$dispatch("bcef1ffc", new Object[]{this});
        }
        return this.f25677a;
    }

    public DXEvent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("b550ed8d", new Object[]{this});
        }
        return this.e;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9710a264", new Object[]{this});
        }
        return this.c;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7520de44", new Object[]{this});
        }
        return this.d;
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("67675a75", new Object[]{this});
        }
        return this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1eae2cf", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void g(k8 k8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cfbb4", new Object[]{this, k8Var});
        } else {
            this.f25677a = k8Var;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb94731", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void i(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef484761", new Object[]{this, dXEvent});
        } else {
            this.e = dXEvent;
        }
    }

    public void j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e761f6", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7fb7e", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    public void l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2878e505", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }
}
