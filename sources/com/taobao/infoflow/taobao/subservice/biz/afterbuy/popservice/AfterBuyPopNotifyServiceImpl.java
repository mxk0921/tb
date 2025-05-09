package com.taobao.infoflow.taobao.subservice.biz.afterbuy.popservice;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyPopNotifyService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.bqa;
import tb.cfc;
import tb.m5a;
import tb.t2o;
import tb.w1e;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyPopNotifyServiceImpl implements IAfterBuyPopNotifyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PAGE_ENTER = "pageEnter";
    private static final String TAG = "AfterBuyPopNotifyServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private cfc mInfoFlowContext;
    private boolean mIsCompleteVisible;
    private boolean mIsRequestSuccess;
    private boolean mIsTriggerPopShow;
    private IContainerDataService.c mOnRequestListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (TextUtils.equals(AfterBuyPopNotifyServiceImpl.PAGE_ENTER, str)) {
                AfterBuyPopNotifyServiceImpl.access$002(AfterBuyPopNotifyServiceImpl.this, true);
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
            bqa.d(AfterBuyPopNotifyServiceImpl.TAG, "pageBack还在置顶态，触发下pop展示");
            AfterBuyPopNotifyServiceImpl.access$100(AfterBuyPopNotifyServiceImpl.this);
        }
    }

    static {
        t2o.a(491782261);
        t2o.a(488636627);
    }

    public static /* synthetic */ boolean access$002(AfterBuyPopNotifyServiceImpl afterBuyPopNotifyServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99efd10", new Object[]{afterBuyPopNotifyServiceImpl, new Boolean(z)})).booleanValue();
        }
        afterBuyPopNotifyServiceImpl.mIsRequestSuccess = z;
        return z;
    }

    public static /* synthetic */ void access$100(AfterBuyPopNotifyServiceImpl afterBuyPopNotifyServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01f5e87", new Object[]{afterBuyPopNotifyServiceImpl});
        } else {
            afterBuyPopNotifyServiceImpl.triggerPopShow();
        }
    }

    private IContainerDataService.c createOnRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("7d4f9901", new Object[]{this});
        }
        return new a();
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            IContainerDataService.c createOnRequestListener = createOnRequestListener();
            this.mOnRequestListener = createOnRequestListener;
            this.mContainerDataService.addRequestListener(createOnRequestListener);
        }
    }

    private void triggerPopHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc313562", new Object[]{this});
        }
    }

    private void triggerPopShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51badd9d", new Object[]{this});
        }
    }

    private void unRegisterRequestListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null && (cVar = this.mOnRequestListener) != null) {
            iContainerDataService.removeRequestListener(cVar);
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
        registerRequestListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestListener();
        triggerPopHide();
        unRegisterRequestListener();
    }

    public void onViewAttachedToWindow(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b376db0", new Object[]{this, z4aVar});
        }
    }

    public void onViewDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8e6617", new Object[]{this});
            return;
        }
        bqa.d(TAG, "不在屏幕上了");
        triggerPopHide();
    }

    public void pageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
        } else if (this.mIsCompleteVisible) {
            m5a.a().g(new b(), 0L);
        }
    }

    public void onRecommendCompleteInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f422bf5e", new Object[]{this});
            return;
        }
        bqa.d(TAG, "信息流不完全可见了，需要触发pop隐藏");
        triggerPopHide();
        this.mIsCompleteVisible = false;
    }

    public void onRecommendCompleteVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523e6823", new Object[]{this});
            return;
        }
        bqa.d(TAG, "信息流完全可见了，需要触发pop展示");
        triggerPopShow();
        this.mIsCompleteVisible = true;
    }
}
