package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<IContainerService.a> f17625a;

    static {
        t2o.a(486539613);
    }

    public void a(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2066757f", new Object[]{this, aVar});
            return;
        }
        if (this.f17625a == null) {
            this.f17625a = new CopyOnWriteArrayList();
        }
        this.f17625a.add(aVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<IContainerService.a> list = this.f17625a;
        if (list != null) {
            list.clear();
            this.f17625a = null;
        }
    }

    public void c(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63d8300", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        List<IContainerService.a> list = this.f17625a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerService.a) it.next()).a(iUiRefreshActionModel);
            }
        }
    }

    public void d(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd95e8d", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        List<IContainerService.a> list = this.f17625a;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerService.a) it.next()).b(iUiRefreshActionModel);
            }
        }
    }

    public void e(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d30822", new Object[]{this, aVar});
            return;
        }
        List<IContainerService.a> list = this.f17625a;
        if (list != null) {
            list.remove(aVar);
        }
    }
}
