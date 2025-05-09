package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface pqb {
    void B1(JSONObject jSONObject);

    void U1(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus);

    void X(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus);

    void h2(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus);
}
