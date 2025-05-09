package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import tb.hj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27373a;
    public final DinamicXEngine b;
    public iwb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTemplateItem f27374a;
        public final /* synthetic */ b b;

        public a(DXTemplateItem dXTemplateItem, b bVar) {
            this.f27374a = dXTemplateItem;
            this.b = bVar;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            boolean z = true;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null) {
                Iterator<DXTemplateItem> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DXTemplateItem next = it.next();
                    if (Objects.equals(next.f7343a, this.f27374a.f7343a) && next.b == this.f27374a.b) {
                        rh.a(rh.this, this.b, next);
                        z2 = true;
                        break;
                    }
                }
                if (!z2 && k66Var.b != null) {
                    for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                        if (Objects.equals(dXTemplateItem.f7343a, this.f27374a.f7343a) && dXTemplateItem.b == this.f27374a.b) {
                            ((hj.a) this.b).b("TplDownloadFail", null);
                            break;
                        }
                    }
                }
                z = z2;
                if (z) {
                    rh.d(rh.this).f1(rh.b(rh.this));
                    rh.c(rh.this, null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
    }

    static {
        t2o.a(81789107);
    }

    public rh(Context context, DinamicXEngine dinamicXEngine) {
        this.f27373a = context;
        this.b = dinamicXEngine;
    }

    public static /* synthetic */ void a(rh rhVar, b bVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6fbec", new Object[]{rhVar, bVar, dXTemplateItem});
        } else {
            rhVar.e(bVar, dXTemplateItem);
        }
    }

    public static /* synthetic */ iwb b(rh rhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("11f735f9", new Object[]{rhVar});
        }
        return rhVar.c;
    }

    public static /* synthetic */ iwb c(rh rhVar, iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("a5522693", new Object[]{rhVar, iwbVar});
        }
        rhVar.c = iwbVar;
        return iwbVar;
    }

    public static /* synthetic */ DinamicXEngine d(rh rhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("889241a5", new Object[]{rhVar});
        }
        return rhVar.b;
    }

    public final void e(b bVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1287375b", new Object[]{this, bVar, dXTemplateItem});
            return;
        }
        DXResult<DXRootView> o = this.b.o(this.f27373a, dXTemplateItem);
        DXRootView dXRootView = o.f7291a;
        if (dXRootView != null) {
            ((hj.a) bVar).a(dXRootView);
        } else {
            ((hj.a) bVar).b("NullDxRooView", o.a());
        }
    }

    public void f(b bVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68364c4", new Object[]{this, bVar, dXTemplateItem});
        } else if (dXTemplateItem != null) {
            DXTemplateItem u = this.b.u(dXTemplateItem);
            if (u == null || u.b != dXTemplateItem.b) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dXTemplateItem);
                this.b.p(arrayList);
                a aVar = new a(dXTemplateItem, bVar);
                this.c = aVar;
                this.b.j(aVar);
                return;
            }
            e(bVar, u);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        iwb iwbVar = this.c;
        if (iwbVar != null) {
            this.b.f1(iwbVar);
        }
    }
}
