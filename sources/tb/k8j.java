package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.list.ScrollToHelper;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_uikit.UIKitEngine;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.jarvis.JarvisKitModule;
import com.taobao.search.jarvis.MUSJarvisKitModule;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.musie.MUSObservablePageStorageModule;
import com.taobao.search.musie.MUSObservableValueModule;
import com.taobao.search.musie.MUSSearchFestivalModule;
import com.taobao.search.musie.MUSSearchHistoryModule;
import com.taobao.search.musie.MUSSearchOpenModule;
import com.taobao.search.musie.MUSSearchTimeModule;
import com.taobao.search.musie.MUSXSearchEventModule;
import com.taobao.search.musie.SearchStdReportModule;
import com.taobao.search.musie.component.MusShopInfo;
import com.taobao.search.musie.component.MusTheme;
import com.taobao.search.musie.component.audio.Audio;
import com.taobao.search.musie.component.filter.TbFilter;
import com.taobao.search.musie.component.rolling.MusRollingGroup;
import com.taobao.search.musie.component.rolling.MusRollingItem;
import com.taobao.search.musie.component.shadow.TbShadow;
import com.taobao.search.musie.component.tbscroll.TbScroller;
import com.taobao.search.musie.component.tbscroll.TbScrollerFoot;
import com.taobao.search.musie.img.BlurImage;
import com.taobao.search.musie.img.FilterImage;
import com.taobao.search.musie.img.LowDeviceImage;
import com.taobao.search.musie.img.MUSImage;
import com.taobao.search.musie.img.MusChameleon;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.musie.livevideo.video.MUSLiveVideoView;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.search.musie.lottie.MUSLottie;
import com.taobao.search.musie.pager.TbSlide;
import com.taobao.search.musie.pager.TbSlideFooter;
import com.taobao.search.musie.pager.TbSlideItem;
import com.taobao.search.musie.stack.MUStack;
import com.taobao.search.musie.stack.MUStackItem;
import com.taobao.search.musie.taowise.MUSMarkDown;
import com.taobao.search.musie.taowise.TBMarkDown;
import com.taobao.search.musie.videoscroll.MUSVideoScroll;
import com.taobao.search.musie.videoscroll.VideoScrollNode;
import com.taobao.search.musie.web.MusWeb;
import com.taobao.search.musie.weex.MusWeex;
import com.taobao.search.weex.module.SearchFestivalModule;
import com.taobao.search.weex.module.SearchTimeModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k8j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22470a = false;

    static {
        t2o.a(815792654);
    }

    public static synchronized void a(Application application) {
        synchronized (k8j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            } else if (f22470a) {
                if (!(uvh.f().e() instanceof hie)) {
                    uvh.f().m(new hie());
                }
                MUSEngine.registerUINode("mus-scroll", new tya());
            } else {
                f22470a = true;
                System.loadLibrary("c++_shared");
                l3p l3pVar = l3p.INSTANCE;
                l3pVar.j();
                MUSEngine.registerModule("xsearchEvent", MUSXSearchEventModule.class);
                MUSEngine.registerModule("SearchOpen", MUSSearchOpenModule.class);
                MUSEngine.registerModule(SearchStdReportModule.MODULE_NAME, SearchStdReportModule.class);
                MUSEngine.registerModule("TBSearchHistory", MUSSearchHistoryModule.class);
                MUSEngine.registerModule(JarvisKitModule.MODULE_NAME, MUSJarvisKitModule.class);
                MUSEngine.registerModule(SearchFestivalModule.MODULE_NAME, MUSSearchFestivalModule.class);
                MUSEngine.registerModule(SearchTimeModule.MODULE_NAME, MUSSearchTimeModule.class);
                MUSEngine.registerModule("ObservableMemCache", MUSObservableValueModule.class);
                MUSEngine.registerModule("ObservablePageStorage", MUSObservablePageStorageModule.class);
                MUSEngine.registerUINode(VideoScrollNode.TAG, new MUSVideoScroll.a());
                MUSEngine.registerUINode(MUSLiveVideoView.TAG_NAME, MusLiveVideo.class);
                MUSEngine.registerUINode("mus-stack-item", MUStackItem.class);
                MUSEngine.registerUINode("tb-audio", Audio.class);
                MUSEngine.registerUINode("tb-filter", TbFilter.class);
                MUSEngine.registerUINode("tb-shadow", TbShadow.class);
                MUSEngine.registerUINode("tb-blur-img", BlurImage.class);
                MUSEngine.registerUINode("tb-slide", TbSlide.class);
                MUSEngine.registerUINode("mus-scroll", new tya());
                MUSEngine.registerUINode("tb-slide-item", TbSlideItem.class);
                MUSEngine.registerUINode("tb-slide-footer", TbSlideFooter.class);
                if (!"degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
                    MUSEngine.registerUINode("tb-img", new MUSImage.a());
                } else if (l3pVar.d()) {
                    MUSEngine.registerUINode("tb-img", new LowDeviceImage.a());
                } else {
                    MUSEngine.registerUINode("tb-img", new Image.a());
                }
                MUSEngine.registerUINode("mus-chameleon", MusChameleon.class);
                MUSEngine.registerUINode("mus-web", MusWeb.class);
                MUSEngine.registerUINode("mus-weex", MusWeex.class, true);
                MUSEngine.registerUINode("tb-shop-info", MusShopInfo.class);
                MUSEngine.registerUINode("mus-stack", MUStack.class);
                MUSEngine.registerUINode("tb-filter-img", new FilterImage.a());
                MUSEngine.registerUINode("tb-theme", MusTheme.class);
                MUSEngine.registerUINode("tb-scroll", TbScroller.class);
                MUSEngine.registerUINode("tb-scroll-footer", TbScrollerFoot.class);
                MUSEngine.registerUINode("mus-lottie", MUSLottie.class);
                MUSEngine.registerUINode("mus-markdown", MUSMarkDown.class, true);
                MUSEngine.registerUINode("tb-markdown", TBMarkDown.class, true);
                MUSEngine.registerUINode("ms-horizontal-xsl", HorizontalXslComponent.class);
                MUSEngine.registerUINode("mus-rolling-group", MusRollingGroup.class);
                MUSEngine.registerUINode("mus-rolling-item", MusRollingItem.class);
                ScrollToHelper.o = o4p.y1();
                ScrollToHelper.p = o4p.z0();
                UIKitEngine.registerVideoCreator(new aa5());
                SearchXslSdk.install();
                s7m.a();
                uvh.f().m(new hie());
            }
        }
    }
}
