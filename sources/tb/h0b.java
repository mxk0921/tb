package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.orange.OrangeConfig;
import com.taobao.oversea.baobao.TMGBaobaoBridge;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h0b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b = false;

    static {
        t2o.a(729809322);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc167ae2", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9c361", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static /* synthetic */ Object ipc$super(h0b h0bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeIdleLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        this.f33099a.p("HomeIdleLauncher", 4);
        this.f33099a.l("homeIdle");
        super.a(application, hashMap);
        qul.g();
        OrangeConfig.getInstance().getConfigs("homepage_switch");
        OrangeConfig.getInstance().registerListener(new String[]{"homepage_switch"}, new g9l(), true);
        m0b.f();
        if (!b) {
            try {
                WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
                WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
                MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
                b = true;
            } catch (WXException e) {
                y9n.d("Weex exception:", e);
            }
        }
        c3b.l();
        nrv.a().b();
        sfh.d("HomeIdleLauncher", "闲时校验加载订阅bundle");
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            iHomeControllerService.checkLoadSubscribeBundle();
        }
        mdy.b();
        try {
            fsw.h("TMGBaobaoBridge", TMGBaobaoBridge.class);
            r5a.i("Page_Home", 2201, "Page_Home_OvsbaobaoInit", "");
        } catch (Throwable th) {
            bqa.b("HomeIdleLauncher", "register ovs Plugin error", th);
        }
        this.f33099a.c("HomeIdleLauncher");
    }
}
