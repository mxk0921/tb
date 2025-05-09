package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ICacheReqBizParamsService extends ISubService {
    public static final String SERVICE_NAME = "CacheReqBizParamsService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface SaveMode {
        public static final String DISK_AUTO_ERASED = "diskAutoErased";
        public static final String DISK_NOT_ERASED = "diskNotErased";
    }

    String readReqBizParam(String str, String str2, String str3);

    void saveReqBizParam(String str, String str2, String str3);
}
