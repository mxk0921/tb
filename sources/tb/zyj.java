package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zyj implements es6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f33107a;

    static {
        t2o.a(729809776);
        t2o.a(475004953);
    }

    public zyj(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f33107a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14940246", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i < 2 || i > 50) {
            i = i2;
        }
        if (i > i3) {
            return 0;
        }
        return i3 - i;
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
            String[] strArr = (String[]) list.get(0);
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                int intValue = Integer.valueOf(list.get(1).toString()).intValue();
                int requestInAdvanceNum = this.f33107a.u(str).getRequestInAdvanceNum();
                if (requestInAdvanceNum < 2 || requestInAdvanceNum > 50) {
                    requestInAdvanceNum = intValue;
                }
                List<SectionModel> H = this.f33107a.H(str);
                if (H != null && !H.isEmpty()) {
                    return Integer.valueOf(b(requestInAdvanceNum, intValue, H.size()));
                }
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            bqa.i("gateway2.lastIndex", th, new String[0]);
            return -1;
        }
    }
}
