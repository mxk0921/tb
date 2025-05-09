package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.avh;
import tb.byj;
import tb.cxj;
import tb.dh7;
import tb.jcf;
import tb.kjt;
import tb.nyj;
import tb.o2r;
import tb.q0j;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailRecyclerViewAdapter extends RecyclerView.Adapter<VerticalAbsViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kjt<VerticalAbsViewHolder> f7148a;
    public final dh7 b;
    public b d;
    public final cxj e;
    public int j;
    public final List<x3w> c = new ArrayList();
    public boolean f = true;
    public final List<VerticalAbsViewHolder> g = new ArrayList();
    public final List<VerticalAbsViewHolder> h = new ArrayList();
    public boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements avh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f7150a = null;
        public final /* synthetic */ boolean b;

        public a(DetailRecyclerViewAdapter detailRecyclerViewAdapter, boolean z) {
            this.b = z;
        }

        public Object a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("235e6c2f", new Object[]{this, str, obj});
            }
            try {
                String str2 = this.f7150a;
                if (str2 != null || obj == null) {
                    return str2;
                }
                String string = JSON.parseObject(URLDecoder.decode(obj.toString(), "utf-8")).getString("tpp_buckets");
                txj.e(txj.TAG_TIP, "nd-tppBuckets: preload:" + this.b + " bucket: " + string);
                this.f7150a = string;
                return string;
            } catch (Exception e) {
                txj.e("new_detail异常", Log.getStackTraceString(e));
                return obj;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7152a;
        public final x3w b;
        public final x3w c;
        public x3w d;

        static {
            t2o.a(352321951);
        }

        public d(DetailRecyclerViewAdapter detailRecyclerViewAdapter, x3w x3wVar, x3w x3wVar2) {
            this.b = x3wVar;
            this.c = x3wVar2;
        }
    }

    static {
        t2o.a(352321946);
    }

    public DetailRecyclerViewAdapter(cxj cxjVar, dh7 dh7Var, List<? extends x3w> list, kjt kjtVar) {
        this.e = cxjVar;
        setData(list);
        this.f7148a = kjtVar;
        this.b = dh7Var;
    }

    public static /* synthetic */ Object ipc$super(DetailRecyclerViewAdapter detailRecyclerViewAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailRecyclerViewAdapter");
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4518f4", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) it.next();
            if (verticalAbsViewHolder != null) {
                verticalAbsViewHolder.destroy();
            }
        }
    }

    public final com.taobao.android.detail2.core.framework.data.global.a P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.e.j();
    }

    public int Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bba3543", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            x3w x3wVar = (x3w) ((ArrayList) this.c).get(i);
            if (x3wVar != null && TextUtils.equals(x3wVar.h, str)) {
                return i;
            }
        }
        return -1;
    }

    public int S(String str, int i) {
        x3w x3wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe522eeb", new Object[]{this, str, new Integer(i)})).intValue();
        }
        List<x3w> list = this.c;
        if (list == null) {
            return -1;
        }
        if (i < 0 || i >= ((ArrayList) list).size() || (x3wVar = (x3w) ((ArrayList) this.c).get(i)) == null || !TextUtils.equals(x3wVar.h, str)) {
            return Q(str);
        }
        return i;
    }

    public final void U(final List<x3w> list, final List<x3w> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc4d5f6", new Object[]{this, list, list2});
            return;
        }
        try {
            final boolean c2 = this.e.m().c(byj.DOWNGRADE_KEY_NOT_RESET_MAIN_RENDER_MARGIN);
            DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback(this) { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailRecyclerViewAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/DetailRecyclerViewAdapter$1");
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                    }
                    x3w x3wVar = (x3w) list2.get(i);
                    x3w x3wVar2 = (x3w) list.get(i2);
                    if (c2) {
                        return x3wVar.j(x3wVar2);
                    }
                    if (!x3wVar.j(x3wVar2) || i != i2) {
                        return false;
                    }
                    return true;
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                    }
                    return ((x3w) list2.get(i)).k((x3w) list.get(i2));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
                    }
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
                    }
                    return list2.size();
                }
            });
            ((ArrayList) this.c).clear();
            ((ArrayList) this.c).addAll(list);
            calculateDiff.dispatchUpdatesTo(this);
            txj.e(txj.TAG_REALTIME, "实时插卡:UI刷新:局部刷新成功。");
        } catch (Throwable th) {
            ((ArrayList) this.c).clear();
            ((ArrayList) this.c).addAll(list);
            notifyDataSetChanged();
            txj.f(txj.TAG_REALTIME, "实时插卡:UI刷新:局部刷新失败，自动降级为全部刷新。且刷新成功。", th);
        }
    }

    /* renamed from: W */
    public VerticalAbsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("a6bf69cb", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.f7148a == null) {
            return null;
        }
        o2r.a("generateViewHolder_viewType_" + i);
        VerticalAbsViewHolder a2 = this.f7148a.a(this.e, this.b, viewGroup, i);
        o2r.b();
        if (a2 == null) {
            return null;
        }
        txj.e(txj.TAG_RENDER, "onCreateViewHolder: " + a2);
        if (!((ArrayList) this.h).contains(a2)) {
            ((ArrayList) this.h).add(a2);
        }
        return a2;
    }

    public final void X(VerticalAbsViewHolder verticalAbsViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73daa929", new Object[]{this, verticalAbsViewHolder, new Integer(i)});
        } else if ((P().r0() || P().u0()) && this.f && i != 0) {
            ((ArrayList) this.g).add(verticalAbsViewHolder);
            verticalAbsViewHolder.q1();
        }
    }

    public void Y(List<? extends x3w> list) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f8c7fc", new Object[]{this, list});
            return;
        }
        setData(list);
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        notifyItemRangeChanged(0, i);
    }

    public void b0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82474d41", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public void c0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a4261e", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) it.next();
            if (verticalAbsViewHolder != null) {
                txj.e(txj.TAG_RENDER, verticalAbsViewHolder.u0() + "sendEventToAllHolderWeex: " + str);
                verticalAbsViewHolder.E1(str, jSONObject);
            }
        }
    }

    public final void d0(String str, int i, x3w x3wVar) {
        String A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e244438", new Object[]{this, str, new Integer(i), x3wVar});
        } else if (i == 0 && x3wVar != null && (A = x3wVar.A()) != null) {
            boolean z = x3wVar.F;
            nyj.z().N(str, "bucketIsPreload", Boolean.valueOf(z));
            nyj.z().O(str, "tpp_bucket", A, new a(this, z));
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89aa38c", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) it.next();
            if (verticalAbsViewHolder != null) {
                verticalAbsViewHolder.M1();
            }
        }
    }

    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135edbec", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) it.next();
            if (verticalAbsViewHolder != null) {
                verticalAbsViewHolder.N1();
            }
        }
    }

    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b976f5", new Object[]{this});
        } else if (P().r0() || P().u0()) {
            this.f = false;
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) it.next();
                if (verticalAbsViewHolder != null) {
                    verticalAbsViewHolder.O1();
                }
            }
            ((ArrayList) this.g).clear();
        }
    }

    public List<x3w> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<x3w> list = this.c;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<x3w> list = this.c;
        if (list == null) {
            return super.getItemViewType(i);
        }
        x3w x3wVar = (x3w) ((ArrayList) list).get(i);
        if (x3wVar == null) {
            return super.getItemViewType(i);
        }
        return this.f7148a.b(x3wVar.b);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f7151a;
        public final List<d> b = new ArrayList();
        public final List<String> c = new ArrayList();

        static {
            t2o.a(352321950);
        }

        public c() {
        }

        public c(boolean z) {
        }
    }

    public int N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31f1ad11", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            x3w x3wVar = (x3w) ((ArrayList) this.c).get(i);
            if (x3wVar != null && TextUtils.equals(x3wVar.h, str)) {
                if (x3wVar.e != null) {
                    txj.e(txj.TAG_RENDER, "删除第" + i + "个节点, 根节点个数：" + x3wVar.e.size() + ", itemid: " + x3wVar.h);
                } else {
                    txj.e(txj.TAG_RENDER, "删除第" + i + "个节点, 错误状态：" + x3wVar.z + ", itemid: " + x3wVar.h);
                }
                ((ArrayList) this.c).remove(x3wVar);
                notifyItemRemoved(i);
                return i;
            }
        }
        return -1;
    }

    public void T(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcb522b", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            List<x3w> list2 = this.c;
            if (list2 == null || ((ArrayList) list2).size() == 0) {
                setData(list);
                notifyItemRangeInserted(0, list.size());
            }
            x3w x3wVar = (x3w) ((ArrayList) this.c).get(0);
            int i = x3wVar != null ? x3wVar.f31127a : 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                x3w x3wVar2 = (x3w) list.get(i2);
                if (x3wVar2 != null) {
                    x3wVar2.f31127a = (i - list.size()) + i2;
                    x3wVar2.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar2.f31127a, x3wVar2.b)));
                    q0j.b(x3wVar2, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar2.f31127a));
                    StringBuilder sb = new StringBuilder("在头部添加节点，下标：");
                    sb.append(x3wVar2.f31127a);
                    sb.append("，根节点个数：");
                    JSONObject jSONObject = x3wVar2.e;
                    sb.append(jSONObject != null ? jSONObject.size() : 0);
                    sb.append("，itemId：");
                    sb.append(x3wVar2.h);
                    txj.e(txj.TAG_RENDER, sb.toString());
                }
            }
            ((ArrayList) this.c).addAll(0, list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    /* renamed from: V */
    public void onBindViewHolder(VerticalAbsViewHolder verticalAbsViewHolder, int i) {
        String str;
        String str2;
        List<x3w> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b2fea9", new Object[]{this, verticalAbsViewHolder, new Integer(i)});
            return;
        }
        if (i != 0 || this.e == null) {
            str2 = null;
            str = null;
        } else {
            int i2 = this.j + 1;
            this.j = i2;
            str2 = nyj.x(i2);
            str = this.e.j().G();
            nyj.z().b(str, str2);
        }
        cxj cxjVar = this.e;
        if (cxjVar == null || cxjVar.i() == null) {
            q0j.m("main", q0j.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，onBindViewHolder" + i + "停止执行", null);
            if (str2 != null) {
                nyj.z().q(str, str2, false);
            }
        } else if (verticalAbsViewHolder != null && (list = this.c) != null && ((ArrayList) list).size() > i) {
            X(verticalAbsViewHolder, i);
            x3w x3wVar = (x3w) ((ArrayList) this.c).get(i);
            if (x3wVar != null) {
                txj.e(txj.TAG_RENDER, "onBindViewHolder" + i + ", nid:" + x3wVar.h + ", " + verticalAbsViewHolder);
            }
            try {
                o2r.a("onBindViewHolder_bindData_" + i);
                verticalAbsViewHolder.e0(x3wVar);
                o2r.b();
            } catch (Throwable th) {
                q0j.c(verticalAbsViewHolder.c, q0j.ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR, "卡片[" + verticalAbsViewHolder.getAdapterPosition() + "] bindData出现异常: ", th, true);
                txj.f(txj.TAG_RENDER, verticalAbsViewHolder.getAdapterPosition() + "adapter onBindViewHolder执行异常", th);
                if (str2 != null) {
                    nyj.z().N(str, "firstCardBindDataError", Log.getStackTraceString(th));
                }
            }
            b bVar = this.d;
            if (bVar != null) {
                ((ListViewManager.f) bVar).a(verticalAbsViewHolder);
            }
            if (str2 != null) {
                cxj cxjVar2 = this.e;
                if (cxjVar2 == null || !cxjVar2.j().N().c("nd_hit_downgrade_mts_bucket")) {
                    d0(str, i, x3wVar);
                } else {
                    txj.e(txj.TAG_TIP, "降级: ND 不进行 Mts tpp_buckets 的注入。");
                }
                nyj.z().q(str, str2, true);
            }
        } else if (str2 != null) {
            nyj.z().q(str, str2, false);
        }
    }

    public void a0(boolean z, String str, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a036f1", new Object[]{this, new Boolean(z), str, x3wVar});
        } else if (x3wVar == null || TextUtils.isEmpty(str)) {
            txj.e(txj.TAG_RENDER, "node为空或者nid为空，丢弃refreshnode请求");
        } else {
            for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
                x3w x3wVar2 = (x3w) ((ArrayList) this.c).get(i);
                String str2 = x3wVar2.h;
                if (str2 != null && str2.equals(str)) {
                    x3wVar.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar.f31127a, x3wVar.b)));
                    q0j.b(x3wVar, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar.f31127a));
                    x3wVar2.h = x3wVar.h;
                    x3wVar2.E = z;
                    x3wVar2.F = x3wVar.F;
                    Activity i2 = this.e.i();
                    txj.d(i2, txj.TAG_UT, i + "isPreload更新执行： " + x3wVar2.F);
                    if (x3wVar2.e != null) {
                        txj.e(txj.TAG_RENDER, "刷新第" + i + "个节点, 根节点个数：" + x3wVar2.e.size() + ", itemid: " + x3wVar2.h);
                    } else {
                        txj.e(txj.TAG_RENDER, "刷新第" + i + "个节点, 错误状态：" + x3wVar2.z + ", itemid: " + x3wVar2.h);
                    }
                    notifyItemChanged(i, x3wVar);
                    return;
                }
            }
            txj.e(txj.TAG_RENDER, "没有在列表中找到对应nid的数据节点，丢弃refreshnode请求");
        }
    }

    public void setData(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
            txj.e(txj.TAG_RENDER, "刷新所有节点");
            for (int i = 0; i < this.c.size(); i++) {
                x3w x3wVar = this.c.get(i);
                if (x3wVar != null) {
                    x3wVar.f31127a = i;
                    x3wVar.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar.f31127a, x3wVar.b)));
                    q0j.b(x3wVar, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar.f31127a));
                }
            }
        }
    }

    public void M(List<? extends x3w> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e25f5c", new Object[]{this, list});
        } else if (list != null) {
            int itemCount = getItemCount();
            List<x3w> list2 = this.c;
            x3w x3wVar = (x3w) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
            int i = x3wVar == null ? -1 : x3wVar.f31127a;
            if (!r19.K0() || this.i || ((ArrayList) this.c).size() != 2 || !jcf.SECOND_PLACE_HOLDER_NID.equals(((x3w) ((ArrayList) this.c).get(1)).h)) {
                z = false;
            } else {
                i--;
                z = true;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                x3w x3wVar2 = (x3w) list.get(i2);
                if (x3wVar2 != null) {
                    x3wVar2.f31127a = i2 + i + 1;
                    x3wVar2.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar2.f31127a, x3wVar2.b)));
                    q0j.b(x3wVar2, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar2.f31127a));
                    StringBuilder sb = new StringBuilder("在尾部添加节点，下标：");
                    sb.append(x3wVar2.f31127a);
                    sb.append("，根节点个数：");
                    JSONObject jSONObject = x3wVar2.e;
                    sb.append(jSONObject != null ? jSONObject.size() : 0);
                    sb.append("，itemId：");
                    sb.append(x3wVar2.h);
                    txj.e(txj.TAG_RENDER, sb.toString());
                }
            }
            if (r19.K0() && z && !list.isEmpty()) {
                x3w x3wVar3 = (x3w) list.get(0);
                list.remove(x3wVar3);
                ((ArrayList) this.c).set(1, x3wVar3);
                notifyItemChanged(1);
                this.i = true;
            }
            ((ArrayList) this.c).addAll(list);
            notifyItemRangeInserted(itemCount, list.size());
        }
    }

    public c Z(List<? extends x3w> list, int i) {
        String str;
        int i2;
        boolean z;
        x3w x3wVar;
        DetailRecyclerViewAdapter detailRecyclerViewAdapter = this;
        List<? extends x3w> list2 = list;
        int i3 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d5277d30", new Object[]{detailRecyclerViewAdapter, list2, new Integer(i3)});
        }
        c cVar = new c(true);
        x3w N = detailRecyclerViewAdapter.b.N();
        if (N == null) {
            str = "";
        } else {
            str = N.h;
        }
        detailRecyclerViewAdapter.b.V(str);
        if (i3 < 0 || i3 > ((ArrayList) detailRecyclerViewAdapter.c).size()) {
            txj.e(txj.TAG_REALTIME, "异常:实时插卡，UI侧得出的 newFromPos 小于 0 或 大于列表size，放弃插卡 。: newFromPos:" + i3 + " mListData.size:" + ((ArrayList) detailRecyclerViewAdapter.c).size());
            cVar.f7151a = i3;
            return cVar;
        }
        List<x3w> list3 = detailRecyclerViewAdapter.c;
        ArrayList arrayList = new ArrayList(detailRecyclerViewAdapter.c);
        HashMap hashMap = new HashMap();
        for (x3w x3wVar2 : list) {
            hashMap.put(x3wVar2.h, x3wVar2);
        }
        ArrayList arrayList2 = (ArrayList) list3;
        int min = Math.min(i3, arrayList2.size());
        for (int i4 = 0; i4 < min; i4++) {
            x3w x3wVar3 = (x3w) arrayList2.get(i4);
            if (hashMap.containsKey(x3wVar3.h)) {
                x3w x3wVar4 = (x3w) hashMap.get(x3wVar3.h);
                if (x3wVar4 != null) {
                    list2.remove(x3wVar4);
                    txj.e(txj.TAG_REALTIME, "异常:未知原因，历史列表中存在与新的实时插卡数据中相关的 nid 卡片。已移除此卡。nid:" + x3wVar3.h);
                } else {
                    txj.e(txj.TAG_REALTIME, "异常:未知原因，历史列表中存在与新的实时插卡数据中相关的 nid 卡片，且 newDuplicationNode 为 null。nid:" + x3wVar3.h);
                }
            }
        }
        if (list.size() == 0) {
            txj.e(txj.TAG_REALTIME, "实时插卡，UI侧收到的刷新列表为空，丢弃结果");
            cVar.f7151a = i3;
            return cVar;
        }
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            x3w x3wVar5 = (x3w) list2.get(i5);
            if (x3wVar5 != null) {
                String str2 = x3wVar5.h;
                if (!TextUtils.isEmpty(str2)) {
                    int size2 = arrayList.size();
                    int i7 = i3 + i6;
                    int i8 = i3;
                    x3w x3wVar6 = null;
                    while (true) {
                        if (i8 >= size2) {
                            size = size;
                            i8 = -1;
                            z = false;
                            break;
                        }
                        size = size;
                        x3w x3wVar7 = (x3w) arrayList.get(i8);
                        if (x3wVar7 == null) {
                            x3wVar6 = x3wVar7;
                            size2 = size2;
                        } else {
                            size2 = size2;
                            if (str2.equals(x3wVar7.h)) {
                                z = x3wVar7.X;
                                txj.e(txj.TAG_REALTIME, "实时插卡数据与旧数据相同，oldNodeIndex:" + i8 + " replaceIndex:" + i5 + " newNodeTargetIndex:" + i7 + " newNodeNid:" + str2 + " hitCardFixedWillGiveUpNewNode:" + z);
                                x3wVar6 = x3wVar7;
                                break;
                            }
                            x3wVar6 = x3wVar7;
                        }
                        i8++;
                        size = size;
                    }
                    if (z) {
                        txj.e(txj.TAG_REALTIME, "实时插卡数据与旧数据相同，且遇到 fix 卡片，丢弃:" + str2);
                        arrayList2 = arrayList2;
                        i2 = i5;
                        detailRecyclerViewAdapter = detailRecyclerViewAdapter;
                        i5 = i2 + 1;
                        i3 = i;
                        list2 = list;
                    } else {
                        arrayList2 = arrayList2;
                        if (i8 < 0 || x3wVar6 == null) {
                            i2 = i5;
                            detailRecyclerViewAdapter = detailRecyclerViewAdapter;
                            x3wVar5.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar5.f31127a, x3wVar5.b)));
                            q0j.b(x3wVar5, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar5.f31127a));
                            int i9 = i7 - 1;
                            if (i9 < 0 || i9 >= arrayList.size()) {
                                x3wVar = null;
                            } else {
                                x3wVar = (x3w) arrayList.get(i9);
                                txj.e(txj.TAG_REALTIME, "实时插卡，纯新卡PreNode nid 为:" + x3wVar.h + " preIndex:" + i9);
                            }
                            d dVar = new d(detailRecyclerViewAdapter, null, x3wVar5);
                            dVar.d = x3wVar;
                            dVar.f7152a = true;
                            txj.e(txj.TAG_REALTIME, "实时插卡，纯新卡开始插入。newNodeTargetIndex:" + i7 + " oldNodeIndex:" + i8 + " newNodeNid:" + str2);
                            arrayList.add(i7, x3wVar5);
                            ((ArrayList) cVar.b).add(dVar);
                            ((ArrayList) cVar.c).add(str2);
                            i6++;
                            txj.e(txj.TAG_REALTIME, "纯新卡插入完成，newNodeNid:" + str2);
                            i5 = i2 + 1;
                            i3 = i;
                            list2 = list;
                        } else {
                            i2 = i5;
                            x3wVar5.b("nativeHalfGuide", String.valueOf(P().J0(x3wVar5.f31127a, x3wVar5.b)));
                            q0j.b(x3wVar5, q0j.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(x3wVar5.f31127a));
                            if (i7 == i8) {
                                arrayList.set(i7, x3wVar5);
                                i6++;
                                txj.e(txj.TAG_REALTIME, "实时插卡数据与旧数据相同，且位置相同。已完成数据替换:" + str2 + " oldNodeIndex:" + i8);
                            } else if (i7 < i8) {
                                txj.e(txj.TAG_REALTIME, "实时插卡数据与旧数据相同，且需提升位置(新位置 < oldNodeIndex)。newNodeTargetIndex:" + i7 + " oldNodeIndex:" + i8);
                                arrayList.set(i7, x3wVar5);
                                arrayList.remove(i8);
                                arrayList.add(i7 + 1, (x3w) arrayList.get(i7));
                                i6++;
                                txj.e(txj.TAG_REALTIME, "位置变更完成(新位置 < oldNodeIndex)，newNodeNid:" + str2 + " newNodeTargetIndex:" + i7);
                            } else {
                                txj.e(txj.TAG_REALTIME, "实时插卡数据与旧数据相同，且需提升位置(新位置 > oldNodeIndex)。newNodeTargetIndex:" + i7 + " oldNodeIndex:" + i8);
                                arrayList.remove(i8);
                                int i10 = i7 + (-1);
                                arrayList.add(i10, x3wVar5);
                                i6++;
                                txj.e(txj.TAG_REALTIME, "位置变更完成(新位置 > oldNodeIndex)，newNodeNid:" + str2 + " newNodeTargetIndex:" + i10);
                                detailRecyclerViewAdapter = this;
                                ((ArrayList) cVar.b).add(new d(detailRecyclerViewAdapter, x3wVar6, x3wVar5));
                                ((ArrayList) cVar.c).add(str2);
                                i5 = i2 + 1;
                                i3 = i;
                                list2 = list;
                            }
                            detailRecyclerViewAdapter = this;
                            ((ArrayList) cVar.b).add(new d(detailRecyclerViewAdapter, x3wVar6, x3wVar5));
                            ((ArrayList) cVar.c).add(str2);
                            i5 = i2 + 1;
                            i3 = i;
                            list2 = list;
                        }
                    }
                }
            }
            size = size;
            arrayList2 = arrayList2;
            i2 = i5;
            detailRecyclerViewAdapter = detailRecyclerViewAdapter;
            i5 = i2 + 1;
            i3 = i;
            list2 = list;
        }
        int size3 = arrayList.size();
        for (int i11 = i; i11 < size3; i11++) {
            x3w x3wVar8 = (x3w) arrayList.get(i11);
            if (x3wVar8 != null) {
                x3wVar8.f31127a = i11;
            }
        }
        detailRecyclerViewAdapter.U(arrayList, arrayList2);
        cVar.f7151a = i;
        txj.e(txj.TAG_REALTIME, "实时插卡，UI侧收到的刷新列表已处理完成。newFromPos:" + i);
        return cVar;
    }
}
