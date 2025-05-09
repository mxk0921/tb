package com.taobao.alilive.aliliveframework.frame;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IComponent extends IComponentLifeCycle2 {
    void addComponent(IComponent iComponent);

    void clearComponent();

    void createView(ViewGroup viewGroup);

    boolean createView(ViewStub viewStub);

    void deleteComponent(IComponent iComponent);

    IComponent getComponentByName(String str);

    String getComponentName();

    View getComponentView();

    TBLiveDataModel getLiveDataModel();

    View getViewByName(String str);

    int getViewStatus();

    void hide();

    void onBindData(TBLiveDataModel tBLiveDataModel);

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onDataReceived(TBLiveDataModel tBLiveDataModel);

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onRemove();

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    /* synthetic */ void onStart();

    void onVideoStatusChanged(int i);

    void show();
}
