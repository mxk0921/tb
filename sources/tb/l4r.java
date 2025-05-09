package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l4r implements v8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432054);
        t2o.a(336592929);
    }

    @Override // tb.v8
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        } else {
            TLog.loge("AbilityKit", str, str2);
        }
    }
}
