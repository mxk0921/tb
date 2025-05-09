package com.taobao.mytaobao.pagev2.architecture;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.mytaobao.pagev2.MtbWeexManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.dgw;
import tb.ggw;
import tb.h3j;
import tb.j3j;
import tb.q3j;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<h3j> f11280a = new ArrayList();
    public final Map<String, h3j> b = new LinkedHashMap();
    public final HashMap<Integer, Integer> c = new HashMap<>();
    public final ggw d = new ggw();
    public JSONObject e;
    public View f;
    public final j3j g;
    public final MtbWeexManager h;

    static {
        t2o.a(745537901);
    }

    public MtbAdapter(j3j j3jVar, MtbWeexManager mtbWeexManager) {
        ckf.h(j3jVar, "mtbContext");
        ckf.h(mtbWeexManager, "weexManager");
        this.g = j3jVar;
        this.h = mtbWeexManager;
    }

    public static /* synthetic */ Object ipc$super(MtbAdapter mtbAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/architecture/MtbAdapter");
    }

    public final void M(List<h3j> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a999a67e", new Object[]{this, list});
            return;
        }
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                this.c.put(Integer.valueOf(i), Integer.valueOf(this.d.c((h3j) obj)));
                i = i2;
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    public final void N(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba12767", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (h3j h3jVar : list) {
            DXTemplateItem c = h3jVar.c();
            if (c != null && ckf.b(h3jVar.a(), "dinamicx")) {
                arrayList.add(c);
            }
        }
        this.g.b().e(arrayList);
    }

    public final RecyclerView.ViewHolder O(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("99aaccd8", new Object[]{this, context, str});
        }
        return new MtbAbsViewHolder(new View(context), str);
    }

    public final Map<String, h3j> P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this});
        }
        return this.b;
    }

    public final void Q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2af636", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public final List<h3j> getDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fd2c942", new Object[]{this});
        }
        return this.f11280a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f11280a).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Integer num = this.c.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        ckf.s();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        Integer num = null;
        if (!(viewHolder instanceof MtbAbsViewHolder)) {
            viewHolder2 = null;
        } else {
            viewHolder2 = viewHolder;
        }
        MtbAbsViewHolder mtbAbsViewHolder = (MtbAbsViewHolder) viewHolder2;
        if (mtbAbsViewHolder == null || (str = mtbAbsViewHolder.b0()) == null) {
            str = "empty";
        }
        this.g.d().c(str);
        q3j.INSTANCE.j((h3j) ((ArrayList) this.f11280a).get(i));
        if (viewHolder instanceof MtbDxViewHolder) {
            MtbDxViewHolder mtbDxViewHolder = (MtbDxViewHolder) viewHolder;
            h3j h3jVar = (h3j) ((ArrayList) this.f11280a).get(i);
            View view = this.f;
            if (view != null) {
                num = Integer.valueOf(view.getWidth());
            }
            mtbDxViewHolder.c0(h3jVar, num);
        } else if (viewHolder instanceof MtbWeexViewHolder) {
            ((MtbWeexViewHolder) viewHolder).d0((h3j) ((ArrayList) this.f11280a).get(i));
        }
        this.g.d().o(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.h(viewGroup, a.MSG_SOURCE_PARENT);
        this.f = viewGroup;
        String d = this.d.d(i);
        this.g.d().l(d);
        if (this.d.a(i)) {
            viewHolder = new MtbDxViewHolder(this.g, new FrameLayout(viewGroup.getContext()), this.e, d);
        } else if (this.d.b(i)) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            viewHolder = new MtbWeexViewHolder(this.h, frameLayout, d);
        } else {
            Context context = viewGroup.getContext();
            ckf.c(context, "parent.context");
            viewHolder = O(context, d);
        }
        this.g.d().k(d);
        return viewHolder;
    }

    public final void setData(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        ckf.h(list, "list");
        this.g.d().j(list);
        if (!ckf.b(this.f11280a, list)) {
            ((ArrayList) this.f11280a).clear();
            ((LinkedHashMap) this.b).clear();
            for (h3j h3jVar : list) {
                ((ArrayList) this.f11280a).add(h3jVar);
                Map<String, h3j> map = this.b;
                String f = h3jVar.f();
                if (f != null) {
                    map.put(f, h3jVar);
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
        M(list);
        N(list);
    }
}
