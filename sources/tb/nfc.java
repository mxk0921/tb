package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface nfc {
    void a(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback);

    boolean b(xn4 xn4Var, vqb vqbVar);

    AwesomeGetContainerData c(xn4 xn4Var);

    BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject);

    boolean d(xn4 xn4Var, eee eeeVar);

    void e(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback);

    boolean f(String str, String[] strArr, JSONObject jSONObject);

    b6d getPageInfo();
}
