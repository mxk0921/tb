package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CommentCountMessage implements INetDataObject {
    public String backgroundImg;
    public String backgroundTitle;
    public CommentCount data;
    public long pushTime;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommentCount implements INetDataObject {
        public String atmosphere;
        public String commentHash;
        public String content;
        public String count;
        public String countShow;

        static {
            t2o.a(806356313);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356312);
        t2o.a(806355930);
    }
}
