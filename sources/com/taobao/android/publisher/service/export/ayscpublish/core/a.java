package com.taobao.android.publisher.service.export.ayscpublish.core;

import com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface a<T extends Serializable> extends Runnable {
    /* synthetic */ void C();

    String E0();

    /* synthetic */ void L();

    @Deprecated
    T L0();

    PublishStage c0();

    boolean cancel();

    T getData();

    PublishError getError();

    long getTimestamp();

    APublishTask.b i0();

    boolean isFinished();
}
