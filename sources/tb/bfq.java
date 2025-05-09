package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import java.text.DecimalFormat;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bfq implements xrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xrd
    public String b(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9becdb8", new Object[]{this, efqVar});
        }
        Mtop mtop = efqVar.j;
        i7j i7jVar = efqVar.d;
        MtopNetworkProp mtopNetworkProp = efqVar.f18534a;
        try {
            if (!StringUtils.isNotBlank(i7jVar.T) || !SwitchConfig.getInstance().getEnableFullTraceId()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(mtop.getMtopConfig().utdid);
                sb.append(System.currentTimeMillis());
                sb.append(new DecimalFormat(PreholdingPhoneNumberData.PRE_SUCCESS).format(i7jVar.O % 10000));
                sb.append("1");
                sb.append(mtop.getMtopConfig().processId);
                mtopNetworkProp.clientTraceId = sb.toString();
            } else {
                mtopNetworkProp.clientTraceId = i7jVar.T;
            }
        } catch (Exception e) {
            TBSdkLog.e("ssr.SsrAppConfigBeforeFilter", efqVar.b, "generate client-trace-id failed.", e);
        }
        mtopNetworkProp.falcoId = i7jVar.T;
        return "CONTINUE";
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrAppConfigBeforeFilter";
    }
}
