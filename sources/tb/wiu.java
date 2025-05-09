package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.accs.TrtcAccsHandler;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wiu implements qmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313344);
        t2o.a(395313636);
    }

    public String a(byte[] bArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8306511b", new Object[]{this, bArr, map});
        }
        return TrtcAccsHandler.i(map.get("userId"), map.get("serviceId"), bArr);
    }
}
