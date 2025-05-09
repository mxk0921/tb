package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.cacheservice.CacheServiceImpl;
import com.taobao.infoflow.core.subservice.base.item.dxservice.DxItemRenderServiceImpl;
import com.taobao.infoflow.core.subservice.base.item.itemrenderservice.ItemRenderServiceImpl;
import com.taobao.infoflow.core.subservice.base.preload.PrefetchImageServiceImpl;
import com.taobao.infoflow.core.subservice.biz.cardcache.CardUtCacheServiceImpl;
import com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice.DynamicLayoutService;
import com.taobao.infoflow.core.subservice.biz.loopstartstopservice.MainFeedsLoopStartStopServiceImpl;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.ContainerServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.MainFeedsViewServiceImpl;
import com.taobao.infoflow.core.subservice.framework.container.stickyservice.StickyContainerServiceImpl;
import com.taobao.infoflow.core.subservice.framework.hostservice.HostServiceImpl;
import com.taobao.infoflow.core.subservice.framework.mainlifecycleservice.MainLifecycleServiceImpl;
import com.taobao.infoflow.core.subservice.framework.themeservice.ThemeServiceDefaultImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z67 implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539577);
        t2o.a(488636520);
    }

    @Override // tb.mtd
    public List<ISubService> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        e(arrayList);
        d(arrayList);
        return arrayList;
    }

    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("45e32442", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(IConfigService.SERVICE_NAME);
        arrayList.add(ICacheService.SERVICE_NAME);
        arrayList.add("DataService");
        arrayList.add(IContainerService.SERVICE_NAME);
        arrayList.add(IMainLifecycleService.SERVICE_NAME);
        arrayList.add(IThemeService.SERVICE_NAME);
        arrayList.add(IMainFeedsLoopStartStopService.SERVICE_NAME);
        arrayList.add(ISceneService.SERVICE_NAME);
        arrayList.add(IMainFeedsViewService.SERVICE_NAME);
        arrayList.add(IItemRenderService.SERVICE_NAME);
        arrayList.add(IDxItemRenderService.SERVICE_NAME);
        return arrayList;
    }

    public final void c(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47583a6c", new Object[]{this, list});
            return;
        }
        list.add(new CacheServiceImpl());
        list.add(new ItemRenderServiceImpl());
        list.add(new DxItemRenderServiceImpl());
        list.add(new CardUtCacheServiceImpl());
        list.add(new DynamicLayoutService());
        if (bve.n()) {
            list.add(new PrefetchImageServiceImpl());
        }
    }

    public final void d(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165f2fce", new Object[]{this, list});
        } else {
            list.add(new MainFeedsLoopStartStopServiceImpl());
        }
    }

    public final void e(List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b7cdf9", new Object[]{this, list});
            return;
        }
        list.add(new HostServiceImpl());
        list.add(new ThemeServiceDefaultImpl());
        list.add(new SceneServiceImpl());
        list.add(new MainLifecycleServiceImpl());
        list.add(new ContainerServiceImpl());
        list.add(new MainFeedsViewServiceImpl());
        list.add(new StickyContainerServiceImpl());
        list.add(new StayTimeServiceImpl());
    }
}
