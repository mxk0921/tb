package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zr6 implements IContainerDataService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vzi f32965a;
    public long b;

    static {
        t2o.a(491782299);
        t2o.a(488636639);
    }

    public zr6(vzi vziVar, cfc cfcVar) {
        this.f32965a = vziVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void j(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
        } else {
            this.b = SystemClock.uptimeMillis();
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
        } else if (this.b <= 0) {
            fve.e("DataProcessListener", "mDataProcessStartTime <= 0");
        } else {
            this.f32965a.d(GatewayPhaseEnum.dataParserTime.name(), SystemClock.uptimeMillis() - this.b);
        }
    }
}
