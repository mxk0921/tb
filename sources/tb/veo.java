package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavAdapter;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarMoreIconHolder;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class veo implements teo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29963a = 0;
    public long b = -1;
    public Handler c;
    public final RecyclerView d;
    public final TextView e;
    public final cxj f;
    public final dh7 g;
    public RightNavAdapter h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29964a;
        public final /* synthetic */ x3w b;

        public a(int i, x3w x3wVar) {
            this.f29964a = i;
            this.b = x3wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f29964a == veo.b(veo.this)) {
                try {
                    RightNavAdapter c = veo.c(veo.this);
                    List<seo> list = this.b.U;
                    if (veo.b(veo.this) == 2) {
                        z = true;
                    }
                    c.O(list, z);
                } catch (Exception unused) {
                    txj.e("new_detail异常", "NavBar 本次刷新失败，未知异常。可能是页面关闭了。");
                }
            }
        }
    }

    static {
        t2o.a(352322113);
        t2o.a(352322111);
    }

    public veo(cxj cxjVar, dh7 dh7Var) {
        this.f = cxjVar;
        this.g = dh7Var;
        View X = dh7Var.X();
        this.e = (TextView) X.findViewById(R.id.nav_back);
        RecyclerView recyclerView = (RecyclerView) X.findViewById(R.id.right_navibar_content_recyclerview);
        this.d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(cxjVar.i(), 0, false));
        recyclerView.setVisibility(0);
    }

    public static /* synthetic */ int b(veo veoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc3de07", new Object[]{veoVar})).intValue();
        }
        return veoVar.f29963a;
    }

    public static /* synthetic */ RightNavAdapter c(veo veoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavAdapter) ipChange.ipc$dispatch("9d097ff1", new Object[]{veoVar});
        }
        return veoVar.h;
    }

    @Override // tb.teo
    public void a(x3w x3wVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5cf1ab", new Object[]{this, x3wVar});
        } else if (x3wVar != null) {
            this.e.setTextColor(x3wVar.R);
            d(this.d, x3wVar.U);
            this.f29963a++;
            if (this.b < 0) {
                this.b = System.currentTimeMillis();
            }
            if (this.h == null) {
                this.h = new RightNavAdapter(this.f, this.g, x3wVar.U);
                cxj cxjVar = this.f;
                if (!(cxjVar == null || cxjVar.l() == null || !this.f.l().f())) {
                    DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                    long x0 = this.f.j().N().x0();
                    defaultItemAnimator.setAddDuration(x0);
                    defaultItemAnimator.setChangeDuration(x0);
                    defaultItemAnimator.setRemoveDuration(x0);
                    defaultItemAnimator.setChangeDuration(x0);
                    this.d.setItemAnimator(defaultItemAnimator);
                }
                this.d.setAdapter(this.h);
                return;
            }
            int i = this.f29963a;
            int Y0 = this.f.j().N().Y0();
            if (this.f29963a > 3 || Y0 <= 0 || System.currentTimeMillis() - this.b >= Y0 || this.f.l() == null || !this.f.l().f()) {
                this.h.N(x3wVar.U);
                return;
            }
            Handler e = e();
            a aVar = new a(i, x3wVar);
            if (this.f29963a == 2) {
                j = 2000;
            } else {
                j = 300;
            }
            e.postDelayed(aVar, j);
        }
    }

    public final void d(RecyclerView recyclerView, List<seo> list) {
        boolean z = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a202ad3", new Object[]{this, recyclerView, list});
            return;
        }
        try {
            int O = this.f.j().N().O();
            if (O >= 0) {
                if (list == null) {
                    z = false;
                }
                if (list != null) {
                    Iterator<seo> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if ("more".equals(it.next().d())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                Context context = recyclerView.getContext();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || context == null) {
                    txj.e(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter error.无 MarginLayoutParams 或 context. context = " + context);
                    return;
                }
                if (z) {
                    i = ec7.a(context, O);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.rightMargin != i) {
                    marginLayoutParams.rightMargin = i;
                }
                txj.e(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter success.newDetailNavMarginRight = " + O);
            }
        } catch (Throwable th) {
            txj.f(txj.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter error. 未知异常.", th);
        }
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        Handler handler = this.c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.c = handler2;
        return handler2;
    }

    public void f() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdf7f4c", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.d;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            for (int i = 0; i < layoutManager.getChildCount(); i++) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.ViewHolder childViewHolder = this.d.getChildViewHolder(childAt);
                    if (childViewHolder instanceof RightNavBarMoreIconHolder) {
                        ((RightNavBarMoreIconHolder) childViewHolder).g0();
                        return;
                    }
                }
            }
        }
    }
}
