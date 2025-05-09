package com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IClientToServerMonitorService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.ayd;
import tb.c6v;
import tb.cfc;
import tb.fve;
import tb.h6d;
import tb.jnl;
import tb.mve;
import tb.q4o;
import tb.r28;
import tb.t2o;
import tb.vzi;
import tb.zqs;
import tb.zr6;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ClientToServerMonitorServiceImpl implements IClientToServerMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_OPEN_STABILITY_MONITOR = "enableOpenStabilityMonitor";
    private static final String TAG = "ClientToServerMonitorServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IContainerService<?> mContainerService;
    private zr6 mDataProcessListener;
    private r28 mDxItemClickListener;
    private IDxItemClickService mDxItemClickService;
    private cfc mInfoFlowContext;
    private IMainLifecycleService mMainLifecycleService;
    private h6d mPageLifecycleListener;
    private q4o mRequestListener;
    private zxd mTabLifeCycle;
    private c6v mUiRefreshListener;

    static {
        t2o.a(491782296);
        t2o.a(488636546);
    }

    private void initRegisterTabSelectListener(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4194ac67", new Object[]{this, cfcVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            ayd tabLifeCycleRegister = iMainLifecycleService.getTabLifeCycleRegister();
            zqs zqsVar = new zqs(this.mInfoFlowContext.getContainerType().a());
            this.mTabLifeCycle = zqsVar;
            tabLifeCycleRegister.a(zqsVar);
        }
    }

    private void registerDataProcessListener(IContainerDataService<?> iContainerDataService, vzi vziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74ef861", new Object[]{this, iContainerDataService, vziVar});
        } else if (iContainerDataService == null) {
            fve.e(TAG, "registerUiRefreshListener containerDataService == null");
        } else if (this.mDataProcessListener == null) {
            zr6 zr6Var = new zr6(vziVar, this.mInfoFlowContext);
            this.mDataProcessListener = zr6Var;
            iContainerDataService.addDataProcessListener(zr6Var);
            fve.e(TAG, "registerDataProcessListener");
        }
    }

    private void registerDxItemClickListener(IDxItemClickService iDxItemClickService, vzi vziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68fb086", new Object[]{this, iDxItemClickService, vziVar});
        } else if (iDxItemClickService == null) {
            fve.e(TAG, "registerDxItemClickListener dxItemClickService == null");
        } else if (this.mDxItemClickListener == null) {
            r28 r28Var = new r28(vziVar, this.mInfoFlowContext);
            this.mDxItemClickListener = r28Var;
            iDxItemClickService.addDxItemClickListener(r28Var);
            fve.e(TAG, "registerDxItemClickListener");
        }
    }

    private void registerPageLifecycleListener(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758747d5", new Object[]{this, iMainLifecycleService});
        } else if (iMainLifecycleService == null) {
            fve.e(TAG, "registerPageLifecycleListener mainLifecycleService == null");
        } else if (this.mPageLifecycleListener == null) {
            this.mPageLifecycleListener = new jnl(this.mInfoFlowContext.getContainerType().a());
            iMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifecycleListener);
            fve.e(TAG, "registerPageLifecycleListener");
        }
    }

    private void registerRequestListener(IContainerDataService<?> iContainerDataService, vzi vziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c791077", new Object[]{this, iContainerDataService, vziVar});
        } else if (iContainerDataService == null) {
            fve.e(TAG, "registerRequestListener containerDataService == null");
        } else if (this.mRequestListener == null) {
            q4o q4oVar = new q4o(vziVar, this.mInfoFlowContext);
            this.mRequestListener = q4oVar;
            iContainerDataService.addRequestListener(q4oVar);
            fve.e(TAG, "registerRequestListener");
        }
    }

    private void registerUiRefreshListener(IContainerService<?> iContainerService, vzi vziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d48cd5", new Object[]{this, iContainerService, vziVar});
        } else if (iContainerService == null) {
            fve.e(TAG, "registerUiRefreshListener containerService == null");
        } else if (this.mUiRefreshListener == null) {
            c6v c6vVar = new c6v(vziVar, this.mInfoFlowContext);
            this.mUiRefreshListener = c6vVar;
            iContainerService.addUiRefreshListener(c6vVar);
            fve.e(TAG, "registerUiRefreshListener");
        }
    }

    private void unRegisterDataProcessListener(IContainerDataService<?> iContainerDataService) {
        zr6 zr6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a52c5e", new Object[]{this, iContainerDataService});
        } else if (iContainerDataService != null && (zr6Var = this.mDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(zr6Var);
            this.mDataProcessListener = null;
            fve.e(TAG, "unRegisterDataProcessListener");
        }
    }

    private void unRegisterDxItemClickListener(IDxItemClickService iDxItemClickService) {
        r28 r28Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441c6943", new Object[]{this, iDxItemClickService});
        } else if (iDxItemClickService != null && (r28Var = this.mDxItemClickListener) != null) {
            iDxItemClickService.removeDxItemClickListener(r28Var);
            this.mDxItemClickListener = null;
            fve.e(TAG, "unRegisterDxItemClickListener");
        }
    }

    private void unRegisterPageLifecycleListener(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a321b4e", new Object[]{this, iMainLifecycleService});
        } else if (iMainLifecycleService != null && this.mPageLifecycleListener != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifecycleListener);
            this.mPageLifecycleListener = null;
            fve.e(TAG, "unRegisterPageLifecycleListener");
        }
    }

    private void unRegisterRequestListener(IContainerDataService<?> iContainerDataService) {
        q4o q4oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b5d974", new Object[]{this, iContainerDataService});
        } else if (iContainerDataService != null && (q4oVar = this.mRequestListener) != null) {
            iContainerDataService.removeRequestListener(q4oVar);
            this.mRequestListener = null;
            fve.e(TAG, "unRegisterRequestListener");
        }
    }

    private void unRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ac7d0", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
        }
    }

    private void unRegisterUiRefreshListener(IContainerService<?> iContainerService) {
        c6v c6vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e39692", new Object[]{this, iContainerService});
        } else if (iContainerService != null && (c6vVar = this.mUiRefreshListener) != null) {
            iContainerService.removeUiRefreshListener(c6vVar);
            this.mUiRefreshListener = null;
            fve.e(TAG, "unRegisterUiRefreshListener");
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestListener(this.mContainerDataService);
        unRegisterDataProcessListener(this.mContainerDataService);
        unRegisterUiRefreshListener(this.mContainerService);
        unRegisterDxItemClickListener(this.mDxItemClickService);
        unRegisterPageLifecycleListener(this.mMainLifecycleService);
        unRegisterTabSelectListener();
        this.mContainerDataService = null;
        this.mContainerService = null;
        this.mDxItemClickService = null;
        this.mMainLifecycleService = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        } else if (!mve.a(ENABLE_OPEN_STABILITY_MONITOR, true)) {
            fve.e(TAG, "orange开关关闭");
        } else {
            this.mInfoFlowContext = cfcVar;
            this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
            this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
            this.mDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
            this.mMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
            vzi vziVar = new vzi(cfcVar);
            registerRequestListener(this.mContainerDataService, vziVar);
            registerDataProcessListener(this.mContainerDataService, vziVar);
            registerUiRefreshListener(this.mContainerService, vziVar);
            registerDxItemClickListener(this.mDxItemClickService, vziVar);
            registerPageLifecycleListener(this.mMainLifecycleService);
            initRegisterTabSelectListener(this.mInfoFlowContext);
        }
    }
}
