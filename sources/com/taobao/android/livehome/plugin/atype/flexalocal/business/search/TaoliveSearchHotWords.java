package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoliveSearchHotWords implements IMTOPDataObject {
    public static final String TYPE_HINT = "hint";
    public static final String TYPE_URL = "url";
    public static final String TYPE_WORD = "word";
    public RightInfo rightInfo;
    public String source;
    public String type;
    public String url;
    public String utParams;
    public String word;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class RightInfo implements IMTOPDataObject {
        public String anchorId;
        public String itemId;
        public String liveId;
        public String reasonLong;
        public String reasonShort;
        public String rightType;

        static {
            t2o.a(310378528);
            t2o.a(589299906);
        }

        public RightInfo() {
        }
    }

    static {
        t2o.a(310378527);
        t2o.a(589299906);
    }
}
