package tb;

import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.android.ultron.engine.protocol.Container;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bn4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286475);
    }

    public static void a(List<ComponentView> list, knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ae1b0f", new Object[]{list, knmVar});
            return;
        }
        ComponentView f = knmVar.f();
        if (f != null) {
            list.add(f);
        }
        List<knm> d = knmVar.d();
        if (!(d == null || d.isEmpty())) {
            for (knm knmVar2 : d) {
                a(list, knmVar2);
            }
        }
    }

    public static Container b(u1n u1nVar) {
        knm knmVar;
        ComponentView f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("7d1605ce", new Object[]{u1nVar});
        }
        if (u1nVar.e()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ol7> entry : u1nVar.a().n().entrySet()) {
                String key = entry.getKey();
                if (!(!"insert".equals(entry.getValue().f25456a) || (knmVar = u1nVar.a().m().get(key)) == null || (f = knmVar.f()) == null)) {
                    arrayList.add(f);
                }
            }
            Container container = new Container();
            container.data = arrayList;
            return container;
        }
        knm b = u1nVar.b();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2, b);
        Container container2 = new Container();
        container2.data = arrayList2;
        return container2;
    }
}
