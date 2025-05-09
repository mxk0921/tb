package com.taobao.android.dinamicx.widget.recycler.expose;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.f4c;
import tb.g4c;
import tb.lp8;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExposeChildAttachListener implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f7476a;
    public final f4c b;
    public final g4c c;
    public final HashMap<Integer, Long> d = new HashMap<>();
    public final long e;

    static {
        t2o.a(444597546);
    }

    public ExposeChildAttachListener(RecyclerView recyclerView, f4c f4cVar, g4c g4cVar, long j) {
        this.f7476a = recyclerView;
        this.b = f4cVar;
        this.c = g4cVar;
        this.e = j;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322dfd76", new Object[]{this, new Integer(i)});
        } else if (this.d.get(Integer.valueOf(i)) == null || this.d.get(Integer.valueOf(i)).longValue() <= 0) {
            this.d.put(Integer.valueOf(i), 0L);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bca183", new Object[]{this});
            return;
        }
        try {
            RecyclerView recyclerView = this.f7476a;
            if (!(recyclerView == null || recyclerView.getLayoutManager() == null || this.b == null)) {
                Iterator it = new ArrayList(this.d.keySet()).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    View findViewByPosition = this.f7476a.getLayoutManager().findViewByPosition(intValue);
                    if (findViewByPosition != null) {
                        int i = (this.d.get(num).longValue() > 0L ? 1 : (this.d.get(num).longValue() == 0L ? 0 : -1));
                        if (i == 0 && lp8.b(findViewByPosition, this.c.a())) {
                            this.d.put(num, Long.valueOf(System.currentTimeMillis()));
                        } else if (i > 0 && lp8.a(findViewByPosition, 0.1f)) {
                            d(intValue, this.f7476a);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            lp8.c(xv5.a(th));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        }
    }

    public final void d(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ead81d8", new Object[]{this, new Integer(i), recyclerView});
        } else if (recyclerView != null && recyclerView.getLayoutManager() != null && this.b != null && recyclerView.getLayoutManager().findViewByPosition(i) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = this.d.get(Integer.valueOf(i)).longValue();
            if (longValue > 0 && longValue < currentTimeMillis) {
                long j = currentTimeMillis - longValue;
                this.d.put(Integer.valueOf(i), 0L);
                if (j >= this.e) {
                    this.b.a(i, j);
                }
            }
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4606cf2", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.b != null) {
            d(i, this.f7476a);
        }
        this.d.remove(Integer.valueOf(i));
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16d8a0f", new Object[]{this});
            return;
        }
        try {
            RecyclerView recyclerView = this.f7476a;
            if (!(recyclerView == null || recyclerView.getLayoutManager() == null || this.b == null)) {
                for (Map.Entry<Integer, Long> entry : this.d.entrySet()) {
                    if (lp8.b(this.f7476a.getLayoutManager().findViewByPosition(entry.getKey().intValue()), this.c.a())) {
                        d(entry.getKey().intValue(), this.f7476a);
                    }
                }
            }
        } catch (Throwable th) {
            lp8.c(xv5.a(th));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dcc6bd1", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        RecyclerView recyclerView;
        int childAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view != null && (recyclerView = this.f7476a) != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) >= 0) {
            a(childAdapterPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        int childAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (!(view == null && this.f7476a == null) && (childAdapterPosition = this.f7476a.getChildAdapterPosition(view)) >= 0) {
            try {
                e(childAdapterPosition);
            } catch (Throwable th) {
                lp8.c(xv5.a(th));
            }
        }
    }
}
