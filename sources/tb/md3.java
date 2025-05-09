package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class md3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHECKED_ITEMS_CHECKED = "checkedItems";
    public static final String KEY_SELECT_IS_CHECKED = "isChecked";
    public final List<IDMComponent> l = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSelectSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            md3.p(md3.this);
            md3.q(false);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                md3.q(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f23964a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public b(lcu lcuVar, boolean z, boolean z2) {
            this.f23964a = lcuVar;
            this.b = z;
            this.c = z2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSelectSubscriber$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            md3.p(md3.this);
            lcu lcuVar = this.f23964a;
            if (lcuVar != null) {
                Object e = lcuVar.e("requestFailCallback");
                if (e instanceof Runnable) {
                    ((Runnable) e).run();
                }
            }
            if (this.b) {
                md3.q(false);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            md3.u(md3.this, this.c);
            lcu lcuVar = this.f23964a;
            if (lcuVar != null) {
                Object e = lcuVar.e("requestSuccessCallback");
                if (e instanceof Runnable) {
                    ((Runnable) e).run();
                }
            }
            if (h0r.g()) {
                md3.v(md3.this);
            }
            if (this.b) {
                md3.q(true);
            }
        }
    }

    static {
        t2o.a(479199414);
    }

    public static /* synthetic */ IDMComponent A(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("3498d1e4", new Object[]{md3Var});
        }
        return md3Var.e;
    }

    public static /* synthetic */ IDMComponent B(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("7dafd883", new Object[]{md3Var});
        }
        return md3Var.e;
    }

    public static void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd8b6d0", new Object[]{new Boolean(z)});
        } else {
            ub3.m("CheckAll", "总耗时", z, 1.0f, null);
        }
    }

    public static /* synthetic */ Object ipc$super(md3 md3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartSelectSubscriber");
    }

    public static /* synthetic */ void p(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ce64e8", new Object[]{md3Var});
        } else {
            md3Var.R();
        }
    }

    public static /* synthetic */ void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ccc71c", new Object[]{new Boolean(z)});
        } else {
            E(z);
        }
    }

    public static /* synthetic */ zxb r(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("9060a1c7", new Object[]{md3Var});
        }
        return md3Var.k;
    }

    public static /* synthetic */ fsb s(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("d4313118", new Object[]{md3Var});
        }
        return md3Var.d;
    }

    public static /* synthetic */ Context t(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5242888f", new Object[]{md3Var});
        }
        return md3Var.b;
    }

    public static /* synthetic */ void u(md3 md3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6781e26e", new Object[]{md3Var, new Boolean(z)});
        } else {
            md3Var.F(z);
        }
    }

    public static /* synthetic */ void v(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85cfd45", new Object[]{md3Var});
        } else {
            md3Var.D();
        }
    }

    public static /* synthetic */ zxb w(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("64fb5452", new Object[]{md3Var});
        }
        return md3Var.k;
    }

    public static /* synthetic */ zxb x(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("a57669f1", new Object[]{md3Var});
        }
        return md3Var.k;
    }

    public static /* synthetic */ kmb y(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("f0c0b6b", new Object[]{md3Var});
        }
        return md3Var.j;
    }

    public static /* synthetic */ IDMComponent z(md3 md3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("eb81cb45", new Object[]{md3Var});
        }
        return md3Var.e;
    }

    public final boolean C(boolean z, boolean z2, lcu lcuVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56b1551d", new Object[]{this, new Boolean(z), new Boolean(z2), lcuVar})).booleanValue();
        }
        if (!zvj.a(Globals.getApplication())) {
            be3.c(this.b, Localization.q(R.string.app_network_error));
            R();
            return false;
        } else if (N(z2)) {
            return false;
        } else {
            if (sca.E(this.k)) {
                List<IDMComponent> v = cb4.v(this.d);
                if (v != null) {
                    i = v.size();
                } else {
                    i = 0;
                }
                if (P(i) || z2 || sca.z(this.k)) {
                    if (z) {
                        if (h0r.l()) {
                            R();
                        }
                        this.j.N().a();
                    }
                    U(false, lcuVar, z2);
                    return true;
                }
                R();
                return false;
            }
            R();
            return false;
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2dc812", new Object[]{this});
            return;
        }
        List<IDMComponent> v = cb4.v(this.d);
        if (v.size() == 1) {
            pav.k(new c(v));
        }
    }

    public final void F(boolean z) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c949c0", new Object[]{this, new Boolean(z)});
        } else if (z && !this.k.K() && (components = this.k.c().getComponents()) != null) {
            for (IDMComponent iDMComponent : components) {
                String tag = iDMComponent.getTag();
                if ("bundle".equals(tag) || "item".equals(tag) || "shop".equals(tag)) {
                    boolean a2 = cb4.a(iDMComponent);
                    boolean P = cb4.P(iDMComponent);
                    if (!a2 && P) {
                        cb4.b0(iDMComponent, "false", "isChecked");
                    }
                }
            }
        }
    }

    public final gsb G(List<gsb> list, String str) {
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

    public final String H(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77d5b719", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        List<String> b2 = bd4.b(list);
        if (b2 == null || b2.size() < 1) {
            return "";
        }
        for (int i = 0; i < b2.size(); i++) {
            String str = b2.get(i);
            sb.append(str.substring(str.indexOf("_") + 1));
            if (i < b2.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final IDMComponent I(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("dfa840b6", new Object[]{this, lcuVar});
        }
        Object e = lcuVar.e("eventParamOriginTriggerModel");
        if (e instanceof IDMComponent) {
            return (IDMComponent) e;
        }
        return null;
    }

    public final List<IDMComponent> K(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f8506bf0", new Object[]{this, iDMComponent, new Boolean(z)});
        }
        List<IDMComponent> D = cb4.D(iDMComponent, this.j);
        for (IDMComponent iDMComponent2 : D) {
            if (!iDMComponent2.getFields().getBooleanValue("isInvalid") || this.k.K()) {
                V(iDMComponent2, z);
            }
        }
        return D;
    }

    public final List<IDMComponent> L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b8f5183", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        IDMComponent parent = this.e.getParent();
        if (parent == null) {
            return arrayList;
        }
        for (IDMComponent iDMComponent : parent.getChildren()) {
            if (!(iDMComponent == null || iDMComponent.getChildren() == null || iDMComponent.getChildren().isEmpty())) {
                for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                    if (iDMComponent2 != null && "item".equals(iDMComponent2.getTag()) && cb4.b(Q(), iDMComponent2)) {
                        V(iDMComponent2, z);
                        arrayList.addAll(K(iDMComponent2, z));
                        arrayList.add(iDMComponent2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<IDMComponent> M(boolean z) {
        List<IDMComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("77b67921", new Object[]{this, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        u55 u55Var = (u55) this.d;
        List<IDMComponent> n = u55Var.n();
        if (sca.x(this.k)) {
            if (this.k.L()) {
                list = this.j.e().h0().getComponents();
            } else {
                list = u55Var.getComponents();
            }
            if (list == null) {
                return arrayList;
            }
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    String tag = iDMComponent.getTag();
                    if (("shop".equals(tag) || "bundleHeader".equals(tag)) && cb4.b(Q(), iDMComponent)) {
                        V(iDMComponent, z);
                    } else if ("item".equals(tag) && cb4.b(Q(), iDMComponent)) {
                        V(iDMComponent, z);
                        arrayList.addAll(K(iDMComponent, z));
                        arrayList.add(iDMComponent);
                    }
                }
            }
            return arrayList;
        } else if (n == null) {
            return arrayList;
        } else {
            for (IDMComponent iDMComponent2 : n) {
                if (iDMComponent2 != null) {
                    String tag2 = iDMComponent2.getTag();
                    if (z || !cb4.T(iDMComponent2)) {
                        if (("shop".equals(tag2) || "bundleHeader".equals(tag2)) && cb4.b(Q(), iDMComponent2)) {
                            V(iDMComponent2, z);
                        } else if ("item".equals(tag2) && cb4.b(Q(), iDMComponent2)) {
                            V(iDMComponent2, z);
                            arrayList.addAll(K(iDMComponent2, z));
                            arrayList.add(iDMComponent2);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public final boolean N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57840b55", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z && this.k.K() && !cb4.a(this.e) && (!"item".equals(this.e.getTag()) || !cb4.R(this.e))) {
            return true;
        }
        return false;
    }

    public final boolean P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b57bd676", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (sca.k(this.k) >= i) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e42ab7", new Object[]{this})).booleanValue();
        }
        return this.k.K();
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36691b2", new Object[]{this});
            return;
        }
        cb4.c(this.d);
        cb4.W(this.d, this.j);
        this.j.e().D();
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5049725", new Object[]{this});
        } else {
            this.j.V().g();
        }
    }

    public final void U(boolean z, lcu lcuVar, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4445901", new Object[]{this, new Boolean(z), lcuVar, new Boolean(z2)});
            return;
        }
        if (CheckHoldManager.i().e() == 0) {
            str = this.b.getString(R.string.cart_promotion_calculate_totalTitle_heji);
        } else {
            str = this.b.getString(R.string.cart_promotion_calculate_totalTitle_youhuiqian);
        }
        cb4.d(this.d, this.b.getString(R.string.cart_promotion_calculate), str);
        cb4.W(this.d, this.j);
        this.j.k0(this.e, this.f23048a, z, new b(lcuVar, z2, this.k.K()), null);
    }

    public final void V(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47b1a01", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isChecked", String.valueOf(z));
            k(iDMComponent, hashMap);
            X(iDMComponent, hashMap);
            if (iDMComponent.getFields().getBooleanValue(cb4.KEY_CAN_CHECK_IN_NORMAL)) {
                this.k.p(iDMComponent, z);
            }
            if (!((ArrayList) this.l).contains(iDMComponent)) {
                ((ArrayList) this.l).add(iDMComponent);
            }
        }
    }

    public final void X(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6058ed2e", new Object[]{this, iDMComponent, map});
            return;
        }
        Map<String, List<gsb>> eventMap = iDMComponent.getEventMap();
        if (eventMap != null && (list = eventMap.get(this.f23048a.g())) != null) {
            n(G(list, this.f23048a.d()), map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f23965a;

        public c(List list) {
            this.f23965a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                wd3 wd3Var = new wd3();
                wd3Var.h(this.f23965a);
                wd3Var.g(zuq.h(this.f23965a, md3.w(md3.this)));
                jd3 i = zuq.i(md3.x(md3.this), this.f23965a);
                String a2 = i.a();
                if (!i.c() || a2 != null) {
                    hav.d("CartSelectSubscriber", "dispatchOrderPrefetch");
                    boolean d = md3.y(md3.this).Y().d();
                    if (!(md3.z(md3.this) == null || md3.A(md3.this).getFields() == null || !md3.B(md3.this).getFields().getBooleanValue("isHideCalculateBtn"))) {
                        z = true;
                    }
                    Bundle a3 = zuq.a(md3.s(md3.this), wd3Var, a2, zuq.c(md3.r(md3.this), d, z));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bundle", (Object) a3);
                    la3.c(md3.t(md3.this), UltronTradeHybridStage.ON_DATA_CHANGED, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void J() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab4105e", new Object[]{this});
            return;
        }
        IDMComponent parent = this.e.getParent();
        if (!(parent == null || parent.getParent() == null)) {
            IDMComponent parent2 = parent.getParent();
            for (IDMComponent iDMComponent : parent2.getChildren()) {
                if (iDMComponent != null) {
                    Iterator<IDMComponent> it = iDMComponent.getChildren().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IDMComponent next = it.next();
                        if (next != null && "item".equals(next.getTag()) && !O(next) && cb4.b(Q(), next)) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            for (IDMComponent iDMComponent2 : parent2.getChildren()) {
                if (iDMComponent2 != null && ("shop".equals(iDMComponent2.getTag()) || "bundleHeader".equals(iDMComponent2.getTag()))) {
                    V(iDMComponent2, z);
                    return;
                }
            }
        }
    }

    public final boolean O(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0cf0cb4", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }

    public final boolean S(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c403cc20", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (!z || !z2 || !this.k.t() || cb4.v(this.d) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_PRE_LOADV2, "true");
        List<IDMComponent> v = cb4.v(this.d);
        if (v != null) {
            hashMap.put(RequestConfig.CHECKED_COUNT, String.valueOf(v.size()));
        }
        this.j.f0(true, hashMap, new a());
        return true;
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158a3ad", new Object[]{this});
            return;
        }
        List<IDMComponent> n = ((u55) this.d).n();
        if (sca.x(this.k)) {
            cb4.X(this.k);
            return;
        }
        boolean G = true ^ this.k.G();
        IDMComponent iDMComponent = null;
        for (IDMComponent iDMComponent2 : n) {
            if (iDMComponent2 != null) {
                String tag = iDMComponent2.getTag();
                if ("item".equals(tag)) {
                    if (!O(iDMComponent2) && cb4.b(Q(), iDMComponent2)) {
                        G = false;
                    }
                } else if ("submit".equals(tag)) {
                    iDMComponent = iDMComponent2;
                }
            }
        }
        if (iDMComponent != null) {
            V(iDMComponent, G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7  */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r17) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.md3.j(tb.lcu):void");
    }
}
