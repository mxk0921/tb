package com.taobao.tao.recommend4.manager.weex2.container.nested;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.R4StaggeredGridLayoutManager;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import com.taobao.tao.recommend4.recyclerview.a;
import io.unicorn.plugin.platform.WeexNestedFrameLayout;
import java.util.Map;
import tb.arm;
import tb.d11;
import tb.d40;
import tb.fnn;
import tb.fve;
import tb.khd;
import tb.l9n;
import tb.m7x;
import tb.mhd;
import tb.sfh;
import tb.t2o;
import tb.vu3;
import tb.x7x;
import tb.yce;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexNestedScrollRecommendContainer extends d40 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public WeexNestedFrameLayout d;
    public fnn e;
    public RecyclerView f;
    public long g;
    public boolean h;
    public final yce i = v();
    public m7x j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements yce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.yce
        public void a(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7846bdea", new Object[]{this, new Double(d)});
            } else {
                WeexNestedScrollRecommendContainer.this.z(d);
            }
        }

        @Override // tb.yce
        public void k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            } else {
                WeexNestedScrollRecommendContainer.this.C(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements khd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e23c54f", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rendertime", (Object) String.valueOf(System.currentTimeMillis()));
            jSONObject.put("optimizeType", (Object) arm.a());
            WeexNestedScrollRecommendContainer.this.b("infoflowrendered", jSONObject);
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                sfh.d("NestedContainerCreator", "IRecommendCallback onError");
            }
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.tao.recommend4.recyclerview.a.e
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58ca4a1b", new Object[]{this, new Integer(i)});
            } else if (WeexNestedScrollRecommendContainer.q(WeexNestedScrollRecommendContainer.this) != null) {
                if (WeexNestedScrollRecommendContainer.r(WeexNestedScrollRecommendContainer.this) != null) {
                    WeexNestedScrollRecommendContainer.r(WeexNestedScrollRecommendContainer.this).H();
                }
                fve.e("NestedContainerCreator", "triggerWeexScroll, flingVelocity : " + i);
                WeexNestedScrollRecommendContainer.q(WeexNestedScrollRecommendContainer.this).d(false, i);
            }
        }
    }

    static {
        t2o.a(729810016);
    }

    public WeexNestedScrollRecommendContainer(Context context, d40.a aVar) {
        super(context, aVar);
        this.c = context;
    }

    public static /* synthetic */ Object ipc$super(WeexNestedScrollRecommendContainer weexNestedScrollRecommendContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/manager/weex2/container/nested/WeexNestedScrollRecommendContainer");
    }

    public static /* synthetic */ m7x q(WeexNestedScrollRecommendContainer weexNestedScrollRecommendContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7x) ipChange.ipc$dispatch("2cb85570", new Object[]{weexNestedScrollRecommendContainer});
        }
        return weexNestedScrollRecommendContainer.j;
    }

    public static /* synthetic */ fnn r(WeexNestedScrollRecommendContainer weexNestedScrollRecommendContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("497ee85d", new Object[]{weexNestedScrollRecommendContainer});
        }
        return weexNestedScrollRecommendContainer.e;
    }

    public final void B(fnn fnnVar, x7x x7xVar) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3570223", new Object[]{this, fnnVar, x7xVar});
            return;
        }
        Map<?, ?> c2 = x7xVar.c();
        if (c2 != null) {
            try {
                parseObject = JSON.parseObject(JSON.toJSONString(c2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            fnnVar.w(new d11(x7xVar.a(), x7xVar.d()), parseObject);
        }
        parseObject = null;
        fnnVar.w(new d11(x7xVar.a(), x7xVar.d()), parseObject);
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480e4bd2", new Object[]{this, new Boolean(z)});
        } else {
            this.e.E(z);
        }
    }

    public void D(m7x m7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65aad234", new Object[]{this, m7xVar});
            return;
        }
        this.j = m7xVar;
        this.d = (WeexNestedFrameLayout) m7xVar.b(null);
    }

    public final void E(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dea983", new Object[]{this, recyclerView});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
    }

    public final void F(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0070831", new Object[]{this, recyclerView});
        } else if (recyclerView.getAdapter() instanceof RecommendRecyclerAdapter) {
            ((RecommendRecyclerAdapter) recyclerView.getAdapter()).c0(0);
        }
    }

    @Override // tb.d40
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        fve.e("NestedContainerCreator", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        fnn fnnVar = this.e;
        if (fnnVar != null) {
            fnnVar.c();
        }
    }

    @Override // tb.d40
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.d40
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        fve.e("NestedContainerCreator", Constant.KEY_PAGEBACK);
        fnn fnnVar = this.e;
        if (fnnVar != null) {
            fnnVar.s(null);
        }
    }

    @Override // tb.d40
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dbb07d", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView instanceof HomeChildRecyclerView) {
            ((HomeChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
        }
    }

    @Override // tb.d40
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612e188", new Object[]{this, str});
            return;
        }
        fve.e("NestedContainerCreator", "setBizParams:" + str);
        x7x x7xVar = new x7x(str);
        if (y(x7xVar.b(), this.e)) {
            x(this.d, x7xVar);
            B(this.e, x7xVar);
        }
    }

    @Override // tb.d40
    public void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5556b515", new Object[]{this, new Long(j)});
            return;
        }
        fve.e("NestedContainerCreator", "setPageRenderStartTime:" + j);
        this.g = j;
        this.h = A(this.e, j);
    }

    public final a.e s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.e) ipChange.ipc$dispatch("f487a49b", new Object[]{this});
        }
        return new c();
    }

    public final khd t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("7208f50a", new Object[]{this});
        }
        return new b();
    }

    public final RecyclerView.OnScrollListener u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("a565d267", new Object[]{this});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.manager.weex2.container.nested.WeexNestedScrollRecommendContainer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/manager/weex2/container/nested/WeexNestedScrollRecommendContainer$4");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof R4StaggeredGridLayoutManager) {
                    R4StaggeredGridLayoutManager r4StaggeredGridLayoutManager = (R4StaggeredGridLayoutManager) layoutManager;
                    if (i == 1 && r4StaggeredGridLayoutManager.A() && WeexNestedScrollRecommendContainer.q(WeexNestedScrollRecommendContainer.this) != null) {
                        WeexNestedScrollRecommendContainer.q(WeexNestedScrollRecommendContainer.this).e(false);
                    }
                }
            }
        };
    }

    public final yce v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yce) ipChange.ipc$dispatch("2e8b606b", new Object[]{this});
        }
        return new a();
    }

    public yce w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yce) ipChange.ipc$dispatch("7a588151", new Object[]{this});
        }
        return this.i;
    }

    public void z(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54609473", new Object[]{this, new Double(d)});
            return;
        }
        fve.e("NestedContainerCreator", "nestedScroll velocity: " + d);
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && d > vu3.b.GEO_NOT_SUPPORT) {
            this.f.fling(0, (int) (d * recyclerView.getContext().getApplicationContext().getResources().getDisplayMetrics().density));
        }
        fnn fnnVar = this.e;
        if (fnnVar != null) {
            fnnVar.I();
        }
    }

    public final void x(WeexNestedFrameLayout weexNestedFrameLayout, x7x x7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4d7b2d", new Object[]{this, weexNestedFrameLayout, x7xVar});
            return;
        }
        if (this.e == null) {
            z4a b2 = x7xVar.b();
            this.e = fnn.e(b2);
            l9n.b("rc-recomment-container", b2.b());
            this.e.y(t());
            this.e.B(c());
        }
        if (this.f == null) {
            RecyclerView a2 = this.e.a(this.c);
            this.f = a2;
            a2.setBackgroundColor(0);
            this.f.addOnScrollListener(u());
            E(this.f);
            weexNestedFrameLayout.addView(this.f);
            this.e.D(s());
        }
        if (x7xVar.f()) {
            F(this.f);
        }
        if (!this.h) {
            A(this.e, this.g);
        }
    }

    public final boolean A(fnn fnnVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bd3a10", new Object[]{this, fnnVar, new Long(j)})).booleanValue();
        }
        if (fnnVar == null) {
            sfh.d("NestedContainerCreator", "recommendContainer == null");
            return false;
        }
        mhd p = fnnVar.p();
        if (p == null) {
            sfh.d("NestedContainerCreator", "recommendLifeCycleReport == null");
            return false;
        }
        p.s(j);
        return true;
    }

    public final boolean y(z4a z4aVar, fnn fnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166353ff", new Object[]{this, z4aVar, fnnVar})).booleanValue();
        }
        if (z4aVar == null) {
            fve.e("NestedContainerCreator", "gatewayContainerType is null");
            return false;
        } else if (fnnVar == null || z4aVar != z4a.REC_FAVORITE) {
            return true;
        } else {
            fve.e("NestedContainerCreator", "收藏夹已经初始化并请求过则不在主动触发请求，避免频繁请求第一页");
            return false;
        }
    }
}
