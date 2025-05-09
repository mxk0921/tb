package com.taobao.infoflow.protocol.subservice.framework;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;
import tb.a9c;
import tb.e6c;
import tb.h6c;
import tb.iqb;
import tb.l69;
import tb.sdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IMainFeedsViewService<V extends ViewGroup> extends ISubService, iqb<V>, sdb {
    public static final String SERVICE_NAME = "MainRecycleViewService";

    /* synthetic */ void addOnContainerListener(iqb.a aVar);

    /* synthetic */ ViewGroup createContainer(Context context);

    /* synthetic */ void destroyContainer();

    void dispatchWindowVisibility(int i);

    int findBottomPosition(int i, boolean z);

    BaseSectionModel<?> findItemDataByPosition(int i);

    View findItemViewByPosition(int i);

    int findTopPosition(int i);

    void forceExposure();

    int getInfoFlowColumn();

    int getItemCount();

    int[] getItemViewHeights();

    h6c getLifeCycleRegister();

    @Deprecated
    V getOriginalView();

    int getPositionBySectionBizCode(String str);

    /* synthetic */ int getVerticalScrollOffset();

    double getViewExposureRatio(int i);

    int[] getVisiblePositionRange();

    /* synthetic */ boolean isInterceptTouch();

    boolean isReachTopEdge();

    boolean isRecyclerViewCreated();

    void reloadUi();

    /* synthetic */ void removeOnContainerListener(iqb.a aVar);

    void resetErrorView();

    void scrollToPosition(int i);

    void scrollToPositionWithOffset(int i, int i2);

    void scrollToTop();

    void setGestureDetectorCallback(a9c a9cVar);

    void setInfoFlowColumn(int i);

    @Deprecated
    void setInitConfig(l69 l69Var);

    void setScrollEnabled(boolean z);

    void smoothScrollToPositionWithOffset(int i, int i2);

    void stopScroll();

    void uiRefresh(List<BaseSectionModel> list, e6c e6cVar);

    void updateItem(BaseSectionModel baseSectionModel);
}
