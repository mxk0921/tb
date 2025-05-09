package tb;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface mwc {
    void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj);

    void onError(int i, MtopResponse mtopResponse, Object obj);

    void onReceiveAccsData(String str, String str2, String str3, JSONObject jSONObject);

    void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj);

    void onSystemError(int i, MtopResponse mtopResponse, Object obj);
}
