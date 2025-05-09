package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ect {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_PAGE = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f18480a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uve.c(ect.a(ect.this).getContainerType().a());
            }
        }
    }

    static {
        t2o.a(486539540);
    }

    public ect(cfc cfcVar) {
        this.f18480a = cfcVar;
    }

    public static /* synthetic */ cfc a(ect ectVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("5532c953", new Object[]{ectVar});
        }
        return ectVar.f18480a;
    }

    public void b(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134cd40", new Object[]{this, baseSubItemModel});
        } else if (baseSubItemModel == null) {
            fve.e("TapGlobalSceneUtUtils", "beginScene tapItem is null");
        } else {
            BaseUtModel clickParam = baseSubItemModel.getClickParam();
            if (clickParam == null) {
                fve.e("TapGlobalSceneUtUtils", "beginScene clickParams is null");
                return;
            }
            String page = clickParam.getPage();
            if (!"Page_Home".equals(page)) {
                fve.e("TapGlobalSceneUtUtils", "beginScene scene : " + page);
                return;
            }
            Map<String, String> e = e(this.f18480a, clickParam);
            if (e == null) {
                fve.e("TapGlobalSceneUtUtils", "beginScene properties : " + page);
                return;
            }
            uve.b(page, null, null, e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7ed478", new Object[]{this});
        } else {
            get.a().i(new a());
        }
    }

    public final String d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d17399b", new Object[]{this, cfcVar});
        }
        if (cfcVar == null) {
            fve.e("TapGlobalSceneUtUtils", "getHomeBuckets infoFlowContext is null");
            return null;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("TapGlobalSceneUtUtils", "getHomeBuckets containerDataService is null");
            return null;
        }
        c6d pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            fve.e("TapGlobalSceneUtUtils", "getHomeBuckets pageInfoDataModel is null");
            return null;
        }
        JSONObject currentPageParams = pageInfo.getCurrentPageParams();
        if (currentPageParams != null) {
            return currentPageParams.getString(tm2.HOME_BUCKETS);
        }
        fve.e("TapGlobalSceneUtUtils", "getHomeBuckets pageParams is null");
        return null;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf4b347", new Object[]{this});
            return;
        }
        String d = d(this.f18480a);
        if (d != null) {
            this.b = d;
        }
    }

    public final Map<String, String> e(cfc cfcVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b652cc6", new Object[]{this, cfcVar, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("multiPageUtParams");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            fve.e("TapGlobalSceneUtUtils", "parseMultiPageUtParams multiPageUtParams is null");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            if (next.getValue() != null) {
                str = next.getValue().toString();
            }
            hashMap.put(key, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            str = str2;
        }
        hashMap.put(tm2.HOME_BUCKETS, str);
        return hashMap;
    }
}
