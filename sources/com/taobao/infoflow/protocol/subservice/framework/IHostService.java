package com.taobao.infoflow.protocol.subservice.framework;

import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.jgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IHostService extends ISubService {
    public static final String SERVICE_NAME = "HostService";

    jgc getInvokeCallback();
}
