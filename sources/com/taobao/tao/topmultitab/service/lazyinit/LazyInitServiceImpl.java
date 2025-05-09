package com.taobao.tao.topmultitab.service.lazyinit;

import android.app.Activity;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomeOptimizeUtils;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;
import tb.bqa;
import tb.cfc;
import tb.o78;
import tb.p5x;
import tb.t2o;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LazyInitServiceImpl implements ILazyInitService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LazyInitManager";
    private wcc mHomePageContext;
    private final Handler handler = new Handler();
    private final Runnable delay500AfterHomeLoaded = new a();
    private final Runnable delay4000AfterHomeLoaded = new b();
    private final Runnable delay10000AfterHomeLoaded = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (LazyInitServiceImpl.access$000(LazyInitServiceImpl.this) == null) {
                bqa.d(LazyInitServiceImpl.TAG, "mHomePageContext == null");
            } else {
                IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) LazyInitServiceImpl.access$000(LazyInitServiceImpl.this).a(IHomePageLifecycleService.class);
                if (iHomePageLifecycleService == null) {
                    bqa.d(LazyInitServiceImpl.TAG, "homePageLifecycleService == null");
                } else {
                    iHomePageLifecycleService.onLazyInit();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (LazyInitServiceImpl.access$000(LazyInitServiceImpl.this) == null) {
                    bqa.d(LazyInitServiceImpl.TAG, "mHomePageContext == null");
                    return;
                }
                IShakeService iShakeService = (IShakeService) LazyInitServiceImpl.access$000(LazyInitServiceImpl.this).a(IShakeService.class);
                if (iShakeService == null) {
                    bqa.d(LazyInitServiceImpl.TAG, "IShakeService == null");
                    return;
                }
                iShakeService.startShake();
                p5x.a();
            } catch (Exception e) {
                bqa.d(LazyInitServiceImpl.TAG, "startShake init failed  !!!" + e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                o78.m();
                Activity access$100 = LazyInitServiceImpl.access$100(LazyInitServiceImpl.this);
                if (access$100 == null) {
                    bqa.d(LazyInitServiceImpl.TAG, "10000 activity == null");
                } else {
                    HomeOptimizeUtils.b(access$100, null, false);
                }
            } catch (Exception e) {
                bqa.d(LazyInitServiceImpl.TAG, "init load failed  !!!" + e);
            }
        }
    }

    static {
        t2o.a(729810208);
        t2o.a(729810207);
    }

    public static /* synthetic */ wcc access$000(LazyInitServiceImpl lazyInitServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("d12cbdb", new Object[]{lazyInitServiceImpl});
        }
        return lazyInitServiceImpl.mHomePageContext;
    }

    public static /* synthetic */ Activity access$100(LazyInitServiceImpl lazyInitServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6061071d", new Object[]{lazyInitServiceImpl});
        }
        return lazyInitServiceImpl.getActivity();
    }

    private Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "mHomePageContext == null");
            return null;
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        if (iHomePageProviderService == null) {
            bqa.d(TAG, "pageProviderService == null");
            return null;
        }
        z6d pageProvider = iHomePageProviderService.getPageProvider();
        if (pageProvider != null) {
            return pageProvider.k1();
        }
        bqa.d(TAG, "pageProvider == null");
        return null;
    }

    private void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
            return;
        }
        this.handler.postDelayed(this.delay500AfterHomeLoaded, 1000L);
        this.handler.postDelayed(this.delay4000AfterHomeLoaded, 5000L);
        this.handler.postDelayed(this.delay10000AfterHomeLoaded, 11000L);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        lazyInit();
    }
}
