package com.taobao.android;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface AliImageStrategyConfigBuilderInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum AliSizeLimitType {
        WIDTH_LIMIT,
        HEIGHT_LIMIT,
        ALL_LIMIT
    }

    AliImageStrategyConfigBuilderInterface a(AliSizeLimitType aliSizeLimitType);

    Object build();
}
