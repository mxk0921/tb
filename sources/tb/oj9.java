package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyFirstScreenConfigService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oj9 implements e7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f25430a;

    static {
        t2o.a(486539583);
        t2o.a(488636442);
    }

    public oj9(cfc cfcVar) {
        this.f25430a = cfcVar;
    }

    @Override // tb.e7c
    public JSONObject getFirstScreenEffectConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4acba4a", new Object[]{this, str});
        }
        IAfterBuyFirstScreenConfigService iAfterBuyFirstScreenConfigService = (IAfterBuyFirstScreenConfigService) this.f25430a.a(IAfterBuyFirstScreenConfigService.class);
        if (iAfterBuyFirstScreenConfigService == null) {
            return null;
        }
        return iAfterBuyFirstScreenConfigService.getFirstScreenEffectConfig(str);
    }
}
