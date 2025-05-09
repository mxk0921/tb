package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m4o implements rjd, qjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<qjd.b> f23772a = new CopyOnWriteArrayList();

    static {
        t2o.a(729809976);
        t2o.a(729809990);
        t2o.a(729809983);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f23772a.clear();
        }
    }

    @Override // tb.rjd
    public void g(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd46fa4d", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            return;
        }
        List<qjd.b> list = this.f23772a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f23772a).iterator();
            while (it.hasNext()) {
                ((qjd.b) it.next()).b(str, str2, awesomeGetData, z);
            }
        }
    }

    @Override // tb.rjd
    public void h(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b9eb1c", new Object[]{this, str, awesomeGetRequestParams, es8Var});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23772a).iterator();
        while (it.hasNext()) {
            qjd.b bVar = (qjd.b) it.next();
            if (bVar instanceof qjd.a) {
                ((qjd.a) bVar).c(str, awesomeGetRequestParams, es8Var);
            }
        }
    }

    @Override // tb.qjd
    public void m(qjd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a4d3f", new Object[]{this, bVar});
            return;
        }
        if (this.f23772a == null) {
            this.f23772a = new CopyOnWriteArrayList();
        }
        this.f23772a.add(bVar);
    }

    @Override // tb.rjd
    public void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7939bdc9", new Object[]{this, str, str2, str3});
            return;
        }
        List<qjd.b> list = this.f23772a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f23772a).iterator();
            while (it.hasNext()) {
                ((qjd.b) it.next()).a(str, str2, str3);
            }
        }
    }

    @Override // tb.rjd
    public void p(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5b5c4f", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            return;
        }
        List<qjd.b> list = this.f23772a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f23772a).iterator();
            while (it.hasNext()) {
                ((qjd.b) it.next()).d(str, awesomeGetRequestParams, str2, z);
            }
        }
    }

    @Override // tb.qjd
    public void r(qjd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d750d3c", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.f23772a.remove(bVar);
        }
    }
}
