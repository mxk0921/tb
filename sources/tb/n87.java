package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n87 implements IBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1018167395);
        t2o.a(1018167383);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1300238f", new Object[]{this});
        }
        return IBaseService.Names.SERVICE_URL_NAV.name();
    }
}
