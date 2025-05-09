package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbliveinteractive.business.tradetrack.sign.MtopContentlivekitComponentTradeSignRequest;
import com.taobao.tbliveinteractive.business.tradetrack.sign.MtopContentlivekitComponentTradeSignResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cdu extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356585);
    }

    public cdu(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(cdu cduVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveinteractive/business/tradetrack/sign/TradeTrackSignBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a585512", new Object[]{this, str});
            return;
        }
        MtopContentlivekitComponentTradeSignRequest mtopContentlivekitComponentTradeSignRequest = new MtopContentlivekitComponentTradeSignRequest();
        mtopContentlivekitComponentTradeSignRequest.setLiveId(str);
        C(0, mtopContentlivekitComponentTradeSignRequest, MtopContentlivekitComponentTradeSignResponse.class);
    }
}
