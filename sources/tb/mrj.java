package tb;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f24252a;

        public a(mrj mrjVar, k6c k6cVar) {
            this.f24252a = k6cVar;
        }

        @Override // tb.h6c.e
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4813aba", new Object[]{this, new Boolean(z)});
            } else {
                this.f24252a.c(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f24253a;

        public b(mrj mrjVar, k6c k6cVar) {
            this.f24253a = k6cVar;
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else {
                this.f24253a.H();
            }
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            } else {
                this.f24253a.T();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f24254a;

        public c(mrj mrjVar, k6c k6cVar) {
            this.f24254a = k6cVar;
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else {
                this.f24254a.D(z, z2);
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (viewGroup instanceof RecyclerView) {
                this.f24254a.e((RecyclerView) viewGroup, i);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else if (viewGroup instanceof RecyclerView) {
                this.f24254a.d((RecyclerView) viewGroup, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6c.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f24255a;

        public d(mrj mrjVar, k6c k6cVar) {
            this.f24255a = k6cVar;
        }

        @Override // tb.h6c.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ec7ab1", new Object[]{this});
            } else {
                this.f24255a.N();
            }
        }
    }

    static {
        t2o.a(486539685);
    }

    public RecyclerView a(Context context, k6c<RecyclerView> k6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c4aa228e", new Object[]{this, context, k6cVar});
        }
        NestedScrollRecyclerView nestedScrollRecyclerView = new NestedScrollRecyclerView(context);
        nestedScrollRecyclerView.setOnWindowVisibilityChangedListener(new a(this, k6cVar));
        nestedScrollRecyclerView.setOnFeedsLayoutListener(new b(this, k6cVar));
        nestedScrollRecyclerView.setRecyclerViewScrollListener(new c(this, k6cVar));
        nestedScrollRecyclerView.setFirstScreenDiffRefreshListener(new d(this, k6cVar));
        return nestedScrollRecyclerView;
    }
}
