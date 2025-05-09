package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FandomMusic implements INetDataObject {
    public ArrayList<Music> musicList;
    public String playType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Music implements INetDataObject {
        public String coverUrl;
        public String id;
        public String name;
        public String url;

        static {
            t2o.a(806356216);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356215);
        t2o.a(806355930);
    }
}
