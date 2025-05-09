package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.BaseStickyAdapter;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27534a = -1;
    public final DXRecyclerView b;
    public final BaseStickyAdapter c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27535a;
        public final /* synthetic */ RecyclerView.ViewHolder b;

        public a(int i, RecyclerView.ViewHolder viewHolder) {
            this.f27535a = i;
            this.b = viewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rpq.a(rpq.this).M(this.f27535a, this.b);
            rpq.c(rpq.this);
            if (rpq.b(rpq.this) == 0 && rpq.d(rpq.this) != null) {
                rpq.d(rpq.this).setIgnoreMotionEvent(false);
            }
        }
    }

    static {
        t2o.a(444597533);
    }

    public rpq(DXRecyclerView dXRecyclerView, BaseStickyAdapter baseStickyAdapter, int i) {
        this.b = dXRecyclerView;
        this.c = baseStickyAdapter;
        this.d = i;
        dXRecyclerView.setIgnoreMotionEvent(true);
    }

    public static /* synthetic */ BaseStickyAdapter a(rpq rpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStickyAdapter) ipChange.ipc$dispatch("6a18ef2c", new Object[]{rpqVar});
        }
        return rpqVar.c;
    }

    public static /* synthetic */ int b(rpq rpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cdbb8ec", new Object[]{rpqVar})).intValue();
        }
        return rpqVar.f27534a;
    }

    public static /* synthetic */ int c(rpq rpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b3cbccb", new Object[]{rpqVar})).intValue();
        }
        int i = rpqVar.f27534a;
        rpqVar.f27534a = i - 1;
        return i;
    }

    public static /* synthetic */ DXRecyclerView d(rpq rpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("1baf9221", new Object[]{rpqVar});
        }
        return rpqVar.b;
    }

    public void e(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f259575b", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (this.f27534a == -1) {
            if (this.c.getItemCount() < this.d) {
                this.d = this.c.getItemCount();
            }
            this.f27534a = this.d;
        }
        if (this.b == null || this.f27534a <= 0) {
            this.c.M(i, viewHolder);
        } else {
            rx5.a(new a(i, viewHolder), new long[0]);
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993e5b6d", new Object[]{this, new Integer(i)});
        }
    }
}
