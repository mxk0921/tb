package com.taobao.tao.topmultitab.service.pageprovider;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bqa;
import tb.cfc;
import tb.d4b;
import tb.t2o;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomePageProviderServiceImpl implements IHomePageProviderService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomePageProviderServiceImpl";
    private boolean mIsDestroyed = false;
    private z6d mPageProvider;

    static {
        t2o.a(729810243);
        t2o.a(729810244);
    }

    @Override // com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService
    public z6d getPageProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6d) ipChange.ipc$dispatch("de13c8c1", new Object[]{this});
        }
        if (this.mIsDestroyed && this.mPageProvider == null) {
            d4b.a(d4b.ERROR_CODE_EMPTY_PAGE_PROVIDER, "page provider is null", null);
            bqa.b(TAG, "page provider is null", new Throwable().fillInStackTrace());
        }
        return this.mPageProvider;
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mPageProvider = null;
        this.mIsDestroyed = true;
    }

    @Override // com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService
    public void setPageProvider(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8588311", new Object[]{this, z6dVar});
        } else {
            this.mPageProvider = z6dVar;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
        } else {
            this.mIsDestroyed = false;
        }
    }
}
