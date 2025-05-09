package tb;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RecyclerView b;
    public final neb c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f21978a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements neb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.jg2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0955a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21980a;
            public final /* synthetic */ RecyclerViewHolder b;

            public RunnableC0955a(int i, RecyclerViewHolder recyclerViewHolder) {
                this.f21980a = i;
                this.b = recyclerViewHolder;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    jg2.a(jg2.this).put(Integer.valueOf(this.f21980a), Integer.valueOf(this.b.itemView.getMeasuredHeight()));
                }
            }
        }

        public a() {
        }

        @Override // tb.neb
        public void a(List<IDMComponent> list, RecyclerViewHolder recyclerViewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0ba1b", new Object[]{this, list, recyclerViewHolder, new Integer(i)});
                return;
            }
            IDMComponent iDMComponent = list.get(i);
            if (iDMComponent == null) {
                return;
            }
            if (iDMComponent.getStatus() == 2) {
                recyclerViewHolder.itemView.post(new RunnableC0955a(i, recyclerViewHolder));
            } else {
                jg2.a(jg2.this).put(Integer.valueOf(i), 0);
            }
        }
    }

    static {
        t2o.a(479199478);
    }

    public jg2(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    public static /* synthetic */ Map a(jg2 jg2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("86af78e2", new Object[]{jg2Var});
        }
        return jg2Var.f21978a;
    }

    public neb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neb) ipChange.ipc$dispatch("3a6bbd16", new Object[]{this});
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62ea9f4c", new Object[]{this})).intValue();
        }
        return d(((LinearLayoutManager) this.b.getLayoutManager()).findFirstVisibleItemPosition());
    }

    public int d(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa69bebd", new Object[]{this, new Integer(i)})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (i < 0) {
            return 0;
        }
        Map<Integer, Integer> map = this.f21978a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.get(Integer.valueOf(i4)) != null) {
                i2 = ((Integer) hashMap.get(Integer.valueOf(i4))).intValue();
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (i == findFirstVisibleItemPosition && findViewByPosition != null) {
            i3 -= (int) findViewByPosition.getY();
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c44df501", new Object[]{this})).booleanValue();
        }
        if (((LinearLayoutManager) this.b.getLayoutManager()).findFirstVisibleItemPosition() <= 0 && d(0) <= 0) {
            return false;
        }
        return true;
    }
}
