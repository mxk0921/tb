package anet.channel.session.dns;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NavigationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IBlockingResourceListener {
        void onBlockingScene(int i);
    }

    static {
        t2o.a(607125736);
    }

    public static void setup(IBlockingResourceListener iBlockingResourceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7955a1", new Object[]{iBlockingResourceListener});
            return;
        }
        DynamicComponentHandler.setupHomeTableMonitor();
        DynamicComponentHandler.registerBlockingResourceListener(iBlockingResourceListener);
    }
}
