package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity activity);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int i, int i2, Intent intent);

    void onBridgeConfigurationChanged();

    void onKeyUp(int i, KeyEvent keyEvent);
}
