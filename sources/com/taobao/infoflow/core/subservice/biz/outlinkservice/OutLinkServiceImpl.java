package com.taobao.infoflow.core.subservice.biz.outlinkservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.cfc;
import tb.sfl;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OutLinkServiceImpl implements IOutLinkService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isColdStartReq = false;
    private cfc mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private sfl mOutLinkScheduler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else if (OutLinkServiceImpl.access$000(OutLinkServiceImpl.this, iContainerDataModel)) {
                OutLinkServiceImpl.access$102(OutLinkServiceImpl.this, true);
            }
        }
    }

    static {
        t2o.a(486539556);
        t2o.a(488636576);
    }

    public static /* synthetic */ boolean access$000(OutLinkServiceImpl outLinkServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929f6bde", new Object[]{outLinkServiceImpl, iContainerDataModel})).booleanValue();
        }
        return outLinkServiceImpl.isColdStart(iContainerDataModel);
    }

    public static /* synthetic */ boolean access$102(OutLinkServiceImpl outLinkServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("718d9fa", new Object[]{outLinkServiceImpl, new Boolean(z)})).booleanValue();
        }
        outLinkServiceImpl.isColdStartReq = z;
        return z;
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.mOnDataProcessListener = createDataProcessListener;
            iContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private boolean isColdStart(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a1be04", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null) {
            return false;
        }
        return true;
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.mOnDataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IOutLinkService
    public w1e getScrolledToItemTraceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("80d15e7a", new Object[]{this});
        }
        sfl sflVar = this.mOutLinkScheduler;
        if (sflVar == null) {
            return null;
        }
        return sflVar.e();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mOutLinkScheduler = new sfl(this.mInfoFlowContext);
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        sfl sflVar = this.mOutLinkScheduler;
        if (sflVar != null) {
            sflVar.b();
            this.mOutLinkScheduler = null;
        }
        unRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IOutLinkService
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        sfl sflVar = this.mOutLinkScheduler;
        if (sflVar != null) {
            sflVar.g(str, intent);
        }
        IIconBackGuideAnimeService iIconBackGuideAnimeService = (IIconBackGuideAnimeService) this.mInfoFlowContext.a(IIconBackGuideAnimeService.class);
        if (iIconBackGuideAnimeService != null) {
            iIconBackGuideAnimeService.onOutLinkTrigger(str, intent);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IOutLinkService
    public boolean isInQRCodePreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d96a47b6", new Object[]{this})).booleanValue();
        }
        sfl sflVar = this.mOutLinkScheduler;
        if (sflVar == null) {
            return false;
        }
        return sflVar.f();
    }
}
