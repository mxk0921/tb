package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ylm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<xlm> f32169a;

    static {
        t2o.a(1022361889);
    }

    public ylm(Map<?, ?> map) {
        ckf.g(map, "data");
        ht4.c(map, "code");
        Object obj = map.get("users");
        ArrayList arrayList = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                xlm xlmVar = map2 != null ? new xlm(map2) : null;
                if (xlmVar != null) {
                    arrayList2.add(xlmVar);
                }
            }
            arrayList = arrayList2;
        }
        this.f32169a = arrayList;
    }

    public final List<xlm> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bc1c54e", new Object[]{this});
        }
        return this.f32169a;
    }
}
