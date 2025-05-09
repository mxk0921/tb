package com.alibaba.android.icart.core.data.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface CartRequestType {
    public static final String query = "query";
    public static final String queryNextPage = "queryNextPage";
    public static final String update = "update";
    public static final String updateStruct = "updateStruct";
}
