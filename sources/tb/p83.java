package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.F;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class p83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, yr1> f25931a;
    public final Map<String, List<zr1>> b = new LinkedHashMap();

    static {
        t2o.a(481297552);
    }

    public p83() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25931a = linkedHashMap;
        linkedHashMap.put("nt", new ijj());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            List<zr1> list = (List) entry.getValue();
            if (list != null) {
                for (zr1 zr1Var : list) {
                    zr1Var.a();
                }
            }
        }
        ((LinkedHashMap) this.b).clear();
        ((LinkedHashMap) this.f25931a).clear();
    }

    public final void c(Context context, y73 y73Var, g1a<? super zr1, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f765deda", new Object[]{this, context, y73Var, g1aVar, u1aVar});
            return;
        }
        yr1 yr1Var = (yr1) ((LinkedHashMap) this.f25931a).get(FactoryType.a(y73Var.c()));
        if (yr1Var == null) {
            u1aVar.invoke(-1, "Not Support Card Type");
        } else {
            yr1Var.a(context, y73Var, g1aVar, u1aVar);
        }
    }

    public final void b(Context context, y73 y73Var, g1a<? super zr1, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ff6c5b", new Object[]{this, context, y73Var, g1aVar, u1aVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(g1aVar, "successListener");
        ckf.g(u1aVar, "failureListener");
        if (y73Var == null) {
            u1aVar.invoke(-1, F.a.d);
            return;
        }
        String c = y73Var.c();
        if (TextUtils.isEmpty(c)) {
            u1aVar.invoke(-1, "Invalid Params");
            return;
        }
        List list = (List) ((LinkedHashMap) this.b).get(c);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            c(context, y73Var, g1aVar, u1aVar);
        } else {
            g1aVar.invoke(list.remove(0));
        }
    }
}
