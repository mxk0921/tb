package com.taobao.tao.remotebusiness;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRemoteParserListener extends MtopListener {
    void parseResponse(MtopResponse mtopResponse);
}
