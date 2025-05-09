package tb;

import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.tab2interact.pageadapter.guangguang.tnode.GGInteractContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268158);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        o.S0("tbplayer", TBVideoComponent.class);
        o.S0("lottie", AnimationViewComponent.class);
        o.S0("weex", r4x.class);
        o.S0("web", j1x.class);
        o.S0("webview", j1x.class);
        o.S0("errorwidget", li8.class);
        try {
            o.S0("liveroom", a.class);
        } catch (Throwable th) {
            TLog.loge("ComponentRegister", "注册直播组件异常，throwable=" + th);
        }
        try {
            IpChange ipChange2 = GGInteractContainerComponent.$ipChange;
            o.S0(BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER, GGInteractContainerComponent.class);
        } catch (Throwable th2) {
            TLog.loge("ComponentRegister", "注册互动容器组件异常，throwable=" + th2);
        }
        o.Y0("bottomsheet", "com.taobao.tao.flexbox.layoutmanager.component.BottomSheetComponent");
        o.Y0("imagescanner", "com.taobao.tao.flexbox.layoutmanager.component.ImageScannerComponent");
        o.Y0("opacityView", "com.taobao.tao.flexbox.layoutmanager.component.OpacityComponent");
        o.Y0("photoView", "com.taobao.tao.flexbox.layoutmanager.component.PhotoViewComponent");
        o.Y0(TBBuyPreloadScene.NAV, "com.taobao.tao.flexbox.layoutmanager.component.NavComponent");
        o.Y0("gotop", "com.taobao.tao.flexbox.layoutmanager.component.GoTopComponent");
        o.Y0("exposureView", "com.taobao.tao.flexbox.layoutmanager.component.ExposureComponent");
        o.Y0("dragButton", "com.taobao.tao.flexbox.layoutmanager.component.DragButtonComponent");
        o.Y0(UiUtil.INPUT_TYPE_VALUE_CHECKBOX, "com.taobao.tao.flexbox.layoutmanager.component.CheckBoxComponent");
        o.Y0("livephoto", "com.taobao.tao.flexbox.layoutmanager.component.LivePhotoComponent");
        o.Y0("viewpager", "com.taobao.tao.flexbox.layoutmanager.component.ViewPagerComponent");
        o.Y0(rr6.TYPE_BANNER, "com.taobao.tao.flexbox.layoutmanager.component.BannerComponent");
    }
}
