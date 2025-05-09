package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbliveinteractive.business.tradetrack.MtopContentlivekitComponentTradeTrackRequest;
import com.taobao.tbliveinteractive.business.tradetrack.MtopContentlivekitComponentTradeTrackResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bdu extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356579);
    }

    public bdu(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(bdu bduVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbliveinteractive/business/tradetrack/TradeTrackBusiness");
    }

    public void K(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46076d4", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        MtopContentlivekitComponentTradeTrackRequest mtopContentlivekitComponentTradeTrackRequest = new MtopContentlivekitComponentTradeTrackRequest();
        mtopContentlivekitComponentTradeTrackRequest.setLiveId(str);
        mtopContentlivekitComponentTradeTrackRequest.setItemId(str2);
        mtopContentlivekitComponentTradeTrackRequest.setSpmUrl(str3);
        mtopContentlivekitComponentTradeTrackRequest.setEntrySpm(str4);
        mtopContentlivekitComponentTradeTrackRequest.setLiveSource(str5);
        mtopContentlivekitComponentTradeTrackRequest.setEntryLiveSource(str6);
        mtopContentlivekitComponentTradeTrackRequest.setSign(str7);
        C(0, mtopContentlivekitComponentTradeTrackRequest, MtopContentlivekitComponentTradeTrackResponse.class);
    }
}
