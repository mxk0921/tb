package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jxi<PARAMS, BEAN_BASE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, ay4<PARAMS, ? extends kae>> f22269a = new HashMap();
    public final yko b;

    static {
        t2o.a(993001878);
    }

    public jxi(yko ykoVar) {
        this.b = ykoVar;
    }

    public kae a(Class<? extends BEAN_BASE> cls, PARAMS params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("e03056b2", new Object[]{this, cls, params});
        }
        ay4 ay4Var = (ay4) ((HashMap) this.f22269a).get(cls);
        if (ay4Var != null) {
            return (kae) ay4Var.a(params);
        }
        c4p l = this.b.l();
        l.d("ModFactory", "no creator registered: " + cls);
        return null;
    }

    public void b(Class<? extends BEAN_BASE> cls, ay4<PARAMS, ? extends kae> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e22ae27", new Object[]{this, cls, ay4Var});
            return;
        }
        if (((HashMap) this.f22269a).containsKey(cls)) {
            c4p l = this.b.l();
            l.d("ModFactory", "creator is already registered: " + cls);
        }
        ((HashMap) this.f22269a).put(cls, ay4Var);
    }
}
