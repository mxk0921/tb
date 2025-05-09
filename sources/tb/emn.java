package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class emn implements es6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809687);
        t2o.a(475004953);
    }

    public emn(imn imnVar) throws GatewayException {
        if (imnVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
    }

    @Override // tb.es6
    public Object a(List list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5df90a9b", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : list) {
            if (!(obj instanceof fak)) {
                if (obj == null) {
                    str = null;
                } else {
                    str = obj.toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(str);
                }
            }
        }
        return stringBuffer.toString();
    }
}
