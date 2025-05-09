package com.taobao.tao.topmultitab.service.location;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a3b;
import tb.bqa;
import tb.cfc;
import tb.czj;
import tb.f4b;
import tb.m5a;
import tb.p78;
import tb.sfh;
import tb.t2o;
import tb.unr;
import tb.v20;
import tb.vxl;
import tb.wcc;
import tb.wk0;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LocationServiceImpl implements ILocationService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final double EARTH_RADIUS = 6378137.0d;
    private static final String TAG = "LocationServiceImpl";
    private Map<String, TBLocationOption.Accuracy> mAccuracyMap;
    private TBLocationDTO mBaseLocation;
    private IHomeControllerService mControllerService;
    private wcc mHomePageContext;
    private IHomePageLifecycleService mHomePageLifecycleService;
    private final AtomicBoolean mIsExecuteLocation = new AtomicBoolean(false);
    private IPageLifeCycle mPageLifeCycle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/location/LocationServiceImpl$1");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                LocationServiceImpl.access$000(LocationServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<LocationServiceImpl> f12821a;

        static {
            t2o.a(729810234);
            t2o.a(756023314);
        }

        public b(LocationServiceImpl locationServiceImpl) {
            this.f12821a = new WeakReference<>(locationServiceImpl);
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            bqa.d(LocationServiceImpl.TAG, "home_location_update");
            wk0.b();
            LocationServiceImpl locationServiceImpl = this.f12821a.get();
            if (locationServiceImpl == null || tBLocationDTO == null || !tBLocationDTO.isNavSuccess()) {
                wk0.c(tBLocationDTO);
                StringBuilder sb = new StringBuilder("位置获取失败");
                if (tBLocationDTO != null) {
                    obj = tBLocationDTO.getErrorCode();
                } else {
                    obj = "location为空";
                }
                sb.append(obj);
                sfh.d(LocationServiceImpl.TAG, sb.toString());
                return;
            }
            LocationServiceImpl.access$300(locationServiceImpl, tBLocationDTO);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<LocationServiceImpl> f12822a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends AsyncTask<Void, Void, Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LocationServiceImpl f12823a;
            public final /* synthetic */ TBLocationDTO b;

            public a(c cVar, LocationServiceImpl locationServiceImpl, TBLocationDTO tBLocationDTO) {
                this.f12823a = locationServiceImpl;
                this.b = tBLocationDTO;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/location/LocationServiceImpl$LocationCallback$1");
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
                }
                bqa.d(LocationServiceImpl.TAG, "onLocationChanged doInBackground");
                wk0.b();
                LocationServiceImpl locationServiceImpl = this.f12823a;
                if (locationServiceImpl == null) {
                    return null;
                }
                LocationServiceImpl.access$100(locationServiceImpl).set(false);
                TBLocationDTO tBLocationDTO = this.b;
                if (tBLocationDTO == null) {
                    wk0.c(null);
                    bqa.d(LocationServiceImpl.TAG, "位置获取失败 location 为空");
                    return null;
                } else if (!tBLocationDTO.isNavSuccess()) {
                    wk0.c(this.b);
                    bqa.d(LocationServiceImpl.TAG, "位置获取失败" + this.b.getErrorCode());
                    return null;
                } else {
                    LocationServiceImpl.access$200(this.f12823a, this.b);
                    return null;
                }
            }
        }

        static {
            t2o.a(729810235);
            t2o.a(756023314);
        }

        public c(LocationServiceImpl locationServiceImpl) {
            this.f12822a = new WeakReference<>(locationServiceImpl);
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            bqa.d(LocationServiceImpl.TAG, "LocationCallback");
            new a(this, this.f12822a.get(), tBLocationDTO).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    static {
        t2o.a(729810232);
        t2o.a(729810231);
    }

    public static /* synthetic */ void access$000(LocationServiceImpl locationServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2906b28c", new Object[]{locationServiceImpl});
        } else {
            locationServiceImpl.updateLocationGetRefreshData();
        }
    }

    public static /* synthetic */ AtomicBoolean access$100(LocationServiceImpl locationServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("2a3166eb", new Object[]{locationServiceImpl});
        }
        return locationServiceImpl.getIsExecuteLocation();
    }

    public static /* synthetic */ void access$200(LocationServiceImpl locationServiceImpl, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf7f1a", new Object[]{locationServiceImpl, tBLocationDTO});
        } else {
            locationServiceImpl.tryHandleLocation(tBLocationDTO);
        }
    }

    public static /* synthetic */ void access$300(LocationServiceImpl locationServiceImpl, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68ad39", new Object[]{locationServiceImpl, tBLocationDTO});
        } else {
            locationServiceImpl.handleLocation(tBLocationDTO);
        }
    }

    private double calculateDistance(TBLocationDTO tBLocationDTO, TBLocationDTO tBLocationDTO2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93f4b210", new Object[]{this, tBLocationDTO, tBLocationDTO2})).doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(tBLocationDTO.getLatitude());
            double parseDouble2 = Double.parseDouble(tBLocationDTO.getLongitude());
            double parseDouble3 = Double.parseDouble(tBLocationDTO2.getLatitude());
            double parseDouble4 = Double.parseDouble(tBLocationDTO2.getLongitude());
            double rad = rad(parseDouble);
            double rad2 = rad(parseDouble3);
            return Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((rad - rad2) / 2.0d), 2.0d) + ((Math.cos(rad) * Math.cos(rad2)) * Math.pow(Math.sin((rad(parseDouble2) - rad(parseDouble4)) / 2.0d), 2.0d)))) * 2.0d) * EARTH_RADIUS) * 10000.0d) / 10000;
        } catch (NumberFormatException e) {
            bqa.b(TAG, "location distance parseDouble error", e);
            return -1.0d;
        }
    }

    private IPageLifeCycle createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("da6084ef", new Object[]{this});
        }
        return new a();
    }

    private TBLocationOption createTBLocationOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("e8a25357", new Object[]{this});
        }
        TBLocationOption.TimeLimit valueOf = TBLocationOption.TimeLimit.valueOf(f4b.k());
        if (valueOf == TBLocationOption.TimeLimit.DEFAULT) {
            valueOf = TBLocationOption.TimeLimit.TEN_MIN;
        }
        bqa.d(TAG, "获取定位信息 缓存定位时限" + valueOf);
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setTimeLimit(valueOf);
        tBLocationOption.setAccuracy(getLocationAccuracy());
        tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
        return tBLocationOption;
    }

    private void executeLaunchLocation(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2993ee4", new Object[]{this, context});
            return;
        }
        bqa.d(TAG, "executeLocation");
        TBLocationOption createTBLocationOption = createTBLocationOption();
        b bVar = new b(this);
        wk0.a();
        Looper looper = m5a.a().c().getLooper();
        if (vxl.j()) {
            TBLocationDTO e = TBLocationClient.e(createTBLocationOption);
            if (e != null) {
                bVar.onLocationChanged(e);
                TBLocationClient.g(context).h(createTBLocationOption, null, looper);
                bqa.d(TAG, "LocationChange", "use location cache to request");
                return;
            }
            TBLocationClient.g(context).h(createTBLocationOption, bVar, looper);
            bqa.d(TAG, "LocationChange", "try to get real location to request");
        }
    }

    private Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d(TAG, "getActivity mHomePageContext == null");
            return null;
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        if (iHomePageProviderService == null) {
            bqa.d(TAG, "getActivity pageProviderService == null");
            return null;
        }
        z6d pageProvider = iHomePageProviderService.getPageProvider();
        if (pageProvider != null) {
            return pageProvider.k1();
        }
        return null;
    }

    private AtomicBoolean getIsExecuteLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("d7714e91", new Object[]{this});
        }
        return this.mIsExecuteLocation;
    }

    private TBLocationOption.Accuracy getLocationAccuracy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("513ee152", new Object[]{this});
        }
        if (this.mAccuracyMap == null) {
            HashMap hashMap = new HashMap();
            this.mAccuracyMap = hashMap;
            hashMap.put("DEFAULT", TBLocationOption.Accuracy.DEFAULT);
            this.mAccuracyMap.put("TENMETER", TBLocationOption.Accuracy.TENMETER);
            this.mAccuracyMap.put("HEKTOMETER", TBLocationOption.Accuracy.HEKTOMETER);
            this.mAccuracyMap.put("KILOMETER", TBLocationOption.Accuracy.KILOMETER);
        }
        return this.mAccuracyMap.get(f4b.h("home_location_accuracy_switch", "DEFAULT"));
    }

    private void handleLocation(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e2254", new Object[]{this, tBLocationDTO});
            return;
        }
        bqa.d(TAG, "RealLocation=" + tBLocationDTO.getLongitude() + "-" + tBLocationDTO.getLatitude());
        setBaseLocation(tBLocationDTO);
        czj.c(tBLocationDTO);
        notifyLocationChange(tBLocationDTO);
    }

    private void notifyLocationChange(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b52e05", new Object[]{this, tBLocationDTO});
            return;
        }
        IHomeControllerService iHomeControllerService = this.mControllerService;
        if (iHomeControllerService == null) {
            bqa.d(TAG, "notifyLocationChange mControllerService == null");
            return;
        }
        IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
        if (currentSubTabController == null) {
            bqa.d(TAG, "notifyLocationChange controller == null");
        } else {
            currentSubTabController.locationChange(tBLocationDTO);
        }
    }

    private double rad(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fac27990", new Object[]{this, new Double(d)})).doubleValue();
        }
        return (d * 3.141592653589793d) / 180.0d;
    }

    private void registerPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26969449", new Object[]{this});
        } else if (this.mHomePageLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycle();
            this.mHomePageLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
    }

    private void setBaseLocation(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce83c3f", new Object[]{this, tBLocationDTO});
        } else {
            this.mBaseLocation = tBLocationDTO;
        }
    }

    private void tryHandleLocation(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919335af", new Object[]{this, tBLocationDTO});
        } else if (!a3b.o(f4b.h("homeLocationRequestEnable", "true"))) {
            bqa.d(TAG, "updateLocationGetRefreshData homeLocationRequestEnable false");
        } else {
            TBLocationDTO tBLocationDTO2 = this.mBaseLocation;
            if (tBLocationDTO2 == null) {
                handleLocation(tBLocationDTO);
                return;
            }
            double calculateDistance = calculateDistance(tBLocationDTO2, tBLocationDTO);
            double d = f4b.d();
            bqa.d(TAG, "两地点位置差距" + calculateDistance + "米。 阀值" + d + "米。");
            if (calculateDistance > d) {
                handleLocation(tBLocationDTO);
            }
        }
    }

    private void unRegisterPageLifeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb44782", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mHomePageLifecycleService;
        if (iHomePageLifecycleService != null && this.mPageLifeCycle != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
    }

    private void updateLocationGetRefreshData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff0134", new Object[]{this});
        } else if (!p78.a()) {
            bqa.d(TAG, "updateLocationGetRefreshData enablePosition false");
        } else {
            executeLocation();
        }
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
        } else {
            unRegisterPageLifeListener();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.location.ILocationService
    public void updateLocationAtStartUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34dd6bb5", new Object[]{this, context});
            return;
        }
        bqa.d(TAG, "updateLocationGetRefreshData");
        if (!a3b.o(f4b.h("homeLocationRequestEnable", "true"))) {
            bqa.d(TAG, "updateLocationGetRefreshData homeLocationRequestEnable false");
        } else if (!p78.a()) {
            bqa.d(TAG, "updateLocationGetRefreshData enablePosition false");
        } else {
            executeLaunchLocation(context);
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
        this.mHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        this.mControllerService = (IHomeControllerService) this.mHomePageContext.a(IHomeControllerService.class);
        registerPageLifeListener();
    }

    private void executeLocation() {
        TBLocationOption createTBLocationOption;
        c cVar;
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c005d1", new Object[]{this});
            return;
        }
        bqa.d(TAG, "executeLocation ");
        if (this.mIsExecuteLocation.compareAndSet(false, true)) {
            try {
                try {
                    createTBLocationOption = createTBLocationOption();
                    cVar = new c(this);
                    wk0.a();
                    activity = getActivity();
                } catch (Exception e) {
                    bqa.d(TAG, "try to get realTime location occur except:" + e);
                }
                if (activity != null) {
                    TBLocationClient.g(activity).h(createTBLocationOption, cVar, Looper.getMainLooper());
                    bqa.d(TAG, "try to get realTime location ..");
                }
            } finally {
                this.mIsExecuteLocation.set(false);
            }
        }
    }
}
