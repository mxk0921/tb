package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750515);
    }

    public static boolean a(f6i f6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a2386dc", new Object[]{f6iVar})).booleanValue();
        }
        return b(f6iVar, b5k.f().g());
    }

    public static boolean b(f6i f6iVar, List<d5k> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("589963cd", new Object[]{f6iVar, list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (d5k d5kVar : list) {
            if (c(f6iVar, d5kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(f6i f6iVar, d5k d5kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ee8f4c", new Object[]{f6iVar, d5kVar})).booleanValue();
        }
        if (!TextUtils.equals(f6iVar.i(), d5kVar.i())) {
            return false;
        }
        if (!xk8.c(d5kVar.h()) && xk8.e(d5kVar.h(), f6iVar.h())) {
            return false;
        }
        if (!(xk8.c(d5kVar.g()) || xk8.e(d5kVar.g(), f6iVar.h()))) {
            return false;
        }
        if (!xk8.c(d5kVar.c()) && xk8.e(d5kVar.c(), f6iVar.b())) {
            return false;
        }
        if (!(xk8.c(d5kVar.b()) || xk8.e(d5kVar.b(), f6iVar.b()))) {
            return false;
        }
        if (!xk8.c(d5kVar.e()) && xk8.e(d5kVar.e(), f6iVar.c())) {
            return false;
        }
        if (!(xk8.c(d5kVar.d()) || xk8.e(d5kVar.d(), f6iVar.c()))) {
            return false;
        }
        if (!xk8.d(d5kVar.f())) {
            Map<String, List<y7d>> f = d5kVar.f();
            Map<String, Object> d = f6iVar.d();
            if (d != null) {
                if (f.size() > d.size()) {
                    return false;
                }
                for (Map.Entry<String, List<y7d>> entry : f.entrySet()) {
                    List<y7d> value = entry.getValue();
                    if (!(xk8.c(value) || xk8.e(value, (String) d.get(entry.getKey())))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean d(f6i f6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743f057b", new Object[]{f6iVar})).booleanValue();
        }
        return b(f6iVar, b5k.f().e());
    }

    public static boolean e(f6i f6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8d6272", new Object[]{f6iVar})).booleanValue();
        }
        if (f6iVar == null) {
            return true;
        }
        List<d5k> g = b5k.f().g();
        List<d5k> e = b5k.f().e();
        if (((g == null || g.size() == 0) && (e == null || e.size() == 0)) || d(f6iVar) || !a(f6iVar)) {
            return true;
        }
        return false;
    }
}
