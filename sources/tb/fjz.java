package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<OriginNode> f19349a;

    static {
        t2o.a(598737421);
    }

    public fjz(List<OriginNode> list) {
        ckf.g(list, "composeRootNodes");
        this.f19349a = list;
    }

    public final List<OriginNode> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ab35b30d", new Object[]{this});
        }
        return this.f19349a;
    }

    public final OriginNode b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OriginNode) ipChange.ipc$dispatch("37c3619d", new Object[]{this});
        }
        return (OriginNode) i04.c0(this.f19349a);
    }
}
