package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vj implements djg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yi f30039a;
    public final RecyclerView b;

    static {
        t2o.a(80740527);
        t2o.a(156237972);
    }

    public vj(yi yiVar, RecyclerView recyclerView) {
        this.f30039a = yiVar;
        this.b = recyclerView;
    }

    @Override // tb.djg
    public boolean canScrollHorizontally() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        yi yiVar = this.f30039a;
        if (!(yiVar == null || this.b == null)) {
            List<icb> f = yiVar.f(icb.class);
            if (f.isEmpty()) {
                return true;
            }
            for (icb icbVar : f) {
                z = icbVar.F0(this.b);
            }
        }
        return z;
    }

    @Override // tb.djg
    public boolean canScrollVertically() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        yi yiVar = this.f30039a;
        if (!(yiVar == null || this.b == null)) {
            List<icb> f = yiVar.f(icb.class);
            if (f.isEmpty()) {
                return true;
            }
            for (icb icbVar : f) {
                z = icbVar.o(this.b);
            }
        }
        return z;
    }
}
