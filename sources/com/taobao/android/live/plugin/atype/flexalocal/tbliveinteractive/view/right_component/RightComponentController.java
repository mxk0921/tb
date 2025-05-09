package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.utils.TypeDX;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.aif;
import tb.cif;
import tb.cwd;
import tb.d4s;
import tb.iw0;
import tb.jbu;
import tb.khf;
import tb.ll6;
import tb.owo;
import tb.pb6;
import tb.s3c;
import tb.sgf;
import tb.sjr;
import tb.t2o;
import tb.tws;
import tb.ukr;
import tb.ux9;
import tb.v2s;
import tb.vc;
import tb.vwl;
import tb.whf;
import tb.yhf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RightComponentController implements s3c, whf, IInteractiveProxy.i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RightComponent";

    /* renamed from: a  reason: collision with root package name */
    public final Context f8695a;
    public final ux9 b;
    public final ukr c;
    public final sgf d;
    public final String e;
    public View f;
    public boolean g;
    public View j;
    public RecyclerView k;
    public FrameLayout l;
    public LinearLayoutManager m;
    public RightComponentListAdapter n;
    public aif q;
    public khf r;
    public int i = -1;
    public final ArrayList<IInteractiveProxy.e> o = new ArrayList<>();
    public final HashSet<IInteractiveProxy.e> p = new HashSet<>();
    public final int h = tws.I();

    static {
        t2o.a(295699996);
        t2o.a(806355016);
        t2o.a(295699980);
        t2o.a(806355280);
    }

    public RightComponentController(String str, Context context, ux9 ux9Var, ukr ukrVar, sgf sgfVar, khf khfVar) {
        this.e = str;
        this.f8695a = context;
        this.b = ux9Var;
        this.c = ukrVar;
        this.d = sgfVar;
        this.r = khfVar;
    }

    public static /* synthetic */ Context a(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4a557159", new Object[]{rightComponentController});
        }
        return rightComponentController.f8695a;
    }

    public static /* synthetic */ ukr b(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukr) ipChange.ipc$dispatch("7097e52d", new Object[]{rightComponentController});
        }
        return rightComponentController.c;
    }

    public static /* synthetic */ ArrayList c(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5c0fb979", new Object[]{rightComponentController});
        }
        return rightComponentController.o;
    }

    public static /* synthetic */ String d(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94267a62", new Object[]{rightComponentController});
        }
        return rightComponentController.e;
    }

    public static /* synthetic */ HashSet e(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("a09ab2ba", new Object[]{rightComponentController});
        }
        return rightComponentController.p;
    }

    public static /* synthetic */ sgf f(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgf) ipChange.ipc$dispatch("990461ee", new Object[]{rightComponentController});
        }
        return rightComponentController.d;
    }

    public static /* synthetic */ khf g(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khf) ipChange.ipc$dispatch("cba3901c", new Object[]{rightComponentController});
        }
        return rightComponentController.r;
    }

    public static /* synthetic */ int h(RightComponentController rightComponentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e929e16d", new Object[]{rightComponentController})).intValue();
        }
        return rightComponentController.n();
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return ukr.EVENTCENTER_BIZCODE;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        aif aifVar = this.q;
        if (aifVar != null) {
            aifVar.destroy();
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            recyclerView.swapAdapter(null, true);
        }
        sjr.g().b(this);
        this.o.clear();
        this.p.clear();
        this.r = null;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87c78f5a", new Object[]{this})).booleanValue();
        }
        if (!vwl.e().g() || !d4s.e("enableInteractiveRightAnimTaskController", true)) {
            return false;
        }
        return true;
    }

    public Integer k(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("21d16cbd", new Object[]{this, interactiveComponentRightAnim});
        }
        return m(interactiveComponentRightAnim, false);
    }

    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("507c2c94", new Object[]{this});
        }
        return this.f;
    }

    public final Integer m(InteractiveComponentRightAnim interactiveComponentRightAnim, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d5c4c6a5", new Object[]{this, interactiveComponentRightAnim, new Boolean(z)});
        }
        if (interactiveComponentRightAnim == null || this.o == null) {
            return null;
        }
        int n = n();
        for (int i = 0; i < this.o.size(); i++) {
            IInteractiveProxy.e eVar = this.o.get(i);
            if (TextUtils.equals(eVar.getFedName(), interactiveComponentRightAnim.name) || TextUtils.equals(eVar.getName(), interactiveComponentRightAnim.name)) {
                if (i >= n || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                eVar.setRightAnimated(z2);
                RightComponentListAdapter rightComponentListAdapter = this.n;
                if (rightComponentListAdapter != null && i < n) {
                    rightComponentListAdapter.notifyItemChanged(i);
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85622849", new Object[]{this})).intValue();
        }
        int i = this.i;
        if (i <= 0) {
            return this.h;
        }
        return Math.min(this.h, i);
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1df40643", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.interactive_component_update_entrance_info", "com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.interactive_component_update_entrance_anim_info", "com.taobao.taolive.room.interactive_all_component_load_complete"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.RightComponentController.onEvent(java.lang.String, java.lang.Object):void");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (!this.g && tws.x()) {
            this.l.bringToFront();
            if (j()) {
                this.q = new cif(this.b, this.e, this.f8695a, this.l, this.c, this);
            } else {
                this.q = new yhf(this.e, this.f8695a, this.l, this.c, this);
            }
        }
        sgf sgfVar = this.d;
        if (sgfVar != null) {
            this.o.addAll(sgfVar.x());
        }
        int n = n();
        for (int size = this.o.size() - 1; size > n - 1; size--) {
            this.o.remove(size);
        }
        this.k.setAdapter(this.n);
        this.k.setRecycledViewPool(this.b.j().q());
        sjr.g().a(this);
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc01d078", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        this.j = this.f.findViewById(R.id.interactive_right_component_layout);
        this.k = (RecyclerView) this.f.findViewById(R.id.interactive_right_component_recycler);
        FrameLayout frameLayout = (FrameLayout) this.f.findViewById(R.id.interactive_right_component_anim);
        this.l = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        float h = iw0.h(this.f8695a);
        layoutParams.width = owo.e(this.f8695a, "60ap", (int) ((60.0f * h) / 375.0f));
        layoutParams.height = owo.e(this.f8695a, "72ap", (int) ((h * 72.0f) / 375.0f));
        this.l.setLayoutParams(layoutParams);
        this.n = new RightComponentListAdapter();
        RecyclerView recyclerView = this.k;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f8695a);
        this.m = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (!z || vc.d(this.f8695a)) {
            this.m.setOrientation(1);
            if (tws.w() && this.k.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = this.k.getLayoutParams();
                Context context = this.f8695a;
                layoutParams2.width = pb6.o(context, "45", iw0.a(context, 45.0f));
                layoutParams2.height = iw0.a(this.f8695a, 200.0f);
                this.k.setHasFixedSize(true);
            }
        } else {
            this.m.setReverseLayout(true);
            this.m.setOrientation(0);
            this.m.setStackFromEnd(true);
        }
        this.k.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.RightComponentController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r3, String str, Object... objArr) {
                if (str.hashCode() == -2066002230) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/right_component/RightComponentController$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView2, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView2, state);
                rect.bottom = iw0.a(RightComponentController.a(RightComponentController.this), 8.0f);
            }
        });
        ((DefaultItemAnimator) this.k.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730a5a0d", new Object[]{this});
        } else if (tws.T() && this.c != null && this.o != null) {
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<IInteractiveProxy.e> it = this.o.iterator();
            while (it.hasNext()) {
                IInteractiveProxy.e next = it.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) next.getId());
                    jSONObject.put("fedName", (Object) next.getFedName());
                    jSONArray.add(jSONObject);
                }
            }
            hashMap.put("right", jSONArray);
            this.c.v("TBLiveWVPlugin.Event.EntranceChanged", hashMap);
        }
    }

    public void s(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92a2ece", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (viewGroup != null) {
            viewGroup.addView(LayoutInflater.from(this.f8695a).inflate(R.layout.taolive_room_interactive_right_component_parent_flexalocal, (ViewGroup) null));
            this.f = viewGroup;
            q(z);
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1d771f", new Object[]{this, new Integer(i)});
        } else if (tws.A()) {
            this.i = i;
            RightComponentListAdapter rightComponentListAdapter = this.n;
            if (rightComponentListAdapter != null) {
                rightComponentListAdapter.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class RightComponentListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699998);
        }

        public RightComponentListAdapter() {
        }

        public static /* synthetic */ Object ipc$super(RightComponentListAdapter rightComponentListAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/right_component/RightComponentController$RightComponentListAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return Math.min(RightComponentController.h(RightComponentController.this), RightComponentController.c(RightComponentController.this).size());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            if (RightComponentController.c(RightComponentController.this) == null || RightComponentController.c(RightComponentController.this).size() <= i || RightComponentController.c(RightComponentController.this).get(i) == null || ((IInteractiveProxy.e) RightComponentController.c(RightComponentController.this).get(i)).getIconViewStyle() == null) {
                return 0;
            }
            return ((IInteractiveProxy.e) RightComponentController.c(RightComponentController.this).get(i)).getIconViewStyle().hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            HashMap<String, String> G = tws.G();
            Iterator<String> it = G.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "taolive_normal_countdown_comp";
                    break;
                }
                String next = it.next();
                if (i == next.hashCode()) {
                    str = G.get(next);
                    break;
                }
            }
            DXRootView b = ll6.b(RightComponentController.b(RightComponentController.this), RightComponentController.a(RightComponentController.this), str);
            if (b == null) {
                return new TypeDX(new View(RightComponentController.a(RightComponentController.this)));
            }
            return new TypeDX(b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            try {
                IInteractiveProxy.e eVar = (IInteractiveProxy.e) RightComponentController.c(RightComponentController.this).get(i);
                JSONObject parseJsonTBLiveInteractiveComponent = eVar.parseJsonTBLiveInteractiveComponent();
                ll6.e(RightComponentController.b(RightComponentController.this), (DXRootView) viewHolder.itemView, parseJsonTBLiveInteractiveComponent, RightComponentController.d(RightComponentController.this));
                cwd A = v2s.o().A();
                A.c("RightComponentFrame", "interactUpdateEntranceView onBindViewHolder " + parseJsonTBLiveInteractiveComponent.toJSONString() + " mComponentList.size() " + RightComponentController.c(RightComponentController.this).size());
                if (!RightComponentController.e(RightComponentController.this).contains(eVar)) {
                    RightComponentController.e(RightComponentController.this).add(eVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("dataComp", parseJsonTBLiveInteractiveComponent.toJSONString());
                    hashMap.put("compName", eVar.getFedName());
                    hashMap.put("name", eVar.getFedName());
                    hashMap.put("comppos", "0");
                    if (tws.a().equals(eVar.getFedName()) && (eVar.getViewParams() instanceof JSONArray)) {
                        JSONArray jSONArray = (JSONArray) eVar.getViewParams();
                        String str2 = "";
                        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            if (i2 == 0) {
                                str = "";
                            } else {
                                str = "@";
                            }
                            sb.append(str);
                            sb.append(jSONObject.getString("id"));
                            str2 = sb.toString();
                        }
                        hashMap.put("cp_oprt_id", str2);
                    }
                    hashMap.put("index", String.valueOf(i));
                    hashMap.put("priority", eVar.getPriority());
                    if (RightComponentController.f(RightComponentController.this) != null) {
                        hashMap.put("isEnableMultiBatchRender", String.valueOf(RightComponentController.f(RightComponentController.this).D()));
                    }
                    jbu.g(RightComponentController.b(RightComponentController.this), "Show-RightEntrance", hashMap);
                    sjr.g().c("com.taobao.taolive.room.interactive_component_entrance_render_finished", eVar, RightComponentController.d(RightComponentController.this));
                    if (RightComponentController.g(RightComponentController.this) != null) {
                        RightComponentController.g(RightComponentController.this).a(eVar, hashMap);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Integer t(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IInteractiveProxy.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("be335c44", new Object[]{this, interactiveComponentRightAnim});
        }
        Integer m = m(interactiveComponentRightAnim, true);
        if (!(interactiveComponentRightAnim == null || m == null || m.intValue() < 0 || m.intValue() >= this.o.size() || (eVar = this.o.get(m.intValue())) == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("dataComp", eVar.parseJsonTBLiveInteractiveComponent().toJSONString());
            hashMap.put("dataAnim", interactiveComponentRightAnim.parseJsonComponentRightAnim().toJSONString());
            hashMap.put("compName", eVar.getFedName());
            hashMap.put("name", eVar.getFedName());
            hashMap.put("comppos", "0");
            jbu.g(this.c, "Show-RightEntrance_cartoon", hashMap);
        }
        return m;
    }
}
