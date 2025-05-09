package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lmn implements es6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f23423a;

    static {
        t2o.a(729809688);
        t2o.a(475004953);
    }

    public lmn(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f23423a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    @Override // tb.es6
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5df90a9b", new Object[]{this, list});
        }
        if (list == null || list.size() < 2) {
            return -1;
        }
        try {
            String str = (String) list.get(0);
            int intValue = Integer.valueOf(list.get(1).toString()).intValue();
            int requestInAdvanceNum = this.f23423a.u(str).getRequestInAdvanceNum();
            if (requestInAdvanceNum >= 2 && requestInAdvanceNum <= 10) {
                intValue = requestInAdvanceNum;
            }
            List<SectionModel> H = this.f23423a.H(str);
            if (H != null && !H.isEmpty()) {
                if (intValue > H.size()) {
                    return 0;
                }
                return Integer.valueOf(H.size() - intValue);
            }
            return -1;
        } catch (Throwable th) {
            bqa.i("gateway2.lastIndex", th, new String[0]);
            return -1;
        }
    }
}
