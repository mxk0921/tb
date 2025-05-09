package com.alibaba.triver.triver_shop;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.taobao.windvane.extra.core.WVCore;
import android.util.Log;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.triver.basic.proxy.ILogNetworkPoint;
import com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView;
import com.alibaba.triver.kernel.TriverEmbedViewProvider;
import com.alibaba.triver.point.InterceptShowErrorPoint;
import com.alibaba.triver.point.TriverOpenModeProxy;
import com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView;
import com.alibaba.triver.triver_shop.extension.ShopInterceptErrorExtension;
import com.alibaba.triver.triver_shop.extension.ShopLifecycleExtension;
import com.alibaba.triver.triver_shop.extension.ShopOpenModeExtension;
import com.alibaba.triver.triver_shop.extension.ShopPointExtension;
import com.alibaba.triver.triver_shop.jsapi.WVShopApiBridge;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.preload.ShopClassPreloader;
import com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload;
import com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload;
import com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView;
import com.alibaba.triver.triver_shop.weexview.EmbedWeexView;
import com.alibaba.triver.triver_shop.wvjsbridge.WVAriverShopBridge;
import com.alibaba.triver.triver_shop.wxmodule.WXAriverShopModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.TBShopLiveEmbedView;
import com.taobao.themis.kernel.TMSTBOpenStart;
import com.taobao.weex.WXSDKEngine;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.aqp;
import tb.fsw;
import tb.npp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TBShopManifest implements RVManifest, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements RVProxy.LazyGetter<ILogNetworkPoint> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBShopManifest tBShopManifest) {
        }

        /* renamed from: a */
        public ILogNetworkPoint get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ILogNetworkPoint) ipChange.ipc$dispatch("ed9a8b79", new Object[]{this});
            }
            return new ShopPointExtension();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements RVProxy.LazyGetter<TriverOpenModeProxy> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TBShopManifest tBShopManifest) {
        }

        /* renamed from: a */
        public TriverOpenModeProxy get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TriverOpenModeProxy) ipChange.ipc$dispatch("120a5fd4", new Object[]{this});
            }
            return new ShopOpenModeExtension();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TBShopManifest tBShopManifest) {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            MessageQueue queue;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            try {
                boolean isUCSupport = WVCore.getInstance().isUCSupport();
                npp.a("shop catch idle time, init : " + isUCSupport);
                if (WVCore.getInstance().isUCSupport()) {
                    ShopIndexWebViewPreload.INSTANCE.e(Globals.getApplication());
                }
                queue = Looper.getMainLooper().getQueue();
                queue.removeIdleHandler(this);
            } catch (Throwable th) {
                npp.a("shop web preload exception : " + th.getMessage());
            }
            return false;
        }
    }

    static {
        t2o.a(766509088);
    }

    public AccessController getAccessController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessController) ipChange.ipc$dispatch("6611d303", new Object[]{this});
        }
        return null;
    }

    public List<AppUpdaterFactory.Rule> getAppUpdaterRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be3d0607", new Object[]{this});
        }
        return null;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0258f4b", new Object[]{this});
        }
        return null;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6193300d", new Object[]{this});
        }
        return new ArrayList();
    }

    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6d904c7", new Object[]{this});
        }
        return null;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo("ariver", "com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView", Arrays.asList(AppStartPoint.class.getName(), AppResumePoint.class.getName(), AppDestroyPoint.class.getName())));
        arrayList.add(new ExtensionMetaInfo("triver", ShopLifecycleExtension.class.getName(), Arrays.asList(AppStartPoint.class.getName(), AppDestroyPoint.class.getName()), App.class));
        arrayList.add(new ExtensionMetaInfo("triver", ShopInterceptErrorExtension.class.getName(), Collections.singletonList(InterceptShowErrorPoint.class.getName())));
        return arrayList;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        MessageQueue queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8baffca", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            WXSDKEngine.registerModule("ariver", WXAriverShopModule.class);
            fsw.h(RVConstants.TAG, WVAriverShopBridge.class);
            fsw.h("NShop", WVShopApiBridge.class);
            arrayList.add(new RVManifest.LazyProxyManifest(ILogNetworkPoint.class, new a(this)));
            TriverEmbedViewProvider.registerEmebedView(EmbedSubscribeView.TYPE, EmbedSubscribeView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView("widget", TRWidgetMiniAppEmbedView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView(EmbedWeexView.TYPE, EmbedWeexView.class.getCanonicalName());
            TriverEmbedViewProvider.registerEmebedView("shop-loft", EmbedSecondFloorView.class.getCanonicalName());
            IpChange ipChange2 = TBShopLiveEmbedView.$ipChange;
            TriverEmbedViewProvider.registerEmebedView(TBShopLiveEmbedView.TYPE, TBShopLiveEmbedView.class.getCanonicalName());
            arrayList.add(new RVManifest.LazyProxyManifest(TriverOpenModeProxy.class, new b(this)));
            boolean isTBOpenStart = TMSTBOpenStart.getIsTBOpenStart();
            npp.a("tms fast open : " + isTBOpenStart);
            Log.e(ShopView.SP_NAMESPACE, "tms fast open : " + isTBOpenStart);
            if (!isTBOpenStart && aqp.Companion.l0() && Build.VERSION.SDK_INT >= 23) {
                queue = Looper.getMainLooper().getQueue();
                queue.addIdleHandler(new c(this));
            }
            ShopRouterMiniDataPreload.INSTANCE.f(Globals.getApplication());
            if (aqp.Companion.Y()) {
                ShopClassPreloader.Companion companion = ShopClassPreloader.Companion;
                companion.b();
                companion.a();
            }
        } catch (Throwable th) {
            RVLogger.w(Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public RemoteController getRemoteController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteController) ipChange.ipc$dispatch("1aaae609", new Object[]{this});
        }
        return null;
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a311f2af", new Object[]{this, extensionManager});
        }
        return new ArrayList();
    }
}
