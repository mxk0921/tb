package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qfv implements IContainerDataService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLIENT_PAGE_PARAM_KEY = "client_pageParams";

    /* renamed from: a  reason: collision with root package name */
    public final ofv f26732a;

    static {
        t2o.a(491782728);
        t2o.a(488636639);
    }

    public qfv(ofv ofvVar) {
        this.f26732a = ofvVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void j(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
        } else if (iContainerDataModel != null) {
            fve.b("CardBackDataProcessor", "start parser cardBack switcher");
            this.f26732a.c(iContainerDataModel);
        }
    }
}
