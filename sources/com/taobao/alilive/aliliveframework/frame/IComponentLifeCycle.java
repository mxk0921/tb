package com.taobao.alilive.aliliveframework.frame;

import android.view.View;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IComponentLifeCycle extends Serializable {
    void onCreate();

    /* synthetic */ void onDataReceived(TBLiveDataModel tBLiveDataModel);

    void onDestroy();

    void onDidAppear();

    void onDidDisappear();

    void onPause();

    void onPreloadView(IRecyclerModel iRecyclerModel);

    /* synthetic */ void onRemove();

    void onResume();

    /* synthetic */ void onStart();

    void onStatusChange(int i, Object obj);

    void onStop();

    void onUnloadView();

    void onViewCreated(View view);

    void onWillAppear();

    void onWillDisappear();
}
