package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a18;
import tb.ao4;
import tb.cfc;
import tb.cve;
import tb.eue;
import tb.fve;
import tb.h6c;
import tb.mve;
import tb.t2o;
import tb.ul2;
import tb.y30;
import tb.y9w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VideoPlayControllerServiceImpl implements IVideoPlayControllerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoPlayControllerServiceImpl";
    private ul2 mBroadcastRegister;
    private List<IVideoPlayControllerService.a> mCheckExecutePlayListeners;
    private IContainerDataService<?> mContainerDataService;
    private cfc mInfoFlowContext;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private IPullSecondFloorService mPullSecondFloorService;
    private y30 mVideoPlayController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IVideoPlayControllerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd8e2aa7", new Object[]{this});
            } else if (VideoPlayControllerServiceImpl.access$000(VideoPlayControllerServiceImpl.this) != null) {
                for (IVideoPlayControllerService.a aVar : VideoPlayControllerServiceImpl.access$000(VideoPlayControllerServiceImpl.this)) {
                    aVar.a();
                }
            }
        }
    }

    static {
        t2o.a(491782752);
        t2o.a(488636616);
    }

    public static /* synthetic */ List access$000(VideoPlayControllerServiceImpl videoPlayControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("301b01b7", new Object[]{videoPlayControllerServiceImpl});
        }
        return videoPlayControllerServiceImpl.mCheckExecutePlayListeners;
    }

    private IVideoPlayControllerService.a createCheckExecutePlayListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVideoPlayControllerService.a) ipChange.ipc$dispatch("c2bf537b", new Object[]{this});
        }
        return new a();
    }

    private void registerDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addDataProcessListener(this.mVideoPlayController);
        }
    }

    private void registerFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b860d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            lifeCycleRegister.Q(this.mVideoPlayController);
            lifeCycleRegister.y(this.mVideoPlayController);
            lifeCycleRegister.h(this.mVideoPlayController);
            lifeCycleRegister.x(this.mVideoPlayController);
            lifeCycleRegister.M(this.mVideoPlayController);
        }
    }

    private void registerPullDownListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44fe0a5", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.mPullSecondFloorService;
        if (iPullSecondFloorService != null) {
            iPullSecondFloorService.addLifeCycleListener(this.mVideoPlayController);
        }
    }

    private void unRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.mVideoPlayController);
        }
    }

    private void unRegisterFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a04574", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            lifeCycleRegister.o(this.mVideoPlayController);
            lifeCycleRegister.q(this.mVideoPlayController);
            lifeCycleRegister.v(this.mVideoPlayController);
            lifeCycleRegister.n(this.mVideoPlayController);
            lifeCycleRegister.k(this.mVideoPlayController);
        }
    }

    private void unRegisterPullDownListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96d93de", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.mPullSecondFloorService;
        if (iPullSecondFloorService != null) {
            iPullSecondFloorService.removeLifeCycleListener(this.mVideoPlayController);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void addCheckExecutePlayListener(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbe5256", new Object[]{this, aVar});
            return;
        }
        if (this.mCheckExecutePlayListeners == null) {
            this.mCheckExecutePlayListeners = new CopyOnWriteArrayList();
        }
        this.mCheckExecutePlayListeners.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void forceInsertToQueueHeader(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb734153", new Object[]{this, str, new Integer(i)});
            return;
        }
        y30 y30Var = this.mVideoPlayController;
        if (y30Var != null) {
            y30Var.u(str, i);
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
        this.mVideoPlayController = new y9w(cfcVar, createCheckExecutePlayListener());
        this.mMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        registerFeedsListener();
        this.mPullSecondFloorService = (IPullSecondFloorService) cfcVar.a(IPullSecondFloorService.class);
        registerPullDownListener();
        this.mContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        registerDataListener();
        if (cve.a()) {
            ul2 ul2Var = new ul2();
            this.mBroadcastRegister = ul2Var;
            ul2Var.b();
            this.mBroadcastRegister.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterFeedsListener();
        unRegisterPullDownListener();
        unRegisterDataListener();
        if (this.mBroadcastRegister == null || !cve.a()) {
            a18.e().d();
        } else {
            this.mBroadcastRegister.c();
            this.mBroadcastRegister.d();
        }
        y30 y30Var = this.mVideoPlayController;
        if (y30Var != null) {
            y30Var.w();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void removeCheckExecutePlayListener(IVideoPlayControllerService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aafa13", new Object[]{this, aVar});
            return;
        }
        List<IVideoPlayControllerService.a> list = this.mCheckExecutePlayListeners;
        if (list != null && aVar != null) {
            list.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void triggerVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbaed86", new Object[]{this});
            return;
        }
        y30 y30Var = this.mVideoPlayController;
        if (y30Var != null) {
            y30Var.B(false);
            this.mVideoPlayController.C();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (ao4.a(this.mInfoFlowContext.getContainerType().getContainerId()) && !mve.a("enableAfterBuyNewPlayControl", false)) {
            return false;
        }
        y30 y30Var = this.mVideoPlayController;
        if (y30Var != null) {
            return y30Var.v();
        }
        fve.e(TAG, "isEnable， 时序出现问题，请检查服务配置！");
        if (!eue.b()) {
            return false;
        }
        throw new InfoFlowRuntimeException("PlayControllerService, 时序出现问题，请检查服务配置！");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void triggerVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef426e4c", new Object[]{this});
            return;
        }
        y30 y30Var = this.mVideoPlayController;
        if (y30Var != null) {
            y30Var.B(true);
            this.mVideoPlayController.y();
        }
    }
}
