package com.alibaba.wireless.aliprivacyext.http.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public @interface Api {
    MethodEnum method() default MethodEnum.POST;

    String name();
}
