package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import tb.dkb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fue implements dkb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782235);
        t2o.a(488636460);
    }

    @Override // tb.dkb.a
    public boolean a(dkb.b bVar, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d26a31", new Object[]{this, bVar, aVar})).booleanValue();
        }
        JsActionModel jsActionModel = new JsActionModel();
        jsActionModel.setContainer(bVar.getContainerId());
        jsActionModel.setAction(bVar.getAction());
        jsActionModel.setParam(bVar.getParams());
        if (jsActionModel.isValid()) {
            return xve.b(jsActionModel, aVar);
        }
        fve.e("InfoFlowBridgeApiPlugin", "jsActionModel is null。 不符合协议约定，见类注释");
        aVar.error("不符合协议约定，请和信息流同学确认协议");
        return false;
    }
}
