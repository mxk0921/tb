package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dkb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nk2 implements dkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, dkb.a> f24786a = new ConcurrentHashMap();

    static {
        t2o.a(486539318);
        t2o.a(488636459);
    }

    @Override // tb.dkb
    public void a(String str, dkb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907f4c9f", new Object[]{this, str, aVar});
            return;
        }
        Map<String, dkb.a> map = f24786a;
        if (!((ConcurrentHashMap) map).containsKey(str) || !eue.b()) {
            ((ConcurrentHashMap) map).put(str, aVar);
            return;
        }
        throw new InfoFlowRuntimeException("重复注册 BridgeApiPlugin ： " + str);
    }

    @Override // tb.dkb
    public boolean b(String str, dkb.b bVar, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30487fc4", new Object[]{this, str, bVar, aVar})).booleanValue();
        }
        dkb.a aVar2 = (dkb.a) ((ConcurrentHashMap) f24786a).get(str);
        if (aVar2 != null) {
            return aVar2.a(bVar, aVar);
        }
        fve.e("BridgeInvokerImpl", "invoke bridgeApiPlugin is null. pluginName : " + str);
        return false;
    }
}
