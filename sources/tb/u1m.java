package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(438304803);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[0])).intValue();
        }
        return SystemBarDecorator.SystemBarConfig.getStatusBarHeight(i84.a());
    }
}
