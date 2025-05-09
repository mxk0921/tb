package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class evr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Class, xkd> f18841a = new HashMap<>();
    public ux9 b;
    public i3h c;

    static {
        t2o.a(806356082);
    }

    public <T extends xkd> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((xkd) ipChange.ipc$dispatch("e2503031", new Object[]{this, cls}));
        }
        xkd xkdVar = this.f18841a.get(cls);
        if (cls.isInstance(xkdVar)) {
            return cls.cast(xkdVar);
        }
        return null;
    }

    public void b(Context context, String str, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80eb7c3", new Object[]{this, context, str, ux9Var});
            return;
        }
        soq soqVar = new soq(context, str, ux9Var);
        soqVar.x();
        this.f18841a.put(btd.class, soqVar);
        this.b = ux9Var;
        c(ux9Var);
    }

    public final void c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e460049", new Object[]{this, ux9Var});
            return;
        }
        i3h i3hVar = new i3h();
        this.c = i3hVar;
        i3hVar.f();
        if (ux9Var != null) {
            ux9Var.g0(this.c);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
            return;
        }
        for (Map.Entry<Class, xkd> entry : this.f18841a.entrySet()) {
            xkd value = entry.getValue();
            if (value != null) {
                value.unInit();
            }
        }
        this.f18841a.clear();
        e();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b4f65a", new Object[]{this});
            return;
        }
        i3h i3hVar = this.c;
        if (i3hVar != null) {
            i3hVar.i();
            this.c = null;
            ux9 ux9Var = this.b;
            if (ux9Var != null) {
                ux9Var.g0(null);
            }
        }
    }
}
