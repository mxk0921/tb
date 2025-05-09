package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class esj implements uzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f18794a;

    static {
        t2o.a(486539585);
        t2o.a(488636445);
    }

    public esj(cfc cfcVar) {
        this.f18794a = cfcVar;
    }

    @Override // tb.uzc
    public void a(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17f6a06", new Object[]{this, bVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f18794a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.addMTopPreRequestListener(bVar);
        }
    }

    @Override // tb.uzc
    public void b(IAddViewCallbackService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba7e12a", new Object[]{this, aVar});
            return;
        }
        IAddViewCallbackService iAddViewCallbackService = (IAddViewCallbackService) this.f18794a.a(IAddViewCallbackService.class);
        if (iAddViewCallbackService != null) {
            iAddViewCallbackService.registerDataProcessCallBack(aVar);
        }
    }

    @Override // tb.uzc
    public void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8ec627", new Object[]{this, str, jSONObject});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f18794a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.triggerEvent(str, jSONObject);
        }
    }
}
