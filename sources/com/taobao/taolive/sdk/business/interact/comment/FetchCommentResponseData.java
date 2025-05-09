package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.interact.Comment;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FetchCommentResponseData implements INetDataObject {
    public ArrayList<Comment> comments;
    public long delay;
    public String paginationContext;

    static {
        t2o.a(806356008);
        t2o.a(806355930);
    }
}
