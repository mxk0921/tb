package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.page.ITMSPage;
import tb.bbs;
import tb.n8s;
import tb.pgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITMSRUMAdapter extends n8s {
    pgd getRumPageExtension(ITMSPage iTMSPage);

    void registerRumEmbedExtension(bbs bbsVar);
}
