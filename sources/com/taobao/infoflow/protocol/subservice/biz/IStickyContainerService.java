package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.iqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IStickyContainerService<V extends ViewGroup> extends ISubService, iqb<V> {
    public static final String SERVICE_NAME = "StickyContainerService";

    /* synthetic */ void addOnContainerListener(iqb.a aVar);

    /* synthetic */ ViewGroup createContainer(Context context);

    /* synthetic */ void destroyContainer();

    /* synthetic */ void removeOnContainerListener(iqb.a aVar);
}
