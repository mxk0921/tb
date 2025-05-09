package tb;

import android.content.Context;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.adapter.diff.UlronRecyclerDiffCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kav {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;
    public final ConcurrentHashMap<String, w7v> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Runnable> c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f22519a = pav.d(1, 5, 3, TimeUnit.SECONDS, new a(), "UltronRecyclerViewDiffUtils");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kav.a(kav.this).clear();
            hav.d(kav.b(kav.this), "UltronRecyclerViewDiffUtils#thread rejected");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements l5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerViewAdapter f22521a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;

        public b(RecyclerViewAdapter recyclerViewAdapter, List list, boolean z) {
            this.f22521a = recyclerViewAdapter;
            this.b = list;
            this.c = z;
        }

        public w7v a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w7v) ipChange.ipc$dispatch("c26889eb", new Object[]{this});
            }
            return kav.c(kav.this, this.f22521a, this.b, this.c);
        }

        public void b(w7v w7vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53531f50", new Object[]{this, w7vVar});
            } else {
                kav.d(kav.this, this.f22521a, this.b, w7vVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerViewAdapter f22522a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public c(RecyclerViewAdapter recyclerViewAdapter, List list, boolean z, String str) {
            this.f22522a = recyclerViewAdapter;
            this.b = list;
            this.c = z;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                kav.e(kav.this, this.d, kav.c(kav.this, this.f22522a, this.b, this.c));
            } catch (Exception e) {
                String f = kav.f(kav.this);
                hav.a(f, "asyncCalculateDiff exception#" + e.getMessage());
            }
        }
    }

    static {
        t2o.a(157286557);
    }

    public kav(String str) {
        this.d = str;
    }

    public static /* synthetic */ ConcurrentHashMap a(kav kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("cf113f28", new Object[]{kavVar});
        }
        return kavVar.b;
    }

    public static /* synthetic */ String b(kav kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37f75563", new Object[]{kavVar});
        }
        return kavVar.d;
    }

    public static /* synthetic */ w7v c(kav kavVar, RecyclerViewAdapter recyclerViewAdapter, List list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7v) ipChange.ipc$dispatch("314a7da6", new Object[]{kavVar, recyclerViewAdapter, list, new Boolean(z)});
        }
        return kavVar.h(recyclerViewAdapter, list, z);
    }

    public static /* synthetic */ void d(kav kavVar, RecyclerViewAdapter recyclerViewAdapter, List list, w7v w7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d189303", new Object[]{kavVar, recyclerViewAdapter, list, w7vVar});
        } else {
            kavVar.k(recyclerViewAdapter, list, w7vVar);
        }
    }

    public static /* synthetic */ void e(kav kavVar, String str, w7v w7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb8bd95", new Object[]{kavVar, str, w7vVar});
        } else {
            kavVar.s(str, w7vVar);
        }
    }

    public static /* synthetic */ String f(kav kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6d42567", new Object[]{kavVar});
        }
        return kavVar.o();
    }

    public static void m(RecyclerViewAdapter recyclerViewAdapter, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54de4aea", new Object[]{recyclerViewAdapter, list});
            return;
        }
        recyclerViewAdapter.setData(list);
        recyclerViewAdapter.notifyDataSetChanged();
    }

    public void g(RecyclerViewAdapter recyclerViewAdapter, List<IDMComponent> list, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f861a1d", new Object[]{this, recyclerViewAdapter, list, str, new Boolean(z)});
            return;
        }
        try {
            i();
            c cVar = new c(recyclerViewAdapter, list, z, str);
            r(str, cVar);
            this.f22519a.execute(cVar);
        } catch (Exception e) {
            String o = o();
            hav.a(o, "asyncCalculateDiff exception 1#" + e.getMessage());
        }
    }

    public final w7v h(RecyclerViewAdapter recyclerViewAdapter, List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7v) ipChange.ipc$dispatch("42ea76fc", new Object[]{this, recyclerViewAdapter, list, new Boolean(z)});
        }
        UlronRecyclerDiffCallback ulronRecyclerDiffCallback = new UlronRecyclerDiffCallback(list, recyclerViewAdapter.getData(), z);
        return new w7v(DiffUtil.calculateDiff(ulronRecyclerDiffCallback), ulronRecyclerDiffCallback.a());
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432cc688", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.c.values()) {
            this.f22519a.remove(runnable);
        }
        this.c.clear();
        this.b.clear();
    }

    public void j(Context context, RecyclerView recyclerView, RecyclerViewAdapter recyclerViewAdapter, List<IDMComponent> list, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc447413", new Object[]{this, context, recyclerView, recyclerViewAdapter, list, str, new Boolean(z)});
        } else if (recyclerView != null && recyclerViewAdapter != null && list != null) {
            if (recyclerView.isComputingLayout()) {
                m(recyclerViewAdapter, list);
            } else if (recyclerViewAdapter.getData() != null) {
                try {
                    recyclerView.setItemAnimator(null);
                    l(str, new b(recyclerViewAdapter, list, z));
                } catch (Exception e) {
                    m(recyclerViewAdapter, list);
                    String o = o();
                    hav.d(o, "diffNotifyDataSetChanged exception, refresh all#" + e.getMessage());
                }
            }
        }
    }

    public final void k(RecyclerViewAdapter recyclerViewAdapter, List<IDMComponent> list, w7v w7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9372df", new Object[]{this, recyclerViewAdapter, list, w7vVar});
            return;
        }
        recyclerViewAdapter.setData(list);
        int b2 = w7vVar.b();
        if (b2 <= 0) {
            recyclerViewAdapter.notifyDataSetChanged();
            hav.d(o(), "计算得出没有任何组件有数据变更，做全量刷新的补偿逻辑");
            return;
        }
        try {
            w7vVar.a().dispatchUpdatesTo(recyclerViewAdapter);
            String o = o();
            hav.d(o, "执行差量刷新，有变化的组件个数：" + b2);
        } catch (Exception e) {
            m(recyclerViewAdapter, list);
            hav.b(o(), "差量刷新出错，做全量刷新补偿", e.getMessage());
        }
    }

    public final void l(String str, l5e l5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b65660", new Object[]{this, str, l5eVar});
            return;
        }
        w7v n = n(str);
        if (n == null) {
            n = ((b) l5eVar).a();
            p(str);
        }
        ((b) l5eVar).b(n);
        q(str);
    }

    public final w7v n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7v) ipChange.ipc$dispatch("40052a7e", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5f7ebe", new Object[]{this});
        }
        return "UltronRecyclerViewDiffUtils";
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85a9fa3", new Object[]{this, str});
        } else {
            this.f22519a.remove(this.c.remove(str));
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134e237", new Object[]{this, str});
        } else {
            this.b.remove(str);
        }
    }

    public final void r(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b703b71a", new Object[]{this, str, runnable});
        } else {
            this.c.put(str, runnable);
        }
    }

    public final void s(String str, w7v w7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c8a01", new Object[]{this, str, w7vVar});
        } else {
            this.b.put(str, w7vVar);
        }
    }
}
