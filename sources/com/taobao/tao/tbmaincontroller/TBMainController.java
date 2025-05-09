package com.taobao.tao.tbmaincontroller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.uikit.immersive.ITBImmersive;
import tb.ror;
import tb.srk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface TBMainController extends TabHost.OnTabChangeListener, ror, ITBImmersive {
    /* synthetic */ boolean checkLogin();

    /* synthetic */ void doLogin();

    /* synthetic */ View findViewById(int i);

    /* synthetic */ Context getContext();

    Fragment getCurrentFragment();

    TBFragmentTabHost getFragmentTabHost();

    /* synthetic */ String getName();

    /* synthetic */ String getSimpleName();

    /* synthetic */ boolean isLowMemory();

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onNewIntent(Intent intent);

    void onPause();

    void onResume();

    void registerOnKeyDownListener(srk srkVar);

    /* synthetic */ void restoreTabHost();
}
