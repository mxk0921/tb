package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IPullRefreshService extends ISubService {
    public static final String SERVICE_NAME = "PullRefreshService";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface RefreshState {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onPullDistance(int i);

        void onRefresh();

        void onRefreshStateChanged(String str, String str2);
    }

    void addPullRefreshListener(a aVar);

    void onPullDistance(int i);

    void onRefresh();

    void onRefreshStateChanged(String str, String str2);

    void removePullRefreshListener(a aVar);
}
