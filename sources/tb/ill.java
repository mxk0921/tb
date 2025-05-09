package tb;

import android.app.Activity;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.a;
import com.alibaba.poplayer.layermanager.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ill implements pkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<Activity> b;
    public volatile boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public final a f21389a = new a();

    static {
        t2o.a(625999952);
        t2o.a(625999946);
    }

    public ill(Activity activity) {
        this.b = new WeakReference<>(activity);
    }

    @Override // tb.pkb
    public void a(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20dd7e0", new Object[]{this, list});
        } else {
            this.f21389a.l(list);
        }
    }

    @Override // tb.pkb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bff04c7", new Object[]{this});
        } else {
            this.f21389a.k();
        }
    }

    @Override // tb.pkb
    public void c(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bea6664", new Object[]{this, list});
            return;
        }
        h();
        this.f21389a.b(list);
    }

    @Override // tb.pkb
    public void d(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83598ece", new Object[]{this, list});
        } else {
            this.f21389a.g(list);
        }
    }

    @Override // tb.pkb
    public void e(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38bd3b7a", new Object[]{this, popRequest});
        } else {
            this.f21389a.o(popRequest);
        }
    }

    @Override // tb.pkb
    public int f(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91e52d3f", new Object[]{this, popRequest})).intValue();
        }
        return this.f21389a.j(popRequest);
    }

    public void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ddbe9e", new Object[]{this, activity});
            return;
        }
        if (lyv.k(activity)) {
            this.b = new WeakReference<>(activity);
        }
        this.c = false;
    }

    public final void h() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b303e", new Object[]{this});
        } else if (!this.c && (activity = (Activity) lyv.c(this.b)) != null) {
            this.f21389a.m(d.t().k(activity).getCanvas());
            this.c = true;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7743a6d", new Object[]{this})).booleanValue();
        }
        return this.f21389a.h();
    }
}
