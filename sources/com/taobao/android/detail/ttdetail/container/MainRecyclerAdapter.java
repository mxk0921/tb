package com.taobao.android.detail.ttdetail.container;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bvk;
import tb.bw6;
import tb.mr7;
import tb.nb4;
import tb.oa4;
import tb.oaz;
import tb.pb6;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.wb4;
import tb.ygw;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainRecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6728a;
    public final ze7 b;
    public final List<MainViewHolder> c = new ArrayList(10);
    public List<oa4> K = new ArrayList(0);
    public List<oa4> d = new ArrayList(0);
    public boolean L = true;
    public int M = 0;
    public final Set<String> e = new HashSet();
    public final Set<Integer> f = new HashSet();
    public final Map<String, bvk> g = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class MainViewHolder extends RecyclerView.ViewHolder implements oaz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public oa4 f6729a;

        static {
            t2o.a(912261509);
            t2o.a(912263075);
        }

        public MainViewHolder(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(MainViewHolder mainViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/MainRecyclerAdapter$MainViewHolder");
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
            if (r6 != 2) goto L_0x004c;
         */
        @Override // tb.oaz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(int r6) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.MainViewHolder.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0021
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r6)
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r5
                r6[r0] = r4
                java.lang.String r0 = "4a3dea9a"
                java.lang.Object r6 = r3.ipc$dispatch(r0, r6)
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                return r6
            L_0x0021:
                if (r6 == r0) goto L_0x0026
                if (r6 == r2) goto L_0x0039
                goto L_0x004c
            L_0x0026:
                com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.this
                int r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.a(r6)
                if (r6 != r0) goto L_0x0030
                r6 = 4
                return r6
            L_0x0030:
                com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.this
                int r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.a(r6)
                if (r6 != r2) goto L_0x0039
                return r2
            L_0x0039:
                com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.this
                int r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.a(r6)
                if (r6 != r0) goto L_0x0042
                return r0
            L_0x0042:
                com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.this
                int r6 = com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.a(r6)
                if (r6 != r2) goto L_0x004c
                r6 = 3
                return r6
            L_0x004c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.container.MainRecyclerAdapter.MainViewHolder.a(int):int");
        }

        public oa4 b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oa4) ipChange.ipc$dispatch("83754e40", new Object[]{this});
            }
            return this.f6729a;
        }

        public void c0(oa4 oa4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49021b67", new Object[]{this, oa4Var});
            } else {
                this.f6729a = oa4Var;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6730a;
        public final /* synthetic */ String b;
        public final /* synthetic */ oa4 c;

        public a(MainRecyclerAdapter mainRecyclerAdapter, JSONObject jSONObject, String str, oa4 oa4Var) {
            this.f6730a = jSONObject;
            this.b = str;
            this.c = oa4Var;
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            this.f6730a.put(this.b, obj2);
            this.c.updateComponent();
        }
    }

    static {
        t2o.a(912261507);
    }

    public MainRecyclerAdapter(Context context, ze7 ze7Var) {
        this.f6728a = context;
        this.b = ze7Var;
    }

    public static /* synthetic */ int a(MainRecyclerAdapter mainRecyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66b559a3", new Object[]{mainRecyclerAdapter})).intValue();
        }
        return mainRecyclerAdapter.M;
    }

    public static /* synthetic */ Object ipc$super(MainRecyclerAdapter mainRecyclerAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1835299728:
                return new Boolean(super.onFailedToRecycleView((RecyclerView.ViewHolder) objArr[0]));
            case 143764512:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 430758011:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1995301502:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/container/MainRecyclerAdapter");
        }
    }

    public <F extends oa4> F N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ((oa4) ipChange.ipc$dispatch("cd822227", new Object[]{this, new Integer(i)}));
        }
        if (i <= -1 || i >= this.d.size()) {
            return null;
        }
        return (F) this.d.get(i);
    }

    public List<oa4> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.d;
    }

    public final void Q(oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f117096", new Object[]{this, oa4Var});
        } else if (oa4Var != null) {
            oa4Var.willDisAppear();
            oa4Var.disAppear();
            if (!this.b.e().o()) {
                String c = RuntimeUtils.c(oa4Var);
                if (!TextUtils.isEmpty(c)) {
                    UserBehaviorTracker.j(this.f6728a, c, 2);
                }
            }
        }
    }

    /* renamed from: S */
    public MainViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainViewHolder) ipChange.ipc$dispatch("d1b6594a", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new MainViewHolder((FrameLayout) LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_cell_container, viewGroup, false));
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155897d9", new Object[]{this});
            return;
        }
        ((HashSet) this.f).clear();
        for (Map.Entry entry : ((HashMap) this.g).entrySet()) {
            this.b.i().g((String) entry.getKey(), (bvk) entry.getValue());
        }
        ((HashMap) this.g).clear();
    }

    /* renamed from: U */
    public boolean onFailedToRecycleView(MainViewHolder mainViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77b2e65", new Object[]{this, mainViewHolder})).booleanValue();
        }
        return super.onFailedToRecycleView(mainViewHolder);
    }

    /* renamed from: V */
    public void onViewAttachedToWindow(MainViewHolder mainViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17159d0f", new Object[]{this, mainViewHolder});
            return;
        }
        super.onViewAttachedToWindow(mainViewHolder);
        ((ArrayList) this.c).add(mainViewHolder);
        if (!this.b.e().o()) {
            oa4 b0 = mainViewHolder.b0();
            String c = RuntimeUtils.c(b0);
            if (!TextUtils.isEmpty(c)) {
                UserBehaviorTracker.j(this.f6728a, c, 1);
                UserBehaviorUtils.f(this.f6728a, b0);
            }
        }
    }

    /* renamed from: W */
    public void onViewDetachedFromWindow(MainViewHolder mainViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b839d0f2", new Object[]{this, mainViewHolder});
            return;
        }
        super.onViewDetachedFromWindow(mainViewHolder);
        if (!((ArrayList) this.c).remove(mainViewHolder)) {
            if (bw6.a(this.f6728a)) {
                Toast.makeText(this.f6728a, "mShowingVH.remove(holder) failed", 0).show();
            }
            tgh.b("MainRecyclerAdapter", "mShowingVH.remove(holder) failed, for vh: " + mainViewHolder.toString());
        }
        Q(mainViewHolder.b0());
    }

    /* renamed from: X */
    public void onViewRecycled(MainViewHolder mainViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa2de2d", new Object[]{this, mainViewHolder});
        } else {
            super.onViewRecycled(mainViewHolder);
        }
    }

    public final void Y(ViewGroup viewGroup, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb5fedc", new Object[]{this, viewGroup, new Boolean(z), new Integer(i)});
        } else if (i <= 3 && !z && !(viewGroup instanceof DXRootView)) {
            viewGroup.setClipChildren(false);
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    Y((ViewGroup) childAt, false, i + 1);
                }
            }
        }
    }

    public <F extends oa4> void Z(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de283eb7", new Object[]{this, list});
            return;
        }
        List<oa4> list2 = this.d;
        if (list2 != list) {
            this.K = list2;
            this.d = new ArrayList(0);
        }
        ((ArrayList) this.d).clear();
        if (list != null) {
            ((ArrayList) this.d).addAll(list);
        }
        T();
    }

    public final void b() {
        oa4 oa4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6d5a46", new Object[]{this});
            return;
        }
        if (this.M == 0 || !DataUtils.i0((Feature) this.b.e().f(Feature.class)) || this.b.e().o() || this.L || this.K.isEmpty() || ((ArrayList) this.d).isEmpty()) {
            notifyDataSetChanged();
        } else {
            int size = this.K.size();
            int size2 = ((ArrayList) this.d).size();
            int max = Math.max(size, size2);
            for (int i = 0; i < max; i++) {
                oa4 oa4Var2 = null;
                if (i < size) {
                    oa4Var = this.K.get(i);
                } else {
                    oa4Var = null;
                }
                if (i < size2) {
                    oa4Var2 = (oa4) ((ArrayList) this.d).get(i);
                }
                if (oa4Var != null && oa4Var2 != null) {
                    notifyItemChanged(i);
                } else if (oa4Var == null) {
                    notifyItemRemoved(i);
                    notifyItemInserted(i);
                } else if (oa4Var2 == null) {
                    notifyItemRemoved(i);
                }
            }
        }
        this.L = this.b.e().o();
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e018cb0", new Object[]{this, new Integer(i)});
        } else {
            this.M = i;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            Q(((MainViewHolder) it.next()).b0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.d.get(i).getComponentViewType();
    }

    public final void M(int i, oa4 oa4Var, FrameLayout frameLayout) {
        JSONObject f;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bacb17", new Object[]{this, new Integer(i), oa4Var, frameLayout});
        } else if (!((HashSet) this.f).contains(Integer.valueOf(i))) {
            ((HashSet) this.f).add(Integer.valueOf(i));
            nb4 componentData = oa4Var.getComponentData();
            if (!(componentData == null || (f = componentData.f()) == null)) {
                String string = f.getString("_dMarginTop");
                String string2 = f.getString("_dMarginBottom");
                String string3 = f.getString("_dClip");
                JSONObject jSONObject = f.getJSONObject("_dObserveStates");
                if (string != null) {
                    try {
                        i2 = Integer.parseInt(string);
                    } catch (Exception e) {
                        tgh.c("MainRecyclerAdapter", "解析_dMarinBottom失败", e);
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) frameLayout.getLayoutParams();
                        try {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = pb6.d(this.b.g().o(), this.f6728a, i2);
                        } catch (Exception e2) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = mr7.a(i2);
                            tgh.c("MainRecyclerAdapter", "dx ap转换成像素失败", e2);
                        }
                    }
                }
                if (string2 != null) {
                    try {
                        i3 = Integer.parseInt(string2);
                    } catch (Exception e3) {
                        tgh.c("MainRecyclerAdapter", "解析_dMarinBottom失败", e3);
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) frameLayout.getLayoutParams();
                        try {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = pb6.d(this.b.g().o(), this.f6728a, i3);
                        } catch (Exception e4) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = mr7.a(i3);
                            tgh.c("MainRecyclerAdapter", "dx ap转换成像素失败", e4);
                        }
                    }
                }
                if (string3 != null) {
                    try {
                        Y(frameLayout, Boolean.parseBoolean(string3), 0);
                    } catch (Exception e5) {
                        tgh.c("MainRecyclerAdapter", "解析是否_dClap失败", e5);
                    }
                }
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        if (key != null) {
                            a aVar = new a(this, jSONObject, key, oa4Var);
                            this.b.i().e(key, aVar);
                            ((HashMap) this.g).put(key, aVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public void onBindViewHolder(MainViewHolder mainViewHolder, int i) {
        JSONObject f;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa0078e", new Object[]{this, mainViewHolder, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) mainViewHolder.itemView;
        View childAt = frameLayout.getChildAt(0);
        oa4 N = N(i);
        mainViewHolder.c0(N);
        N.create();
        View componentView = N.getComponentView(childAt);
        if (childAt != componentView) {
            frameLayout.removeAllViews();
            if (componentView.getParent() != null) {
                tgh.b("MainRecyclerAdapter", "reusedView has parent: " + mainViewHolder);
            }
            ygw.a(componentView);
            frameLayout.addView(componentView, new FrameLayout.LayoutParams(-1, -2));
        }
        N.willAppear();
        N.didAppear();
        M(i, N, frameLayout);
        wb4.a aVar = wb4.ComponentFatigueContainer;
        if (aVar.h() && (N instanceof DinamicXComponent) && (f = N.getComponentData().f()) != null && (string = f.getString("componentId4Fatigue")) != null && !((HashSet) this.e).contains(string)) {
            ((HashSet) this.e).add(string);
            aVar.b(string);
        }
    }
}
