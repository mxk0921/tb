package com.taobao.tao.infoflow.commonsubservice.itemclick;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.DxItemClickNavService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import tb.cfc;
import tb.s2b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DxItemClickNavServiceImpl implements DxItemClickNavService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IDxItemClickService mDxClickService;
    private final IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IDxItemClickService.OnDxClickNavListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DxItemClickNavServiceImpl dxItemClickNavServiceImpl) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            } else {
                s2b.c().j(str);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            } else {
                s2b.c().k(z);
            }
        }
    }

    static {
        t2o.a(729809402);
        t2o.a(488636532);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.mDxClickService = iDxItemClickService;
        if (iDxItemClickService != null) {
            iDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxClickService;
        if (iDxItemClickService != null) {
            iDxItemClickService.removeDxClickNavListener(this.mOnDxClickNavListener);
        }
    }
}
