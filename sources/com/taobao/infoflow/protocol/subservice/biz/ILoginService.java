package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ILoginService extends ISubService {
    public static final String SERVICE_NAME = "LoginService";

    boolean isLogin();

    boolean loginStatusTrigger(boolean z);
}
