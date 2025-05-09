package tb;

import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ug3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OrientationHelper f29354a;
    public RecyclerView.LayoutManager b;

    static {
        t2o.a(444597509);
    }

    public static ug3 a(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug3) ipChange.ipc$dispatch("8d355b47", new Object[]{layoutManager});
        }
        ug3 ug3Var = new ug3();
        ug3Var.f29354a = OrientationHelper.createHorizontalHelper(layoutManager);
        ug3Var.b = layoutManager;
        return ug3Var;
    }

    public static ug3 b(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug3) ipChange.ipc$dispatch("859a9ab5", new Object[]{layoutManager});
        }
        ug3 ug3Var = new ug3();
        ug3Var.f29354a = OrientationHelper.createVerticalHelper(layoutManager);
        ug3Var.b = layoutManager;
        return ug3Var;
    }

    public RecyclerView.LayoutManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("d43bcd1c", new Object[]{this});
        }
        return this.b;
    }

    public OrientationHelper d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrientationHelper) ipChange.ipc$dispatch("b6820e1e", new Object[]{this});
        }
        return this.f29354a;
    }
}
