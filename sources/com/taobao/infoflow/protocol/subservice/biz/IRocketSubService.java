package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IRocketSubService extends ISubService {
    public static final String SERVICE_NAME = "RocketService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(boolean z);
    }

    void addRocketListener(a aVar);

    int getRocketAnchorPosition();

    boolean isOnRocketState();

    void onClickRocket();

    void removeRocketListener(a aVar);
}
