package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.f1a;
import tb.g1a;
import tb.l2a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, l2a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final /* synthetic */ g1a function;

    public Transformations$sam$androidx_lifecycle_Observer$0(g1a g1aVar) {
        ckf.g(g1aVar, pg1.ATOM_function);
        this.function = g1aVar;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof Observer) || !(obj instanceof l2a)) {
            return false;
        }
        return ckf.b(getFunctionDelegate(), ((l2a) obj).getFunctionDelegate());
    }

    @Override // tb.l2a
    public final f1a<?> getFunctionDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f1a) ipChange.ipc$dispatch("fba82fa5", new Object[]{this});
        }
        return this.function;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d3a6b8", new Object[]{this, obj});
        } else {
            this.function.invoke(obj);
        }
    }
}
