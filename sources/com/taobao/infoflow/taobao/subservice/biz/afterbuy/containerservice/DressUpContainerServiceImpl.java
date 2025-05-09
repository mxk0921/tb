package com.taobao.infoflow.taobao.subservice.biz.afterbuy.containerservice;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.rootcontainer.InfoFlowRootContainer;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import tb.cfc;
import tb.d6v;
import tb.eve;
import tb.fve;
import tb.iqb;
import tb.jm4;
import tb.l69;
import tb.t2o;
import tb.wm4;
import tb.xm4;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DressUpContainerServiceImpl implements IContainerService<ViewGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AfterBuyContainerServiceImpl";
    private wm4 mContainerRefresher;
    private cfc mInfoFlowContext;
    private ViewGroup mRootContainer;
    private final Class<? extends ISubService>[] layerServices = {IThemeService.class, IMainFeedsViewService.class};
    private xm4 mContainerLifecycleRegister = new xm4();
    private d6v mUiRefreshListenerRegister = new d6v();

    static {
        t2o.a(491782253);
        t2o.a(488636646);
    }

    private void addChildToRoot(ViewGroup viewGroup, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a45d21", new Object[]{this, viewGroup, frameLayout});
        } else if (viewGroup != null) {
            frameLayout.addView(viewGroup);
        }
    }

    private ViewGroup assembledContainer(cfc cfcVar, Context context) {
        Class<? extends ISubService>[] clsArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9f41cbf7", new Object[]{this, cfcVar, context});
        }
        FrameLayout createRootViewGroup = createRootViewGroup(context);
        for (Class<? extends ISubService> cls : this.layerServices) {
            eve.c(TAG, "createChildLayer_".concat(cls.getSimpleName()));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            addChildToRoot(createChildLayer(cfcVar, context, cls), createRootViewGroup);
            fve.e(TAG, "createChildLayer " + cls.getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            eve.b(TAG, "createChildLayer_".concat(cls.getSimpleName()));
        }
        return createRootViewGroup;
    }

    private FrameLayout createRootViewGroup(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7ba90b94", new Object[]{this, context});
        }
        InfoFlowRootContainer infoFlowRootContainer = new InfoFlowRootContainer(context);
        infoFlowRootContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return infoFlowRootContainer;
    }

    private void destroyChildLayer(cfc cfcVar, Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a392733", new Object[]{this, cfcVar, cls});
            return;
        }
        ISubService a2 = cfcVar.a(cls);
        if (a2 instanceof iqb) {
            ((iqb) a2).destroyContainer();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.mContainerLifecycleRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void addUiRefreshListener(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2066757f", new Object[]{this, aVar});
        } else {
            this.mUiRefreshListenerRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService, tb.iqb
    public ViewGroup createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        this.mContainerLifecycleRegister.c(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mRootContainer = assembledContainer(this.mInfoFlowContext, context);
        fve.e(TAG, "createContainer 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        this.mContainerLifecycleRegister.e();
        return this.mRootContainer;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        fve.e(TAG, "destroyContainer");
        if (this.mRootContainer != null) {
            for (Class<? extends ISubService> cls : this.layerServices) {
                destroyChildLayer(this.mInfoFlowContext, cls);
            }
            this.mRootContainer.removeAllViews();
            this.mRootContainer = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mContainerRefresher = new wm4(cfcVar);
        new jm4(cfcVar, this.mContainerLifecycleRegister);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        destroyContainer();
        this.mContainerLifecycleRegister.b();
        this.mUiRefreshListenerRegister.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.mContainerLifecycleRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void removeUiRefreshListener(IContainerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d30822", new Object[]{this, aVar});
        } else {
            this.mUiRefreshListenerRegister.e(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService
    public void uiRefresh(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19df0ab", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
            return;
        }
        fve.e(TAG, "uiRefresh");
        if (this.mRootContainer == null) {
            fve.e(TAG, "uiRefresh 容器尚未创建，直接返回");
        } else if (!"scrollToTop".equals(iUiRefreshActionModel.getUiOperationType())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mUiRefreshListenerRegister.d(iUiRefreshActionModel);
            this.mContainerRefresher.d(iContainerDataModel, iUiRefreshActionModel);
            this.mUiRefreshListenerRegister.c(iUiRefreshActionModel);
            fve.k(TAG, "uiRefresh 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private ViewGroup createChildLayer(cfc cfcVar, Context context, Class<? extends ISubService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1a921778", new Object[]{this, cfcVar, context, cls});
        }
        ISubService a2 = cfcVar.a(cls);
        if (a2 instanceof IMainFeedsViewService) {
            l69.b bVar = new l69.b();
            bVar.f(true ^ zn4.c(this.mInfoFlowContext.getContainerType().getContainerId()));
            IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) a2;
            iMainFeedsViewService.setInitConfig(bVar.d());
            return iMainFeedsViewService.createContainer(context);
        } else if (a2 instanceof iqb) {
            return ((iqb) a2).createContainer(context);
        } else {
            fve.e(TAG, "未查找到: " + cls + " 创建视图");
            return null;
        }
    }
}
