package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.header.RecyclerViewAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.BaseGoodStateAdapter2;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26481a;
    public com.alibaba.android.ultron.vfw.instance.a b;
    public xmr c;
    public RecyclerViewAdapter o;
    public BaseGoodStateAdapter2 p;
    public final List<RecyclerViewHolder> d = new ArrayList();
    public final Map<IDMComponentsFrameLayout, List<String>> e = new HashMap();
    public final List<RecyclerViewHolder> f = new ArrayList();
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public final wmr q = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wmr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/bean/GLTemplateHelper$1");
        }

        @Override // tb.wmr
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70bbcdf6", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.wmr
        public List<String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("15ead9f2", new Object[]{this});
            }
            return null;
        }

        @Override // tb.wmr
        public void c(List<DXTemplateItem> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429d26de", new Object[]{this, list});
            } else if (list != null && !list.isEmpty()) {
                hha.b("TemplateHelper", "onFinished. finishSize=" + list.size());
                if (!q3a.a(q3a.this).isEmpty() || !q3a.b(q3a.this).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (DXTemplateItem dXTemplateItem : list) {
                        if (!(dXTemplateItem == null || TextUtils.isEmpty(dXTemplateItem.f7343a) || dXTemplateItem.b == 0)) {
                            q3a.c(q3a.this, dXTemplateItem, arrayList);
                        }
                    }
                    if (!arrayList.isEmpty() && q3a.d(q3a.this) != null) {
                        q3a q3aVar = q3a.this;
                        q3a.f(q3aVar, q3a.e(q3aVar) + arrayList.size());
                        q3a.d(q3a.this).U(arrayList);
                    }
                    if (q3a.g(q3a.this) != null && w2s.j()) {
                        a1u.a(q3a.g(q3a.this).getContext(), "模板下载成功，页面刷新");
                        return;
                    }
                    return;
                }
                hha.c("TemplateHelper", "onFinished | no error template.");
            }
        }
    }

    static {
        t2o.a(295699271);
    }

    public static /* synthetic */ List a(q3a q3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84319be5", new Object[]{q3aVar});
        }
        return q3aVar.d;
    }

    public static /* synthetic */ Map b(q3a q3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b15c176", new Object[]{q3aVar});
        }
        return q3aVar.e;
    }

    public static /* synthetic */ void c(q3a q3aVar, DXTemplateItem dXTemplateItem, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be5ee7a", new Object[]{q3aVar, dXTemplateItem, list});
        } else {
            q3aVar.p(dXTemplateItem, list);
        }
    }

    public static /* synthetic */ BaseGoodStateAdapter2 d(q3a q3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseGoodStateAdapter2) ipChange.ipc$dispatch("9370dd1f", new Object[]{q3aVar});
        }
        return q3aVar.p;
    }

    public static /* synthetic */ int e(q3a q3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea464991", new Object[]{q3aVar})).intValue();
        }
        return q3aVar.h;
    }

    public static /* synthetic */ int f(q3a q3aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b917f9a", new Object[]{q3aVar, new Integer(i)})).intValue();
        }
        q3aVar.h = i;
        return i;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a g(q3a q3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("153c3767", new Object[]{q3aVar});
        }
        return q3aVar.b;
    }

    public static String k(RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4295fb", new Object[]{recyclerViewHolder});
        }
        if (recyclerViewHolder == null || recyclerViewHolder.b0() == null) {
            return "";
        }
        return l(recyclerViewHolder.b0());
    }

    public static String l(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43c511ee", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getContainerInfo() == null) {
            return "";
        }
        return iDMComponent.getContainerInfo().getString("name");
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3294b0", new Object[]{this});
            return;
        }
        ((ArrayList) this.d).clear();
        ((HashMap) this.e).clear();
        ((ArrayList) this.f).clear();
    }

    public RecyclerViewHolder i(rew rewVar, ViewGroup viewGroup, int i, IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("fc85606a", new Object[]{this, rewVar, viewGroup, new Integer(i), iDMComponent, new Boolean(z)});
        }
        if (rewVar == null || viewGroup == null) {
            return null;
        }
        RecyclerViewHolder c = rewVar.c(viewGroup, i);
        if (c != null) {
            hha.a("TemplateHelper", "createTemplate | name=" + iDMComponent.getKey() + "   result=" + c.itemView);
        }
        if (z) {
            this.i++;
        } else {
            this.j++;
        }
        if (!pfa.A(iDMComponent) || c == null) {
            if (z) {
                this.k++;
            } else {
                this.m++;
            }
            return c;
        } else if (!this.f26481a) {
            if (!(c.itemView instanceof DXRootView)) {
                if (z) {
                    this.k++;
                } else {
                    this.m++;
                }
            }
            return c;
        } else {
            if (!(c.itemView instanceof DXRootView)) {
                if (z) {
                    if (!((ArrayList) this.d).contains(c)) {
                        ((ArrayList) this.d).add(c);
                    }
                    this.l++;
                } else {
                    ViewGroup f0 = c.f0();
                    if (f0 instanceof IDMComponentsFrameLayout) {
                        List list = (List) ((HashMap) this.e).get(f0);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String l = l(iDMComponent);
                        if (!list.contains(l)) {
                            list.add(l);
                        }
                        if (!((HashMap) this.e).containsKey(f0)) {
                            ((HashMap) this.e).put((IDMComponentsFrameLayout) f0, list);
                        }
                        hha.b("TemplateHelper", "createTemplate | root, templateSize=" + list.size() + "    values=" + c4s.a(list, '&'));
                    }
                    this.n++;
                }
            }
            return c;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        xmr xmrVar = this.c;
        if (xmrVar != null) {
            xmrVar.c();
        }
        h();
        q();
        this.o = null;
        this.p = null;
    }

    public void m(com.alibaba.android.ultron.vfw.instance.a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11374f85", new Object[]{this, aVar});
        } else if (aVar != null && aVar.G() != null) {
            this.b = aVar;
            r = vha.a("gl_first_in_live", true);
            vha.d("gl_first_in_live", false);
            if (!r || !wda.J().booleanValue()) {
                z = false;
            }
            this.f26481a = z;
            hha.b("TemplateHelper", "init | mSwitch=" + this.f26481a + " sFirstInLive=" + r + "   orange=" + wda.J());
            if (this.f26481a) {
                jo7 Q = this.b.G().Q();
                if (Q == null) {
                    hha.b("TemplateHelper", "dinamicXEngineManager is null.");
                    return;
                }
                xmr xmrVar = new xmr(Q.b().k());
                this.c = xmrVar;
                xmrVar.d();
                this.c.b(this.q);
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c4e781", new Object[]{this});
            return;
        }
        if (kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("failTotalHead", Integer.toString(this.k));
            hashMap.put("failTotalBody", Integer.toString(this.m));
            hashMap.put("failFirstHead", Integer.toString(this.l));
            hashMap.put("failFirstBody", Integer.toString(this.n));
            hashMap.put("refreshHead", Integer.toString(this.g));
            hashMap.put("refreshBody", Integer.toString(this.h));
            hashMap.put("createTotalHead", Integer.toString(this.i));
            hashMap.put("createTotalBody", Integer.toString(this.j));
            hashMap.put("sFirstInLive", Boolean.toString(r));
            hashMap.put("trackV", "1");
            hashMap.put("mSwitch", Boolean.toString(this.f26481a));
            if (v2s.o().s() != null) {
                v2s.o().s().a("gl_close", "Page_TaobaoLiveWatch", hashMap);
            }
            kkr.i().o().c("gl_close", hashMap);
        }
        h();
        q();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22730c8f", new Object[]{this});
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96fa969", new Object[]{this});
            return;
        }
        this.g = 0;
        this.h = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.i = 0;
        this.j = 0;
    }

    public void r(BaseGoodStateAdapter2 baseGoodStateAdapter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8be1ba", new Object[]{this, baseGoodStateAdapter2});
        } else {
            this.p = baseGoodStateAdapter2;
        }
    }

    public void s(RecyclerViewAdapter recyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d62025", new Object[]{this, recyclerViewAdapter});
        } else {
            this.o = recyclerViewAdapter;
        }
    }

    public final void p(DXTemplateItem dXTemplateItem, List<IDMComponentsFrameLayout> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3797517", new Object[]{this, dXTemplateItem, list});
            return;
        }
        hha.c("TemplateHelper", "noticeCreateFailedHolders | name=" + dXTemplateItem.f7343a + " version=" + dXTemplateItem.b + "    headSize=" + ((ArrayList) this.d).size() + "    rootBodySize=" + ((HashMap) this.e).size() + "    holderBodySize=" + ((ArrayList) this.f).size());
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) it.next();
            if (TextUtils.equals(dXTemplateItem.f7343a, k(recyclerViewHolder))) {
                it.remove();
                if (this.o != null && recyclerViewHolder != null && recyclerViewHolder.b0() != null) {
                    this.o.W(recyclerViewHolder.b0());
                    this.g++;
                    return;
                }
                return;
            }
        }
        Iterator it2 = ((HashMap) this.e).keySet().iterator();
        while (it2.hasNext()) {
            IDMComponentsFrameLayout iDMComponentsFrameLayout = (IDMComponentsFrameLayout) it2.next();
            List list2 = (List) ((HashMap) this.e).get(iDMComponentsFrameLayout);
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (TextUtils.equals((String) it3.next(), dXTemplateItem.f7343a)) {
                            it3.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                hha.c("TemplateHelper", "noticeCreateFailedHolders | root, templateSize=" + list2.size() + "    values=" + c4s.a(list2, '&'));
                if (list2.isEmpty()) {
                    it2.remove();
                    list.add(iDMComponentsFrameLayout);
                }
            }
        }
    }
}
