package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e3x implements hce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yi f18249a;
    public hbb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f18250a;

        public a(RecyclerView recyclerView) {
            this.f18250a = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18250a.getAdapter().notifyDataSetChanged();
            }
        }
    }

    static {
        t2o.a(81789242);
        t2o.a(81789232);
    }

    @Override // tb.hce
    public void a(d3x d3xVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1da9925", new Object[]{this, d3xVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        i("onRenderFailed|" + i + "|" + str, "weex2#renderError", d3xVar.g());
    }

    @Override // tb.hce
    public void b(d3x d3xVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314b4c0a", new Object[]{this, d3xVar, view});
        } else if (view == null) {
            i("onViewCreated#view is null", "weex2#containerViewError", d3xVar.g());
        } else {
            FrameLayout h = d3xVar.h();
            if (h == null) {
                i("onViewCreated#containerLayout is null", "weex2#containerViewError", d3xVar.g());
                return;
            }
            h.removeAllViews();
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View f = d3xVar.f();
            if (f != null) {
                h.addView(f);
            }
            yi yiVar = this.f18249a;
            if (yiVar != null) {
                for (ddb ddbVar : yiVar.f(ddb.class)) {
                    ddbVar.h0(d3xVar, h, view);
                }
            }
            h.addView(view);
        }
    }

    @Override // tb.hce
    public void c(d3x d3xVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1013e1", new Object[]{this, d3xVar, new Integer(i), str});
            return;
        }
        i(i + "|" + str, "weex2#jsError", d3xVar.g());
    }

    @Override // tb.hce
    public void d(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae34154c", new Object[]{this, d3xVar});
        }
    }

    @Override // tb.hce
    public void e(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fade8813", new Object[]{this, d3xVar});
            return;
        }
        yi yiVar = this.f18249a;
        if (yiVar != null) {
            for (ddb ddbVar : yiVar.f(ddb.class)) {
                ddbVar.e(d3xVar);
            }
        }
        f(d3xVar);
        g(d3xVar);
    }

    public final void g(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87eedb3", new Object[]{this, d3xVar});
        } else if (d3xVar.d() != null) {
            RecyclerView recyclerView = (RecyclerView) d3xVar.d().get("render_view", RecyclerView.class);
            if (recyclerView == null) {
                i("onRenderSuccess#recyclerView is null", "weex2#containerViewError", d3xVar.g());
            } else {
                recyclerView.post(new a(recyclerView));
            }
        }
    }

    @Override // tb.hce
    public void h(d3x d3xVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1348afe", new Object[]{this, d3xVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        i("onRenderFailed|" + i + "|" + str, "weex2#renderError", d3xVar.g());
        yi yiVar = this.f18249a;
        if (yiVar != null) {
            for (ddb ddbVar : yiVar.f(ddb.class)) {
                ddbVar.h(d3xVar, i, str, z);
            }
        }
    }

    public final void f(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25768412", new Object[]{this, d3xVar});
        } else if (d3xVar.n() != null) {
            try {
                ((ViewGroup) ((ViewGroup) ((ViewGroup) d3xVar.n()).getChildAt(0)).getChildAt(0)).setFocusable(false);
            } catch (Exception e) {
                i(e.getMessage(), "weex2#fixFlutterBug", d3xVar.g());
            }
        }
    }

    public final void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c623f59", new Object[]{this, str, str2, str3});
        } else if (this.b == null) {
            ck.g().b("Weex2ListenerImpl", "reportError", str);
        } else {
            mi miVar = new mi(1, "Weex2", str2, str);
            if (!TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put("AuraComponentKey", str3);
                miVar.i(hashMap);
            }
            this.b.b(miVar);
        }
    }
}
