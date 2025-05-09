package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.notify.sub.nativeconatiner.NativeCompleteVisibleStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ba4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View.OnAttachStateChangeListener f16274a;
    public NativeCompleteVisibleStatus b;
    public q4x c;
    public final HomeChildRecyclerView d;
    public z4a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zpk f16275a;

        public a(zpk zpkVar) {
            this.f16275a = zpkVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            ba4 ba4Var = ba4.this;
            if (!ba4.b(ba4Var, ba4.a(ba4Var))) {
                bqa.d("CompleteVisibleStatus", "不在白名单");
            } else if (!(view instanceof HomeChildRecyclerView)) {
                bqa.d("CompleteVisibleStatus", "当前的容器不是HomeChildRecyclerView");
            } else {
                ba4.c(ba4.this, (HomeChildRecyclerView) view, this.f16275a);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(729810074);
    }

    public ba4(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar, z4a z4aVar) {
        this.d = homeChildRecyclerView;
        this.e = z4aVar;
        h(homeChildRecyclerView, zpkVar);
    }

    public static /* synthetic */ z4a a(ba4 ba4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("400d6f2b", new Object[]{ba4Var});
        }
        return ba4Var.e;
    }

    public static /* synthetic */ boolean b(ba4 ba4Var, z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f6f4abe", new Object[]{ba4Var, z4aVar})).booleanValue();
        }
        return ba4Var.i(z4aVar);
    }

    public static /* synthetic */ void c(ba4 ba4Var, HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62ce2d2", new Object[]{ba4Var, homeChildRecyclerView, zpkVar});
        } else {
            ba4Var.e(homeChildRecyclerView, zpkVar);
        }
    }

    public final View.OnAttachStateChangeListener d(zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("36b442fd", new Object[]{this, zpkVar});
        }
        return new a(zpkVar);
    }

    public final void e(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d422aeb5", new Object[]{this, homeChildRecyclerView, zpkVar});
        } else if (homeChildRecyclerView.getParent() instanceof RecyclerView) {
            this.b = new NativeCompleteVisibleStatus(homeChildRecyclerView, zpkVar, this.e);
        } else {
            this.c = new q4x(zpkVar, this.e);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        l(this.d);
        NativeCompleteVisibleStatus nativeCompleteVisibleStatus = this.b;
        if (nativeCompleteVisibleStatus != null) {
            nativeCompleteVisibleStatus.f();
        }
    }

    public final List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b20ee14", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String a2 = f4b.a();
        if (!TextUtils.isEmpty(a2)) {
            arrayList.addAll(Arrays.asList(a2.split(",")));
        }
        return arrayList;
    }

    public final void h(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7c62c", new Object[]{this, homeChildRecyclerView, zpkVar});
            return;
        }
        View.OnAttachStateChangeListener d = d(zpkVar);
        this.f16274a = d;
        homeChildRecyclerView.addOnAttachStateChangeListener(d);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2fbab21", new Object[]{this});
            return;
        }
        q4x q4xVar = this.c;
        if (q4xVar != null) {
            q4xVar.a();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb647eb6", new Object[]{this});
            return;
        }
        q4x q4xVar = this.c;
        if (q4xVar != null) {
            q4xVar.b();
        }
    }

    public final void l(HomeChildRecyclerView homeChildRecyclerView) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b606684b", new Object[]{this, homeChildRecyclerView});
        } else if (homeChildRecyclerView != null && (onAttachStateChangeListener = this.f16274a) != null) {
            homeChildRecyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public void m(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
        } else {
            this.e = z4aVar;
        }
    }

    public final boolean i(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81d1b68a", new Object[]{this, z4aVar})).booleanValue();
        }
        List<String> g = g();
        if (g.isEmpty()) {
            bqa.d("CompleteVisibleStatus", "白名单是空");
            return false;
        }
        String f = z4aVar.f();
        if (!TextUtils.isEmpty(f)) {
            return g.contains(f);
        }
        bqa.d("CompleteVisibleStatus", "当前页面名称为空");
        return false;
    }
}
