package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final taa f24730a = new taa();
    public final bz4 b = new bz4();

    static {
        t2o.a(350224390);
    }

    public wao a(List<ggc> list, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("51077f7c", new Object[]{this, list, dXEvent, objArr, jh3Var});
        }
        Stack stack = new Stack();
        stack.push(this.f24730a);
        if (list != null) {
            for (ggc ggcVar : list) {
                stack.push(ggcVar);
            }
        }
        stack.push(this.b);
        return new z08(stack).a(dXEvent, objArr, jh3Var);
    }

    public wao b(ggc ggcVar, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("a68265da", new Object[]{this, ggcVar, dXEvent, objArr, jh3Var});
        }
        Stack stack = new Stack();
        stack.push(this.f24730a);
        if (ggcVar != null) {
            stack.push(ggcVar);
        }
        stack.push(this.b);
        return new z08(stack).a(dXEvent, objArr, jh3Var);
    }
}
