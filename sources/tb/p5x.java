package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.weex.WXSDKEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809106);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e58fd21", new Object[0]);
            return;
        }
        try {
            if (!h0b.b()) {
                WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
                WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
                h0b.c(true);
                MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
            }
        } catch (Throwable unused) {
        }
    }
}
