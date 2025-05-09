package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s9p extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SELECT_IS_CHECKED = "isChecked";
    public boolean j = false;

    static {
        t2o.a(155189326);
    }

    public static /* synthetic */ Object ipc$super(s9p s9pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/SelectSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        if (!this.c.e().y()) {
            lcuVar.p(new c57(this.e, this.c));
        }
        o();
        this.j = x();
        boolean w = w();
        String r = r(this.e);
        if (r != null) {
            if (r.equals("multiSelect")) {
                u(w);
                return;
            } else if (r.equals("singleSelect")) {
                v(w);
                return;
            }
        }
        p(w);
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d2fc5b", new Object[]{this, new Boolean(z)});
            return;
        }
        y(this.e, !z);
        this.c.d().h(this.e, this.f23048a);
    }

    public final gsb q(List<gsb> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("a97738be", new Object[]{this, list, str});
        }
        if (list != null && !list.isEmpty()) {
            for (gsb gsbVar : list) {
                if (!(gsbVar == null || str == null || !str.equals(gsbVar.getType()))) {
                    return gsbVar;
                }
            }
        }
        return null;
    }

    public final String r(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9c83af6", new Object[]{this, iDMComponent});
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent == null || parent.getFields() == null || parent.getFields().get("groupType") == null) {
            return null;
        }
        return (String) parent.getFields().get("groupType");
    }

    public final IDMComponent t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fc809e8d", new Object[]{this});
        }
        if (this.c.e().y()) {
            return (IDMComponent) this.c.e().s().first;
        }
        return this.e;
    }

    public final void y(IDMComponent iDMComponent, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47b1a01", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isChecked", String.valueOf(z));
            if (this.j) {
                if (z) {
                    str = "sel";
                } else {
                    str = "unsel";
                }
                hashMap.put("state", str);
            }
            k(iDMComponent, hashMap);
            z(iDMComponent, hashMap);
        }
    }

    public final void z(IDMComponent iDMComponent, Map<String, String> map) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6058ed2e", new Object[]{this, iDMComponent, map});
            return;
        }
        Map<String, List<gsb>> eventMap = iDMComponent.getEventMap();
        if (eventMap != null && (list = eventMap.get(this.f23048a.g())) != null) {
            n(q(list, this.f23048a.d()), map);
        }
    }

    public final boolean s(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec65711b", new Object[]{this, iDMComponent})).booleanValue();
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent == null || parent.getFields() == null || parent.getFields().get("optional") == null) {
            return false;
        }
        return parent.getFields().getBoolean("optional").booleanValue();
    }

    public final void u(boolean z) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680ef40f", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent parent = this.e.getParent();
        if (!(parent == null || (children = parent.getChildren()) == null || z)) {
            y(this.e, z);
            int intValue = parent.getFields().getInteger("maxCount").intValue();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (IDMComponent iDMComponent : children) {
                JSONObject fields = iDMComponent.getFields();
                boolean z2 = fields.containsKey("isChecked") && fields.getBoolean("isChecked").booleanValue();
                if (!fields.containsKey("isChecked") && this.j) {
                    z2 = fields.getString("state").equals("sel");
                }
                if (!z2) {
                    arrayList.add(iDMComponent);
                } else {
                    i++;
                }
            }
            if (i >= intValue) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IDMComponent iDMComponent2 = (IDMComponent) it.next();
                    if (iDMComponent2 != null) {
                        String h = ParseModule.h(iDMComponent2);
                        if (!"header".equals(h) && !"footer".equals(h)) {
                            iDMComponent2.getFields().put("status", (Object) "disable");
                        }
                    }
                }
            }
            this.c.d().h(t(), this.f23048a);
        }
    }

    public final void v(boolean z) {
        List<IDMComponent> children;
        IDMComponent t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286131d2", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent parent = this.e.getParent();
        if (!(parent == null || (children = parent.getChildren()) == null)) {
            if (s(this.e)) {
                y(this.e, !z);
            } else {
                y(this.e, true);
            }
            if (this.c.e().y() && (t = t()) != null) {
                List list = (List) t.getExtMap().get("subOperator");
                if (list == null) {
                    list = new ArrayList();
                    t.getExtMap().put("subOperator", list);
                }
                list.add(this.e.getKey());
            }
            for (IDMComponent iDMComponent : children) {
                if (iDMComponent != null) {
                    String h = ParseModule.h(iDMComponent);
                    if (!this.e.equals(iDMComponent) && !"header".equals(h) && !"footer".equals(h)) {
                        y(iDMComponent, false);
                    }
                }
            }
            this.c.d().h(this.e, this.f23048a);
        }
    }

    public final boolean w() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        Object e = this.f23048a.e("viewParams");
        JSONObject fields = this.e.getFields();
        if (fields == null) {
            return false;
        }
        if (e instanceof List) {
            List list = (List) e;
            if (!list.isEmpty()) {
                return !"true".equals(String.valueOf(list.get(0)));
            }
        }
        if (fields.containsKey("isChecked") && fields.getBoolean("isChecked").booleanValue()) {
            z = true;
        }
        return (fields.containsKey("isChecked") || !this.j) ? z : fields.getString("state").equals("sel");
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c80659", new Object[]{this})).booleanValue();
        }
        JSONObject fields = this.e.getFields();
        if (fields == null) {
            return false;
        }
        fsb fsbVar = this.d;
        return (fsbVar instanceof u55) && ((u55) fsbVar).S() && fields.containsKey("state");
    }
}
