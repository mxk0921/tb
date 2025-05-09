package com.taobao.infoflow.core.subservice.framework.container.mainfeeds;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;
import tb.a9c;
import tb.cfc;
import tb.cjn;
import tb.e6c;
import tb.fve;
import tb.g6c;
import tb.h6c;
import tb.iqb;
import tb.j93;
import tb.l69;
import tb.ove;
import tb.srn;
import tb.t2o;
import tb.urn;
import tb.vrn;
import tb.xm4;
import tb.xrn;
import tb.zn4;
import tb.zo2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MainFeedsViewServiceImpl implements IMainFeedsViewService<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainRecycleViewServiceImpl";
    private zo2 mBxUserTrackHandler;
    private cfc mInfoFlowContext;
    private vrn mNextPageHandler;
    private cjn mReachEdgeHandler;
    private srn mRecycleViewExposureHandler;
    private xrn mRecycleViewScrollHandler;
    private RecyclerView mRecyclerView;
    private final g6c<RecyclerView> mLifeCycleCenter = new urn();
    private final xm4 mContainerRegister = new xm4();
    private final ove mRecycleViewWidget = new ove();

    static {
        t2o.a(486539619);
        t2o.a(488636650);
    }

    private void checkAndAddDressUpCard(List<BaseSectionModel> list) {
        IDressUpHostService iDressUpHostService;
        List<BaseSectionModel> hostDataSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7a308", new Object[]{this, list});
        } else if (list != null && list.size() != 0 && !j93.a(list.get(0)) && (iDressUpHostService = (IDressUpHostService) this.mInfoFlowContext.a(IDressUpHostService.class)) != null && (hostDataSet = iDressUpHostService.getHostDataSet()) != null) {
            list.addAll(0, hostDataSet);
        }
    }

    private void destroyRecyclerViewHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230f3b53", new Object[]{this});
            return;
        }
        srn srnVar = this.mRecycleViewExposureHandler;
        if (srnVar != null) {
            srnVar.h();
        }
        zo2 zo2Var = this.mBxUserTrackHandler;
        if (zo2Var != null) {
            zo2Var.a();
        }
        vrn vrnVar = this.mNextPageHandler;
        if (vrnVar != null) {
            vrnVar.e();
        }
        cjn cjnVar = this.mReachEdgeHandler;
        if (cjnVar != null) {
            cjnVar.c();
        }
        xrn xrnVar = this.mRecycleViewScrollHandler;
        if (xrnVar != null) {
            xrnVar.a();
        }
    }

    private void initRecyclerViewHandler(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1336f83a", new Object[]{this, cfcVar, h6cVar});
            return;
        }
        this.mRecycleViewExposureHandler = new srn(cfcVar, h6cVar);
        this.mBxUserTrackHandler = new zo2(cfcVar, h6cVar);
        this.mNextPageHandler = new vrn(cfcVar, h6cVar);
        this.mReachEdgeHandler = new cjn(cfcVar, h6cVar);
        this.mRecycleViewScrollHandler = new xrn(cfcVar, h6cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.mContainerRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        fve.e(TAG, "destroyContainer");
        this.mRecycleViewWidget.f();
        this.mRecyclerView = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void dispatchWindowVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fad3120", new Object[]{this, new Integer(i)});
            return;
        }
        if (4 == i) {
            forceExposure();
        }
        this.mRecycleViewWidget.g(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int findBottomPosition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fc47b8", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        return this.mRecycleViewWidget.h(i, z);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public BaseSectionModel<?> findItemDataByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("a400b778", new Object[]{this, new Integer(i)});
        }
        return this.mRecycleViewWidget.i(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public View findItemViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a245f2cd", new Object[]{this, new Integer(i)});
        }
        return this.mRecycleViewWidget.j(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int findTopPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5c5e04a", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mRecycleViewWidget.k(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void forceExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89fc99", new Object[]{this});
            return;
        }
        srn srnVar = this.mRecycleViewExposureHandler;
        if (srnVar != null) {
            srnVar.i(this.mRecyclerView);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getInfoFlowColumn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19f342e2", new Object[]{this})).intValue();
        }
        return this.mRecycleViewWidget.m();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.mRecycleViewWidget.n();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int[] getItemViewHeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1828e97f", new Object[]{this});
        }
        return this.mRecycleViewWidget.o();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int getPositionBySectionBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a1e8bb5", new Object[]{this, str})).intValue();
        }
        return this.mRecycleViewWidget.p(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService, tb.sdb
    public int getVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89715f46", new Object[]{this})).intValue();
        }
        return this.mRecycleViewWidget.q();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public double getViewExposureRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99ec6901", new Object[]{this, new Integer(i)})).doubleValue();
        }
        return this.mRecycleViewWidget.r(i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public int[] getVisiblePositionRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("67b2b985", new Object[]{this});
        }
        return this.mRecycleViewWidget.s();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService, tb.sdb
    public boolean isInterceptTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214f872", new Object[]{this})).booleanValue();
        }
        return this.mRecycleViewWidget.w();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public boolean isReachTopEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862a0214", new Object[]{this})).booleanValue();
        }
        return this.mRecycleViewWidget.x();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public boolean isRecyclerViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214d20c5", new Object[]{this})).booleanValue();
        }
        if (this.mRecyclerView != null) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mRecycleViewWidget.t(cfcVar, this.mLifeCycleCenter);
        initRecyclerViewHandler(this.mInfoFlowContext, this.mLifeCycleCenter);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        destroyContainer();
        destroyRecyclerViewHandler();
        this.mLifeCycleCenter.destroy();
        this.mContainerRegister.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void reloadUi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21284014", new Object[]{this});
        } else {
            this.mRecycleViewWidget.B();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.mContainerRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void resetErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
        } else {
            this.mRecycleViewWidget.C();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            this.mRecycleViewWidget.E(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRecycleViewWidget.F(i, i2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void scrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
        } else {
            this.mRecycleViewWidget.G();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setGestureDetectorCallback(a9c a9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc355c2", new Object[]{this, a9cVar});
        } else {
            this.mRecycleViewWidget.I(a9cVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setInfoFlowColumn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ba4d68", new Object[]{this, new Integer(i)});
        } else {
            this.mRecycleViewWidget.J(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setInitConfig(l69 l69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188ef6cb", new Object[]{this, l69Var});
        } else {
            this.mRecycleViewWidget.H(l69Var);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecycleViewWidget.L(z);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void smoothScrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7153a0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRecycleViewWidget.U(i, i2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else {
            this.mRecycleViewWidget.V();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void uiRefresh(List<BaseSectionModel> list, e6c e6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92140999", new Object[]{this, list, e6cVar});
            return;
        }
        if (zn4.c(this.mInfoFlowContext.getContainerType().getContainerId())) {
            checkAndAddDressUpCard(list);
        }
        this.mRecycleViewWidget.W(list, e6cVar);
        this.mRecycleViewWidget.u();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public void updateItem(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0ea5cb", new Object[]{this, baseSectionModel});
        } else {
            this.mRecycleViewWidget.a0(baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService, tb.iqb
    public RecyclerView createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef262b83", new Object[]{this, context});
        }
        fve.e(TAG, "createContainer");
        if (this.mRecyclerView != null) {
            fve.e(TAG, "重复调用createContainer，请先销毁再创建！！！！");
        }
        this.mContainerRegister.c(context);
        this.mRecyclerView = this.mRecycleViewWidget.c(context);
        this.mContainerRegister.d();
        return this.mRecyclerView;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public g6c<RecyclerView> getLifeCycleRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g6c) ipChange.ipc$dispatch("bd2cbf1d", new Object[]{this}) : this.mLifeCycleCenter;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService
    public RecyclerView getOriginalView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("ef46b37a", new Object[]{this}) : this.mRecyclerView;
    }
}
