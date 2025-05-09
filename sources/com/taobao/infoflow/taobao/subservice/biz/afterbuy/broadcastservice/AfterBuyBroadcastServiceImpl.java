package com.taobao.infoflow.taobao.subservice.biz.afterbuy.broadcastservice;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.appcompat.taobao.util.Globals;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyBroadcastService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.cfc;
import tb.h6c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyBroadcastServiceImpl implements IAfterBuyBroadcastService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AfterBuyBoardcastServiceImpl";
    private h6c.c feedsScrollListener;
    private cfc infoFlowContext;
    private Intent mIntent = new Intent("recyclerViewState");
    private int oldState;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (AfterBuyBroadcastServiceImpl.access$000(AfterBuyBroadcastServiceImpl.this) != i) {
                AfterBuyBroadcastServiceImpl.access$002(AfterBuyBroadcastServiceImpl.this, i);
                AfterBuyBroadcastServiceImpl.access$100(AfterBuyBroadcastServiceImpl.this).putExtra("recyclerViewState", i);
                LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(AfterBuyBroadcastServiceImpl.access$100(AfterBuyBroadcastServiceImpl.this));
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            }
        }
    }

    static {
        t2o.a(491782250);
        t2o.a(488636625);
    }

    public static /* synthetic */ int access$000(AfterBuyBroadcastServiceImpl afterBuyBroadcastServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9dc6b50", new Object[]{afterBuyBroadcastServiceImpl})).intValue();
        }
        return afterBuyBroadcastServiceImpl.oldState;
    }

    public static /* synthetic */ int access$002(AfterBuyBroadcastServiceImpl afterBuyBroadcastServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d48064f7", new Object[]{afterBuyBroadcastServiceImpl, new Integer(i)})).intValue();
        }
        afterBuyBroadcastServiceImpl.oldState = i;
        return i;
    }

    public static /* synthetic */ Intent access$100(AfterBuyBroadcastServiceImpl afterBuyBroadcastServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("643b64f5", new Object[]{afterBuyBroadcastServiceImpl});
        }
        return afterBuyBroadcastServiceImpl.mIntent;
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new a();
    }

    private void registerScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener == null && (iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class)) != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
            this.feedsScrollListener = createFeedsScrollListener;
            lifeCycleRegister.h(createFeedsScrollListener);
        }
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener != null && (iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class)) != null) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.infoFlowContext = cfcVar;
        registerScrollListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterScrollListener();
        }
    }
}
