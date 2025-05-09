package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.m7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IStreamCallBackAdapter extends IRemoteBaseListener {
    String getItemId();

    void handleExceptionDowngrade(int i, Object obj);

    void handleReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj);

    boolean handleRequestDowngrade(JSONObject jSONObject, String str);

    void setMtopInfo(MtopInfo mtopInfo);
}
