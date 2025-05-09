package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPullSecondFloorService extends ISubService {
    public static final String SERVICE_NAME = "PullSecondFloorService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onEnterPullSecondFloor();

        void onExitPullSecondFloor();
    }

    void addLifeCycleListener(a aVar);

    boolean isOnPullSecondFloor();

    void onEnterPullSecondFloor();

    void onExitPullSecondFloor();

    void removeLifeCycleListener(a aVar);
}
