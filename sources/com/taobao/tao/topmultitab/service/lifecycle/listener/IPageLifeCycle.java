package com.taobao.tao.topmultitab.service.lifecycle.listener;

import android.content.Intent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IPageLifeCycle {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface EnterHomeType {
    }

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate();

    void onCreateView();

    void onDestroy();

    void onLazyInit();

    void onPause();

    void onResume(String str);

    void onStart();

    void onStop();

    void onWillExit();
}
