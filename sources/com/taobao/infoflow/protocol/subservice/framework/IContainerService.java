package com.taobao.infoflow.protocol.subservice.framework;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.iqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IContainerService<V extends ViewGroup> extends ISubService, iqb<V> {
    public static final String SERVICE_NAME = "ContainerService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(IUiRefreshActionModel iUiRefreshActionModel);

        void b(IUiRefreshActionModel iUiRefreshActionModel);
    }

    /* synthetic */ void addOnContainerListener(iqb.a aVar);

    void addUiRefreshListener(a aVar);

    /* synthetic */ ViewGroup createContainer(Context context);

    /* synthetic */ void destroyContainer();

    /* synthetic */ void removeOnContainerListener(iqb.a aVar);

    void removeUiRefreshListener(a aVar);

    void uiRefresh(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel);
}
