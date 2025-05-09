package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rew {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EMPTY_VIEW_TYPE = -1;
    public cmj d;
    public final ViewEngine e;
    public jc4 g;
    public xo7 h;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, aae> f27325a = new HashMap<>();
    public final Map<aae, Set<Integer>> b = new HashMap();
    public final Map<aae, Integer> c = new HashMap();
    public final Set<Integer> f = new HashSet();

    static {
        t2o.a(157286760);
    }

    public rew(ViewEngine viewEngine) {
        this.e = viewEngine;
        i();
    }

    public void a(String str, aae aaeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24dc627e", new Object[]{this, str, aaeVar});
            return;
        }
        this.f27325a.put(str, aaeVar);
        Map<aae, Integer> map = this.c;
        map.put(aaeVar, Integer.valueOf(map.size() * 1000));
    }

    public void b(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca458c3", new Object[]{this, recyclerViewHolder, iDMComponent});
        } else if (iDMComponent != null) {
            if (iDMComponent.getStatus() == 0) {
                recyclerViewHolder.itemView.setVisibility(8);
                View view = recyclerViewHolder.itemView;
                int i = R.id.view_holder_origin_height;
                if (view.getTag(i) == null) {
                    if (recyclerViewHolder.itemView.getLayoutParams() != null) {
                        View view2 = recyclerViewHolder.itemView;
                        view2.setTag(i, Integer.valueOf(view2.getLayoutParams().height));
                    } else {
                        recyclerViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        recyclerViewHolder.itemView.setTag(i, -2);
                    }
                }
                recyclerViewHolder.itemView.getLayoutParams().height = 0;
                return;
            }
            recyclerViewHolder.itemView.setVisibility(0);
            Object tag = recyclerViewHolder.itemView.getTag(R.id.view_holder_origin_height);
            if (recyclerViewHolder.itemView.getLayoutParams() != null && (tag instanceof Integer)) {
                recyclerViewHolder.itemView.getLayoutParams().height = ((Integer) tag).intValue();
            }
            if (e(iDMComponent).booleanValue()) {
                this.d.c(recyclerViewHolder, iDMComponent);
            } else {
                aae aaeVar = this.f27325a.get(iDMComponent.getContainerType());
                if (aaeVar != null) {
                    aaeVar.c(recyclerViewHolder, iDMComponent);
                }
            }
            jc4 jc4Var = this.g;
            if (jc4Var != null) {
                jc4Var.b(recyclerViewHolder, iDMComponent, recyclerViewHolder.c0());
            }
        }
    }

    public RecyclerViewHolder c(ViewGroup viewGroup, int i) {
        DXTemplateItem j;
        DXTemplateItem j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af72af69", new Object[]{this, viewGroup, new Integer(i)});
        }
        i0c i0cVar = (i0c) this.e.a0(i0c.class);
        aae h = h(i);
        int intValue = i - ((Integer) ((HashMap) this.c).get(h)).intValue();
        if (h == null) {
            View a2 = mgw.a(this.e.K());
            jc4 jc4Var = this.g;
            if (jc4Var != null) {
                jc4Var.a(viewGroup, i, null);
            }
            return new RecyclerViewHolder(a2);
        } else if (((HashSet) this.f).contains(Integer.valueOf(i)) && i0cVar != null && (j2 = ((xo7) h).j(intValue)) != null) {
            return i0cVar.a(viewGroup, ajt.b(j2));
        } else {
            RecyclerViewHolder a3 = h.a(viewGroup, intValue);
            if (a3.d0()) {
                ((HashSet) this.f).add(Integer.valueOf(i));
                if (!(i0cVar == null || (j = ((xo7) h).j(intValue)) == null)) {
                    return i0cVar.a(viewGroup, ajt.b(j));
                }
            }
            return a3;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xo7 xo7Var = this.h;
        if (xo7Var != null) {
            xo7Var.destroy();
        }
        HashMap<String, aae> hashMap = this.f27325a;
        if (hashMap != null) {
            for (aae aaeVar : hashMap.values()) {
                if (aaeVar != null) {
                    aaeVar.destroy();
                }
            }
        }
    }

    public final Boolean e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("77072418", new Object[]{this, iDMComponent});
        }
        ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
        if (extMap == null) {
            return Boolean.FALSE;
        }
        Object obj = extMap.get(i0c.KEY_DOWNGRADE_STATE);
        if (obj == null || !(obj instanceof Boolean)) {
            return Boolean.FALSE;
        }
        return (Boolean) obj;
    }

    public int f(IDMComponent iDMComponent) {
        aae aaeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26c6ff8", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || TextUtils.isEmpty(iDMComponent.getType()) || TextUtils.isEmpty(iDMComponent.getContainerType()) || (aaeVar = this.f27325a.get(iDMComponent.getContainerType())) == null) {
            return -1;
        }
        int b = aaeVar.b(iDMComponent) + ((Integer) ((HashMap) this.c).get(aaeVar)).intValue();
        l(aaeVar, b);
        return b;
    }

    public aae g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aae) ipChange.ipc$dispatch("c03205bf", new Object[]{this, str});
        }
        return this.f27325a.get(str);
    }

    public final aae h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aae) ipChange.ipc$dispatch("1c148850", new Object[]{this, new Integer(i)});
        }
        for (aae aaeVar : ((HashMap) this.b).keySet()) {
            if (((Set) ((HashMap) this.b).get(aaeVar)).contains(Integer.valueOf(i))) {
                return aaeVar;
            }
        }
        return null;
    }

    public void j(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b7c89", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null && !TextUtils.isEmpty(iDMComponent.getType()) && !TextUtils.isEmpty(iDMComponent.getContainerType())) {
                    aae aaeVar = this.f27325a.get(iDMComponent.getContainerType());
                    if (aaeVar instanceof mx) {
                        ((mx) aaeVar).d(iDMComponent);
                    }
                }
            }
        }
    }

    public void k(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d965d39d", new Object[]{this, str, z9eVar});
        } else {
            this.d.e(str, z9eVar);
        }
    }

    public final void l(aae aaeVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d3e667", new Object[]{this, aaeVar, new Integer(i)});
            return;
        }
        Set set = (Set) ((HashMap) this.b).get(aaeVar);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i));
            ((HashMap) this.b).put(aaeVar, hashSet);
            return;
        }
        set.add(Integer.valueOf(i));
    }

    public void m(jc4 jc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b785387d", new Object[]{this, jc4Var});
        } else {
            this.g = jc4Var;
        }
    }

    public void n(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
            return;
        }
        aae aaeVar = this.f27325a.get("weex2");
        if (aaeVar instanceof h3x) {
            ((h3x) aaeVar).h(fceVar);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewEngine viewEngine = this.e;
        xo7 xo7Var = new xo7(viewEngine, vav.a(viewEngine.I(), "enableDowngradeDXButter", false));
        this.h = xo7Var;
        a("dinamicx", xo7Var);
        a("dinamic", new xo7(this.e));
        cmj cmjVar = new cmj(this.e);
        this.d = cmjVar;
        a("native", cmjVar);
        p1x p1xVar = new p1x(this.e);
        a("weex", p1xVar);
        a("h5", p1xVar);
        a("weex2", new h3x(this.e));
    }
}
