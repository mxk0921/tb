package com.taobao.android.fluid.framework.adapter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMTopAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IMTopAdapter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a<T extends BaseOutDo> {
        T a(byte[] bArr, Class<T> cls);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b<T extends BaseOutDo> {
        void a(MtopResponse mtopResponse, T t);

        void onError(MtopResponse mtopResponse);
    }

    long getServerTimeMillis();

    <T extends CommonResponseOutDo> void send(com.taobao.android.fluid.framework.adapter.mtop.a<T> aVar);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar, a<T> aVar, Class<T> cls);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, b<T> bVar, Class<T> cls);

    <T extends CommonResponseOutDo> void send(IMTOPDataObject iMTOPDataObject, jrf<T> jrfVar);

    <T extends CommonResponseOutDo> void sendWithPrefetch(JSONObject jSONObject, b<T> bVar, a<T> aVar, Class<T> cls);

    <T extends CommonResponseOutDo> void sendWithPrefetch(com.taobao.android.fluid.framework.adapter.mtop.a<T> aVar);

    <T extends CommonResponseOutDo> void sendWithPrefetchFromLauncher(JSONObject jSONObject, b<T> bVar, a<T> aVar, Class<T> cls, boolean z);
}
