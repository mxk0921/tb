package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f22572a;
    public final List<IDMComponent> b;
    public final List<IDMComponent> c;
    public List<IDMComponent> d = null;
    public List<IDMComponent> e = null;
    public u55 f;

    static {
        t2o.a(155189255);
    }

    public kcu(List<IDMComponent> list, List<IDMComponent> list2, List<IDMComponent> list3) {
        this.f22572a = list;
        this.b = list2;
        this.c = list3;
    }

    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("905b05c8", new Object[]{this});
        }
        return this.b;
    }

    public u55 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("5a61a29d", new Object[]{this});
        }
        return this.f;
    }

    public List<IDMComponent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e1962af", new Object[]{this});
        }
        return this.c;
    }

    public List<IDMComponent> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57585c7d", new Object[]{this});
        }
        return this.f22572a;
    }

    public List<IDMComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("913eeab6", new Object[]{this});
        }
        return this.e;
    }

    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("488b1b2a", new Object[]{this});
        }
        return this.d;
    }

    public void g(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e27feb", new Object[]{this, u55Var});
        } else {
            this.f = u55Var;
        }
    }

    public void h(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43817f6e", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public void i(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d55ee2", new Object[]{this, list});
        } else {
            this.d = list;
        }
    }
}
