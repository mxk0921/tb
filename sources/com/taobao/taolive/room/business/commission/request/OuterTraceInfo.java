package com.taobao.taolive.room.business.commission.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OuterTraceInfo implements INetDataObject {
    public OuterTraceResult result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class OuterParam implements INetDataObject {
        public long expireTime;
        public String key;
        public String value;

        static {
            t2o.a(779092795);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class OuterTraceResult implements INetDataObject {
        public List<OuterParam> localCacheContext;

        static {
            t2o.a(779092796);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092794);
        t2o.a(806355930);
    }
}
