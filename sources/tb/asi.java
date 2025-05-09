package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.CellList;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class asi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ResultError f15977a;
    public osi<asi> b;
    public List<BaseCellBean> e;
    public int f;
    public Boolean h;
    public boolean i;
    public r5j.a k;
    public JSONObject l;
    public int m;
    public boolean n;
    public MetaState c = MetaState.DEFAULT;
    public final List<BaseCellBean> d = new ArrayList();
    public ListStyle g = ListStyle.LIST;
    public final SearchParamImpl j = new SearchParamImpl();
    public int o = -1;

    static {
        t2o.a(993001485);
    }

    public final void A(int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c962f38", new Object[]{this, new Integer(i), baseCellBean});
            return;
        }
        ckf.g(baseCellBean, WXBasicComponentType.CELL);
        if (i >= 0 && i < ((ArrayList) this.d).size()) {
            BaseCellBean baseCellBean2 = (BaseCellBean) ((ArrayList) this.d).get(i);
            ((ArrayList) this.d).set(i, baseCellBean);
            t().set(i, baseCellBean);
            baseCellBean.combo = this;
            baseCellBean.comboRealIndex = baseCellBean2.comboRealIndex;
            baseCellBean.comboIndex = baseCellBean2.comboIndex;
            baseCellBean.comboType = baseCellBean2.comboType;
        }
    }

    public void B(BaseCellBean baseCellBean, BaseCellBean baseCellBean2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542cc80a", new Object[]{this, baseCellBean, baseCellBean2});
            return;
        }
        ckf.g(baseCellBean2, "newBean");
        t().set(i04.f0(t(), baseCellBean), baseCellBean2);
        baseCellBean2.combo = this;
        if (this.i || baseCellBean2.isSection) {
            z = true;
        }
        this.i = z;
        this.n = true;
    }

    public void C(asi asiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc685984", new Object[]{this, asiVar, new Integer(i)});
            return;
        }
        ckf.g(asiVar, "combo");
        List<BaseCellBean> t = t();
        int size = t.size() - 1;
        if (i <= size) {
            while (true) {
                t.remove(size);
                if (size == i) {
                    break;
                }
                size--;
            }
        }
        x(asiVar);
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    public final void E(r5j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9dea6f", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    public final void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9140b", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    public final void G(int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3543ca", new Object[]{this, new Integer(i), baseCellBean});
            return;
        }
        ckf.g(baseCellBean, "bean");
        if (i >= 0 && i < t().size()) {
            baseCellBean.comboRealIndex = t().get(i).comboRealIndex;
            t().set(i, baseCellBean);
        }
    }

    public final void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac17a7b", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b66936", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final void J(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf2e5f2", new Object[]{this, bool});
        } else {
            this.h = bool;
        }
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fd0260", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void L(osi<asi> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a5fba3", new Object[]{this, osiVar});
        } else {
            this.b = osiVar;
        }
    }

    public final void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddaebb93", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void O(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9cfc98", new Object[]{this, resultError});
        } else {
            this.f15977a = resultError;
        }
    }

    public final void P(MetaState metaState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12ca6b0", new Object[]{this, metaState});
            return;
        }
        ckf.g(metaState, "<set-?>");
        this.c = metaState;
    }

    public final List<ComboOp> Q() {
        List<ComboOp> l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5519e777", new Object[]{this});
        }
        List<ComboOp> list = null;
        if (!this.n) {
            return null;
        }
        e();
        int i = this.m;
        if (i != 0) {
            if (i == ((ArrayList) this.d).size()) {
                int i2 = this.f;
                l = xz3.e(ComboOp.b(i2, ((ArrayList) this.d).size() + i2));
            } else if (this.m > ((ArrayList) this.d).size()) {
                l = xz3.e(ComboOp.d(this.f, this.m, ((ArrayList) this.d).size()));
            } else {
                int size = ((ArrayList) this.d).size() - this.m;
                int size2 = this.f + ((ArrayList) this.d).size();
                l = yz3.l(ComboOp.c(size2 - size, size2), ComboOp.b(this.f, size2));
            }
            list = l;
            this.n = false;
            this.m = ((ArrayList) this.d).size();
        }
        return list;
    }

    public void R(asi asiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512668c4", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        t().clear();
        c(asiVar.t());
        this.i = asiVar.i;
        this.h = asiVar.h;
    }

    public void a(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812529fc", new Object[]{this, baseCellBean});
            return;
        }
        ckf.g(baseCellBean, WXBasicComponentType.CELL);
        this.n = true;
        t().add(baseCellBean);
        baseCellBean.combo = this;
    }

    public void b(int i, List<BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e5bb1d", new Object[]{this, new Integer(i), list});
            return;
        }
        ckf.g(list, "cellList");
        this.n = true;
        t().addAll(i, list);
        for (BaseCellBean baseCellBean : list) {
            baseCellBean.combo = this;
        }
    }

    public void c(List<BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182222a8", new Object[]{this, list});
            return;
        }
        ckf.g(list, "cellList");
        b(t().size(), list);
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef209c8", new Object[]{this, new Integer(i)});
        } else {
            this.e = new CellList(i);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900da95", new Object[]{this});
            return;
        }
        this.m = ((ArrayList) this.d).size();
        ((ArrayList) this.d).clear();
        ((ArrayList) this.d).addAll(t());
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14478b", new Object[]{this});
            return;
        }
        this.n = true;
        t().clear();
    }

    public final r5j.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("484b47db", new Object[]{this});
        }
        return this.k;
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5972c31", new Object[]{this});
        }
        return this.l;
    }

    public final BaseCellBean i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("47b99824", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= ((ArrayList) this.d).size()) {
            return null;
        }
        return (BaseCellBean) ((ArrayList) this.d).get(i);
    }

    public final List<BaseCellBean> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a701b165", new Object[]{this});
        }
        return this.d;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b728f54", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public final Boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2249422c", new Object[]{this});
        }
        return this.h;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abf26ec", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final osi<asi> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("312d0231", new Object[]{this});
        }
        return this.b;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4221d057", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final ListStyle p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fbfbe301", new Object[]{this});
        }
        return this.g;
    }

    public final ResultError q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultError) ipChange.ipc$dispatch("805a2352", new Object[]{this});
        }
        return this.f15977a;
    }

    public final SearchParamImpl r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("160750d", new Object[]{this});
        }
        return this.j;
    }

    public final MetaState s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaState) ipChange.ipc$dispatch("9d4ffa98", new Object[]{this});
        }
        return this.c;
    }

    public final List<BaseCellBean> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cfb3259", new Object[]{this});
        }
        List<BaseCellBean> list = this.e;
        if (list != null) {
            return list;
        }
        CellList cellList = new CellList();
        this.e = cellList;
        return cellList;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2b2258a", new Object[]{this})).booleanValue();
        }
        if (t().size() > 0) {
            return true;
        }
        return false;
    }

    public boolean v(BaseCellBean baseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccb6932a", new Object[]{this, baseCellBean, new Integer(i)})).booleanValue();
        }
        ckf.g(baseCellBean, "bean");
        if (i < 0) {
            i = 0;
        } else if (i > t().size()) {
            i = t().size();
        }
        t().add(i, baseCellBean);
        this.n = true;
        return true;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.h;
        if (bool == null) {
            return false;
        }
        ckf.d(bool);
        if (bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public void x(asi asiVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd5a9b3", new Object[]{this, asiVar});
            return;
        }
        ckf.g(asiVar, "combo");
        c(asiVar.t());
        if (!this.i && !asiVar.i) {
            z = false;
        }
        this.i = z;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bee0e9", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((BaseCellBean) it.next()).forceUpdate = true;
        }
    }

    public boolean z(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86caf30c", new Object[]{this, baseCellBean})).booleanValue();
        }
        ckf.g(baseCellBean, "bean");
        int indexOf = t().indexOf(baseCellBean);
        if (indexOf < 0) {
            return false;
        }
        t().remove(indexOf);
        this.n = true;
        return true;
    }

    public final void N(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "value");
        this.g = listStyle;
        this.n = true;
        y();
    }
}
