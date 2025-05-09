package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ejz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OriginNode f18632a;

    static {
        t2o.a(598737420);
    }

    public ejz(OriginNode originNode) {
        ckf.g(originNode, "originNode");
        this.f18632a = originNode;
    }

    public final OriginNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OriginNode) ipChange.ipc$dispatch("1d247a52", new Object[]{this});
        }
        return this.f18632a;
    }

    public boolean b(d0z d0zVar, RenderContext renderContext, hjz hjzVar, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c8ddd09", new Object[]{this, d0zVar, renderContext, hjzVar, sb})).booleanValue();
        }
        ckf.g(d0zVar, "bytesReader");
        ckf.g(renderContext, "renderContext");
        ckf.g(hjzVar, "originNodeParams");
        ckf.g(sb, "error");
        return false;
    }
}
