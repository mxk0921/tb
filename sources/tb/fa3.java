package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagResponse;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fa3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(697303058);
    }

    public void a(MtopTradeAddBagRequest mtopTradeAddBagRequest, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee289a", new Object[]{this, mtopTradeAddBagRequest, iRemoteBaseListener, context, str, new Integer(i)});
        } else {
            c(mtopTradeAddBagRequest, iRemoteBaseListener, context, str, i).startRequest(MtopTradeAddBagResponse.class);
        }
    }

    public final MtopBusiness b(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("8c790d4b", new Object[]{this, iMTOPDataObject, iRemoteBaseListener, context, str, new Integer(i)});
        }
        return MtopBusiness.build(Mtop.instance(context), iMTOPDataObject, str).registerListener((IRemoteListener) iRemoteBaseListener).retryTime(1).setBizId(i).setUnitStrategy("UNIT_TRADE");
    }

    public final MtopBusiness c(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("abcf693b", new Object[]{this, iMTOPDataObject, iRemoteBaseListener, context, str, new Integer(i)});
        }
        return b(iMTOPDataObject, iRemoteBaseListener, context, str, i).reqMethod(MethodEnum.POST).setUnitStrategy("UNIT_TRADE");
    }
}
