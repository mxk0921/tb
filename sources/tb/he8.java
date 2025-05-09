package tb;

import com.alibaba.android.ultron.engine.protocol.EndPoint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class he8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286477);
    }

    public static EndPoint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EndPoint) ipChange.ipc$dispatch("eac53475", new Object[0]);
        }
        EndPoint endPoint = new EndPoint();
        endPoint.protocolVersion = k75.VIDEOCONFIG_API_VERSION_3;
        return endPoint;
    }
}
