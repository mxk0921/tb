package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lcc f20194a;
    public final b12<?, ?, ?, ?, ?> b;
    public final HashMap<String, List<kae<?, ?>>> c = new HashMap<>();
    public final HashMap<String, List<kae<?, ?>>> d = new HashMap<>();
    public final HashMap<String, List<kae<?, ?>>> e = new HashMap<>();
    public final ArrayList<kae<?, ?>> f = new ArrayList<>();

    static {
        t2o.a(993001514);
    }

    public gsi(lcc lccVar, b12<?, ?, ?, ?, ?> b12Var) {
        ckf.g(b12Var, "parentWidget");
        this.f20194a = lccVar;
        this.b = b12Var;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            i(this.e, false);
        }
    }

    public final void b(kae<?, ?> kaeVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f95647", new Object[]{this, kaeVar});
            return;
        }
        View view = kaeVar.getView();
        ckf.d(view);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(kaeVar.getView());
        }
        kaeVar.destroyAndRemoveFromParent();
    }

    public final kae<BaseTypedBean, ?> c(BaseTypedBean baseTypedBean, List<kae<BaseTypedBean, ?>> list) {
        kae<BaseTypedBean, ?> kaeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("fcde9559", new Object[]{this, baseTypedBean, list});
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kae<BaseTypedBean, ?> kaeVar2 = list.get(i);
            if (((kaeVar2 instanceof m8j) && ckf.b(((m8j) kaeVar2).B2(), baseTypedBean)) || ((kaeVar2 instanceof b7x) && ckf.b(((b7x) kaeVar2).u2(), baseTypedBean))) {
                kaeVar = list.remove(i);
                break;
            }
        }
        kaeVar = null;
        if (kaeVar == null) {
            return list.remove(0);
        }
        return kaeVar;
    }

    public final List<kae<?, ?>> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63e92a46", new Object[]{this, str});
        }
        ckf.g(str, "type");
        return this.c.get(str);
    }

    public final List<kae<?, ?>> e(HashMap<String, List<kae<?, ?>>> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b9e93805", new Object[]{this, hashMap, str});
        }
        if (str == null) {
            return null;
        }
        List<kae<?, ?>> list = hashMap.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        hashMap.put(str, arrayList);
        return arrayList;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        this.e.clear();
        this.c.clear();
        i(this.d, true);
        Iterator<kae<?, ?>> it = this.f.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            kae<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            next.destroyAndRemoveFromParent();
        }
        this.f.clear();
    }

    public final kae<BaseTypedBean, ?> h(BaseTypedBean baseTypedBean, String str, a<?, ?> aVar, g1a<? super String, ? extends ay4<gu1, ? extends pwc>> g1aVar, g1a<? super String, ? extends ay4<gu1, ? extends tce>> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("5d7c8467", new Object[]{this, baseTypedBean, str, aVar, g1aVar, g1aVar2});
        }
        ckf.g(baseTypedBean, "bean");
        ckf.g(str, "widgetType");
        ckf.g(aVar, c4o.KEY_DATA_SOURCE);
        ckf.g(g1aVar, "muiseGetter");
        ckf.g(g1aVar2, "weexGetter");
        x02 v2 = this.b.v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        if (kxi.b(baseTypedBean)) {
            TemplateBean template = aVar.getTemplate(baseTypedBean.type);
            if (template != null) {
                Object a2 = ((ay4) g1aVar2.invoke(str)).a(new gu1(v2, template));
                ckf.e(a2, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                return (kae) a2;
            }
        } else if (kxi.a(baseTypedBean)) {
            TemplateBean template2 = aVar.getTemplate(baseTypedBean.type);
            if (template2 != null) {
                Object a3 = ((ay4) g1aVar.invoke(str)).a(new gu1(v2, template2));
                ckf.e(a3, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                return (kae) a3;
            }
        } else {
            kae<BaseTypedBean, ?> a4 = this.b.c().m().a(baseTypedBean.getClass(), v2);
            ckf.e(a4, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
            return a4;
        }
        return null;
    }

    public final void i(HashMap<String, List<kae<?, ?>>> hashMap, boolean z) {
        List<kae<?, ?>> list;
        lcc lccVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6349943c", new Object[]{this, hashMap, new Boolean(z)});
            return;
        }
        Set<String> keySet = hashMap.keySet();
        ckf.f(keySet, "<get-keys>(...)");
        for (String str : keySet) {
            if (!(str == null || (list = hashMap.get(str)) == null)) {
                for (kae<?, ?> kaeVar : list) {
                    if (!z || (lccVar = this.f20194a) == null || !lccVar.a(str)) {
                        b(kaeVar);
                    } else {
                        List<kae<?, ?>> e = e(this.e, str);
                        if (e != null) {
                            e.add(kaeVar);
                        }
                    }
                }
            }
        }
        hashMap.clear();
    }

    public final kae<BaseTypedBean, ?> g(isi isiVar, a<?, ?> aVar, g1a<? super String, ? extends ay4<gu1, ? extends pwc>> g1aVar, g1a<? super String, ? extends ay4<gu1, ? extends tce>> g1aVar2) {
        List<kae<?, ?>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("6d504421", new Object[]{this, isiVar, aVar, g1aVar, g1aVar2});
        }
        ckf.g(isiVar, "mod");
        ckf.g(aVar, c4o.KEY_DATA_SOURCE);
        ckf.g(g1aVar, "muiseGetter");
        ckf.g(g1aVar2, "weexGetter");
        lcc lccVar = this.f20194a;
        kae<BaseTypedBean, ?> kaeVar = null;
        ViewGroup viewGroup = null;
        kaeVar = null;
        kaeVar = null;
        kaeVar = null;
        if (lccVar != null && lccVar.a(isiVar.a().type) && (list = this.e.get(isiVar.a().type)) != null && !list.isEmpty()) {
            kae<BaseTypedBean, ?> c = c(isiVar.a(), kqu.c(list));
            View view = c.getView();
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(c.getView());
            }
            kaeVar = c;
        }
        if (kaeVar == null) {
            kaeVar = h(isiVar.a(), isiVar.b(), aVar, g1aVar, g1aVar2);
        }
        if (kaeVar != null) {
            List<kae<?, ?>> e = e(this.c, isiVar.b());
            if (e != null) {
                e.add(kaeVar);
            }
            if (TextUtils.isEmpty(isiVar.a().type)) {
                this.f.add(kaeVar);
            } else {
                List<kae<?, ?>> e2 = e(this.d, isiVar.a().type);
                if (e2 != null) {
                    e2.add(kaeVar);
                }
            }
        }
        return kaeVar;
    }
}
