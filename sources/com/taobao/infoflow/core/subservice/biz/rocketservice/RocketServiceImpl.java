package com.taobao.infoflow.core.subservice.biz.rocketservice;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRecbotService;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.gue;
import tb.h6c;
import tb.hfo;
import tb.hue;
import tb.t2o;
import tb.ukd;
import tb.uve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RocketServiceImpl implements IRocketSubService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long REFRESH_DELAY_TIME = 150;
    private static final String TAG = "RocketServiceImpl";
    private cfc mInfoFlowContext;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private h6c<RecyclerView> mRegister;
    private List<IRocketSubService.a> mRocketListeners;
    private hfo mRocketOnScrollListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10658a;

        public a(String str) {
            this.f10658a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            uve.a(this.f10658a, 2101, "Page_Home_Button-rocket_refresh", "", "", null);
            RocketServiceImpl rocketServiceImpl = RocketServiceImpl.this;
            RocketServiceImpl.access$100(rocketServiceImpl, RocketServiceImpl.access$000(rocketServiceImpl));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IRocketSubService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b5feb20", new Object[]{this, new Boolean(z)});
                return;
            }
            RocketServiceImpl.access$200(RocketServiceImpl.this, z);
            RocketServiceImpl.access$300(RocketServiceImpl.this, z);
        }
    }

    static {
        t2o.a(486539574);
        t2o.a(488636600);
    }

    public static /* synthetic */ cfc access$000(RocketServiceImpl rocketServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("f28d66d", new Object[]{rocketServiceImpl});
        }
        return rocketServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$100(RocketServiceImpl rocketServiceImpl, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d9c764", new Object[]{rocketServiceImpl, cfcVar});
        } else {
            rocketServiceImpl.callRefresh(cfcVar);
        }
    }

    public static /* synthetic */ void access$200(RocketServiceImpl rocketServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e5c4f9", new Object[]{rocketServiceImpl, new Boolean(z)});
        } else {
            rocketServiceImpl.notifyHostRocketState(z);
        }
    }

    public static /* synthetic */ void access$300(RocketServiceImpl rocketServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95f1afa", new Object[]{rocketServiceImpl, new Boolean(z)});
        } else {
            rocketServiceImpl.notifyRocketStateChange(z);
        }
    }

    private void callRefresh(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("decb851c", new Object[]{this, cfcVar});
            return;
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null) {
            fve.e(TAG, "callRefresh hostService == null");
        } else {
            iHostService.getInvokeCallback().k().r();
        }
    }

    private IRocketSubService.a createOnRocketListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRocketSubService.a) ipChange.ipc$dispatch("a59ce3", new Object[]{this});
        }
        return new b();
    }

    private ukd getRocketCallback(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukd) ipChange.ipc$dispatch("25d455ed", new Object[]{this, cfcVar});
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null) {
            return null;
        }
        return iHostService.getInvokeCallback().e();
    }

    private void notifyHostRocketState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d620de1", new Object[]{this, new Boolean(z)});
            return;
        }
        ukd rocketCallback = getRocketCallback(this.mInfoFlowContext);
        if (rocketCallback != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            rocketCallback.setRocketState(z);
            fve.k(TAG, "setRocketState use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void notifyRocketStateChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f9a1c9", new Object[]{this, new Boolean(z)});
            return;
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list != null) {
            for (IRocketSubService.a aVar : list) {
                aVar.a(z);
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void addRocketListener(IRocketSubService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f45b987", new Object[]{this, aVar});
            return;
        }
        if (this.mRocketListeners == null) {
            this.mRocketListeners = new ArrayList();
        }
        this.mRocketListeners.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public int getRocketAnchorPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1cb17e2", new Object[]{this})).intValue();
        }
        return this.mRocketOnScrollListener.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        return this.mRocketOnScrollListener.f();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        IRecbotService iRecbotService = (IRecbotService) this.mInfoFlowContext.a(IRecbotService.class);
        if (iRecbotService == null || !iRecbotService.isRecbotRequesting()) {
            IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
            if (iMainFeedsViewService != null) {
                iMainFeedsViewService.scrollToTop();
            }
            String a2 = this.mInfoFlowContext.getContainerType().a();
            uve.a(a2, 2101, "Button-Top", "", "", null);
            gue.f(a2, "Button-Top", null, null);
            if (!isOnRocketState()) {
                uve.a(a2, 2101, "Page_Home_Button-rocket_refresh", "", "", null);
                callRefresh(this.mInfoFlowContext);
            }
            if (checkEnableRocketRefreshDirectly() && isOnRocketState()) {
                get.a().f(new a(a2), 150L);
            }
            hue.e(this.mInfoFlowContext);
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
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "onCreateService mainFeedsViewService == null");
            return;
        }
        this.mRocketOnScrollListener = new hfo(cfcVar, createOnRocketListener());
        h6c<RecyclerView> lifeCycleRegister = this.mMainFeedsViewService.getLifeCycleRegister();
        this.mRegister = lifeCycleRegister;
        lifeCycleRegister.h(this.mRocketOnScrollListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        hfo hfoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        h6c<RecyclerView> h6cVar = this.mRegister;
        if (!(h6cVar == null || (hfoVar = this.mRocketOnScrollListener) == null)) {
            h6cVar.v(hfoVar);
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void removeRocketListener(IRocketSubService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e16e8aa", new Object[]{this, aVar});
            return;
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list != null) {
            list.remove(aVar);
        }
    }

    private boolean checkEnableRocketRefreshDirectly() {
        IContainerDataService iContainerDataService;
        IContainerDataModel containerData;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af07e15d", new Object[]{this})).booleanValue();
        }
        try {
            cfc cfcVar = this.mInfoFlowContext;
            if (cfcVar == null || (iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class)) == null || (containerData = iContainerDataService.getContainerData()) == null || containerData.getBase() == null || (ext = containerData.getBase().getExt()) == null) {
                return false;
            }
            return TextUtils.equals("true", ext.getString("rocketDirectRefresh"));
        } catch (Exception e) {
            fve.e(TAG, "parser config failed" + Log.getStackTraceString(e));
            return false;
        }
    }
}
