package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pe8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kDontNotifyNative = 1;
    public static final int kStrategyNone = 0;

    static {
        t2o.a(921698305);
    }

    public void a(JSEngine jSEngine, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73732bd1", new Object[]{this, jSEngine, map});
        }
    }

    public int b(JSEngine jSEngine, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca8421f3", new Object[]{this, jSEngine, map})).intValue();
        }
        return 0;
    }

    public void c(JSEngine jSEngine, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615f62ea", new Object[]{this, jSEngine, map});
        }
    }
}
