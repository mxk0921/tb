package com.taobao.tao.topmultitab.service.tab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import tb.cfc;
import tb.e0p;
import tb.eqs;
import tb.imn;
import tb.rvk;
import tb.t2o;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeTabServiceImpl implements IHomeTabService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IHomeDataService mDataService;
    private eqs mTabChangeObserver;
    private rvk mUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
                return;
            }
            JSONObject m = e0p.m();
            if (m != null) {
                HomeTabServiceImpl.access$000(HomeTabServiceImpl.this).t(m);
            }
        }
    }

    static {
        t2o.a(729810364);
        t2o.a(729810366);
    }

    public static /* synthetic */ eqs access$000(HomeTabServiceImpl homeTabServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqs) ipChange.ipc$dispatch("f9d39a3", new Object[]{homeTabServiceImpl});
        }
        return homeTabServiceImpl.mTabChangeObserver;
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new a();
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
        } else if (this.mDataService != null) {
            rvk createUiRefreshListener = createUiRefreshListener();
            this.mUiRefreshListener = createUiRefreshListener;
            this.mDataService.addOnUiRefreshListener(createUiRefreshListener);
        }
    }

    private void unRegisterUiRefreshListener() {
        rvk rvkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = this.mDataService;
        if (iHomeDataService != null && (rvkVar = this.mUiRefreshListener) != null) {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
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
        } else {
            unRegisterUiRefreshListener();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        eqs eqsVar = new eqs(wccVar);
        this.mTabChangeObserver = eqsVar;
        eqsVar.t(e0p.m());
        registerUiRefreshListener();
    }
}
