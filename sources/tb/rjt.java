package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.c;
import java.util.ArrayList;
import java.util.List;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rjt implements qjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f27428a;

    static {
        t2o.a(815793511);
        t2o.a(815793510);
    }

    public rjt() {
        c cVar = new c();
        this.f27428a = cVar;
        cVar.r("tbsearch_preload");
        cVar.q("taobao://tbsearch_preload");
    }

    public final void a(List<? extends rpc.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc819ee0", new Object[]{this, list});
        } else {
            gxh.o().a(list, 10000L, this.f27428a);
        }
    }

    public void b(List<tjt> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8ddaa8", new Object[]{this, list});
            return;
        }
        ckf.g(list, "tasks");
        ArrayList arrayList = new ArrayList();
        for (tjt tjtVar : list) {
            arrayList.add(new rpc.b(tjtVar.c(), tjtVar.b(), tjtVar.a()));
        }
        a(arrayList);
    }
}
