package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d27 implements okc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17511a;
    public final RecyclerView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17512a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f17512a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d27.a(d27.this).getAdapter().notifyItemRangeInserted(this.f17512a, this.b);
            } catch (Exception e) {
                tfs.e(d27.b(d27.this), e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17513a;
        public final /* synthetic */ int b;

        public b(int i, int i2) {
            this.f17513a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d27.a(d27.this).getAdapter().notifyItemRangeRemoved(this.f17513a, this.b);
            } catch (Exception e) {
                tfs.e(d27.b(d27.this), e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17514a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.f17514a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d27.a(d27.this).getAdapter().notifyItemMoved(this.f17514a, this.b);
            } catch (Exception e) {
                tfs.e(d27.b(d27.this), e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f17515a;

        public d(Set set) {
            this.f17515a = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                for (Integer num : this.f17515a) {
                    d27.a(d27.this).getAdapter().notifyItemChanged(num.intValue(), 1);
                }
            } catch (Exception e) {
                tfs.e(d27.b(d27.this), e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d27.a(d27.this).getAdapter().notifyDataSetChanged();
            } catch (Exception e) {
                tfs.e(d27.b(d27.this), e.getMessage());
            }
        }
    }

    static {
        t2o.a(503316911);
        t2o.a(503316918);
    }

    public d27(String str, RecyclerView recyclerView) {
        this.f17511a = str;
        this.b = recyclerView;
    }

    public static /* synthetic */ RecyclerView a(d27 d27Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a7f4dbd5", new Object[]{d27Var});
        }
        return d27Var.b;
    }

    public static /* synthetic */ String b(d27 d27Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d4f47d1", new Object[]{d27Var});
        }
        return d27Var.f17511a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37faf199", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            if (this.b.isComputingLayout()) {
                nwv.y0(new e());
            } else {
                this.b.getAdapter().notifyDataSetChanged();
            }
        }
    }

    @Override // tb.okc
    public void onItemChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5972ed89", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i2));
            if (this.b.isComputingLayout()) {
                nwv.y0(new d(hashSet));
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.b.getAdapter().notifyItemChanged(((Integer) it.next()).intValue(), 1);
            }
        }
    }

    @Override // tb.okc
    public void onItemInserted(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9462", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            if (this.b.isComputingLayout()) {
                nwv.y0(new a(i2, i3));
            } else {
                this.b.getAdapter().notifyItemRangeInserted(i2, i3);
            }
        }
    }

    @Override // tb.okc
    public void onItemMoved(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc595b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            if (this.b.isComputingLayout()) {
                nwv.y0(new c(i2, i3));
            } else {
                this.b.getAdapter().notifyItemMoved(i2, i3);
            }
        }
    }

    @Override // tb.okc
    public void onItemRemoved(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690cce8e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            if (this.b.isComputingLayout()) {
                nwv.y0(new b(i2, i3));
            } else {
                this.b.getAdapter().notifyItemRangeRemoved(i2, i3);
            }
        }
    }
}
