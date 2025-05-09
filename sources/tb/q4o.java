package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q4o implements IContainerDataService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26505a;
    public final vzi b;
    public long c;

    static {
        t2o.a(491782302);
        t2o.a(488636641);
    }

    public q4o(vzi vziVar, cfc cfcVar) {
        this.b = vziVar;
        this.f26505a = cfcVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
        } else if (this.c <= 0) {
            fve.e("RequestListener", "mRequestStartTime <= 0");
        } else {
            this.b.d(GatewayPhaseEnum.networkTime.name(), SystemClock.uptimeMillis() - this.c);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void b(w1e w1eVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            return;
        }
        String a2 = this.f26505a.getContainerType().a();
        HashMap hashMap = new HashMap();
        hashMap.put("extKey1", "HomePageErrorCount");
        hashMap.put("extKey2", str);
        hashMap.put("extKey3", str3);
        gve.b("QPS", a2, hashMap);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public void c(w1e w1eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }
}
