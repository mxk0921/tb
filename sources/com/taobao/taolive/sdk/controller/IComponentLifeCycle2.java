package com.taobao.taolive.sdk.controller;

import com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IComponentLifeCycle2 extends IComponentLifeCycle {
    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onDataReceived(TBLiveDataModel tBLiveDataModel);

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onRemove();

    void onScrollStateChanged(int i);

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onStart();

    void onViewHolderDestroy();

    void onViewHolderDidAppear();

    void onViewHolderDidDisappear();

    void onViewHolderWillAppear();

    void onViewHolderWillDisappear();

    void onViewHolderWillLoad(IRecyclerModel iRecyclerModel);
}
