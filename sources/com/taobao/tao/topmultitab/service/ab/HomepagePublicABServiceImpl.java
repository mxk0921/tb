package com.taobao.tao.topmultitab.service.ab;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bqa;
import tb.cfc;
import tb.e1k;
import tb.f4b;
import tb.gdc;
import tb.imn;
import tb.n78;
import tb.rvk;
import tb.scc;
import tb.t2o;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomepagePublicABServiceImpl implements IHomepagePublicABService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_UPDATE_REQUEST_TYPE = "coldStart,pullRefresh,pageBack,userLogin,editionSwitch,loadCache,hotStart";
    private static final String TAG = "HomepagePublicABService";
    private final List<gdc> intercepts;
    private IHomeDataService mDataService;
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
            } else if (imnVar == null) {
                bqa.d("HomepagePublicABService", "updateABInfo -> dataSource == null");
            } else {
                JSONObject A = imnVar.A();
                if (A != null) {
                    HomepagePublicABServiceImpl.access$000(HomepagePublicABServiceImpl.this, A, jSONObject);
                }
            }
        }
    }

    static {
        t2o.a(729810138);
        t2o.a(729810141);
    }

    public HomepagePublicABServiceImpl() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.intercepts = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new e1k());
    }

    public static /* synthetic */ void access$000(HomepagePublicABServiceImpl homepagePublicABServiceImpl, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8b86c3", new Object[]{homepagePublicABServiceImpl, jSONObject, jSONObject2});
        } else {
            homepagePublicABServiceImpl.updateABTestInfo(jSONObject, jSONObject2);
        }
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
        } else if (this.mDataService == null) {
            bqa.d("HomepagePublicABService", "registerDataProcessListener -> mDataService == null");
        } else {
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

    private void updateABTestInfo(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43565e71", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        boolean checkRequestType = checkRequestType(jSONObject2);
        bqa.d("HomepagePublicABService", "updateABInfo -> requestTypeAvailable: " + checkRequestType);
        if (checkRequestType) {
            for (gdc gdcVar : this.intercepts) {
                gdcVar.a(jSONObject);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("publicClientABTest");
            bqa.d("HomepagePublicABService", "updateABInfo -> publicClientABTest: " + jSONObject3);
            TLog.loge("edition_switch", "HomepagePublicABService", "updateABTestInfo");
            ((scc) n78.a(scc.class)).c(jSONObject3);
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

    private boolean checkRequestType(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("936303ac", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            bqa.d("HomepagePublicABService", "enableUpdateABInfo -> actionParams null");
            return false;
        }
        String string = jSONObject.getString("requestType");
        bqa.d("HomepagePublicABService", "enableUpdateABInfo -> requestType:" + string);
        String h = f4b.h("updateABInfoRequestType", DEFAULT_UPDATE_REQUEST_TYPE);
        bqa.d("HomepagePublicABService", "enableUpdateABInfo -> updateRequestTypes:" + h);
        if (TextUtils.isEmpty(h)) {
            bqa.d("HomepagePublicABService", "enableUpdateABInfo -> updateRequestTypes null");
            return false;
        } else if (TextUtils.isEmpty(string)) {
            bqa.d("HomepagePublicABService", "enableUpdateABInfo -> requestType null");
            return false;
        } else {
            boolean contains = h.contains(string);
            bqa.d("HomepagePublicABService", "enableUpdateABInfo -> requestType match:" + contains);
            return contains;
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
        registerUiRefreshListener();
    }
}
