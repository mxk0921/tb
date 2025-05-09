package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.page.ITMSPage;
import tb.bac;
import tb.btc;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IGlobalMenuAdapter extends n8s {
    /* renamed from: createMenuItem-vVa9PYU  reason: not valid java name */
    bac.c mo333createMenuItemvVa9PYU(ITMSPage iTMSPage, String str);

    bac getGlobalMenu(ITMSPage iTMSPage);

    btc getMoreAction(ITMSPage iTMSPage);
}
