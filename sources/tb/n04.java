package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.AbnormalCollector;
import com.taobao.android.diagnose.collector.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n04 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f24424a;
    public final qk7 b;
    public List<ynb> c = null;
    public a d = null;
    public xh3 e = null;
    public k1v f = null;

    static {
        t2o.a(615514132);
    }

    public n04(Application application, qk7 qk7Var) {
        this.f24424a = application;
        this.b = qk7Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6440b1", new Object[]{this});
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!mk7.l()) {
            idh.b("CollectorManager", "CollectorManager is disable");
        } else {
            this.d = new a(this.f24424a, this.b);
            this.e = new xh3(this.f24424a, this.b);
            this.f = new k1v(this.f24424a, this.b);
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(this.d);
            ((ArrayList) this.c).add(this.e);
            ((ArrayList) this.c).add(this.f);
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((ynb) it.next()).a();
            }
            if (mk7.m.abnormalEnable) {
                AbnormalCollector.j().k();
            }
        }
    }

    public void c(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a13f7", new Object[]{this, aVar});
            return;
        }
        if (mk7.m.abnormalEnable) {
            AbnormalCollector.j().A(aVar);
        }
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.e(aVar);
        }
    }
}
