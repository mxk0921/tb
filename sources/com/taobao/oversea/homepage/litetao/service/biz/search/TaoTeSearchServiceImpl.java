package com.taobao.oversea.homepage.litetao.service.biz.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.oversea.discovery.business.data.SearchSuggest;
import com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.b02;
import tb.byv;
import tb.c6d;
import tb.c8e;
import tb.cfc;
import tb.cpj;
import tb.czc;
import tb.fve;
import tb.ix9;
import tb.k01;
import tb.o78;
import tb.tca;
import tb.vaj;
import tb.vcq;
import tb.w1e;
import tb.xcq;
import tb.xrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaoTeSearchServiceImpl implements ITaoTeSearchService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cfc mInfoFlowContext;
    private final String TAG = TaoTeSearchServiceImpl.class.getSimpleName();
    private final IContainerDataService.a dataProcessListener = new a();
    private final k01<SearchSuggest> apiCallBack = new b();

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
            } else {
                fve.e(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onStart");
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            fve.e(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onProcess");
            TaoTeSearchServiceImpl.this.dataProcess(iContainerDataModel);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else {
                fve.e(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onFinish");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements k01<SearchSuggest> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public void onSuccess(SearchSuggest searchSuggest) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3905397a", new Object[]{this, searchSuggest});
                return;
            }
            SearchSuggest.Result result = searchSuggest.result;
            if (result != null && (str = result.searchText) != null) {
                TaoTeSearchServiceImpl.access$100(TaoTeSearchServiceImpl.this, str);
            }
        }

        @Override // tb.k01
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements b02.b<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        /* renamed from: c */
        public void b(Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca65d0a", new Object[]{this, fragment, bundle});
            } else {
                TaoTeSearchServiceImpl.access$200(TaoTeSearchServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends TypeReference<Map<String, String>> {
        public d(TaoTeSearchServiceImpl taoTeSearchServiceImpl) {
        }
    }

    public static /* synthetic */ String access$000(TaoTeSearchServiceImpl taoTeSearchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9c24a0c", new Object[]{taoTeSearchServiceImpl});
        }
        return taoTeSearchServiceImpl.TAG;
    }

    public static /* synthetic */ void access$100(TaoTeSearchServiceImpl taoTeSearchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2caefabd", new Object[]{taoTeSearchServiceImpl, str});
        } else {
            taoTeSearchServiceImpl.updateSearchText(str);
        }
    }

    public static /* synthetic */ void access$200(TaoTeSearchServiceImpl taoTeSearchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa287a52", new Object[]{taoTeSearchServiceImpl});
        } else {
            taoTeSearchServiceImpl.requestTaoteSearchSuggest();
        }
    }

    private boolean countryIsMatched() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9718d42f", new Object[]{this})).booleanValue();
        }
        try {
            str = getLastSubTabSearchBarData().getJSONObject("args").getString("site");
        } catch (Throwable unused) {
            str = "";
        }
        return TextUtils.equals(str, o78.i(Globals.getApplication()).editionCode);
    }

    private JSONObject getLastSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("607bd35b", new Object[]{this});
        }
        czc a2 = xrl.a(this.mInfoFlowContext);
        if (a2 != null) {
            return a2.getSubTabSearchBarData();
        }
        fve.e(this.TAG, "naviBarCallback == null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateSearchText$2(czc czcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e4b34", new Object[]{czcVar});
        } else {
            czcVar.o();
        }
    }

    private void requestInstallFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            vcq.a(Globals.getApplication()).c(xcq.c().j(ix9.h(Globals.getApplication(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment").f(new c()).a()).n());
        }
    }

    private void requestSearchText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85baa56b", new Object[]{this});
            return;
        }
        try {
            String string = getLastSubTabSearchBarData().getJSONObject("subSection").getJSONObject(cpj.SEARCH_BOX).getJSONObject("item").getJSONObject("0").getJSONObject(vaj.KEY_SMART_CONTENT).getString("channelSrp");
            if (!TextUtils.isEmpty(string)) {
                tca.e = string;
            }
            if (byv.a()) {
                requestTaoteSearchSuggest();
            } else {
                requestInstallFeature();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private JSONObject splicingSearchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ecbc59f", new Object[]{this, str});
        }
        try {
            JSONObject lastSubTabSearchBarData = getLastSubTabSearchBarData();
            JSONObject jSONObject = lastSubTabSearchBarData.getJSONObject("subSection").getJSONObject(cpj.SEARCH_BOX).getJSONObject("subSection");
            if (jSONObject == null) {
                return null;
            }
            xrl.d(str, jSONObject.getJSONObject("0").getJSONObject("item").getJSONObject("0"));
            tca.f = str;
            return lastSubTabSearchBarData;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void updateSearchText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3148af", new Object[]{this, str});
            return;
        }
        tca.f = str;
        final czc a2 = xrl.a(this.mInfoFlowContext);
        if (a2 == null) {
            fve.e(this.TAG, "naviBarCallback == null");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.o8t
                @Override // java.lang.Runnable
                public final void run() {
                    TaoTeSearchServiceImpl.lambda$updateSearchText$2(czc.this);
                }
            });
        }
    }

    public void dataProcess(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b9344f", new Object[]{this, iContainerDataModel});
            return;
        }
        updateUtParam();
        if (iContainerDataModel.getBase().getPageParams().getPageNum() == 0) {
            requestSearchText();
        }
    }

    @Override // com.taobao.oversea.homepage.litetao.service.biz.search.ITaoTeSearchService
    public JSONObject getSearchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3242d0f", new Object[]{this});
        }
        if (countryIsMatched()) {
            return splicingSearchUrl(tca.f);
        }
        requestSearchText();
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e(this.TAG, "containerDataService is null");
        } else {
            iContainerDataService.addDataProcessListener(this.dataProcessListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.dataProcessListener);
        }
    }

    public void updateUtParam() {
        JSONObject currentPageParams;
        IHostService iHostService;
        c8e a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b4ea2c", new Object[]{this});
            return;
        }
        try {
            c6d pageInfo = ((IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class)).getPageInfo();
            if (pageInfo != null && (currentPageParams = pageInfo.getCurrentPageParams()) != null && (iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class)) != null && (a2 = iHostService.getInvokeCallback().a()) != null) {
                a2.b((Map) JSON.parseObject(currentPageParams.toJSONString(), new d(this), new Feature[0]));
            }
        } catch (Throwable unused) {
        }
    }

    private void requestTaoteSearchSuggest() {
        try {
            Class<?> cls = Class.forName("com.taobao.oversea.homepage.litetao.service.biz.search.TaoteRequest");
            cls.getDeclaredMethod("requestTaoteSearchSuggest", Context.class, Class.class, k01.class).invoke(cls, Globals.getApplication(), SearchSuggest.class, this.apiCallBack);
        } catch (Exception e) {
            Log.e("qiaoyang", "requestTaoteSearchSuggest 失败");
            e.printStackTrace();
        }
    }
}
