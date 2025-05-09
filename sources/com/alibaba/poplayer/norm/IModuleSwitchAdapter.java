package com.alibaba.poplayer.norm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IModuleSwitchAdapter {
    float getBigScreenAspectRatio();

    int getFetchOnPageSwitchTimes();

    boolean ignoreViewType(String str);

    boolean interruptDownAction();

    boolean isCleanKeepDirectlyEnable();

    boolean isConfigFetchLocalEnable();

    boolean isConfigFetchOptEnable();

    boolean isFatigueFilterEnable();

    boolean isInterceptHover();

    boolean isNewNativeEventNotificationEnable();

    boolean isOpenImmersiveByDefault();

    boolean isPreDealTriggerEnable();

    boolean isRecordBucketId();

    boolean isRequestingFilterEnable();

    boolean isUseNewActionLine();

    boolean removeConfigUpdateNotify();

    boolean usePopReadyApi();
}
