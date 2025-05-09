package tb;

import android.util.Log;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.oversea.baobao.BaoBaoDo;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void b(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f794559", new Object[]{this, iRemoteListener});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.ovs.guide.baobao.singe.get");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            JSONObject jSONObject = new JSONObject();
            String editionCode = BaobaoManager.getInstance().getEditionCode();
            if (!o78.o(editionCode)) {
                editionCode = BaobaoManager.sDetail_Edition_Code;
            }
            jSONObject.put("country", (Object) editionCode);
            jSONObject.put("scene", (Object) PromotionFilterBean.SINGLE);
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener(iRemoteListener).useWua().setUnitStrategy("UNIT_GUIDE").reqMethod(MethodEnum.POST).startRequest(BaoBaoDo.class);
        } catch (Exception e) {
            Log.e("xiangzhi", "baobaorequest" + e.toString());
        }
    }

    public void a(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f481c71", new Object[]{this, iRemoteListener});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.trade.query.bag");
            mtopRequest.setVersion(AfcCustomSdk.SDK_VERSION);
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extStatus", (Object) 0);
            jSONObject.put("netType", (Object) 1);
            jSONObject.put("isPage", (Object) Boolean.FALSE);
            jSONObject.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("divisionCode", (Object) BaobaoManager.getInstance().getEditionCode());
            jSONObject2.put("sceneCartType", (Object) BaobaoManager.getInstance().getCartType());
            jSONObject2.put("addCartCheck", (Object) "true");
            jSONObject2.put("ovsCallHsf", (Object) "true");
            jSONObject.put("exParams", (Object) jSONObject2.toJSONString());
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener(iRemoteListener).useWua().setUnitStrategy("UNIT_TRADE").reqMethod(MethodEnum.POST).startRequest();
        } catch (Exception e) {
            Log.e("xiangzhi", "requestCart" + e.toString());
        }
    }
}
