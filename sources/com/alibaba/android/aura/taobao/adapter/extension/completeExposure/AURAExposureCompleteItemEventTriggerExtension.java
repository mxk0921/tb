package com.alibaba.android.aura.taobao.adapter.extension.completeExposure;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.taobao.adapter.extension.completeExposure.a;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ai;
import tb.ck;
import tb.dn;
import tb.hbb;
import tb.kcb;
import tb.lo;
import tb.pi;
import tb.qi;
import tb.rbb;
import tb.rj;
import tb.t2o;
import tb.yi;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.completeExposure")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAExposureCompleteItemEventTriggerExtension implements kcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPLETE_KEY = "completeExposure";
    public static final List<String> e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public lo f2144a;
    public AURAGlobalData b;
    public AURAFlowData c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f2146a;
        public final /* synthetic */ RecyclerView.ViewHolder b;
        public final /* synthetic */ List c;

        public a(AURARenderComponent aURARenderComponent, RecyclerView.ViewHolder viewHolder, List list) {
            this.f2146a = aURARenderComponent;
            this.b = viewHolder;
            this.c = list;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9e4f836", new Object[]{this, new Float(f)});
                return;
            }
            rbb g = ck.g();
            g.e("ExposureCompleteItemEventTrigger", this.f2146a.key + " 比例曝光：" + f);
            AURAExposureCompleteItemEventTriggerExtension.r(AURAExposureCompleteItemEventTriggerExtension.this, this.b, this.f2146a, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f2147a;
        public final /* synthetic */ List b;

        public b(AURARenderComponent aURARenderComponent, List list) {
            this.f2147a = aURARenderComponent;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                rbb g = ck.g();
                g.e("ExposureCompleteItemEventTrigger", this.f2147a.key + " 执行曝光事件🚗");
                AURAExposureCompleteItemEventTriggerExtension.J0(AURAExposureCompleteItemEventTriggerExtension.this, this.b, this.f2147a);
            } catch (Throwable th) {
                rbb g2 = ck.g();
                g2.e("checkAndExecuteComponentEvent exception " + th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float f2148a = 0.0f;
        public float b = 1.0f;

        static {
            t2o.a(81789031);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
    }

    static {
        t2o.a(81789027);
        t2o.a(80740550);
    }

    public static /* synthetic */ int B(AURAExposureCompleteItemEventTriggerExtension aURAExposureCompleteItemEventTriggerExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16da31b9", new Object[]{aURAExposureCompleteItemEventTriggerExtension})).intValue();
        }
        return aURAExposureCompleteItemEventTriggerExtension.d;
    }

    public static /* synthetic */ void J0(AURAExposureCompleteItemEventTriggerExtension aURAExposureCompleteItemEventTriggerExtension, List list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76861962", new Object[]{aURAExposureCompleteItemEventTriggerExtension, list, aURARenderComponent});
        } else {
            aURAExposureCompleteItemEventTriggerExtension.R0(list, aURARenderComponent);
        }
    }

    public static /* synthetic */ int L(AURAExposureCompleteItemEventTriggerExtension aURAExposureCompleteItemEventTriggerExtension, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("834c2fae", new Object[]{aURAExposureCompleteItemEventTriggerExtension, new Integer(i)})).intValue();
        }
        aURAExposureCompleteItemEventTriggerExtension.d = i;
        return i;
    }

    public static /* synthetic */ boolean m0(AURAExposureCompleteItemEventTriggerExtension aURAExposureCompleteItemEventTriggerExtension, RecyclerView.ViewHolder viewHolder, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04b3f8f", new Object[]{aURAExposureCompleteItemEventTriggerExtension, viewHolder, cVar})).booleanValue();
        }
        return aURAExposureCompleteItemEventTriggerExtension.K0(viewHolder, cVar);
    }

    public static /* synthetic */ void r(AURAExposureCompleteItemEventTriggerExtension aURAExposureCompleteItemEventTriggerExtension, RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645158c4", new Object[]{aURAExposureCompleteItemEventTriggerExtension, viewHolder, aURARenderComponent, list});
        } else {
            aURAExposureCompleteItemEventTriggerExtension.N0(viewHolder, aURARenderComponent, list);
        }
    }

    public static /* synthetic */ List x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db54c88f", new Object[0]);
        }
        return e;
    }

    @Override // tb.kcb
    public void E(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df0d417", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        List<Event> M0 = M0(aURARenderComponent);
        if (M0 != null && !M0.isEmpty()) {
            rbb g = ck.g();
            g.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " onAppear " + this.c.getFlowCode());
            if (aURARenderComponent.isInvisible()) {
                rbb g2 = ck.g();
                g2.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 不可见");
                return;
            }
            try {
                if (!aURARenderComponent.isAsync()) {
                    L0(viewHolder, aURARenderComponent, M0);
                } else if (aURARenderComponent.asyncStatus() != null && aURARenderComponent.asyncStatus().equals("success")) {
                    L0(viewHolder, aURARenderComponent, M0);
                }
            } catch (Exception e2) {
                rbb g3 = ck.g();
                g3.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + e2.getMessage());
                rj.d("COMPLETE_EXPOSURE_EXCEPTION", e2.getMessage());
            }
        }
    }

    public final boolean K0(RecyclerView.ViewHolder viewHolder, c cVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("546a0832", new Object[]{this, viewHolder, cVar})).booleanValue();
        }
        if (viewHolder == null || (view = viewHolder.itemView) == null) {
            return false;
        }
        int height = (int) (view.getHeight() * cVar.b);
        Rect rect = new Rect();
        viewHolder.itemView.getGlobalVisibleRect(rect);
        int i = rect.top;
        if (i < 0 || i > ((ai.d() + ai.e()) - ai.a(cVar.f2148a)) - height) {
            return false;
        }
        return true;
    }

    public final synchronized void L0(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d1c73e", new Object[]{this, viewHolder, aURARenderComponent, list});
            return;
        }
        a.C0060a aVar = O0().get(aURARenderComponent.key);
        List<String> list2 = e;
        if (!((ArrayList) list2).contains(aURARenderComponent.key) || (aVar != null && !aVar.f2149a)) {
            ((ArrayList) list2).add(aURARenderComponent.key);
        }
        if (T0(viewHolder)) {
            rbb g = ck.g();
            g.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 全曝光");
            N0(viewHolder, aURARenderComponent, list);
            return;
        }
        V0(viewHolder, aURARenderComponent, list);
    }

    public final List<Event> M0(AURARenderComponent aURARenderComponent) {
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7bdcc639", new Object[]{this, aURARenderComponent});
        }
        ArrayList arrayList = new ArrayList();
        if (aURARenderComponent == null) {
            return arrayList;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return arrayList;
        }
        Map<String, List<Event>> map = aURARenderComponentData.events;
        if (map == null || map.isEmpty() || (list = map.get("exposureItemComplete")) == null || list.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    @Override // tb.kcb
    public void N(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3c8047", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    public final Map<String, a.C0060a> O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("727a2e5c", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData == null) {
            return new HashMap();
        }
        Map<String, a.C0060a> map = (Map) aURAGlobalData.get(COMPLETE_KEY, Map.class);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.b.update(COMPLETE_KEY, hashMap);
        return hashMap;
    }

    public final c P0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("fe210c5b", new Object[]{this, aURARenderComponent});
        }
        c cVar = new c();
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return cVar;
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (map == null) {
            return cVar;
        }
        Object obj = map.get("exposureOffset");
        Object obj2 = map.get("exposurePercent");
        try {
            if (obj instanceof String) {
                cVar.f2148a = Float.parseFloat((String) obj);
            }
            if (obj2 instanceof String) {
                cVar.b = Float.parseFloat((String) obj2);
            }
        } catch (Throwable th) {
            ck.g().e("ExposureCompleteItemEventTrigger", th.getMessage());
        }
        return cVar;
    }

    public final RecyclerView Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ac9f6910", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData == null) {
            return null;
        }
        return (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
    }

    public final void R0(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fed0b4", new Object[]{this, list, aURARenderComponent});
        } else if (list != null) {
            for (Event event : list) {
                if (event != null) {
                    qi qiVar = new qi();
                    qiVar.n(event.getFields());
                    qiVar.t(aURARenderComponent);
                    if (event.getTag() != null) {
                        qiVar.o(event.getTag());
                    }
                    String type = event.getType();
                    lo loVar = this.f2144a;
                    if (!(loVar == null || type == null)) {
                        pi.b(loVar.c(), event.getType(), qiVar);
                    }
                }
            }
        }
    }

    public final void S0(final RecyclerView.ViewHolder viewHolder, final c cVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92752c63", new Object[]{this, viewHolder, cVar, dVar});
            return;
        }
        RecyclerView Q0 = Q0();
        if (Q0 == null) {
            ck.g().e("ExposureCompleteItemEventTrigger", "recyclerView is null");
        } else {
            Q0.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.aura.taobao.adapter.extension.completeExposure.AURAExposureCompleteItemEventTriggerExtension.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    if (str.hashCode() == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/completeExposure/AURAExposureCompleteItemEventTriggerExtension$2");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (AURAExposureCompleteItemEventTriggerExtension.x().isEmpty()) {
                        recyclerView.removeOnScrollListener(this);
                    }
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (Math.abs(computeVerticalScrollOffset - AURAExposureCompleteItemEventTriggerExtension.B(AURAExposureCompleteItemEventTriggerExtension.this)) >= 10) {
                        AURAExposureCompleteItemEventTriggerExtension.L(AURAExposureCompleteItemEventTriggerExtension.this, computeVerticalScrollOffset);
                        if (AURAExposureCompleteItemEventTriggerExtension.m0(AURAExposureCompleteItemEventTriggerExtension.this, viewHolder, cVar)) {
                            ((a) dVar).a(cVar.b);
                        }
                    }
                }
            });
        }
    }

    public final boolean T0(RecyclerView.ViewHolder viewHolder) {
        RecyclerView Q0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d6a1408", new Object[]{this, viewHolder})).booleanValue();
        }
        if (viewHolder.itemView == null || (Q0 = Q0()) == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = Q0.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition < findFirstCompletelyVisibleItemPosition || adapterPosition > findLastCompletelyVisibleItemPosition) {
            return false;
        }
        return true;
    }

    public final void V0(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7be5491", new Object[]{this, viewHolder, aURARenderComponent, list});
        } else if (((ArrayList) e).isEmpty()) {
            rbb g = ck.g();
            g.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 曝光列表为空");
        } else {
            S0(viewHolder, P0(aURARenderComponent), new a(aURARenderComponent, viewHolder, list));
        }
    }

    public final void W0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5e68f4", new Object[]{this, aURARenderComponent});
        } else {
            ((ArrayList) e).remove(aURARenderComponent.key);
        }
    }

    public final void X0(AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f4c834", new Object[]{this, aURARenderComponent, list});
        } else {
            dn.h(new b(aURARenderComponent, list));
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f2144a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = aURAGlobalData;
        this.c = aURAFlowData;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            ((ArrayList) e).clear();
        }
    }

    public final void N0(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b18a88", new Object[]{this, viewHolder, aURARenderComponent, list});
        } else if (viewHolder == null || aURARenderComponent == null || aURARenderComponent.key == null) {
            ck.g().e("ExposureCompleteItemEventTrigger", "renderComponent or holder is null");
        } else {
            W0(aURARenderComponent);
            Map<String, a.C0060a> O0 = O0();
            a.C0060a aVar = O0.get(aURARenderComponent.key);
            if (aVar == null || !aVar.f2149a) {
                AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
                Map<String, Object> map = aURARenderComponentData != null ? aURARenderComponentData.fields : null;
                if (map == null || map.isEmpty()) {
                    rbb g = ck.g();
                    g.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 没有数据");
                } else if (aVar == null || aVar.b == null || !U0(map)) {
                    a.C0060a aVar2 = new a.C0060a();
                    aVar2.f2149a = true;
                    aVar2.b = map;
                    O0.put(aURARenderComponent.key, aVar2);
                    AURAGlobalData aURAGlobalData = this.b;
                    if (aURAGlobalData != null) {
                        aURAGlobalData.update(COMPLETE_KEY, O0);
                    }
                    X0(aURARenderComponent, list);
                } else {
                    rbb g2 = ck.g();
                    g2.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 不可见");
                }
            } else {
                rbb g3 = ck.g();
                g3.e("ExposureCompleteItemEventTrigger", aURARenderComponent.key + " 已经曝光");
            }
        }
    }

    public final boolean U0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbf6c7b9", new Object[]{this, map})).booleanValue();
        }
        AURAFlowData aURAFlowData = this.c;
        if (aURAFlowData == null || !aURAFlowData.getFlowCode().equals("aura.workflow.update")) {
            return false;
        }
        return !map.containsKey("visible");
    }
}
