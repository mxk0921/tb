package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.RecommendViewPreloadListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wpk f26123a;
    public final HomeChildRecyclerView b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements wpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeChildRecyclerView f26124a;

        public a(HomeChildRecyclerView homeChildRecyclerView) {
            this.f26124a = homeChildRecyclerView;
        }

        @Override // tb.wpk
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else {
                RecommendViewPreloadListener.t(this.f26124a, pj9.a(pj9.this));
            }
        }

        @Override // tb.wpk
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(729810027);
    }

    public pj9(HomeChildRecyclerView homeChildRecyclerView, String str) {
        this.b = homeChildRecyclerView;
        this.c = str;
        d(homeChildRecyclerView);
    }

    public static /* synthetic */ String a(pj9 pj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff2d2fba", new Object[]{pj9Var});
        }
        return pj9Var.c;
    }

    public final wpk b(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpk) ipChange.ipc$dispatch("db7e1e0f", new Object[]{this, homeChildRecyclerView});
        }
        return new a(homeChildRecyclerView);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            e();
        }
    }

    public final void d(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee1caca", new Object[]{this, homeChildRecyclerView});
            return;
        }
        wpk b = b(homeChildRecyclerView);
        this.f26123a = b;
        homeChildRecyclerView.addLayoutListener(b);
    }

    public final void e() {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9d8501", new Object[]{this});
            return;
        }
        wpk wpkVar = this.f26123a;
        if (wpkVar != null && (homeChildRecyclerView = this.b) != null) {
            homeChildRecyclerView.removeLayoutListener(wpkVar);
        }
    }
}
