package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bkf extends r00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16444a;

    static {
        t2o.a(729809846);
    }

    public bkf(String str) {
        this.f16444a = str;
    }

    public static /* synthetic */ Object ipc$super(bkf bkfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/subcontainer/intl/IntlSubContainerProcessProvider");
    }

    @Override // tb.uqb
    public void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            i.notifyRequestFailure(jSONObject, str, str2);
        }
    }

    @Override // tb.uqb
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            i.notifyRequestStart(jSONObject);
        }
    }

    @Override // tb.uqb
    public AwesomeGetContainerParams c(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("d30472a6", new Object[]{this, imnVar, jSONObject});
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            return i.getRequestParams(imnVar, jSONObject);
        }
        return null;
    }

    @Override // tb.uqb
    public void d(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11889302", new Object[]{this, imnVar, jSONObject});
            return;
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            i.processUiRefresh(imnVar, jSONObject);
        }
    }

    @Override // tb.uqb
    public boolean downloadTemplate(List<SectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19d8702a", new Object[]{this, list, bVar})).booleanValue();
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i == null) {
            return false;
        }
        i.downloadTemplate(list, bVar);
        return true;
    }

    @Override // tb.uqb
    public void f(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2228dc8", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            i.notifyRequestSuccess(jSONObject, awesomeGetContainerData);
        }
    }

    @Override // tb.uqb
    public void g(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f853cf", new Object[]{this, imnVar, jSONObject});
            return;
        }
        HomeInfoFlowDataService i = i(this.f16444a);
        if (i != null) {
            i.customDataProcess(imnVar, jSONObject);
        }
    }

    public final HomeInfoFlowDataService i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeInfoFlowDataService) ipChange.ipc$dispatch("824c9268", new Object[]{this, str});
        }
        return rue.a(str);
    }
}
