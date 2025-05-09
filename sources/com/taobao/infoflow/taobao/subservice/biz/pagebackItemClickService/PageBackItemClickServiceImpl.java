package com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService;

import android.text.TextUtils;
import android.view.View;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IPageBackItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;
import tb.cfc;
import tb.t2o;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PageBackItemClickServiceImpl implements IPageBackItemClickService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY = "clickRequestParams";
    private String mClickRequestParams = null;
    private IContainerDataService mContainerDataService;
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.f mRequestCommonBizParamsCreator;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.f
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("80a7626", new Object[]{this, w1eVar, str});
            }
            if (!Constant.KEY_PAGEBACK.equals(str) || TextUtils.isEmpty(PageBackItemClickServiceImpl.access$000(PageBackItemClickServiceImpl.this))) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PageBackItemClickServiceImpl.KEY, PageBackItemClickServiceImpl.access$000(PageBackItemClickServiceImpl.this));
            PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, null);
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemClickService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
        public void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            } else if (baseSubItemModel == null || baseSubItemModel.getExt() == null || !baseSubItemModel.getExt().containsKey(PageBackItemClickServiceImpl.KEY)) {
                PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, null);
            } else {
                PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, baseSubItemModel.getExt().getString(PageBackItemClickServiceImpl.KEY));
            }
        }
    }

    static {
        t2o.a(491782523);
        t2o.a(488636577);
    }

    public static /* synthetic */ String access$000(PageBackItemClickServiceImpl pageBackItemClickServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe1193d0", new Object[]{pageBackItemClickServiceImpl});
        }
        return pageBackItemClickServiceImpl.mClickRequestParams;
    }

    public static /* synthetic */ String access$002(PageBackItemClickServiceImpl pageBackItemClickServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b54f4948", new Object[]{pageBackItemClickServiceImpl, str});
        }
        pageBackItemClickServiceImpl.mClickRequestParams = str;
        return str;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.mContainerDataService = iContainerDataService;
        if (iContainerDataService != null) {
            a aVar = new a();
            this.mRequestCommonBizParamsCreator = aVar;
            iContainerDataService.addRequestCommonBizParamsCreator(aVar);
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.mDxItemClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            b bVar = new b();
            this.mOnDxItemClickListener = bVar;
            iDxItemClickService.addDxItemClickListener(bVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerDataService.f fVar;
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (!(iDxItemClickService == null || (aVar = this.mOnDxItemClickListener) == null)) {
            iDxItemClickService.removeDxItemClickListener(aVar);
            this.mOnDxItemClickListener = null;
        }
        IContainerDataService iContainerDataService = this.mContainerDataService;
        if (!(iContainerDataService == null || (fVar = this.mRequestCommonBizParamsCreator) == null)) {
            iContainerDataService.removeRequestCommonBizParamsCreator(fVar);
            this.mRequestCommonBizParamsCreator = null;
        }
        if (this.mClickRequestParams != null) {
            this.mClickRequestParams = null;
        }
    }
}
