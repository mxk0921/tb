package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.InteractiveComponent;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list.InteractiveNeedShowResponse;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list.InteractiveShowInfo;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponse;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.DWPenetrateFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.InteractiveComponentRightAnim;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sgf implements IInteractiveProxy.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = sgf.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final String f28039a;
    public final ukr b;
    public final nc4 c;
    public qoa f;
    public HashMap<String, String> h;
    public khf j;
    public StringBuilder l;
    public final List<InteractiveComponent> d = new ArrayList();
    public boolean e = false;
    public boolean g = true;
    public final Set<String> i = new HashSet();
    public final List<IInteractiveProxy.e> k = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements cqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.cqk
        public void R1(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONArray jSONArray;
            MtopMediaplatformDetailComponentlistResponseData.Component component;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1f21fde", new Object[]{this, jSONObject});
            } else if (jSONObject != null && jSONObject.containsKey("componentListData") && (jSONObject2 = jSONObject.getJSONObject("componentListData")) != null && jSONObject2.containsKey("aliveList") && (jSONArray = jSONObject2.getJSONArray("aliveList")) != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (!(jSONObject3 == null || (component = (MtopMediaplatformDetailComponentlistResponseData.Component) fkx.j(jSONObject3, MtopMediaplatformDetailComponentlistResponseData.Component.class)) == null)) {
                        sgf.l(sgf.this).add(new InteractiveComponent(component));
                    }
                }
                sgf.m(sgf.this);
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            MtopMediaplatformDetailComponentlistResponse mtopMediaplatformDetailComponentlistResponse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if ((netBaseOutDo instanceof MtopMediaplatformDetailComponentlistResponse) && (mtopMediaplatformDetailComponentlistResponse = (MtopMediaplatformDetailComponentlistResponse) netBaseOutDo) != null && mtopMediaplatformDetailComponentlistResponse.getData() != null && mtopMediaplatformDetailComponentlistResponse.getData().result != null) {
                sgf.n(sgf.this, mtopMediaplatformDetailComponentlistResponse.getData().enableMultiBatchRender);
                Iterator<MtopMediaplatformDetailComponentlistResponseData.Component> it = mtopMediaplatformDetailComponentlistResponse.getData().result.iterator();
                while (it.hasNext()) {
                    sgf.l(sgf.this).add(new InteractiveComponent(it.next()));
                }
                sgf.m(sgf.this);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Comparator<InteractiveComponent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(sgf sgfVar) {
        }

        /* renamed from: a */
        public int compare(InteractiveComponent interactiveComponent, InteractiveComponent interactiveComponent2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3609bee1", new Object[]{this, interactiveComponent, interactiveComponent2})).intValue();
            }
            int i = interactiveComponent.showOrder;
            if (i < 0) {
                i += 10000;
            }
            int i2 = interactiveComponent2.showOrder;
            if (i2 < 0) {
                i2 += 10000;
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InteractiveComponent f28041a;

        public c(InteractiveComponent interactiveComponent) {
            this.f28041a = interactiveComponent;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                v2s.o().A().c(sgf.p(), "checkIsNeedShowByMtop onError ");
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof InteractiveNeedShowResponse) {
                InteractiveComponent interactiveComponent = this.f28041a;
                interactiveComponent.isFistShow = true;
                sgf.o(sgf.this, interactiveComponent, ((InteractiveNeedShowResponse) netBaseOutDo).getData());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295699827);
        t2o.a(806355277);
    }

    public sgf(String str, ukr ukrVar, nc4 nc4Var, khf khfVar) {
        this.f28039a = str;
        this.b = ukrVar;
        this.c = nc4Var;
        this.j = khfVar;
    }

    public static /* synthetic */ List l(sgf sgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7bc035fc", new Object[]{sgfVar});
        }
        return sgfVar.d;
    }

    public static /* synthetic */ void m(sgf sgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8116d8a", new Object[]{sgfVar});
        } else {
            sgfVar.K();
        }
    }

    public static /* synthetic */ boolean n(sgf sgfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99fcd1", new Object[]{sgfVar, new Boolean(z)})).booleanValue();
        }
        sgfVar.e = z;
        return z;
    }

    public static /* synthetic */ void o(sgf sgfVar, InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e3d120", new Object[]{sgfVar, interactiveComponent, interactiveShowInfo});
        } else {
            sgfVar.L(interactiveComponent, interactiveShowInfo);
        }
    }

    public static /* synthetic */ String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return m;
    }

    public void A(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ea76b9", new Object[]{this, context, str, str2, str3});
        } else {
            B(context, str, str2, str3, "interactPanel");
        }
    }

    public final void B(Context context, String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ec443", new Object[]{this, context, str, str2, str3, str4});
        } else if ("openLayer".equals(str2)) {
            InteractiveComponent v = c(str);
            if (v != null) {
                str5 = v.parseJsonTBLiveInteractiveComponent().toJSONString();
            } else {
                str5 = "{}";
            }
            HashMap hashMap = (HashMap) fkx.f(str5, HashMap.class);
            hashMap.put("clickSource", str4);
            a(str, hashMap);
        } else if (rg0.JUMP_URL.equals(str2)) {
            this.b.getActionAdapter().s(context, str3, tws.d());
        } else if ("poplayer".equals(str2)) {
            this.b.getActionAdapter().z(context, str3);
        } else if ("openWebViewLayer".equals(str2)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizData", str4);
            float b2 = wwo.b() * tws.V();
            hashMap2.put("x", "0");
            hashMap2.put("y", String.valueOf(iw0.l((wwo.b() - wwo.a(context)) - b2)));
            hashMap2.put("width", String.valueOf(-1));
            hashMap2.put("height", String.valueOf(iw0.l(b2)));
            hashMap2.put("modal", "true");
            ukr ukrVar = this.b;
            ukrVar.f(ukrVar.getActionAdapter().A(context), str3, hashMap2);
        } else if ("openWebViewNewLayer".equals(str2)) {
            HashMap hashMap3 = new HashMap();
            ukr ukrVar2 = this.b;
            ukrVar2.b(ukrVar2.getActionAdapter().A(context), str3, hashMap3);
        }
    }

    public InteractiveComponent C(Context context, Object[] objArr) {
        String valueOf;
        InteractiveComponent v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("91e7e40a", new Object[]{this, context, objArr});
        }
        if (objArr.length < 3 || !"interact_right_anim_click".equals(objArr[1]) || (v = c((valueOf = String.valueOf(objArr[2])))) == null) {
            return null;
        }
        B(context, valueOf, v.iconAction, v.actionUrl, "interactRightAnim");
        return v;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f37ca6f", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean E(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41460c28", new Object[]{this, interactiveComponent})).booleanValue();
        }
        if (!interactiveComponent.migrationFlag || !interactiveComponent.isDefaultComponentType()) {
            return false;
        }
        return true;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4051b03b", new Object[]{this});
            return;
        }
        this.l = new StringBuilder();
        ((HashSet) this.i).clear();
        ((ArrayList) this.d).clear();
        nc4 nc4Var = this.c;
        if (nc4Var != null) {
            nc4Var.f(new a(), true);
        }
    }

    public void G(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5457fc26", new Object[]{this, eVar});
        } else {
            ((ArrayList) this.k).remove(eVar);
        }
    }

    public void H(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df72203a", new Object[]{this, str, map});
        } else if (c(str) != null) {
            map.put("componentName", str);
            map.put("queryParams", this.b.getActionAdapter().f());
            this.b.v("TBLiveWeex.Event.openComponent", map);
        }
    }

    public void I(qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c59715", new Object[]{this, qoaVar});
        } else {
            this.f = qoaVar;
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b66fa2", new Object[]{this});
            return;
        }
        this.j = null;
        ((ArrayList) this.d).clear();
        ((HashSet) this.i).clear();
        ((ArrayList) this.k).clear();
        this.g = true;
        this.h = null;
        StringBuilder sb = this.l;
        if (sb != null && sb.length() > 0) {
            ukr ukrVar = this.b;
            jbu.d(ukrVar, "component_load_finish", "componentInfos=" + this.l.toString());
        }
        this.l = null;
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22177c79", new Object[]{this});
            return;
        }
        Collections.sort(this.d, new b(this));
        s();
    }

    public final void L(InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589e7379", new Object[]{this, interactiveComponent, interactiveShowInfo});
        } else if (interactiveComponent != null && interactiveShowInfo != null) {
            interactiveComponent.updateViewParams(interactiveShowInfo);
            sjr.g().c("com.taobao.taolive.room.interactive_component_update_entrance_info", interactiveComponent, this.f28039a);
            khf khfVar = this.j;
            if (khfVar != null) {
                khfVar.j(interactiveComponent, interactiveShowInfo);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66330ce", new Object[]{this, str, map});
        } else if (c(str) != null) {
            jbu.e(this.b, 19999, "ComponentClickResponse", map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public boolean d(String str, boolean z, boolean z2, String str2, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d709ac0c", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        cwd A = v2s.o().A();
        String str3 = m;
        A.c(str3, "addShowComponentList componentName " + str + " isShowComponent " + z);
        if (!tws.n() || !tws.J(str)) {
            return false;
        }
        if (z) {
            ((HashSet) this.i).add(str);
        } else {
            ((HashSet) this.i).remove(str);
        }
        qoa qoaVar = this.f;
        if (qoaVar != null) {
            View view = qoaVar.getView();
            boolean y = y();
            if (z2) {
                this.f.b0(y, str2, f, f2, f3);
            }
            if (view instanceof DWPenetrateFrameLayout) {
                cwd A2 = v2s.o().A();
                A2.c(str3, "addShowComponentList componentName " + str + " isShowComponent " + z + " hasShowingComponent " + y());
                ((DWPenetrateFrameLayout) view).setHasShowingComponent(y);
            }
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void e(String str, Map<String, String> map) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ca8f27", new Object[]{this, str, map});
            return;
        }
        String str2 = map.get("componentInfo");
        if (!TextUtils.isEmpty(str2) && (sb = this.l) != null) {
            if (sb.length() > 0) {
                StringBuilder sb2 = this.l;
                sb2.append("^");
                sb2.append(str2);
            } else {
                this.l.append(str2);
            }
        }
        InteractiveComponent v = c(str);
        if (v != null) {
            khf khfVar = this.j;
            if (khfVar != null) {
                khfVar.n(v);
            }
            v.loadComponentComplete();
            sjr.g().c("com.taobao.taolive.room.interactive_component_load_complete", v, this.f28039a);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9751fd3e", new Object[]{this, str, map});
            return;
        }
        InteractiveComponent v = c(str);
        if (v != null) {
            v.setFloatingLayerStatus(true);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public String g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e00b880", new Object[]{this, str, map});
        }
        InteractiveComponent v = c(str);
        if (v == null) {
            return "";
        }
        khf khfVar = this.j;
        if (khfVar != null) {
            khfVar.m(v, map);
        }
        v.initComponentComplete();
        sjr.g().c("com.taobao.taolive.room.interactive_component_render_complete", v, this.f28039a);
        return v.parseJsonTBLiveInteractiveComponent().toJSONString();
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void h(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7ce88c", new Object[]{this, str, map});
            return;
        }
        try {
            InteractiveComponent v = c(str);
            InteractiveShowInfo interactiveShowInfo = new InteractiveShowInfo();
            interactiveShowInfo.isNeedShow = Boolean.parseBoolean(map.get("isNeedShow"));
            interactiveShowInfo.isNotifying = Boolean.parseBoolean(map.get("isNotifying"));
            interactiveShowInfo.notificationViewParams = map.get("notificationViewParams");
            interactiveShowInfo.viewParams = map.get("viewParams");
            interactiveShowInfo.extraParams = map.get("extraParams");
            interactiveShowInfo.actionUrl = map.get("actionUrl");
            interactiveShowInfo.iconAction = map.get("iconAction");
            if (v != null) {
                L(v, interactiveShowInfo);
            }
        } catch (Exception e) {
            jbu.b("interactUpdateEntranceView", "Exception=" + e.toString());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38c2403", new Object[]{this, str, map});
            return;
        }
        try {
            InteractiveComponentRightAnim interactiveComponentRightAnim = new InteractiveComponentRightAnim();
            interactiveComponentRightAnim.name = str;
            interactiveComponentRightAnim.animationType = map.get("animationType");
            interactiveComponentRightAnim.dxTemplate = map.get("dxTemplate");
            interactiveComponentRightAnim.params = fkx.d(map.get("params"));
            interactiveComponentRightAnim.additionalAnimation = map.get("apngUrl");
            interactiveComponentRightAnim.stayDuration = Integer.parseInt(map.get("stayDuration"));
            if (map.containsKey("apngStayDuration")) {
                interactiveComponentRightAnim.apngStayDuration = Integer.parseInt(map.get("apngStayDuration"));
            }
            if (map.containsKey("dxDisAppearDuration")) {
                interactiveComponentRightAnim.dxDisAppearDuration = Integer.parseInt(map.get("dxDisAppearDuration"));
            }
            sjr.g().c("com.taobao.taolive.room.interactive_component_update_entrance_anim_info", interactiveComponentRightAnim, this.f28039a);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31243da4", new Object[]{this});
            return;
        }
        khf khfVar = this.j;
        if (khfVar != null) {
            khfVar.b();
        }
        sjr.g().c("com.taobao.taolive.room.interactive_all_component_load_complete", null, this.f28039a);
        ukr ukrVar = this.b;
        if (ukrVar == null || ukrVar.R() == null) {
            o3s.b(m, "openAlive notify error: mTBLiveInteractiveManager or frameContext is null");
        } else {
            this.b.R().z().c(uyg.INTERACTIVE_EVENT_BIZ_CENTER_NOTIFY, "OpenAlive", this.f28039a);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void k(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd147fcc", new Object[]{this, str, map});
            return;
        }
        InteractiveComponent v = c(str);
        if (v != null && v.isFloatingLayerStatus()) {
            v.setFloatingLayerStatus(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sgf.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "94fd4769"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.k
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e r1 = (com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e) r1
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r1.getName()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = r5.getFedName()
            java.lang.String r3 = r1.getFedName()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x001d
        L_0x0045:
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.k
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r1)
            boolean r0 = r5.isNeedShowEntrance()
            if (r0 == 0) goto L_0x0067
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.k
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
            goto L_0x0067
        L_0x005a:
            boolean r0 = r5.isNeedShowEntrance()
            if (r0 == 0) goto L_0x0067
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.k
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sgf.q(com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e):void");
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ffcd4e", new Object[]{this});
            return;
        }
        ((ArrayList) this.d).clear();
        ((HashSet) this.i).clear();
        ((ArrayList) this.k).clear();
        this.g = true;
        F();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56824cb", new Object[]{this});
        } else if ((giv.c().b() || !tws.f()) && this.g && !((ArrayList) this.d).isEmpty() && this.h != null) {
            this.g = false;
            Iterator it = ((ArrayList) this.d).iterator();
            while (it.hasNext()) {
                InteractiveComponent interactiveComponent = (InteractiveComponent) it.next();
                if (E(interactiveComponent)) {
                    int i = interactiveComponent.customizedType;
                    if (i == 1) {
                        if (!TextUtils.isEmpty(interactiveComponent.customizedMtop)) {
                            new ohf(new c(interactiveComponent)).L(interactiveComponent.customizedMtop, interactiveComponent.fedName, this.h);
                        }
                    } else if (i == 2 && !TextUtils.isEmpty(interactiveComponent.iconUrl)) {
                        InteractiveShowInfo interactiveShowInfo = new InteractiveShowInfo();
                        interactiveShowInfo.isNeedShow = true;
                        interactiveComponent.isFistShow = true;
                        L(interactiveComponent, interactiveShowInfo);
                    }
                }
            }
        }
    }

    public void t(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3aeb08", new Object[]{this, hashMap});
            return;
        }
        this.h = hashMap;
        s();
    }

    public List<InteractiveComponent> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb56fe5c", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        return arrayList;
    }

    /* renamed from: v */
    public InteractiveComponent c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("c292505b", new Object[]{this, str});
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            InteractiveComponent interactiveComponent = (InteractiveComponent) it.next();
            if (!TextUtils.isEmpty(str) && (str.equals(interactiveComponent.name) || str.equals(interactiveComponent.fedName))) {
                return interactiveComponent;
            }
        }
        return null;
    }

    public ArrayList<IInteractiveProxy.e> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e9af2f5a", new Object[]{this});
        }
        ArrayList<IInteractiveProxy.e> arrayList = new ArrayList<>();
        arrayList.addAll(this.k);
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            IInteractiveProxy.e eVar = (IInteractiveProxy.e) it.next();
            if (eVar.isMigrationFlag() && eVar.isNeedShowEntrance() && eVar.isInteractivePanelDisplayOnly() && !arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public ArrayList<InteractiveComponent> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e46190e8", new Object[]{this});
        }
        ArrayList<InteractiveComponent> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            InteractiveComponent interactiveComponent = (InteractiveComponent) it.next();
            if (interactiveComponent.migrationFlag && interactiveComponent.isNeedShowEntrance && interactiveComponent.rightShowFlag && !interactiveComponent.interactivePanelDisplayOnly) {
                arrayList.add(interactiveComponent);
            }
        }
        return arrayList;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd0a88fd", new Object[]{this})).booleanValue();
        }
        return true ^ ((HashSet) this.i).isEmpty();
    }

    public InteractiveComponent z(Context context, Object[] objArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("eda87ee1", new Object[]{this, context, objArr});
        }
        if (objArr.length < 4 || !"interact_click".equals(objArr[1])) {
            return null;
        }
        String valueOf = String.valueOf(objArr[2]);
        String valueOf2 = String.valueOf(objArr[3]);
        if (objArr.length >= 5) {
            str = String.valueOf(objArr[4]);
        } else {
            str = "";
        }
        B(context, valueOf, valueOf2, str, "interactRight");
        return c(valueOf);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.f
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210dd456", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String uuid = UUID.randomUUID().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("clickId", uuid);
        hashMap.put("componentName", str);
        InteractiveComponent v = c(str);
        if (v != null && !v.isLoadComponentComplete()) {
            cwd A = v2s.o().A();
            String str2 = m;
            A.c(str2, "openComponentLayer isInitStatus " + str);
            jbu.e(this.b, 19999, "ComponentClick_noInit", hashMap);
            if (!(v2s.o().f() == null || v2s.o().f().getApplication() == null || !iw0.j(v2s.o().f().getApplication()))) {
                Toast.makeText(v2s.o().f().getApplication(), "抱歉，组件还未加载完成", 1).show();
            }
        }
        map.put("componentName", str);
        map.put(s0j.MTS_TAG_CLICK_TIME, Long.valueOf(System.nanoTime()));
        map.put("clickId", uuid);
        map.put("queryParams", this.b.getActionAdapter().f());
        jbu.e(this.b, 19999, "ComponentClick", hashMap);
        this.b.v("TBLiveWeex.Event.openComponent", map);
        if (this.b.R().A() != null) {
            this.b.R().A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
    }
}
