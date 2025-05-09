package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f31477a;
    public final List<wmr> b = new ArrayList();
    public final iwb c = new a();

    static {
        t2o.a(295699286);
    }

    public xmr(DinamicXEngine dinamicXEngine) {
        this.f31477a = dinamicXEngine;
    }

    public static /* synthetic */ List a(xmr xmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72ead2fa", new Object[]{xmrVar});
        }
        return xmrVar.b;
    }

    public void b(wmr wmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4d2516", new Object[]{this, wmrVar});
        } else if (wmrVar != null && !((ArrayList) this.b).contains(wmrVar)) {
            ((ArrayList) this.b).add(wmrVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((ArrayList) this.b).clear();
        f();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            e();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
        } else {
            this.f31477a.j(this.c);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a503d97", new Object[]{this});
        } else {
            this.f31477a.f1(this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null && k66Var.f22428a != null) {
                hha.b("TBLiveTemplateHelper", "onNotificationListener | size=" + k66Var.f22428a.size());
                for (wmr wmrVar : xmr.a(xmr.this)) {
                    if (wmrVar.a()) {
                        wmrVar.c(k66Var.f22428a);
                    } else {
                        List<String> b = wmrVar.b();
                        if (b != null) {
                            ArrayList arrayList = new ArrayList();
                            for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                                if (b.contains(dXTemplateItem.f7343a)) {
                                    arrayList.add(dXTemplateItem);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                wmrVar.c(arrayList);
                            }
                        }
                    }
                }
                if (k66Var.b != null) {
                    for (int i = 0; i < k66Var.b.size(); i++) {
                        hha.c("TBLiveTemplateHelper", "onFinished | failed:" + k66Var.b.get(i).f7343a + " version=" + k66Var.b.get(i).b);
                    }
                }
            }
        }
    }
}
