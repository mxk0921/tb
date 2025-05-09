package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import java.util.List;
import tb.a1o;
import tb.cpf;
import tb.d9v;
import tb.gvp;
import tb.hga;
import tb.hha;
import tb.ieg;
import tb.jq6;
import tb.mug;
import tb.n10;
import tb.pfa;
import tb.sha;
import tb.t2o;
import tb.th5;
import tb.uga;
import tb.w2s;
import tb.wda;
import tb.x4h;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseGoodStateAdapter2<DataType> extends AbstractGoodsRecyclerAdapter<DataType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f8550a;
    public final ItemCategory b;
    public final RecyclerView c;
    public String d;
    public final List<DataType> e;
    public final a1o f;
    public jq6 g;
    public boolean h;
    public final cpf i;
    public final sha j;

    static {
        t2o.a(295699359);
    }

    public BaseGoodStateAdapter2(xea xeaVar, ItemCategory itemCategory, List<DataType> list, RecyclerView recyclerView) {
        uga ugaVar;
        this.f8550a = xeaVar;
        this.b = itemCategory;
        this.e = list;
        this.c = recyclerView;
        a1o a1oVar = new a1o(itemCategory, xeaVar.L());
        this.f = a1oVar;
        a1oVar.i(xeaVar);
        if (!wda.e()) {
            a D = xeaVar.D();
            ugaVar = new uga(xeaVar, D.G().c0(), D);
            ugaVar.m(recyclerView);
        } else {
            ugaVar = null;
        }
        this.i = new cpf(xeaVar, ugaVar);
        hha.b("BaseGoodStateAdapter", "BaseGoodStateAdapter 创建");
        this.j = new sha(xeaVar.i(), xeaVar);
    }

    public static /* synthetic */ Object ipc$super(BaseGoodStateAdapter2 baseGoodStateAdapter2, String str, Object... objArr) {
        if (str.hashCode() == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/adapter/BaseGoodStateAdapter2");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public List<DataType> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28e8d731", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public void O(jq6 jq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90beecc", new Object[]{this, jq6Var});
        } else {
            this.g = jq6Var;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public boolean P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbf2e8b1", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        boolean z2 = this.h;
        this.h = z;
        if (z2 != z) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89cfad0f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public abstract int S();

    public final boolean T(n10 n10Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53da3fd4", new Object[]{this, n10Var})).booleanValue();
        }
        if ((n10Var instanceof d9v) || (n10Var instanceof ieg)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.j.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<DataType> list = this.e;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.e.size() + (this.h ? 1 : 0);
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
        th5 M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.h && i == this.e.size()) {
            return 9;
        }
        List<DataType> list = this.e;
        if (list == null || list.size() <= i || (M = M(i)) == null) {
            return 4;
        }
        return M.f28716a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return this.i.a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        th5 M = M(adapterPosition);
        if (M != null && (jSONObject = M.b) != null) {
            jSONObject.remove("native_topItemAnimShow");
            if (this.f8550a.P()) {
                gvp.d(this.d, M, adapterPosition, S(), this.f8550a);
            }
        }
    }

    public void U(List<IDMComponentsFrameLayout> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908ef073", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                int position = this.c.getLayoutManager().getPosition(list.get(i));
                hha.c("BaseGoodStateAdapter", "refreshHolder | pos=" + position);
                if (position >= 0) {
                    notifyItemChanged(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        th5 M;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i != this.e.size() && (M = M(i)) != null && viewHolder.itemView != null) {
            hha.c("BaseGoodStateAdapter", "onBindViewHolder| , index=" + M.c + " holder=" + viewHolder);
            if (!hga.b(M.f28716a)) {
                DataType datatype = this.e.get(0);
                if (datatype instanceof x4h) {
                    z = ((x4h) datatype).f;
                }
                boolean g = this.f.g(this.f8550a, M.b, z, GLRenderType.GOODS_LIST);
                jq6 jq6Var = this.g;
                if (jq6Var != null && g) {
                    jq6Var.a(this.f8550a, M.b);
                }
            }
            JSONObject jSONObject = (JSONObject) M.b.clone();
            int S = S();
            if (i >= S) {
                i -= S;
            }
            jSONObject.put("item_position", (Object) Integer.valueOf(i + 1));
            TypeDX typeDX = (TypeDX) viewHolder;
            boolean T = T(typeDX.b0());
            String c = typeDX.b0().c();
            if (wda.F() && T) {
                View view = viewHolder.itemView;
                if ((view instanceof FrameLayout) && ((FrameLayout) view).getChildCount() == 0) {
                    int k = pfa.k(jSONObject, this.f8550a, c, 116);
                    View view2 = new View(this.f8550a.i());
                    view2.setLayoutParams(new FrameLayout.LayoutParams(-1, w2s.a(k)));
                    ((FrameLayout) viewHolder.itemView).addView(view2);
                    hha.c("BaseGoodStateAdapter", "index=" + M.c + " type=" + c + "    holdHeight=" + k);
                }
                this.j.b(typeDX, jSONObject, M.c);
            } else if (typeDX.b0() != null) {
                typeDX.b0().a(typeDX, jSONObject, M.c);
            }
            if (!wda.F()) {
                xea xeaVar = this.f8550a;
                xeaVar.T.e(xeaVar.i());
                mug.e();
            }
        }
    }
}
