package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRemoteListener extends MtopListener {
    void onError(int i, MtopResponse mtopResponse, Object obj);

    void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj);
}
