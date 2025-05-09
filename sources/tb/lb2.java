package tb;

import android.content.Context;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.bb2;
import tb.l2m;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lb2 extends AbstractEventHandler implements l2m.b, l2m.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public deq n;

    static {
        t2o.a(87031852);
        t2o.a(87031890);
        t2o.a(87031889);
    }

    public lb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(lb2 lb2Var, String str, Object... objArr) {
        if (str.hashCode() == -189097425) {
            super.p((String) objArr[0], (Map) objArr[1], (fr8) objArr[2], (List) objArr[3], (bb2.g) objArr[4]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/BindingXSpringHandler");
    }

    public void B(l2m l2mVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56646802", new Object[]{this, l2mVar, new Double(d), new Double(d2)});
            return;
        }
        if (gfh.f19951a) {
            gfh.e(String.format(Locale.getDefault(), "animation end, [value: %f, velocity: %f]", Double.valueOf(d), Double.valueOf(d2)));
        }
        A("end", this.n.b(), this.n.c(), new Object[0]);
    }

    public final Map<String, Object> D(Map<String, Object> map, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7038641", new Object[]{this, map, new Double(d), new Double(d2)});
        }
        if (map == null) {
            return Collections.emptyMap();
        }
        Map<String, Object> f = pxv.f(map, "eventConfig");
        if (f.get("initialVelocity") == null) {
            if (f.isEmpty()) {
                f = new HashMap<>();
            }
            f.put("initialVelocity", Double.valueOf(d2));
        }
        if (f.get("fromValue") == null) {
            if (f.isEmpty()) {
                f = new HashMap<>();
            }
            f.put("fromValue", Double.valueOf(d));
        }
        return f;
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        r();
        deq deqVar = this.n;
        if (deqVar != null) {
            A("end", deqVar.b(), this.n.c(), new Object[0]);
            this.n.g(null);
            this.n.h(null);
            this.n.a();
        }
        return true;
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        return true;
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
            return;
        }
        deq deqVar = this.n;
        if (deqVar != null) {
            A("interceptor", deqVar.b(), this.n.c(), Collections.singletonMap("interceptor", str));
        }
    }

    public final void A(String str, double d, double d2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769be7ea", new Object[]{this, str, new Double(d), new Double(d2), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("position", Double.valueOf(d));
            hashMap.put("velocity", Double.valueOf(d2));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + ",position:" + d + ",velocity:" + d2 + f7l.BRACKET_END_STR);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        double d;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
            return;
        }
        super.p(str, map, fr8Var, list, gVar);
        deq deqVar = this.n;
        if (deqVar != null) {
            double c = deqVar.c();
            double b = this.n.b();
            this.n.a();
            d = c;
            d2 = b;
        } else {
            d2 = vu3.b.GEO_NOT_SUPPORT;
            d = 0.0d;
        }
        deq deqVar2 = new deq();
        this.n = deqVar2;
        deqVar2.h(this);
        this.n.g(this);
        this.n.i(D(this.m, d2, d));
        A("start", this.n.b(), this.n.c(), new Object[0]);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
            return;
        }
        A("exit", ((Double) map.get("p")).doubleValue(), ((Double) map.get("v")).doubleValue(), new Object[0]);
        deq deqVar = this.n;
        if (deqVar != null) {
            deqVar.a();
        }
    }

    public void C(l2m l2mVar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73912faa", new Object[]{this, l2mVar, new Double(d), new Double(d2)});
            return;
        }
        if (gfh.f19951a) {
            gfh.e(String.format(Locale.getDefault(), "animation update, [value: %f, velocity: %f]", Double.valueOf(d), Double.valueOf(d2)));
        }
        try {
            JSMath.applySpringValueToScope(this.d, d, d2);
            if (!t(this.j, this.d)) {
                s(this.f2170a, this.d, cc5.SPRING_SPEC);
            }
        } catch (Exception e) {
            gfh.c("runtime error", e);
        }
    }
}
