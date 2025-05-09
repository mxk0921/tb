package com.taobao.android.fluid.framework.card;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.b93;
import tb.ir9;
import tb.kep;
import tb.m83;
import tb.oep;
import tb.olk;
import tb.t2o;
import tb.uq9;
import tb.vlb;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CardService implements ICardService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_PREFIX = "[Card Lifecycle]卡片：";
    private static final String TAG = "CardService";
    private uq9 mActiveCard;
    private final m83 mCardLifecycleManager;
    private long mCardPrivateViewForegroundTime;
    private int mCurrentActiveCellPosition;
    private final FluidContext mFluidContext;
    private final oep mSessionManager;
    private final Set<String> mOfflineLiveIdList = new HashSet();
    private olk<vlb> mCardHealthyChangeListeners = new olk<>();
    private final b93 mCardServiceConfig = new b93();

    static {
        t2o.a(468713880);
        t2o.a(468713881);
    }

    public CardService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mCardLifecycleManager = new m83(fluidContext);
        this.mSessionManager = new oep(fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void addCardLifecycleListener(wlb wlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf7f2f9", new Object[]{this, wlbVar});
        } else {
            this.mCardLifecycleManager.addCardLifecycleListener(wlbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void addNotifyCardHealthyChangeListener(vlb vlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e4038d", new Object[]{this, vlbVar});
        } else if (vlbVar != null) {
            this.mCardHealthyChangeListeners.a(vlbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public uq9 getActiveCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("934fc714", new Object[]{this});
        }
        return this.mActiveCard;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public a.d getActiveCardMediaDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("ffcb1ab0", new Object[]{this});
        }
        uq9 activeCard = getActiveCard();
        if (activeCard == null) {
            return null;
        }
        return activeCard.Y();
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public a getActiveCardMediaSetData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b6baa6d6", new Object[]{this});
        }
        uq9 activeCard = getActiveCard();
        if (activeCard == null) {
            return null;
        }
        return activeCard.Z();
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public long getCardPrivateViewForegroundTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1367ba2d", new Object[]{this})).longValue();
        }
        return this.mCardPrivateViewForegroundTime;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public b93 getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b93) ipChange.ipc$dispatch("1349fc16", new Object[]{this});
        }
        return this.mCardServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public int getCurrentActiveCellPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6ef33ee", new Object[]{this})).intValue();
        }
        return this.mCurrentActiveCellPosition;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public Set<String> getOfflineLiveIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("555fa9a8", new Object[]{this});
        }
        return this.mOfflineLiveIdList;
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public kep getSessionIdRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kep) ipChange.ipc$dispatch("bc01248d", new Object[]{this});
        }
        return this.mSessionManager.b();
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void incrementSessionId(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b856550", new Object[]{this, aVar, new Boolean(z)});
        } else {
            this.mSessionManager.c(aVar, z);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void notifyCardHealthyChange(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071a137", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        for (vlb vlbVar : this.mCardHealthyChangeListeners.b()) {
            try {
                vlbVar.onCardHealthyChange(uq9Var, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, vlbVar, "onCardHealthyChange", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onActive 回调");
        this.mCardLifecycleManager.onActive(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onAppear 回调");
        this.mCardLifecycleManager.onAppear(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onBindData 回调");
        this.mCardLifecycleManager.onBindData(uq9Var, aVar, i);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onCreateView 回调");
        this.mCardLifecycleManager.onCreateView(uq9Var, recyclerViewHolder);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onDisActive 回调");
        this.mCardLifecycleManager.onDisActive(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onDisAppear 回调");
        this.mCardLifecycleManager.onDisAppear(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onRecycle 回调");
        this.mCardLifecycleManager.onRecycle(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onWillActive 回调");
        this.mCardLifecycleManager.onWillActive(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onWillDisActive 回调");
        this.mCardLifecycleManager.onWillDisActive(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void removeCardLifecycleListener(wlb wlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564859c", new Object[]{this, wlbVar});
        } else {
            this.mCardLifecycleManager.removeCardLifecycleListener(wlbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setActiveCard(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b2d950", new Object[]{this, uq9Var});
            return;
        }
        this.mActiveCard = uq9Var;
        ir9.b(TAG, "当前 Active 卡片更新: " + uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setCardPrivateViewForegroundTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456dedb7", new Object[]{this, new Long(j)});
        } else {
            this.mCardPrivateViewForegroundTime = j;
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void setCurrentActiveCellPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed148e74", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentActiveCellPosition = i;
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void addCardLifecycleListener(wlb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4c978e", new Object[]{this, aVar});
        } else {
            this.mCardLifecycleManager.addCardLifecycleListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService
    public void removeCardLifecycleListener(wlb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799d731", new Object[]{this, aVar});
        } else {
            this.mCardLifecycleManager.removeCardLifecycleListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.card.ICardService, tb.xlb, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            return;
        }
        ir9.b(TAG, LOG_PREFIX + uq9Var + "触发 onBindData payloads 回调");
        this.mCardLifecycleManager.onBindData(uq9Var, aVar, i, list);
    }
}
