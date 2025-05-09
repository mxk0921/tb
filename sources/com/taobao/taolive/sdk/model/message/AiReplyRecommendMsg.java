package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AiReplyRecommendMsg implements INetDataObject {
    public List<ItemList> itemList;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ItemList implements INetDataObject {
        public String href;
        public String id;
        public String image;
        public LiveItem info;
        public int number;

        static {
            t2o.a(806356305);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356304);
        t2o.a(806355930);
    }
}
