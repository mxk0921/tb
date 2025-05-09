package com.taobao.android.fluid.framework.preload.cardwarmup;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import java.util.List;
import tb.az9;
import tb.eps;
import tb.fsp;
import tb.ir9;
import tb.j0q;
import tb.mkc;
import tb.mxw;
import tb.nkc;
import tb.r87;
import tb.sz3;
import tb.t2o;
import tb.tzv;
import tb.uq9;
import tb.vlb;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CardWarmUpService implements ICardWarmUpService, nkc, vlb, mkc, wlb, j0q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CardWarmUpService";
    private static final int sNotifyRange = 10;
    private ICardService mCardService;
    private IDataService mDataService;
    private IFeedsListService mFeedListService;
    private final FluidContext mFluidContext;
    private int mLastCardHealthyLevel;
    private int mLastCardWarmUpPos;
    private WarmUpReason mLastCardWarmUpReason;
    private int mLastListSpeedLevel;
    private List<com.taobao.android.fluid.framework.data.datamodel.a> mMediaSetDataList;
    private int mLastDirection = 1;
    private boolean mIsInCancel = true;
    private int mPendingTriggerCardBindPos = -1;
    private a mTriggerCardBindHandler = new a();
    private int mCardBindDelayWhenActive = eps.l();
    private int mCardBindDelayWhenDataAdded = eps.m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714646);
        }

        public a() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/cardwarmup/CardWarmUpService$TriggerCardBindHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                int i = message.what;
                if (CardWarmUpService.access$000(CardWarmUpService.this, i)) {
                    RecyclerView.Recycler recycler = CardWarmUpService.access$100(CardWarmUpService.this).getRecyclerView().getRecycler();
                    View viewForPosition = recycler.getViewForPosition(i);
                    if (viewForPosition != null) {
                        recycler.recycleView(viewForPosition);
                    }
                } else if (CardWarmUpService.access$100(CardWarmUpService.this).getRecyclerView().getScrollState() == 0) {
                    az9.v();
                } else {
                    az9.h();
                }
            } catch (Exception e) {
                ir9.c(CardWarmUpService.TAG, "triggerCardBind", e);
            }
        }
    }

    static {
        t2o.a(468714645);
        t2o.a(468714647);
        t2o.a(468714487);
        t2o.a(468714123);
        t2o.a(468714178);
        t2o.a(468713934);
        t2o.a(468714141);
    }

    public CardWarmUpService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ boolean access$000(CardWarmUpService cardWarmUpService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa5bce72", new Object[]{cardWarmUpService, new Integer(i)})).booleanValue();
        }
        return cardWarmUpService.checkCardBindValid(i);
    }

    public static /* synthetic */ IFeedsListService access$100(CardWarmUpService cardWarmUpService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFeedsListService) ipChange.ipc$dispatch("5bc2c22", new Object[]{cardWarmUpService});
        }
        return cardWarmUpService.mFeedListService;
    }

    private tzv buildVCard(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzv) ipChange.ipc$dispatch("56f52be4", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        if (aVar.j(0) != 0) {
            return new r87(this.mFluidContext, aVar);
        }
        return new fsp(this.mFluidContext, aVar);
    }

    private boolean checkCardBindValid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60bb3f59", new Object[]{this, new Integer(i)})).booleanValue();
        }
        MultiRecyclerViewAdapter mediaCardListAdapter = this.mFeedListService.getMediaCardListAdapter();
        LockableRecycerView recyclerView = this.mFeedListService.getRecyclerView();
        if (!(mediaCardListAdapter == null || recyclerView == null || recyclerView.getRecycler() == null)) {
            int min = Math.min(mediaCardListAdapter.getItemCount(), this.mMediaSetDataList.size());
            if (i > 0 && i < min) {
                return !this.mMediaSetDataList.get(i).n().v();
            }
        }
        return false;
    }

    private void notifyCancelWarmup(int i) {
        com.taobao.android.fluid.framework.data.datamodel.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3166459", new Object[]{this, new Integer(i)});
        } else if (!this.mIsInCancel) {
            this.mIsInCancel = true;
            if (eps.b()) {
                for (int i2 = i - 10; i2 <= i + 10; i2++) {
                    if (i2 > 0 && i2 < this.mMediaSetDataList.size() && (aVar = this.mMediaSetDataList.get(i2)) != null) {
                        sureVCard(aVar);
                        aVar.n().l();
                    }
                }
            }
        }
    }

    private void notifyCardWarmup(int i, WarmUpReason warmUpReason) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256190fe", new Object[]{this, new Integer(i), warmUpReason});
            return;
        }
        this.mLastCardWarmUpPos = i;
        this.mLastCardWarmUpReason = warmUpReason;
        if (eps.b() && !this.mIsInCancel && !sz3.a(this.mMediaSetDataList)) {
            if (this.mLastDirection == -1) {
                i3 = Math.max(0, i - 10);
                i2 = Math.min(this.mMediaSetDataList.size() - 1, i);
            } else {
                i3 = Math.max(0, i);
                i2 = Math.min(this.mMediaSetDataList.size() - 1, i + 10);
            }
            mxw mxwVar = new mxw(this.mLastCardHealthyLevel, this.mLastListSpeedLevel);
            while (i3 <= i2) {
                com.taobao.android.fluid.framework.data.datamodel.a aVar = this.mMediaSetDataList.get(i3);
                if (aVar != null) {
                    sureVCard(aVar);
                    if (eps.b()) {
                        aVar.n().m(i3, Math.abs(i - i3), warmUpReason, mxwVar);
                    }
                }
                i3++;
            }
        }
    }

    private void sureVCard(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9045473", new Object[]{this, aVar});
        } else if (aVar != null && aVar.n() == null) {
            aVar.q(buildVCard(aVar));
        }
    }

    private tzv sureVCardOfFluidCard(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzv) ipChange.ipc$dispatch("c4a504d4", new Object[]{this, uq9Var});
        }
        if (uq9Var == null || uq9Var.Z() == null) {
            return null;
        }
        if (uq9Var.d0() == null) {
            sureVCard(uq9Var.Z());
        }
        return uq9Var.Z().n();
    }

    private void triggerCardBind(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f37a4ac", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MultiRecyclerViewAdapter mediaCardListAdapter = this.mFeedListService.getMediaCardListAdapter();
        LockableRecycerView recyclerView = this.mFeedListService.getRecyclerView();
        if (mediaCardListAdapter != null && recyclerView != null && recyclerView.getRecycler() != null) {
            int min = Math.min(mediaCardListAdapter.getItemCount(), this.mMediaSetDataList.size());
            if (i <= 0) {
                return;
            }
            if (i < min) {
                this.mTriggerCardBindHandler.sendMessageDelayed(Message.obtain(this.mTriggerCardBindHandler, i), i2);
            } else {
                this.mPendingTriggerCardBindPos = i;
            }
        }
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        sureVCardOfFluidCard(uq9Var).onActive(uq9Var);
        if (eps.a(this.mFluidContext) && this.mLastDirection == 1) {
            triggerCardBind(uq9Var.M() + 1, this.mCardBindDelayWhenActive);
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onAppear(uq9Var);
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        } else {
            sureVCardOfFluidCard(uq9Var).onBindData(uq9Var, aVar, i);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        IFeedsListService iFeedsListService = (IFeedsListService) this.mFluidContext.getService(IFeedsListService.class);
        this.mFeedListService = iFeedsListService;
        iFeedsListService.addListSpeedChangeListener(this);
        ICardService iCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mCardService = iCardService;
        iCardService.addNotifyCardHealthyChangeListener(this);
        this.mCardService.addCardLifecycleListener(this);
        IDataService iDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        this.mDataService = iDataService;
        iDataService.addListDataChangeListener(this);
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).addSizedChangeListener(this);
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else {
            sureVCardOfFluidCard(uq9Var).onCreateView(uq9Var, recyclerViewHolder);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        notifyCancelWarmup(this.mLastCardWarmUpPos);
        this.mTriggerCardBindHandler.removeCallbacksAndMessages(null);
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onDisActive(uq9Var);
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onDisAppear(uq9Var);
        }
    }

    @Override // tb.mkc
    public void onListDataAdd(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddce9d32", new Object[]{this, list});
        } else if (list != null) {
            for (com.taobao.android.fluid.framework.data.datamodel.a aVar : list) {
                if (aVar != null && aVar.n() == null) {
                    sureVCard(aVar);
                }
            }
            if (eps.a(this.mFluidContext)) {
                triggerCardBind(this.mPendingTriggerCardBindPos, this.mCardBindDelayWhenDataAdded);
                this.mPendingTriggerCardBindPos = -1;
            }
        }
    }

    @Override // tb.mkc
    public void onListDataChange(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cd90ef", new Object[]{this, list});
            return;
        }
        this.mMediaSetDataList = list;
        if (!this.mIsInCancel) {
            notifyCardWarmup(this.mLastCardWarmUpPos, this.mLastCardWarmUpReason);
        }
    }

    @Override // tb.nkc
    public void onListSpeedChange(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d853402", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ir9.b(TAG, "onListSpeedChange:" + i2 + " => " + i + " => " + i3);
        this.mLastListSpeedLevel = i;
        this.mLastDirection = i3;
        notifyCardWarmup(i2, WarmUpReason.LIST_SPEED);
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onRecycle(uq9Var);
        }
    }

    @Override // tb.j0q
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> list = this.mMediaSetDataList;
        if (list != null) {
            for (com.taobao.android.fluid.framework.data.datamodel.a aVar : list) {
                if (aVar != null && (aVar.n() instanceof fsp)) {
                    ((fsp) aVar.n()).U(null);
                }
            }
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onWillActive(uq9Var);
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        } else {
            sureVCardOfFluidCard(uq9Var).onWillDisActive(uq9Var);
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        } else {
            sureVCardOfFluidCard(uq9Var).onBindData(uq9Var, aVar, i, list);
        }
    }

    @Override // tb.vlb
    public void onCardHealthyChange(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16b40cd", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        ir9.b(TAG, "onCardHealthyChange:" + uq9Var.M() + " => " + i);
        this.mLastCardHealthyLevel = i;
        if (i == -1) {
            notifyCancelWarmup(uq9Var.M());
            return;
        }
        this.mIsInCancel = false;
        notifyCardWarmup(uq9Var.M(), WarmUpReason.HEALTHY);
    }
}
