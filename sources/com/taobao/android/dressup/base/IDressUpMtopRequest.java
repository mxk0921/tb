package com.taobao.android.dressup.base;

import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.recommend4.manager.b;
import java.util.Map;
import kotlin.Metadata;
import tb.nhd;
import tb.tqm;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/android/dressup/base/IDressUpMtopRequest;", "", "", "url", "Ltb/xhv;", "requestDetailMtop", "(Ljava/lang/String;)V", "Ltb/nhd;", tqm.CONFIG_RECOMMEND_MANAGER, "", "isPrefetch", "Lcom/alibaba/fastjson/JSONObject;", "hostParams", b.KEY_IS_PULL_REFRESH, "requestFeedRecommendData", "(Ltb/nhd;ZLcom/alibaba/fastjson/JSONObject;Z)V", "", "query", "requestDetailRecommendData", "(Ltb/nhd;Ljava/util/Map;Z)V", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDressUpMtopRequest {
    void requestDetailMtop(String str);

    void requestDetailRecommendData(nhd nhdVar, Map<String, ? extends Object> map, boolean z);

    void requestFeedRecommendData(nhd nhdVar, boolean z, JSONObject jSONObject, boolean z2);
}
