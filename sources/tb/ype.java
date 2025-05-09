package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ype {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031899);
    }

    public static ImageStrategyConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("3cbb9008", new Object[0]);
        }
        return ImageStrategyConfig.v("default", 20).a();
    }
}
