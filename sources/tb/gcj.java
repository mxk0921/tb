package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<a> f19893a = new LinkedList<>();
    public boolean b;

    static {
        t2o.a(815793364);
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d489c7e0", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "instance");
        if (this.b) {
            aVar.destroy();
        } else {
            this.f19893a.add(aVar);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed407b92", new Object[]{this});
            return;
        }
        this.b = true;
        Iterator<a> it = this.f19893a.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            a next = it.next();
            ckf.f(next, "next(...)");
            a aVar = next;
            if (!aVar.isDestroyed()) {
                aVar.destroy();
            }
        }
        this.f19893a.clear();
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a13f608", new Object[]{this, str});
        } else {
            ckf.g(str, "name");
        }
    }
}
