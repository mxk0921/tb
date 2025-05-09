package com.taobao.taolive.room.business.commission.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OuterTraceLocalInfo implements INetDataObject {
    public List<LocalOuterParam> localCacheContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LocalOuterParam implements INetDataObject {
        public long expireTime;
        public String key;
        public String value;

        static {
            t2o.a(779092798);
            t2o.a(806355930);
        }

        public LocalOuterParam() {
        }

        public LocalOuterParam(long j, String str, String str2) {
            this.expireTime = j;
            this.key = str;
            this.value = str2;
        }
    }

    static {
        t2o.a(779092797);
        t2o.a(806355930);
    }
}
