package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class wa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f30555a = new LinkedHashMap();

    static {
        t2o.a(689963143);
    }

    public final void k(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af1ac4", new Object[]{this, str, list});
            return;
        }
        ckf.g(str, "sender");
        ckf.g(list, "names");
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (!n(str, str2)) {
                arrayList.add(str2);
            }
        }
        List list2 = (List) ((LinkedHashMap) this.f30555a).get(str);
        if (list2 == null) {
            this.f30555a.put(str, arrayList);
        } else {
            list2.addAll(arrayList);
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1441ff49", new Object[]{this})).booleanValue();
        }
        for (List list : ((LinkedHashMap) this.f30555a).values()) {
            if (!list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public abstract void o(bmi bmiVar);

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa05af6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "sender");
        this.f30555a.remove(str);
    }

    public final void q(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d63be7", new Object[]{this, str, list});
            return;
        }
        ckf.g(str, "sender");
        ckf.g(list, "names");
        List list2 = (List) ((LinkedHashMap) this.f30555a).get(str);
        if (list2 != null) {
            list2.removeAll(list);
        }
    }

    public final boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("900db5dd", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "sender");
        ckf.g(str2, "name");
        List list = (List) ((LinkedHashMap) this.f30555a).get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    public final boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f11c1d3", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "sender");
        List list = (List) ((LinkedHashMap) this.f30555a).get(str);
        return list != null && !list.isEmpty();
    }
}
