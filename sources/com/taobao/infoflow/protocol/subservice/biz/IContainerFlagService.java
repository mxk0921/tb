package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IContainerFlagService extends ISubService {
    public static final String SERVICE_NAME = "IContainerFlagService";

    String findFlagStrategy(String str);

    void recordFlag(String str, String str2, boolean z);
}
