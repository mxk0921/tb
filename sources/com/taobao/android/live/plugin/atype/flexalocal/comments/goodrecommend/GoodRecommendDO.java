package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodRecommendDO implements INetDataObject {
    public long dataSize;
    public List<ImportantEventItem> items;
    public long pullInterval;
    public long showGroupCount;
    public long showItemDelay;

    static {
        t2o.a(295698705);
        t2o.a(806355930);
    }
}
