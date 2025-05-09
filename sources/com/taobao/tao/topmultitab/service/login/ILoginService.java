package com.taobao.tao.topmultitab.service.login;

import android.content.Intent;
import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ILoginService extends IHomePageService {
    public static final String SERVICE_NAME = "LoginService";

    int getWhereMainCome();

    void handleInitLogin();

    void handleOnCreateBundle(Intent intent);

    void handleOnNewIntentBundle(Intent intent);

    void refreshForLoginSuccess();

    void setWhereMainCome(int i);

    void switchToWangWang();
}
