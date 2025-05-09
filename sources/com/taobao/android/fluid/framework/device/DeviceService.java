package com.taobao.android.fluid.framework.device;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import tb.f2k;
import tb.f9e;
import tb.ir9;
import tb.mzb;
import tb.nwv;
import tb.o4k;
import tb.pr9;
import tb.qp0;
import tb.rpn;
import tb.t2o;
import tb.ui7;
import tb.uq9;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DeviceService implements IDeviceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IDeviceService";
    private static final String TAG = "DeviceService";
    private boolean isScreenChanged;
    private IContainerService mContainerService;
    private IDataService mDataService;
    private final ui7 mDeviceListenerManager;
    private float mDeviceScore = 0.0f;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private int mScreenChangeType;
    private OnScreenChangedListener mTBAutoScreenChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends f9e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2043369346) {
                super.onVideoStart((uq9) objArr[0]);
                return null;
            } else if (hashCode == -786262712) {
                super.onVideoPlay((uq9) objArr[0]);
                return null;
            } else if (hashCode == 363462658) {
                super.onVideoPause((uq9) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/device/DeviceService$1");
            }
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoPause(uq9 uq9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
                return;
            }
            super.onVideoPause(uq9Var, z);
            ir9.b(DeviceService.TAG, "onVideoPause");
            rpn.b(DeviceService.access$000(DeviceService.this));
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoPlay(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
                return;
            }
            super.onVideoPlay(uq9Var);
            if (uq9Var != null && uq9Var.h0()) {
                rpn.a(DeviceService.access$000(DeviceService.this), uq9Var.Y());
            }
        }

        @Override // tb.f9e.a, tb.f9e
        public void onVideoStart(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
                return;
            }
            super.onVideoStart(uq9Var);
            if (uq9Var != null && uq9Var.h0()) {
                rpn.a(DeviceService.access$000(DeviceService.this), uq9Var.Y());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -147728739) {
                super.onActive((uq9) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/device/DeviceService$2");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            super.onActive(uq9Var);
            if (uq9Var != null) {
                rpn.a(DeviceService.access$000(DeviceService.this), uq9Var.Y());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DeviceService.this.setTabletDeviceRotate();
                }
            }
        }

        public c() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IContainerService iContainerService;
            final ViewGroup contentView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            ir9.b(DeviceService.TAG, "onScreenChanged, changeType: " + i + ",mScreenChangeType:" + DeviceService.access$100(DeviceService.this));
            if (DeviceService.access$100(DeviceService.this) != i) {
                DeviceService.access$102(DeviceService.this, i);
                DeviceService.access$202(DeviceService.this, true);
                DeviceService.access$300(DeviceService.this).onScreenChanged(i, configuration);
                nwv.y0(new a());
            }
            if (f2k.d(DeviceService.access$000(DeviceService.this)) && (iContainerService = (IContainerService) DeviceService.access$000(DeviceService.this).getService(IContainerService.class)) != null && (contentView = iContainerService.getContentView()) != null) {
                contentView.post(new Runnable() { // from class: tb.zi7
                    @Override // java.lang.Runnable
                    public final void run() {
                        contentView.requestLayout();
                    }
                });
            }
        }
    }

    static {
        t2o.a(468714366);
        t2o.a(468714371);
    }

    public DeviceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mDeviceListenerManager = new ui7(fluidContext);
    }

    public static /* synthetic */ FluidContext access$000(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("7b3115ad", new Object[]{deviceService});
        }
        return deviceService.mFluidContext;
    }

    public static /* synthetic */ int access$100(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb03bd8d", new Object[]{deviceService})).intValue();
        }
        return deviceService.mScreenChangeType;
    }

    public static /* synthetic */ int access$102(DeviceService deviceService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c93711e", new Object[]{deviceService, new Integer(i)})).intValue();
        }
        deviceService.mScreenChangeType = i;
        return i;
    }

    public static /* synthetic */ boolean access$202(DeviceService deviceService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da532901", new Object[]{deviceService, new Boolean(z)})).booleanValue();
        }
        deviceService.isScreenChanged = z;
        return z;
    }

    public static /* synthetic */ ui7 access$300(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ui7) ipChange.ipc$dispatch("32d0b175", new Object[]{deviceService});
        }
        return deviceService.mDeviceListenerManager;
    }

    private void addScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a2be62", new Object[]{this});
        } else if (this.mTBAutoScreenChangedListener == null) {
            this.mTBAutoScreenChangedListener = new c();
            TBAutoSizeConfig.x().d0(this.mTBAutoScreenChangedListener);
        }
    }

    private void removeScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ad3df", new Object[]{this});
        } else if (this.mTBAutoScreenChangedListener != null) {
            TBAutoSizeConfig.x().h0(this.mTBAutoScreenChangedListener);
            this.mTBAutoScreenChangedListener = null;
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void addDeviceRotateListener(mzb mzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986e7e89", new Object[]{this, mzbVar});
        } else {
            this.mDeviceListenerManager.b(mzbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void addOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effcfd4d", new Object[]{this, onScreenChangedListener});
        } else {
            this.mDeviceListenerManager.e(onScreenChangedListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public float getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[]{this})).floatValue();
        }
        float c2 = qp0.c();
        this.mDeviceScore = c2;
        if (c2 >= 0.0f) {
            return c2;
        }
        return -1.0f;
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            addScreenChangedListener();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mLifecycleService = iLifecycleService;
        if (iLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
            return;
        }
        IContainerService iContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mContainerService = iContainerService;
        if (iContainerService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, IContainerService.class);
            return;
        }
        this.mLifecycleService.addPageLifecycleListener(this);
        new o4k(this.mFluidContext);
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        IMediaService iMediaService = (IMediaService) this.mFluidContext.getService(IMediaService.class);
        if (iMediaService != null) {
            iMediaService.addVideoPlayerListener((f9e.a) new a());
        }
        ICardService iCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        if (iCardService != null) {
            iCardService.addCardLifecycleListener((wlb.a) new b());
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            removeScreenChangedListener();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b(TAG, "onPause");
        rpn.b(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        FluidContext fluidContext = this.mFluidContext;
        rpn.a(fluidContext, ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaDetail());
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void removeDeviceRotateListener(mzb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43555f81", new Object[]{this, aVar});
        } else {
            this.mDeviceListenerManager.f(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void removeOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b87bf30", new Object[]{this, onScreenChangedListener});
        } else {
            this.mDeviceListenerManager.h(onScreenChangedListener);
        }
    }

    public void setTabletDeviceRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593fcce0", new Object[]{this});
        } else if (!this.isScreenChanged) {
        } else {
            if (pr9.j()) {
                this.mDeviceListenerManager.d();
            } else {
                this.mDeviceListenerManager.c();
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void addDeviceRotateListener(mzb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086931e", new Object[]{this, aVar});
        } else {
            this.mDeviceListenerManager.a(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public void removeDeviceRotateListener(mzb mzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae155dec", new Object[]{this, mzbVar});
        } else {
            this.mDeviceListenerManager.g(mzbVar);
        }
    }
}
