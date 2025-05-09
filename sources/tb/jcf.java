package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jcf implements DetailDataManager.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SECOND_PLACE_HOLDER_NID = "localSecondPlaceHolderNid";

    /* renamed from: a  reason: collision with root package name */
    public dh7 f21916a;
    public DetailDataManager b;
    public cxj c;

    static {
        t2o.a(352321857);
        t2o.a(352321773);
    }

    public jcf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager) {
        this.c = cxjVar;
        this.f21916a = dh7Var;
        this.b = detailDataManager;
    }

    private static ue7 f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("9fa25fe7", new Object[]{aVar});
        }
        ue7 ue7Var = new ue7(aVar);
        ue7Var.F = true;
        ue7Var.f31127a = 1;
        ue7Var.h = SECOND_PLACE_HOLDER_NID;
        ue7Var.b = aVar.s();
        ue7Var.z = false;
        return ue7Var;
    }

    private void i(ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a827331", new Object[]{this, ue7Var});
        } else if (!this.c.j().s0()) {
            xq0.c().a(this.c.i()).c(ue7Var.J0());
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean a(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4dbdb90", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void b(boolean z, String str, x3w x3wVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1736fd2", new Object[]{this, new Boolean(z), str, x3wVar, new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean c(boolean z, int i, JSONObject jSONObject, List<x3w> list, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309da830", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        n(z, jSONObject, list);
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public boolean d(boolean z, String str, int i, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ac07a4", new Object[]{this, new Boolean(z), str, new Integer(i), x3wVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.d
    public void e(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc90181d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (z) {
        } else {
            if (i2 == 1) {
                this.f21916a.O0(ListViewManager.ListStatus.STATUS_LAST_PAGE);
            } else if (i2 == 2) {
                this.f21916a.O0(ListViewManager.ListStatus.STATUS_LOADING);
            } else if (i2 == 3) {
                this.f21916a.O0(ListViewManager.ListStatus.STATUS_PULL_LOAD_MORE);
            }
        }
    }

    public void g(boolean z, boolean z2, String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd61b23", new Object[]{this, new Boolean(z), new Boolean(z2), str, x3wVar});
        } else if (x3wVar != null) {
            m(x3wVar, str);
            j(z, x3wVar);
            k(z2, str, x3wVar);
            l(x3wVar, str);
        }
    }

    public void j(boolean z, x3w x3wVar) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37316a1", new Object[]{this, new Boolean(z), x3wVar});
            return;
        }
        DetailDataManager detailDataManager = this.b;
        if (!z || x3wVar.P()) {
            z2 = false;
        }
        detailDataManager.Y(z2);
        if (z && (x3wVar instanceof ue7) && x3wVar.N()) {
            ue7 ue7Var = (ue7) x3wVar;
            xmo.A(this.c, ue7Var);
            xmo.v(this.c, ue7Var);
        }
    }

    public void k(boolean z, String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7730903", new Object[]{this, new Boolean(z), str, x3wVar});
        } else if (this.f21916a.K() == null || this.f21916a.K().size() <= 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(x3wVar);
            if (r19.K0()) {
                arrayList.add(f(x3wVar.C()));
            }
            this.f21916a.A0(arrayList);
        } else if (z) {
            this.f21916a.B0(true, str, x3wVar);
        } else {
            this.f21916a.B0(false, str, x3wVar);
        }
    }

    public void l(x3w x3wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b1b367", new Object[]{this, x3wVar, str});
        } else if (!x3wVar.F) {
            bxj h = this.c.h();
            q0j.x(h, q0j.SECTION_FIRST_UI_DATA_REFRESH, "itemId=" + str);
            bxj h2 = this.c.h();
            q0j.z(h2, q0j.SECTION_FIRST_RECYCLERVIEW, "itemId=" + str);
        } else {
            bxj h3 = this.c.h();
            q0j.x(h3, q0j.SECTION_FIRST_UI_DATA_REFRESH_PRE, "itemId=" + str);
            bxj h4 = this.c.h();
            q0j.z(h4, q0j.SECTION_FIRST_RECYCLERVIEW_PRE, "itemId=" + str);
        }
    }

    public void m(x3w x3wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bef081a", new Object[]{this, x3wVar, str});
        } else if (!x3wVar.F) {
            bxj h = this.c.h();
            q0j.z(h, q0j.SECTION_FIRST_UI_DATA_REFRESH, "itemId=" + str);
        } else {
            bxj h2 = this.c.h();
            q0j.z(h2, q0j.SECTION_FIRST_UI_DATA_REFRESH_PRE, "itemId=" + str);
        }
    }

    private void n(boolean z, JSONObject jSONObject, List<x3w> list) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28ef82", new Object[]{this, new Boolean(z), jSONObject, list});
        } else if (jSONObject != null && list != null) {
            this.c.j().m1(jSONObject.getJSONObject("weexPassGlobalParams"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("pageParams");
            if (DetailDataManager.W(z, jSONObject3 != null ? jSONObject3.getIntValue("pageNum") : -1)) {
                x3w x3wVar = list.get(0);
                if (x3wVar == null) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = x3wVar.B();
                }
                this.c.j().T0(jSONObject.getJSONObject("configSwitches"), jSONObject2);
                xmo.B(Global.getApplication(), jSONObject2.getJSONObject("optimizeConfig"));
                xmo.z(Global.getApplication(), jSONObject2);
            }
        }
    }
}
