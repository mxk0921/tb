package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.pipeline.task.SchedulerPriority;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hlz<T> implements vqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RenderContext f20737a;
    public T b;

    static {
        t2o.a(598737481);
        t2o.a(598737487);
    }

    public hlz(RenderContext renderContext, SchedulerPriority schedulerPriority) {
        ckf.g(renderContext, "renderContext");
        ckf.g(schedulerPriority, "priority");
        this.f20737a = renderContext;
    }

    public final RenderContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("cc4f291d", new Object[]{this});
        }
        return this.f20737a;
    }

    public final T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5be12058", new Object[]{this});
        }
        T t = this.b;
        if (t != null) {
            return t;
        }
        ckf.y("result");
        throw null;
    }

    public final void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8046e82", new Object[]{this, t});
            return;
        }
        ckf.g(t, "<set-?>");
        this.b = t;
    }

    public /* synthetic */ hlz(RenderContext renderContext, SchedulerPriority schedulerPriority, int i, a07 a07Var) {
        this(renderContext, (i & 2) != 0 ? SchedulerPriority.Default : schedulerPriority);
    }
}
