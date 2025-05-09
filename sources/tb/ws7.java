package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ws7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30888a;
    public final fe2 b;

    static {
        t2o.a(491782789);
    }

    public ws7(cfc cfcVar) {
        this.f30888a = cfcVar;
        this.b = new fe2(cfcVar);
    }

    public final List<String> b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4864628", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> delta = iContainerDataModel.getDelta();
        ArrayList arrayList = null;
        if (delta == null) {
            return null;
        }
        List<?> sections = delta.getSections();
        if (sections != null && sections.size() > 0) {
            arrayList = new ArrayList(sections.size());
            Iterator<?> it = sections.iterator();
            while (it.hasNext()) {
                String string = ((JSONObject) it.next()).getString("sectionBizCode");
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public final AwesomeGetPageData d(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("cc6208e8", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        if (jSONObject.getBooleanValue("isCurrentPage")) {
            return awesomeGetContainerData.getBase().getPageParams();
        }
        if (!n(jSONObject)) {
            return new AwesomeGetPageData();
        }
        return c(awesomeGetContainerData.getBase().getPageParams());
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b38a507", new Object[]{this});
        }
        JSONObject a2 = ysl.a(this.f30888a.getContainerType().getContainerId());
        if (a2 == null) {
            a2 = new JSONObject();
        }
        JSONObject e = vls.e(this.f30888a.getContainerType().getContainerId());
        if (e != null) {
            a2.put(vls.OPTIMIZATION_CONFIG, (Object) e);
        }
        if (!TextUtils.isEmpty(TBSpeed.getSubEdition())) {
            a2.put("subEdition", (Object) TBSpeed.getSubEdition());
        }
        if (!TextUtils.isEmpty(TBSpeed.getSpeedPassParams())) {
            a2.put("subEditionPassParams", (Object) TBSpeed.getSpeedPassParams());
        }
        return a2;
    }

    public final long f(IContainerDataModel iContainerDataModel, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cffeee44", new Object[]{this, iContainerDataModel, jSONObject, new Boolean(z)})).longValue();
        }
        if ((!m(jSONObject) || z) && iContainerDataModel.getBase() != null) {
            return o(iContainerDataModel.getBase().getCacheTime());
        }
        return 0L;
    }

    public final long g(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d7dfedc", new Object[]{this, jSONObject, new Boolean(z)})).longValue();
        }
        if (!m(jSONObject) || z) {
            return SDKUtils.getTimeOffset();
        }
        return 0L;
    }

    public final long h(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32cd7a9", new Object[]{this, jSONObject, new Boolean(z)})).longValue();
        }
        if (!m(jSONObject) || z) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    public final long i(IContainerDataModel iContainerDataModel, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96d4993f", new Object[]{this, iContainerDataModel, jSONObject, new Boolean(z)})).longValue();
        }
        if ((!m(jSONObject) || z) && iContainerDataModel.getDelta() != null) {
            return o(iContainerDataModel.getDelta().getCacheTime());
        }
        return 0L;
    }

    public final String j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1bcc56a", new Object[]{this, jSONObject});
        }
        return jSONObject.getString("requestType");
    }

    public final boolean k(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de102470", new Object[]{this, iContainerDataModel, jSONObject})).booleanValue();
        }
        boolean n = n(jSONObject);
        if (m(jSONObject) || n) {
            return true;
        }
        return l(iContainerDataModel, jSONObject);
    }

    public final boolean l(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16acd033", new Object[]{this, iContainerDataModel, jSONObject})).booleanValue();
        }
        if (iContainerDataModel.getBase() == null || !iContainerDataModel.getBase().isAbandoned()) {
            z = false;
        } else {
            z = true;
        }
        boolean booleanValue = jSONObject.getBooleanValue("checkDeltaExpire");
        if (iContainerDataModel.getDelta() == null || (iContainerDataModel.getDelta() != null && iContainerDataModel.getDelta().isAbandoned())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return true;
        }
        if (!booleanValue || !z2) {
            return false;
        }
        return true;
    }

    public final boolean m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e00ec9f", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject.getBooleanValue("forceRequest");
    }

    public final boolean n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beef3a66", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject.getBooleanValue("isNextPage");
    }

    public final long o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef8b6b5", new Object[]{this, new Long(j)})).longValue();
        }
        return j + (SDKUtils.getTimeOffset() * 1000);
    }

    public final AwesomeGetPageData c(IPageDataModel iPageDataModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("4b0ea7d8", new Object[]{this, iPageDataModel});
        }
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.setPageNum(iPageDataModel.getPageNum() + 1);
        if (iPageDataModel.isLastPage()) {
            str = "y";
        } else {
            str = "n";
        }
        awesomeGetPageData.setIsLastPage(str);
        awesomeGetPageData.setRequestInAdvance(iPageDataModel.getRequestInAdvance());
        awesomeGetPageData.setItemLastCount(iPageDataModel.getItemLastCount());
        return awesomeGetPageData;
    }

    public AwesomeGetContainerParams a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("407411b4", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        if (k(awesomeGetContainerData, jSONObject) || zn4.a(jSONObject.getString("containerId"))) {
            AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
            awesomeGetContainerParams.setRequestType(j(jSONObject));
            try {
                if (!s5a.i(z4a.c(awesomeGetContainerData.getContainerId()).b) || (!TextUtils.equals(awesomeGetContainerParams.getRequestType(), "aiRefresh") && !TextUtils.equals(awesomeGetContainerParams.getRequestType(), "aiRefreshInsert"))) {
                    if (!TextUtils.equals(awesomeGetContainerParams.getRequestType(), "newInteractive")) {
                        z = false;
                    }
                }
            } catch (Throwable unused) {
            }
            awesomeGetContainerParams.setBaseCacheTime(f(awesomeGetContainerData, jSONObject, z));
            awesomeGetContainerParams.setDeltaCacheTime(i(awesomeGetContainerData, jSONObject, z));
            awesomeGetContainerParams.setClientReqTime(h(jSONObject, z));
            awesomeGetContainerParams.setClientReqOffsetTime(g(jSONObject, z));
            awesomeGetContainerParams.setPageParams(d(awesomeGetContainerData, jSONObject));
            awesomeGetContainerParams.setDeltaSections(b(awesomeGetContainerData));
            awesomeGetContainerParams.setPassParams(e());
            awesomeGetContainerParams.setBizParams(this.b.a(awesomeGetContainerData, jSONObject));
            return awesomeGetContainerParams;
        }
        fve.e("DosaRequestParamsGenerator", "!isAllowRequest");
        return null;
    }
}
