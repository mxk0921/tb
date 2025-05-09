package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightCommentRequest implements INetDataObject {
    public String API_NAME = "mtop.tblive.timemoving.query.comment";
    public String VERSION = "1.0";
    public String anchorId;
    public String itemId;
    public String liveId;
    public String timeMovingId;
    public String topic;

    static {
        t2o.a(779092595);
        t2o.a(806355930);
    }
}
