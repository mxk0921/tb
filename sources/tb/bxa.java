package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<wxa> f16699a = new ArrayList();

    static {
        t2o.a(779092677);
    }

    public void a(hcc hccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17855b1", new Object[]{this, hccVar});
        } else {
            ((ArrayList) this.f16699a).add(new wxa(hccVar));
        }
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b836f592", new Object[]{this, obj});
            return;
        }
        Iterator it = ((ArrayList) this.f16699a).iterator();
        while (it.hasNext()) {
            ((wxa) it.next()).a(obj);
        }
    }
}
