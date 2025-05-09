package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightCommentResponseData implements INetDataObject {
    public List<CommentBean> model;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class CommentBean implements INetDataObject {
        public String commentType;
        public String content;
        public String publisherId;
        public String publisherNick;
        public String timestamp;

        static {
            t2o.a(779092598);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092597);
        t2o.a(806355930);
    }
}
