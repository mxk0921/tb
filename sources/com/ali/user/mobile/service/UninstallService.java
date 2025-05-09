package com.ali.user.mobile.service;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface UninstallService {
    void clearSessionData();

    boolean isSupport();

    void saveSessionData(List<SessionModel> list);

    void triggerRelogin(CommonDataCallback commonDataCallback);
}
