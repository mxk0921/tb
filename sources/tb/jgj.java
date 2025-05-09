package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.homepage.busniess.model.DeliverListResponse;
import com.taobao.mytaobao.ultron.model.OrderCountRequest;
import com.taobao.mytaobao.ultron.model.OrderCountResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.utils.Global;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537724);
    }

    public static void b(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d10f158", new Object[]{iRemoteBaseListener});
            return;
        }
        OrderCountRequest orderCountRequest = new OrderCountRequest();
        orderCountRequest.tabCodes = OrderCountRequest.fillAllTabCodes();
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Global.getApplication(), TaoHelper.getTTID()), orderCountRequest, TaoHelper.getTTID()).setBizId(99).registerListener((IRemoteListener) iRemoteBaseListener).setErrorNotifyAfterCache(false).setUnitStrategy("UNIT_TRADE").startRequest(OrderCountResponse.class);
    }

    public static void a(IRemoteListener iRemoteListener, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc71752", new Object[]{iRemoteListener, map});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.delivery.list.get");
        mtopRequest.setVersion("3.1");
        try {
            mtopRequest.setData(JSON.toJSONString(map));
        } catch (Exception unused) {
        }
        RemoteBusiness bizId = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).registeListener(iRemoteListener).setBizId(99);
        bizId.setErrorNotifyAfterCache(false);
        bizId.setUnitStrategy("UNIT_TRADE");
        bizId.startRequest(DeliverListResponse.class);
    }
}
