package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ydl implements j4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f32004a;

    static {
        t2o.a(486539586);
        t2o.a(488636446);
    }

    public ydl(cfc cfcVar) {
        this.f32004a = cfcVar;
    }

    @Override // tb.j4d
    public void consumePrefetchData(int i, IAddViewCallbackService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76251db", new Object[]{this, new Integer(i), aVar});
            return;
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f32004a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService != null) {
            iOrderListPrefetchService.consumePrefetchData(i, aVar);
        }
    }

    @Override // tb.j4d
    public IBizDataModel getPrefetchDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBizDataModel) ipChange.ipc$dispatch("fe714c36", new Object[]{this});
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f32004a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService == null) {
            return null;
        }
        return iOrderListPrefetchService.getPrefetchDataModel();
    }

    @Override // tb.j4d
    public boolean hasSwitchTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61a7b752", new Object[]{this})).booleanValue();
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f32004a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService == null) {
            return false;
        }
        return iOrderListPrefetchService.hasSwitchTab();
    }

    @Override // tb.j4d
    public void realOrderListPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292a6f2c", new Object[]{this});
            return;
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f32004a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService != null) {
            iOrderListPrefetchService.realOrderListPrefetch();
        }
    }

    @Override // tb.j4d
    public void resetSwitchTabStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682c704b", new Object[]{this});
            return;
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f32004a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService != null) {
            iOrderListPrefetchService.resetSwitchTabStatus();
        }
    }
}
