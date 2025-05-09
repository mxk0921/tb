package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.page.ITMSPage;
import tb.kdb;
import tb.n8s;
import tb.ocs;
import tb.qcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWeexAdapter extends n8s {
    String getHttpAcceptHeader();

    ITMSPage getTMSPageFromIAbilityContext(kdb kdbVar);

    String getUserAgent(String str);

    qcs getWeexRender(ITMSPage iTMSPage, ocs ocsVar);
}
