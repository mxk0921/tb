package com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;
import tb.cfc;
import tb.mue;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DynamicLayoutService implements IDynamicLayoutService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DynamicLayoutService";
    private final String KEY_SUPPORT_DYNAMIC_LAYOUT = "supportDynamicLayout";
    private IContainerDataService<?> mDataService;
    private IContainerDataService.e mRequestBizParamsCreator;
    private IContainerDataService.c mRequestListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DynamicLayoutService dynamicLayoutService) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IContainerInnerDataModel<?> base;
            IPageDataModel pageParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (pageParams = base.getPageParams()) != null && pageParams.getPageNum() == 0) {
                mue.d();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(DynamicLayoutService dynamicLayoutService) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("supportDynamicLayout", Boolean.TRUE.toString());
            return hashMap;
        }
    }

    static {
        t2o.a(486539516);
        t2o.a(488636553);
    }

    private void addRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc53448", new Object[]{this});
        } else if (this.mDataService != null) {
            IContainerDataService.e createRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mRequestBizParamsCreator = createRequestBizParamsCreator;
            this.mDataService.addRequestBizParamsCreator(createRequestBizParamsCreator);
        }
    }

    private void addRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dffd909", new Object[]{this});
        } else if (this.mDataService != null) {
            IContainerDataService.c createRequestListener = createRequestListener();
            this.mRequestListener = createRequestListener;
            this.mDataService.addRequestListener(createRequestListener);
        }
    }

    private IContainerDataService.e createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new b(this);
    }

    private IContainerDataService.c createRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a(this);
    }

    private void removeRequestBizParamsCreator() {
        IContainerDataService.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6addde85", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null && (eVar = this.mRequestBizParamsCreator) != null) {
            iContainerDataService.removeRequestBizParamsCreator(eVar);
        }
    }

    private void removeRequestListener() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f11046", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null && (cVar = this.mRequestListener) != null) {
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
        this.mDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        addRequestListener();
        addRequestBizParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        removeRequestListener();
        removeRequestBizParamsCreator();
    }
}
