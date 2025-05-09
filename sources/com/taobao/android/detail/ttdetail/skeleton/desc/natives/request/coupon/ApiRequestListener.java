package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import java.io.Serializable;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ApiRequestListener<T> extends Serializable {
    void onError(MtopResponse mtopResponse);

    void onSuccess(T t);
}
