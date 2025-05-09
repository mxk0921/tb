package com.taobao.share.multiapp;

import java.io.Serializable;
import tb.c4d;
import tb.doc;
import tb.eqb;
import tb.gpd;
import tb.igb;
import tb.j8c;
import tb.upd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IShareBiz extends Serializable {
    igb getAppEnv();

    eqb getContactsInfoProvider();

    j8c getFriendsProvider();

    doc getLogin();

    c4d getOrangeDefaultValueHelper();

    upd getShareBackWeexSdk(String str);

    gpd getShareChannel();

    upd getShareWeexSdk();

    upd getShareWeexSdk(String str);

    void initShareMenu();
}
