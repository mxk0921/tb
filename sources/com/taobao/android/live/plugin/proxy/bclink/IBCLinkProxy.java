package com.taobao.android.live.plugin.proxy.bclink;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IBCLinkProxy extends IBTypeProxy {
    public static final String KEY = "IBCLinkProxy";

    BaseFrame createLiveLinkFrame3(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, ViewStub viewStub);

    BaseFrame createLiveLinkFrame3AndCreateView(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, ViewStub viewStub);

    Object createSEIDispatcher(ux9 ux9Var);

    boolean enableJianBao(ux9 ux9Var, TBLiveDataModel tBLiveDataModel);

    boolean enableLinkLive3();

    boolean enableLiveLink(ux9 ux9Var, TBLiveDataModel tBLiveDataModel);

    Class<? extends BaseFrame> getLiveLinkEntranceFrame();

    Class<? extends BaseFrame> getLiveLinkFrame3Class();

    void liveLinkFrame3ShowStopLinkDialog(Object obj);

    void seiDispatcherDispatch(Object obj, String str);

    void seiDispatcherInitialize(Object obj);

    void seiDispatcherQuit(Object obj);
}
