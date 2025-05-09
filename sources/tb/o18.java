package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o18 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25080a;
    public DinamicXEngine b;
    public k38 c;
    public i18 e;
    public jf5 f;

    static {
        t2o.a(486539332);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        f18.h();
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
            zm6.g().e(this.b.c());
        }
    }

    public void b(cfc cfcVar, List<BaseSectionModel> list, IDxItemRenderService.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04cf2e0", new Object[]{this, cfcVar, list, bVar, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.c.a(cfcVar, list, arrayList, z);
            this.e.d(arrayList, this.f25080a, bVar);
        }
    }

    public jf5 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jf5) ipChange.ipc$dispatch("47054ef4", new Object[]{this});
        }
        return this.f;
    }

    public void d(cfc cfcVar, DXEngineConfig.b bVar, IDxItemRenderService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3540912d", new Object[]{this, cfcVar, bVar, aVar});
            return;
        }
        fve.e("DxCenter", "initInfoFlowDxEngine");
        DinamicXEngine b = f18.b(bVar, f18.d(cfcVar), aVar);
        this.b = b;
        this.f25080a = b.c();
        this.c = new k38(this.b);
        this.e = new i18(this.b);
        this.f = new jf5(cfcVar, this.b);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.k1();
        }
    }

    public void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789a24b", new Object[]{this, activity});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.l1(activity);
        }
    }

    public void g(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33807f3e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.d().b(z, z2);
        }
        DinamicXEngine.H0(true);
        e();
    }
}
