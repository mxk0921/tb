package com.alibaba.android.nextrpc.stream.internal.mtop;

import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.stream.IMtopStreamListener;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.ppq;
import tb.wpq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IStreamMtopRequestCallback extends IMtopStreamListener {
    void onReceiveAccsData(String str, String str2, String str3, JSONObject jSONObject);

    void onReceiveData(StreamRemoteMainResponse streamRemoteMainResponse, BaseOutDo baseOutDo, int i, Object obj);

    String request(StreamNextRpcRequest streamNextRpcRequest, ppq ppqVar, wpq wpqVar);
}
