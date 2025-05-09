package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.bi6;
import tb.h36;
import tb.ic5;
import tb.t2o;
import tb.t66;
import tb.vy8;
import tb.xt5;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RecyclerAdapter extends BaseStickyAdapter implements DXRecyclerViewCacheExtension.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADMORE_TITLE = "load_more_title";
    public static final String TAG = "RecyclerAdapter";
    public static final int TYPE_FOOTER_VIEW = -1;
    public final boolean A;
    public o g;
    public final Context h;
    public xt5 j;
    public DXRecyclerLayout k;
    public boolean n;
    public final TextView o;
    public final View p;
    public DXAbsOnLoadMoreView q;
    public final ProgressBar r;
    public ArrayList<DXWidgetNode> i = new ArrayList<>();
    public final DXViewEvent l = new DXViewEvent(-8975334121118753601L);
    public final DXViewEvent m = new DXViewEvent(-5201408949358043646L);
    public String s = "太火爆啦，点我再尝试下吧";
    public String t = "";
    public String u = "亲，已经到底了哦";
    public int v = 0;
    public int w = 0;
    public int z = 1;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final Map<String, Integer> x = new HashMap();
    public final Map<Integer, String> y = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public DXWidgetNode f7466a;

        static {
            t2o.a(444597525);
        }

        public ItemViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RecyclerAdapter.U(RecyclerAdapter.this, view);
            }
        }
    }

    static {
        t2o.a(444597523);
        t2o.a(444597692);
    }

    public RecyclerAdapter(Context context, boolean z, boolean z2) {
        this.h = context;
        this.n = z;
        if (this.n) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.p = linearLayout;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int W = (int) W(context, 10.0f);
            linearLayout.setPadding(W, W, W, W);
            linearLayout.setGravity(17);
            linearLayout.setLayoutParams(layoutParams);
            ProgressBar progressBar = new ProgressBar(context);
            this.r = progressBar;
            int W2 = (int) W(context, 20.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(W2, W2);
            layoutParams2.rightMargin = W;
            progressBar.setVisibility(8);
            linearLayout.addView(progressBar, layoutParams2);
            TextView textView = new TextView(context);
            this.o = textView;
            textView.setTextSize(14.0f);
            textView.setTextColor(Color.parseColor("#A5A5A5"));
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.A = z2;
    }

    public static /* synthetic */ void U(RecyclerAdapter recyclerAdapter, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae66d9c0", new Object[]{recyclerAdapter, view});
        } else {
            recyclerAdapter.i0(view);
        }
    }

    public static /* synthetic */ Object ipc$super(RecyclerAdapter recyclerAdapter, String str, Object... objArr) {
        if (str.hashCode() == 143764512) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/RecyclerAdapter");
    }

    @Override // com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.c
    public View G(RecyclerView recyclerView, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e10f8177", new Object[]{this, recyclerView, new Integer(i)});
        }
        try {
            if (getItemViewType(i) == -1) {
                return null;
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) onCreateViewHolder(recyclerView, i);
            DXWidgetNode Z = Z(i, true);
            if (!(Z instanceof bi6) || !((bi6) Z).J()) {
                z = false;
            }
            j0(i, Z, z, itemViewHolder);
            return itemViewHolder.itemView;
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    @Override // tb.ysd
    public void L(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdc4f70", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXWidgetNode item = getItem(i);
        if (item instanceof bi6) {
            ((bi6) item).V(i, z);
        }
        this.k.k1(i, z);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.BaseStickyAdapter
    public void N(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd798fba", new Object[]{this, viewHolder, new Integer(i)});
        } else {
            g0(viewHolder, i);
        }
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41000780", new Object[]{this})).intValue();
        }
        if (this.A) {
            xt5 xt5Var = this.j;
            if (xt5Var == null) {
                return 0;
            }
            return xt5Var.l();
        }
        ArrayList<DXWidgetNode> arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final float W(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c0a4afe", new Object[]{this, context, new Float(f)})).floatValue();
        }
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public View X(int i) {
        DXRecyclerViewCacheExtension c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("68a7c921", new Object[]{this, new Integer(i)});
        }
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (dXRecyclerLayout == null || (c0 = dXRecyclerLayout.c0()) == null) {
            return null;
        }
        return c0.b(i);
    }

    public final int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19994fd3", new Object[]{this})).intValue();
        }
        if (!this.n || c0()) {
            return 0;
        }
        return 1;
    }

    public DXWidgetNode Z(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5f144ee0", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (this.A) {
            xt5 xt5Var = this.j;
            if (xt5Var == null) {
                return null;
            }
            DXWidgetNode i2 = xt5Var.i(i);
            if (i2 == null && z && this.k != null && this.j.h() != null) {
                if (i >= 0 && i < this.j.h().size()) {
                    Object obj = this.j.h().get(i);
                    xt5 xt5Var2 = this.j;
                    i2 = xt5Var2.f(this.k, obj, xt5Var2.h(), this.k.g0(), i, null);
                    this.k.O0(i2, i, true);
                    if (i2 == null || this.j.c(i, i2)) {
                    }
                }
                return null;
            }
            return i2;
        }
        ArrayList<DXWidgetNode> arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.i.get(i);
    }

    public int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97ed251d", new Object[]{this})).intValue();
        }
        return this.z;
    }

    public final int b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a2fcbe0", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (dXRecyclerLayout == null || dXRecyclerLayout.getDXRuntimeContext() == null || this.k.getDXRuntimeContext().L() == null || this.k.getDXRuntimeContext().L().getDxNestedScrollerView(this.k.getDXRuntimeContext()) == null || this.k.getDXRuntimeContext().L().getDxNestedScrollerView(this.k.getDXRuntimeContext()).getmChildList() == null) {
            return 0;
        }
        return this.k.getDXRuntimeContext().L().getDxNestedScrollerView(this.k.getDXRuntimeContext()).getStickyHeight();
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a946e9", new Object[]{this})).booleanValue();
        }
        if (this.A) {
            xt5 xt5Var = this.j;
            if (xt5Var == null || xt5Var.l() <= 0) {
                return true;
            }
            return false;
        }
        ArrayList<DXWidgetNode> arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public DXRuntimeContext cloneDxRuntimeContextResetError(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("b9da80c0", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
        f fVar = new f(b.c());
        fVar.b = b.p();
        b.g0(fVar);
        return b;
    }

    public final boolean d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70741df6", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.n || i < getItemCount() - Y()) {
            return false;
        }
        return true;
    }

    public void f0(int i, DXWidgetNode dXWidgetNode, vy8 vy8Var, String str, ItemViewHolder itemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7260568a", new Object[]{this, new Integer(i), dXWidgetNode, vy8Var, str, itemViewHolder});
            return;
        }
        t66.r(vy8Var, "onBindStart-cellInfo", "  pos  " + i + "  itemInfo  " + str + "  rlId  " + this.k.getUserId());
    }

    public DXWidgetNode getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
        }
        return Z(i, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.A) {
            xt5 xt5Var = this.j;
            if (xt5Var != null && (l = xt5Var.l()) > 0) {
                return l + Y();
            }
            return 0;
        }
        ArrayList<DXWidgetNode> arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        return this.i.size() + Y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        DXWidgetNode Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        if (d0(i)) {
            return 2147483647L;
        }
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (dXRecyclerLayout == null || dXRecyclerLayout.getDXRuntimeContext() == null || !zg5.X4(this.k.getDXRuntimeContext().c()) || (Z = Z(i, true)) == null) {
            return i;
        }
        return Z.getAutoId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (d0(i)) {
            return -1;
        }
        DXWidgetNode Z = Z(i, true);
        if (Z instanceof bi6) {
            bi6 bi6Var = (bi6) Z;
            if (!TextUtils.isEmpty(bi6Var.A())) {
                str = bi6Var.A();
            } else {
                str = bi6Var.E();
            }
            if (((HashMap) this.x).containsKey(str)) {
                return ((Integer) ((HashMap) this.x).get(str)).intValue();
            }
            int size = ((HashMap) this.x).size();
            ((HashMap) this.x).put(str, Integer.valueOf(size));
            ((HashMap) this.y).put(Integer.valueOf(size), str);
            return size;
        } else if (((HashMap) this.x).containsKey("default")) {
            return ((Integer) ((HashMap) this.x).get("default")).intValue();
        } else {
            int size2 = ((HashMap) this.x).size();
            ((HashMap) this.x).put("default", Integer.valueOf(size2));
            ((HashMap) this.y).put(Integer.valueOf(size2), "default");
            return size2;
        }
    }

    public void h0(int i) {
        int i2;
        DXRecyclerLayout dXRecyclerLayout;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0677342", new Object[]{this, new Integer(i)});
        } else if (this.n && (i2 = this.z) != 2 && i2 != 5 && !c0() && (dXRecyclerLayout = this.k) != null && (i3 = this.z) != 6 && i3 != 2) {
            if (i < 0) {
                dXRecyclerLayout.G0();
            } else if (i > 0 && getItemCount() - (i + 1) <= this.k.d0()) {
                this.k.G0();
            }
        }
    }

    public final void i0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7451b", new Object[]{this, view});
        } else if (3 == this.z) {
            h0(-1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j0(int r19, com.taobao.android.dinamicx.widget.DXWidgetNode r20, boolean r21, com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter.ItemViewHolder r22) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter.j0(int, com.taobao.android.dinamicx.widget.DXWidgetNode, boolean, com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter$ItemViewHolder):void");
    }

    public final void k0(DXWidgetNode dXWidgetNode, ItemViewHolder itemViewHolder) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70e9a0b", new Object[]{this, dXWidgetNode, itemViewHolder});
        } else if ((dXWidgetNode instanceof bi6) && itemViewHolder != null && (view = itemViewHolder.itemView) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dXWidgetNode.getMarginTop();
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = dXWidgetNode.getMarginBottom();
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = dXWidgetNode.getMarginLeft();
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = dXWidgetNode.getMarginRight();
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.utils.DXRecyclerViewCacheExtension.c
    public boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acb395a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        DXWidgetNode item = getItem(i);
        if (item == null || item.getDXRuntimeContext().D() != null) {
            return false;
        }
        return true;
    }

    public void l0(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
        } else {
            setDataSource((ArrayList) list);
        }
    }

    public void m0(xt5 xt5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b969", new Object[]{this, xt5Var});
            return;
        }
        this.j = xt5Var;
        T();
    }

    public void n0(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b4028", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.A) {
            xt5 xt5Var = this.j;
            if (xt5Var != null) {
                xt5Var.t(i, dXWidgetNode);
            }
        } else {
            ArrayList<DXWidgetNode> arrayList = this.i;
            if (arrayList != null && i >= 0 && i < arrayList.size()) {
                this.i.set(i, dXWidgetNode);
            }
        }
    }

    @Override // tb.ysd
    public boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("296eb38d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        DXWidgetNode item = getItem(i);
        if (item instanceof bi6) {
            return ((bi6) item).L();
        }
        return false;
    }

    public void o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d62b4f9", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == -1) {
            RelativeLayout relativeLayout = new RelativeLayout(this.h);
            DXAbsOnLoadMoreView dXAbsOnLoadMoreView = this.q;
            if (dXAbsOnLoadMoreView != null) {
                relativeLayout.addView(dXAbsOnLoadMoreView, new ViewGroup.LayoutParams(-1, -2));
            } else {
                View view = this.p;
                if (view != null) {
                    relativeLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
                }
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = b0();
            layoutParams.setFullSpan(true);
            relativeLayout.setLayoutParams(layoutParams);
            ItemViewHolder itemViewHolder = new ItemViewHolder(relativeLayout);
            relativeLayout.setOnClickListener(new a());
            return itemViewHolder;
        }
        View X = X(i);
        if (X == null) {
            if (!this.k.A0() || (oVar = this.g) == null) {
                X = new DXNativeFrameLayout(this.h);
            } else {
                X = oVar.i(this.h);
            }
        }
        X.setLayoutParams(new StaggeredGridLayoutManager.LayoutParams(-2, -2));
        return new ItemViewHolder(X);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        this.m.setItemIndex(viewHolder.getAdapterPosition());
        this.k.postEvent(this.m);
        ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
        DXWidgetNode dXWidgetNode = itemViewHolder.f7466a;
        if (dXWidgetNode != null) {
            if (!this.C) {
                dXWidgetNode.sendBroadcastEvent(this.m);
            }
            this.k.removeAppearWidget(itemViewHolder.f7466a);
            if (itemViewHolder.f7466a.getDXRuntimeContext() != null && itemViewHolder.f7466a.getDXRuntimeContext().s() != null && itemViewHolder.f7466a.getDXRuntimeContext().s().f() != null && itemViewHolder.f7466a.getDXRuntimeContext().s().f().z() != null) {
                itemViewHolder.f7466a.getDXRuntimeContext().s().f().z().k(itemViewHolder.f7466a.getDXRuntimeContext().C());
            }
        }
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73c59fd", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5770b31b", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public void r0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f73823", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de524471", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public void setDataSource(ArrayList<DXWidgetNode> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fc4efc", new Object[]{this, arrayList});
            return;
        }
        this.i = arrayList;
        T();
    }

    public void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36187446", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3aa611", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a831b51", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public void w0(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505ada", new Object[]{this, dXRecyclerLayout});
            return;
        }
        this.k = dXRecyclerLayout;
        if (dXRecyclerLayout != null && this.g == null) {
            this.g = new o(dXRecyclerLayout.getDXRuntimeContext().s(), 3, UUID.randomUUID().toString(), dXRecyclerLayout.A0());
            DXEngineConfig c = dXRecyclerLayout.getDXRuntimeContext().s().c();
            if (!(c == null || c.e() == null)) {
                this.q = c.e().getOnLoadMoreView(dXRecyclerLayout.getUserId());
            }
            this.D = zg5.P2(dXRecyclerLayout.getDXRuntimeContext().c());
        }
    }

    public void x0(int i) {
        DXRecyclerViewCacheExtension c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520cd585", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (dXRecyclerLayout != null && (c0 = dXRecyclerLayout.c0()) != null) {
            c0.m(i);
        }
    }

    public void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d1e21", new Object[]{this, new Integer(i)});
        } else if (this.n && this.z != i) {
            this.z = i;
            int i2 = this.v;
            if (i2 != 0) {
                this.o.setTextColor(i2);
            }
            int i3 = this.w;
            if (i3 != 0) {
                this.o.setTextSize(0, i3);
            }
            switch (i) {
                case 1:
                case 6:
                    if (this.q == null) {
                        this.r.setVisibility(8);
                        this.o.setText("");
                        break;
                    } else {
                        this.q.onLoadMoreStatusUpdate(i, new JSONObject());
                        break;
                    }
                case 2:
                    if (this.q == null) {
                        this.r.setVisibility(0);
                        this.o.setVisibility(0);
                        this.o.setText(this.t);
                        break;
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("load_more_title", (Object) this.t);
                        this.q.onLoadMoreStatusUpdate(i, jSONObject);
                        break;
                    }
                case 3:
                    if (this.q == null) {
                        this.r.setVisibility(8);
                        this.o.setVisibility(0);
                        this.o.setText(this.s);
                        break;
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("load_more_title", (Object) this.s);
                        this.q.onLoadMoreStatusUpdate(i, jSONObject2);
                        break;
                    }
                case 4:
                    if (this.q == null) {
                        this.r.setVisibility(8);
                        this.o.setVisibility(0);
                        this.o.setText("");
                        break;
                    } else {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("load_more_title", (Object) "");
                        this.q.onLoadMoreStatusUpdate(i, jSONObject3);
                        break;
                    }
                case 5:
                    if (this.q == null) {
                        this.r.setVisibility(8);
                        this.o.setVisibility(0);
                        this.o.setText(this.u);
                        break;
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("load_more_title", (Object) this.u);
                        this.q.onLoadMoreStatusUpdate(i, jSONObject4);
                        break;
                    }
            }
            DXRecyclerLayout dXRecyclerLayout = this.k;
            if (dXRecyclerLayout != null && zg5.G4(dXRecyclerLayout.getDXRuntimeContext().c()) && this.p != null) {
                h36.g("RLLoadMore", "HitRLLoadMoreGone");
                if (i == 6 || i == 4 || (i == 5 && TextUtils.isEmpty(this.u))) {
                    this.p.setVisibility(8);
                } else {
                    this.p.setVisibility(0);
                }
            }
        }
    }

    @Override // tb.ysd
    public int z(int i) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9bee03d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (o(i)) {
            DXWidgetNode item = getItem(i);
            if (item instanceof bi6) {
                return ((bi6) item).D();
            }
        } else if (K(i) && (e = e(i)) >= 0) {
            DXWidgetNode item2 = getItem(e);
            if (item2 instanceof bi6) {
                return ((bi6) item2).D();
            }
        }
        return 0;
    }

    public void e0(int i, DXWidgetNode dXWidgetNode, vy8 vy8Var, ItemViewHolder itemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ab4e1", new Object[]{this, new Integer(i), dXWidgetNode, vy8Var, itemViewHolder});
            return;
        }
        itemViewHolder.f7466a = dXWidgetNode;
        this.l.setItemIndex(i);
        if (dXWidgetNode.getBindingXExecutingMap() != null) {
            dXWidgetNode.getBindingXExecutingMap().clear();
        }
        if (!this.B) {
            dXWidgetNode.sendBroadcastEvent(this.l);
        }
        this.k.postEvent(this.l);
        this.k.addAppearWidget(dXWidgetNode);
        View view = itemViewHolder.itemView;
        if (view == null || (!(view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0)) {
            this.k.j1(f.DX_ERROR_CODE_RECYCLER_LAYOUT_ON_BINDHOLDER, "onbindViewholder返回的view是空");
            t66.p(vy8Var, "onbindViewholder返回的view是空: " + i);
        }
        t66.q(vy8Var, "onBindEnd", System.currentTimeMillis());
        if (dXWidgetNode.getDXRuntimeContext().b0()) {
            dXWidgetNode.updateRefreshType(0);
        }
        x0(i);
    }

    public void g0(RecyclerView.ViewHolder viewHolder, int i) {
        DXWidgetNode Z;
        ItemViewHolder itemViewHolder;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0654bd", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (getItemViewType(i) != -1) {
            vy8 vy8Var = null;
            try {
                Z = Z(i, true);
                itemViewHolder = (ItemViewHolder) viewHolder;
                if (Z instanceof bi6) {
                    z = ((bi6) Z).J();
                    vy8Var = ((bi6) Z).C();
                    str = ((bi6) Z).E();
                } else {
                    str = "";
                }
            } catch (Throwable th) {
                try {
                    f fVar = new f(WXBasicComponentType.RECYCLER);
                    f.a aVar = new f.a("DX_RECYCLER", "DX_RECYCLER_BIND", 200006);
                    aVar.e = xv5.a(th);
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                    xv5.b(th);
                    t66.p(null, "onbindViewholder 发生 exception" + i);
                } finally {
                    t66.l(null);
                }
            }
            if (!(Z == null || this.g == null)) {
                f0(i, Z, vy8Var, str, itemViewHolder);
                j0(i, Z, z, itemViewHolder);
                e0(i, Z, vy8Var, itemViewHolder);
            }
            h36.g(TAG, "get item null!");
            t66.p(vy8Var, "get item null!");
            return;
        }
        h0(i);
    }
}
