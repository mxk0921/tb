package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, xob<?>> f20606a = new HashMap<>();
    public final HashMap<String, na4<?>> b = new HashMap<>();

    static {
        t2o.a(803209241);
    }

    public final <T> na4<T> a(cc4 cc4Var, mb4<T> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (na4) ipChange.ipc$dispatch("c826e7f6", new Object[]{this, cc4Var, mb4Var});
        }
        ckf.g(cc4Var, "componentInfo");
        ckf.g(mb4Var, "componentData");
        xob<?> xobVar = this.f20606a.get(cc4Var.b());
        if (xobVar != null) {
            return (na4<T>) xobVar.a(cc4Var, mb4Var);
        }
        return null;
    }

    public final na4<?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (na4) ipChange.ipc$dispatch("2753fb94", new Object[]{this, str});
        }
        ckf.g(str, "name");
        return this.b.get(str);
    }

    public final xob<?> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xob) ipChange.ipc$dispatch("3429bba8", new Object[]{this, str});
        }
        ckf.g(str, "type");
        return this.f20606a.get(str);
    }

    public final void d(String str, na4<?> na4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cf5b81", new Object[]{this, str, na4Var});
            return;
        }
        ckf.g(str, "name");
        ckf.g(na4Var, "component");
        this.b.put(str, na4Var);
    }

    public final <T> void e(String str, xob<T> xobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f6831b", new Object[]{this, str, xobVar});
            return;
        }
        ckf.g(str, "type");
        ckf.g(xobVar, "factory");
        this.f20606a.put(str, xobVar);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (Map.Entry<String, xob<?>> entry : this.f20606a.entrySet()) {
            entry.getValue().destroy();
        }
        for (Map.Entry<String, na4<?>> entry2 : this.b.entrySet()) {
            entry2.getValue().g();
        }
        this.f20606a.clear();
        this.b.clear();
    }
}
