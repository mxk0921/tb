package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f22167a;

    static {
        t2o.a(758120471);
    }

    public jqu(Set<String> set, Set<String> set2) {
        this.f22167a = new HashMap(set2.size() + set.size());
        Iterator<String> it = set.iterator();
        int i = 1;
        while (it.hasNext()) {
            this.f22167a.put(it.next() + "_basic", Integer.valueOf(i));
            i++;
        }
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            this.f22167a.put("biz_" + it2.next(), Integer.valueOf(i));
            i++;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0af8439", new Object[]{this})).intValue();
        }
        return ((HashMap) this.f22167a).size();
    }

    public int b(Component component) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc734f63", new Object[]{this, component})).intValue();
        }
        String j = component.j();
        String i = component.i();
        if (!"biz".equals(j)) {
            Map<String, Integer> map = this.f22167a;
            num = (Integer) ((HashMap) map).get(j + "_basic");
        } else {
            Map<String, Integer> map2 = this.f22167a;
            num = (Integer) ((HashMap) map2).get("biz_" + i);
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
