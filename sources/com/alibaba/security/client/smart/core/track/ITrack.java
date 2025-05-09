package com.alibaba.security.client.smart.core.track;

import com.alibaba.security.client.smart.core.track.model.TrackLog;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ITrack {
    Executor getExecutor();

    void init();

    void trace(TrackLog trackLog);
}
