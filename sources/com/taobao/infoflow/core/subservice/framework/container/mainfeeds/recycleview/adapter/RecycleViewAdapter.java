package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.helper.RecommendDiffCallback;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import java.util.ArrayList;
import java.util.List;
import tb.aq6;
import tb.bve;
import tb.cfc;
import tb.cfj;
import tb.e6c;
import tb.e83;
import tb.eve;
import tb.fve;
import tb.g6h;
import tb.get;
import tb.gpf;
import tb.i1d;
import tb.j93;
import tb.mve;
import tb.p2b;
import tb.rrn;
import tb.s0a;
import tb.t2o;
import tb.ugc;
import tb.uh8;
import tb.vgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<BaseSectionModel> b;
    public final vgc c;
    public final ugc d;
    public final c e;
    public final g6h g;
    public final uh8 h;
    public final gpf i;
    public final RecyclerView j;

    /* renamed from: a  reason: collision with root package name */
    public List<BaseSectionModel> f10668a = new ArrayList();
    public final s0a f = new s0a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiffUtil.DiffResult f10669a;

        public a(DiffUtil.DiffResult diffResult) {
            this.f10669a = diffResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                eve.c("InfoFlowRVAdapter", "RV_executeDiffUtil01");
                RecycleViewAdapter.M(RecycleViewAdapter.this, this.f10669a);
                eve.b("InfoFlowRVAdapter", "RV_executeDiffUtil01");
            } catch (Exception e) {
                fve.e("InfoFlowRVAdapter", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiffUtil.DiffResult f10670a;

        public b(DiffUtil.DiffResult diffResult) {
            this.f10670a = diffResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                eve.c("InfoFlowRVAdapter", "RV_executeDiffUtil03");
                RecycleViewAdapter.M(RecycleViewAdapter.this, this.f10670a);
                eve.b("InfoFlowRVAdapter", "RV_executeDiffUtil03");
            } catch (Exception e) {
                fve.e("InfoFlowRVAdapter", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(List<BaseSectionModel> list);
    }

    static {
        t2o.a(486539663);
    }

    public RecycleViewAdapter(cfc cfcVar, RecyclerView recyclerView, ugc ugcVar, c cVar) {
        this.d = ugcVar;
        this.e = cVar;
        this.j = recyclerView;
        vgc N = N(cfcVar);
        this.c = N;
        this.g = new g6h(recyclerView, N);
        this.h = new uh8(recyclerView, N);
        this.i = new gpf(recyclerView);
        this.f10668a.add(cfj.a());
    }

    public static /* synthetic */ void M(RecycleViewAdapter recycleViewAdapter, DiffUtil.DiffResult diffResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a4eab2", new Object[]{recycleViewAdapter, diffResult});
        } else {
            recycleViewAdapter.P(diffResult);
        }
    }

    public static /* synthetic */ Object ipc$super(RecycleViewAdapter recycleViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/adapter/RecycleViewAdapter");
    }

    public final vgc N(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vgc) ipChange.ipc$dispatch("95797c88", new Object[]{this, cfcVar});
        }
        IItemRenderService iItemRenderService = (IItemRenderService) cfcVar.a(IItemRenderService.class);
        if (iItemRenderService != null) {
            return iItemRenderService.getItemRenderPresenter(cfcVar);
        }
        throw new IllegalArgumentException("InfoFlowRVAdapter， IItemRenderService 为必须注册服务");
    }

    public final List<BaseSectionModel> O(List<BaseSectionModel> list, boolean z) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("86586239", new Object[]{this, list, new Boolean(z)});
        }
        if (list == null || list.isEmpty()) {
            fve.f("InfoFlowRVAdapter", "InfoFlowRVAdapter", "cards is empty");
            arrayList = new ArrayList(1);
            arrayList.add(cfj.a());
        } else {
            arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
        }
        if (T(list, z)) {
            arrayList.add(cfj.b());
            this.g.d(this.f10668a, false, "LOADING");
        }
        return arrayList;
    }

    public final void P(DiffUtil.DiffResult diffResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb22799", new Object[]{this, diffResult});
        } else {
            diffResult.dispatchUpdatesTo(this);
        }
    }

    public List<BaseSectionModel> Q(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3da9325b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i >= 0 && i2 < this.f10668a.size()) {
            return this.f10668a.subList(i, i2);
        }
        fve.e("InfoFlowRVAdapter", "范围异常， fromIndex： " + i + "， toIndex ： " + i2 + ", mDataList.size() : " + this.f10668a.size());
        return null;
    }

    public BaseSectionModel<?> S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("13067438", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.f10668a.size()) {
            return null;
        }
        return this.f10668a.get(i);
    }

    /* renamed from: U */
    public void onBindViewHolder(RecycleViewHolder recycleViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db009cc7", new Object[]{this, recycleViewHolder, new Integer(i)});
            return;
        }
        List<BaseSectionModel> list = this.f10668a;
        if (list != null && !list.isEmpty() && recycleViewHolder.itemView != null) {
            if (bve.m()) {
                i1d.a();
            }
            BaseSectionModel<?> baseSectionModel = this.f10668a.get(i);
            this.d.U(i, baseSectionModel, recycleViewHolder.b0());
            boolean c2 = aq6.c(baseSectionModel, recycleViewHolder);
            if (c2) {
                aq6.b(baseSectionModel);
                eve.c("InfoFlowRVAdapter", baseSectionModel.getSectionBizCode());
                this.c.bindData(recycleViewHolder.b0(), baseSectionModel);
                eve.b("InfoFlowRVAdapter", baseSectionModel.getSectionBizCode());
                recycleViewHolder.c0(baseSectionModel);
            }
            eve.c("InfoFlowRVAdapter", "notifyOnBindData");
            this.d.l(c2, i, baseSectionModel, recycleViewHolder.b0());
            eve.b("InfoFlowRVAdapter", "notifyOnBindData");
            eve.c("InfoFlowRVAdapter", "bindDataViewCompensation");
            this.f.a(baseSectionModel, recycleViewHolder);
            this.d.O(c2, i, baseSectionModel, recycleViewHolder.b0());
            eve.b("InfoFlowRVAdapter", "bindDataViewCompensation");
        }
    }

    public void W(List<BaseSectionModel> list, e6c e6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51858edb", new Object[]{this, list, e6cVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (list != null && list == this.b) {
            if (e6cVar.a()) {
                fve.e("InfoFlowRVAdapter", "refreshData 强制刷新");
                Z();
                fve.e("InfoFlowRVAdapter", "refreshData isForceRefresh 强制刷新, cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                return;
            } else if (e6cVar.b()) {
                fve.e("InfoFlowRVAdapter", "refreshData isBaseRefresh");
                return;
            }
        }
        this.b = list;
        List<BaseSectionModel> list2 = this.f10668a;
        List<BaseSectionModel> O = O(list, e6cVar.isLastPage());
        this.f10668a = O;
        a0(O);
        if (e6cVar.b()) {
            Z();
            return;
        }
        fve.e("InfoFlowRVAdapter", "refreshData 通知差量刷新");
        Y(list2, this.f10668a);
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
            return;
        }
        this.h.b(this.f10668a, false);
        this.g.d(this.f10668a, true, "NONE");
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37faf199", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            eve.c("InfoFlowRVAdapter", "RV_notifyDataSetChanged03");
            notifyDataSetChanged();
            eve.b("InfoFlowRVAdapter", "RV_notifyDataSetChanged03");
        } else if (this.j.isComputingLayout()) {
            get.a().f(new rrn(this), 0L);
        } else {
            eve.c("InfoFlowRVAdapter", "RV_notifyDataSetChanged02");
            notifyDataSetChanged();
            eve.b("InfoFlowRVAdapter", "RV_notifyDataSetChanged02");
        }
    }

    public final void a0(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35a99b", new Object[]{this, list});
        } else {
            this.e.a(list);
        }
    }

    public void b0(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0ea5cb", new Object[]{this, baseSectionModel});
            return;
        }
        int b2 = e83.b(baseSectionModel.getSectionBizCode(), this.f10668a);
        if (b2 != -1) {
            this.f10668a.set(b2, baseSectionModel);
            notifyItemChanged(b2);
        }
    }

    public List<BaseSectionModel> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.f10668a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.f10668a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: V */
    public RecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecycleViewHolder) ipChange.ipc$dispatch("81a090b1", new Object[]{this, viewGroup, new Integer(i)});
        }
        View createView = this.c.createView(viewGroup, i);
        View a2 = this.i.a(createView);
        if ((a2 instanceof ViewGroup) && !mve.a("disableOutOfWindowAnimate", false)) {
            ((ViewGroup) a2).setClipChildren(false);
        }
        this.d.b(createView);
        return new RecycleViewHolder(a2, createView);
    }

    public final void Y(List<BaseSectionModel> list, List<BaseSectionModel> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e926e826", new Object[]{this, list, list2});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        eve.c("InfoFlowRVAdapter", "RV_calculateDiff");
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new RecommendDiffCallback(list, list2), false);
        eve.b("InfoFlowRVAdapter", "RV_calculateDiff");
        fve.e("InfoFlowRVAdapter", "DiffUtil.calculateDiff 耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        RecyclerView recyclerView = this.j;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            fve.e("InfoFlowRVAdapter", "RecyclerView 或 Adapter 为 null，无法进行更新");
        } else if (this.j.isComputingLayout()) {
            get.a().f(new a(calculateDiff), 0L);
        } else if (p2b.k()) {
            eve.c("InfoFlowRVAdapter", "RV_executeDiffUtil02");
            P(calculateDiff);
            eve.b("InfoFlowRVAdapter", "RV_executeDiffUtil02");
        } else {
            get.a().h(new b(calculateDiff));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        BaseSectionModel baseSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<BaseSectionModel> list = this.f10668a;
        if (list == null || list.isEmpty()) {
            this.f10668a = new ArrayList(1);
            baseSectionModel = cfj.a();
            this.f10668a.add(baseSectionModel);
        } else {
            baseSectionModel = this.f10668a.get(i);
            baseSectionModel.put("position", (Object) Integer.valueOf(i));
        }
        return this.c.getViewType(baseSectionModel);
    }

    public final boolean T(List<BaseSectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880ba733", new Object[]{this, list, new Boolean(z)})).booleanValue();
        }
        if (!mve.a("enableDeleteHostCard", true)) {
            return list != null && !list.isEmpty() && !z;
        }
        ArrayList arrayList = new ArrayList();
        for (BaseSectionModel baseSectionModel : list) {
            if (!j93.a(baseSectionModel)) {
                arrayList.add(baseSectionModel);
                return !z;
            }
        }
        return false;
    }
}
