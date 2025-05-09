package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AtmosphereResListResponseData implements INetDataObject {
    public List<AtmosphereResItem> result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AtmosphereResItem implements INetDataObject {
        public String file;
        public String groupId;
        public String matchKey;
        public String resUrl;
        public Rule rule;
        public String stickerType;
        public String title;
        public String type;
        public String version;

        static {
            t2o.a(806355004);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Rule implements INetDataObject {
        public String effective;
        public String endTime;
        public HashMap<Integer, String> fanLevels;
        public String startTime;

        static {
            t2o.a(806355005);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806355003);
        t2o.a(806355930);
    }
}
