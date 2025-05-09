package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m6x implements m1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<WXSDKInstance> f23814a = new HashSet<>();

    static {
        t2o.a(993002200);
        t2o.a(993001908);
    }

    @Override // tb.m1c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f4e7fe", new Object[]{this});
            return;
        }
        c4p.m("WeexInstanceManager", "destroyWeexInstances");
        Iterator<WXSDKInstance> it = this.f23814a.iterator();
        while (it.hasNext()) {
            WXSDKInstance next = it.next();
            if (next == null) {
                c4p.n("WeexInstanceManager", "instance is null");
            } else if (next.i0()) {
                c4p.n("WeexInstanceManager", "instance is destroyed");
            } else {
                next.destroy();
                c4p.m("WeexInstanceManager", "destroy instance: " + next);
            }
        }
        this.f23814a.clear();
    }

    @Override // tb.m1c
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a28d1c", new Object[]{this, obj});
        } else {
            this.f23814a.remove(obj);
        }
    }

    @Override // tb.m1c
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e857bc79", new Object[]{this, obj});
        } else {
            this.f23814a.add((WXSDKInstance) obj);
        }
    }
}
