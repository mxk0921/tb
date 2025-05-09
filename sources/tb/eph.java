package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eph implements pqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.pqh
    public MRTRuntimeException a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTRuntimeException) ipChange.ipc$dispatch("7bd2282", new Object[]{this, str, obj});
        }
        if (obj == null || !(obj instanceof Map)) {
            return new MRTRuntimeException(407, "result format error");
        }
        return null;
    }
}
