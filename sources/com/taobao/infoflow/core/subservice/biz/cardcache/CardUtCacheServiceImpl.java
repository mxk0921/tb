package com.taobao.infoflow.core.subservice.biz.cardcache;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardUtCacheService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import tb.bve;
import tb.cfc;
import tb.t2o;
import tb.w1e;
import tb.z73;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CardUtCacheServiceImpl implements ICardUtCacheService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc mInfoFlowContext;
    private IContainerDataService.c mRequestListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel != null && iContainerDataModel.getBase() != null) {
                CardUtCacheServiceImpl.access$000(CardUtCacheServiceImpl.this, w1eVar, iContainerDataModel, str);
            }
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
    }

    static {
        t2o.a(486539513);
        t2o.a(488636543);
    }

    public static /* synthetic */ void access$000(CardUtCacheServiceImpl cardUtCacheServiceImpl, w1e w1eVar, IContainerDataModel iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2b686", new Object[]{cardUtCacheServiceImpl, w1eVar, iContainerDataModel, str});
        } else {
            cardUtCacheServiceImpl.checkAndAddCacheKey(w1eVar, iContainerDataModel, str);
        }
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
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
            IContainerDataService.c createRequestListener = createRequestListener();
            this.mRequestListener = createRequestListener;
            iContainerDataService.addRequestListener(createRequestListener);
        }
    }

    private void unRegisterDataListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (!(iContainerDataService == null || (cVar = this.mRequestListener) == null)) {
            iContainerDataService.removeRequestListener(cVar);
        }
        z73.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        if (bve.h()) {
            initRegisterDataListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListener();
        }
    }

    private void checkAndAddCacheKey(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IContainerInnerDataModel<?> base;
        List<?> sections;
        boolean z;
        JSONObject args;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc3c1db", new Object[]{this, w1eVar, iContainerDataModel, str});
        } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (sections = base.getSections()) != null && sections.size() != 0) {
            IPageDataModel pageParams = base.getPageParams();
            int pageNum = pageParams != null ? pageParams.getPageNum() : -1;
            if (w1eVar != null) {
                if (w1eVar.a() != null) {
                    z2 = w1eVar.a().getBooleanValue("isStreamRequest");
                    z = w1eVar.a().getBooleanValue("isOpenSecondRefreshOpt");
                } else {
                    z = false;
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            } else {
                z = false;
            }
            for (int i = 0; i < sections.size(); i++) {
                Object obj = sections.get(i);
                if ((obj instanceof BaseSectionModel) && (args = ((BaseSectionModel) obj).getArgs()) != null) {
                    if (args.getString(z73.CACHE_KEY) == null) {
                        args.put(z73.CACHE_KEY, (Object) Long.valueOf(System.nanoTime()));
                    }
                    if (bve.p() && z) {
                        if (pageNum == 0) {
                            args.put(z73.ENABLE_SAVE_PERSISTENCE, (Object) Boolean.TRUE);
                        } else if (args.getBoolean(z73.ENABLE_SAVE_PERSISTENCE) == null) {
                            args.put(z73.ENABLE_SAVE_PERSISTENCE, (Object) Boolean.FALSE);
                        }
                    }
                }
            }
        }
    }
}
