package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface uqb {
    void a(JSONObject jSONObject, String str, String str2);

    void b(JSONObject jSONObject);

    AwesomeGetContainerParams c(imn imnVar, JSONObject jSONObject);

    void d(imn imnVar, JSONObject jSONObject);

    boolean downloadTemplate(List<SectionModel> list, IDxItemRenderService.b bVar);

    void e(JSONObject jSONObject);

    void f(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData);

    void g(imn imnVar, JSONObject jSONObject);

    void h(imn imnVar, JSONObject jSONObject);
}
