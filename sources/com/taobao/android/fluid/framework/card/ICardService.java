package com.taobao.android.fluid.framework.card;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;
import java.util.Set;
import tb.ar9;
import tb.b93;
import tb.kep;
import tb.uq9;
import tb.vlb;
import tb.wlb;
import tb.xlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ICardService extends FluidService, xlb {
    public static final String SERVICE_NAME = "ICardService";
    public static final ar9 WEEX_REMOVE_TIMEOUT_CALLBACKS_ERROR = new ar9("CARD-1", "Weex 移除超时任务回调失败");
    public static final ar9 WEEX_INSTANCE_CREATE_VIEW_ERROR = new ar9("CARD-2", "Weex 创建 View 失败");

    /* synthetic */ void addCardLifecycleListener(wlb.a aVar);

    /* synthetic */ void addCardLifecycleListener(wlb wlbVar);

    void addNotifyCardHealthyChangeListener(vlb vlbVar);

    uq9 getActiveCard();

    a.d getActiveCardMediaDetail();

    a getActiveCardMediaSetData();

    long getCardPrivateViewForegroundTime();

    b93 getConfig();

    int getCurrentActiveCellPosition();

    Set<String> getOfflineLiveIdList();

    /* synthetic */ kep getSessionIdRecorder();

    /* synthetic */ void incrementSessionId(a aVar, boolean z);

    void notifyCardHealthyChange(uq9 uq9Var, int i);

    /* synthetic */ void onActive(uq9 uq9Var);

    /* synthetic */ void onAppear(uq9 uq9Var);

    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i);

    /* synthetic */ void onBindData(uq9 uq9Var, a aVar, int i, List list);

    /* synthetic */ void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder);

    /* synthetic */ void onDisActive(uq9 uq9Var);

    /* synthetic */ void onDisAppear(uq9 uq9Var);

    /* synthetic */ void onRecycle(uq9 uq9Var);

    /* synthetic */ void onWillActive(uq9 uq9Var);

    /* synthetic */ void onWillDisActive(uq9 uq9Var);

    /* synthetic */ void removeCardLifecycleListener(wlb.a aVar);

    /* synthetic */ void removeCardLifecycleListener(wlb wlbVar);

    void setActiveCard(uq9 uq9Var);

    void setCardPrivateViewForegroundTime(long j);

    void setCurrentActiveCellPosition(int i);
}
