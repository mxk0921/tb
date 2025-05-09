package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.b;
import com.taobao.android.publisher.service.export.ayscpublish.core.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j4n implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f21757a;
    public final /* synthetic */ b b;
    public final /* synthetic */ c c;

    public j4n(c cVar, Class cls, b bVar) {
        this.c = cVar;
        this.f21757a = cls;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        List list = (List) c.j(this.c).get(this.f21757a);
        if (list == null) {
            list = new ArrayList();
            c.j(this.c).put(this.f21757a, list);
        }
        if (!list.contains(this.b)) {
            k4n.b().c().d("PublishServiceImp", "unregister failed, listener not exist.");
        } else {
            list.remove(this.b);
        }
    }
}
