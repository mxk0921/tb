package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IVideoPlayControllerService extends ISubService {
    public static final String SERVICE_NAME = "PlayControllerService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        boolean m();

        void o(b bVar);

        void s(b bVar);
    }

    void addCheckExecutePlayListener(a aVar);

    void forceInsertToQueueHeader(String str, int i);

    boolean isEnable();

    void removeCheckExecutePlayListener(a aVar);

    void triggerVideoStart();

    void triggerVideoStop();
}
