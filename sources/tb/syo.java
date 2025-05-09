package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class syo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f28364a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onPageScrollStateChanged(int i);
    }

    static {
        t2o.a(503316937);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca003cde", new Object[]{this, aVar});
        } else if (!((ArrayList) this.f28364a).contains(aVar)) {
            ((ArrayList) this.f28364a).add(aVar);
        }
    }

    public void b(Component component, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dde4e07", new Object[]{this, component, new Integer(i)});
            return;
        }
        Iterator it = ((ArrayList) this.f28364a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onPageScrollStateChanged(i);
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d0bd9b", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.f28364a).remove(aVar);
        }
    }
}
