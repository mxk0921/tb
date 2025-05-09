package com.taobao.themis.kernel.adapter;

import tb.bbs;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IAccountAdapter extends n8s {
    String getNick(bbs bbsVar);

    String getUserAvatar(bbs bbsVar);

    String getUserId(bbs bbsVar);

    boolean isLogin();

    boolean isLogin(bbs bbsVar);
}
