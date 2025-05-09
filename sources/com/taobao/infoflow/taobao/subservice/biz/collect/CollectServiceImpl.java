package com.taobao.infoflow.taobao.subservice.biz.collect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.ICollectService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.Globals;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.h6c;
import tb.h6d;
import tb.j18;
import tb.l6d;
import tb.lr8;
import tb.m47;
import tb.oii;
import tb.sgc;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CollectServiceImpl implements ICollectService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COLLECT_STATUS = "collectStatus";
    public static final String TAG = "CollectService";
    public static final String USERID_COLLECT_VIEW = "collectView";
    private boolean hasCollectChange = false;
    private boolean isResume = false;
    private IDxItemRenderService mDxItemRenderService;
    private IMainFeedsViewService mainFeedsViewService;
    private IMainLifecycleService mainLifecycleService;
    private sgc.b onItemRenderListener;
    private h6d pageLifeCycle;
    private TBFavoriteStatusChangedReceiver receiver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class TBFavoriteStatusChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782310);
        }

        public TBFavoriteStatusChangedReceiver() {
        }

        public static /* synthetic */ Object ipc$super(TBFavoriteStatusChangedReceiver tBFavoriteStatusChangedReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/collect/CollectServiceImpl$TBFavoriteStatusChangedReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !CollectServiceImpl.access$100(CollectServiceImpl.this) && TextUtils.equals(intent.getAction(), "TBFavoriteStatusChanged")) {
                CollectServiceImpl.access$202(CollectServiceImpl.this, true);
            }
        }

        public /* synthetic */ TBFavoriteStatusChangedReceiver(CollectServiceImpl collectServiceImpl, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/collect/CollectServiceImpl$1");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                CollectServiceImpl.access$102(CollectServiceImpl.this, false);
            }
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            CollectServiceImpl.access$102(CollectServiceImpl.this, true);
            if (CollectServiceImpl.access$200(CollectServiceImpl.this)) {
                CollectServiceImpl.access$202(CollectServiceImpl.this, false);
                if (CollectServiceImpl.access$300(CollectServiceImpl.this) != null) {
                    int[] visiblePositionRange = CollectServiceImpl.access$300(CollectServiceImpl.this).getVisiblePositionRange();
                    if (visiblePositionRange == null || visiblePositionRange.length != 2) {
                        fve.e("CollectService", "findOnScreenViews visiblePositionRange error");
                        return;
                    }
                    int i = visiblePositionRange[1];
                    for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
                        if (CollectServiceImpl.access$400(CollectServiceImpl.this, CollectServiceImpl.access$300(CollectServiceImpl.this).findItemDataByPosition(i2))) {
                            z = true;
                        }
                    }
                    if (z) {
                        CollectServiceImpl.access$500(CollectServiceImpl.this);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (CollectServiceImpl.access$600(CollectServiceImpl.this) != null) {
                CollectServiceImpl.access$600(CollectServiceImpl.this).reset();
            }
            if (CollectServiceImpl.access$300(CollectServiceImpl.this) != null) {
                CollectServiceImpl.access$300(CollectServiceImpl.this).reloadUi();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            } else {
                CollectServiceImpl.access$400(CollectServiceImpl.this, baseSectionModel);
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }
    }

    static {
        t2o.a(491782306);
        t2o.a(488636547);
    }

    public static /* synthetic */ boolean access$100(CollectServiceImpl collectServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("997efc46", new Object[]{collectServiceImpl})).booleanValue();
        }
        return collectServiceImpl.isResume;
    }

    public static /* synthetic */ boolean access$102(CollectServiceImpl collectServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a8f9994", new Object[]{collectServiceImpl, new Boolean(z)})).booleanValue();
        }
        collectServiceImpl.isResume = z;
        return z;
    }

    public static /* synthetic */ boolean access$200(CollectServiceImpl collectServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a4d7ac7", new Object[]{collectServiceImpl})).booleanValue();
        }
        return collectServiceImpl.hasCollectChange;
    }

    public static /* synthetic */ boolean access$202(CollectServiceImpl collectServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3390eb33", new Object[]{collectServiceImpl, new Boolean(z)})).booleanValue();
        }
        collectServiceImpl.hasCollectChange = z;
        return z;
    }

    public static /* synthetic */ IMainFeedsViewService access$300(CollectServiceImpl collectServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("f07b8f6c", new Object[]{collectServiceImpl});
        }
        return collectServiceImpl.mainFeedsViewService;
    }

    public static /* synthetic */ boolean access$400(CollectServiceImpl collectServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fe25a91", new Object[]{collectServiceImpl, baseSectionModel})).booleanValue();
        }
        return collectServiceImpl.checkCollectStatusAndUpdate(baseSectionModel);
    }

    public static /* synthetic */ void access$500(CollectServiceImpl collectServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb8f646", new Object[]{collectServiceImpl});
        } else {
            collectServiceImpl.reloadUI();
        }
    }

    public static /* synthetic */ IDxItemRenderService access$600(CollectServiceImpl collectServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemRenderService) ipChange.ipc$dispatch("f001e7ce", new Object[]{collectServiceImpl});
        }
        return collectServiceImpl.mDxItemRenderService;
    }

    private boolean checkCollectStatusAndUpdate(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fcdb49f", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        String str = (String) lr8.b("item.collect.content.itemId", baseSectionModel);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = j18.b(baseSectionModel, KEY_COLLECT_STATUS);
        if (TextUtils.isEmpty(b2)) {
            b2 = "false";
        }
        tao<Boolean, ErrorResult> g = oii.c().g(str, "ITEM");
        if (g == null || g.c() == null) {
            return false;
        }
        String valueOf = String.valueOf(g.c());
        boolean equals = TextUtils.equals(b2, valueOf);
        boolean z = true ^ equals;
        if (!equals) {
            j18.f(baseSectionModel, KEY_COLLECT_STATUS, valueOf);
        }
        return z;
    }

    private sgc.b createItemLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("1c8e7662", new Object[]{this});
        }
        return new c();
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new a();
    }

    private void reloadUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f654ff4", new Object[]{this});
        } else {
            get.a().h(new b());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mDxItemRenderService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            this.onItemRenderListener = createItemLifeCycleListener();
            h6c lifeCycleRegister = this.mainFeedsViewService.getLifeCycleRegister();
            if (lifeCycleRegister != null) {
                lifeCycleRegister.y(this.onItemRenderListener);
            }
            this.mainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
            this.pageLifeCycle = createPageLifeCycle();
            this.mainLifecycleService.getPageLifeCycleRegister().a(this.pageLifeCycle);
            this.receiver = new TBFavoriteStatusChangedReceiver(this, null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("TBFavoriteStatusChanged");
            intentFilter.addAction("TBFavoriteStatusCacheInitComplete");
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.receiver, intentFilter);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        h6d h6dVar;
        sgc.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = this.mainFeedsViewService;
        if (iMainFeedsViewService != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            if (!(lifeCycleRegister == null || (bVar = this.onItemRenderListener) == null)) {
                lifeCycleRegister.q(bVar);
                this.onItemRenderListener = null;
            }
            this.mainFeedsViewService = null;
        }
        IMainLifecycleService iMainLifecycleService = this.mainLifecycleService;
        if (iMainLifecycleService != null) {
            l6d pageLifeCycleRegister = iMainLifecycleService.getPageLifeCycleRegister();
            if (!(pageLifeCycleRegister == null || (h6dVar = this.pageLifeCycle) == null)) {
                pageLifeCycleRegister.b(h6dVar);
                this.pageLifeCycle = null;
            }
            this.mainLifecycleService = null;
        }
        if (this.receiver != null) {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.receiver);
        }
    }
}
