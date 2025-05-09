package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface vqb {
    void a(JSONObject jSONObject, String str, String str2);

    void b(JSONObject jSONObject);

    void c(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    void d(List<SectionModel> list, wit witVar);

    void e(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    AwesomeGetContainerParams f(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    void g(IBizDataModel<AwesomeGetContainerData> iBizDataModel);

    void h(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData);
}
