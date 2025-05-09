package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25297a;
    public final ze7 b;
    public final Map<String, ComponentViewMeta> c = new HashMap();
    public final Map<String, bpb> d = new HashMap();
    public final List<String> e = new ArrayList();

    static {
        t2o.a(912261371);
    }

    public oc4(Context context, ze7 ze7Var) {
        this.f25297a = context;
        this.b = ze7Var;
        f(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public <C extends oa4> C b(nb4 nb4Var, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("368d1f2", new Object[]{this, nb4Var, dataEntryArr}));
        }
        if (nb4Var == null) {
            tgh.b("ComponentManager", "getComponent return null, because of argument data is null");
            return null;
        }
        String j = nb4Var.j();
        ComponentViewMeta d = d(j);
        if (d == null) {
            tgh.b("ComponentManager", "getComponentViewMeta return null, because not found ComponentViewMeta for type: " + j);
            return null;
        }
        String type = d.getType();
        if (bo4.a(type, this.e)) {
            bpb c = c(type);
            uob b = c.b(d.getName());
            if (b == null) {
                tgh.b("ComponentManager", "getComponentBuilder return null, because not found IComponentBuilder for name: " + d.getName() + " in ComponentSpace for type: " + j);
                b = c.a();
                if (b == null) {
                    tgh.b("ComponentManager", "getComponent return null, because not found DefaultComponentBuilder in ComponentSpace for type: " + j);
                    return null;
                }
            }
            return (C) b.a(this.f25297a, this.b, nb4Var, dataEntryArr);
        }
        tgh.b("ComponentManager", "getComponent return null, because not found ComponentSpace for type: " + j);
        return null;
    }

    public final <S extends bpb> S c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (S) ((bpb) ipChange.ipc$dispatch("ffc48911", new Object[]{this, str}));
        }
        if (str == null) {
            return null;
        }
        return (S) ((bpb) ((HashMap) this.d).get(str));
    }

    public ComponentViewMeta d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentViewMeta) ipChange.ipc$dispatch("bca92e41", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (ComponentViewMeta) ((HashMap) this.c).get(str);
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f25297a;
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        j("native", new jjj(context));
        j("dinamicx", new co7(context));
        j("weex", new u4x(context));
        j("weex2", new a3x(context));
    }

    public void g(Map<String, ComponentViewMeta> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e44d89", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            ((HashMap) this.c).clear();
        } else {
            ((HashMap) this.c).putAll(map);
        }
    }

    public void h(String str, ComponentViewMeta componentViewMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce597556", new Object[]{this, str, componentViewMeta});
        } else {
            ((HashMap) this.c).put(str, componentViewMeta);
        }
    }

    public final boolean j(String str, bpb bpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bdff1ac", new Object[]{this, str, bpbVar})).booleanValue();
        }
        if (str == null || bpbVar == null) {
            return false;
        }
        this.d.put(str, bpbVar);
        this.e.add(str);
        return true;
    }

    public boolean i(String str, String str2, uob uobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14be5507", new Object[]{this, str, str2, uobVar})).booleanValue();
        }
        if (str == null || str2 == null || uobVar == null) {
            return false;
        }
        bpb c = c(str);
        if (c != null) {
            return c.d(str2, uobVar);
        }
        tgh.b("ComponentManager", "view space: " + str + " is null, register component builder name: " + str2 + "failed");
        return false;
    }

    public boolean k(String str, uob uobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f568adb6", new Object[]{this, str, uobVar})).booleanValue();
        }
        if (str == null || uobVar == null) {
            return false;
        }
        bpb c = c(str);
        if (c == null) {
            tgh.b("ComponentManager", "view space: " + str + " is null, register default component builder failed");
            return false;
        }
        c.c(uobVar);
        return true;
    }
}
