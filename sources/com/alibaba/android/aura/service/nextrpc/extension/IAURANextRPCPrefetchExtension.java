package com.alibaba.android.aura.service.nextrpc.extension;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.lbb;
import tb.nk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IAURANextRPCPrefetchExtension extends lbb {
    public static final String DATA_HIT_TIME = "data_hit_time";
    public static final String DATA_KEY = "data_key";
    public static final String DATA_PARAM = "data_param";
    public static final String DATA_RESPONSE_TIME = "data_response_time";
    public static final String DATA_SAVE_TIME = "data_save_time";
    public static final String DATA_START_TIME = "data_start_time";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface PrefetchCallbackType {
        public static final String TYPE_EXPIRE = "TYPE_EXPIRE";
        public static final String TYPE_FULL = "TYPE_FULL";
        public static final String TYPE_HIT = "TYPE_HIT";
        public static final String TYPE_MERGE = "TYPE_MERGE";
        public static final String TYPE_MISS = "TYPE_MISS";
        public static final String TYPE_NOT_FOUNT = "TYPE_NOT_FOUNT";
    }

    nk K(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2);

    void c(String str, Map<String, String> map);
}
