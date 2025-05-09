package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IFloatViewDetectService extends ISubService {
    public static final String SERVICE_NAME = "FloatViewDetectService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface FloatViewType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(String str);
    }

    void addFloatViewShowListener(a aVar);

    void removeFloatViewShowListener(a aVar);

    String triggerDetect();
}
