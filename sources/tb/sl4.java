package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sl4 implements kqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f28126a;

    static {
        t2o.a(486539579);
        t2o.a(488636440);
    }

    public sl4(cfc cfcVar) {
        this.f28126a = cfcVar;
    }

    @Override // tb.kqb
    public IContainerDataModel<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("ec49f151", new Object[]{this, str});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f28126a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        return iContainerDataService.getContainerData();
    }

    @Override // tb.kqb
    public void b(String str, String str2) {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6933ea3", new Object[]{this, str, str2});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f28126a.a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null && containerData.getBase() != null) {
            containerData.getBase().abandonData(str2);
        }
    }
}
