package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class q2z extends ejz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736982);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2z(OriginNode originNode) {
        super(originNode);
        ckf.g(originNode, "originNode");
    }

    public static /* synthetic */ Object ipc$super(q2z q2zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ConditionOriginNodeCoordinator");
    }

    @Override // tb.ejz
    public boolean b(d0z d0zVar, RenderContext renderContext, hjz hjzVar, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c8ddd09", new Object[]{this, d0zVar, renderContext, hjzVar, sb})).booleanValue();
        }
        ckf.g(d0zVar, "bytesReader");
        ckf.g(renderContext, "renderContext");
        ckf.g(hjzVar, "originNodeParams");
        ckf.g(sb, "error");
        int s = d0zVar.s();
        xiz.Companion.a(a(), d0zVar, new WeakReference<>(renderContext), hjzVar, new StringBuilder());
        if (a().g().size() <= 2) {
            a().w(new p2z(s));
            return true;
        }
        throw new IllegalArgumentException("Condition node must have at most 2 children");
    }
}
