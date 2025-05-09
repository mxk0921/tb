package com.taobao.android.purchase.aura.ability;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Map;
import tb.h9;
import tb.hij;
import tb.nbf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AbilityParams {
    @JSONField(name = "bizId")
    public String bizId;
    @JSONField(name = "content")
    public Map<String, Object> content;
    @JSONField(name = h9.KEY_EXT_CONFIG)
    public a extConfig;
    @JSONField(name = h9.KEY_POP_CONFIG)
    public b popConfig;
    @JSONField(name = "popId")
    public String popId;
    @JSONField(name = "queryParams")
    public Map<String, String> queryParams;
    @JSONField(name = "url")
    public String url;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        @JSONField(name = "droidFragmentTag")
        public String droidFragmentTag;
        @JSONField(name = "fragmentClass")
        public String fragmentClass;

        static {
            t2o.a(708837450);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        @JSONField(name = "animation")
        public String animation;
        @JSONField(name = "attachMode")
        public String attachMode;
        @JSONField(name = "backgroundMode")
        public String backgroundMode;
        @JSONField(name = "backgroundStyle")
        public String backgroundStyle;
        @JSONField(name = "contentBackColor")
        public String contentBackColor;
        @JSONField(name = hij.KEY_CORNER_RADIUS)
        public float cornerRadius;
        @JSONField(name = "droidFullScreen")
        public String droidFullScreen;
        @JSONField(name = nbf.STDPOP_CONFIG_BACK)
        public String droidShouldHandleBack;
        @JSONField(name = "maxHeight")
        public float maxHeight;
        @JSONField(name = "panEnable")
        public String panEnable;
        @JSONField(name = "shouldBlockClose")
        public String shouldBlockClose;

        static {
            t2o.a(708837451);
        }
    }

    static {
        t2o.a(708837449);
    }
}
