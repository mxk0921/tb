package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent;
import com.taobao.android.detail.ttdetail.skeleton.recommend.b;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.nb4;
import tb.oa4;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.vbl;
import tb.xon;
import tb.xsk;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RecommendRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_DOUBLE_COLUMN = 2;
    public static final int TYPE_SINGLE_COLUMN = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6947a;
    public final ze7 b;
    public final List<oa4> c = new ArrayList(0);
    public xon d;
    public xsk e;
    public boolean f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RecommendItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f6948a;

        static {
            t2o.a(912262642);
        }

        public RecommendItemDecoration(int i) {
            this.f6948a = i;
        }

        public static /* synthetic */ Object ipc$super(RecommendItemDecoration recommendItemDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/recommend/RecommendRecyclerAdapter$RecommendItemDecoration");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            int spanSize = layoutParams.getSpanSize();
            int spanIndex = layoutParams.getSpanIndex();
            if (spanSize != 2) {
                if (spanIndex == 0) {
                    int i = this.f6948a;
                    rect.left = i;
                    rect.right = i / 2;
                    return;
                }
                int i2 = this.f6948a;
                rect.left = i2 / 2;
                rect.right = i2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RecommendViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(912262643);
        }

        public RecommendViewHolder(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.recommend.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("723c17cd", new Object[]{this});
            } else {
                RecommendRecyclerAdapter.M(RecommendRecyclerAdapter.this);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.recommend.b.a
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                RecommendRecyclerAdapter.N(RecommendRecyclerAdapter.this, true);
            }
        }
    }

    static {
        t2o.a(912262640);
    }

    public RecommendRecyclerAdapter(Context context, ze7 ze7Var) {
        this.f6947a = context;
        this.b = ze7Var;
    }

    public static /* synthetic */ void M(RecommendRecyclerAdapter recommendRecyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab45c790", new Object[]{recommendRecyclerAdapter});
        } else {
            recommendRecyclerAdapter.T();
        }
    }

    public static /* synthetic */ boolean N(RecommendRecyclerAdapter recommendRecyclerAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab117965", new Object[]{recommendRecyclerAdapter, new Boolean(z)})).booleanValue();
        }
        recommendRecyclerAdapter.g = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(RecommendRecyclerAdapter recommendRecyclerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/recommend/RecommendRecyclerAdapter");
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae23fb48", new Object[]{this});
            return;
        }
        b bVar = new b(this.f6947a, this.b, new nb4(new JSONObject()), new DataEntry[0]);
        bVar.y(new a());
        ((ArrayList) this.c).add(bVar);
    }

    public <F extends oa4> F P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ((oa4) ipChange.ipc$dispatch("cd822227", new Object[]{this, new Integer(i)}));
        }
        if (i <= -1 || i >= ((ArrayList) this.c).size()) {
            return null;
        }
        return (F) ((oa4) ((ArrayList) this.c).get(i));
    }

    public List<oa4> Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9f4973b", new Object[]{this});
        }
        return this.c;
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda45745", new Object[]{this});
            return;
        }
        int size = ((ArrayList) this.c).size() - 1;
        if (P(size) instanceof b) {
            ((ArrayList) this.c).remove(size);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2713bd8", new Object[]{this});
            return;
        }
        JSONObject a2 = this.d.a();
        if (this.e != null && a2 != null && !a2.isEmpty()) {
            tgh.b("RecommendRecyclerAdapter", "onPagingRequest");
            ((NewTTDetailRecommendComponent.a) this.e).a(a2);
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72321926", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void V(xsk xskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cd918f", new Object[]{this, xskVar});
        } else {
            this.e = xskVar;
        }
    }

    public void W(xon xonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da5956", new Object[]{this, xonVar});
        } else {
            this.d = xonVar;
        }
    }

    public <F extends oa4> void X(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de283eb7", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            ((ArrayList) this.c).addAll(list);
            O();
            tgh.b("RecommendRecyclerAdapter", "mComponentList.size=" + ((ArrayList) this.c).size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!((ArrayList) this.c).isEmpty() && viewHolder.itemView != null) {
            boolean c = this.d.c();
            FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
            View childAt = frameLayout.getChildAt(0);
            oa4 P = P(i);
            if (P != null) {
                P.create();
                View componentView = P.getComponentView(childAt);
                if (childAt != componentView) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(componentView, new FrameLayout.LayoutParams(-1, -2));
                }
                if (i != getItemCount() - 1) {
                    P.willAppear();
                    P.didAppear();
                } else if (P instanceof b) {
                    b bVar = (b) P;
                    if (this.f && !this.g) {
                        bVar.B();
                    } else if (!c || this.g) {
                        bVar.z();
                        this.g = true;
                    } else {
                        bVar.A();
                    }
                }
                if (c && !this.f && !this.g) {
                    int parseInt = Integer.parseInt(vbl.O0());
                    if (((ArrayList) this.c).size() - i == parseInt || (((ArrayList) this.c).size() <= parseInt && i == ((ArrayList) this.c).size() - 1)) {
                        T();
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new RecommendViewHolder((FrameLayout) LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_cell_container, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        oa4 P;
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return (!((ArrayList) this.c).isEmpty() && (P = P(i)) != null && (f = P.getComponentData().f()) != null && !f.isEmpty() && TextUtils.equals("doubleColumn", f.getString("style"))) ? 2 : 1;
    }
}
