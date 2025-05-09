package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yr6 extends xu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<xu> b = new ArrayList();

    static {
        t2o.a(479199288);
    }

    public yr6(zxb zxbVar) {
        super(zxbVar);
        i(new wxf(zxbVar));
        i(new pb7(zxbVar));
        i(new ar6(zxbVar));
        i(new sip(zxbVar));
        i(new zxl(zxbVar));
    }

    public static /* synthetic */ Object ipc$super(yr6 yr6Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.b();
            return null;
        } else if (hashCode == 157339494) {
            super.a((RequestConfig) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/icart/core/data/chain/DataProcessChain");
        }
    }

    @Override // tb.xu
    public void a(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960cf66", new Object[]{this, requestConfig});
            return;
        }
        super.a(requestConfig);
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).a(requestConfig);
        }
    }

    @Override // tb.xu
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).b();
        }
    }

    @Override // tb.xu
    public void c(RequestConfig requestConfig, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44921fd3", new Object[]{this, requestConfig, mtopResponse});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).c(requestConfig, mtopResponse);
        }
    }

    @Override // tb.xu
    public void d(RequestConfig requestConfig, MtopResponse mtopResponse, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86508c8", new Object[]{this, requestConfig, mtopResponse, fsbVar});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).d(requestConfig, mtopResponse, fsbVar);
        }
    }

    @Override // tb.xu
    public void e(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc977bbd", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).e(fsbVar, requestConfig);
        }
    }

    @Override // tb.xu
    public void f(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca381e", new Object[]{this, fsbVar, requestConfig});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((xu) it.next()).f(fsbVar, requestConfig);
        }
        u55 u55Var = (u55) this.f31607a.c();
        if (u55Var != null) {
            List<IDMComponent> n = u55Var.n();
            if (n != null) {
                for (int i = 0; i < n.size(); i++) {
                    IDMComponent iDMComponent = n.get(i);
                    Iterator it2 = ((ArrayList) this.b).iterator();
                    while (it2.hasNext()) {
                        ((xu) it2.next()).h(iDMComponent, i, n.size());
                    }
                }
            }
            List<IDMComponent> components = u55Var.getComponents();
            for (int i2 = 0; i2 < components.size(); i2++) {
                IDMComponent iDMComponent2 = components.get(i2);
                Iterator it3 = ((ArrayList) this.b).iterator();
                while (it3.hasNext()) {
                    ((xu) it3.next()).g(iDMComponent2, i2, components.size());
                }
            }
        }
    }

    public void i(xu xuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177cb5e7", new Object[]{this, xuVar});
        } else {
            this.b.add(xuVar);
        }
    }
}
