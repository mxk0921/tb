package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.weex.WXSDKEngine;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wza implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809370);
        t2o.a(729809365);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return a(wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("initRecContainer");
    }

    public final boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd6d2c35", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        try {
            if (!h0b.b()) {
                WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
                WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
                MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
                h0b.c(true);
            }
            wVCallBackContext.success("success");
        } catch (Throwable th) {
            sfh.d("homepage.HomePageWVPlugin", "initFavoriteWeex exception e = " + th.toString());
            wVCallBackContext.success();
        }
        return true;
    }
}
