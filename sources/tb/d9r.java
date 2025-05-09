package tb;

import android.content.Context;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ck;
import tb.nj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17669a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(String str, Context context, String str2) {
            this.f17669a = str;
            this.b = context;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            nj b = um0.b(this.f17669a);
            if (b == null) {
                um0.c("purchase", d9r.a());
                return;
            }
            oj.c().h(this.b.getApplicationContext(), b);
            rbb g = ck.g();
            g.e("预加载AURA实例完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), ck.b.b().i("AURA/performance").g("from", this.c).a());
        }
    }

    static {
        t2o.a(708837582);
    }

    public static /* synthetic */ nj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nj) ipChange.ipc$dispatch("3999f903", new Object[0]);
        }
        return c();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("489aff13", new Object[]{str});
            return;
        }
        ck.g().e("清理AURA实例缓存", ck.b.b().i("AURA/performance").a());
        oj.c().a(str);
    }

    public static nj c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nj) ipChange.ipc$dispatch("1722a453", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AURATaobaoPurchasePluginCenter());
        arrayList.add(new AURAAliBuyCorePluginCenter());
        arrayList.addAll(um0.d());
        ArrayList arrayList2 = new ArrayList();
        if ("true".equals(y8r.g("enablePreloadWorkflowV2", "true"))) {
            arrayList2.add(AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW);
            arrayList2.add("aura.workflow.event");
            arrayList2.add("aura.workflow.update");
            arrayList2.add(AliBuyPresenterImpl.PRELOAD_MAIN_PAGE_FLOW);
            arrayList2.add("aura.workflow.adjustRules");
        }
        HashMap hashMap = new HashMap();
        if (th.c()) {
            hashMap.put("enableExtendModules", Boolean.TRUE);
        }
        return new nj.a().i(AliBuyPresenterImpl.DEFAULT_AURA_BUY_CONFIG).j((IAURAPluginCenter[]) arrayList.toArray(new IAURAPluginCenter[0])).f("purchase").k(arrayList2).l(hashMap).g();
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c31ead", new Object[]{context, str, str2});
            return;
        }
        ck.g().e("预加载AURA实例", ck.b.b().i("AURA/performance").g("from", str2).a());
        dn.h(new a(str, context, str2));
    }
}
