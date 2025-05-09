package com.taobao.taolive.adapterimpl.favorite.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FavoriteRequest implements INetDataObject {
    public String anchorId;
    private String API_NAME = "mtop.taobao.livex.show.favourite.follow";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String sourcePage = "Page_TaobaoLiveWatch";

    static {
        t2o.a(779092289);
        t2o.a(806355930);
    }
}
