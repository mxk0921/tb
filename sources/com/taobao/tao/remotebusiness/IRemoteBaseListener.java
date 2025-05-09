package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRemoteBaseListener extends IRemoteListener {
    void onSystemError(int i, MtopResponse mtopResponse, Object obj);
}
